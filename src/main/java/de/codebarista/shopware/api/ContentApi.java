package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.CmsPage;
import de.codebarista.shopware.model.LandingPage;
import de.codebarista.shopware.model.ReadCmsRequest;
import de.codebarista.shopware.model.ReadLandingPageRequest;
import de.codebarista.shopware.model.SendContactMailRequest;
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
public class ContentApi {
    private ApiClient apiClient;

    public ContentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ContentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Fetch and resolve a CMS page
     * Loads a content management page by its identifier and resolve the slot data. This could be media files, product listing and so on.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded cms page
     * <p><b>404</b> - Not Found
     * @param id Identifier of the CMS page to be resolved
     * @param readCmsRequest The readCmsRequest parameter
     * @return CmsPage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readCmsRequestCreation(String id, ReadCmsRequest readCmsRequest) throws WebClientResponseException {
        Object postBody = readCmsRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling readCms", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<CmsPage> localVarReturnType = new ParameterizedTypeReference<CmsPage>() {};
        return apiClient.invokeAPI("/cms/{id}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch and resolve a CMS page
     * Loads a content management page by its identifier and resolve the slot data. This could be media files, product listing and so on.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded cms page
     * <p><b>404</b> - Not Found
     * @param id Identifier of the CMS page to be resolved
     * @param readCmsRequest The readCmsRequest parameter
     * @return CmsPage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CmsPage> readCms(String id, ReadCmsRequest readCmsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CmsPage> localVarReturnType = new ParameterizedTypeReference<CmsPage>() {};
        return readCmsRequestCreation(id, readCmsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Fetch and resolve a CMS page
     * Loads a content management page by its identifier and resolve the slot data. This could be media files, product listing and so on.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded cms page
     * <p><b>404</b> - Not Found
     * @param id Identifier of the CMS page to be resolved
     * @param readCmsRequest The readCmsRequest parameter
     * @return ResponseEntity&lt;CmsPage&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CmsPage>> readCmsWithHttpInfo(String id, ReadCmsRequest readCmsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<CmsPage> localVarReturnType = new ParameterizedTypeReference<CmsPage>() {};
        return readCmsRequestCreation(id, readCmsRequest).toEntity(localVarReturnType);
    }

    /**
     * Fetch and resolve a CMS page
     * Loads a content management page by its identifier and resolve the slot data. This could be media files, product listing and so on.  **Important notice**  The criteria passed with this route also affects the listing, if there is one within the cms page.
     * <p><b>200</b> - The loaded cms page
     * <p><b>404</b> - Not Found
     * @param id Identifier of the CMS page to be resolved
     * @param readCmsRequest The readCmsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readCmsWithResponseSpec(String id, ReadCmsRequest readCmsRequest) throws WebClientResponseException {
        return readCmsRequestCreation(id, readCmsRequest);
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
     * Submit a contact form message
     * Used for submitting contact forms. Be aware that there can be more required fields, depending on the system settings.
     * <p><b>200</b> - Message sent successful.
     * @param sendContactMailRequest The sendContactMailRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec sendContactMailRequestCreation(SendContactMailRequest sendContactMailRequest) throws WebClientResponseException {
        Object postBody = sendContactMailRequest;
        // verify the required parameter 'sendContactMailRequest' is set
        if (sendContactMailRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'sendContactMailRequest' when calling sendContactMail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        return apiClient.invokeAPI("/contact-form", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Submit a contact form message
     * Used for submitting contact forms. Be aware that there can be more required fields, depending on the system settings.
     * <p><b>200</b> - Message sent successful.
     * @param sendContactMailRequest The sendContactMailRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> sendContactMail(SendContactMailRequest sendContactMailRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return sendContactMailRequestCreation(sendContactMailRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Submit a contact form message
     * Used for submitting contact forms. Be aware that there can be more required fields, depending on the system settings.
     * <p><b>200</b> - Message sent successful.
     * @param sendContactMailRequest The sendContactMailRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> sendContactMailWithHttpInfo(SendContactMailRequest sendContactMailRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return sendContactMailRequestCreation(sendContactMailRequest).toEntity(localVarReturnType);
    }

    /**
     * Submit a contact form message
     * Used for submitting contact forms. Be aware that there can be more required fields, depending on the system settings.
     * <p><b>200</b> - Message sent successful.
     * @param sendContactMailRequest The sendContactMailRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec sendContactMailWithResponseSpec(SendContactMailRequest sendContactMailRequest) throws WebClientResponseException {
        return sendContactMailRequestCreation(sendContactMailRequest);
    }
}
