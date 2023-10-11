# UsersIdpApi

All URIs are relative to *https://id.sandbox.cybrid.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UsersIdpApi.md#createUser) | **POST** /api/users | Create user |
| [**getUser**](UsersIdpApi.md#getUser) | **GET** /api/users/{user_guid} | Get User |
| [**listUser**](UsersIdpApi.md#listUser) | **GET** /api/users | List users |



## createUser

> UserIdpModel createUser(postUserIdpModel)

Create user

Creates a user.  

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.UsersIdpApi;

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

        UsersIdpApi apiInstance = new UsersIdpApi(defaultClient);
        PostUserIdpModel postUserIdpModel = new PostUserIdpModel(); // PostUserIdpModel | 
        try {
            UserIdpModel result = apiInstance.createUser(postUserIdpModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersIdpApi#createUser");
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
| **postUserIdpModel** | [**PostUserIdpModel**](PostUserIdpModel.md)|  | |

### Return type

[**UserIdpModel**](UserIdpModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User created |  -  |


## getUser

> UserIdpModel getUser(userGuid)

Get User

Retrieves a user.  Required scope: **users:read**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.UsersIdpApi;

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

        UsersIdpApi apiInstance = new UsersIdpApi(defaultClient);
        String userGuid = "userGuid_example"; // String | Identifier for the user.
        try {
            UserIdpModel result = apiInstance.getUser(userGuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersIdpApi#getUser");
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
| **userGuid** | **String**| Identifier for the user. | |

### Return type

[**UserIdpModel**](UserIdpModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | user found |  -  |
| **401** | Unauthorized - Authentication failed,  |  -  |
| **403** | Invalid scope |  -  |
| **404** | user not found |  -  |


## listUser

> UserListIdpModel listUser(page, perPage, guid)

List users

Retrieve a list users.  Required scope: **users:read**

### Example

```java
// Import classes:
import app.cybrid.cybrid_api_id.client.ApiClient;
import app.cybrid.cybrid_api_id.client.ApiException;
import app.cybrid.cybrid_api_id.client.Configuration;
import app.cybrid.cybrid_api_id.client.auth.*;
import app.cybrid.cybrid_api_id.client.models.*;
import app.cybrid.cybrid_api_id.client.api.UsersIdpApi;

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

        UsersIdpApi apiInstance = new UsersIdpApi(defaultClient);
        java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | The page index to retrieve.
        java.math.BigInteger perPage = new java.math.BigInteger(); // java.math.BigInteger | The number of entities per page to return.
        String guid = "guid_example"; // String | Comma separated guids to list users for.
        try {
            UserListIdpModel result = apiInstance.listUser(page, perPage, guid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersIdpApi#listUser");
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
| **guid** | **String**| Comma separated guids to list users for. | [optional] |

### Return type

[**UserListIdpModel**](UserListIdpModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list users |  -  |

