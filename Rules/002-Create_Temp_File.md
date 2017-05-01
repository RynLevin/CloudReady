Status: To be implemented 

# Rule 2: 

"File.createTempFile" should not be used to create a directory

```
https://sonarqube.com/coding_rules#languages=java|q="file.createtempfile"
```

Temp files cannot be used to store information for between proccess's as proccess's may not be running on a shared file system
