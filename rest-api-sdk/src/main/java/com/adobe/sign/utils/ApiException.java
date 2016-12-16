package com.adobe.sign.utils;

import java.util.List;
import java.util.Map;

import com.adobe.sign.utils.validator.SdkErrorCodes;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-28T14:56:11.140+05:30")
public class ApiException extends Exception {
  private int httpCode = 0;
  private static final String SEPARATOR = " : ";
  private Map<String, List<String>> responseHeaders = null;
  private String responseBody = null;
  private String apiCode = null;

  public ApiException() {}

  public ApiException(Throwable throwable) {
    super(throwable);
  }

  public ApiException(String message) {
    super(message);
  }

  public ApiException(String message,
                      Throwable throwable,
                      int httpCode,
                      Map<String, List<String>> responseHeaders,
                      String responseBody) {
    super(message,
          throwable);
    this.httpCode = httpCode;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public ApiException(String message,
                      int httpCode,
                      Map<String, List<String>> responseHeaders,
                      String responseBody) {
    this(message,
         (Throwable) null,
         httpCode,
         responseHeaders,
         responseBody);
  }

  public ApiException(String message,
                      Throwable throwable,
                      int httpCode,
                      Map<String, List<String>> responseHeaders) {
    this(message,
         throwable,
         httpCode,
         responseHeaders,
         null);
  }

  public ApiException(int httpCode,
                      Map<String, List<String>> responseHeaders,
                      String responseBody) {
    this((String) null,
         (Throwable) null,
         httpCode,
         responseHeaders,
         responseBody);
  }

  public ApiException(int httpCode,
                      String message) {
    super(message);
    this.httpCode = httpCode;
  }

  public ApiException(int httpCode,
                      String apiCode,
                      String message) {
    super(message);
    this.httpCode = httpCode;
    this.apiCode = apiCode;
  }

  public ApiException(int httpCode,
                      String message,
                      Map<String, List<String>> responseHeaders,
                      String responseBody) {
    this(httpCode,
         message);
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public ApiException(int httpCode,
                      String message,
                      String apiCode,
                      Map<String, List<String>> responseHeaders,
                      String responseBody) {
    this(httpCode,
         apiCode, message);
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public ApiException(SdkErrorCodes sdkErrorCode) {
    this(sdkErrorCode.getHttpCode(),
         sdkErrorCode.getApiCode(),
         sdkErrorCode.getMessage());
  }

  public ApiException(SdkErrorCodes sdkErrorCode,String missingParam) {
    this(sdkErrorCode.getHttpCode(),
         sdkErrorCode.getApiCode(),
         sdkErrorCode.getMessage() + SEPARATOR + missingParam);
  }

  public int getHttpCode() {
    return httpCode;
  }

  public String getApiCode() {
    return apiCode;
  }
  /**
   * Get the HTTP response headers.
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   */
  public String getResponseBody() {
    return responseBody;
  }
}
