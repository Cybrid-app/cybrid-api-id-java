# BankApplicationsIdpApi

All URIs are relative to *https://id.sandbox.cybrid.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBankApplication**](BankApplicationsIdpApi.md#createBankApplication) | **POST** /api/bank_applications | Create bank application |
| [**deleteBankApplication**](BankApplicationsIdpApi.md#deleteBankApplication) | **DELETE** /api/bank_applications/{client_id} | Delete bank application |
| [**listBankApplications**](BankApplicationsIdpApi.md#listBankApplications) | **GET** /api/bank_applications | List bank applications |



## createBankApplication

> ApplicationWithSecretIdpModel createBankApplication(postBankApplicationIdpModel)

Create bank application

Creates a bank OAuth2 application.  Required scope: **bank_applications:execute**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.BankApplicationsIdpApi;

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

        BankApplicationsIdpApi apiInstance = new BankApplicationsIdpApi(defaultClient);
        PostBankApplicationIdpModel postBankApplicationIdpModel = new PostBankApplicationIdpModel(); // PostBankApplicationIdpModel | 
        try {
            ApplicationWithSecretIdpModel result = apiInstance.createBankApplication(postBankApplicationIdpModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BankApplicationsIdpApi#createBankApplication");
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
| **postBankApplicationIdpModel** | [**PostBankApplicationIdpModel**](PostBankApplicationIdpModel.md)|  | |

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
| **201** | bank application created |  -  |


## deleteBankApplication

> deleteBankApplication(clientId)

Delete bank application

Deletes an application.Required scope: **bank_applications:execute**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.BankApplicationsIdpApi;

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

        BankApplicationsIdpApi apiInstance = new BankApplicationsIdpApi(defaultClient);
        String clientId = "clientId_example"; // String | Identifier for the application.
        try {
            apiInstance.deleteBankApplication(clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BankApplicationsIdpApi#deleteBankApplication");
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


## listBankApplications

> ApplicationListIdpModel listBankApplications(page, perPage, bankGuid)

List bank applications

Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.BankApplicationsIdpApi;

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

        BankApplicationsIdpApi apiInstance = new BankApplicationsIdpApi(defaultClient);
        java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | The page index to retrieve.
        java.math.BigInteger perPage = new java.math.BigInteger(); // java.math.BigInteger | The number of entities per page to return.
        String bankGuid = "bankGuid_example"; // String | Bank guid to list applications for.
        try {
            ApplicationListIdpModel result = apiInstance.listBankApplications(page, perPage, bankGuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BankApplicationsIdpApi#listBankApplications");
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
| **bankGuid** | **String**| Bank guid to list applications for. | [optional] |

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
| **200** | list bank applications |  -  |

