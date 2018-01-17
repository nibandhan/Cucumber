package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

public class AmazonExam {


	static WebDriver driver=null;
	
	public static void main(String args[])
	{
	
	
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nisum\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.navigate().to("http://www.amazon.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).click();
	
	driver.findElement(By.id("ap_email")).sendKeys("9640056852");
	driver.findElement(By.id("ap_password")).sendKeys("nibbu@0518*");
	driver.findElement(By.id("signInSubmit")).click();
	

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
driver.findElement(By.xpath(".//*[@id='result_0']/div/div[1]/div/a/img")).click();
//driver.findElement(By.xpath(".//*[@id='result_0']/div/div[1]/div/a/img")).click();
//driver.findElement(By.xpath(".//*[@id='dropdown_selected_size_name']/span/span/span")).click();
//.//*[@id='dropdown_selected_size_name']/span/span/span


/*if( driver.findElement(By.xpath(".//*[@id='dropdown_selected_size_name']/span/span")).isDisplayed()){
	
	WebElement dropdown = driver.findElement(By.xpath(".//*[@id='dropdown_selected_size_name']/span/span"));
	Select sel = new Select(dropdown);
	sel.selectByIndex(1);
	
}
else if(driver.findElement(By.xpath(".//*[@id='dropdown_selected_size_name']/span/span/span")).isDisplayed()){
	
WebElement dropdown1 = driver.findElement(By.xpath(".//*[@id='dropdown_selected_size_name']/span/span/span"));

Select sel = new Select(dropdown1);
sel.selectByIndex(1);
}*/


driver.findElement(By.id("add-to-cart-button")).click();	

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motog5s plus");
driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

driver.findElement(By.xpath(".//*[@id='rot-B0734VCYQB']/div/div[1]/a/img[1]")).click();
driver.findElement(By.id("add-to-cart-button")).click();

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone SE 32 GB Unlocked, Silver");
driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

driver.findElement(By.xpath(".//*[@id='pdagDesktopSparkleAsinsContainer']/div[1]/div[1]/div/a/div[1]/div")).click();
driver.findElement(By.id("add-to-cart-button")).click();

driver.findElement(By.xpath(".//*[@id='hlb-view-cart-announce']")).click();	
driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div[2]/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")).click();	










	
	
	
		

	}

}
