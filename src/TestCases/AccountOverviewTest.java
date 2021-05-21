package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Base;
import Pages.LoginPage;

public class AccountOverviewTest extends Base{
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = initialize();
		
	}
	
//	@Parameters
//	@Test
//	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
