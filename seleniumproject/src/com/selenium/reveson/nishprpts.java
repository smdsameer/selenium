package com.selenium.reveson;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nishprpts {

	public static void main(String[] args) throws IOException {
	
	Properties prpt=new Properties();
	
	FileInputStream ip=new FileInputStream("C:\\Users\\sam\\eclipse-workspace\\seleniumproject\\src\\com\\selenium\\reveson\\nish.properties");
		
		prpt.load(ip);
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://webmail2.groupnish.com");
	driver.findElement(By.xpath(prpt.getProperty("user_xpath"))).sendKeys(prpt.getProperty("username"));
	driver.findElement(By.xpath(prpt.getProperty("pss_xpath"))).sendKeys(prpt.getProperty("pswrd"));
	driver.findElement(By.xpath(prpt.getProperty("lgbtn_xpath"))).click();
	driver.findElement(By.xpath(prpt.getProperty("btn_xpath"))).click();
	driver.findElement(By.xpath(prpt.getProperty("lgout_xpath"))).click();
	
	
	}

}
