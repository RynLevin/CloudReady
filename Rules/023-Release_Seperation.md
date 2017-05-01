Block: Needs an ability to scan Maven file system

# Rule 023- Release Seperation

```
https://12factor.net/build-release-run
```

The release stage takes the build produced by the build stage and combines it with the deploy’s current config. 
The resulting release contains both the build and the config and is ready for immediate execution in the execution
environment.

This is strictly followed by the 12 factors.