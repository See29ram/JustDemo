package BrwPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertEx {

	
	
	public static void main(String[] args) {
		
		
		
		WebDriver dr=null;
		
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://letskodeit.teachable.com/p/practice");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.id("confirmbtn")).click();
			Thread.sleep(2000);
			Alert act=dr.switchTo().alert();
			
			System.out.println(act.getText());
			act.dismiss();
			Thread.sleep(2000);
			System.out.println("Last Code");
			system.out.println("Above is not last code");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception.."+e.getMessage());
		}
		finally
		{
			System.out.println("Done..");
			dr.quit();
		}
		
		
		
	}
	
	
	
	
	
}
