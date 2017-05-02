class MyClass {
	int x = 4;
	String a = "1.3.5";
	File file = new File("Test");
	String newString = "192.186.5.111";  // Noncompliant
	Hello hello = new Hello("Hellow");
	File test = new File("192.192.192.192"); // Noncompliant
	int foo(int x) { return 4; }
}