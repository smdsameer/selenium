package day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readprpts {
	static WebDriver sam;
	public static void main(String[] args) throws IOException {
	Properties pr=new Properties();
	FileInputStream fis=new FileInputStream("\\Users\\sam\\eclipse-workspace\\seleniumproject\\config.properties");
    pr.load(fis);
    System.out.println(pr.get("name"));
    String sr= pr.getProperty("URL");
    System.out.println(sr);
    String browsername=pr.getProperty("browser");
    System.out.println(browsername);
    if(browsername.equals("chrome")) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
    sam=new ChromeDriver();
	}
   sam.get(sr);
   sam.findElement(By.xpath(pr.getProperty("firstname_xpath"))).sendKeys(pr.getProperty("firstname"));
   sam.findElement(By.xpath(pr.getProperty("lastname_xpath"))).sendKeys(pr.getProperty("lastname"));
   
}}
