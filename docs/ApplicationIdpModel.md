

# ApplicationIdpModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name provided for the OAuth2 application. | 
**clientId** | **String** | The OAuth2 application&#39;s client ID. | 
**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) | List of the scopes granted to the OAuth2 application. | 
**createdAt** | **OffsetDateTime** | ISO8601 datetime the application was created at. | 



## Enum: List&lt;ScopesEnum&gt;

Name | Value
---- | -----
ORGANIZATIONS_READ | &quot;organizations:read&quot;
ORGANIZATIONS_WRITE | &quot;organizations:write&quot;
BANKS_READ | &quot;banks:read&quot;
BANKS_WRITE | &quot;banks:write&quot;
BANKS_EXECUTE | &quot;banks:execute&quot;
CUSTOMERS_READ | &quot;customers:read&quot;
ACCOUNTS_READ | &quot;accounts:read&quot;
ACCOUNTS_EXECUTE | &quot;accounts:execute&quot;
CUSTOMERS_WRITE | &quot;customers:write&quot;
CUSTOMERS_EXECUTE | &quot;customers:execute&quot;
PRICES_READ | &quot;prices:read&quot;
QUOTES_EXECUTE | &quot;quotes:execute&quot;
QUOTES_READ | &quot;quotes:read&quot;
TRADES_EXECUTE | &quot;trades:execute&quot;
TRADES_READ | &quot;trades:read&quot;



