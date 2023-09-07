package app.cybrid.cybrid_api_id.client.api;

import app.cybrid.cybrid_api_id.client.ApiClient;

import app.cybrid.cybrid_api_id.client.model.ApplicationListIdpModel;
import app.cybrid.cybrid_api_id.client.model.ApplicationWithSecretIdpModel;
import app.cybrid.cybrid_api_id.client.model.PostOrganizationApplicationIdpModel;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-07T18:35:16.641739Z[Etc/UTC]")
public class OrganizationApplicationsIdpApi {
    private ApiClient apiClient;

    public OrganizationApplicationsIdpApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrganizationApplicationsIdpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create organization application
     * Create an organization OAuth2 application.  Required scope: **organization_applications:execute**
     * <p><b>201</b> - organization application created
     * @param postOrganizationApplicationIdpModel The postOrganizationApplicationIdpModel parameter
     * @return ApplicationWithSecretIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createOrganizationApplicationRequestCreation(PostOrganizationApplicationIdpModel postOrganizationApplicationIdpModel) throws WebClientResponseException {
        Object postBody = postOrganizationApplicationIdpModel;
        // verify the required parameter 'postOrganizationApplicationIdpModel' is set
        if (postOrganizationApplicationIdpModel == null) {
            throw new WebClientResponseException("Missing the required parameter 'postOrganizationApplicationIdpModel' when calling createOrganizationApplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<ApplicationWithSecretIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationWithSecretIdpModel>() {};
        return apiClient.invokeAPI("/api/organization_applications", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create organization application
     * Create an organization OAuth2 application.  Required scope: **organization_applications:execute**
     * <p><b>201</b> - organization application created
     * @param postOrganizationApplicationIdpModel The postOrganizationApplicationIdpModel parameter
     * @return ApplicationWithSecretIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ApplicationWithSecretIdpModel> createOrganizationApplication(PostOrganizationApplicationIdpModel postOrganizationApplicationIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationWithSecretIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationWithSecretIdpModel>() {};
        return createOrganizationApplicationRequestCreation(postOrganizationApplicationIdpModel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ApplicationWithSecretIdpModel>> createOrganizationApplicationWithHttpInfo(PostOrganizationApplicationIdpModel postOrganizationApplicationIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationWithSecretIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationWithSecretIdpModel>() {};
        return createOrganizationApplicationRequestCreation(postOrganizationApplicationIdpModel).toEntity(localVarReturnType);
    }
    /**
     * List organization applications
     * Retrieve a list of organization OAuth2 applications.  Required scope: **organizations:read**
     * <p><b>200</b> - list organization applications
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @return ApplicationListIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listOrganizationApplicationsRequestCreation(java.math.BigInteger page, java.math.BigInteger perPage) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<ApplicationListIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationListIdpModel>() {};
        return apiClient.invokeAPI("/api/organization_applications", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List organization applications
     * Retrieve a list of organization OAuth2 applications.  Required scope: **organizations:read**
     * <p><b>200</b> - list organization applications
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @return ApplicationListIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ApplicationListIdpModel> listOrganizationApplications(java.math.BigInteger page, java.math.BigInteger perPage) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationListIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationListIdpModel>() {};
        return listOrganizationApplicationsRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ApplicationListIdpModel>> listOrganizationApplicationsWithHttpInfo(java.math.BigInteger page, java.math.BigInteger perPage) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationListIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationListIdpModel>() {};
        return listOrganizationApplicationsRequestCreation(page, perPage).toEntity(localVarReturnType);
    }
}
