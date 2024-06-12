# CustomerTokensIdpApi

All URIs are relative to *https://id.sandbox.cybrid.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomerToken**](CustomerTokensIdpApi.md#createCustomerToken) | **POST** /api/customer_tokens | Create customer access token |



## createCustomerToken

> CustomerTokenIdpModel createCustomerToken(postCustomerTokenIdpModel)

Create customer access token

Creates a customer JWT access token.  Required scopes: **customers:write** and **customers:read**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.CustomerTokensIdpApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://id.sandbox.cybrid.app");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CustomerTokensIdpApi apiInstance = new CustomerTokensIdpApi(defaultClient);
        PostCustomerTokenIdpModel postCustomerTokenIdpModel = new PostCustomerTokenIdpModel(); // PostCustomerTokenIdpModel | 
        try {
            CustomerTokenIdpModel result = apiInstance.createCustomerToken(postCustomerTokenIdpModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerTokensIdpApi#createCustomerToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postCustomerTokenIdpModel** | [**PostCustomerTokenIdpModel**](PostCustomerTokenIdpModel.md)|  | |

### Return type

[**CustomerTokenIdpModel**](CustomerTokenIdpModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Customer token created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

