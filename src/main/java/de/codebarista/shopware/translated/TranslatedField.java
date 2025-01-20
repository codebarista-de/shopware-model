package de.codebarista.shopware.translated;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public class TranslatedField {
    private TranslatedField() {

    }

    public static String getTranslated(@Nonnull String property, @Nullable JsonNode translated, String defaultValue) {
        if (translated == null) {
            return defaultValue;
        }
        JsonNode translation = translated.get(property);
        if (translation.isTextual()) {
            return translation.asText();
        }
        // TODO: Implement case were there are multiple translations
        return defaultValue;
    }
}
