package de.codebarista.shopware.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;

@Getter
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
}
