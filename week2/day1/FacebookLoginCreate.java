package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginCreate {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Indu");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("reg_email__")).sendKeys("8034756059");
		driver.findElement(By.id("password_step_input")).sendKeys("Dude@123");
		
		WebElement drop1 = driver.findElement(By.id("day"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByValue("23");
		
		WebElement drop2 = driver.findElement(By.id("month"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByIndex(10);
		
		WebElement drop3 = driver.findElement(By.id("year"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByVisibleText("1994");
		
		driver.findElement(By.name("sex")).click();
		

	}

}
