package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//switch to frame using webelement
		//WebElement frame1 = driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(frame1);
		
		//switch to frame using id
		driver.switchTo().frame("frame1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("FrameHandling");
		//driver.switchTo().defaultContent();
		//Thread.sleep(4000);
		driver.switchTo().frame("frame3");
		//driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("frame2");
		WebElement drop = driver.findElement(By.id("animals"));
		Select drpDwn = new Select(drop);
		drpDwn.selectByValue("avatar");
		driver.close();
		
	}

}
