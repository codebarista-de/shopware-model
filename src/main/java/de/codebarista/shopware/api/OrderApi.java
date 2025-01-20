package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.CancelOrderRequest;
import de.codebarista.shopware.model.CreateOrderRequest;
import de.codebarista.shopware.model.Order;
import de.codebarista.shopware.model.OrderRouteResponse;
import de.codebarista.shopware.model.OrderSetPaymentRequest;
import de.codebarista.shopware.model.ReadOrderRequest;
import de.codebarista.shopware.model.StateMachineState;
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

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:26:02.541008353+02:00[Europe/Berlin]", comments = "Generator version: 7.5.0")
public class OrderApi {
    private ApiClient apiClient;

    public OrderApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel an order
     * Cancels an order. The order state will be set to &#39;cancelled&#39;.
     * <p><b>200</b> - Returns the state of the state machine      example: More information about the state machine can be found in the corresponding guide: [Using the state machine](https://developer.shopware.com/docs/guides/plugins/plugins/checkout/order/using-the-state-machine)
     * @param cancelOrderRequest The cancelOrderRequest parameter
     * @return StateMachineState
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec cancelOrderRequestCreation(CancelOrderRequest cancelOrderRequest) throws WebClientResponseException {
        Object postBody = cancelOrderRequest;
        // verify the required parameter 'cancelOrderRequest' is set
        if (cancelOrderRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'cancelOrderRequest' when calling cancelOrder", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<StateMachineState> localVarReturnType = new ParameterizedTypeReference<StateMachineState>() {};
        return apiClient.invokeAPI("/order/state/cancel", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel an order
     * Cancels an order. The order state will be set to &#39;cancelled&#39;.
     * <p><b>200</b> - Returns the state of the state machine      example: More information about the state machine can be found in the corresponding guide: [Using the state machine](https://developer.shopware.com/docs/guides/plugins/plugins/checkout/order/using-the-state-machine)
     * @param cancelOrderRequest The cancelOrderRequest parameter
     * @return StateMachineState
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<StateMachineState> cancelOrder(CancelOrderRequest cancelOrderRequest) throws WebClientResponseException {
        ParameterizedTypeReference<StateMachineState> localVarReturnType = new ParameterizedTypeReference<StateMachineState>() {};
        return cancelOrderRequestCreation(cancelOrderRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel an order
     * Cancels an order. The order state will be set to &#39;cancelled&#39;.
     * <p><b>200</b> - Returns the state of the state machine      example: More information about the state machine can be found in the corresponding guide: [Using the state machine](https://developer.shopware.com/docs/guides/plugins/plugins/checkout/order/using-the-state-machine)
     * @param cancelOrderRequest The cancelOrderRequest parameter
     * @return ResponseEntity&lt;StateMachineState&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<StateMachineState>> cancelOrderWithHttpInfo(CancelOrderRequest cancelOrderRequest) throws WebClientResponseException {
        ParameterizedTypeReference<StateMachineState> localVarReturnType = new ParameterizedTypeReference<StateMachineState>() {};
        return cancelOrderRequestCreation(cancelOrderRequest).toEntity(localVarReturnType);
    }

    /**
     * Cancel an order
     * Cancels an order. The order state will be set to &#39;cancelled&#39;.
     * <p><b>200</b> - Returns the state of the state machine      example: More information about the state machine can be found in the corresponding guide: [Using the state machine](https://developer.shopware.com/docs/guides/plugins/plugins/checkout/order/using-the-state-machine)
     * @param cancelOrderRequest The cancelOrderRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec cancelOrderWithResponseSpec(CancelOrderRequest cancelOrderRequest) throws WebClientResponseException {
        return cancelOrderRequestCreation(cancelOrderRequest);
    }
    /**
     * Create an order from a cart
     * Creates a new order from the current cart and deletes the cart.  If you are using the [prepared payment flow](https://developer.shopware.com/docs/concepts/commerce/checkout-concept/payments#2.1-prepare-payment-optional), this endpoint also receives additional transaction details. The exact name of the parameters depends on the implementation of the corresponding *payment handler*.
     * <p><b>200</b> - Order
     * @param createOrderRequest Contains additional metadata which is stored together with the order. It can also contain payment transaction details.
     * @return Order
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createOrderRequestCreation(CreateOrderRequest createOrderRequest) throws WebClientResponseException {
        Object postBody = createOrderRequest;
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

        ParameterizedTypeReference<Order> localVarReturnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI("/checkout/order", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an order from a cart
     * Creates a new order from the current cart and deletes the cart.  If you are using the [prepared payment flow](https://developer.shopware.com/docs/concepts/commerce/checkout-concept/payments#2.1-prepare-payment-optional), this endpoint also receives additional transaction details. The exact name of the parameters depends on the implementation of the corresponding *payment handler*.
     * <p><b>200</b> - Order
     * @param createOrderRequest Contains additional metadata which is stored together with the order. It can also contain payment transaction details.
     * @return Order
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Order> createOrder(CreateOrderRequest createOrderRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Order> localVarReturnType = new ParameterizedTypeReference<Order>() {};
        return createOrderRequestCreation(createOrderRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create an order from a cart
     * Creates a new order from the current cart and deletes the cart.  If you are using the [prepared payment flow](https://developer.shopware.com/docs/concepts/commerce/checkout-concept/payments#2.1-prepare-payment-optional), this endpoint also receives additional transaction details. The exact name of the parameters depends on the implementation of the corresponding *payment handler*.
     * <p><b>200</b> - Order
     * @param createOrderRequest Contains additional metadata which is stored together with the order. It can also contain payment transaction details.
     * @return ResponseEntity&lt;Order&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Order>> createOrderWithHttpInfo(CreateOrderRequest createOrderRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Order> localVarReturnType = new ParameterizedTypeReference<Order>() {};
        return createOrderRequestCreation(createOrderRequest).toEntity(localVarReturnType);
    }

    /**
     * Create an order from a cart
     * Creates a new order from the current cart and deletes the cart.  If you are using the [prepared payment flow](https://developer.shopware.com/docs/concepts/commerce/checkout-concept/payments#2.1-prepare-payment-optional), this endpoint also receives additional transaction details. The exact name of the parameters depends on the implementation of the corresponding *payment handler*.
     * <p><b>200</b> - Order
     * @param createOrderRequest Contains additional metadata which is stored together with the order. It can also contain payment transaction details.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createOrderWithResponseSpec(CreateOrderRequest createOrderRequest) throws WebClientResponseException {
        return createOrderRequestCreation(createOrderRequest);
    }
    /**
     * Download a purchased file
     * Download a file included in the given order and with the given id. Access must be granted.
     * <p><b>200</b> - An arbitrary binary file.
     * @param orderId The orderId parameter
     * @param downloadId The downloadId parameter
     * @return File
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec orderDownloadFileRequestCreation(String orderId, String downloadId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new WebClientResponseException("Missing the required parameter 'orderId' when calling orderDownloadFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'downloadId' is set
        if (downloadId == null) {
            throw new WebClientResponseException("Missing the required parameter 'downloadId' when calling orderDownloadFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("orderId", orderId);
        pathParams.put("downloadId", downloadId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/order/download/{orderId}/{downloadId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Download a purchased file
     * Download a file included in the given order and with the given id. Access must be granted.
     * <p><b>200</b> - An arbitrary binary file.
     * @param orderId The orderId parameter
     * @param downloadId The downloadId parameter
     * @return File
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<File> orderDownloadFile(String orderId, String downloadId) throws WebClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return orderDownloadFileRequestCreation(orderId, downloadId).bodyToMono(localVarReturnType);
    }

    /**
     * Download a purchased file
     * Download a file included in the given order and with the given id. Access must be granted.
     * <p><b>200</b> - An arbitrary binary file.
     * @param orderId The orderId parameter
     * @param downloadId The downloadId parameter
     * @return ResponseEntity&lt;File&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<File>> orderDownloadFileWithHttpInfo(String orderId, String downloadId) throws WebClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return orderDownloadFileRequestCreation(orderId, downloadId).toEntity(localVarReturnType);
    }

    /**
     * Download a purchased file
     * Download a file included in the given order and with the given id. Access must be granted.
     * <p><b>200</b> - An arbitrary binary file.
     * @param orderId The orderId parameter
     * @param downloadId The downloadId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec orderDownloadFileWithResponseSpec(String orderId, String downloadId) throws WebClientResponseException {
        return orderDownloadFileRequestCreation(orderId, downloadId);
    }
    /**
     * Update the payment method of an order
     * Changes the payment method of a specific order. You can use the /order route to find out if the payment method of an order can be changed - take a look at the &#x60;paymentChangeable&#x60;- array in the response.
     * <p><b>200</b> - Successfully updated the payment method of the order.
     * @param orderSetPaymentRequest The orderSetPaymentRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec orderSetPaymentRequestCreation(OrderSetPaymentRequest orderSetPaymentRequest) throws WebClientResponseException {
        Object postBody = orderSetPaymentRequest;
        // verify the required parameter 'orderSetPaymentRequest' is set
        if (orderSetPaymentRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'orderSetPaymentRequest' when calling orderSetPayment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/order/payment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the payment method of an order
     * Changes the payment method of a specific order. You can use the /order route to find out if the payment method of an order can be changed - take a look at the &#x60;paymentChangeable&#x60;- array in the response.
     * <p><b>200</b> - Successfully updated the payment method of the order.
     * @param orderSetPaymentRequest The orderSetPaymentRequest parameter
     * @return SuccessResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SuccessResponse> orderSetPayment(OrderSetPaymentRequest orderSetPaymentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return orderSetPaymentRequestCreation(orderSetPaymentRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update the payment method of an order
     * Changes the payment method of a specific order. You can use the /order route to find out if the payment method of an order can be changed - take a look at the &#x60;paymentChangeable&#x60;- array in the response.
     * <p><b>200</b> - Successfully updated the payment method of the order.
     * @param orderSetPaymentRequest The orderSetPaymentRequest parameter
     * @return ResponseEntity&lt;SuccessResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SuccessResponse>> orderSetPaymentWithHttpInfo(OrderSetPaymentRequest orderSetPaymentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SuccessResponse> localVarReturnType = new ParameterizedTypeReference<SuccessResponse>() {};
        return orderSetPaymentRequestCreation(orderSetPaymentRequest).toEntity(localVarReturnType);
    }

    /**
     * Update the payment method of an order
     * Changes the payment method of a specific order. You can use the /order route to find out if the payment method of an order can be changed - take a look at the &#x60;paymentChangeable&#x60;- array in the response.
     * <p><b>200</b> - Successfully updated the payment method of the order.
     * @param orderSetPaymentRequest The orderSetPaymentRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec orderSetPaymentWithResponseSpec(OrderSetPaymentRequest orderSetPaymentRequest) throws WebClientResponseException {
        return orderSetPaymentRequestCreation(orderSetPaymentRequest);
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
}
