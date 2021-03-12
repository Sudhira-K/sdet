package OrangeHRM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMACT9 {
	
	WebDriver  driver;
	@BeforeMethod
	public void beforeMethod()
	{
//		String MozillaPath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\geckodriver-v0.29.0-win64\\geckodriver.exe";		
//		System.setProperty("webdriver.gecko.driver", MozillaPath);
//		driver = new FirefoxDriver();
		
		String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://alchemy.hguy.co/orangehrm");	 
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test
	public void retreiveEmergencyContacts() throws Exception
	{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	driver.findElement(By.xpath("//*[@id='sidenav']/li[3]/a")).click();
////*[@id='emgcontact_list']/tbody/tr[1]/td[2]	
	List<WebElement> tableSize = driver.findElements(By.xpath("//*[@id='emgcontact_list']/tbody/tr"));
	
	for(int i=0;i<tableSize.size();i++)
	{
		
		String Name = driver.findElement(By.xpath("//*[@id='emgcontact_list']/tbody/tr["+(i+1)+"]/td[2]")).getText();
		String RelationShip = driver.findElement(By.xpath("//*[@id='emgcontact_list']/tbody/tr["+(i+1)+"]/td[3]")).getText();
		String Mobile = driver.findElement(By.xpath("//*[@id='emgcontact_list']/tbody/tr["+(i+1)+"]/td[5]")).getText();
		List<String> contactList = new ArrayList<>(Arrays.asList(Name,RelationShip,Mobile));
		System.out.println(contactList);
		
	}
	
	}
	
	@AfterMethod
	public void afterMethod() {
	    //Close the browser
	    driver.quit();
	}


}
