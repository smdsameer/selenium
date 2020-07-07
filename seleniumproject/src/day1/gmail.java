package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().hashCode();
driver.get("https://www.gmail.com");
driver.manage().window().maximize();
{
driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("md.sameer405");
}
{
boolean f= driver.findElement(By.xpath("//[@id=\"identifierNext\"]/span/span")).click();
}
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.quit();
	}

}
