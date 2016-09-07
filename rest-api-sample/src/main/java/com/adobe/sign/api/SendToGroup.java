package com.adobe.sign.api;

import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.model.agreements.AgreementCreationResponse;
import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.model.agreements.NextParticipantSetInfo;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.LibraryDocumentUtils;

/**
 * This sample client demonstrates how to send agreements to active participants (those who are next in line in the signing process) as a named group.
 * It then retrieves the same agreement and retrieves the name of the participant group.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */


public class SendToGroup {
  
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(SendToGroup.class.getName());
    try {
      SendToGroup client = new SendToGroup();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.SEND_TO_GROUP, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException {

    //Get the id of the first library document of the user.
    String libraryDocumentId = LibraryDocumentUtils.getFirstLibraryDocumentId();

    if(libraryDocumentId == null) {
      ApiUtils.logError(Errors.NO_LIBRARY_DOCUMENTS);
    }
    else {
      //List containing email ids of recipients
      List<String> recipientSetEmailList = new ArrayList<String>();
      recipientSetEmailList.add(Constants.USER_EMAIL);
      //Create agreement using the first library document of the user
      AgreementCreationResponse agreementCreationResponse = AgreementUtils.createAgreementWithRecipientSetName(recipientSetEmailList,
                                                                                                               Constants.RECIPIENT_SET_NAME,
                                                                                                               libraryDocumentId,
                                                                                                               AgreementUtils.DocumentIdentifierType.LIBRARY_DOCUMENT_ID,
                                                                                                               Constants.AGREEMENT_NAME);

      //Get agreement info using the agreement id
      AgreementInfo agreementInfo = AgreementUtils.getAgreementInfo(agreementCreationResponse.getAgreementId());

      //Display agreement details
      ApiUtils.getLogger().info("Agreement ID = " + agreementInfo.getAgreementId());
      ApiUtils.getLogger().info("Agreement Name = " + agreementInfo.getName());
      ApiUtils.getLogger().info("Agreement Status = " + agreementInfo.getStatus());
      List<NextParticipantSetInfo> nextParticipantSetInfoList = agreementInfo.getNextParticipantSetInfos();

      //Check nextParticipantSetInfoList is not empty
      if (nextParticipantSetInfoList == null || nextParticipantSetInfoList.isEmpty()) {
        ApiUtils.logError(Errors.NO_PARTICIPANT_SET);
        ApiUtils.getLogger().info("");
        return;
      }

      //Find next participant set and print its name
      for (NextParticipantSetInfo nextParticipantSetInfo : nextParticipantSetInfoList) {
        if(nextParticipantSetInfo != null) {       
          ApiUtils.getLogger().info("nextParticipantSetInfo name = " + nextParticipantSetInfo.getNextParticipantSetName());
          ApiUtils.getLogger().info("");
        }
      }
    }
  }

}
