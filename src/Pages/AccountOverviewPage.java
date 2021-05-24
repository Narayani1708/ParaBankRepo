package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountOverviewPage extends Base{
	
	WebDriver driver = null;
	
	public AccountOverviewPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	WebElement accountOverview;
	WebElement activityLink;
	WebElement goBtn;
	
	WebElement activityDropdown;
	
	
	WebElement typeDropDown;
	
	
	public void accountOverview() throws InterruptedException {
		accountOverview = driver.findElement(By.linkText("Accounts Overview"));
		accountOverview.click();
		Thread.sleep(2000);
		activityLink = driver.findElement(By.xpath("//table[@id='accountTable']//a[contains(@href,'id')][1]"));
		activityLink.click();
		Thread.sleep(2000);
		activityDropdown = driver.findElement(By.id("month"));
		Select monthDrpDwn = new Select(activityDropdown);
		monthDrpDwn.selectByValue("May");
		typeDropDown = driver.findElement(By.id("transactionType"));
		Select transactionDrpDwn = new Select(this.typeDropDown);
		transactionDrpDwn.selectByValue("Credit");
		Thread.sleep(1000);
		goBtn = driver.findElement(By.xpath("//input[@type=\"submit\" and @value = \"Go\"]"));
		goBtn.click();
		Thread.sleep(2000);
		
		
	}

}
