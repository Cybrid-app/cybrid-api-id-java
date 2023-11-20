package app.cybrid.cybrid_api_id.client.api;

import app.cybrid.cybrid_api_id.client.ApiClient;

import app.cybrid.cybrid_api_id.client.model.ErrorResponseIdpModel;
import app.cybrid.cybrid_api_id.client.model.PostUserIdpModel;
import app.cybrid.cybrid_api_id.client.model.UserIdpModel;
import app.cybrid.cybrid_api_id.client.model.UserListIdpModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T15:51:27.259495Z[Etc/UTC]")
public class UsersIdpApi {
    private ApiClient apiClient;

    public UsersIdpApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersIdpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create user
     * Creates a user.  
     * <p><b>201</b> - User created
     * @param postUserIdpModel The postUserIdpModel parameter
     * @return UserIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createUserRequestCreation(PostUserIdpModel postUserIdpModel) throws WebClientResponseException {
        Object postBody = postUserIdpModel;
        // verify the required parameter 'postUserIdpModel' is set
        if (postUserIdpModel == null) {
            throw new WebClientResponseException("Missing the required parameter 'postUserIdpModel' when calling createUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UserIdpModel> localVarReturnType = new ParameterizedTypeReference<UserIdpModel>() {};
        return apiClient.invokeAPI("/api/users", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create user
     * Creates a user.  
     * <p><b>201</b> - User created
     * @param postUserIdpModel The postUserIdpModel parameter
     * @return UserIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserIdpModel> createUser(PostUserIdpModel postUserIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<UserIdpModel> localVarReturnType = new ParameterizedTypeReference<UserIdpModel>() {};
        return createUserRequestCreation(postUserIdpModel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UserIdpModel>> createUserWithHttpInfo(PostUserIdpModel postUserIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<UserIdpModel> localVarReturnType = new ParameterizedTypeReference<UserIdpModel>() {};
        return createUserRequestCreation(postUserIdpModel).toEntity(localVarReturnType);
    }
    /**
     * Get User
     * Retrieves a user.  Required scope: **users:read**
     * <p><b>200</b> - user found
     * <p><b>401</b> - Unauthorized - Authentication failed, 
     * <p><b>403</b> - Invalid scope
     * <p><b>404</b> - user not found
     * @param userGuid Identifier for the user.
     * @return UserIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUserRequestCreation(String userGuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'userGuid' when calling getUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("user_guid", userGuid);

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

        ParameterizedTypeReference<UserIdpModel> localVarReturnType = new ParameterizedTypeReference<UserIdpModel>() {};
        return apiClient.invokeAPI("/api/users/{user_guid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get User
     * Retrieves a user.  Required scope: **users:read**
     * <p><b>200</b> - user found
     * <p><b>401</b> - Unauthorized - Authentication failed, 
     * <p><b>403</b> - Invalid scope
     * <p><b>404</b> - user not found
     * @param userGuid Identifier for the user.
     * @return UserIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserIdpModel> getUser(String userGuid) throws WebClientResponseException {
        ParameterizedTypeReference<UserIdpModel> localVarReturnType = new ParameterizedTypeReference<UserIdpModel>() {};
        return getUserRequestCreation(userGuid).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UserIdpModel>> getUserWithHttpInfo(String userGuid) throws WebClientResponseException {
        ParameterizedTypeReference<UserIdpModel> localVarReturnType = new ParameterizedTypeReference<UserIdpModel>() {};
        return getUserRequestCreation(userGuid).toEntity(localVarReturnType);
    }
    /**
     * List users
     * Retrieve a list users.  Required scope: **users:read**
     * <p><b>200</b> - list users
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @param guid Comma separated guids to list users for.
     * @return UserListIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listUserRequestCreation(java.math.BigInteger page, java.math.BigInteger perPage, String guid) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guid", guid));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<UserListIdpModel> localVarReturnType = new ParameterizedTypeReference<UserListIdpModel>() {};
        return apiClient.invokeAPI("/api/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List users
     * Retrieve a list users.  Required scope: **users:read**
     * <p><b>200</b> - list users
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @param guid Comma separated guids to list users for.
     * @return UserListIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserListIdpModel> listUser(java.math.BigInteger page, java.math.BigInteger perPage, String guid) throws WebClientResponseException {
        ParameterizedTypeReference<UserListIdpModel> localVarReturnType = new ParameterizedTypeReference<UserListIdpModel>() {};
        return listUserRequestCreation(page, perPage, guid).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UserListIdpModel>> listUserWithHttpInfo(java.math.BigInteger page, java.math.BigInteger perPage, String guid) throws WebClientResponseException {
        ParameterizedTypeReference<UserListIdpModel> localVarReturnType = new ParameterizedTypeReference<UserListIdpModel>() {};
        return listUserRequestCreation(page, perPage, guid).toEntity(localVarReturnType);
    }
}
