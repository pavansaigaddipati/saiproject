package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.HOMEPAGE;
import PAGES.LoginPage;
import PAGES.SKILLS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class All_Steps {
	
	WebDriver driver;
	
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		
		 	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			driver.manage().window().maximize() ;	
	

	}
	
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String TestURL) {

		driver.get(TestURL);
	}
	
	
	
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page(io.cucumber.datatable.DataTable dataTable) {
		
		LoginPage l1=new LoginPage();
		l1.LoginPage(driver);
		
		
		List<Map<String, String>> login=dataTable.asMaps(String.class,String.class);
		String username1=login.get(0).get("Username");
		String password1=login.get(0).get("Password");
		
		l1.Login(username1, password1);
		

	}
	
	
	
	@Then("Creted Skills Record")
	public void creted_skills_record(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		
		SKILLS s1=new SKILLS();
		s1.SKILSS(driver);
		s1.AddSkills(dataTable);
		
		
		
		
	}
	
	
	
	@When("Click on logout button")
	public void click_on_logout_button() {
		
		HOMEPAGE h1=new HOMEPAGE();
		h1.HOMEPAGE(driver);
		h1.Logout();


	}
	
	
	
	@Then("Close Browser")
	public void close_browser() {

			System.out.println("Exeuction Completed successfully");
	}
	

}
