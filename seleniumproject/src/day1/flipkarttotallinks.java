package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarttotallinks {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver Totallinks=new ChromeDriver();
	Totallinks.get("http://www.flipkart.com");
	List <WebElement> abc=Totallinks.findElements(By.tagName("a"));
	//List <WebElement> de=Totallinks.findElements(By.tagName("input"));
	System.out.println(abc.size());
	//System.out.println(de.size());
	//List <WebElement> fg=Totallinks.findElements(By.tagName("p"));
	//System.out.println(fg.size());
	for(int i=0;i<abc.size();i++) {
		String Text=abc.get(i).getText();
		System.out.println(Text);
	}
	
	}

}
