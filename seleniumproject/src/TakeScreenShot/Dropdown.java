package TakeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		WebDriver fb=new ChromeDriver();
		fb.manage().deleteAllCookies();
		fb.manage().window().maximize();
		fb.get("https://www.fb.com/");
		
		
		Select d=new Select(fb.findElement(By.xpath("//select[@id='day']")));
		d.selectByVisibleText("5");
		
		Select m=new Select(fb.findElement(By.xpath("//select[@id='month']")));
		m.selectByVisibleText("Jan");
		
		Select y=new Select(fb.findElement(By.xpath("//select[@id='year']")));
		y.selectByVisibleText("1988");
		fb.findElement(By.xpath("//input[@id='u_0_6']")).click();

	}

}
