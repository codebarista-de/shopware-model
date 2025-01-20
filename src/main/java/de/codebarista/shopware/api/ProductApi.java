package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.CrossSellingElementCollectionInner;
import de.codebarista.shopware.model.FindProductVariantRouteResponse;
import de.codebarista.shopware.model.ProductDetailResponse;
import de.codebarista.shopware.model.ProductListingResult;
import de.codebarista.shopware.model.ReadProduct200Response;
import de.codebarista.shopware.model.ReadProductListingRequest;
import de.codebarista.shopware.model.ReadProductReviews200Response;
import de.codebarista.shopware.model.SaveProductReviewRequest;
import de.codebarista.shopware.model.SearchPageRequest;
import de.codebarista.shopware.model.SearchProductVariantIdsRequest;
import de.codebarista.shopware.model.SearchSuggestRequest;
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
public class ProductApi {
    private ApiClient apiClient;

    public ProductApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProductApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
     * Fetch cross-selling groups of a product
     * This route is used to load the cross sellings for a product. A product has several cross selling definitions in which several products are linked. The route returns the cross sellings together with the linked products
     * <p><b>200</b> - Found cross sellings
     * @param productId Product ID
     * @return List&lt;CrossSellingElementCollectionInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readProductCrossSellingsRequestCreation(String productId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling readProductCrossSellings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CrossSellingElementCollectionInner> localVarReturnType = new ParameterizedTypeReference<CrossSellingElementCollectionInner>() {};
        return apiClient.invokeAPI("/product/{productId}/cross-selling", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch cross-selling groups of a product
     * This route is used to load the cross sellings for a product. A product has several cross selling definitions in which several products are linked. The route returns the cross sellings together with the linked products
     * <p><b>200</b> - Found cross sellings
     * @param productId Product ID
     * @return List&lt;CrossSellingElementCollectionInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<CrossSellingElementCollectionInner> readProductCrossSellings(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<CrossSellingElementCollectionInner> localVarReturnType = new ParameterizedTypeReference<CrossSellingElementCollectionInner>() {};
        return readProductCrossSellingsRequestCreation(productId).bodyToFlux(localVarReturnType);
    }

    /**
     * Fetch cross-selling groups of a product
     * This route is used to load the cross sellings for a product. A product has several cross selling definitions in which several products are linked. The route returns the cross sellings together with the linked products
     * <p><b>200</b> - Found cross sellings
     * @param productId Product ID
     * @return ResponseEntity&lt;List&lt;CrossSellingElementCollectionInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<CrossSellingElementCollectionInner>>> readProductCrossSellingsWithHttpInfo(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<CrossSellingElementCollectionInner> localVarReturnType = new ParameterizedTypeReference<CrossSellingElementCollectionInner>() {};
        return readProductCrossSellingsRequestCreation(productId).toEntityList(localVarReturnType);
    }

    /**
     * Fetch cross-selling groups of a product
     * This route is used to load the cross sellings for a product. A product has several cross selling definitions in which several products are linked. The route returns the cross sellings together with the linked products
     * <p><b>200</b> - Found cross sellings
     * @param productId Product ID
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readProductCrossSellingsWithResponseSpec(String productId) throws WebClientResponseException {
        return readProductCrossSellingsRequestCreation(productId);
    }
    /**
     * Fetch a single product
     * This route is used to load a single product with the corresponding details. In addition to loading the data, the best variant of the product is determined when a parent id is passed.
     * <p><b>200</b> - Product information along with variant groups and options
     * @param productId Product ID
     * @return ProductDetailResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readProductDetailRequestCreation(String productId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling readProductDetail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ProductDetailResponse> localVarReturnType = new ParameterizedTypeReference<ProductDetailResponse>() {};
        return apiClient.invokeAPI("/product/{productId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a single product
     * This route is used to load a single product with the corresponding details. In addition to loading the data, the best variant of the product is determined when a parent id is passed.
     * <p><b>200</b> - Product information along with variant groups and options
     * @param productId Product ID
     * @return ProductDetailResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProductDetailResponse> readProductDetail(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<ProductDetailResponse> localVarReturnType = new ParameterizedTypeReference<ProductDetailResponse>() {};
        return readProductDetailRequestCreation(productId).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a single product
     * This route is used to load a single product with the corresponding details. In addition to loading the data, the best variant of the product is determined when a parent id is passed.
     * <p><b>200</b> - Product information along with variant groups and options
     * @param productId Product ID
     * @return ResponseEntity&lt;ProductDetailResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProductDetailResponse>> readProductDetailWithHttpInfo(String productId) throws WebClientResponseException {
        ParameterizedTypeReference<ProductDetailResponse> localVarReturnType = new ParameterizedTypeReference<ProductDetailResponse>() {};
        return readProductDetailRequestCreation(productId).toEntity(localVarReturnType);
    }

    /**
     * Fetch a single product
     * This route is used to load a single product with the corresponding details. In addition to loading the data, the best variant of the product is determined when a parent id is passed.
     * <p><b>200</b> - Product information along with variant groups and options
     * @param productId Product ID
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readProductDetailWithResponseSpec(String productId) throws WebClientResponseException {
        return readProductDetailRequestCreation(productId);
    }
    /**
     * Export product export
     * 
     * <p><b>200</b> - 
     * @param accessKey Access Key
     * @param fileName File Name
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readProductExportRequestCreation(String accessKey, String fileName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'accessKey' when calling readProductExport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new WebClientResponseException("Missing the required parameter 'fileName' when calling readProductExport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("accessKey", accessKey);
        pathParams.put("fileName", fileName);

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
        return apiClient.invokeAPI("/product-export/{accessKey}/{fileName}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Export product export
     * 
     * <p><b>200</b> - 
     * @param accessKey Access Key
     * @param fileName File Name
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> readProductExport(String accessKey, String fileName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return readProductExportRequestCreation(accessKey, fileName).bodyToMono(localVarReturnType);
    }

    /**
     * Export product export
     * 
     * <p><b>200</b> - 
     * @param accessKey Access Key
     * @param fileName File Name
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> readProductExportWithHttpInfo(String accessKey, String fileName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return readProductExportRequestCreation(accessKey, fileName).toEntity(localVarReturnType);
    }

    /**
     * Export product export
     * 
     * <p><b>200</b> - 
     * @param accessKey Access Key
     * @param fileName File Name
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readProductExportWithResponseSpec(String accessKey, String fileName) throws WebClientResponseException {
        return readProductExportRequestCreation(accessKey, fileName);
    }
    /**
     * Fetch a product listing by category
     * Fetches a product listing for a specific category. It also provides filters, sortings and property aggregations, analogous to the /search endpoint.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param categoryId Identifier of a category.
     * @param readProductListingRequest The readProductListingRequest parameter
     * @return ProductListingResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readProductListingRequestCreation(String categoryId, ReadProductListingRequest readProductListingRequest) throws WebClientResponseException {
        Object postBody = readProductListingRequest;
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new WebClientResponseException("Missing the required parameter 'categoryId' when calling readProductListing", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("categoryId", categoryId);

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

        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return apiClient.invokeAPI("/product-listing/{categoryId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch a product listing by category
     * Fetches a product listing for a specific category. It also provides filters, sortings and property aggregations, analogous to the /search endpoint.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param categoryId Identifier of a category.
     * @param readProductListingRequest The readProductListingRequest parameter
     * @return ProductListingResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProductListingResult> readProductListing(String categoryId, ReadProductListingRequest readProductListingRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return readProductListingRequestCreation(categoryId, readProductListingRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch a product listing by category
     * Fetches a product listing for a specific category. It also provides filters, sortings and property aggregations, analogous to the /search endpoint.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param categoryId Identifier of a category.
     * @param readProductListingRequest The readProductListingRequest parameter
     * @return ResponseEntity&lt;ProductListingResult&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProductListingResult>> readProductListingWithHttpInfo(String categoryId, ReadProductListingRequest readProductListingRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return readProductListingRequestCreation(categoryId, readProductListingRequest).toEntity(localVarReturnType);
    }

    /**
     * Fetch a product listing by category
     * Fetches a product listing for a specific category. It also provides filters, sortings and property aggregations, analogous to the /search endpoint.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param categoryId Identifier of a category.
     * @param readProductListingRequest The readProductListingRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readProductListingWithResponseSpec(String categoryId, ReadProductListingRequest readProductListingRequest) throws WebClientResponseException {
        return readProductListingRequestCreation(categoryId, readProductListingRequest);
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
     * Save a product review
     * Saves a review for a product. Reviews have to be activated in the settings.
     * <p><b>200</b> - Success response indicating the review was saved successfuly.
     * @param productId Identifier of the product which is reviewed.
     * @param saveProductReviewRequest The saveProductReviewRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec saveProductReviewRequestCreation(String productId, SaveProductReviewRequest saveProductReviewRequest) throws WebClientResponseException {
        Object postBody = saveProductReviewRequest;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling saveProductReview", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("productId", productId);

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
        return apiClient.invokeAPI("/product/{productId}/review", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Save a product review
     * Saves a review for a product. Reviews have to be activated in the settings.
     * <p><b>200</b> - Success response indicating the review was saved successfuly.
     * @param productId Identifier of the product which is reviewed.
     * @param saveProductReviewRequest The saveProductReviewRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> saveProductReview(String productId, SaveProductReviewRequest saveProductReviewRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return saveProductReviewRequestCreation(productId, saveProductReviewRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Save a product review
     * Saves a review for a product. Reviews have to be activated in the settings.
     * <p><b>200</b> - Success response indicating the review was saved successfuly.
     * @param productId Identifier of the product which is reviewed.
     * @param saveProductReviewRequest The saveProductReviewRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> saveProductReviewWithHttpInfo(String productId, SaveProductReviewRequest saveProductReviewRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return saveProductReviewRequestCreation(productId, saveProductReviewRequest).toEntity(localVarReturnType);
    }

    /**
     * Save a product review
     * Saves a review for a product. Reviews have to be activated in the settings.
     * <p><b>200</b> - Success response indicating the review was saved successfuly.
     * @param productId Identifier of the product which is reviewed.
     * @param saveProductReviewRequest The saveProductReviewRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec saveProductReviewWithResponseSpec(String productId, SaveProductReviewRequest saveProductReviewRequest) throws WebClientResponseException {
        return saveProductReviewRequestCreation(productId, saveProductReviewRequest);
    }
    /**
     * Search for products
     * Performs a search for products which can be used to display a product listing.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param searchPageRequest The searchPageRequest parameter
     * @return ProductListingResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchPageRequestCreation(SearchPageRequest searchPageRequest) throws WebClientResponseException {
        Object postBody = searchPageRequest;
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

        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return apiClient.invokeAPI("/search", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search for products
     * Performs a search for products which can be used to display a product listing.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param searchPageRequest The searchPageRequest parameter
     * @return ProductListingResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProductListingResult> searchPage(SearchPageRequest searchPageRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return searchPageRequestCreation(searchPageRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Search for products
     * Performs a search for products which can be used to display a product listing.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param searchPageRequest The searchPageRequest parameter
     * @return ResponseEntity&lt;ProductListingResult&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProductListingResult>> searchPageWithHttpInfo(SearchPageRequest searchPageRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return searchPageRequestCreation(searchPageRequest).toEntity(localVarReturnType);
    }

    /**
     * Search for products
     * Performs a search for products which can be used to display a product listing.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields to display a listing.
     * @param searchPageRequest The searchPageRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchPageWithResponseSpec(SearchPageRequest searchPageRequest) throws WebClientResponseException {
        return searchPageRequestCreation(searchPageRequest);
    }
    /**
     * Search for a matching variant by product options.
     * Performs a search for product variants and returns the best matching variant.
     * <p><b>200</b> - Returns an FoundCombination struct containing the ids matching the search.
     * @param productId Product ID
     * @param searchProductVariantIdsRequest The searchProductVariantIdsRequest parameter
     * @return FindProductVariantRouteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchProductVariantIdsRequestCreation(String productId, SearchProductVariantIdsRequest searchProductVariantIdsRequest) throws WebClientResponseException {
        Object postBody = searchProductVariantIdsRequest;
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new WebClientResponseException("Missing the required parameter 'productId' when calling searchProductVariantIds", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FindProductVariantRouteResponse> localVarReturnType = new ParameterizedTypeReference<FindProductVariantRouteResponse>() {};
        return apiClient.invokeAPI("/product/{productId}/find-variant", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search for a matching variant by product options.
     * Performs a search for product variants and returns the best matching variant.
     * <p><b>200</b> - Returns an FoundCombination struct containing the ids matching the search.
     * @param productId Product ID
     * @param searchProductVariantIdsRequest The searchProductVariantIdsRequest parameter
     * @return FindProductVariantRouteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FindProductVariantRouteResponse> searchProductVariantIds(String productId, SearchProductVariantIdsRequest searchProductVariantIdsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<FindProductVariantRouteResponse> localVarReturnType = new ParameterizedTypeReference<FindProductVariantRouteResponse>() {};
        return searchProductVariantIdsRequestCreation(productId, searchProductVariantIdsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Search for a matching variant by product options.
     * Performs a search for product variants and returns the best matching variant.
     * <p><b>200</b> - Returns an FoundCombination struct containing the ids matching the search.
     * @param productId Product ID
     * @param searchProductVariantIdsRequest The searchProductVariantIdsRequest parameter
     * @return ResponseEntity&lt;FindProductVariantRouteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<FindProductVariantRouteResponse>> searchProductVariantIdsWithHttpInfo(String productId, SearchProductVariantIdsRequest searchProductVariantIdsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<FindProductVariantRouteResponse> localVarReturnType = new ParameterizedTypeReference<FindProductVariantRouteResponse>() {};
        return searchProductVariantIdsRequestCreation(productId, searchProductVariantIdsRequest).toEntity(localVarReturnType);
    }

    /**
     * Search for a matching variant by product options.
     * Performs a search for product variants and returns the best matching variant.
     * <p><b>200</b> - Returns an FoundCombination struct containing the ids matching the search.
     * @param productId Product ID
     * @param searchProductVariantIdsRequest The searchProductVariantIdsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchProductVariantIdsWithResponseSpec(String productId, SearchProductVariantIdsRequest searchProductVariantIdsRequest) throws WebClientResponseException {
        return searchProductVariantIdsRequestCreation(productId, searchProductVariantIdsRequest);
    }
    /**
     * Search for products (suggest)
     * Can be used to implement search previews or suggestion listings, that don’t require any interaction.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields.  Note: Aggregations, currentFilters and availableSortings are empty in this response. If you need them to display a listing, use the /search route instead.
     * @param searchSuggestRequest The searchSuggestRequest parameter
     * @return ProductListingResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchSuggestRequestCreation(SearchSuggestRequest searchSuggestRequest) throws WebClientResponseException {
        Object postBody = searchSuggestRequest;
        // verify the required parameter 'searchSuggestRequest' is set
        if (searchSuggestRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'searchSuggestRequest' when calling searchSuggest", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return apiClient.invokeAPI("/search-suggest", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search for products (suggest)
     * Can be used to implement search previews or suggestion listings, that don’t require any interaction.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields.  Note: Aggregations, currentFilters and availableSortings are empty in this response. If you need them to display a listing, use the /search route instead.
     * @param searchSuggestRequest The searchSuggestRequest parameter
     * @return ProductListingResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProductListingResult> searchSuggest(SearchSuggestRequest searchSuggestRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return searchSuggestRequestCreation(searchSuggestRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Search for products (suggest)
     * Can be used to implement search previews or suggestion listings, that don’t require any interaction.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields.  Note: Aggregations, currentFilters and availableSortings are empty in this response. If you need them to display a listing, use the /search route instead.
     * @param searchSuggestRequest The searchSuggestRequest parameter
     * @return ResponseEntity&lt;ProductListingResult&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProductListingResult>> searchSuggestWithHttpInfo(SearchSuggestRequest searchSuggestRequest) throws WebClientResponseException {
        ParameterizedTypeReference<ProductListingResult> localVarReturnType = new ParameterizedTypeReference<ProductListingResult>() {};
        return searchSuggestRequestCreation(searchSuggestRequest).toEntity(localVarReturnType);
    }

    /**
     * Search for products (suggest)
     * Can be used to implement search previews or suggestion listings, that don’t require any interaction.
     * <p><b>200</b> - Returns a product listing containing all products and additional fields.  Note: Aggregations, currentFilters and availableSortings are empty in this response. If you need them to display a listing, use the /search route instead.
     * @param searchSuggestRequest The searchSuggestRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchSuggestWithResponseSpec(SearchSuggestRequest searchSuggestRequest) throws WebClientResponseException {
        return searchSuggestRequestCreation(searchSuggestRequest);
    }
}
