package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Base;
import Pages.LoginPage;

public class LoginTest extends Base{

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = initialize();
		
	}
	
	@Parameters({"username", "password"})
	@Test
	public void logIn(String username, String password) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		Assert.assertTrue(login.login(username, password));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
		
	}
	
