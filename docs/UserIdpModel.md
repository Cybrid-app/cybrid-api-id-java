

# UserIdpModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**guid** | **String** | Auto-generated unique identifier for the user. |  [optional] |
|**username** | **String** | The user&#39;s username. |  [optional] |
|**email** | **String** | The user&#39;s email address. |  [optional] |
|**allowedScopes** | [**Set&lt;AllowedScopesEnum&gt;**](#Set&lt;AllowedScopesEnum&gt;) | The list of scopes that the user is allowed to request. |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO8601 datetime the record was created at. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO8601 datetime the record was last updated at. |  [optional] |



## Enum: Set&lt;AllowedScopesEnum&gt;

| Name | Value |
|---- | -----|
| ORGANIZATIONS_READ | &quot;organizations:read&quot; |
| ORGANIZATIONS_WRITE | &quot;organizations:write&quot; |
| ORGANIZATION_APPLICATIONS_EXECUTE | &quot;organization_applications:execute&quot; |
| BANKS_READ | &quot;banks:read&quot; |
| BANKS_WRITE | &quot;banks:write&quot; |
| BANKS_EXECUTE | &quot;banks:execute&quot; |
| BANK_APPLICATIONS_EXECUTE | &quot;bank_applications:execute&quot; |
| USERS_READ | &quot;users:read&quot; |
| USERS_EXECUTE | &quot;users:execute&quot; |
| ACCOUNTS_READ | &quot;accounts:read&quot; |
| ACCOUNTS_EXECUTE | &quot;accounts:execute&quot; |
| COUNTERPARTIES_READ | &quot;counterparties:read&quot; |
| COUNTERPARTIES_WRITE | &quot;counterparties:write&quot; |
| COUNTERPARTIES_EXECUTE | &quot;counterparties:execute&quot; |
| CUSTOMERS_READ | &quot;customers:read&quot; |
| CUSTOMERS_WRITE | &quot;customers:write&quot; |
| CUSTOMERS_EXECUTE | &quot;customers:execute&quot; |
| PRICES_READ | &quot;prices:read&quot; |
| QUOTES_EXECUTE | &quot;quotes:execute&quot; |
| QUOTES_READ | &quot;quotes:read&quot; |
| TRADES_EXECUTE | &quot;trades:execute&quot; |
| TRADES_READ | &quot;trades:read&quot; |
| TRANSFERS_EXECUTE | &quot;transfers:execute&quot; |
| TRANSFERS_READ | &quot;transfers:read&quot; |
| TRANSFERS_WRITE | &quot;transfers:write&quot; |
| EXTERNAL_BANK_ACCOUNTS_READ | &quot;external_bank_accounts:read&quot; |
| EXTERNAL_BANK_ACCOUNTS_WRITE | &quot;external_bank_accounts:write&quot; |
| EXTERNAL_BANK_ACCOUNTS_EXECUTE | &quot;external_bank_accounts:execute&quot; |
| EXTERNAL_WALLETS_READ | &quot;external_wallets:read&quot; |
| EXTERNAL_WALLETS_EXECUTE | &quot;external_wallets:execute&quot; |
| WORKFLOWS_READ | &quot;workflows:read&quot; |
| WORKFLOWS_EXECUTE | &quot;workflows:execute&quot; |
| DEPOSIT_ADDRESSES_READ | &quot;deposit_addresses:read&quot; |
| DEPOSIT_ADDRESSES_EXECUTE | &quot;deposit_addresses:execute&quot; |
| DEPOSIT_BANK_ACCOUNTS_READ | &quot;deposit_bank_accounts:read&quot; |
| DEPOSIT_BANK_ACCOUNTS_EXECUTE | &quot;deposit_bank_accounts:execute&quot; |
| INVOICES_READ | &quot;invoices:read&quot; |
| INVOICES_WRITE | &quot;invoices:write&quot; |
| INVOICES_EXECUTE | &quot;invoices:execute&quot; |
| SUBSCRIPTIONS_READ | &quot;subscriptions:read&quot; |
| SUBSCRIPTIONS_WRITE | &quot;subscriptions:write&quot; |
| SUBSCRIPTIONS_EXECUTE | &quot;subscriptions:execute&quot; |
| SUBSCRIPTION_EVENTS_READ | &quot;subscription_events:read&quot; |
| SUBSCRIPTION_EVENTS_EXECUTE | &quot;subscription_events:execute&quot; |
| IDENTITY_VERIFICATIONS_READ | &quot;identity_verifications:read&quot; |
| IDENTITY_VERIFICATIONS_WRITE | &quot;identity_verifications:write&quot; |
| IDENTITY_VERIFICATIONS_EXECUTE | &quot;identity_verifications:execute&quot; |
| FILES_READ | &quot;files:read&quot; |
| FILES_EXECUTE | &quot;files:execute&quot; |
| OPENID | &quot;openid&quot; |
| PROFILE | &quot;profile&quot; |
| EMAIL | &quot;email&quot; |



