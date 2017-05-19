package com.jarm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardMouseEvent2 {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		WebDriver driver;
		// System.setProperty("webdriver.firefox.marionette",
		// "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();

		String baseUrl = "https://www.facebook.com";

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
	
		Action seriesOfAction = builder.moveToElement(txtUsername)
		.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.doubleClick(txtUsername)
				.contextClick().build();

		seriesOfAction.perform();

	}
}
