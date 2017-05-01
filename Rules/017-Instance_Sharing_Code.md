Block: This rule requires a XML scanner which is in a Plugin called xpathsonarqube

# Rule 017- Instance Sharing Code

```
https://12factor.net/codebase
```

Multiple apps sharing the same code is a violation of twelve-factor. 
The solution here is to factor shared code into libraries which can be included through the dependency manager.
