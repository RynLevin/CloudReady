Reason: This is a C issue Java seems to be protected from this.

# Rule 027- Writing PID Files

```
https://12factor.net/concurrency
```

Twelve-factor app processes should never daemonize or write PID files. 
Instead, rely on the operating system's process manager (such as Upstart, a distributed process manager on a cloud platform, or a tool like Foreman in development) to manage output streams, respond to crashed processes,and handle user-initiated restarts and shutdowns.
