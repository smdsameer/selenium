package com.selenium.reveson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
	
	WebDriver yahoo= new ChromeDriver();
	
	yahoo.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
	/*yahoo.manage().window().maximize();*/
	yahoo.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	yahoo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	{
	WebElement username=yahoo.findElement(By.id("login-username"));
	WebElement button=yahoo.findElement(By.id("login-signin"));
	username.sendKeys("s_mdsameer@yahoo.in");
	button.click();
	}
	{
	WebElement password=yahoo.findElement(By.id("login-passwd"));
	WebElement button=yahoo.findElement(By.id("login-signin"));
	password.sendKeys("9703729993");
	button.click();
	{
	Thread.sleep(2000);
		yahoo.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		yahoo.findElement(By.xpath("//input[@role='combobox']")).sendKeys("md.sameer405@gmail.com");
	}
	}
	yahoo.quit();
	}

}
