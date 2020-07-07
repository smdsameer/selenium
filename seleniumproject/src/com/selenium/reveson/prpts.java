package com.selenium.reveson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prpts {

	public static void main(String[] args) throws IOException {
	
		
	Properties pro=new Properties();
		
	FileInputStream ip=new FileInputStream("C:\\Users\\sam\\eclipse-workspace\\seleniumproject\\src\\com\\selenium\\reveson\\register.properties");	
		
		pro.load(ip);
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("age"));
		String BName=pro.getProperty("Browser");
		if(BName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.xpath(pro.getProperty("first_xpath"))).sendKeys(pro.getProperty("firstname"));
		driver.findElement(By.xpath(pro.getProperty("sure_xpath"))).sendKeys(pro.getProperty("lastname"));
		Select sel=new Select(driver.findElement(By.xpath(pro.getProperty("select_xpath"))));
		sel.selectByVisibleText("10");
		}
	
	
	}
	
}
