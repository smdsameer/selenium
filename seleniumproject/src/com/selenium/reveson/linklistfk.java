package com.selenium.reveson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linklistfk {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.flipkart.com");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	List <WebElement> linklist= driver.findElements(By.tagName("a"));
	System.out.println(linklist.size());
	
	for(int i=0;i<linklist.size();i++) {
		String str=linklist.get(i).getText();	
	    System.out.println(str);
	}
	}

}
