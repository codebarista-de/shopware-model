package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.AccountNewsletterRecipientResult;
import de.codebarista.shopware.model.ChangeEmailRequest;
import de.codebarista.shopware.model.ChangeLanguageRequest;
import de.codebarista.shopware.model.ChangePasswordRequest;
import de.codebarista.shopware.model.ChangeProfileRequest;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.Customer;
import de.codebarista.shopware.model.GetCustomerRecoveryIsExpiredRequest;
import de.codebarista.shopware.model.RecoveryPasswordRequest;
import de.codebarista.shopware.model.SendRecoveryMailRequest;
import de.codebarista.shopware.model.Struct;
import de.codebarista.shopware.model.SuccessResponse;
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
public class ProfileApi {
    private ApiClient apiClient;

    public ProfileApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Change the customer&#39;s email address
     * Changes a customer&#39;s email address to a new email address, using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeEmailRequest The changeEmailRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec changeEmailRequestCreation(ChangeEmailRequest changeEmailRequest) throws WebClientResponseException {
        Object postBody = changeEmailRequest;
        // verify the required parameter 'changeEmailRequest' is set
        if (changeEmailRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'changeEmailRequest' when calling changeEmail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/change-email", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change the customer&#39;s email address
     * Changes a customer&#39;s email address to a new email address, using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeEmailRequest The changeEmailRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> changeEmail(ChangeEmailRequest changeEmailRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changeEmailRequestCreation(changeEmailRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Change the customer&#39;s email address
     * Changes a customer&#39;s email address to a new email address, using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeEmailRequest The changeEmailRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> changeEmailWithHttpInfo(ChangeEmailRequest changeEmailRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changeEmailRequestCreation(changeEmailRequest).toEntity(localVarReturnType);
    }

    /**
     * Change the customer&#39;s email address
     * Changes a customer&#39;s email address to a new email address, using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeEmailRequest The changeEmailRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec changeEmailWithResponseSpec(ChangeEmailRequest changeEmailRequest) throws WebClientResponseException {
        return changeEmailRequestCreation(changeEmailRequest);
    }
    /**
     * Change the customer&#39;s language.
     * Changes the language of the logged in customer
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeLanguageRequest The changeLanguageRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec changeLanguageRequestCreation(ChangeLanguageRequest changeLanguageRequest) throws WebClientResponseException {
        Object postBody = changeLanguageRequest;
        // verify the required parameter 'changeLanguageRequest' is set
        if (changeLanguageRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'changeLanguageRequest' when calling changeLanguage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/change-language", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change the customer&#39;s language.
     * Changes the language of the logged in customer
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeLanguageRequest The changeLanguageRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> changeLanguage(ChangeLanguageRequest changeLanguageRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changeLanguageRequestCreation(changeLanguageRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Change the customer&#39;s language.
     * Changes the language of the logged in customer
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeLanguageRequest The changeLanguageRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> changeLanguageWithHttpInfo(ChangeLanguageRequest changeLanguageRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changeLanguageRequestCreation(changeLanguageRequest).toEntity(localVarReturnType);
    }

    /**
     * Change the customer&#39;s language.
     * Changes the language of the logged in customer
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeLanguageRequest The changeLanguageRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec changeLanguageWithResponseSpec(ChangeLanguageRequest changeLanguageRequest) throws WebClientResponseException {
        return changeLanguageRequestCreation(changeLanguageRequest);
    }
    /**
     * Change the customer&#39;s password
     * Changes a customer&#39;s password using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param changePasswordRequest The changePasswordRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec changePasswordRequestCreation(ChangePasswordRequest changePasswordRequest) throws WebClientResponseException {
        Object postBody = changePasswordRequest;
        // verify the required parameter 'changePasswordRequest' is set
        if (changePasswordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'changePasswordRequest' when calling changePassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/change-password", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change the customer&#39;s password
     * Changes a customer&#39;s password using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param changePasswordRequest The changePasswordRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> changePassword(ChangePasswordRequest changePasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changePasswordRequestCreation(changePasswordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Change the customer&#39;s password
     * Changes a customer&#39;s password using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param changePasswordRequest The changePasswordRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> changePasswordWithHttpInfo(ChangePasswordRequest changePasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changePasswordRequestCreation(changePasswordRequest).toEntity(localVarReturnType);
    }

    /**
     * Change the customer&#39;s password
     * Changes a customer&#39;s password using their current password as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param changePasswordRequest The changePasswordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec changePasswordWithResponseSpec(ChangePasswordRequest changePasswordRequest) throws WebClientResponseException {
        return changePasswordRequestCreation(changePasswordRequest);
    }
    /**
     * Change the customer&#39;s default payment method
     * Changes a customer&#39;s default (preselected) payment method.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param paymentMethodId Identifier of the desired default payment method
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec changePaymentMethodRequestCreation(String paymentMethodId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'paymentMethodId' is set
        if (paymentMethodId == null) {
            throw new WebClientResponseException("Missing the required parameter 'paymentMethodId' when calling changePaymentMethod", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("paymentMethodId", paymentMethodId);

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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/change-payment-method/{paymentMethodId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change the customer&#39;s default payment method
     * Changes a customer&#39;s default (preselected) payment method.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param paymentMethodId Identifier of the desired default payment method
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> changePaymentMethod(String paymentMethodId) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changePaymentMethodRequestCreation(paymentMethodId).bodyToMono(localVarReturnType);
    }

    /**
     * Change the customer&#39;s default payment method
     * Changes a customer&#39;s default (preselected) payment method.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param paymentMethodId Identifier of the desired default payment method
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> changePaymentMethodWithHttpInfo(String paymentMethodId) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changePaymentMethodRequestCreation(paymentMethodId).toEntity(localVarReturnType);
    }

    /**
     * Change the customer&#39;s default payment method
     * Changes a customer&#39;s default (preselected) payment method.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param paymentMethodId Identifier of the desired default payment method
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec changePaymentMethodWithResponseSpec(String paymentMethodId) throws WebClientResponseException {
        return changePaymentMethodRequestCreation(paymentMethodId);
    }
    /**
     * Change the customer&#39;s information
     * Make changes to a customer&#39;s account, like changing their name, salutation or title.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeProfileRequest The changeProfileRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec changeProfileRequestCreation(ChangeProfileRequest changeProfileRequest) throws WebClientResponseException {
        Object postBody = changeProfileRequest;
        // verify the required parameter 'changeProfileRequest' is set
        if (changeProfileRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'changeProfileRequest' when calling changeProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/change-profile", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change the customer&#39;s information
     * Make changes to a customer&#39;s account, like changing their name, salutation or title.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeProfileRequest The changeProfileRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> changeProfile(ChangeProfileRequest changeProfileRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changeProfileRequestCreation(changeProfileRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Change the customer&#39;s information
     * Make changes to a customer&#39;s account, like changing their name, salutation or title.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeProfileRequest The changeProfileRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> changeProfileWithHttpInfo(ChangeProfileRequest changeProfileRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return changeProfileRequestCreation(changeProfileRequest).toEntity(localVarReturnType);
    }

    /**
     * Change the customer&#39;s information
     * Make changes to a customer&#39;s account, like changing their name, salutation or title.
     * <p><b>200</b> - Returns a success response indicating a successful update
     * @param changeProfileRequest The changeProfileRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec changeProfileWithResponseSpec(ChangeProfileRequest changeProfileRequest) throws WebClientResponseException {
        return changeProfileRequestCreation(changeProfileRequest);
    }
    /**
     * Delete the customer&#39;s profile
     * Deletes a customer profile along with their addresses, wishlists and associated data. Created orders and their payment/shipping information (addresses) and reviews are not deleted.
     * <p><b>204</b> - Returns a no content response indicating a successful removal of the customer profile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCustomerRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        return apiClient.invokeAPI("/account/customer", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the customer&#39;s profile
     * Deletes a customer profile along with their addresses, wishlists and associated data. Created orders and their payment/shipping information (addresses) and reviews are not deleted.
     * <p><b>204</b> - Returns a no content response indicating a successful removal of the customer profile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCustomer() throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteCustomerRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Delete the customer&#39;s profile
     * Deletes a customer profile along with their addresses, wishlists and associated data. Created orders and their payment/shipping information (addresses) and reviews are not deleted.
     * <p><b>204</b> - Returns a no content response indicating a successful removal of the customer profile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteCustomerWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteCustomerRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Delete the customer&#39;s profile
     * Deletes a customer profile along with their addresses, wishlists and associated data. Created orders and their payment/shipping information (addresses) and reviews are not deleted.
     * <p><b>204</b> - Returns a no content response indicating a successful removal of the customer profile
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCustomerWithResponseSpec() throws WebClientResponseException {
        return deleteCustomerRequestCreation();
    }
    /**
     * Checks if the customer recovery entry for a given hash is expired.
     * This can be used to validate a provided hash has a valid and not expired customer recovery hash.
     * <p><b>200</b> - Returns a CustomerRecoveryIsExpiredResponse that indicates if the hash is expired or not.
     * @param getCustomerRecoveryIsExpiredRequest The getCustomerRecoveryIsExpiredRequest parameter
     * @return Struct
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCustomerRecoveryIsExpiredRequestCreation(GetCustomerRecoveryIsExpiredRequest getCustomerRecoveryIsExpiredRequest) throws WebClientResponseException {
        Object postBody = getCustomerRecoveryIsExpiredRequest;
        // verify the required parameter 'getCustomerRecoveryIsExpiredRequest' is set
        if (getCustomerRecoveryIsExpiredRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'getCustomerRecoveryIsExpiredRequest' when calling getCustomerRecoveryIsExpired", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Struct> localVarReturnType = new ParameterizedTypeReference<Struct>() {};
        return apiClient.invokeAPI("/account/customer-recovery-is-expired", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Checks if the customer recovery entry for a given hash is expired.
     * This can be used to validate a provided hash has a valid and not expired customer recovery hash.
     * <p><b>200</b> - Returns a CustomerRecoveryIsExpiredResponse that indicates if the hash is expired or not.
     * @param getCustomerRecoveryIsExpiredRequest The getCustomerRecoveryIsExpiredRequest parameter
     * @return Struct
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Struct> getCustomerRecoveryIsExpired(GetCustomerRecoveryIsExpiredRequest getCustomerRecoveryIsExpiredRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Struct> localVarReturnType = new ParameterizedTypeReference<Struct>() {};
        return getCustomerRecoveryIsExpiredRequestCreation(getCustomerRecoveryIsExpiredRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Checks if the customer recovery entry for a given hash is expired.
     * This can be used to validate a provided hash has a valid and not expired customer recovery hash.
     * <p><b>200</b> - Returns a CustomerRecoveryIsExpiredResponse that indicates if the hash is expired or not.
     * @param getCustomerRecoveryIsExpiredRequest The getCustomerRecoveryIsExpiredRequest parameter
     * @return ResponseEntity&lt;Struct&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Struct>> getCustomerRecoveryIsExpiredWithHttpInfo(GetCustomerRecoveryIsExpiredRequest getCustomerRecoveryIsExpiredRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Struct> localVarReturnType = new ParameterizedTypeReference<Struct>() {};
        return getCustomerRecoveryIsExpiredRequestCreation(getCustomerRecoveryIsExpiredRequest).toEntity(localVarReturnType);
    }

    /**
     * Checks if the customer recovery entry for a given hash is expired.
     * This can be used to validate a provided hash has a valid and not expired customer recovery hash.
     * <p><b>200</b> - Returns a CustomerRecoveryIsExpiredResponse that indicates if the hash is expired or not.
     * @param getCustomerRecoveryIsExpiredRequest The getCustomerRecoveryIsExpiredRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCustomerRecoveryIsExpiredWithResponseSpec(GetCustomerRecoveryIsExpiredRequest getCustomerRecoveryIsExpiredRequest) throws WebClientResponseException {
        return getCustomerRecoveryIsExpiredRequestCreation(getCustomerRecoveryIsExpiredRequest);
    }
    /**
     * Get information about current customer
     * Returns information about the current customer.
     * <p><b>200</b> - Returns the logged in customer, also for guest sessions. Check for the value of &#x60;guest&#x60; field to see whether the customer is a guest.
     * @param criteria The criteria parameter
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCustomerRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/account/customer", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get information about current customer
     * Returns information about the current customer.
     * <p><b>200</b> - Returns the logged in customer, also for guest sessions. Check for the value of &#x60;guest&#x60; field to see whether the customer is a guest.
     * @param criteria The criteria parameter
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> readCustomer(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return readCustomerRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Get information about current customer
     * Returns information about the current customer.
     * <p><b>200</b> - Returns the logged in customer, also for guest sessions. Check for the value of &#x60;guest&#x60; field to see whether the customer is a guest.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;Customer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Customer>> readCustomerWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return readCustomerRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Get information about current customer
     * Returns information about the current customer.
     * <p><b>200</b> - Returns the logged in customer, also for guest sessions. Check for the value of &#x60;guest&#x60; field to see whether the customer is a guest.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCustomerWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readCustomerRequestCreation(criteria);
    }
    /**
     * Fetch newsletter recipients
     * Perform a filtered search for newsletter recipients.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return List&lt;AccountNewsletterRecipientResult&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readNewsletterRecipientRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<AccountNewsletterRecipientResult> localVarReturnType = new ParameterizedTypeReference<AccountNewsletterRecipientResult>() {};
        return apiClient.invokeAPI("/account/newsletter-recipient", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch newsletter recipients
     * Perform a filtered search for newsletter recipients.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return List&lt;AccountNewsletterRecipientResult&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<AccountNewsletterRecipientResult> readNewsletterRecipient(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<AccountNewsletterRecipientResult> localVarReturnType = new ParameterizedTypeReference<AccountNewsletterRecipientResult>() {};
        return readNewsletterRecipientRequestCreation(criteria).bodyToFlux(localVarReturnType);
    }

    /**
     * Fetch newsletter recipients
     * Perform a filtered search for newsletter recipients.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;List&lt;AccountNewsletterRecipientResult&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<AccountNewsletterRecipientResult>>> readNewsletterRecipientWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<AccountNewsletterRecipientResult> localVarReturnType = new ParameterizedTypeReference<AccountNewsletterRecipientResult>() {};
        return readNewsletterRecipientRequestCreation(criteria).toEntityList(localVarReturnType);
    }

    /**
     * Fetch newsletter recipients
     * Perform a filtered search for newsletter recipients.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readNewsletterRecipientWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readNewsletterRecipientRequestCreation(criteria);
    }
    /**
     * Reset a password with recovery credentials
     * This operation is Step 2 of the password reset flow. It is required to conduct Step 1 \&quot;Send a password recovery mail\&quot; in order to obtain the required credentials for this step.Resets a customer&#39;s password using credentials from a password recovery mail as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param recoveryPasswordRequest The recoveryPasswordRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recoveryPasswordRequestCreation(RecoveryPasswordRequest recoveryPasswordRequest) throws WebClientResponseException {
        Object postBody = recoveryPasswordRequest;
        // verify the required parameter 'recoveryPasswordRequest' is set
        if (recoveryPasswordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'recoveryPasswordRequest' when calling recoveryPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/recovery-password-confirm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset a password with recovery credentials
     * This operation is Step 2 of the password reset flow. It is required to conduct Step 1 \&quot;Send a password recovery mail\&quot; in order to obtain the required credentials for this step.Resets a customer&#39;s password using credentials from a password recovery mail as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param recoveryPasswordRequest The recoveryPasswordRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> recoveryPassword(RecoveryPasswordRequest recoveryPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return recoveryPasswordRequestCreation(recoveryPasswordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reset a password with recovery credentials
     * This operation is Step 2 of the password reset flow. It is required to conduct Step 1 \&quot;Send a password recovery mail\&quot; in order to obtain the required credentials for this step.Resets a customer&#39;s password using credentials from a password recovery mail as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param recoveryPasswordRequest The recoveryPasswordRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> recoveryPasswordWithHttpInfo(RecoveryPasswordRequest recoveryPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return recoveryPasswordRequestCreation(recoveryPasswordRequest).toEntity(localVarReturnType);
    }

    /**
     * Reset a password with recovery credentials
     * This operation is Step 2 of the password reset flow. It is required to conduct Step 1 \&quot;Send a password recovery mail\&quot; in order to obtain the required credentials for this step.Resets a customer&#39;s password using credentials from a password recovery mail as a validation.
     * <p><b>200</b> - Returns a success response indicating a successful update.
     * @param recoveryPasswordRequest The recoveryPasswordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec recoveryPasswordWithResponseSpec(RecoveryPasswordRequest recoveryPasswordRequest) throws WebClientResponseException {
        return recoveryPasswordRequestCreation(recoveryPasswordRequest);
    }
    /**
     * Send a password recovery mail
     * This operation is Step 1 of the password reset flow. Make sure to implement Step 2 \&quot;Reset password with recovery credentials\&quot; in order to allow for the complete flow in your application. Sends a recovery mail containing a link with credentials that allows a customer to reset their password.
     * <p><b>200</b> - If email corresponds to an existing customer, a mail will be sent out to that customer containing a link assembled using the following schema:  Returns a success indicating a successful initialisation of the reset flow.
     * @param sendRecoveryMailRequest The sendRecoveryMailRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec sendRecoveryMailRequestCreation(SendRecoveryMailRequest sendRecoveryMailRequest) throws WebClientResponseException {
        Object postBody = sendRecoveryMailRequest;
        // verify the required parameter 'sendRecoveryMailRequest' is set
        if (sendRecoveryMailRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'sendRecoveryMailRequest' when calling sendRecoveryMail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/account/recovery-password", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Send a password recovery mail
     * This operation is Step 1 of the password reset flow. Make sure to implement Step 2 \&quot;Reset password with recovery credentials\&quot; in order to allow for the complete flow in your application. Sends a recovery mail containing a link with credentials that allows a customer to reset their password.
     * <p><b>200</b> - If email corresponds to an existing customer, a mail will be sent out to that customer containing a link assembled using the following schema:  Returns a success indicating a successful initialisation of the reset flow.
     * @param sendRecoveryMailRequest The sendRecoveryMailRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> sendRecoveryMail(SendRecoveryMailRequest sendRecoveryMailRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return sendRecoveryMailRequestCreation(sendRecoveryMailRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Send a password recovery mail
     * This operation is Step 1 of the password reset flow. Make sure to implement Step 2 \&quot;Reset password with recovery credentials\&quot; in order to allow for the complete flow in your application. Sends a recovery mail containing a link with credentials that allows a customer to reset their password.
     * <p><b>200</b> - If email corresponds to an existing customer, a mail will be sent out to that customer containing a link assembled using the following schema:  Returns a success indicating a successful initialisation of the reset flow.
     * @param sendRecoveryMailRequest The sendRecoveryMailRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> sendRecoveryMailWithHttpInfo(SendRecoveryMailRequest sendRecoveryMailRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return sendRecoveryMailRequestCreation(sendRecoveryMailRequest).toEntity(localVarReturnType);
    }

    /**
     * Send a password recovery mail
     * This operation is Step 1 of the password reset flow. Make sure to implement Step 2 \&quot;Reset password with recovery credentials\&quot; in order to allow for the complete flow in your application. Sends a recovery mail containing a link with credentials that allows a customer to reset their password.
     * <p><b>200</b> - If email corresponds to an existing customer, a mail will be sent out to that customer containing a link assembled using the following schema:  Returns a success indicating a successful initialisation of the reset flow.
     * @param sendRecoveryMailRequest The sendRecoveryMailRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec sendRecoveryMailWithResponseSpec(SendRecoveryMailRequest sendRecoveryMailRequest) throws WebClientResponseException {
        return sendRecoveryMailRequestCreation(sendRecoveryMailRequest);
    }
}
