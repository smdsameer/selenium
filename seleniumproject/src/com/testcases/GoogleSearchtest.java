package com.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.webpages.googlesearchpage;
public class GoogleSearchtest {
	static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		googlesearchpage.text_search(driver).sendKeys("gmail");
		googlesearchpage.button_search(driver).click();
		
		
	}

}
