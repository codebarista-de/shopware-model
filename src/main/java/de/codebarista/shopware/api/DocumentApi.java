package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.Document;
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
public class DocumentApi {
    private ApiClient apiClient;

    public DocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public DocumentApi(ApiClient apiClient) {
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
}
