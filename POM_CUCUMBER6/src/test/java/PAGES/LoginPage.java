package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	//Object Repository
		String loginbutton="//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
		
		
	
	public void LoginPage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void Login(String UserName,String PassWord)
	{
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(PassWord);
		driver.findElement(By.xpath(loginbutton)).click();
	}

}
