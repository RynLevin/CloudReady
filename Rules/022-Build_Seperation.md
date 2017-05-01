Block: Needs an ability to scan Maven file system

# Rule 023- Build Seperation

```
https://12factor.net/build-release-run
```

The build stage is a transform which converts a code repo into an executable bundle known as a build. 
Using a version of the code at a commit specified by the deployment process, 
the build stage fetches vendors dependencies and compiles binaries and assets.

This is strictly followed by the 12 factors.