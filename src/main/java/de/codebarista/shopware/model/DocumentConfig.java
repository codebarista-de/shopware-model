package de.codebarista.shopware.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class DocumentConfig {
    @JsonProperty("name")
    private String name;
    @JsonProperty("documentNumber")
    private String documentNumber;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("companyAddress")
    private String companyAddress;
    @JsonProperty("companyEmail")
    private String companyEmail;
    @JsonProperty("companyPhone")
    private String companyPhone;
    @JsonProperty("executiveDirector")
    private String executiveDirector;
    @JsonProperty("vatId")
    private String vatId;
    @JsonProperty("bankIban")
    private String bankIban;
    @JsonProperty("bankBic")
    private String bankBic;
    @JsonProperty("placeOfJurisdiction")
    private String placeOfJurisdiction;
    @JsonProperty("displayCustomerVatId")
    private boolean displayCustomerVatId;
    @JsonProperty("documentComment")
    private String comment;
    @JsonProperty("custom")
    private JsonNode custom;

    /**
     * Whether the message "intra-community supply" should be shown
     * when the invoice matches the necessary criteria.
     */
    @JsonProperty("displayAdditionalNoteDelivery")
    private boolean enableIntraCommunitySupplyNote;

    /**
     * Whether an actual invoice matches the necessary criteria for "intra-community supply"
     */
    @JsonProperty("intraCommunityDelivery")
    private boolean intraCommunitySupply; // aka intra-community supply

    public String getName() {
        return name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public String getExecutiveDirector() {
        return executiveDirector;
    }

    public String getVatId() {
        return vatId;
    }

    public String getBankIban() {
        return bankIban;
    }

    public String getBankBic() {
        return bankBic;
    }

    public String getPlaceOfJurisdiction() {
        return placeOfJurisdiction;
    }

    public boolean isDisplayCustomerVatId() {
        return displayCustomerVatId;
    }

    public String getComment() {
        return comment;
    }

    public JsonNode getCustom() {
        return custom;
    }

    public boolean isIntraCommunitySupply() {
        return intraCommunitySupply;
    }

    public boolean isEnableIntraCommunitySupplyNote() {
        return enableIntraCommunitySupplyNote;
    }
}
