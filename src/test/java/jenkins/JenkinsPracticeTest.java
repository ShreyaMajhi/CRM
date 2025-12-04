package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	@Test
	public void jenkinsPracticeTest() {
		Reporter.log("Hi Jenkins", true);
		Reporter.log("Bye Jenkins", true);
	}

}
