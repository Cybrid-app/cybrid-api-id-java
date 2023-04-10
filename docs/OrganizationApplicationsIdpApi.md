# OrganizationApplicationsIdpApi

All URIs are relative to *https://id.sandbox.cybrid.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrganizationApplication**](OrganizationApplicationsIdpApi.md#createOrganizationApplication) | **POST** /api/organization_applications | Create organization application |
| [**listOrganizationApplications**](OrganizationApplicationsIdpApi.md#listOrganizationApplications) | **GET** /api/organization_applications | List organization applications |



## createOrganizationApplication

> ApplicationWithSecretIdpModel createOrganizationApplication(postOrganizationApplicationIdpModel)

Create organization application

Create an organization OAuth2 application.  Required scope: **organizations:write**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.OrganizationApplicationsIdpApi;

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

        OrganizationApplicationsIdpApi apiInstance = new OrganizationApplicationsIdpApi(defaultClient);
        PostOrganizationApplicationIdpModel postOrganizationApplicationIdpModel = new PostOrganizationApplicationIdpModel(); // PostOrganizationApplicationIdpModel | 
        try {
            ApplicationWithSecretIdpModel result = apiInstance.createOrganizationApplication(postOrganizationApplicationIdpModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApplicationsIdpApi#createOrganizationApplication");
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
| **postOrganizationApplicationIdpModel** | [**PostOrganizationApplicationIdpModel**](PostOrganizationApplicationIdpModel.md)|  | |

### Return type

[**ApplicationWithSecretIdpModel**](ApplicationWithSecretIdpModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | organization application created |  -  |


## listOrganizationApplications

> ApplicationListIdpModel listOrganizationApplications(page, perPage)

List organization applications

Retrieve a list of organization OAuth2 applications.  Required scope: **organizations:read**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.OrganizationApplicationsIdpApi;

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

        OrganizationApplicationsIdpApi apiInstance = new OrganizationApplicationsIdpApi(defaultClient);
        java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | The page index to retrieve.
        java.math.BigInteger perPage = new java.math.BigInteger(); // java.math.BigInteger | The number of entities per page to return.
        try {
            ApplicationListIdpModel result = apiInstance.listOrganizationApplications(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApplicationsIdpApi#listOrganizationApplications");
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
| **page** | **java.math.BigInteger**| The page index to retrieve. | [optional] |
| **perPage** | **java.math.BigInteger**| The number of entities per page to return. | [optional] |

### Return type

[**ApplicationListIdpModel**](ApplicationListIdpModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list organization applications |  -  |

