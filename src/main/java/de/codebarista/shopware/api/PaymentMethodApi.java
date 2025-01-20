package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.ReadPaymentMethod200Response;
import de.codebarista.shopware.model.ReadPaymentMethodRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:26:02.541008353+02:00[Europe/Berlin]", comments = "Generator version: 7.5.0")
public class PaymentMethodApi {
    private ApiClient apiClient;

    public PaymentMethodApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentMethodApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Loads all available payment methods
     * 
     * <p><b>200</b> - 
     * @param readPaymentMethodRequest The readPaymentMethodRequest parameter
     * @return ReadPaymentMethod200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readPaymentMethodRequestCreation(ReadPaymentMethodRequest readPaymentMethodRequest) throws WebClientResponseException {
        Object postBody = readPaymentMethodRequest;
        // verify the required parameter 'readPaymentMethodRequest' is set
        if (readPaymentMethodRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'readPaymentMethodRequest' when calling readPaymentMethod", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ReadPaymentMethod200Response> localVarReturnType = new ParameterizedTypeReference<ReadPaymentMethod200Response>() {};
        return apiClient.invokeAPI("/payment-method", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Loads all available payment methods
     * 
     * <p><b>200</b> - 
     * @param readPaymentMethodRequest The readPaymentMethodRequest parameter
     * @return ReadPaymentMethod200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadPaymentMethod200Response> readPaymentMethod(ReadPaymentMethodRequest readPaymentMethodRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ReadPaymentMethod200Response> localVarReturnType = new ParameterizedTypeReference<ReadPaymentMethod200Response>() {};
        return readPaymentMethodRequestCreation(readPaymentMethodRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Loads all available payment methods
     * 
     * <p><b>200</b> - 
     * @param readPaymentMethodRequest The readPaymentMethodRequest parameter
     * @return ResponseEntity&lt;ReadPaymentMethod200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadPaymentMethod200Response>> readPaymentMethodWithHttpInfo(ReadPaymentMethodRequest readPaymentMethodRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ReadPaymentMethod200Response> localVarReturnType = new ParameterizedTypeReference<ReadPaymentMethod200Response>() {};
        return readPaymentMethodRequestCreation(readPaymentMethodRequest).toEntity(localVarReturnType);
    }

    /**
     * Loads all available payment methods
     * 
     * <p><b>200</b> - 
     * @param readPaymentMethodRequest The readPaymentMethodRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readPaymentMethodWithResponseSpec(ReadPaymentMethodRequest readPaymentMethodRequest) throws WebClientResponseException {
        return readPaymentMethodRequestCreation(readPaymentMethodRequest);
    }
}
