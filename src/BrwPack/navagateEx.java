package BrwPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navagateEx {

	
	
	
	public static void main(String[] args) {
		
		WebDriver dr=null;
		
		try
		{
			
			
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://letskodeit.teachable.com/p/practice");
			dr.navigate().to("https://www.google.co.in/");
			dr.navigate().back();
			dr.navigate().forward();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			dr.quit();
		}
	}
	
	
	
}
