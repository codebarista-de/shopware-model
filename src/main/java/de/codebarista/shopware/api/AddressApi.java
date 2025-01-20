package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.CustomerAddress;
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
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:26:02.541008353+02:00[Europe/Berlin]", comments = "Generator version: 7.5.0")
public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(new ApiClient());
    }

    @Autowired
    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new address for a customer
     * Creates a new address for a customer.
     * <p><b>200</b> - 
     * @param customerAddress The customerAddress parameter
     * @return CustomerAddress
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCustomerAddressRequestCreation(CustomerAddress customerAddress) throws WebClientResponseException {
        Object postBody = customerAddress;
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

        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return apiClient.invokeAPI("/account/address", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new address for a customer
     * Creates a new address for a customer.
     * <p><b>200</b> - 
     * @param customerAddress The customerAddress parameter
     * @return CustomerAddress
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomerAddress> createCustomerAddress(CustomerAddress customerAddress) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return createCustomerAddressRequestCreation(customerAddress).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new address for a customer
     * Creates a new address for a customer.
     * <p><b>200</b> - 
     * @param customerAddress The customerAddress parameter
     * @return ResponseEntity&lt;CustomerAddress&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CustomerAddress>> createCustomerAddressWithHttpInfo(CustomerAddress customerAddress) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return createCustomerAddressRequestCreation(customerAddress).toEntity(localVarReturnType);
    }

    /**
     * Create a new address for a customer
     * Creates a new address for a customer.
     * <p><b>200</b> - 
     * @param customerAddress The customerAddress parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createCustomerAddressWithResponseSpec(CustomerAddress customerAddress) throws WebClientResponseException {
        return createCustomerAddressRequestCreation(customerAddress);
    }
    /**
     * Change a customer&#39;s default billing address
     * Updates the default (preselected) billing addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec defaultBillingAddressRequestCreation(String addressId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new WebClientResponseException("Missing the required parameter 'addressId' when calling defaultBillingAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addressId", addressId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/address/default-billing/{addressId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change a customer&#39;s default billing address
     * Updates the default (preselected) billing addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> defaultBillingAddress(String addressId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return defaultBillingAddressRequestCreation(addressId).bodyToMono(localVarReturnType);
    }

    /**
     * Change a customer&#39;s default billing address
     * Updates the default (preselected) billing addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> defaultBillingAddressWithHttpInfo(String addressId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return defaultBillingAddressRequestCreation(addressId).toEntity(localVarReturnType);
    }

    /**
     * Change a customer&#39;s default billing address
     * Updates the default (preselected) billing addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec defaultBillingAddressWithResponseSpec(String addressId) throws WebClientResponseException {
        return defaultBillingAddressRequestCreation(addressId);
    }
    /**
     * Change a customer&#39;s default shipping address
     * Updates the default (preselected) shipping addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec defaultShippingAddressRequestCreation(String addressId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new WebClientResponseException("Missing the required parameter 'addressId' when calling defaultShippingAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addressId", addressId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/address/default-shipping/{addressId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change a customer&#39;s default shipping address
     * Updates the default (preselected) shipping addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> defaultShippingAddress(String addressId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return defaultShippingAddressRequestCreation(addressId).bodyToMono(localVarReturnType);
    }

    /**
     * Change a customer&#39;s default shipping address
     * Updates the default (preselected) shipping addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> defaultShippingAddressWithHttpInfo(String addressId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return defaultShippingAddressRequestCreation(addressId).toEntity(localVarReturnType);
    }

    /**
     * Change a customer&#39;s default shipping address
     * Updates the default (preselected) shipping addresses of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec defaultShippingAddressWithResponseSpec(String addressId) throws WebClientResponseException {
        return defaultShippingAddressRequestCreation(addressId);
    }
    /**
     * Delete an address of a customer
     * Delete an address of customer.      Only addresses which are not set as default addresses for shipping or billing can be deleted. You can check the current default addresses of your customer using the profile information endpoint and change them using the default address endpoint.      **A customer must have at least one address (which can be used for shipping and billing).**      An automatic fallback is not applied.
     * <p><b>204</b> - No Content response, when the address has been deleted
     * <p><b>400</b> - Response containing a list of errors, most likely due to the address being in use
     * @param addressId ID of the address to be deleted.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCustomerAddressRequestCreation(String addressId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new WebClientResponseException("Missing the required parameter 'addressId' when calling deleteCustomerAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addressId", addressId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/address/{addressId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an address of a customer
     * Delete an address of customer.      Only addresses which are not set as default addresses for shipping or billing can be deleted. You can check the current default addresses of your customer using the profile information endpoint and change them using the default address endpoint.      **A customer must have at least one address (which can be used for shipping and billing).**      An automatic fallback is not applied.
     * <p><b>204</b> - No Content response, when the address has been deleted
     * <p><b>400</b> - Response containing a list of errors, most likely due to the address being in use
     * @param addressId ID of the address to be deleted.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCustomerAddress(String addressId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteCustomerAddressRequestCreation(addressId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an address of a customer
     * Delete an address of customer.      Only addresses which are not set as default addresses for shipping or billing can be deleted. You can check the current default addresses of your customer using the profile information endpoint and change them using the default address endpoint.      **A customer must have at least one address (which can be used for shipping and billing).**      An automatic fallback is not applied.
     * <p><b>204</b> - No Content response, when the address has been deleted
     * <p><b>400</b> - Response containing a list of errors, most likely due to the address being in use
     * @param addressId ID of the address to be deleted.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteCustomerAddressWithHttpInfo(String addressId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteCustomerAddressRequestCreation(addressId).toEntity(localVarReturnType);
    }

    /**
     * Delete an address of a customer
     * Delete an address of customer.      Only addresses which are not set as default addresses for shipping or billing can be deleted. You can check the current default addresses of your customer using the profile information endpoint and change them using the default address endpoint.      **A customer must have at least one address (which can be used for shipping and billing).**      An automatic fallback is not applied.
     * <p><b>204</b> - No Content response, when the address has been deleted
     * <p><b>400</b> - Response containing a list of errors, most likely due to the address being in use
     * @param addressId ID of the address to be deleted.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCustomerAddressWithResponseSpec(String addressId) throws WebClientResponseException {
        return deleteCustomerAddressRequestCreation(addressId);
    }
    /**
     * Fetch addresses of a customer
     * Lists all addresses of the current customer and allows filtering them based on a criteria.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return List&lt;CustomerAddress&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAddressRequestCreation(Criteria criteria) throws WebClientResponseException {
        Object postBody = criteria;
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

        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return apiClient.invokeAPI("/account/list-address", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch addresses of a customer
     * Lists all addresses of the current customer and allows filtering them based on a criteria.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return List&lt;CustomerAddress&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<CustomerAddress> listAddress(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return listAddressRequestCreation(criteria).bodyToFlux(localVarReturnType);
    }

    /**
     * Fetch addresses of a customer
     * Lists all addresses of the current customer and allows filtering them based on a criteria.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;List&lt;CustomerAddress&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<CustomerAddress>>> listAddressWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return listAddressRequestCreation(criteria).toEntityList(localVarReturnType);
    }

    /**
     * Fetch addresses of a customer
     * Lists all addresses of the current customer and allows filtering them based on a criteria.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAddressWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return listAddressRequestCreation(criteria);
    }
    /**
     * Modify an address of a customer
     * Modifies an existing address of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @param customerAddress The customerAddress parameter
     * @return CustomerAddress
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateCustomerAddressRequestCreation(String addressId, CustomerAddress customerAddress) throws WebClientResponseException {
        Object postBody = customerAddress;
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new WebClientResponseException("Missing the required parameter 'addressId' when calling updateCustomerAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addressId", addressId);

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

        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return apiClient.invokeAPI("/account/address/{addressId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Modify an address of a customer
     * Modifies an existing address of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @param customerAddress The customerAddress parameter
     * @return CustomerAddress
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomerAddress> updateCustomerAddress(String addressId, CustomerAddress customerAddress) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return updateCustomerAddressRequestCreation(addressId, customerAddress).bodyToMono(localVarReturnType);
    }

    /**
     * Modify an address of a customer
     * Modifies an existing address of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @param customerAddress The customerAddress parameter
     * @return ResponseEntity&lt;CustomerAddress&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CustomerAddress>> updateCustomerAddressWithHttpInfo(String addressId, CustomerAddress customerAddress) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerAddress> localVarReturnType = new ParameterizedTypeReference<CustomerAddress>() {};
        return updateCustomerAddressRequestCreation(addressId, customerAddress).toEntity(localVarReturnType);
    }

    /**
     * Modify an address of a customer
     * Modifies an existing address of a customer.
     * <p><b>200</b> - 
     * @param addressId Address ID
     * @param customerAddress The customerAddress parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateCustomerAddressWithResponseSpec(String addressId, CustomerAddress customerAddress) throws WebClientResponseException {
        return updateCustomerAddressRequestCreation(addressId, customerAddress);
    }
}
