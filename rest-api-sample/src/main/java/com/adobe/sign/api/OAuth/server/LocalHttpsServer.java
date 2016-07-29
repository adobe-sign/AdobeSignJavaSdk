/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.api.OAuth.server;

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.TrustManagerFactory;

import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.HttpsServer;

public class LocalHttpsServer {
  private HttpsServer server;
  private static String protocol = "TLS";
  private static String KEY_MANAGER_FACTORY = "SunX509";
  private static String KEY_STORE = "JKS";
  private static String SERVER_STARTED ="server started at ";
  private static String SERVER_STOPPED ="server stopped";
  private static String ROOT_ENDPOINT = "/";
  private static String OAUTH_ENDPOINT = "/oAuth";
  private static String REDIRECT_ENDPOINT = "/redirectUri";

  public void Start(int port) {
    try {
      // load certificate
      String keystoreFilename =  Constants.KEY_STORE_FILE;
      char[] storepass = Constants.KEY_STORE_PASSWORD.toCharArray();
      char[] keypass = Constants.KEY_STORE_PASSWORD.toCharArray();
      FileInputStream fIn = new FileInputStream(Constants.SERVER_PATH + keystoreFilename);
      KeyStore keystore = KeyStore.getInstance(KEY_STORE);
      keystore.load(fIn, storepass);

      // setup the key manager factory
      KeyManagerFactory kmf = KeyManagerFactory.getInstance(KEY_MANAGER_FACTORY);
      kmf.init(keystore, keypass);

      // setup the trust manager factory
      TrustManagerFactory tmf = TrustManagerFactory.getInstance(KEY_MANAGER_FACTORY);
      tmf.init(keystore);

      // create https server
      server = HttpsServer.create(new InetSocketAddress(port), 0);
      // create ssl context
      SSLContext sslContext = SSLContext.getInstance(protocol);
      // setup the HTTPS context and parameters
      sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
      server.setHttpsConfigurator(new HttpsConfigurator(sslContext) {
        public void configure(HttpsParameters params) {
          try {

            // initialise the SSL context
            SSLContext c = SSLContext.getDefault();
            SSLEngine engine = c.createSSLEngine();
            params.setNeedClientAuth(false);
            params.setCipherSuites(engine.getEnabledCipherSuites());
            params.setProtocols(engine.getEnabledProtocols());

            // get the default parameters
            SSLParameters defaultSSLParameters = c.getDefaultSSLParameters();
            params.setSSLParameters(defaultSSLParameters);



          } catch (Exception ex) {
            System.err.println(Errors.START_HTTPS_SERVER);
          }
        }
      });
      System.out.println(SERVER_STARTED + port);
      server.createContext(ROOT_ENDPOINT, new OAuthHandler.RootHandler());
      server.createContext(OAUTH_ENDPOINT, new OAuthHandler.AuthorizationHandler());
      server.createContext(REDIRECT_ENDPOINT, new OAuthHandler.RedirectUriHandler());
      server.setExecutor(null);
      server.start();
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  public void Stop() {
    server.stop(0);
    System.out.println(SERVER_STOPPED);
  }

}

