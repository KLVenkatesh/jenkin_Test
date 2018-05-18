package jenkin_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;

public class MavenJenkinTest extends BasePage {
	
	public MavenJenkinTest(WebDriver driver) {
		super(driver);
	}

	@Test
	public void testA() {
		Reporter.log("Executing testA",true);
		String etitle = driver.getTitle();
		System.out.println(etitle);
	}

}
