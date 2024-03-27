package app.cybrid.cybrid_api_id.client.api;

import app.cybrid.cybrid_api_id.client.ApiClient;

import app.cybrid.cybrid_api_id.client.model.ErrorResponseIdpModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T14:07:20.312003Z[Etc/UTC]")
public class ApplicationsIdpApi {
    private ApiClient apiClient;

    public ApplicationsIdpApi() {
        this(new ApiClient());
    }

    @Autowired
    public ApplicationsIdpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete Application
     * Deletes an application.Required scope: **bank_applications:execute**
     * <p><b>204</b> - Application discarded
     * <p><b>403</b> - Invalid scope
     * <p><b>404</b> - application not found
     * <p><b>401</b> - Unauthorized - Authentication failed, 
     * @param clientId Identifier for the application.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteBankApplicationRequestCreation(String clientId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientId' when calling deleteBankApplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("client_id", clientId);

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

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/bank_applications/{client_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Application
     * Deletes an application.Required scope: **bank_applications:execute**
     * <p><b>204</b> - Application discarded
     * <p><b>403</b> - Invalid scope
     * <p><b>404</b> - application not found
     * <p><b>401</b> - Unauthorized - Authentication failed, 
     * @param clientId Identifier for the application.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteBankApplication(String clientId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteBankApplicationRequestCreation(clientId).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Void>> deleteBankApplicationWithHttpInfo(String clientId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteBankApplicationRequestCreation(clientId).toEntity(localVarReturnType);
    }
    /**
     * Delete Application
     * Deletes an application.Required scope: **organization_applications:execute**
     * <p><b>204</b> - Application disacarded
     * <p><b>401</b> - Unauthorized - Authentication failed, 
     * <p><b>403</b> - Invalid scope
     * <p><b>404</b> - application not found
     * @param clientId Identifier for the application.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteOrganizationApplicationRequestCreation(String clientId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientId' when calling deleteOrganizationApplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("client_id", clientId);

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

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/organization_applications/{client_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Application
     * Deletes an application.Required scope: **organization_applications:execute**
     * <p><b>204</b> - Application disacarded
     * <p><b>401</b> - Unauthorized - Authentication failed, 
     * <p><b>403</b> - Invalid scope
     * <p><b>404</b> - application not found
     * @param clientId Identifier for the application.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteOrganizationApplication(String clientId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteOrganizationApplicationRequestCreation(clientId).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Void>> deleteOrganizationApplicationWithHttpInfo(String clientId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteOrganizationApplicationRequestCreation(clientId).toEntity(localVarReturnType);
    }
}
