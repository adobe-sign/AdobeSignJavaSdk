package com.adobe.sign.utils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-02T11:41:44.731+05:30")
public class JSON {
  private ObjectMapper mapper;
  private static final String CLASS_NAME = "class ";
  private static final String DESERIALIZATION_ERROR = "Error in deserialization.";

  public JSON() {
    mapper = new ObjectMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"));
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    mapper.registerModule(new JodaModule());
  }

  /**
   * Serialize the given Java object into JSON string.
   */
  public String serialize(Object obj) throws ApiException {
    try {
      if (obj != null)
        return mapper.writeValueAsString(obj);
      else
        return null;
    } catch (Exception e) {
      throw new ApiException(400,
                             e.getMessage());
    }
  }

  /**
   * Deserialize the given JSON string to Java object.
   *
   * @param body The JSON string
   * @param returnType The type to deserialize inot
   * @return The deserialized Java object
   */
  public <T> T deserialize(String body,
                           TypeRef returnType) throws ApiException {

    if(body.equals("[]")) {
      return (T) getEmptyClassInstance(returnType.getType());
    }

    JavaType javaType = mapper.constructType(returnType.getType());
    try {
      return mapper.readValue(body,
                              javaType);
    } catch (IOException e) {
      if (returnType.getType().equals(String.class))
        return (T) body;
      else
        throw new ApiException(DESERIALIZATION_ERROR);
    }
  }

  /**
   * Returns java object of the type passed as parameter.
   * Note : The type passed is of type java.lang.reflect.
   *
   * @param type object which is to be converted to java object.
   * @return Object java object of the given type.
   */
  private Object getEmptyClassInstance(Type type){

    if(type == null)
      return null;

    String className = type.toString();

    if(className == null)
      return null;

    className = className.substring(CLASS_NAME.length());

    try {
      Class<?> classType = Class.forName(className);
      return classType == null ? null : classType.newInstance();
    }
    catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
      return null;
    }
  }
}
