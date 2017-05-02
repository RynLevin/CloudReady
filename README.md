# CloudReady

##  How to Install SonarQube 
In order to install SonarQube, begin by following this link (https://docs.sonarqube.org/display/SONAR/Get+Started+in+Two+Minutes).

Follow this step by step along with their guide

 

1.) begin by downloading the SonarQube Client and unpacking the zip file in the proper directory.

2.) From this point, you have officially installed SonarQube and only need to Install the Scanner.

2a.) Before you download the Scanner, check to see if the Server is working
Run one of these two commands based on your operating system’s CLI.

### On Windows, execute:
```
FileDirectory_You_Put_sonarqube_In\sonarqube\bin\windows-x86-xx\StartSonar.bat
 ```
### On other operating system, execute:
```
/etc/sonarqube/bin/[OS]/sonar.sh console
```
#### OPTIONAL ISSUES
[Your program should have the SonarQube server running. It is possible that it does not work. One common issue that occurs is that the port number that sonarqube defaults to is set as a default value might be in use already. If that is so, The port it searches will have to be changed. 

2b.) In order to change the port number, located in sonarqube/conf/sonar is a file named “sonar” that contains information for the server. Located at Line 213 is a Elasticsearch option. As you can read, it shows that sonarqube defaults it’s port at 9001. If you want to use a free port, you can change the value of “sonar.search.port=_____” to 0. If a # sign is infront of this line, delete it or sonarqube will ignore your change and continue on normally.
]

3.) At this point you should have sonarqube working. If you are able to run the server, then you can move on to the next step, downloading the scanner and unzip it in the same directory that you unpacked the Sonarqube server.

4.) Either Download their sample project or put in one of your own in the same directory as the previous two downloads.

5.) You should be able to analyze the project now.

### On Windows:
 ```
 cd C:\sonar-scanning-examples\sonarqube-scanner
 C:\sonar-scanner\bin\sonar-scanner.bat
 ```
### On other operating system:
 ```
 cd /etc/sonar-scanning-examples/sonarqube-scanner
 /etc/sonar-scanner/bin/sonar-scanner
```

6.) You can now see the results of your scan. If you had to change the port number from the defaulted area, change “https://localhost:9000” to the appropriate port number.
