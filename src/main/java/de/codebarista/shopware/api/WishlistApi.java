package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.MergeProductOnWishlistRequest;
import de.codebarista.shopware.model.SuccessResponse;
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
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:26:02.541008353+02:00[Europe/Berlin]", comments = "Generator version: 7.5.0")
public class WishlistApi {
    private ApiClient apiClient;

    public WishlistApi() {
        this(new ApiClient());
    }

    @Autowired
    public WishlistApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a product to a wishlist
     * Adds a product to a customers wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param productId Identifier of the product to be added.
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addProductOnWishlistRequestCreation(String productId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling addProductOnWishlist", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/customer/wishlist/add/{productId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a product to a wishlist
     * Adds a product to a customers wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param productId Identifier of the product to be added.
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> addProductOnWishlist(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return addProductOnWishlistRequestCreation(productId).bodyToMono(localVarReturnType);
    }

    /**
     * Add a product to a wishlist
     * Adds a product to a customers wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param productId Identifier of the product to be added.
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> addProductOnWishlistWithHttpInfo(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return addProductOnWishlistRequestCreation(productId).toEntity(localVarReturnType);
    }

    /**
     * Add a product to a wishlist
     * Adds a product to a customers wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param productId Identifier of the product to be added.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addProductOnWishlistWithResponseSpec(String productId) throws WebClientResponseException {
        return addProductOnWishlistRequestCreation(productId);
    }
    /**
     * Remove a product from a wishlist
     * Removes a product from a customer&#39;s wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response indicating a successful removal.
     * <p><b>404</b> - The removal of the product failed. Probably because the product could not be found on the wishlist.
     * @param productId The identifier of the product to be removed from the wishlist.
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteProductOnWishlistRequestCreation(String productId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling deleteProductOnWishlist", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/customer/wishlist/delete/{productId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a product from a wishlist
     * Removes a product from a customer&#39;s wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response indicating a successful removal.
     * <p><b>404</b> - The removal of the product failed. Probably because the product could not be found on the wishlist.
     * @param productId The identifier of the product to be removed from the wishlist.
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> deleteProductOnWishlist(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return deleteProductOnWishlistRequestCreation(productId).bodyToMono(localVarReturnType);
    }

    /**
     * Remove a product from a wishlist
     * Removes a product from a customer&#39;s wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response indicating a successful removal.
     * <p><b>404</b> - The removal of the product failed. Probably because the product could not be found on the wishlist.
     * @param productId The identifier of the product to be removed from the wishlist.
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> deleteProductOnWishlistWithHttpInfo(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return deleteProductOnWishlistRequestCreation(productId).toEntity(localVarReturnType);
    }

    /**
     * Remove a product from a wishlist
     * Removes a product from a customer&#39;s wishlist.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response indicating a successful removal.
     * <p><b>404</b> - The removal of the product failed. Probably because the product could not be found on the wishlist.
     * @param productId The identifier of the product to be removed from the wishlist.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteProductOnWishlistWithResponseSpec(String productId) throws WebClientResponseException {
        return deleteProductOnWishlistRequestCreation(productId);
    }
    /**
     * Create a wishlist for a customer
     * Create a new wishlist for a logged in customer or extend the existing wishlist given a set of products.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * A customer can only have a single wishlist.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param mergeProductOnWishlistRequest The mergeProductOnWishlistRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeProductOnWishlistRequestCreation(MergeProductOnWishlistRequest mergeProductOnWishlistRequest) throws WebClientResponseException {
        Object postBody = mergeProductOnWishlistRequest;
        // verify the required parameter 'mergeProductOnWishlistRequest' is set
        if (mergeProductOnWishlistRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'mergeProductOnWishlistRequest' when calling mergeProductOnWishlist", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/customer/wishlist/merge", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a wishlist for a customer
     * Create a new wishlist for a logged in customer or extend the existing wishlist given a set of products.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * A customer can only have a single wishlist.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param mergeProductOnWishlistRequest The mergeProductOnWishlistRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> mergeProductOnWishlist(MergeProductOnWishlistRequest mergeProductOnWishlistRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return mergeProductOnWishlistRequestCreation(mergeProductOnWishlistRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a wishlist for a customer
     * Create a new wishlist for a logged in customer or extend the existing wishlist given a set of products.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * A customer can only have a single wishlist.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param mergeProductOnWishlistRequest The mergeProductOnWishlistRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> mergeProductOnWishlistWithHttpInfo(MergeProductOnWishlistRequest mergeProductOnWishlistRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return mergeProductOnWishlistRequestCreation(mergeProductOnWishlistRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a wishlist for a customer
     * Create a new wishlist for a logged in customer or extend the existing wishlist given a set of products.      **Important constraints**      * Anonymous (not logged-in) customers can not have wishlists.     * A customer can only have a single wishlist.     * The wishlist feature has to be activated.
     * <p><b>200</b> - Returns a success response.
     * @param mergeProductOnWishlistRequest The mergeProductOnWishlistRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec mergeProductOnWishlistWithResponseSpec(MergeProductOnWishlistRequest mergeProductOnWishlistRequest) throws WebClientResponseException {
        return mergeProductOnWishlistRequestCreation(mergeProductOnWishlistRequest);
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
}
