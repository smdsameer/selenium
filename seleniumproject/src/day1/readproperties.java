package day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readproperties {
	 static WebDriver gani;
	public static void main(String[] args) throws IOException {
		
	Properties abc= new Properties();//step1
	FileInputStream ip=new FileInputStream("\\Users\\sam\\eclipse-workspace\\seleniumproject\\config.properties");//step2
	abc.load(ip);//step 3 loading the config.properties into abc
    System.out.println(abc.getProperty("name"));
    String str=abc.getProperty("URL");
    System.out.println(str);
    String BN=abc.getProperty("browser");
    System.out.println(BN);
    if(BN.equals("chrome")) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
    gani=new ChromeDriver();
    } 
    gani.get(str);
    gani.findElement(By.xpath(abc.getProperty("firstname_xpath"))).sendKeys(abc.getProperty("firstname"));
    gani.findElement(By.xpath(abc.getProperty("lastname_xpath"))).sendKeys(abc.getProperty("lastname"));
    gani.findElement(By.xpath(abc.getProperty("phoneno_xpath"))).sendKeys(abc.getProperty("mobileno"));
	}}
