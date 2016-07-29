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
package com.adobe.sign.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

import com.adobe.sign.model.oAuth.Scope;

public class OAuthUtils {

  private static String REDIRECT_URI = "redirect_uri";
  private static String RESPONSE_TYPE = "response_type";
  private static String CLIENT_ID = "client_id";
  private static String SCOPE = "scope";
  private static String STATE = "state";
  private static String ENCODING = "UTF-8";
  private static String SPACE_DELIMITER = "+";

  private static final char QUERY_STRING_SEPARATOR = '?';
  private static final char PARAM_SEPARATOR = '&';
  private static final char EQUALS = '=';

  /**
   * Return value of the key corresponding to given key.
   *
   * @param pairs List of strings containing key-value pair as used in url query param.
   * @param name Name of the key.
   * @return String
   * @throws UnsupportedEncodingException
   */
  public static String getValueByKey(String[] pairs, String name) throws UnsupportedEncodingException {
    for (String pair : pairs) {
      int idx = pair.indexOf(EQUALS);
      if(URLDecoder.decode(String.valueOf(pair.substring(0, idx)), ENCODING).equals(name)){
        return URLDecoder.decode(pair.substring(idx + 1), ENCODING);
      }
    }
    return null;
  }

  /**
   * Returns string containing scopes, delimited by spaces (+).
   *
   * @param scopes List of scopes.
   * @return
   */
  public static String spaceDelimitedSet(ArrayList<Scope> scopes) {
    if(scopes.isEmpty())
      return null;

    String scopeSet = "";
    Iterator<Scope> it = scopes.iterator();

    for(;;){
      Scope s = it.next();

      if(! it.hasNext()){
        scopeSet += s.toString();
        return scopeSet;
      }
      else
        scopeSet += s.toString() + SPACE_DELIMITER;
    }
  }

  /**
   * Helper to construct authorization url.
   *
   * @return
   * @throws ApiException
   */
  public static String appendTo(String url, String clientId, String redirectUrl, String scopes, String state, String responseType) throws ApiException {

    if (!url.isEmpty()) {
      return url + QUERY_STRING_SEPARATOR +
        REDIRECT_URI + EQUALS + redirectUrl + PARAM_SEPARATOR +
        RESPONSE_TYPE + EQUALS + responseType + PARAM_SEPARATOR +
        CLIENT_ID + EQUALS + clientId + PARAM_SEPARATOR +
        SCOPE + EQUALS + scopes +
        (state != null ? (PARAM_SEPARATOR + STATE + EQUALS + state) : "");
    }

    return null;
  }
}


