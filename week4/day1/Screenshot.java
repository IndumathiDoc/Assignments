package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(frame1);
		WebElement clickElement = driver.findElement(By.xpath("//button[@id='Click']"));
		clickElement.click();
		File source = clickElement.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/click.png");
		FileUtils.copyFile(source, destination);
		driver.switchTo().defaultContent();
		
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames: "+noOfFrames.size());
		
	}

}
