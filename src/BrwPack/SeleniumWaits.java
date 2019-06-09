package BrwPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	
	
	
	public static void main(String[] args) {
		
		WebDriver dr=null;
		
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("http://www.seleniumframework.com/Practiceform/");
			dr.manage().window().maximize();
			//dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebDriverWait wait=new WebDriverWait(dr,0);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Element4"))).click();
			
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured: "+e.getMessage());
			//e.printStackTrace();
		}
		
		finally
		{
			
			dr.quit();
			System.out.println("Done...");
			
			
		}
		
	}
	
	
	
	
}
