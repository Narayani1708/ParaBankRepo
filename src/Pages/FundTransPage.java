package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FundTransPage extends Base{
	
	WebDriver driver = null;
	
	//web elements needed for fund transfer
	WebElement fundTransfer;
	WebElement amount;
	WebElement fromAccount;
	WebElement toAccount;
	WebElement transfer;
	WebElement message;
	
	public FundTransPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	WebElement fromAccountDropDown = driver.findElement(By.id("fromAccountId"));
//	Select frmActDrpDwn = new Select(fromAccountDropDown);
//	
//	WebElement toAccountDropDown = driver.findElement(By.id("toAccountId"));
//	Select toActDrpDwn = new Select(toAccountDropDown);  /* commented these as the to and from account drop down sometimes have values and sometime doesn't
	
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
			Thread.sleep(2000);
			//System.out.print("$"+this.amount+" has been transferred from account #"+this.fromAccount+" to account #"+this.toAccount); 
			return true;
		}
		
	}

