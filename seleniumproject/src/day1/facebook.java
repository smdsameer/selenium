package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("7799807713");
//driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Naziya");
//driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
//System.out.println(driver.getTitle());
//driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("shaik");
//driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Abdul Gani");
//driver.findElement(By.xpath("//input[contains(@id,'u_0_r')]")).sendKeys("9087654321");
//driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Abdulgani4@5");
//driver.findElement(By.xpath("//select[contains(@id,'day')]")).sendKeys("30");
//driver.findElement(By.xpath("//select[contains(@id,'month')]")).sendKeys("sep");
//driver.findElement(By.xpath("//select[contains(@id,year')")).sendKeys("1946");
driver.findElement(By.xpath("//input[contains(@id,'u_0_7')]")).click();
List <WebElement> linklist=driver.findElements(By.tagName("a"));
System.out.println(linklist.size());
for(int i=0;i<linklist.size();i++) {
	String namelist=linklist.get(i).getText();
	System.out.println(namelist);
}
driver.close();






	}

}
