Status: To be implemented 

# Rule 021- Backing DBs

```
https://12factor.net/backing-services
```

Any Backing Resource, like a database for example, should be treated as an attached resource



Basic Documentation for connecting to a Database

```
https://docs.oracle.com/javase/tutorial/jdbc/basics/connecting.html
```

In this example, the program is using a Connection class, and using the method DriverManager.getconnection().

We should be aware that this is used for multiple types of connections. You could connect to either a Database or Twitter. 
