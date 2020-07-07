package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablerownclm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver RC=new ChromeDriver();
		RC.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		//XPath
		//*[@id="innings_1"]/div[4]/div[1]/div[1]
		String first_xpath="//*[@id=\"innings_1\"]/div[4]/div[";
		String Scnd_xpath="]/div[1]";
		int rowcount=0;
		
		for(int i=2;i<=7;i++) {
			String x=RC.findElement(By.xpath(first_xpath+i+Scnd_xpath)).getText();
			rowcount++;
			System.out.println(x);
		}
		
		//*[@id="innings_1"]/div[4]/div[2]/div[2]
		
		//Column Xpath
		String fst_xpth="//*[@id=\"innings_1\"]/div[4]/div[2]/div[";
		String scnd_xpth="]";
		int clmncount=0;
		for(int i=1;i<=8;i++) {
			String y=RC.findElement(By.xpath(fst_xpth+i+scnd_xpth)).getText();
			clmncount++;
			System.out.println(y);
		
		}
	System.out.println("no of columncount"+clmncount);
	
	
	
	System.out.println("---------------------");
	//Entring full rows and coulms
	
		String xpath_starts="//*[@id=\"innings_1\"]/div[4]/div[";
		String xpath_mid="]/div[";		
		String xpath_ends="]";
		
	for(int rows=1;rows<=rowcount;rows++) {
		for (int clmns=1;clmns<=clmncount;clmns++) {
			String Z=RC.findElement(By.xpath(xpath_starts+rows+xpath_mid+clmns+xpath_ends)).getText();
			System.out.println(Z);
		}
		System.out.println();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
