Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 3: Elastic IP Limits for AWS

Amazon Web Service offers Elastic IP addresses, so if one instance of it fails, another can be created by remapping it to another instance.

You are only allowed so many.

According to their site:

"By default, all AWS accounts are limited to 5 Elastic IP addresses per region, 
because public (IPv4) Internet addresses are a scarce public resource. 
We strongly encourage you to use an Elastic IP address primarily for the ability to remap
the address to another instance in the case of instance failure, and to use DNS hostnames 
for all other inter-node communication."

Documentation Link: 

```
http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html#using-instance-addressing-limit
```