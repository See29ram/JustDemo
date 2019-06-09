package BrwPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherCmds {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriver dr=null;
		
		
		try
		{
			System.out.println("Startt..");
			 System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			 dr=new ChromeDriver();
			 dr.get("http://www.seleniumframework.com/Practiceform/");
			 dr.manage().window().maximize();
			 System.out.println(dr.getCurrentUrl());
			 System.out.println(dr.getTitle());
			 dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WebElement we=dr.findElement(By.id("button1"));
			 System.out.println(we.getAttribute("style"));
			 System.out.println(we.getText());
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception..");
		}
		finally
		{
			dr.quit();
			System.out.println("Done...");
		}
		
		
		
	}
	
	
	

		
		
		
		
	
	
}
