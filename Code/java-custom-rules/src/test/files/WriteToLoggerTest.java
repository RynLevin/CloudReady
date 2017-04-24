import java.util.logging.Logger;

class MyClass {
	Logger logger = Logger.getLogger("arg1"); // Noncompliant
	Logger newlogger = Logger.getLogger("arg1", "arg2"); // Noncompliant
	int x = 4;
	Connection conn = DriverManager.getConnection(/* ... */);
}