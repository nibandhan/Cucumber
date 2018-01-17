package StepDef;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefnition {
	
	WebDriver driver=null;
	

@Given("^User opens the browser$")
public void user_opens_the_browser() throws Throwable {
	
	//File file = new File("C:\\Users\\Nisum\\Desktop\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nisum\\Desktop\\chromedriver_win32\\chromedriver.exe" );	  
	driver = new ChromeDriver();
	driver.get("http://www.google.com");
}

@When("^he gets the url$")
public void he_gets_the_url() throws Throwable {
	
	driver.navigate().to("http://www.way2automation.com/demo.html");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    
}

@Then("^validate the title of the home page$")
public void validate_the_title_of_the_home_page() throws Throwable {
	System.out.println(driver.getTitle());
	
	String currentwindow=driver.getWindowHandle();
	
	System.out.println(currentwindow);
	
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	
	jse1.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.cssSelector("#wrapper > div.container.margin-top-20 > div.row > div:nth-child(1) > ul > li:nth-child(1) > a > h2")).click();
	
	Set<String> window= driver.getWindowHandles();
	
	for(String winHandle : window){
		
	    driver.switchTo().window(winHandle);
	    
	    System.out.println(winHandle);
	} 
	driver.findElement(By.linkText("Signin")).click();
	
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input[1] ")).sendKeys("nibandhan");
	//System.out.println("inside");
	
	driver.findElement(By.name("password")).sendKeys("Nibbu@0518*");
	
	driver.findElement(By.className("button")).click();

	
	
	
    
}



}
