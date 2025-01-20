package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.AccountNewsletterRecipientResult;
import de.codebarista.shopware.model.ConfirmNewsletterRequest;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.SubscribeToNewsletterRequest;
import de.codebarista.shopware.model.UnsubscribeToNewsletterRequest;
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
public class NewsletterApi {
    private ApiClient apiClient;

    public NewsletterApi() {
        this(new ApiClient());
    }

    @Autowired
    public NewsletterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Confirm a newsletter registration
     * You have to use the hash from the link sent out via email to confirm the user registration.
     * <p><b>200</b> - The newsletter confirmation was successful.
     * @param confirmNewsletterRequest The confirmNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec confirmNewsletterRequestCreation(ConfirmNewsletterRequest confirmNewsletterRequest) throws WebClientResponseException {
        Object postBody = confirmNewsletterRequest;
        // verify the required parameter 'confirmNewsletterRequest' is set
        if (confirmNewsletterRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'confirmNewsletterRequest' when calling confirmNewsletter", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/newsletter/confirm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Confirm a newsletter registration
     * You have to use the hash from the link sent out via email to confirm the user registration.
     * <p><b>200</b> - The newsletter confirmation was successful.
     * @param confirmNewsletterRequest The confirmNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> confirmNewsletter(ConfirmNewsletterRequest confirmNewsletterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return confirmNewsletterRequestCreation(confirmNewsletterRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Confirm a newsletter registration
     * You have to use the hash from the link sent out via email to confirm the user registration.
     * <p><b>200</b> - The newsletter confirmation was successful.
     * @param confirmNewsletterRequest The confirmNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> confirmNewsletterWithHttpInfo(ConfirmNewsletterRequest confirmNewsletterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return confirmNewsletterRequestCreation(confirmNewsletterRequest).toEntity(localVarReturnType);
    }

    /**
     * Confirm a newsletter registration
     * You have to use the hash from the link sent out via email to confirm the user registration.
     * <p><b>200</b> - The newsletter confirmation was successful.
     * @param confirmNewsletterRequest The confirmNewsletterRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec confirmNewsletterWithResponseSpec(ConfirmNewsletterRequest confirmNewsletterRequest) throws WebClientResponseException {
        return confirmNewsletterRequestCreation(confirmNewsletterRequest);
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
     * Create or remove a newsletter subscription
     * This route is used to create/remove/confirm a newsletter subscription.  The &#x60;option&#x60; property controls what should happen: * &#x60;direct&#x60;: The subscription is directly active and does not need a confirmation. * &#x60;subscribe&#x60;: An email will be send to the provided email addrees containing a link to the /newsletter/confirm route. The subscription is only successful, if the /newsletter/confirm route is called with the generated hashes. * &#x60;unsubscribe&#x60;: The email address will be removed from the newsletter subscriptions. * &#x60;confirmSubscribe&#x60;: Confirmes the newsletter subscription for the provided email address.
     * <p><b>200</b> - Success
     * @param subscribeToNewsletterRequest The subscribeToNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec subscribeToNewsletterRequestCreation(SubscribeToNewsletterRequest subscribeToNewsletterRequest) throws WebClientResponseException {
        Object postBody = subscribeToNewsletterRequest;
        // verify the required parameter 'subscribeToNewsletterRequest' is set
        if (subscribeToNewsletterRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'subscribeToNewsletterRequest' when calling subscribeToNewsletter", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/newsletter/subscribe", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create or remove a newsletter subscription
     * This route is used to create/remove/confirm a newsletter subscription.  The &#x60;option&#x60; property controls what should happen: * &#x60;direct&#x60;: The subscription is directly active and does not need a confirmation. * &#x60;subscribe&#x60;: An email will be send to the provided email addrees containing a link to the /newsletter/confirm route. The subscription is only successful, if the /newsletter/confirm route is called with the generated hashes. * &#x60;unsubscribe&#x60;: The email address will be removed from the newsletter subscriptions. * &#x60;confirmSubscribe&#x60;: Confirmes the newsletter subscription for the provided email address.
     * <p><b>200</b> - Success
     * @param subscribeToNewsletterRequest The subscribeToNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> subscribeToNewsletter(SubscribeToNewsletterRequest subscribeToNewsletterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return subscribeToNewsletterRequestCreation(subscribeToNewsletterRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create or remove a newsletter subscription
     * This route is used to create/remove/confirm a newsletter subscription.  The &#x60;option&#x60; property controls what should happen: * &#x60;direct&#x60;: The subscription is directly active and does not need a confirmation. * &#x60;subscribe&#x60;: An email will be send to the provided email addrees containing a link to the /newsletter/confirm route. The subscription is only successful, if the /newsletter/confirm route is called with the generated hashes. * &#x60;unsubscribe&#x60;: The email address will be removed from the newsletter subscriptions. * &#x60;confirmSubscribe&#x60;: Confirmes the newsletter subscription for the provided email address.
     * <p><b>200</b> - Success
     * @param subscribeToNewsletterRequest The subscribeToNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> subscribeToNewsletterWithHttpInfo(SubscribeToNewsletterRequest subscribeToNewsletterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return subscribeToNewsletterRequestCreation(subscribeToNewsletterRequest).toEntity(localVarReturnType);
    }

    /**
     * Create or remove a newsletter subscription
     * This route is used to create/remove/confirm a newsletter subscription.  The &#x60;option&#x60; property controls what should happen: * &#x60;direct&#x60;: The subscription is directly active and does not need a confirmation. * &#x60;subscribe&#x60;: An email will be send to the provided email addrees containing a link to the /newsletter/confirm route. The subscription is only successful, if the /newsletter/confirm route is called with the generated hashes. * &#x60;unsubscribe&#x60;: The email address will be removed from the newsletter subscriptions. * &#x60;confirmSubscribe&#x60;: Confirmes the newsletter subscription for the provided email address.
     * <p><b>200</b> - Success
     * @param subscribeToNewsletterRequest The subscribeToNewsletterRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec subscribeToNewsletterWithResponseSpec(SubscribeToNewsletterRequest subscribeToNewsletterRequest) throws WebClientResponseException {
        return subscribeToNewsletterRequestCreation(subscribeToNewsletterRequest);
    }
    /**
     * Remove a newsletter subscription
     * Removes a newsletter recipient from the mailing lists.
     * <p><b>200</b> - Unsubscribing was successful.
     * @param unsubscribeToNewsletterRequest The unsubscribeToNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec unsubscribeToNewsletterRequestCreation(UnsubscribeToNewsletterRequest unsubscribeToNewsletterRequest) throws WebClientResponseException {
        Object postBody = unsubscribeToNewsletterRequest;
        // verify the required parameter 'unsubscribeToNewsletterRequest' is set
        if (unsubscribeToNewsletterRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'unsubscribeToNewsletterRequest' when calling unsubscribeToNewsletter", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/newsletter/unsubscribe", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a newsletter subscription
     * Removes a newsletter recipient from the mailing lists.
     * <p><b>200</b> - Unsubscribing was successful.
     * @param unsubscribeToNewsletterRequest The unsubscribeToNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> unsubscribeToNewsletter(UnsubscribeToNewsletterRequest unsubscribeToNewsletterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return unsubscribeToNewsletterRequestCreation(unsubscribeToNewsletterRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Remove a newsletter subscription
     * Removes a newsletter recipient from the mailing lists.
     * <p><b>200</b> - Unsubscribing was successful.
     * @param unsubscribeToNewsletterRequest The unsubscribeToNewsletterRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> unsubscribeToNewsletterWithHttpInfo(UnsubscribeToNewsletterRequest unsubscribeToNewsletterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return unsubscribeToNewsletterRequestCreation(unsubscribeToNewsletterRequest).toEntity(localVarReturnType);
    }

    /**
     * Remove a newsletter subscription
     * Removes a newsletter recipient from the mailing lists.
     * <p><b>200</b> - Unsubscribing was successful.
     * @param unsubscribeToNewsletterRequest The unsubscribeToNewsletterRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec unsubscribeToNewsletterWithResponseSpec(UnsubscribeToNewsletterRequest unsubscribeToNewsletterRequest) throws WebClientResponseException {
        return unsubscribeToNewsletterRequestCreation(unsubscribeToNewsletterRequest);
    }
}
