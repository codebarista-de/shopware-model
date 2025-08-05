package de.codebarista.shopware.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.codebarista.integrations.service.electronicinvoice.exception.ElectronicInvoiceGenerationException;
import de.codebarista.integrations.service.electronicinvoice.shopware.ShopwareTaxStatus;
import jakarta.annotation.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public record CalculatedPrice(@JsonProperty("quantity") BigDecimal quantity,
                              @JsonProperty("totalPrice") BigDecimal totalPrice,
                              @JsonProperty("unitPrice") BigDecimal unitPrice,
                              @JsonProperty("calculatedTaxes") List<CalculatedTax> calculatedTaxes) {
    /**
     * @return the calculated tax, if only one calculated tax is present;<br>null, if no calculated tax is present.<br>
     * Throws an exception, if more than one calculated tax is present.
     */
    @Nullable
    public BigDecimal singleTaxRate() {
        var singleCalculatedTax = singleCalculatedTax();
        return singleCalculatedTax != null ? singleCalculatedTax.taxRate() : null;
    }

    public BigDecimal netUnitPrice(ShopwareTaxStatus taxStatus) {
        return totalNetPrice(taxStatus).divide(quantity, 4, RoundingMode.HALF_UP);
    }

    public BigDecimal totalNetPrice(ShopwareTaxStatus taxStatus) {
        if (taxStatus == ShopwareTaxStatus.NET) {
            return totalPrice;
        }
        return totalPrice.subtract(totalTaxAmount());
    }

    public BigDecimal totalTaxAmount() {
        return calculatedTaxes.stream()
                .map(CalculatedTax::tax)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    @Nullable
    private CalculatedTax singleCalculatedTax() {
        if (calculatedTaxes.isEmpty()) {
            return null;
        } else if (calculatedTaxes.size() == 1) {
            return calculatedTaxes.get(0);
        }
        throw new ElectronicInvoiceGenerationException("Has more than one calculated tax");
    }
}
