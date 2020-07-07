package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
	WebDriver DD=new ChromeDriver();
	DD.get("https://www.wikipedia.org/");
	DD.findElement(By.id("searchLanguage")).sendKeys("az");
	
	Select hai=new Select(DD.findElement(By.id("searchLanguage")));
	/*hai.selectByValue("hi");*/
	List<WebElement> bhai=hai.getOptions();
	System.out.println(bhai.size());
	
	for(int i=0; i<bhai.size(); i++) {
		System.out.println(bhai.get(i).getText());
	}
	}

}
