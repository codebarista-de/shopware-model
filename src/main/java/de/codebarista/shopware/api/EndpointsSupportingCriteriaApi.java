package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.AccountNewsletterRecipientResult;
import de.codebarista.shopware.model.Category;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.Customer;
import de.codebarista.shopware.model.CustomerAddress;
import de.codebarista.shopware.model.Document;
import de.codebarista.shopware.model.LandingPage;
import de.codebarista.shopware.model.OrderRouteResponse;
import de.codebarista.shopware.model.ReadCategoryList200Response;
import de.codebarista.shopware.model.ReadCategoryRequest;
import de.codebarista.shopware.model.ReadCountry200Response;
import de.codebarista.shopware.model.ReadCountryState200Response;
import de.codebarista.shopware.model.ReadCurrency200Response;
import de.codebarista.shopware.model.ReadLandingPageRequest;
import de.codebarista.shopware.model.ReadLanguages200Response;
import de.codebarista.shopware.model.ReadNavigationRequest;
import de.codebarista.shopware.model.ReadOrderRequest;
import de.codebarista.shopware.model.ReadPaymentMethod200Response;
import de.codebarista.shopware.model.ReadPaymentMethodRequest;
import de.codebarista.shopware.model.ReadProduct200Response;
import de.codebarista.shopware.model.ReadProductReviews200Response;
import de.codebarista.shopware.model.ReadSalutation200Response;
import de.codebarista.shopware.model.ReadSeoUrl200Response;
import de.codebarista.shopware.model.ReadShippingMethod200Response;
import de.codebarista.shopware.model.WishlistLoadRouteResponse;
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
public class EndpointsSupportingCriteriaApi {
    private ApiClient apiClient;

    public EndpointsSupportingCriteriaApi() {
        this(new ApiClient());
    }

    @Autowired
    public EndpointsSupportingCriteriaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Download generated document
     * Returns blob file of a generated document to download.
     * <p><b>200</b> - Returns the document information and blob to download.
     * @param documentId The documentId parameter
     * @param deepLinkCode The deepLinkCode parameter
     * @param criteria The criteria parameter
     * @return Document
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec downloadRequestCreation(String documentId, String deepLinkCode, Criteria criteria) throws WebClientResponseException {
        Object postBody = criteria;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling download", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'deepLinkCode' is set
        if (deepLinkCode == null) {
            throw new WebClientResponseException("Missing the required parameter 'deepLinkCode' when calling download", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("documentId", documentId);
        pathParams.put("deepLinkCode", deepLinkCode);

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

        ParameterizedTypeReference<Document> localVarReturnType = new ParameterizedTypeReference<Document>() {};
        return apiClient.invokeAPI("/document/download/{documentId}/{deepLinkCode}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Download generated document
     * Returns blob file of a generated document to download.
     * <p><b>200</b> - Returns the document information and blob to download.
     * @param documentId The documentId parameter
     * @param deepLinkCode The deepLinkCode parameter
     * @param criteria The criteria parameter
     * @return Document
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Document> download(String documentId, String deepLinkCode, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<Document> localVarReturnType = new ParameterizedTypeReference<Document>() {};
        return downloadRequestCreation(documentId, deepLinkCode, criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Download generated document
     * Returns blob file of a generated document to download.
     * <p><b>200</b> - Returns the document information and blob to download.
     * @param documentId The documentId parameter
     * @param deepLinkCode The deepLinkCode parameter
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;Document&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Document>> downloadWithHttpInfo(String documentId, String deepLinkCode, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<Document> localVarReturnType = new ParameterizedTypeReference<Document>() {};
        return downloadRequestCreation(documentId, deepLinkCode, criteria).toEntity(localVarReturnType);
    }

    /**
     * Download generated document
     * Returns blob file of a generated document to download.
     * <p><b>200</b> - Returns the document information and blob to download.
     * @param documentId The documentId parameter
     * @param deepLinkCode The deepLinkCode parameter
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec downloadWithResponseSpec(String documentId, String deepLinkCode, Criteria criteria) throws WebClientResponseException {
        return downloadRequestCreation(documentId, deepLinkCode, criteria);
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
     * Fetch a single category
     * This endpoint returns information about the category, as well as a fully resolved (hydrated with mapping values) CMS page, if one is assigned to the category. You can pass slots which should be resolved exclusively.
     * <p><b>200</b> - The loaded category with cms page
     * @param navigationId Identifier of the category to be fetched
     * @param slots Resolves only the given slot identifiers. The identifiers have to be seperated by a &#39;|&#39; character
     * @param readCategoryRequest The readCategoryRequest parameter
     * @return Category
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCategoryRequestCreation(String navigationId, String slots, ReadCategoryRequest readCategoryRequest) throws WebClientResponseException {
        Object postBody = readCategoryRequest;
        // verify the required parameter 'navigationId' is set
        if (navigationId == null) {
            throw new WebClientResponseException("Missing the required parameter 'navigationId' when calling readCategory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("navigationId", navigationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "slots", slots));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Category> localVarReturnType = new ParameterizedTypeReference<Category>() {};
        return apiClient.invokeAPI("/category/{navigationId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a single category
     * This endpoint returns information about the category, as well as a fully resolved (hydrated with mapping values) CMS page, if one is assigned to the category. You can pass slots which should be resolved exclusively.
     * <p><b>200</b> - The loaded category with cms page
     * @param navigationId Identifier of the category to be fetched
     * @param slots Resolves only the given slot identifiers. The identifiers have to be seperated by a &#39;|&#39; character
     * @param readCategoryRequest The readCategoryRequest parameter
     * @return Category
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Category> readCategory(String navigationId, String slots, ReadCategoryRequest readCategoryRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Category> localVarReturnType = new ParameterizedTypeReference<Category>() {};
        return readCategoryRequestCreation(navigationId, slots, readCategoryRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a single category
     * This endpoint returns information about the category, as well as a fully resolved (hydrated with mapping values) CMS page, if one is assigned to the category. You can pass slots which should be resolved exclusively.
     * <p><b>200</b> - The loaded category with cms page
     * @param navigationId Identifier of the category to be fetched
     * @param slots Resolves only the given slot identifiers. The identifiers have to be seperated by a &#39;|&#39; character
     * @param readCategoryRequest The readCategoryRequest parameter
     * @return ResponseEntity&lt;Category&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Category>> readCategoryWithHttpInfo(String navigationId, String slots, ReadCategoryRequest readCategoryRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Category> localVarReturnType = new ParameterizedTypeReference<Category>() {};
        return readCategoryRequestCreation(navigationId, slots, readCategoryRequest).toEntity(localVarReturnType);
    }

    /**
     * Fetch a single category
     * This endpoint returns information about the category, as well as a fully resolved (hydrated with mapping values) CMS page, if one is assigned to the category. You can pass slots which should be resolved exclusively.
     * <p><b>200</b> - The loaded category with cms page
     * @param navigationId Identifier of the category to be fetched
     * @param slots Resolves only the given slot identifiers. The identifiers have to be seperated by a &#39;|&#39; character
     * @param readCategoryRequest The readCategoryRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCategoryWithResponseSpec(String navigationId, String slots, ReadCategoryRequest readCategoryRequest) throws WebClientResponseException {
        return readCategoryRequestCreation(navigationId, slots, readCategoryRequest);
    }
    /**
     * Fetch a list of categories
     * Perform a filtered search for categories.
     * <p><b>200</b> - Entity search result containing categories.
     * @param criteria The criteria parameter
     * @return ReadCategoryList200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCategoryListRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<ReadCategoryList200Response> localVarReturnType = new ParameterizedTypeReference<ReadCategoryList200Response>() {};
        return apiClient.invokeAPI("/category", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a list of categories
     * Perform a filtered search for categories.
     * <p><b>200</b> - Entity search result containing categories.
     * @param criteria The criteria parameter
     * @return ReadCategoryList200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadCategoryList200Response> readCategoryList(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCategoryList200Response> localVarReturnType = new ParameterizedTypeReference<ReadCategoryList200Response>() {};
        return readCategoryListRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a list of categories
     * Perform a filtered search for categories.
     * <p><b>200</b> - Entity search result containing categories.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadCategoryList200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadCategoryList200Response>> readCategoryListWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadCategoryList200Response> localVarReturnType = new ParameterizedTypeReference<ReadCategoryList200Response>() {};
        return readCategoryListRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch a list of categories
     * Perform a filtered search for categories.
     * <p><b>200</b> - Entity search result containing categories.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCategoryListWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readCategoryListRequestCreation(criteria);
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
     * Fetch a wishlist
     * Fetch a customer&#39;s wishlist. Products on the wishlist can be filtered using a criteria object.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return WishlistLoadRouteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCustomerWishlistRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<WishlistLoadRouteResponse> localVarReturnType = new ParameterizedTypeReference<WishlistLoadRouteResponse>() {};
        return apiClient.invokeAPI("/customer/wishlist", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a wishlist
     * Fetch a customer&#39;s wishlist. Products on the wishlist can be filtered using a criteria object.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return WishlistLoadRouteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WishlistLoadRouteResponse> readCustomerWishlist(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<WishlistLoadRouteResponse> localVarReturnType = new ParameterizedTypeReference<WishlistLoadRouteResponse>() {};
        return readCustomerWishlistRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a wishlist
     * Fetch a customer&#39;s wishlist. Products on the wishlist can be filtered using a criteria object.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;WishlistLoadRouteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WishlistLoadRouteResponse>> readCustomerWishlistWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<WishlistLoadRouteResponse> localVarReturnType = new ParameterizedTypeReference<WishlistLoadRouteResponse>() {};
        return readCustomerWishlistRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch a wishlist
     * Fetch a customer&#39;s wishlist. Products on the wishlist can be filtered using a criteria object.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - 
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCustomerWishlistWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readCustomerWishlistRequestCreation(criteria);
    }
    /**
     * Fetch a landing page with the resolved CMS page
     * Loads a landing page by its identifier and resolves the CMS page.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded landing page with cms page
     * <p><b>404</b> - Not Found
     * @param landingPageId Identifier of the landing page.
     * @param readLandingPageRequest The readLandingPageRequest parameter
     * @return LandingPage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readLandingPageRequestCreation(String landingPageId, ReadLandingPageRequest readLandingPageRequest) throws WebClientResponseException {
        Object postBody = readLandingPageRequest;
        // verify the required parameter 'landingPageId' is set
        if (landingPageId == null) {
            throw new WebClientResponseException("Missing the required parameter 'landingPageId' when calling readLandingPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("landingPageId", landingPageId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/vnd.api+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<LandingPage> localVarReturnType = new ParameterizedTypeReference<LandingPage>() {};
        return apiClient.invokeAPI("/landing-page/{landingPageId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a landing page with the resolved CMS page
     * Loads a landing page by its identifier and resolves the CMS page.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded landing page with cms page
     * <p><b>404</b> - Not Found
     * @param landingPageId Identifier of the landing page.
     * @param readLandingPageRequest The readLandingPageRequest parameter
     * @return LandingPage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LandingPage> readLandingPage(String landingPageId, ReadLandingPageRequest readLandingPageRequest) throws WebClientResponseException {
        ParameterizedTypeReference<LandingPage> localVarReturnType = new ParameterizedTypeReference<LandingPage>() {};
        return readLandingPageRequestCreation(landingPageId, readLandingPageRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a landing page with the resolved CMS page
     * Loads a landing page by its identifier and resolves the CMS page.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded landing page with cms page
     * <p><b>404</b> - Not Found
     * @param landingPageId Identifier of the landing page.
     * @param readLandingPageRequest The readLandingPageRequest parameter
     * @return ResponseEntity&lt;LandingPage&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<LandingPage>> readLandingPageWithHttpInfo(String landingPageId, ReadLandingPageRequest readLandingPageRequest) throws WebClientResponseException {
        ParameterizedTypeReference<LandingPage> localVarReturnType = new ParameterizedTypeReference<LandingPage>() {};
        return readLandingPageRequestCreation(landingPageId, readLandingPageRequest).toEntity(localVarReturnType);
    }

    /**
     * Fetch a landing page with the resolved CMS page
     * Loads a landing page by its identifier and resolves the CMS page.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded landing page with cms page
     * <p><b>404</b> - Not Found
     * @param landingPageId Identifier of the landing page.
     * @param readLandingPageRequest The readLandingPageRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readLandingPageWithResponseSpec(String landingPageId, ReadLandingPageRequest readLandingPageRequest) throws WebClientResponseException {
        return readLandingPageRequestCreation(landingPageId, readLandingPageRequest);
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
     * Fetch a navigation menu
     * This endpoint returns categories that can be used as a page navigation. You can either return them as a tree or as a flat list. You can also control the depth of the tree.      Instead of passing uuids, you can also use one of the following aliases for the activeId and rootId parameters to get the respective navigations of your sales channel.       * main-navigation      * service-navigation      * footer-navigation
     * <p><b>200</b> - All available navigations
     * @param activeId Identifier of the active category in the navigation tree (if not used, just set to the same as rootId).
     * @param rootId Identifier of the root category for your desired navigation tree. You can use it to fetch sub-trees of your navigation tree.
     * @param readNavigationRequest The readNavigationRequest parameter
     * @param swIncludeSeoUrls Instructs Shopware to try and resolve SEO URLs for the given navigation item
     * @return List&lt;Category&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readNavigationRequestCreation(String activeId, String rootId, ReadNavigationRequest readNavigationRequest, Boolean swIncludeSeoUrls) throws WebClientResponseException {
        Object postBody = readNavigationRequest;
        // verify the required parameter 'activeId' is set
        if (activeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'activeId' when calling readNavigation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'rootId' is set
        if (rootId == null) {
            throw new WebClientResponseException("Missing the required parameter 'rootId' when calling readNavigation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'readNavigationRequest' is set
        if (readNavigationRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'readNavigationRequest' when calling readNavigation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("activeId", activeId);
        pathParams.put("rootId", rootId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        if (swIncludeSeoUrls != null)
        headerParams.add("sw-include-seo-urls", apiClient.parameterToString(swIncludeSeoUrls));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Category> localVarReturnType = new ParameterizedTypeReference<Category>() {};
        return apiClient.invokeAPI("/navigation/{activeId}/{rootId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a navigation menu
     * This endpoint returns categories that can be used as a page navigation. You can either return them as a tree or as a flat list. You can also control the depth of the tree.      Instead of passing uuids, you can also use one of the following aliases for the activeId and rootId parameters to get the respective navigations of your sales channel.       * main-navigation      * service-navigation      * footer-navigation
     * <p><b>200</b> - All available navigations
     * @param activeId Identifier of the active category in the navigation tree (if not used, just set to the same as rootId).
     * @param rootId Identifier of the root category for your desired navigation tree. You can use it to fetch sub-trees of your navigation tree.
     * @param readNavigationRequest The readNavigationRequest parameter
     * @param swIncludeSeoUrls Instructs Shopware to try and resolve SEO URLs for the given navigation item
     * @return List&lt;Category&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Category> readNavigation(String activeId, String rootId, ReadNavigationRequest readNavigationRequest, Boolean swIncludeSeoUrls) throws WebClientResponseException {
        ParameterizedTypeReference<Category> localVarReturnType = new ParameterizedTypeReference<Category>() {};
        return readNavigationRequestCreation(activeId, rootId, readNavigationRequest, swIncludeSeoUrls).bodyToFlux(localVarReturnType);
    }

    /**
     * Fetch a navigation menu
     * This endpoint returns categories that can be used as a page navigation. You can either return them as a tree or as a flat list. You can also control the depth of the tree.      Instead of passing uuids, you can also use one of the following aliases for the activeId and rootId parameters to get the respective navigations of your sales channel.       * main-navigation      * service-navigation      * footer-navigation
     * <p><b>200</b> - All available navigations
     * @param activeId Identifier of the active category in the navigation tree (if not used, just set to the same as rootId).
     * @param rootId Identifier of the root category for your desired navigation tree. You can use it to fetch sub-trees of your navigation tree.
     * @param readNavigationRequest The readNavigationRequest parameter
     * @param swIncludeSeoUrls Instructs Shopware to try and resolve SEO URLs for the given navigation item
     * @return ResponseEntity&lt;List&lt;Category&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Category>>> readNavigationWithHttpInfo(String activeId, String rootId, ReadNavigationRequest readNavigationRequest, Boolean swIncludeSeoUrls) throws WebClientResponseException {
        ParameterizedTypeReference<Category> localVarReturnType = new ParameterizedTypeReference<Category>() {};
        return readNavigationRequestCreation(activeId, rootId, readNavigationRequest, swIncludeSeoUrls).toEntityList(localVarReturnType);
    }

    /**
     * Fetch a navigation menu
     * This endpoint returns categories that can be used as a page navigation. You can either return them as a tree or as a flat list. You can also control the depth of the tree.      Instead of passing uuids, you can also use one of the following aliases for the activeId and rootId parameters to get the respective navigations of your sales channel.       * main-navigation      * service-navigation      * footer-navigation
     * <p><b>200</b> - All available navigations
     * @param activeId Identifier of the active category in the navigation tree (if not used, just set to the same as rootId).
     * @param rootId Identifier of the root category for your desired navigation tree. You can use it to fetch sub-trees of your navigation tree.
     * @param readNavigationRequest The readNavigationRequest parameter
     * @param swIncludeSeoUrls Instructs Shopware to try and resolve SEO URLs for the given navigation item
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readNavigationWithResponseSpec(String activeId, String rootId, ReadNavigationRequest readNavigationRequest, Boolean swIncludeSeoUrls) throws WebClientResponseException {
        return readNavigationRequestCreation(activeId, rootId, readNavigationRequest, swIncludeSeoUrls);
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
     * Fetch a list of orders
     * List orders of a customer.
     * <p><b>200</b> - An array of orders and an indicator if the payment of the order can be changed.
     * @param readOrderRequest The readOrderRequest parameter
     * @return OrderRouteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readOrderRequestCreation(ReadOrderRequest readOrderRequest) throws WebClientResponseException {
        Object postBody = readOrderRequest;
        // verify the required parameter 'readOrderRequest' is set
        if (readOrderRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'readOrderRequest' when calling readOrder", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<OrderRouteResponse> localVarReturnType = new ParameterizedTypeReference<OrderRouteResponse>() {};
        return apiClient.invokeAPI("/order", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a list of orders
     * List orders of a customer.
     * <p><b>200</b> - An array of orders and an indicator if the payment of the order can be changed.
     * @param readOrderRequest The readOrderRequest parameter
     * @return OrderRouteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OrderRouteResponse> readOrder(ReadOrderRequest readOrderRequest) throws WebClientResponseException {
        ParameterizedTypeReference<OrderRouteResponse> localVarReturnType = new ParameterizedTypeReference<OrderRouteResponse>() {};
        return readOrderRequestCreation(readOrderRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a list of orders
     * List orders of a customer.
     * <p><b>200</b> - An array of orders and an indicator if the payment of the order can be changed.
     * @param readOrderRequest The readOrderRequest parameter
     * @return ResponseEntity&lt;OrderRouteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<OrderRouteResponse>> readOrderWithHttpInfo(ReadOrderRequest readOrderRequest) throws WebClientResponseException {
        ParameterizedTypeReference<OrderRouteResponse> localVarReturnType = new ParameterizedTypeReference<OrderRouteResponse>() {};
        return readOrderRequestCreation(readOrderRequest).toEntity(localVarReturnType);
    }

    /**
     * Fetch a list of orders
     * List orders of a customer.
     * <p><b>200</b> - An array of orders and an indicator if the payment of the order can be changed.
     * @param readOrderRequest The readOrderRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readOrderWithResponseSpec(ReadOrderRequest readOrderRequest) throws WebClientResponseException {
        return readOrderRequestCreation(readOrderRequest);
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
    /**
     * Fetch a list of products
     * List products that match the given criteria. For performance reasons a limit should always be set.
     * <p><b>200</b> - Entity search result containing products
     * @param criteria The criteria parameter
     * @return ReadProduct200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readProductRequestCreation(Criteria criteria) throws WebClientResponseException {
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

        ParameterizedTypeReference<ReadProduct200Response> localVarReturnType = new ParameterizedTypeReference<ReadProduct200Response>() {};
        return apiClient.invokeAPI("/product", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a list of products
     * List products that match the given criteria. For performance reasons a limit should always be set.
     * <p><b>200</b> - Entity search result containing products
     * @param criteria The criteria parameter
     * @return ReadProduct200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadProduct200Response> readProduct(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadProduct200Response> localVarReturnType = new ParameterizedTypeReference<ReadProduct200Response>() {};
        return readProductRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a list of products
     * List products that match the given criteria. For performance reasons a limit should always be set.
     * <p><b>200</b> - Entity search result containing products
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadProduct200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadProduct200Response>> readProductWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadProduct200Response> localVarReturnType = new ParameterizedTypeReference<ReadProduct200Response>() {};
        return readProductRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch a list of products
     * List products that match the given criteria. For performance reasons a limit should always be set.
     * <p><b>200</b> - Entity search result containing products
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readProductWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readProductRequestCreation(criteria);
    }
    /**
     * Fetch product reviews
     * Perform a filtered search for product reviews.
     * <p><b>200</b> - Entity search result containing product reviews
     * @param productId Identifier of the product.
     * @param criteria The criteria parameter
     * @return ReadProductReviews200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readProductReviewsRequestCreation(String productId, Criteria criteria) throws WebClientResponseException {
        Object postBody = criteria;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling readProductReviews", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("productId", productId);

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

        ParameterizedTypeReference<ReadProductReviews200Response> localVarReturnType = new ParameterizedTypeReference<ReadProductReviews200Response>() {};
        return apiClient.invokeAPI("/product/{productId}/reviews", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch product reviews
     * Perform a filtered search for product reviews.
     * <p><b>200</b> - Entity search result containing product reviews
     * @param productId Identifier of the product.
     * @param criteria The criteria parameter
     * @return ReadProductReviews200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadProductReviews200Response> readProductReviews(String productId, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadProductReviews200Response> localVarReturnType = new ParameterizedTypeReference<ReadProductReviews200Response>() {};
        return readProductReviewsRequestCreation(productId, criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch product reviews
     * Perform a filtered search for product reviews.
     * <p><b>200</b> - Entity search result containing product reviews
     * @param productId Identifier of the product.
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadProductReviews200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadProductReviews200Response>> readProductReviewsWithHttpInfo(String productId, Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadProductReviews200Response> localVarReturnType = new ParameterizedTypeReference<ReadProductReviews200Response>() {};
        return readProductReviewsRequestCreation(productId, criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch product reviews
     * Perform a filtered search for product reviews.
     * <p><b>200</b> - Entity search result containing product reviews
     * @param productId Identifier of the product.
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readProductReviewsWithResponseSpec(String productId, Criteria criteria) throws WebClientResponseException {
        return readProductReviewsRequestCreation(productId, criteria);
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
     * Fetch SEO routes
     * Perform a filtered search for seo urls.
     * <p><b>200</b> - Entity search result containing seo urls.
     * <p><b>404</b> - Not Found
     * @param criteria The criteria parameter
     * @return ReadSeoUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readSeoUrlRequestCreation(Criteria criteria) throws WebClientResponseException {
        Object postBody = criteria;
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ReadSeoUrl200Response> localVarReturnType = new ParameterizedTypeReference<ReadSeoUrl200Response>() {};
        return apiClient.invokeAPI("/seo-url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch SEO routes
     * Perform a filtered search for seo urls.
     * <p><b>200</b> - Entity search result containing seo urls.
     * <p><b>404</b> - Not Found
     * @param criteria The criteria parameter
     * @return ReadSeoUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReadSeoUrl200Response> readSeoUrl(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadSeoUrl200Response> localVarReturnType = new ParameterizedTypeReference<ReadSeoUrl200Response>() {};
        return readSeoUrlRequestCreation(criteria).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch SEO routes
     * Perform a filtered search for seo urls.
     * <p><b>200</b> - Entity search result containing seo urls.
     * <p><b>404</b> - Not Found
     * @param criteria The criteria parameter
     * @return ResponseEntity&lt;ReadSeoUrl200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReadSeoUrl200Response>> readSeoUrlWithHttpInfo(Criteria criteria) throws WebClientResponseException {
        ParameterizedTypeReference<ReadSeoUrl200Response> localVarReturnType = new ParameterizedTypeReference<ReadSeoUrl200Response>() {};
        return readSeoUrlRequestCreation(criteria).toEntity(localVarReturnType);
    }

    /**
     * Fetch SEO routes
     * Perform a filtered search for seo urls.
     * <p><b>200</b> - Entity search result containing seo urls.
     * <p><b>404</b> - Not Found
     * @param criteria The criteria parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readSeoUrlWithResponseSpec(Criteria criteria) throws WebClientResponseException {
        return readSeoUrlRequestCreation(criteria);
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
