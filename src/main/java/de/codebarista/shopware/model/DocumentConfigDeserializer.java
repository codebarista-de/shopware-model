package de.codebarista.shopware.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * In some cases the "config" node of a Document is an OBJECT containing useful data: "config" : {...}<br>
 * But if no useful data is present, "config" is an empty ARRAY :\
 * In these cases we just want it to evaluate it to null.<br>
 * To handle the OBJECT/ARRAY dualism, we need this custom deserializer.
 */
public class DocumentConfigDeserializer extends JsonDeserializer<DocumentConfig> {
    @Override
    public DocumentConfig deserialize(JsonParser p, com.fasterxml.jackson.databind.DeserializationContext context)
            throws IOException {
        // Check if the current token is an empty array
        if (p.isExpectedStartArrayToken() && p.nextToken() == null) {
            // TODO: this path is never reached, but it does work anyway
            return null;  // Return null if the list is empty
        }

        // Otherwise, proceed with the default deserialization
        return p.readValueAs(DocumentConfig.class);
    }
}