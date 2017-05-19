package com.jarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		WebDriver driver;
		//System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		//driver = new FirefoxDriver();
    	driver = new ChromeDriver();   
    
    	driver.get("http://newtours.demoaut.com/mercuryregister.php");

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		if (!drpCountry.isMultiple())
			drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		if (fruits.isMultiple()){
			fruits.selectByVisibleText("Banana");
			fruits.selectByIndex(1);
			fruits.selectByIndex(3);
		}
		fruits.deselectAll();
	}
}
