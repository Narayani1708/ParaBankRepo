package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountOverviewPage extends Base{
	
	WebDriver driver = null;
	
	WebElement accountOverview;
	
	public AccountOverviewPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void accountOverview() {
		accountOverview = driver.findElement(By.linkText("Accounts Overview"));
		accountOverview.click();
		
	}

}
