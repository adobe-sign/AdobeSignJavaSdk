# Overview
These samples use the OAuth workflow to generate access token and use it to create group.

**Note:**Please make sure if you are using IDE, you have made configuration changes as given in AdobeSignJavaSdk/README.

Running the sample CreateGroupWithOAuthWorkFlowUsingServer 
=====================================================

Steps to get the OAuth code, fetch the access token and create the group.
    
1.  Please generate a keystore file and store it at the location.
    `AdobeSignJavaSdk/rest-api-sample/src/main/java/com/adobe/sign/api/OAuth/server/{keystore-file}`
    
    Following command can be used to generate the keystore file in the working directory.
    ```
    keytool -genkey -keyalg RSA -alias selfsigned -keystore mycert.keystore -storepass mypassword -validity 360 -keysize 2048
    ```
    
    **Note:** Following options are used in the above command
    keyalg - Keyalg specifies the algorithm to be used to generate the key pair. Here it is `RSA`.
    alias - To identify keystore entries (key and trusted certificate entries). Here it is `selfsigned`
    keystore - The keystore filename. Here it is `mycert.keystore`.
    storepass - The password which is used to protect the integrity of the keystore. Here it is `mypassword`.
    validity - No of days certificate will be valid. Here it is `360` days.
    keysize -  Keysize specifies the size of each key to be generated. Here it is `2048` bits.

2.  Provide the serverPort, name of keystore file and keystore password in config.properties.

3.  Run the sample

     i) **Through command line** - gradle CreateGroupWithOAuthWorkFlowUsingServer

     ii) **From the IDE** - To setup the IDE, follow the steps given at the end of file.
     After that right click on the file CreateGroupWithOAuthWorkFlowUsingServer.java, and select `Run` to run it.
        
3.  Open the following link in your browser and replace the serverPort. 
    ```
    https://localhost:{serverPort}
    ```

4.  Provide the credentials to get the OAuth code and the access token. 

5.  You can get the client id from the Adobe Sign WebApp.

6.  Provide the scopes as per your requirements.

7.  Please make sure you have also added the Redirect URI in the application configuration on the Adobe Sign WebApp as follows.
    ```
    https://localhost:{serverPort}/redirectUri
    ```
        
8.  When you submit your OAuth code credentials, it takes you to the Adobe Sign login page if you are not
    already logged in and ask you to grant access to the application.
    
9.  If the request is successful, control returns to the home page where you can see the group Id of the newly created group. 
  
10. The server stops after creating the group.
  
**Note:** If you try to run multiple instances of the server on the same port, it will give bind failure as port is already occupied.



Running the sample CreateGroupWithOAuthWorkFlowUsingDesktopApp 
===========================================================

1.  Provide the values in config.properties.

2.  Run the sample

     i) **Through command line** - gradle CreateGroupWithOAuthWorkFlowUsingDesktopApp

     ii) **From the IDE** -  To setup the IDE, follow the steps given at the end of file.
     After that right click on the file CreateGroupWithOAuthWorkFlowUsingDesktopApp.java, and select `Run` to run it.

3.  Enter your credentials in the popup window.

4.  Group will be created. Check samples output log for result.

Setup the IDE
=============

To run the sample, create a new gradle configuration.  
###### For IntellijIdea  
Edit the following parameters :  
`Gradle Project` : Specify path to `build.gradle` file.  

###### For Eclipse  
Edit the following parameters :  
`Project` : adobe-sign-java-sdk  

Note : You can also right click on the sample, and select `Run` to run it.