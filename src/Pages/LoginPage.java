package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{
	WebDriver driver = null;
	
	//web elements for log in
	WebElement username;
	WebElement password;
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	
		
	//method to log in to the application	
	public boolean login(String username, String password) throws InterruptedException {
		this.username= driver.findElement(By.name("username"));
		this.password = driver.findElement(By.name("password"));
		loginButton = driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Log In\"]"));
			this.username.sendKeys(username);
			Thread.sleep(1000);
			this.password.sendKeys(password);
			Thread.sleep(1000);
			loginButton.click();
			Thread.sleep(1000);
			return true;
			
		}
		
	}

