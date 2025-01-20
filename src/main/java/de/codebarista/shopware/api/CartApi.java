package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Cart;
import de.codebarista.shopware.model.CartItems;
import de.codebarista.shopware.model.RemoveLineItemRequest;
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
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:26:02.541008353+02:00[Europe/Berlin]", comments = "Generator version: 7.5.0")
public class CartApi {
    private ApiClient apiClient;

    public CartApi() {
        this(new ApiClient());
    }

    @Autowired
    public CartApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add items to the cart
     * This route adds items to the cart. An item can be a product or promotion for example. They are referenced by the &#x60;referencedId&#x60;-parameter.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#adding-new-items-to-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addLineItemRequestCreation(CartItems cartItems) throws WebClientResponseException {
        Object postBody = cartItems;
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

        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return apiClient.invokeAPI("/checkout/cart/line-item", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add items to the cart
     * This route adds items to the cart. An item can be a product or promotion for example. They are referenced by the &#x60;referencedId&#x60;-parameter.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#adding-new-items-to-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Cart> addLineItem(CartItems cartItems) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return addLineItemRequestCreation(cartItems).bodyToMono(localVarReturnType);
    }

    /**
     * Add items to the cart
     * This route adds items to the cart. An item can be a product or promotion for example. They are referenced by the &#x60;referencedId&#x60;-parameter.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#adding-new-items-to-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return ResponseEntity&lt;Cart&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Cart>> addLineItemWithHttpInfo(CartItems cartItems) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return addLineItemRequestCreation(cartItems).toEntity(localVarReturnType);
    }

    /**
     * Add items to the cart
     * This route adds items to the cart. An item can be a product or promotion for example. They are referenced by the &#x60;referencedId&#x60;-parameter.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#adding-new-items-to-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addLineItemWithResponseSpec(CartItems cartItems) throws WebClientResponseException {
        return addLineItemRequestCreation(cartItems);
    }
    /**
     * Delete a cart
     * This route deletes the cart of the customer.
     * <p><b>204</b> - Successfully deleted the cart
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCartRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return apiClient.invokeAPI("/checkout/cart", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a cart
     * This route deletes the cart of the customer.
     * <p><b>204</b> - Successfully deleted the cart
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> deleteCart() throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return deleteCartRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Delete a cart
     * This route deletes the cart of the customer.
     * <p><b>204</b> - Successfully deleted the cart
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> deleteCartWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return deleteCartRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Delete a cart
     * This route deletes the cart of the customer.
     * <p><b>204</b> - Successfully deleted the cart
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCartWithResponseSpec() throws WebClientResponseException {
        return deleteCartRequestCreation();
    }
    /**
     * Fetch or create a cart
     * Used to fetch the current cart or for creating a new one.
     * <p><b>200</b> - Cart
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCartRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return apiClient.invokeAPI("/checkout/cart", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch or create a cart
     * Used to fetch the current cart or for creating a new one.
     * <p><b>200</b> - Cart
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Cart> readCart() throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return readCartRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Fetch or create a cart
     * Used to fetch the current cart or for creating a new one.
     * <p><b>200</b> - Cart
     * @return ResponseEntity&lt;Cart&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Cart>> readCartWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return readCartRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Fetch or create a cart
     * Used to fetch the current cart or for creating a new one.
     * <p><b>200</b> - Cart
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCartWithResponseSpec() throws WebClientResponseException {
        return readCartRequestCreation();
    }
    /**
     * Remove items from the cart
     * This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param removeLineItemRequest The removeLineItemRequest parameter
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeLineItemRequestCreation(RemoveLineItemRequest removeLineItemRequest) throws WebClientResponseException {
        Object postBody = removeLineItemRequest;
        // verify the required parameter 'removeLineItemRequest' is set
        if (removeLineItemRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'removeLineItemRequest' when calling removeLineItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return apiClient.invokeAPI("/checkout/cart/line-item/delete", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove items from the cart
     * This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param removeLineItemRequest The removeLineItemRequest parameter
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Cart> removeLineItem(RemoveLineItemRequest removeLineItemRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return removeLineItemRequestCreation(removeLineItemRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Remove items from the cart
     * This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param removeLineItemRequest The removeLineItemRequest parameter
     * @return ResponseEntity&lt;Cart&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Cart>> removeLineItemWithHttpInfo(RemoveLineItemRequest removeLineItemRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return removeLineItemRequestCreation(removeLineItemRequest).toEntity(localVarReturnType);
    }

    /**
     * Remove items from the cart
     * This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param removeLineItemRequest The removeLineItemRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeLineItemWithResponseSpec(RemoveLineItemRequest removeLineItemRequest) throws WebClientResponseException {
        return removeLineItemRequestCreation(removeLineItemRequest);
    }
    /**
     * Remove items from the cart
     * DEPRECATED: use removeLineItem instead. This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param ids A list of product identifiers.
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec removeLineItemDeprecatedRequestCreation(List<String> ids) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new WebClientResponseException("Missing the required parameter 'ids' when calling removeLineItemDeprecated", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ids", ids));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return apiClient.invokeAPI("/checkout/cart/line-item", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove items from the cart
     * DEPRECATED: use removeLineItem instead. This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param ids A list of product identifiers.
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Cart> removeLineItemDeprecated(List<String> ids) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return removeLineItemDeprecatedRequestCreation(ids).bodyToMono(localVarReturnType);
    }

    /**
     * Remove items from the cart
     * DEPRECATED: use removeLineItem instead. This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param ids A list of product identifiers.
     * @return ResponseEntity&lt;Cart&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Cart>> removeLineItemDeprecatedWithHttpInfo(List<String> ids) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return removeLineItemDeprecatedRequestCreation(ids).toEntity(localVarReturnType);
    }

    /**
     * Remove items from the cart
     * DEPRECATED: use removeLineItem instead. This route removes items from the cart and recalculates it.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#deleting-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param ids A list of product identifiers.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeLineItemDeprecatedWithResponseSpec(List<String> ids) throws WebClientResponseException {
        return removeLineItemDeprecatedRequestCreation(ids);
    }
    /**
     * Update items in the cart
     * This route updates items in the cart. A typical example is updating the quantity of an item.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#updating-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateLineItemRequestCreation(CartItems cartItems) throws WebClientResponseException {
        Object postBody = cartItems;
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

        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return apiClient.invokeAPI("/checkout/cart/line-item", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update items in the cart
     * This route updates items in the cart. A typical example is updating the quantity of an item.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#updating-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return Cart
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Cart> updateLineItem(CartItems cartItems) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return updateLineItemRequestCreation(cartItems).bodyToMono(localVarReturnType);
    }

    /**
     * Update items in the cart
     * This route updates items in the cart. A typical example is updating the quantity of an item.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#updating-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return ResponseEntity&lt;Cart&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Cart>> updateLineItemWithHttpInfo(CartItems cartItems) throws WebClientResponseException {
        ParameterizedTypeReference<Cart> localVarReturnType = new ParameterizedTypeReference<Cart>() {};
        return updateLineItemRequestCreation(cartItems).toEntity(localVarReturnType);
    }

    /**
     * Update items in the cart
     * This route updates items in the cart. A typical example is updating the quantity of an item.  Example: [Working with the cart - Guide](https://developer.shopware.com/docs/guides/integrations-api/store-api-guide/work-with-the-cart#updating-items-in-the-cart)
     * <p><b>200</b> - The updated cart.
     * @param cartItems The cartItems parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateLineItemWithResponseSpec(CartItems cartItems) throws WebClientResponseException {
        return updateLineItemRequestCreation(cartItems);
    }
}
