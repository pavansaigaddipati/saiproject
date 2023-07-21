package PAGES;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class SKILLS {
	
	WebDriver driver;
	
	public void SKILSS(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	
	public void AddSkills(DataTable dataTable) throws InterruptedException {
		
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Map<String, String>> SkillsData=dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<SkillsData.size();i++) {
			
			String SkillName=SkillsData.get(i).get("SKILLNAME");
			String SkillDescr=SkillsData.get(i).get("SKILLDESCR");
			
			System.out.println("____________________________");
			
			  driver.findElement(By.xpath("//span[text()='Admin']")).click();
			  driver. findElement(By.xpath("//span[text()='Qualifications ']")).click();
			  driver. findElement(By.xpath("//a[text()='Skills']")).click();
			  driver. findElement(By.xpath("//button[text()=' Add ']")).click();
			  
			  driver. findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
			  driver.  findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SkillDescr);
			  
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
	}
		
		
	}
	
	
	
	

}
