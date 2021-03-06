Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 13: AddCache Minimum

From AWS:
```
 http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddCache.html
```

"AddCache

Configures one or more gateway local disks as cache for a cached volumes gateway.
This operation is only supported in the cached volumes gateway architecture (see Storage Gateway Concepts).

In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache,
 and one or more disk IDs that you want to configure as cache."

So in order to use AddCache, it requires that you supply the GatewayARN and atleast one diskID.

Example Syntax:
```
{
   "DiskIds": [ "string" ],
   "GatewayARN": "string"
}
```

Below is some information about these types.

DiskIds
Type: array of Strings

Length Constraints: Minimum length of 1. Maximum length of 300.

Required: Yes

GatewayARN
The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and region.

Type: String

Length Constraints: Minimum length of 50. Maximum length of 500.

Required: Yes

