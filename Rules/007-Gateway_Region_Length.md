Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 7: Gateway Region Length

According to AWS

Gateway Region is "A value that indicates the region where you want to store the snapshot backups. 
The gateway region specified must be the same region as the region in your Host header in the request."

This also has a min and max for the string length. AWS' min is 1 and its' max is 25.

```
http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ActivateGateway.html#API_ActivateGateway_RequestSyntax
```