package com.jarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwitchToAlert {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		WebDriver driver;		
		
		//System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		//driver = new FirefoxDriver();
    	driver = new ChromeDriver();   
    	
    	String alertMessage = "";
    	driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
	}

}
