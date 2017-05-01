Block: This Rule requires a Json Scanner, found in the JavaScript Plugin.

# Rule 014: AddTagsToResource Maximum

```
http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddTagsToResource.html
```

"Adds one or more tags to the specified resource. You use tags to add metadata to resources,
 which you can use to categorize these resources. For example, you can categorize resources by 
purpose, owner, environment, or team. Each tag consists of a key and a value, which you define. 
You can add tags to the following AWS Storage Gateway resources:


-Storage gateways of all types

-Storage Volumes

-Virtual Tapes"

More Importantly: 

"You can create a maximum of 10 tags for each resource. 
Virtual tapes and storage volumes that are recovered to a new gateway maintain their tags."

You can only have 10 tags for a resource. 

The link provided at the top shows the syntax. 

It does not state there is a minimum.
