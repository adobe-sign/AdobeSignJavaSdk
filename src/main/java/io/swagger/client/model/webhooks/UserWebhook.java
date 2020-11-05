/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.webhooks;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.webhooks.WebhookUrlInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * UserWebhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:53.405+11:00")
public class UserWebhook {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("webhookUrlInfo")
  private WebhookUrlInfo webhookUrlInfo = null;

  /**
   * Gets or Sets webhookSubscriptionEvents
   */
  @JsonAdapter(WebhookSubscriptionEventsEnum.Adapter.class)
  public enum WebhookSubscriptionEventsEnum {
    AGREEMENT_CREATED("AGREEMENT_CREATED"),
    
    AGREEMENT_ACTION_DELEGATED("AGREEMENT_ACTION_DELEGATED"),
    
    AGREEMENT_RECALLED("AGREEMENT_RECALLED"),
    
    AGREEMENT_REJECTED("AGREEMENT_REJECTED"),
    
    AGREEMENT_EXPIRED("AGREEMENT_EXPIRED"),
    
    AGREEMENT_ACTION_COMPLETED("AGREEMENT_ACTION_COMPLETED"),
    
    AGREEMENT_WORKFLOW_COMPLETED("AGREEMENT_WORKFLOW_COMPLETED"),
    
    AGREEMENT_EMAIL_VIEWED("AGREEMENT_EMAIL_VIEWED"),
    
    AGREEMENT_MODIFIED("AGREEMENT_MODIFIED"),
    
    AGREEMENT_SHARED("AGREEMENT_SHARED"),
    
    AGREEMENT_READY_TO_VAULT("AGREEMENT_READY_TO_VAULT"),
    
    AGREEMENT_VAULTED("AGREEMENT_VAULTED"),
    
    AGREEMENT_ACTION_REQUESTED("AGREEMENT_ACTION_REQUESTED"),
    
    AGREEMENT_ACTION_REPLACED_SIGNER("AGREEMENT_ACTION_REPLACED_SIGNER"),
    
    AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM("AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM"),
    
    AGREEMENT_DOCUMENTS_DELETED("AGREEMENT_DOCUMENTS_DELETED"),
    
    AGREEMENT_EMAIL_BOUNCED("AGREEMENT_EMAIL_BOUNCED"),
    
    AGREEMENT_KBA_AUTHENTICATED("AGREEMENT_KBA_AUTHENTICATED"),
    
    AGREEMENT_OFFLINE_SYNC("AGREEMENT_OFFLINE_SYNC"),
    
    AGREEMENT_USER_ACK_AGREEMENT_MODIFIED("AGREEMENT_USER_ACK_AGREEMENT_MODIFIED"),
    
    AGREEMENT_UPLOADED_BY_SENDER("AGREEMENT_UPLOADED_BY_SENDER"),
    
    AGREEMENT_WEB_IDENTITY_AUTHENTICATED("AGREEMENT_WEB_IDENTITY_AUTHENTICATED"),
    
    AGREEMENT_ALL("AGREEMENT_ALL"),
    
    MEGASIGN_CREATED("MEGASIGN_CREATED"),
    
    MEGASIGN_RECALLED("MEGASIGN_RECALLED"),
    
    MEGASIGN_SHARED("MEGASIGN_SHARED"),
    
    MEGASIGN_ALL("MEGASIGN_ALL"),
    
    WIDGET_CREATED("WIDGET_CREATED"),
    
    WIDGET_MODIFIED("WIDGET_MODIFIED"),
    
    WIDGET_SHARED("WIDGET_SHARED"),
    
    WIDGET_ENABLED("WIDGET_ENABLED"),
    
    WIDGET_DISABLED("WIDGET_DISABLED"),
    
    WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM("WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM"),
    
    WIDGET_ALL("WIDGET_ALL"),
    
    LIBRARY_DOCUMENT_CREATED("LIBRARY_DOCUMENT_CREATED"),
    
    LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM("LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM"),
    
    LIBRARY_DOCUMENT_MODIFIED("LIBRARY_DOCUMENT_MODIFIED"),
    
    LIBRARY_DOCUMENT_ALL("LIBRARY_DOCUMENT_ALL");

    private String value;

    WebhookSubscriptionEventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WebhookSubscriptionEventsEnum fromValue(String text) {
      for (WebhookSubscriptionEventsEnum b : WebhookSubscriptionEventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WebhookSubscriptionEventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookSubscriptionEventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebhookSubscriptionEventsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WebhookSubscriptionEventsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("webhookSubscriptionEvents")
  private List<WebhookSubscriptionEventsEnum> webhookSubscriptionEvents = null;

  /**
   * Scope of webhook. Can&#39;t be modified in PUT request. The possible values are ACCOUNT, GROUP, USER or RESOURCE
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    ACCOUNT("ACCOUNT"),
    
    GROUP("GROUP"),
    
    USER("USER"),
    
    RESOURCE("RESOURCE");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lastModified")
  private Date lastModified = null;

  @SerializedName("applicationDisplayName")
  private String applicationDisplayName = null;

  @SerializedName("applicationName")
  private String applicationName = null;

  /**
   * The resource for which you want to create webhook. Need to specify only if scope is &#39;RESOURCE&#39;. Can&#39;t be modified in PUT request. The possible values are AGREEMENT, WIDGET,  MEGASIGN AND LIBRARY_DOCUMENT
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    AGREEMENT("AGREEMENT"),
    
    WIDGET("WIDGET"),
    
    MEGASIGN("MEGASIGN"),
    
    LIBRARY_DOCUMENT("LIBRARY_DOCUMENT");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceTypeEnum fromValue(String text) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("resourceType")
  private ResourceTypeEnum resourceType = null;

  /**
   * Status of the webhook. Determines whether the webhook will be actually triggered. Default: ACTIVE, if ACTIVE, this webhook will receive event requests. If INACTIVE, this webhook will not receive event requests. Can&#39;t provide status in POST/PUT requests.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public UserWebhook resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Id of the resource type for which you want to create webhook. Provide agreementId if webhook needs to be created for an agreement. Similarly, widgetId if webhook needs to be created for a web form, megaSignId if webhook needs to be created for a megaSign and libraryDocumentId if webhook needs to be created for a library document. Need to specify only if scope is &#39;RESOURCE&#39;. Can&#39;t be modified in PUT request
   * @return resourceId
  **/
  @ApiModelProperty(value = "Id of the resource type for which you want to create webhook. Provide agreementId if webhook needs to be created for an agreement. Similarly, widgetId if webhook needs to be created for a web form, megaSignId if webhook needs to be created for a megaSign and libraryDocumentId if webhook needs to be created for a library document. Need to specify only if scope is 'RESOURCE'. Can't be modified in PUT request")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public UserWebhook webhookUrlInfo(WebhookUrlInfo webhookUrlInfo) {
    this.webhookUrlInfo = webhookUrlInfo;
    return this;
  }

   /**
   * Info of webhook url
   * @return webhookUrlInfo
  **/
  @ApiModelProperty(value = "Info of webhook url")
  public WebhookUrlInfo getWebhookUrlInfo() {
    return webhookUrlInfo;
  }

  public void setWebhookUrlInfo(WebhookUrlInfo webhookUrlInfo) {
    this.webhookUrlInfo = webhookUrlInfo;
  }

  public UserWebhook webhookSubscriptionEvents(List<WebhookSubscriptionEventsEnum> webhookSubscriptionEvents) {
    this.webhookSubscriptionEvents = webhookSubscriptionEvents;
    return this;
  }

  public UserWebhook addWebhookSubscriptionEventsItem(WebhookSubscriptionEventsEnum webhookSubscriptionEventsItem) {
    if (this.webhookSubscriptionEvents == null) {
      this.webhookSubscriptionEvents = new ArrayList<WebhookSubscriptionEventsEnum>();
    }
    this.webhookSubscriptionEvents.add(webhookSubscriptionEventsItem);
    return this;
  }

   /**
   * Determines events for which the webhook is triggered. The possible values are &lt;br&gt; AGREEMENT_CREATED : When an agreement is created &lt;br&gt;, AGREEMENT_ACTION_DELEGATED : When an agreement is delegated &lt;br&gt;, AGREEMENT_RECALLED : When an agreement is recalled &lt;br&gt;, AGREEMENT_REJECTED : When an agreement is rejected &lt;br&gt;, AGREEMENT_EXPIRED : When an agreement expires &lt;br&gt;, AGREEMENT_ACTION_COMPLETED : When an agreement action is completed &lt;br&gt;, AGREEMENT_WORKFLOW_COMPLETED : When an agreement workflow is completed &lt;br&gt;, AGREEMENT_EMAIL_VIEWED : When an agreement&#39;s email is viewed &lt;br&gt;, AGREEMENT_MODIFIED : When an agreement is modified &lt;br&gt;, AGREEMENT_SHARED : When an agreement is shared &lt;br&gt;, AGREEMENT_READY_TO_VAULT : When an agreement is ready to vault &lt;br&gt;, AGREEMENT_VAULTED : When an agreement is vaulted &lt;br&gt;, AGREEMENT_ACTION_REQUESTED : When an agreement action is requested &lt;br&gt;, AGREEMENT_ACTION_REPLACED_SIGNER : When signer is replaced for an agreement &lt;br&gt;, AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM : When an agreement is auto-cancelled due to conversion problem &lt;br&gt;, AGREEMENT_DOCUMENTS_DELETED : When an agreement documents are deleted &lt;br&gt;, AGREEMENT_EMAIL_BOUNCED : When an agreement email gets bounced &lt;br&gt;, AGREEMENT_KBA_AUTHENTICATED : When an agreement KBA is authenticated &lt;br&gt;, AGREEMENT_OFFLINE_SYNC : When an agreement is synced offline &lt;br&gt;, AGREEMENT_USER_ACK_AGREEMENT_MODIFIED : User Acknowledgement when an agreement is modified &lt;br&gt;, AGREEMENT_UPLOADED_BY_SENDER : When an agreement is uploaded by sender &lt;br&gt;, AGREEMENT_WEB_IDENTITY_AUTHENTICATED : When an agreement web identity is authenticated &lt;br&gt;, AGREEMENT_ALL : All the supported agreement events for Webhooks &lt;br&gt;, MEGASIGN_CREATED : When a megaSign is created &lt;br&gt;, MEGASIGN_RECALLED : When a megaSign is recalled &lt;br&gt;, MEGASIGN_SHARED : When a megaSign is shared &lt;br&gt;, MEGASIGN_ALL : All the supported megaSign events for Webhooks &lt;br&gt;, WIDGET_CREATED : When a web form is created &lt;br&gt;, WIDGET_MODIFIED : When a web form is modified &lt;br&gt;, WIDGET_SHARED : When a web form is shared &lt;br&gt;, WIDGET_ENABLED : When a web form is enabled &lt;br&gt;, WIDGET_DISABLED : When a web form is disabled &lt;br&gt;, WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM : When a web form is auto-cancelled due to conversion problem &lt;br&gt;, WIDGET_ALL : All the supported web form events for Webhooks &lt;br&gt;, LIBRARY_DOCUMENT_CREATED : When a library document  is created &lt;br&gt;, LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM : When a library document is auto-cancelled due to conversion problem &lt;br&gt;, LIBRARY_DOCUMENT_MODIFIED : When a library document is modified &lt;br&gt;, LIBRARY_DOCUMENT_ALL : All the supported library document  events for Webhooks
   * @return webhookSubscriptionEvents
  **/
  @ApiModelProperty(value = "Determines events for which the webhook is triggered. The possible values are <br> AGREEMENT_CREATED : When an agreement is created <br>, AGREEMENT_ACTION_DELEGATED : When an agreement is delegated <br>, AGREEMENT_RECALLED : When an agreement is recalled <br>, AGREEMENT_REJECTED : When an agreement is rejected <br>, AGREEMENT_EXPIRED : When an agreement expires <br>, AGREEMENT_ACTION_COMPLETED : When an agreement action is completed <br>, AGREEMENT_WORKFLOW_COMPLETED : When an agreement workflow is completed <br>, AGREEMENT_EMAIL_VIEWED : When an agreement's email is viewed <br>, AGREEMENT_MODIFIED : When an agreement is modified <br>, AGREEMENT_SHARED : When an agreement is shared <br>, AGREEMENT_READY_TO_VAULT : When an agreement is ready to vault <br>, AGREEMENT_VAULTED : When an agreement is vaulted <br>, AGREEMENT_ACTION_REQUESTED : When an agreement action is requested <br>, AGREEMENT_ACTION_REPLACED_SIGNER : When signer is replaced for an agreement <br>, AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM : When an agreement is auto-cancelled due to conversion problem <br>, AGREEMENT_DOCUMENTS_DELETED : When an agreement documents are deleted <br>, AGREEMENT_EMAIL_BOUNCED : When an agreement email gets bounced <br>, AGREEMENT_KBA_AUTHENTICATED : When an agreement KBA is authenticated <br>, AGREEMENT_OFFLINE_SYNC : When an agreement is synced offline <br>, AGREEMENT_USER_ACK_AGREEMENT_MODIFIED : User Acknowledgement when an agreement is modified <br>, AGREEMENT_UPLOADED_BY_SENDER : When an agreement is uploaded by sender <br>, AGREEMENT_WEB_IDENTITY_AUTHENTICATED : When an agreement web identity is authenticated <br>, AGREEMENT_ALL : All the supported agreement events for Webhooks <br>, MEGASIGN_CREATED : When a megaSign is created <br>, MEGASIGN_RECALLED : When a megaSign is recalled <br>, MEGASIGN_SHARED : When a megaSign is shared <br>, MEGASIGN_ALL : All the supported megaSign events for Webhooks <br>, WIDGET_CREATED : When a web form is created <br>, WIDGET_MODIFIED : When a web form is modified <br>, WIDGET_SHARED : When a web form is shared <br>, WIDGET_ENABLED : When a web form is enabled <br>, WIDGET_DISABLED : When a web form is disabled <br>, WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM : When a web form is auto-cancelled due to conversion problem <br>, WIDGET_ALL : All the supported web form events for Webhooks <br>, LIBRARY_DOCUMENT_CREATED : When a library document  is created <br>, LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM : When a library document is auto-cancelled due to conversion problem <br>, LIBRARY_DOCUMENT_MODIFIED : When a library document is modified <br>, LIBRARY_DOCUMENT_ALL : All the supported library document  events for Webhooks")
  public List<WebhookSubscriptionEventsEnum> getWebhookSubscriptionEvents() {
    return webhookSubscriptionEvents;
  }

  public void setWebhookSubscriptionEvents(List<WebhookSubscriptionEventsEnum> webhookSubscriptionEvents) {
    this.webhookSubscriptionEvents = webhookSubscriptionEvents;
  }

  public UserWebhook scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Scope of webhook. Can&#39;t be modified in PUT request. The possible values are ACCOUNT, GROUP, USER or RESOURCE
   * @return scope
  **/
  @ApiModelProperty(value = "Scope of webhook. Can't be modified in PUT request. The possible values are ACCOUNT, GROUP, USER or RESOURCE")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public UserWebhook name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the webhook
   * @return name
  **/
  @ApiModelProperty(value = "The name of the webhook")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserWebhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the webhook. Will only be returned in GET request. Can&#39;t be modified in PUT request
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the webhook. Will only be returned in GET request. Can't be modified in PUT request")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserWebhook lastModified(Date lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Timestamp when the webhook was last updated. Will only be returned in GET request. Can&#39;t be modified in PUT request
   * @return lastModified
  **/
  @ApiModelProperty(value = "Timestamp when the webhook was last updated. Will only be returned in GET request. Can't be modified in PUT request")
  public Date getLastModified() {
    return lastModified;
  }

  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }

  public UserWebhook applicationDisplayName(String applicationDisplayName) {
    this.applicationDisplayName = applicationDisplayName;
    return this;
  }

   /**
   * The display name of the application through which webhook is created
   * @return applicationDisplayName
  **/
  @ApiModelProperty(value = "The display name of the application through which webhook is created")
  public String getApplicationDisplayName() {
    return applicationDisplayName;
  }

  public void setApplicationDisplayName(String applicationDisplayName) {
    this.applicationDisplayName = applicationDisplayName;
  }

  public UserWebhook applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the application through which webhook is created
   * @return applicationName
  **/
  @ApiModelProperty(value = "The name of the application through which webhook is created")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public UserWebhook resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The resource for which you want to create webhook. Need to specify only if scope is &#39;RESOURCE&#39;. Can&#39;t be modified in PUT request. The possible values are AGREEMENT, WIDGET,  MEGASIGN AND LIBRARY_DOCUMENT
   * @return resourceType
  **/
  @ApiModelProperty(value = "The resource for which you want to create webhook. Need to specify only if scope is 'RESOURCE'. Can't be modified in PUT request. The possible values are AGREEMENT, WIDGET,  MEGASIGN AND LIBRARY_DOCUMENT")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public UserWebhook status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the webhook. Determines whether the webhook will be actually triggered. Default: ACTIVE, if ACTIVE, this webhook will receive event requests. If INACTIVE, this webhook will not receive event requests. Can&#39;t provide status in POST/PUT requests.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the webhook. Determines whether the webhook will be actually triggered. Default: ACTIVE, if ACTIVE, this webhook will receive event requests. If INACTIVE, this webhook will not receive event requests. Can't provide status in POST/PUT requests.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebhook userWebhook = (UserWebhook) o;
    return Objects.equals(this.resourceId, userWebhook.resourceId) &&
        Objects.equals(this.webhookUrlInfo, userWebhook.webhookUrlInfo) &&
        Objects.equals(this.webhookSubscriptionEvents, userWebhook.webhookSubscriptionEvents) &&
        Objects.equals(this.scope, userWebhook.scope) &&
        Objects.equals(this.name, userWebhook.name) &&
        Objects.equals(this.id, userWebhook.id) &&
        Objects.equals(this.lastModified, userWebhook.lastModified) &&
        Objects.equals(this.applicationDisplayName, userWebhook.applicationDisplayName) &&
        Objects.equals(this.applicationName, userWebhook.applicationName) &&
        Objects.equals(this.resourceType, userWebhook.resourceType) &&
        Objects.equals(this.status, userWebhook.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, webhookUrlInfo, webhookSubscriptionEvents, scope, name, id, lastModified, applicationDisplayName, applicationName, resourceType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebhook {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    webhookUrlInfo: ").append(toIndentedString(webhookUrlInfo)).append("\n");
    sb.append("    webhookSubscriptionEvents: ").append(toIndentedString(webhookSubscriptionEvents)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    applicationDisplayName: ").append(toIndentedString(applicationDisplayName)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

