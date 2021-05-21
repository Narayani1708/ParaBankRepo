package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	//public Base(WebDriver driver) {
	//	this.driver = driver;
	//}

	public WebDriver initialize() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\939326\\work\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		Thread.sleep(3000);
		System.out.print(driver.getTitle());
		
		return driver;

	}

}
