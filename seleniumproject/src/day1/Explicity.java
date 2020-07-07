package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver exp=new ChromeDriver();
	exp.get("https://www.gmail.com");
	exp.manage().window().maximize();
	exp.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	exp.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	

	}
	public static void clickOn(WebDriver exp,WebElement locator, int timeout) {
	new WebDriverWait(exp,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedCondition.elementToBeClickable(locator));
	locator.click();
	}
}
