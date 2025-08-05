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
    /**
     * Pre-Shopware 6.7 property for whole company address: "[LegalName -] Street - City ZIP-Code"
     */
    @JsonProperty("companyAddress")
    private String companyAddress;
    /**
     * Since Shopware 6.7
     */
    @JsonProperty("companyStreet")
    private String companyStreet;
    /**
     * Since Shopware 6.7
     */
    @JsonProperty("companyZipcode")
    private String companyZipcode;
    /**
     * Since Shopware 6.7
     */
    @JsonProperty("companyCity")
    private String companyCity;
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

    /**
     * Gets the {@link #name}.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the {@link #documentNumber}.
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Gets the {@link #companyName}.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Gets the {@link #companyAddress}.
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Gets the {@link #companyStreet}.
     */
    public String getCompanyStreet() {
        return companyStreet;
    }

    /**
     * Gets the {@link #companyZipcode}.
     */
    public String getCompanyZipcode() {
        return companyZipcode;
    }

    /**
     * Gets the {@link #companyCity}.
     */
    public String getCompanyCity() {
        return companyCity;
    }

    /**
     * Gets the {@link #companyEmail}.
     */
    public String getCompanyEmail() {
        return companyEmail;
    }

    /**
     * Gets the {@link #companyPhone}.
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * Gets the {@link #executiveDirector}.
     */
    public String getExecutiveDirector() {
        return executiveDirector;
    }

    /**
     * Gets the {@link #vatId}.
     */
    public String getVatId() {
        return vatId;
    }

    /**
     * Gets the {@link #bankIban}.
     */
    public String getBankIban() {
        return bankIban;
    }

    /**
     * Gets the {@link #bankBic}.
     */
    public String getBankBic() {
        return bankBic;
    }

    /**
     * Gets the {@link #placeOfJurisdiction}.
     */
    public String getPlaceOfJurisdiction() {
        return placeOfJurisdiction;
    }

    /**
     * Gets the {@link #displayCustomerVatId}.
     */
    public boolean isDisplayCustomerVatId() {
        return displayCustomerVatId;
    }

    /**
     * Gets the {@link #comment}.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Gets the {@link #custom}.
     */
    public JsonNode getCustom() {
        return custom;
    }

    /**
     * Gets the {@link #enableIntraCommunitySupplyNote}.
     */
    public boolean isEnableIntraCommunitySupplyNote() {
        return enableIntraCommunitySupplyNote;
    }

    /**
     * Gets the {@link #intraCommunitySupply}.
     */
    public boolean isIntraCommunitySupply() {
        return intraCommunitySupply;
    }
}
