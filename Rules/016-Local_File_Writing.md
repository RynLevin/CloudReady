At: org.sonar.samples.java.checks.WriteToLocalFileRule

# Rule 016 - Local File Writing

```
https://12factor.net/backing-services
```

Writing a Local File to a Cloud Platform is conceptually fine, but once the instance of the application terminates, the file goes with it.

It is possible that these local files might only be needed for a specific instance of the application, but we should flag the user when the scanner spots file writing

Ideal Solution:

Any lines of code that involve writing to a local file should warn the user that the file will not exist after the application finishes and that this data should be stored in a Database as an attached resource.
