package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aishwarya");
		driver.findElement(By.name("lastname")).sendKeys("Pravin");
		WebElement element = driver.findElement(By.name("birthday_day"));
		driver.findElement(By.id("password_step_input")).sendKeys("Pravin@0305");
		driver.findElement(By.name("reg_email__")).sendKeys("aishuadhi0305@gmail.com");
		Select ins=new Select(element);
		ins.selectByValue("5");
		WebElement element1 = driver.findElement(By.id("month"));
		Select ins1=new Select(element1);
		ins.selectByValue("11");
		WebElement element2 = driver.findElement(By.id("year"));
		Select ins2=new Select(element2);
		ins.selectByValue("2025");
		
		
		
		
		

	}
	
}
