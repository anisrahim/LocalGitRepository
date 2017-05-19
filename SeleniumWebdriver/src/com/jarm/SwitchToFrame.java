package com.jarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwitchToFrame {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		WebDriver driver;		
		
		//System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		//driver = new FirefoxDriver();
    	driver = new ChromeDriver();   
    	
    	driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        
        driver.close(); 
	}

}
