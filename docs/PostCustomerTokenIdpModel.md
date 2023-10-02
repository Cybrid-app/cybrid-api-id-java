

# PostCustomerTokenIdpModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerGuid** | **String** | Customer guid the access token is being generated for. |  |
|**scopes** | [**Set&lt;ScopesEnum&gt;**](#Set&lt;ScopesEnum&gt;) | List of the scopes requested for the access token. |  |



## Enum: Set&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| CUSTOMERS_READ | &quot;customers:read&quot; |
| CUSTOMERS_WRITE | &quot;customers:write&quot; |
| ACCOUNTS_READ | &quot;accounts:read&quot; |
| ACCOUNTS_EXECUTE | &quot;accounts:execute&quot; |
| PRICES_READ | &quot;prices:read&quot; |
| QUOTES_READ | &quot;quotes:read&quot; |
| QUOTES_EXECUTE | &quot;quotes:execute&quot; |
| TRADES_READ | &quot;trades:read&quot; |
| TRADES_EXECUTE | &quot;trades:execute&quot; |
| TRANSFERS_READ | &quot;transfers:read&quot; |
| TRANSFERS_EXECUTE | &quot;transfers:execute&quot; |
| EXTERNAL_BANK_ACCOUNTS_READ | &quot;external_bank_accounts:read&quot; |
| EXTERNAL_BANK_ACCOUNTS_WRITE | &quot;external_bank_accounts:write&quot; |
| EXTERNAL_BANK_ACCOUNTS_EXECUTE | &quot;external_bank_accounts:execute&quot; |
| EXTERNAL_WALLETS_READ | &quot;external_wallets:read&quot; |
| EXTERNAL_WALLETS_EXECUTE | &quot;external_wallets:execute&quot; |
| WORKFLOWS_READ | &quot;workflows:read&quot; |
| WORKFLOWS_EXECUTE | &quot;workflows:execute&quot; |
| DEPOSIT_ADDRESSES_READ | &quot;deposit_addresses:read&quot; |
| DEPOSIT_ADDRESSES_EXECUTE | &quot;deposit_addresses:execute&quot; |



