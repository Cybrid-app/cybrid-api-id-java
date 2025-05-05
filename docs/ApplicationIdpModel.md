

# ApplicationIdpModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name provided for the OAuth2 application. |  |
|**clientId** | **String** | The OAuth2 application&#39;s client ID. |  |
|**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) | List of the scopes granted to the OAuth2 application. |  |
|**createdAt** | **OffsetDateTime** | ISO8601 datetime the record was created at. |  |
|**updatedAt** | **OffsetDateTime** | ISO8601 datetime the record was last updated at. |  [optional] |



## Enum: List&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| ACCOUNTS_EXECUTE | &quot;accounts:execute&quot; |
| ACCOUNTS_READ | &quot;accounts:read&quot; |
| BANK_APPLICATIONS_EXECUTE | &quot;bank_applications:execute&quot; |
| BANKS_EXECUTE | &quot;banks:execute&quot; |
| BANKS_READ | &quot;banks:read&quot; |
| BANKS_WRITE | &quot;banks:write&quot; |
| COUNTERPARTIES_EXECUTE | &quot;counterparties:execute&quot; |
| COUNTERPARTIES_PII_READ | &quot;counterparties:pii:read&quot; |
| COUNTERPARTIES_READ | &quot;counterparties:read&quot; |
| COUNTERPARTIES_WRITE | &quot;counterparties:write&quot; |
| CUSTOMERS_EXECUTE | &quot;customers:execute&quot; |
| CUSTOMERS_PII_READ | &quot;customers:pii:read&quot; |
| CUSTOMERS_READ | &quot;customers:read&quot; |
| CUSTOMERS_WRITE | &quot;customers:write&quot; |
| DEPOSIT_ADDRESSES_EXECUTE | &quot;deposit_addresses:execute&quot; |
| DEPOSIT_ADDRESSES_READ | &quot;deposit_addresses:read&quot; |
| DEPOSIT_BANK_ACCOUNTS_EXECUTE | &quot;deposit_bank_accounts:execute&quot; |
| DEPOSIT_BANK_ACCOUNTS_READ | &quot;deposit_bank_accounts:read&quot; |
| EXTERNAL_BANK_ACCOUNTS_EXECUTE | &quot;external_bank_accounts:execute&quot; |
| EXTERNAL_BANK_ACCOUNTS_PII_READ | &quot;external_bank_accounts:pii:read&quot; |
| EXTERNAL_BANK_ACCOUNTS_READ | &quot;external_bank_accounts:read&quot; |
| EXTERNAL_BANK_ACCOUNTS_WRITE | &quot;external_bank_accounts:write&quot; |
| EXTERNAL_WALLETS_EXECUTE | &quot;external_wallets:execute&quot; |
| EXTERNAL_WALLETS_READ | &quot;external_wallets:read&quot; |
| FILES_EXECUTE | &quot;files:execute&quot; |
| FILES_PII_READ | &quot;files:pii:read&quot; |
| FILES_READ | &quot;files:read&quot; |
| IDENTITY_VERIFICATIONS_EXECUTE | &quot;identity_verifications:execute&quot; |
| IDENTITY_VERIFICATIONS_PII_READ | &quot;identity_verifications:pii:read&quot; |
| IDENTITY_VERIFICATIONS_READ | &quot;identity_verifications:read&quot; |
| IDENTITY_VERIFICATIONS_WRITE | &quot;identity_verifications:write&quot; |
| INVOICES_EXECUTE | &quot;invoices:execute&quot; |
| INVOICES_READ | &quot;invoices:read&quot; |
| INVOICES_WRITE | &quot;invoices:write&quot; |
| ORGANIZATION_APPLICATIONS_EXECUTE | &quot;organization_applications:execute&quot; |
| ORGANIZATIONS_READ | &quot;organizations:read&quot; |
| ORGANIZATIONS_WRITE | &quot;organizations:write&quot; |
| PRICES_READ | &quot;prices:read&quot; |
| QUOTES_EXECUTE | &quot;quotes:execute&quot; |
| QUOTES_READ | &quot;quotes:read&quot; |
| SUBSCRIPTION_EVENTS_EXECUTE | &quot;subscription_events:execute&quot; |
| SUBSCRIPTION_EVENTS_READ | &quot;subscription_events:read&quot; |
| SUBSCRIPTIONS_EXECUTE | &quot;subscriptions:execute&quot; |
| SUBSCRIPTIONS_READ | &quot;subscriptions:read&quot; |
| SUBSCRIPTIONS_WRITE | &quot;subscriptions:write&quot; |
| TRADES_EXECUTE | &quot;trades:execute&quot; |
| TRADES_READ | &quot;trades:read&quot; |
| TRANSFERS_EXECUTE | &quot;transfers:execute&quot; |
| TRANSFERS_READ | &quot;transfers:read&quot; |
| TRANSFERS_WRITE | &quot;transfers:write&quot; |
| USERS_EXECUTE | &quot;users:execute&quot; |
| USERS_READ | &quot;users:read&quot; |
| WORKFLOWS_EXECUTE | &quot;workflows:execute&quot; |
| WORKFLOWS_READ | &quot;workflows:read&quot; |



