package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementvisibiltyTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver yahoo=new ChromeDriver();
		yahoo.manage().window().maximize();
		yahoo.get("https://register.freecrm.com/register");
		
		//1) isDisplayed() method is applicable for all elements
		boolean b1=yahoo.findElement(By.xpath("//button[@type='submit']")).isDisplayed();//for singup btn
		System.out.println(b1);//true
		
		boolean b2=yahoo.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		System.out.println(b2);//false
		//2) isEnabled() method()
		yahoo.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b3=yahoo.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
		System.out.println(b3);//true
		
		//3) isSelected() method is only for dropdown,checkbox,radio btn.
		boolean b4=yahoo.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b4);
		
		yahoo.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b5=yahoo.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b5);
		}

}
