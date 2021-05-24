package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.AccountOverviewPage;
import Pages.Base;
import Pages.LoginPage;

public class AccountOverviewTest extends Base{
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = initialize();
		
	}
	
	@Parameters({"username", "password"})
	@Test
	public void accountOverview(String username, String password) throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
		Assert.assertTrue(login.login(username, password));
		AccountOverviewPage actOvrvw = new AccountOverviewPage(driver);
		actOvrvw.accountOverview();
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
