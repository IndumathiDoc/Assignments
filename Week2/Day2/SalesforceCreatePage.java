package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCreatePage {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.name("UserFirstName")).sendKeys("Indu");
		driver.findElement(By.name("UserLastName")).sendKeys("K");
		driver.findElement(By.name("UserEmail")).sendKeys("dhivya@gmail.com");
		
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select drp1 = new Select(jobtitle);
		drp1.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("HIIIS");
		
		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("250");
		
		driver.findElement(By.name("UserPhone")).sendKeys("80934597230");
		
		// driver.findElement(By.name("CompanyCountry")).clear();
		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByIndex(10);
		
		driver.findElement(By.className("checkbox-ui")).click();	
		driver.close();
		

	}

}
