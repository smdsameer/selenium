package day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class collegedetails {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	Properties hai=new Properties();
	FileInputStream bye=new FileInputStream("\\Users\\sam\\eclipse-workspace\\seleniumproject\\src\\day1\\abc.properties");
	hai.load(bye);
	System.out.println(hai.get("name"));
	String cls=hai.getProperty("collegeid");
	System.out.println(cls);
	String site=hai.getProperty("URL");
	System.out.println(site);
	String Bn=hai.getProperty("Browser");
	System.out.println(Bn);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(site);
    driver.findElement(By.xpath(hai.getProperty("userid_xpath"))).sendKeys("Sameer");
    driver.findElement(By.xpath(hai.getProperty("userpswrd_xpath"))).sendKeys("SamNtp456@");
    driver.findElement(By.xpath(hai.getProperty("login_btn_xpath"))).click();
    driver.findElement(By.xpath(hai.getProperty("drop_down_xpath"))).click();
    driver.findElement(By.xpath(hai.getProperty("logout_button_xpath"))).click();
    
    }
	
}
