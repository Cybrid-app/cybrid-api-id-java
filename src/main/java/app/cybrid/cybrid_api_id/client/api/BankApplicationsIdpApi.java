package app.cybrid.cybrid_api_id.client.api;

import app.cybrid.cybrid_api_id.client.ApiClient;

import app.cybrid.cybrid_api_id.client.model.ApplicationListIdpModel;
import app.cybrid.cybrid_api_id.client.model.ApplicationWithSecretIdpModel;
import app.cybrid.cybrid_api_id.client.model.ErrorResponseIdpModel;
import app.cybrid.cybrid_api_id.client.model.PostBankApplicationIdpModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:58:31.803190Z[Etc/UTC]")
public class BankApplicationsIdpApi {
    private ApiClient apiClient;

    public BankApplicationsIdpApi() {
        this(new ApiClient());
    }

    @Autowired
    public BankApplicationsIdpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create bank application
     * Creates a bank OAuth2 application.  Required scope: **bank_applications:execute**
     * <p><b>201</b> - bank application created
     * @param postBankApplicationIdpModel The postBankApplicationIdpModel parameter
     * @return ApplicationWithSecretIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createBankApplicationRequestCreation(PostBankApplicationIdpModel postBankApplicationIdpModel) throws WebClientResponseException {
        Object postBody = postBankApplicationIdpModel;
        // verify the required parameter 'postBankApplicationIdpModel' is set
        if (postBankApplicationIdpModel == null) {
            throw new WebClientResponseException("Missing the required parameter 'postBankApplicationIdpModel' when calling createBankApplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/api/bank_applications", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create bank application
     * Creates a bank OAuth2 application.  Required scope: **bank_applications:execute**
     * <p><b>201</b> - bank application created
     * @param postBankApplicationIdpModel The postBankApplicationIdpModel parameter
     * @return ApplicationWithSecretIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ApplicationWithSecretIdpModel> createBankApplication(PostBankApplicationIdpModel postBankApplicationIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationWithSecretIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationWithSecretIdpModel>() {};
        return createBankApplicationRequestCreation(postBankApplicationIdpModel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ApplicationWithSecretIdpModel>> createBankApplicationWithHttpInfo(PostBankApplicationIdpModel postBankApplicationIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationWithSecretIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationWithSecretIdpModel>() {};
        return createBankApplicationRequestCreation(postBankApplicationIdpModel).toEntity(localVarReturnType);
    }
    /**
     * Delete bank application
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
     * Delete bank application
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
     * List bank applications
     * Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**
     * <p><b>200</b> - list bank applications
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @param bankGuid Bank guid to list applications for.
     * @return ApplicationListIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listBankApplicationsRequestCreation(java.math.BigInteger page, java.math.BigInteger perPage, String bankGuid) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bank_guid", bankGuid));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<ApplicationListIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationListIdpModel>() {};
        return apiClient.invokeAPI("/api/bank_applications", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List bank applications
     * Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**
     * <p><b>200</b> - list bank applications
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @param bankGuid Bank guid to list applications for.
     * @return ApplicationListIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ApplicationListIdpModel> listBankApplications(java.math.BigInteger page, java.math.BigInteger perPage, String bankGuid) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationListIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationListIdpModel>() {};
        return listBankApplicationsRequestCreation(page, perPage, bankGuid).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ApplicationListIdpModel>> listBankApplicationsWithHttpInfo(java.math.BigInteger page, java.math.BigInteger perPage, String bankGuid) throws WebClientResponseException {
        ParameterizedTypeReference<ApplicationListIdpModel> localVarReturnType = new ParameterizedTypeReference<ApplicationListIdpModel>() {};
        return listBankApplicationsRequestCreation(page, perPage, bankGuid).toEntity(localVarReturnType);
    }
}
