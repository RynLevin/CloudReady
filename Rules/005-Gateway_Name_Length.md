Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 5: Gateway Name String Length

Information about Gateways:

[
A cloud storage gateway is a hardware- or software-based appliance located on the customer premises
 that serves as a bridge between local applications and remote cloud-based storage. 

A cloud storage gateway provides basic protocol translation and simple connectivity to allow the
incompatible technologies to communicate transparently. The gateway can make cloud storage appear
to be a NAS filer, a block storage array, a backup target or even an extension of the application itself.
]

You are required to have a Name for your Gateway. The problem is that some sites
have limits on how big the String can be.

For AWS, it is a string that has a minimum length of 2 characters and a Max length of 255.

Documentation Link : 
```
http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ActivateGateway.html#API_ActivateGateway_RequestSyntax
```