package com.jarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		WebDriver driver;

		// System.setProperty("webdriver.firefox.marionette",
		// "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/popuptest2.html");
        
		driver.close(); //It closes only the browser window that WebDriver is currently controlling.
		driver.quit();  // It closes all windows that WebDriver has opened.
	}
}
