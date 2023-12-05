package app.cybrid.cybrid_api_id.client.api;

import app.cybrid.cybrid_api_id.client.ApiClient;

import app.cybrid.cybrid_api_id.client.model.CustomerTokenIdpModel;
import app.cybrid.cybrid_api_id.client.model.PostCustomerTokenIdpModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-05T18:47:04.487101Z[Etc/UTC]")
public class CustomerTokensIdpApi {
    private ApiClient apiClient;

    public CustomerTokensIdpApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerTokensIdpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create customer access token
     * Creates a customer JWT access token.  Required scopes: **customers:write** and **customers:read**
     * <p><b>201</b> - Customer token created
     * @param postCustomerTokenIdpModel The postCustomerTokenIdpModel parameter
     * @return CustomerTokenIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCustomerTokenRequestCreation(PostCustomerTokenIdpModel postCustomerTokenIdpModel) throws WebClientResponseException {
        Object postBody = postCustomerTokenIdpModel;
        // verify the required parameter 'postCustomerTokenIdpModel' is set
        if (postCustomerTokenIdpModel == null) {
            throw new WebClientResponseException("Missing the required parameter 'postCustomerTokenIdpModel' when calling createCustomerToken", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CustomerTokenIdpModel> localVarReturnType = new ParameterizedTypeReference<CustomerTokenIdpModel>() {};
        return apiClient.invokeAPI("/api/customer_tokens", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create customer access token
     * Creates a customer JWT access token.  Required scopes: **customers:write** and **customers:read**
     * <p><b>201</b> - Customer token created
     * @param postCustomerTokenIdpModel The postCustomerTokenIdpModel parameter
     * @return CustomerTokenIdpModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomerTokenIdpModel> createCustomerToken(PostCustomerTokenIdpModel postCustomerTokenIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerTokenIdpModel> localVarReturnType = new ParameterizedTypeReference<CustomerTokenIdpModel>() {};
        return createCustomerTokenRequestCreation(postCustomerTokenIdpModel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CustomerTokenIdpModel>> createCustomerTokenWithHttpInfo(PostCustomerTokenIdpModel postCustomerTokenIdpModel) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerTokenIdpModel> localVarReturnType = new ParameterizedTypeReference<CustomerTokenIdpModel>() {};
        return createCustomerTokenRequestCreation(postCustomerTokenIdpModel).toEntity(localVarReturnType);
    }
}
