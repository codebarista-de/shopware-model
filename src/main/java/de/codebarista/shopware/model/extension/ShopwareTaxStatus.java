package de.codebarista.shopware.model.extension;

import jakarta.annotation.Nullable;

/**
 * Whether prices in the order are net or gross prices.
 */
public enum ShopwareTaxStatus {
    NET("net"),
    GROSS("gross"),
    TAX_FREE("tax-free");

    private final String value;

    ShopwareTaxStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Nullable
    public static ShopwareTaxStatus fromString(String value) {
        for (ShopwareTaxStatus taxStatus : ShopwareTaxStatus.values()) {
            if (taxStatus.value.equalsIgnoreCase(value)) {
                return taxStatus;
            }
        }
        return null;
    }

}
