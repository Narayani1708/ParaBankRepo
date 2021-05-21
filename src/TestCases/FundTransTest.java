package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Pages.Base;
import Pages.FundTransPage;
import Pages.LoginPage;

public class FundTransTest extends Base{

	
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		driver = initialize();
		
	}

	
	@Parameters({"username", "password", "amount"})
	@Test
	public void fundTransfer(String username, String password, int amount) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		Assert.assertTrue(login.login(username, password));
		FundTransPage fundTrans = new FundTransPage(driver);
		Assert.assertTrue(fundTrans.fundTrans(amount));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
