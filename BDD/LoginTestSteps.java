package stepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	

	WebDriver  driver;	
	 WebDriverWait wait;
	String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";

	
	
	@Given("^User is on Login page$")
	public void UserIsOnLoginPage()
	{
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get("https://www.training-support.net/selenium/login-form");
		driver.manage().window().maximize();
	}
	@When("^User enters username and password$")
	public void UserEntersUserNamePassword()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		
	}
	
	@Then("^Read the page title and confirmation message$")
	public void ReadTitleAndConfirmationMessage()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
		String pageTitle = driver.getTitle();
		String ConfirmationMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Page title is: " + pageTitle);
    	
        System.out.println("Login message is: " + ConfirmationMessage);
		
	}
	@And("^Close the browser$")
	public void Close_the_browser()
	{
		driver.close();
		
	}

	




}
