package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumInteractionHomeAssignment {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("AishPravin");
		driver.findElement(By.name("description")).sendKeys("Selenium is testing tool");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select inp=new Select(element);
		inp.selectByValue("IND_SOFTWARE");
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select inp1=new Select(element2);
		inp1.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select inp2=new Select(element3);
		inp2.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select inp3=new Select(element4);
		inp3.selectByIndex(0);
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select inp4=new Select(element5);
		inp4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
