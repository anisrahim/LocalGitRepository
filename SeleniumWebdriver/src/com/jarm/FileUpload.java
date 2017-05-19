package com.jarm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		WebDriver driver;
		// System.setProperty("webdriver.firefox.marionette",
		// "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/selenium/guru99home/megaupload/upload.html";
        

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("D:\\selenium.logs");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();

	}
}
