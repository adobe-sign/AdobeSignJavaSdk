package io.swagger.client.sample;

import java.io.File;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AgreementsApi;
import io.swagger.client.api.BaseUrisApi;
import io.swagger.client.api.TransientDocumentsApi;
import io.swagger.client.model.AgreementCreationResponse;
import io.swagger.client.model.AgreementInfo;
import io.swagger.client.model.BaseUriInfo;
import io.swagger.client.model.FileInfo;
import io.swagger.client.model.ParticipantSetInfo;
import io.swagger.client.model.ParticipantSetMemberInfo;
import io.swagger.client.model.TransientDocumentResponse;

/**
 * This sample client demonstrates how to send a new agreement.
 * <p>
 * <p>
 * Following workflow has been implemented here :
 * <li> Call base uris api to fetch api access point to invoke further API calls.</li>
 * <li> Create a transient document and get transient document id.</li>
 * <li> Prepare agreement info and create an agreement using the transient document.</li>
 * <li> Send the agreement.</li>
 * <li> Display agreement details.</li>
 * </p>
 */
public class SendAgreementUsingTransientDocument {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String[] args) {

    try {
      ApiClient apiClient = new ApiClient();

      //Default baseUrl to make GET /baseUris API call.
      String baseUrl = "https://api.echosign.com/";
      String endpointUrl = "/api/rest/v6";
      apiClient.setBasePath(baseUrl + endpointUrl);

      //TODO : Provide an OAuth Access Token as "Bearer : access token" in authorization
      String authorization = "Bearer 3AAABLblqZhBPYinYcE4CwyFS3mUxuVW1NLHXQfGKFntc3nnrA8PQkqfzldtK6W7WXAWfOgTu9tvsE31CiFJqwMAc2sYerOVK";

      //Get the baseUris for the user and set it in apiClient.
      BaseUrisApi baseUrisApi = new BaseUrisApi(apiClient);
      BaseUriInfo baseUriInfo = baseUrisApi.getBaseUris(authorization);
      apiClient.setBasePath(baseUriInfo.getApiAccessPoint() + endpointUrl);

      //TODO : Provide path and name of file to be uploaded as transient document
      String filePath = "/Users/srustagi/GitHub/AdobeSignJavaSdk/src/main/java/io/swagger/client/sample/";
      String fileName = "Sample.pdf";
      File file = new File(filePath + fileName);
      String xApiUser = null;
      String xOnBehalfOfUser = null;
      String mimeType = "application/pdf";

      //Get the id of the transient document.
      TransientDocumentsApi transientDocumentsApi = new TransientDocumentsApi(apiClient);
      TransientDocumentResponse response = transientDocumentsApi.createTransientDocument(authorization, file, xApiUser, xOnBehalfOfUser, fileName, mimeType);
      String transientDocumentId = response.getTransientDocumentId();

      //prepare request body for agreement creation.
      AgreementInfo agreementInfo = new AgreementInfo();
      agreementInfo.setName("Sample_Agreement");
      agreementInfo.setSignatureType(AgreementInfo.SignatureTypeEnum.ESIGN);
      agreementInfo.setState(AgreementInfo.StateEnum.DRAFT);

      FileInfo fileInfo = new FileInfo();
      fileInfo.setTransientDocumentId(transientDocumentId);
      agreementInfo.addFileInfosItem(fileInfo);

      ParticipantSetInfo participantSetInfo = new ParticipantSetInfo();
      ParticipantSetMemberInfo participantSetMemberInfo = new ParticipantSetMemberInfo();

      //TODO : Provide email of recipient to whom agreement will be sent
      participantSetMemberInfo.setEmail("sajalsigntester@gmail.com");
      participantSetInfo.addMemberInfosItem(participantSetMemberInfo);
      participantSetInfo.setOrder(1);
      participantSetInfo.setRole(ParticipantSetInfo.RoleEnum.SIGNER);
      agreementInfo.addParticipantSetsInfoItem(participantSetInfo);

      //Create agreement using the transient document.
      AgreementsApi agreementsApi = new AgreementsApi(apiClient);
      AgreementCreationResponse agreementCreationResponse = agreementsApi.createAgreement(authorization, agreementInfo, xApiUser, xOnBehalfOfUser);
      String id = agreementCreationResponse.getId();

      //Get agreement info using the agreement id.
      String ifNoneMatch = null;
      agreementInfo = agreementsApi.getAgreementInfo(authorization, id, xApiUser, xOnBehalfOfUser, ifNoneMatch);
      System.out.println("Agreement ID = " + agreementInfo.getId());
      System.out.println("Agreement Name = " + agreementInfo.getName());
      System.out.println("Agreement Status = " + agreementInfo.getStatus());

    }
    catch (ApiException e) {
      System.err.println(e.toString());
    }
  }
}