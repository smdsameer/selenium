package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBttn {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	List <WebElement> radiobtn= driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println(radiobtn.get(2).getAttribute("value"));
			System.out.println(radiobtn.get(2).getAttribute("checked"));
			System.out.println(radiobtn.get(2).getAttribute("checked"));
	}

}
