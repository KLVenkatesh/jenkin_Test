package jenkin_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenJenkinTest {
	
	@Test
	public void testA() {
		Reporter.log("Executing testA",true);
	}

}
