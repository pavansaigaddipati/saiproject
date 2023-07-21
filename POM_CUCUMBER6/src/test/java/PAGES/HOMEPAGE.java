package PAGES;

import org.openqa.selenium.WebDriver;

public class HOMEPAGE {
	
	
	WebDriver driver;
	
	
	public void HOMEPAGE(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void Logout()
	{
		driver.close();
	}

}
