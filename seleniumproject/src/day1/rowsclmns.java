package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowsclmns {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/27378/ms-vs-psz-27th-match-pakistan-super-league-2020");
		//*[@id="innings_1"]/div[1]/div[3]/div[1]
		
		String rowpth="//*[@id=\"innings_1\"]/div[1]/div[";
		String Rwpth="]/div[1]";
		
		int rowcount=0;
		for(int i=3;i<=8;i++) {
			String X=driver.findElement(By.xpath(rowpth+i+Rwpth)).getText();
			rowcount++;
			System.out.println(X);
			System.out.println("row ends");
		}
		 
		System.out.println("clmn Starts");
		//*[@id="innings_1"]/div[1]/div[3]/div[2]
		//Columns Xpth
		String clmn="//*[@id=\"innings_1\"]/div[1]/div[3]/div[";
		String cmnl="]";
		
		int column=0;
		for(int j=3;j<=7;j++) {
			String F=driver.findElement(By.xpath(clmn+j+cmnl)).getText();
			column++;
			System.out.println(F);
		}
		System.out.println("rows and  column starts");
		//*[@id="innings_1"]/div[1]/div[3]/div[3]
		String xpth_strt="//*[@id=\"innings_1\"]/div[1]/div[";
		String xpth_mid="]/div[";
		String xpth_end="]";
		
		for(int row=2;row<=rowcount;row++) {
			for(int clnl=3;clnl<=column;clnl++) {
				String Z=driver.findElement(By.xpath(xpth_strt+row+xpth_mid+clnl+xpth_end)).getText();
				System.out.println(Z);
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
