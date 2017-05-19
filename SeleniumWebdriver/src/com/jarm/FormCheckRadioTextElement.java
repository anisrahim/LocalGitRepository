package com.jarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormCheckRadioTextElement {
	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		WebDriver driver;
		//System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		//driver = new FirefoxDriver();
    	driver = new ChromeDriver();   

		// Create explicit wait for 10s
		WebDriverWait myWait = new WebDriverWait(driver, 10);

		String baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);

		// wait until text box load.
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));

		// Enter value into textbox
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Delete value from textbox
		driver.findElement(By.name("userName")).clear();

		// Access Links
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.partialLinkText("SIGN-ON")).click();

		// Enter value into textbox and SUBMIT
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("password")).submit();

		// Select Radio Button
		driver.findElement(By.cssSelector("input[value=Business]")).click();

		// Select CheckBox
		String baseURL = "http://demo.guru99.com/selenium/facebook.html";
		driver.get(baseURL);

		// Create an Explicit wait.
		WebDriverWait myWait2 = new WebDriverWait(driver, 10);
		myWait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("persist_box")));

		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 5; i++) {
			chkFBPersist.click();
			System.out.println(chkFBPersist.isSelected());
		}

		driver.quit();
		System.exit(0);
	}
}
