package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vignan {
	
	static WebDriver driver=null;
	
	public static void main(String args[])
	{
	
	
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nisum\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();

	driver.navigate().to("http://www.macys.com");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	try{
		//driver.findElement(By.xpath(".//*[@id='closeButton']")).isEnabled();
		driver.findElement(By.xpath(".//*[@id='closeButton']")).click();
	}
	catch(Exception e){

System.out.println(e);
	}
	System.out.println("outside");

	//driver.findElement(By.xpath(".//*[@id='closeButton']")).sendKeys("jeans");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById('globalSearchInputField').setAttribute('value','shirts')");
	
	//driver.findElement(By.xpath(".//*[@id='searchSubmit']")).click();

}
}
