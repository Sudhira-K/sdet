package OrangeHRM;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMACT5 {
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
	public void editUserInformation() throws Exception
	{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	driver.findElement(By.xpath("//input[@value='Edit']")).click();
	
	driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
	driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("Test45");
	
	driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
	driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("TestUserLast44");
	
	driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
	
	Select nationality = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
	nationality.selectByVisibleText("American");
	
	driver.findElement(By.xpath("//input[@id='personal_DOB']")).click();
	driver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
	driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys("1980-11-10");
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	
		
	
	}
	
	@AfterMethod
	public void afterMethod() {
	    //Close the browser
	    driver.quit();
	}
	

}
