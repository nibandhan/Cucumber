package StepDef;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdeff {
	
	WebDriver driver=null;
	
	
	@Given("^User opens the browserr$")
	public void user_opens_the_browserr() throws Throwable {
		//File file = new File("C:\\Users\\Nisum\\Desktop\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nisum\\Desktop\\chromedriver_win32\\chromedriver.exe" );	  
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("1st");
	    
	}

	@When("^he gets the urll$")
	public void he_gets_the_urll(DataTable data) throws Throwable {
		
		
		List<List<String>> nib= data.raw();
		
		String str=nib.get(0).get(0);
		System.out.println(str);
	    
		
		
	}

	@Then("^validate the title of the home pagee$")
	public void validate_the_title_of_the_home_pagee() throws Throwable {
	   
		System.out.println("3rd");

		
	}


	
	
	

}
