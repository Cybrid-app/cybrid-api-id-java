

# PostCustomerTokenIdpModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerGuid** | **String** | Customer guid the access token is being generated for. |  |
|**scopes** | [**Set&lt;ScopesEnum&gt;**](#Set&lt;ScopesEnum&gt;) | List of the scopes requested for the access token. |  |



## Enum: Set&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| COUNTERPARTIES_READ | &quot;counterparties:read&quot; |
| COUNTERPARTIES_PII_READ | &quot;counterparties:pii:read&quot; |
| COUNTERPARTIES_WRITE | &quot;counterparties:write&quot; |
| COUNTERPARTIES_EXECUTE | &quot;counterparties:execute&quot; |
| CUSTOMERS_READ | &quot;customers:read&quot; |
| CUSTOMERS_PII_READ | &quot;customers:pii:read&quot; |
| CUSTOMERS_WRITE | &quot;customers:write&quot; |
| ACCOUNTS_READ | &quot;accounts:read&quot; |
| ACCOUNTS_EXECUTE | &quot;accounts:execute&quot; |
| PRICES_READ | &quot;prices:read&quot; |
| QUOTES_READ | &quot;quotes:read&quot; |
| QUOTES_EXECUTE | &quot;quotes:execute&quot; |
| TRADES_READ | &quot;trades:read&quot; |
| TRADES_EXECUTE | &quot;trades:execute&quot; |
| TRANSFERS_READ | &quot;transfers:read&quot; |
| TRANSFERS_WRITE | &quot;transfers:write&quot; |
| TRANSFERS_EXECUTE | &quot;transfers:execute&quot; |
| EXTERNAL_BANK_ACCOUNTS_READ | &quot;external_bank_accounts:read&quot; |
| EXTERNAL_BANK_ACCOUNTS_PII_READ | &quot;external_bank_accounts:pii:read&quot; |
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
| IDENTITY_VERIFICATIONS_READ | &quot;identity_verifications:read&quot; |
| IDENTITY_VERIFICATIONS_PII_READ | &quot;identity_verifications:pii:read&quot; |
| IDENTITY_VERIFICATIONS_WRITE | &quot;identity_verifications:write&quot; |
| IDENTITY_VERIFICATIONS_EXECUTE | &quot;identity_verifications:execute&quot; |
| PERSONA_SESSIONS_EXECUTE | &quot;persona_sessions:execute&quot; |



