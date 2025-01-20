package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.HandlePaymentMethodRequest;
import de.codebarista.shopware.model.ReadShippingMethod200Response;
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
public class PaymentShippingApi {
    private ApiClient apiClient;

    public PaymentShippingApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentShippingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Initiate a payment for an order
     * This generic endpoint is should be called to initiate a payment flow after an order has been created. The details of the payment flow can differ depending on the payment integration and might require calling additional operations or the setup of webhooks.  The endpoint internally calls the payment handler of the payment method currently set for the order.
     * <p><b>200</b> - Redirect to external payment provider
     * @param handlePaymentMethodRequest The handlePaymentMethodRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec handlePaymentMethodRequestCreation(HandlePaymentMethodRequest handlePaymentMethodRequest) throws WebClientResponseException {
        Object postBody = handlePaymentMethodRequest;
        // verify the required parameter 'handlePaymentMethodRequest' is set
        if (handlePaymentMethodRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'handlePaymentMethodRequest' when calling handlePaymentMethod", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/handle-payment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate a payment for an order
     * This generic endpoint is should be called to initiate a payment flow after an order has been created. The details of the payment flow can differ depending on the payment integration and might require calling additional operations or the setup of webhooks.  The endpoint internally calls the payment handler of the payment method currently set for the order.
     * <p><b>200</b> - Redirect to external payment provider
     * @param handlePaymentMethodRequest The handlePaymentMethodRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> handlePaymentMethod(HandlePaymentMethodRequest handlePaymentMethodRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return handlePaymentMethodRequestCreation(handlePaymentMethodRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate a payment for an order
     * This generic endpoint is should be called to initiate a payment flow after an order has been created. The details of the payment flow can differ depending on the payment integration and might require calling additional operations or the setup of webhooks.  The endpoint internally calls the payment handler of the payment method currently set for the order.
     * <p><b>200</b> - Redirect to external payment provider
     * @param handlePaymentMethodRequest The handlePaymentMethodRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> handlePaymentMethodWithHttpInfo(HandlePaymentMethodRequest handlePaymentMethodRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return handlePaymentMethodRequestCreation(handlePaymentMethodRequest).toEntity(localVarReturnType);
    }

    /**
     * Initiate a payment for an order
     * This generic endpoint is should be called to initiate a payment flow after an order has been created. The details of the payment flow can differ depending on the payment integration and might require calling additional operations or the setup of webhooks.  The endpoint internally calls the payment handler of the payment method currently set for the order.
     * <p><b>200</b> - Redirect to external payment provider
     * @param handlePaymentMethodRequest The handlePaymentMethodRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec handlePaymentMethodWithResponseSpec(HandlePaymentMethodRequest handlePaymentMethodRequest) throws WebClientResponseException {
        return handlePaymentMethodRequestCreation(handlePaymentMethodRequest);
    }
    /**
     * Fetch shipping methods
     * Perform a filtered search for shipping methods.
     * <p><b>200</b> - 
     * @param onlyAvailable List only available shipping methods. This filters shipping methods methods which can not be used in the actual context because of their availability rule.
     * @param criteria The criteria parameter
     * @return ReadShippingMethod200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readShippingMethodRequestCreation(Boolean onlyAvailable, Criteria criteria) throws WebClientResponseException {
        Object postBody = criteria;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyAvailable", onlyAvailable));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ReadShippingMethod200Response> localVarReturnType = new ParameterizedTypeReference<ReadShippingMethod200Response>() {};
        return apiClient.invokeAPI("/shipping-method", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch shipping methods
     * Perform a filtered search for shipping methods.
     * <p><b>200</b> - 
     * @param onlyAvailable List only available shipping methods. This filters shipping methods methods which can not be used in the actual context because of their availability rule.
     * @param criteria The criteria parameter
     * @return ReadShippingMethod200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadShippingMethod200Response> readShippingMethod(Boolean onlyAvailable, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadShippingMethod200Response> localVarReturnType = new ParameterizedTypeReference<ReadShippingMethod200Response>() {};
        return readShippingMethodRequestCreation(onlyAvailable, criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch shipping methods
     * Perform a filtered search for shipping methods.
     * <p><b>200</b> - 
     * @param onlyAvailable List only available shipping methods. This filters shipping methods methods which can not be used in the actual context because of their availability rule.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadShippingMethod200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadShippingMethod200Response>> readShippingMethodWithHttpInfo(Boolean onlyAvailable, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadShippingMethod200Response> localVarReturnType = new ParameterizedTypeReference<ReadShippingMethod200Response>() {};
        return readShippingMethodRequestCreation(onlyAvailable, criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch shipping methods
     * Perform a filtered search for shipping methods.
     * <p><b>200</b> - 
     * @param onlyAvailable List only available shipping methods. This filters shipping methods methods which can not be used in the actual context because of their availability rule.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readShippingMethodWithResponseSpec(Boolean onlyAvailable, Criteria criteria) throws WebClientResponseException {
        return readShippingMethodRequestCreation(onlyAvailable, criteria);
    }
}
