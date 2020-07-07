package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) throws NoSuchElementException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
WebDriver drop=new ChromeDriver();
drop.get("https://www.wikipedia.org/");
/*WebElement elem =drop.findElement(By.xpath("//input[@name='search']")).sendKeys("Eesti");*/
/*WebElement element =*/drop.findElement(By.id("searchLanguage"));

Select select=new Select(drop.findElement(By.id("searchLanguage")));

select.selectByValue("az");
//*[@id="searchLanguage"]

	}

}
