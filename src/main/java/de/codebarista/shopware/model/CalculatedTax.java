package de.codebarista.shopware.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @param tax        the actual tax amount, e.g. 0.11 €
 * @param taxRate    the tax rate, e.g. 7 (for 7%)
 * @param totalPrice the total price
 */
public record CalculatedTax(@JsonProperty("tax") BigDecimal tax,
                            @JsonProperty("taxRate") BigDecimal taxRate,
                            @JsonProperty("price") BigDecimal totalPrice) {
    public BigDecimal netPrice() {
        return totalPrice.subtract(tax);
    }
}
