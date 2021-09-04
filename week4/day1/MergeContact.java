package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		// 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Merge Contacts")).click();
		// 7. Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		// 8. Click on First Resulting Contact
		Set<String> windowHandleSet = driver.getWindowHandles();
		List<String> windowHandleList = new ArrayList<String>(windowHandleSet);
		System.out.println("Number of windows:" + windowHandleList.size());
		driver.switchTo().window(windowHandleList.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(windowHandleList.get(0));
		// 9. Click on Widget of To Contact
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();

		Thread.sleep(2000);
		windowHandleSet = driver.getWindowHandles();
		windowHandleList = new ArrayList<String>(windowHandleSet);
		System.out.println("Number of windows:" + windowHandleList.size());
		driver.switchTo().window(windowHandleList.get(1));
		System.out.println(driver.getTitle());
		// 10. Click on Second Resulting Contact
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner
		// x-grid3-col-friendlyPartyName'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(windowHandleList.get(0));

		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		// 12.Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// 13. Verify the title of the page

	}

}
