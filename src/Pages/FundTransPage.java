package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FundTransPage extends Base{
	
	WebDriver driver = null;
	
	//web elements needed for fund transfer
	WebElement fundTransfer;
	WebElement amount;
	WebElement fromAccount;
	WebElement toAccount;
	WebElement transfer;
	
	public FundTransPage(WebDriver driver) {
		this.driver = driver;
	}
		
		//method to transfer fund
		public boolean fundTrans(int amount) throws InterruptedException {
			fundTransfer = driver.findElement(By.linkText("Transfer Funds"));
			fundTransfer.click();
			Thread.sleep(2000); 
			this.amount = driver.findElement(By.id("amount"));
			this.amount.sendKeys(String.valueOf(amount));
			Thread.sleep(2000);
			transfer = driver.findElement(By.xpath("//input[@type = \"submit\" and @value = \"Transfer\"]"));
			transfer.click();
			return true;
		}
		
	}

