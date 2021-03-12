package OrangeHRM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMACT8 {
	
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
	public void applyLeave() throws Exception
	{
	
	String startDate = "2021-12-13"	;
	String endDate = "2021-12-14"	;
	String searchLeave = startDate+" "+"to"+" "+endDate;
	System.out.println("searchLeave :"+searchLeave);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
	driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();
	
	Select leaveType = new Select(driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")));
	leaveType.selectByVisibleText("Paid Leave");
	driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).click();
	driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).clear();
	driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).sendKeys(startDate);
	driver.findElement(By.xpath("//label[@for='applyleave_txtComment']")).click();	
	driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).click();
	driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).clear();
	driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).sendKeys(endDate);
	driver.findElement(By.xpath("//label[@for='applyleave_txtComment']")).click();
	Select partilaDay = new Select(driver.findElement(By.xpath("//select[@id='applyleave_partialDays']")));
	partilaDay.selectByVisibleText("Start Day Only");
	driver.findElement(By.xpath("//input[@id='applyBtn']")).click();	
	int leaveStatusRowNum=0;
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
	List<WebElement> tableSizeStatus = driver.findElements(By.xpath("//*[@id='resultTable']/tbody[1]/tr"));
	int  tableSize = tableSizeStatus.size();
	
	
	for(int i=0;i<tableSize;i++)
	{
		String Leavedate= driver.findElement(By.xpath("//*[@id='resultTable']/tbody[1]/tr["+(i+1)+"]/td[1]/a")).getText();
	//	System.out.println(Leavedate);
		if(Leavedate.equalsIgnoreCase(searchLeave))
		{
			System.out.println("Found Value of I is "+i);
			leaveStatusRowNum = i+1;
		}
		
	}
	
	System.out.println("Row Number :"+leaveStatusRowNum);
	String AppliedLeavedate  = driver.findElement(By.xpath("//*[@id='resultTable']/tbody[1]/tr["+leaveStatusRowNum+"]/td[1]/a")).getText();
	System.out.println("Applied Leave date :"+AppliedLeavedate);
	String status = driver.findElement(By.xpath("//*[@id='resultTable']/tbody[1]/tr["+leaveStatusRowNum+"]/td[6]/a")).getText();
	System.out.println("Status :"+status);
	Assert.assertTrue(status.contains("Pending Approval"));
	
	}
	
	@AfterMethod
	public void afterMethod() {
	    //Close the browser
	    driver.quit();
	}

}
