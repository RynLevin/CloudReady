Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 8 - Activating a Gateway requirements

In order to activate a Gateway, you need a specific set of structures

in AWS: 

```
http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ActivateGateway.html#API_ActivateGateway_RequestSyntax
```

For their platform, in order to Activate a Gateway, you need seven strings to begin

You need:
```
 "ActivationKey": "string",
   "GatewayName": "string",
   "GatewayRegion": "string",
   "GatewayTimezone": "string",
   "GatewayType": "string",
   "MediumChangerType": "string",
   "TapeDriveType": "string"
```
If one of these strings is missing, you will not be able to activate a Gateway
