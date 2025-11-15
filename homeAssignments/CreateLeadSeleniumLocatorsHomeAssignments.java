package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadSeleniumLocatorsHomeAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("SFA")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aishwarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pravin");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Analyst");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(6000);
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("landed in correct page : "+ title);
		}
			
			else {
				System.out.println("displayed in wrong page");
			}
		
		
		driver.close();

	}
	
}
