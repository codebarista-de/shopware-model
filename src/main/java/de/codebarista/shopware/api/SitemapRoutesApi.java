package de.codebarista.shopware.api;

import de.codebarista.shopware.ApiClient;
import de.codebarista.shopware.model.Criteria;
import de.codebarista.shopware.model.ReadSeoUrl200Response;
import de.codebarista.shopware.model.Sitemap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
public class SitemapRoutesApi {
    private ApiClient apiClient;

    public SitemapRoutesApi() {
        this(new ApiClient());
    }

    @Autowired
    public SitemapRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
     * Fetch sitemaps
     * Fetches a list of compressed sitemap files, which are often used by search engines.
     * <p><b>200</b> - Returns a list of available sitemaps.
     * @return List&lt;Sitemap&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec readSitemapRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<Sitemap> localVarReturnType = new ParameterizedTypeReference<Sitemap>() {};
        return apiClient.invokeAPI("/sitemap", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fetch sitemaps
     * Fetches a list of compressed sitemap files, which are often used by search engines.
     * <p><b>200</b> - Returns a list of available sitemaps.
     * @return List&lt;Sitemap&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Sitemap> readSitemap() throws WebClientResponseException {
        ParameterizedTypeReference<Sitemap> localVarReturnType = new ParameterizedTypeReference<Sitemap>() {};
        return readSitemapRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Fetch sitemaps
     * Fetches a list of compressed sitemap files, which are often used by search engines.
     * <p><b>200</b> - Returns a list of available sitemaps.
     * @return ResponseEntity&lt;List&lt;Sitemap&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Sitemap>>> readSitemapWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Sitemap> localVarReturnType = new ParameterizedTypeReference<Sitemap>() {};
        return readSitemapRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Fetch sitemaps
     * Fetches a list of compressed sitemap files, which are often used by search engines.
     * <p><b>200</b> - Returns a list of available sitemaps.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec readSitemapWithResponseSpec() throws WebClientResponseException {
        return readSitemapRequestCreation();
    }
}
