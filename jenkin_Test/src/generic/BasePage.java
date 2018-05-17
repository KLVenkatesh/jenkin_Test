package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {

		public WebDriver driver;
		public WebDriverWait wait;
	
		public BasePage(WebDriver driver) 
		{
			this.driver=driver;
			wait=new WebDriverWait(driver, 10);
			PageFactory.initElements(driver, this);
		}
		
		public void verifyTitle(String eTitle) 
		{
			try{
				wait.until(ExpectedConditions.titleIs(eTitle));
				Reporter.log("Title is same",true);
				}
			catch(org.openqa.selenium.TimeoutException e){
				Reporter.log("Title is not same",true);
				Assert.fail();	
				}
		}
	}

