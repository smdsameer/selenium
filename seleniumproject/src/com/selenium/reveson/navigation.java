package com.selenium.reveson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
		
		WebDriver nav=new ChromeDriver();
		
		nav.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		nav.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		nav.get("https://www.facebook.com");
		nav.navigate().to("https://www.google.com");
		nav.navigate().back();
		Thread.sleep(2000);
		nav.navigate().forward();
		nav.quit();

	}

}
