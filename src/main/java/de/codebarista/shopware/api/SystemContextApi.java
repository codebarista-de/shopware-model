package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.ReadCountry200Response;
import de.codebarista.shopware.model.ReadCountryState200Response;
import de.codebarista.shopware.model.ReadCurrency200Response;
import de.codebarista.shopware.model.ReadLanguages200Response;
import de.codebarista.shopware.model.ReadSalutation200Response;
import de.codebarista.shopware.model.SalesChannelContext;
import de.codebarista.shopware.model.UpdateContext200Response;
import de.codebarista.shopware.model.UpdateContextRequest;
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
public class SystemContextApi {
    private ApiClient apiClient;

    public SystemContextApi() {
        this(new ApiClient());
    }

    @Autowired
    public SystemContextApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Fetch the current context
     * Fetches the current context. This includes for example the &#x60;customerGroup&#x60;, &#x60;currency&#x60;, &#x60;taxRules&#x60; and many more.
     * <p><b>200</b> - Returns the current context.
     * @return SalesChannelContext
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readContextRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<SalesChannelContext> localVarReturnType = new ParameterizedTypeReference<SalesChannelContext>() {};
        return apiClient.invokeAPI("/context", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch the current context
     * Fetches the current context. This includes for example the &#x60;customerGroup&#x60;, &#x60;currency&#x60;, &#x60;taxRules&#x60; and many more.
     * <p><b>200</b> - Returns the current context.
     * @return SalesChannelContext
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SalesChannelContext> readContext() throws WebClientResponseException {
        ParameterizedTypeReference<SalesChannelContext> localVarReturnType = new ParameterizedTypeReference<SalesChannelContext>() {};
        return readContextRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Fetch the current context
     * Fetches the current context. This includes for example the &#x60;customerGroup&#x60;, &#x60;currency&#x60;, &#x60;taxRules&#x60; and many more.
     * <p><b>200</b> - Returns the current context.
     * @return ResponseEntity&lt;SalesChannelContext&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SalesChannelContext>> readContextWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<SalesChannelContext> localVarReturnType = new ParameterizedTypeReference<SalesChannelContext>() {};
        return readContextRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Fetch the current context
     * Fetches the current context. This includes for example the &#x60;customerGroup&#x60;, &#x60;currency&#x60;, &#x60;taxRules&#x60; and many more.
     * <p><b>200</b> - Returns the current context.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readContextWithResponseSpec() throws WebClientResponseException {
        return readContextRequestCreation();
    }
    /**
     * Fetch countries
     * Perform a filtered search for countries
     * <p><b>200</b> - Entity search result containing countries.
     * @param criteria The criteria parameter
     * @return ReadCountry200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCountryRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<ReadCountry200Response> localVarReturnType = new ParameterizedTypeReference<ReadCountry200Response>() {};
        return apiClient.invokeAPI("/country", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch countries
     * Perform a filtered search for countries
     * <p><b>200</b> - Entity search result containing countries.
     * @param criteria The criteria parameter
     * @return ReadCountry200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadCountry200Response> readCountry(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCountry200Response> localVarReturnType = new ParameterizedTypeReference<ReadCountry200Response>() {};
        return readCountryRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch countries
     * Perform a filtered search for countries
     * <p><b>200</b> - Entity search result containing countries.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadCountry200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadCountry200Response>> readCountryWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCountry200Response> localVarReturnType = new ParameterizedTypeReference<ReadCountry200Response>() {};
        return readCountryRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch countries
     * Perform a filtered search for countries
     * <p><b>200</b> - Entity search result containing countries.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCountryWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readCountryRequestCreation(criteria);
    }
    /**
     * Fetch the states of a country
     * Perform a filtered search the states for a country
     * <p><b>200</b> - Entity search result containing countries.
     * @param countryId The countryId parameter
     * @param criteria The criteria parameter
     * @return ReadCountryState200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCountryStateRequestCreation(String countryId, Criteria criteria) throws WebClientResponseException {
        Object postBody = criteria;
        // verify the required parameter 'countryId' is set
        if (countryId == null) {
            throw new WebClientResponseException("Missing the required parameter 'countryId' when calling readCountryState", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("countryId", countryId);

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

        ParameterizedTypeReference<ReadCountryState200Response> localVarReturnType = new ParameterizedTypeReference<ReadCountryState200Response>() {};
        return apiClient.invokeAPI("/country-state/{countryId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch the states of a country
     * Perform a filtered search the states for a country
     * <p><b>200</b> - Entity search result containing countries.
     * @param countryId The countryId parameter
     * @param criteria The criteria parameter
     * @return ReadCountryState200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadCountryState200Response> readCountryState(String countryId, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCountryState200Response> localVarReturnType = new ParameterizedTypeReference<ReadCountryState200Response>() {};
        return readCountryStateRequestCreation(countryId, criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch the states of a country
     * Perform a filtered search the states for a country
     * <p><b>200</b> - Entity search result containing countries.
     * @param countryId The countryId parameter
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadCountryState200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadCountryState200Response>> readCountryStateWithHttpInfo(String countryId, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCountryState200Response> localVarReturnType = new ParameterizedTypeReference<ReadCountryState200Response>() {};
        return readCountryStateRequestCreation(countryId, criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch the states of a country
     * Perform a filtered search the states for a country
     * <p><b>200</b> - Entity search result containing countries.
     * @param countryId The countryId parameter
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCountryStateWithResponseSpec(String countryId, Criteria criteria) throws WebClientResponseException {
        return readCountryStateRequestCreation(countryId, criteria);
    }
    /**
     * Fetch currencies
     * Perform a filtered search for currencies.
     * <p><b>200</b> - Entity search result containing currencies.
     * @param criteria The criteria parameter
     * @return ReadCurrency200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCurrencyRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<ReadCurrency200Response> localVarReturnType = new ParameterizedTypeReference<ReadCurrency200Response>() {};
        return apiClient.invokeAPI("/currency", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch currencies
     * Perform a filtered search for currencies.
     * <p><b>200</b> - Entity search result containing currencies.
     * @param criteria The criteria parameter
     * @return ReadCurrency200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadCurrency200Response> readCurrency(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCurrency200Response> localVarReturnType = new ParameterizedTypeReference<ReadCurrency200Response>() {};
        return readCurrencyRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch currencies
     * Perform a filtered search for currencies.
     * <p><b>200</b> - Entity search result containing currencies.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadCurrency200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadCurrency200Response>> readCurrencyWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCurrency200Response> localVarReturnType = new ParameterizedTypeReference<ReadCurrency200Response>() {};
        return readCurrencyRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch currencies
     * Perform a filtered search for currencies.
     * <p><b>200</b> - Entity search result containing currencies.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCurrencyWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readCurrencyRequestCreation(criteria);
    }
    /**
     * Fetch languages
     * Perform a filtered search for languages.
     * <p><b>200</b> - Entity search result containing languages.
     * @param criteria The criteria parameter
     * @return ReadLanguages200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readLanguagesRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<ReadLanguages200Response> localVarReturnType = new ParameterizedTypeReference<ReadLanguages200Response>() {};
        return apiClient.invokeAPI("/language", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch languages
     * Perform a filtered search for languages.
     * <p><b>200</b> - Entity search result containing languages.
     * @param criteria The criteria parameter
     * @return ReadLanguages200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadLanguages200Response> readLanguages(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadLanguages200Response> localVarReturnType = new ParameterizedTypeReference<ReadLanguages200Response>() {};
        return readLanguagesRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch languages
     * Perform a filtered search for languages.
     * <p><b>200</b> - Entity search result containing languages.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadLanguages200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadLanguages200Response>> readLanguagesWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadLanguages200Response> localVarReturnType = new ParameterizedTypeReference<ReadLanguages200Response>() {};
        return readLanguagesRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch languages
     * Perform a filtered search for languages.
     * <p><b>200</b> - Entity search result containing languages.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readLanguagesWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readLanguagesRequestCreation(criteria);
    }
    /**
     * Fetch salutations
     * Perform a filtered search for salutations.
     * <p><b>200</b> - Entity search result containing salutations.
     * @param criteria The criteria parameter
     * @return ReadSalutation200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readSalutationRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<ReadSalutation200Response> localVarReturnType = new ParameterizedTypeReference<ReadSalutation200Response>() {};
        return apiClient.invokeAPI("/salutation", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch salutations
     * Perform a filtered search for salutations.
     * <p><b>200</b> - Entity search result containing salutations.
     * @param criteria The criteria parameter
     * @return ReadSalutation200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadSalutation200Response> readSalutation(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadSalutation200Response> localVarReturnType = new ParameterizedTypeReference<ReadSalutation200Response>() {};
        return readSalutationRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch salutations
     * Perform a filtered search for salutations.
     * <p><b>200</b> - Entity search result containing salutations.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadSalutation200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadSalutation200Response>> readSalutationWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadSalutation200Response> localVarReturnType = new ParameterizedTypeReference<ReadSalutation200Response>() {};
        return readSalutationRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch salutations
     * Perform a filtered search for salutations.
     * <p><b>200</b> - Entity search result containing salutations.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readSalutationWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readSalutationRequestCreation(criteria);
    }
    /**
     * Modify the current context
     * Used for switching the context. A typical example would be changing the language or changing the currency.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * @param updateContextRequest The updateContextRequest parameter
     * @return UpdateContext200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateContextRequestCreation(UpdateContextRequest updateContextRequest) throws WebClientResponseException {
        Object postBody = updateContextRequest;
        // verify the required parameter 'updateContextRequest' is set
        if (updateContextRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateContextRequest' when calling updateContext", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/context", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Modify the current context
     * Used for switching the context. A typical example would be changing the language or changing the currency.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * @param updateContextRequest The updateContextRequest parameter
     * @return UpdateContext200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateContext200Response> updateContext(UpdateContextRequest updateContextRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return updateContextRequestCreation(updateContextRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Modify the current context
     * Used for switching the context. A typical example would be changing the language or changing the currency.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * @param updateContextRequest The updateContextRequest parameter
     * @return ResponseEntity&lt;UpdateContext200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateContext200Response>> updateContextWithHttpInfo(UpdateContextRequest updateContextRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateContext200Response> localVarReturnType = new ParameterizedTypeReference<UpdateContext200Response>() {};
        return updateContextRequestCreation(updateContextRequest).toEntity(localVarReturnType);
    }

    /**
     * Modify the current context
     * Used for switching the context. A typical example would be changing the language or changing the currency.
     * <p><b>200</b> - Returns the context token. Use that as your &#x60;sw-context-token&#x60; header for subsequent requests. Redirect if getRedirectUrl is set.
     * @param updateContextRequest The updateContextRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateContextWithResponseSpec(UpdateContextRequest updateContextRequest) throws WebClientResponseException {
        return updateContextRequestCreation(updateContextRequest);
    }
}
