package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	@Test
	public void jenkinsPracticeTest() {
		Reporter.log("Hi Jenkin", true);
		Reporter.log("Bye Jenkin", true);
		Reporter.log("Hi Shreya", true);
	}

}
