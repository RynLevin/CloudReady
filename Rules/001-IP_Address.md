Status: To be implemented 

# Rule 1: IP Addresses should not be hardcoded.

```
https://sonarqube.com/coding_rules#languages=java|q=ip address.
```

Documentation on the Inet Address
```
https://docs.oracle.com/javase/7/docs/api/java/net/InetAddress.html
```

Samples of how someone stores an IP
```
http://stackoverflow.com/questions/8677707/data-type-for-storing-ip-addresses
http://stackoverflow.com/questions/11689789/what-is-the-best-way-to-store-ip-addresses-in-application
```

This is impossible to do on the cloud since you aren't guaranteed a specific IP address in the cloud. 

Side note, there is another method to store IP addresses. Inet.