package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		List <WebElement> checkbox= driver.findElements(By.id("remember"));
				System.out.println(checkbox.get(0).getAttribute("value"));
				System.out.println(checkbox.get(0).getAttribute("checked"));
				checkbox.get(0).click();
				System.out.println(checkbox.get(0).getAttribute("checked"));
				
				
	}

}
