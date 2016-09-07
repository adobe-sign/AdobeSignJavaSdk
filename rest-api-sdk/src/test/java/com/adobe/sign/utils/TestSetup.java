package com.adobe.sign.utils;

public class TestSetup {
    
    public static void main(String args[]) throws ApiException {
        try {
            TestSetup client = new TestSetup();
            client.run();
        }
        catch (ApiException e) {
        }
    }
    
    /**
     * Main work function.
     */
    private void run() throws ApiException {
        ApiUtils.configureProperty();
        if(!AgreementsUtils.isExistingAgreement(TestData.AGREEMENT_NAME))
            AgreementsUtils.createAgreement(TestData.AGREEMENT_NAME);
        
        if (GroupUtils.isExistingGroup(TestData.GROUP_NAME) == null)
            GroupUtils.createGroup(TestData.GROUP_NAME);
        
        if (!LibraryDocumentsUtils.isExistingLibraryDocument(TestData.LIBRARY_DOCUMENT_NAME))
            LibraryDocumentsUtils.createLibraryDocument(TestData.LIBRARY_DOCUMENT_NAME);
        
        if (!MegaSignUtils.isExistingMegaSign(TestData.MEGASIGN_NAME))
            MegaSignUtils.createMegaSign(TestData.MEGASIGN_NAME);
        
        
        if (!WidgetUtils.isExistingWidget(TestData.WIDGET_NAME))
            WidgetUtils.createWidget(TestData.WIDGET_NAME);
        
    }
}