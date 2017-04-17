package org.sonar.samples.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class WriteToLocalFileTest {
	
	@Test
	public void test() {
		JavaCheckVerifier.verify("src/test/files/WriteToLocalFileTest.java", new WriteToLocalFileRule());
	}
}
