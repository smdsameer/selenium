package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	/*d.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S84691527%3A1581949641331436&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");*/
	d.get("https:www.youtube.com");
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	//there are 8 types of Locaters 
	//1) by xpath//
	//d.findElement(By.xpath("//input[@id='search']")).sendKeys("xpath java");
	//d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	//d.findElement(By.xpath("//*[@id=\'logo\']")).click();
	//2) by id
	//d.findElement(By.id("firstName")).sendKeys("shaik");
	//d.findElement(By.id("lastName")).sendKeys("md sameer");
	//System.out.println(d.getCurrentUrl());
	//System.out.println(d.getTitle());
	//3)  By Name
	//d.findElement(By.name("firstName")).sendKeys("shaik");
	//d.findElement(By.name("lastName")).sendKeys("gani");
	//4) By Css Selector
	//d.findElement(By.cssSelector("#firstName")).sendKeys("Abdul gani");
	//d.findElement(By.cssSelector("#lastName")).sendKeys("Rawoof");
	//d.findElement(By.cssSelector("#view_container > form > div.mbekbe.bxPAYd > div > div.GtglAe > div.AIu8h > div")).click();
	/*System.out.println(d.getCurrentUrl());*/
	d.findElement(By.id("search")).sendKeys("java");
	d.findElement(By.id("search")).sendKeys(Keys.ENTER);

	}

}
