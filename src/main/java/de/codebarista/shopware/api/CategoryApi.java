package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Category;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.ReadCategoryList200Response;
import de.codebarista.shopware.model.ReadCategoryRequest;
import de.codebarista.shopware.model.ReadNavigationRequest;
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
public class CategoryApi {
    private ApiClient apiClient;

    public CategoryApi() {
        this(new ApiClient());
    }

    @Autowired
    public CategoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
