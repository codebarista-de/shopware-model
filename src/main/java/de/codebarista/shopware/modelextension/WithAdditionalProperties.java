package de.codebarista.shopware.modelextension;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * ADDED BY CODEBARISTA
 */
public abstract class WithAdditionalProperties {

    private Map<String, Object> additionalProperties = new HashMap<>();

    public Map<String, Object> getAdditionalProperties() {
        return Collections.unmodifiableMap(additionalProperties);
    }

    public Object getAdditionalProperty(String key) {
        return additionalProperties.get(key);
    }

    @JsonAnySetter
    public void addAdditionalProperty(String key, Object value) {
        this.additionalProperties.put(key, value);
    }
}