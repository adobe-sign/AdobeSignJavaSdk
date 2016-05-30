package com.adobe.sign.utils;

// Exception class thrown by REST APIs
public class RestException {

  private String message;
  private  String code;

  // Jackson needs default constructor.
  public RestException () {
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
