package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {
     private static WebElement element=null;
	public static WebElement text_search(WebDriver driver) {
		
		element=driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
		
	}
	
	
	
}
