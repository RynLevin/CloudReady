Block: Needs an ability to scan Maven file system

# Rule 025- Unique Release ID
```
https://12factor.net/build-release-run
```
Every release should always have a unique release ID,
 such as a timestamp of the release (such as 2011-04-06-20:32:17) or an incrementing number (such as v100).
 Releases are an append-only ledger and a release cannot be mutated once it is created. 
Any change must create a new release.

