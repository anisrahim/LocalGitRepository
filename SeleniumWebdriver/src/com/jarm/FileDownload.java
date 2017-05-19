package com.jarm;

import java.io.IOException;
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

public class FileDownload {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		WebDriver driver;
		// System.setProperty("webdriver.firefox.marionette",
		// "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();

		 String baseUrl = "http://demo.guru99.com/selenium/yahoo.html";
        

        driver.get(baseUrl);
        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By
        .id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c D:\\wget64.exe -P D: --no-check-certificate " + sourceLocation;

        try {
	        Process exec = Runtime.getRuntime().exec(wget_command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
        	System.out.println(ex.toString());
        }
        driver.close();
        }
}
