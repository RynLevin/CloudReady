File all the text descriptors of each rule and the status of the rule

# How To Make A Rule

#### To make a rule there will need to add a total of 5 files per rule, and edit a 6th existing file.

##### Create File 1: 
```
src/main/java/org/sonar/samples/java/checks/{ruleName}Rule.java
```
To implement a new rule there will be 2 important functions.  

```
nodesToVisit()
visitNode()
```

To help write these it is recommend to find a similar rule in their open-source GitHub and try to find the best way to implement your rule, or look at how it is implemented in one of our rules.

The nodesToVisit() function should be one line, and just tells it what kind of nodes to look at (look at the kind enum in the reference above, those are all of the different types you can tell it to look at)

The visitNode() function tells it what to look for in each node, and then will call the reportIssue() function if an issue is found.  

Each tree (depending on the type of node) has different methods to access different parts of the code, all found if you open the folder on their GitHub that hosts the kind enum.

##### Create File 2: 

```
src/test/java/org/sonar/samples/java/checks/{ruleName}Test.java
```

This file will be the same for every rule (except for rule name of course).  The one method in this class should be the following:
```
@Test
public void test() {
JavaCheckVerifier.verify("src/test/files/{ruleName}Test.java", new {ruleName}());
}
```
##### Create File 3: 
```
src/test/files/{ruleName}Test.java
```
This file should contain test cases, some which pass your test and some which fail.  For any line that fails the test, you should include the flag "// Noncompliant" after it so the compiler knows that it should expect that rule to fail

##### Create File 4: 
```
src/main/resources/org/sonar/i10n/java/rules/mycompany/{ruleName}.html
```
This is the HTML page that appears in SonarQube when you want to see what a rule does. 

##### Create File 5: 
```
src/main/resources/org/sonar/i10n/java/rules/mycompany/{ruleName}.json
```
This is the JSON file that helps tell the scanner information about the rule.  

##### Edit File: 
```
src/main/java/org/sonar/samples/java/checks/RulesList.java
```
Add the line 
```
  .add({ruleName}Rule.class)
```

to the getJavaChecks() function, it should be obvious where that line goes.

Once you have all of those files you want to run Maven Clean, then Maven Install.  That will generate a jar file in the target folder, and if you have SonarQube installed (which you all should) you can put that jar file in the {SonarHome}/extensions/plugins folder and you should be able to restart the server and see your rules.  If you log in with the admin/admin username/password, you can then find your rule in the rules list, select it, hit the activate button under quality profiles, and then your rule will be live.  You can then scan a dummy project that you create and it should flag your rule if you break it.
