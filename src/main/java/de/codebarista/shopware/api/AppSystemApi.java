package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.GenerateJWTAppSystemAppServer200Response;
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
public class AppSystemApi {
    private ApiClient apiClient;

    public AppSystemApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppSystemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate JWT token for app system backend
     * Generate JWT token for authenticated communication with the app server
     * <p><b>200</b> - 
     * @param name Name of the app
     * @param body The body parameter
     * @return GenerateJWTAppSystemAppServer200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateJWTAppSystemAppServerRequestCreation(String name, Object body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling generateJWTAppSystemAppServer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("name", name);

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

        ParameterizedTypeReference<GenerateJWTAppSystemAppServer200Response> localVarReturnType = new ParameterizedTypeReference<GenerateJWTAppSystemAppServer200Response>() {};
        return apiClient.invokeAPI("/app-system/{name}/generate-token", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate JWT token for app system backend
     * Generate JWT token for authenticated communication with the app server
     * <p><b>200</b> - 
     * @param name Name of the app
     * @param body The body parameter
     * @return GenerateJWTAppSystemAppServer200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GenerateJWTAppSystemAppServer200Response> generateJWTAppSystemAppServer(String name, Object body) throws WebClientResponseException {
        ParameterizedTypeReference<GenerateJWTAppSystemAppServer200Response> localVarReturnType = new ParameterizedTypeReference<GenerateJWTAppSystemAppServer200Response>() {};
        return generateJWTAppSystemAppServerRequestCreation(name, body).bodyToMono(localVarReturnType);
    }

    /**
     * Generate JWT token for app system backend
     * Generate JWT token for authenticated communication with the app server
     * <p><b>200</b> - 
     * @param name Name of the app
     * @param body The body parameter
     * @return ResponseEntity&lt;GenerateJWTAppSystemAppServer200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GenerateJWTAppSystemAppServer200Response>> generateJWTAppSystemAppServerWithHttpInfo(String name, Object body) throws WebClientResponseException {
        ParameterizedTypeReference<GenerateJWTAppSystemAppServer200Response> localVarReturnType = new ParameterizedTypeReference<GenerateJWTAppSystemAppServer200Response>() {};
        return generateJWTAppSystemAppServerRequestCreation(name, body).toEntity(localVarReturnType);
    }

    /**
     * Generate JWT token for app system backend
     * Generate JWT token for authenticated communication with the app server
     * <p><b>200</b> - 
     * @param name Name of the app
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec generateJWTAppSystemAppServerWithResponseSpec(String name, Object body) throws WebClientResponseException {
        return generateJWTAppSystemAppServerRequestCreation(name, body);
    }
}
