Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 015: AddUploadBuffer
```
http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddUploadBuffer.html
```

AddUploadBuffer

"Configures one or more gateway local disks as upload buffer for a specified gateway.
 This operation is supported for both the stored volumes and cached volumes gateway architectures."


"In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, 
and one or more disk IDs that you want to configure as upload buffer."

Sample Syntax

```
{
   "DiskIds": [ "string" ],
   "GatewayARN": "string"
}
```

In order for this action to work, you must supply the name of the ARN and atleast one diskID that you want to configure.

