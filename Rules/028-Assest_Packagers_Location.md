Block: Unknown Requirements

# Rule 028- Assest Packagers Location

```
https://12factor.net/processes
```
Asset packagers (such as Jammit or django-compressor) use the filesystem as a cache for compiled assets. 
A twelve-factor app prefers to do this compiling during the build stage, such as the Rails asset pipeline, rather than at runtime.