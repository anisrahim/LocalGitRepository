package com.jarm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageLink {

	public static void main(String[] args) {

		try {
			// declaration and instantiation of objects/variables
			WebDriver driver;
			// System.setProperty("webdriver.firefox.marionette",
			// "C:\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			// driver = new FirefoxDriver();
			driver = new ChromeDriver();

			String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";

			driver.get(baseUrl);
			// click on the "Facebook" logo on the upper left portion
			driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

			// verify that we are now back on Facebook's homepage
			if (driver.getTitle().equalsIgnoreCase("Facebook - Log In or Sign Up")) {
				System.out.println("We are back at Facebook's homepage");
			} else {
				System.out.println("We are NOT in Facebook's homepage");
			}
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("______Anisur____Error:");
			e.printStackTrace();
		}
	}
}
