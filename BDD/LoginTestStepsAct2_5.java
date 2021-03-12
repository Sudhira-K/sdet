package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepsAct2_5 {
	

	
	WebDriver  driver;	
	 WebDriverWait wait;
	String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";
	
    @Given("^BUser is on Login page$")
	
    public void loginPage() {
    	System.setProperty("webdriver.chrome.driver", ChromePath);
    	driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
	
        
	
        //Open browser
	
        driver.get("https://www.training-support.net/selenium/login-form");
	
    }
	
    
	
 
	
    
	
    @When("^BUser enters \"(.*)\" and \"(.*)\"$")
	
    public void user_enters_and(String username, String password) throws Throwable {
	
        //Enter username from Feature file
	
        driver.findElement(By.id("username")).sendKeys(username);
	
        //Enter password from Feature file
	
        driver.findElement(By.id("password")).sendKeys(password);
	
        //Click Login
	
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	
    }
	
    
	
    @Then("^BRead the page title and confirmation message$")
	
    public void readTitleAndHeading() {
	
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
	
        
	
        //Read the page title and heading
	
        String pageTitle = driver.getTitle();
	
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
	
        
	
        //Print the page title and heading
	
        System.out.println("Page title is: " + pageTitle);
	
        System.out.println("Login message is: " + confirmMessage);
	
 
	
        //Assertion
	
        Assert.assertEquals(confirmMessage, "Welcome Back, admin");
	
    }
	
    
	
    @And("^BClose the Browser$")
	
    public void closeBrowser() {
	
        //Close browser
	
        driver.close();
	
    }


	
	

}
