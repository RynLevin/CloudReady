At: org.sonar.samples.java.checks.WriteToLoggerRule

# Rule 026- Writing Log Files

```
https://12factor.net/logs
```

A twelve-factor app never concerns itself with routing or storage of its output stream.
It should not attempt to write to or manage logfiles. Instead, each running process writes its event stream, unbuffered, to stdout. During local development, the developer will view this stream in the foreground of their terminal to observe the app�s behavior.