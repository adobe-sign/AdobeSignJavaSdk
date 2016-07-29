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

import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;

/**
 * This sample client starts a local server and helps the user generate oauth code.
 * The OAuth Code is used to generate access token and create a group.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'config.properties' file for the
 * server port.
 * </p>
 */
public class CreateGroupWithOAuthWorkFlowUsingServer {
  //Port to be used for the server
  public static int port = Constants.SERVER_PORT;

  public static void main(String[] args) throws ApiException{
    ApiUtils.configureLogProperty(CreateGroupWithOAuthWorkFlowUsingServer.class.getName());
    LocalHttpsServer localHttpsServer = new LocalHttpsServer();

    //Start the server
    localHttpsServer.Start(port);

  }
}
