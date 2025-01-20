package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Customer;
import de.codebarista.shopware.model.CustomerGroup;
import de.codebarista.shopware.model.LoginCustomerRequest;
import de.codebarista.shopware.model.RegisterConfirmRequest;
import de.codebarista.shopware.model.RegisterRequest;
import de.codebarista.shopware.model.UpdateContext200Response;
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
public class LoginRegistrationApi {
    private ApiClient apiClient;

    public LoginRegistrationApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoginRegistrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Fetch registration settings for customer group
     * 
     * <p><b>200</b> - Returns the customer group including registration settings.
     * @param customerGroupId Customer group id
     * @return CustomerGroup
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCustomerGroupRegistrationInfoRequestCreation(String customerGroupId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'customerGroupId' is set
        if (customerGroupId == null) {
            throw new WebClientResponseException("Missing the required parameter 'customerGroupId' when calling getCustomerGroupRegistrationInfo", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("customerGroupId", customerGroupId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<CustomerGroup> localVarReturnType = new ParameterizedTypeReference<CustomerGroup>() {};
        return apiClient.invokeAPI("/customer-group-registration/config/{customerGroupId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch registration settings for customer group
     * 
     * <p><b>200</b> - Returns the customer group including registration settings.
     * @param customerGroupId Customer group id
     * @return CustomerGroup
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomerGroup> getCustomerGroupRegistrationInfo(String customerGroupId) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerGroup> localVarReturnType = new ParameterizedTypeReference<CustomerGroup>() {};
        return getCustomerGroupRegistrationInfoRequestCreation(customerGroupId).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch registration settings for customer group
     * 
     * <p><b>200</b> - Returns the customer group including registration settings.
     * @param customerGroupId Customer group id
     * @return ResponseEntity&lt;CustomerGroup&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CustomerGroup>> getCustomerGroupRegistrationInfoWithHttpInfo(String customerGroupId) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerGroup> localVarReturnType = new ParameterizedTypeReference<CustomerGroup>() {};
        return getCustomerGroupRegistrationInfoRequestCreation(customerGroupId).toEntity(localVarReturnType);
    }

    /**
     * Fetch registration settings for customer group
     * 
     * <p><b>200</b> - Returns the customer group including registration settings.
     * @param customerGroupId Customer group id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCustomerGroupRegistrationInfoWithResponseSpec(String customerGroupId) throws WebClientResponseException {
        return getCustomerGroupRegistrationInfoRequestCreation(customerGroupId);
    }
    /**
     * Log in a customer
     * Logs in customers given their credentials.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>401</b> - If credentials are incorrect an error is returned
     * @param loginCustomerRequest The loginCustomerRequest parameter
     * @return UpdateContext200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec loginCustomerRequestCreation(LoginCustomerRequest loginCustomerRequest) throws WebClientResponseException {
        Object postBody = loginCustomerRequest;
        // verify the required parameter 'loginCustomerRequest' is set
        if (loginCustomerRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'loginCustomerRequest' when calling loginCustomer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return apiClient.invokeAPI("/account/login", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Log in a customer
     * Logs in customers given their credentials.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>401</b> - If credentials are incorrect an error is returned
     * @param loginCustomerRequest The loginCustomerRequest parameter
     * @return UpdateContext200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateContext200Response> loginCustomer(LoginCustomerRequest loginCustomerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return loginCustomerRequestCreation(loginCustomerRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Log in a customer
     * Logs in customers given their credentials.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>401</b> - If credentials are incorrect an error is returned
     * @param loginCustomerRequest The loginCustomerRequest parameter
     * @return ResponseEntity&lt;UpdateContext200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateContext200Response>> loginCustomerWithHttpInfo(LoginCustomerRequest loginCustomerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return loginCustomerRequestCreation(loginCustomerRequest).toEntity(localVarReturnType);
    }

    /**
     * Log in a customer
     * Logs in customers given their credentials.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>401</b> - If credentials are incorrect an error is returned
     * @param loginCustomerRequest The loginCustomerRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec loginCustomerWithResponseSpec(LoginCustomerRequest loginCustomerRequest) throws WebClientResponseException {
        return loginCustomerRequestCreation(loginCustomerRequest);
    }
    /**
     * Log out a customer
     * Logs out a customer.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>403</b> - Forbidden
     * @return UpdateContext200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec logoutCustomerRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/vnd.api+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return apiClient.invokeAPI("/account/logout", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Log out a customer
     * Logs out a customer.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>403</b> - Forbidden
     * @return UpdateContext200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateContext200Response> logoutCustomer() throws WebClientResponseException {
        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return logoutCustomerRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Log out a customer
     * Logs out a customer.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>403</b> - Forbidden
     * @return ResponseEntity&lt;UpdateContext200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateContext200Response>> logoutCustomerWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return logoutCustomerRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Log out a customer
     * Logs out a customer.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * <p><b>403</b> - Forbidden
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec logoutCustomerWithResponseSpec() throws WebClientResponseException {
        return logoutCustomerRequestCreation();
    }
    /**
     * Register a customer
     * Registers a customer. Used both for normal customers and guest customers.See the Guide \&quot;Register a customer\&quot; for more information on customer registration.
     * <p><b>200</b> - Success
     * @param registerRequest The registerRequest parameter
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerRequestCreation(RegisterRequest registerRequest) throws WebClientResponseException {
        Object postBody = registerRequest;
        // verify the required parameter 'registerRequest' is set
        if (registerRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'registerRequest' when calling register", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/account/register", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Register a customer
     * Registers a customer. Used both for normal customers and guest customers.See the Guide \&quot;Register a customer\&quot; for more information on customer registration.
     * <p><b>200</b> - Success
     * @param registerRequest The registerRequest parameter
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> register(RegisterRequest registerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return registerRequestCreation(registerRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Register a customer
     * Registers a customer. Used both for normal customers and guest customers.See the Guide \&quot;Register a customer\&quot; for more information on customer registration.
     * <p><b>200</b> - Success
     * @param registerRequest The registerRequest parameter
     * @return ResponseEntity&lt;Customer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Customer>> registerWithHttpInfo(RegisterRequest registerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return registerRequestCreation(registerRequest).toEntity(localVarReturnType);
    }

    /**
     * Register a customer
     * Registers a customer. Used both for normal customers and guest customers.See the Guide \&quot;Register a customer\&quot; for more information on customer registration.
     * <p><b>200</b> - Success
     * @param registerRequest The registerRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerWithResponseSpec(RegisterRequest registerRequest) throws WebClientResponseException {
        return registerRequestCreation(registerRequest);
    }
    /**
     * Confirm a customer registration
     * Confirms a customer registration when double opt-in is activated.  Learn more about double opt-in registration in our guide \&quot;Register a customer\&quot;.
     * <p><b>200</b> - Returns the logged in customer. The customer is automatically logged in with the &#x60;sw-context-token&#x60; header provided, which can be reused for subsequent requests.
     * <p><b>404</b> - No hash provided
     * <p><b>412</b> - The customer has already been confirmed
     * @param registerConfirmRequest The registerConfirmRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerConfirmRequestCreation(RegisterConfirmRequest registerConfirmRequest) throws WebClientResponseException {
        Object postBody = registerConfirmRequest;
        // verify the required parameter 'registerConfirmRequest' is set
        if (registerConfirmRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'registerConfirmRequest' when calling registerConfirm", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/account/register-confirm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Confirm a customer registration
     * Confirms a customer registration when double opt-in is activated.  Learn more about double opt-in registration in our guide \&quot;Register a customer\&quot;.
     * <p><b>200</b> - Returns the logged in customer. The customer is automatically logged in with the &#x60;sw-context-token&#x60; header provided, which can be reused for subsequent requests.
     * <p><b>404</b> - No hash provided
     * <p><b>412</b> - The customer has already been confirmed
     * @param registerConfirmRequest The registerConfirmRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> registerConfirm(RegisterConfirmRequest registerConfirmRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return registerConfirmRequestCreation(registerConfirmRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Confirm a customer registration
     * Confirms a customer registration when double opt-in is activated.  Learn more about double opt-in registration in our guide \&quot;Register a customer\&quot;.
     * <p><b>200</b> - Returns the logged in customer. The customer is automatically logged in with the &#x60;sw-context-token&#x60; header provided, which can be reused for subsequent requests.
     * <p><b>404</b> - No hash provided
     * <p><b>412</b> - The customer has already been confirmed
     * @param registerConfirmRequest The registerConfirmRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> registerConfirmWithHttpInfo(RegisterConfirmRequest registerConfirmRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return registerConfirmRequestCreation(registerConfirmRequest).toEntity(localVarReturnType);
    }

    /**
     * Confirm a customer registration
     * Confirms a customer registration when double opt-in is activated.  Learn more about double opt-in registration in our guide \&quot;Register a customer\&quot;.
     * <p><b>200</b> - Returns the logged in customer. The customer is automatically logged in with the &#x60;sw-context-token&#x60; header provided, which can be reused for subsequent requests.
     * <p><b>404</b> - No hash provided
     * <p><b>412</b> - The customer has already been confirmed
     * @param registerConfirmRequest The registerConfirmRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerConfirmWithResponseSpec(RegisterConfirmRequest registerConfirmRequest) throws WebClientResponseException {
        return registerConfirmRequestCreation(registerConfirmRequest);
    }
}
