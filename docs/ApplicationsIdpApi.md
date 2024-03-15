# ApplicationsIdpApi

All URIs are relative to *https://id.sandbox.cybrid.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBankApplication**](ApplicationsIdpApi.md#deleteBankApplication) | **DELETE** /api/bank_applications/{client_id} | Delete Application |
| [**deleteOrganizationApplication**](ApplicationsIdpApi.md#deleteOrganizationApplication) | **DELETE** /api/organization_applications/{client_id} | Delete Application |



## deleteBankApplication

> deleteBankApplication(clientId)

Delete Application

Deletes an application.Required scope: **bank_applications:execute**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.ApplicationsIdpApi;

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

        ApplicationsIdpApi apiInstance = new ApplicationsIdpApi(defaultClient);
        String clientId = "clientId_example"; // String | Identifier for the application.
        try {
            apiInstance.deleteBankApplication(clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsIdpApi#deleteBankApplication");
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
| **clientId** | **String**| Identifier for the application. | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Application discarded |  -  |
| **403** | Invalid scope |  -  |
| **404** | application not found |  -  |
| **401** | Unauthorized - Authentication failed,  |  -  |


## deleteOrganizationApplication

> deleteOrganizationApplication(clientId)

Delete Application

Deletes an application.Required scope: **organization_applications:execute**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.ApplicationsIdpApi;

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

        ApplicationsIdpApi apiInstance = new ApplicationsIdpApi(defaultClient);
        String clientId = "clientId_example"; // String | Identifier for the application.
        try {
            apiInstance.deleteOrganizationApplication(clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsIdpApi#deleteOrganizationApplication");
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
| **clientId** | **String**| Identifier for the application. | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Application disacarded |  -  |
| **401** | Unauthorized - Authentication failed,  |  -  |
| **403** | Invalid scope |  -  |
| **404** | application not found |  -  |

