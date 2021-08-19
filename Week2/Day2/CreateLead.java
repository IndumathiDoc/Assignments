package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByIndex(2);
		
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("CATRQ_CAMPAIGNS");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MS");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Dhoni");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/23/95");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Support");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5,56,000");
		
		driver.findElement(By.id("createLeadForm_currencyUomId"));
		//WebElement drop3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		//Select drpDwn3 = new Select(drop3);
		//drop3.clear();
		//drpDwn3.selectByVisibleText("INR - Indian Rupee");
		
		
		WebElement drop4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn4 = new Select(drop4);
		drpDwn4.selectByVisibleText("General Services");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
		
		WebElement drop5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn5 = new Select(drop5);
		drpDwn5.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4567");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Flag");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Purpose");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Make sure all the information are entered");
		
		WebElement cccode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		cccode.clear();
		cccode.sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("605003");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2234582345");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("indhudhivya@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://ptracker.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("RJ");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address 1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address 2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Kochin");
		
		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn6 = new Select(drop6);
		drpDwn6.selectByIndex(4);
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("345990");
		
		WebElement drop7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn7 = new Select(drop7);
		drpDwn7.selectByVisibleText("India");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("35656");
		driver.findElement(By.className("smallSubmit")).click();
	}
}