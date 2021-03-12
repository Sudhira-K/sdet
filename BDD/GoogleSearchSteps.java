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

public class GoogleSearchSteps {
	WebDriver  driver;	
	 WebDriverWait wait;
	String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";

	
	
	@Given("^User is on Google Home Page$")
	public void User_is_on_Google_Home_Page()
	{
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@When("^User types in Cheese and hits ENTER$")
	public void User_types_in_Cheese_and_hits_ENTER()
	{
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
		
		
		
	}
	
	@Then("^Show how many search results were shown$")
	public void Show_how_many_search_results_were_shown()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		String resultStatus = driver.findElement(By.id("result-stats")).getText();
		System.out.println("No of results found : "+resultStatus);
		
	}
	
	
}
