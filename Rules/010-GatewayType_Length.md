Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 10: GatewayType Length

We have another String Length Rule

```
http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ActivateGateway.html#API_ActivateGateway_RequestSyntax
```

Here is a description from AWS and it's requirements

"A value that defines the type of gateway to activate. 
The type specified is critical to all later functions of the gateway 
and cannot be changed after activation. The default value is STORED.

Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"

Type: String

Length Constraints: Minimum length of 2. Maximum length of 20.

Required: No"

