package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
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
public class AppApi {
    private ApiClient apiClient;

    public AppApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Access point for different api logics which are provided by apps over script hooks
     * 
     * <p><b>200</b> - Returns different structures of results based on the called script.
     * @param hook Dynamic hook which used to build the hook name
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postScriptStoreApiRouteRequestCreation(String hook) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'hook' is set
        if (hook == null) {
            throw new WebClientResponseException("Missing the required parameter 'hook' when calling postScriptStoreApiRoute", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("hook", hook);

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
        return apiClient.invokeAPI("/script/{hook}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Access point for different api logics which are provided by apps over script hooks
     * 
     * <p><b>200</b> - Returns different structures of results based on the called script.
     * @param hook Dynamic hook which used to build the hook name
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> postScriptStoreApiRoute(String hook) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return postScriptStoreApiRouteRequestCreation(hook).bodyToMono(localVarReturnType);
    }

    /**
     * Access point for different api logics which are provided by apps over script hooks
     * 
     * <p><b>200</b> - Returns different structures of results based on the called script.
     * @param hook Dynamic hook which used to build the hook name
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> postScriptStoreApiRouteWithHttpInfo(String hook) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return postScriptStoreApiRouteRequestCreation(hook).toEntity(localVarReturnType);
    }

    /**
     * Access point for different api logics which are provided by apps over script hooks
     * 
     * <p><b>200</b> - Returns different structures of results based on the called script.
     * @param hook Dynamic hook which used to build the hook name
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postScriptStoreApiRouteWithResponseSpec(String hook) throws WebClientResponseException {
        return postScriptStoreApiRouteRequestCreation(hook);
    }
}
