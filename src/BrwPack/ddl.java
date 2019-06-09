package BrwPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddl {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver dr=null;
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://letskodeit.teachable.com/p/practice");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select sel=new Select(dr.findElement(By.id("carselect")));
			sel.selectByVisibleText("Honda");
			Thread.sleep(3000);
			System.out.println("Exception...will coccur");
			
			
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception..."+e.getMessage());
		}
		
		finally
		{
			dr.quit();
			System.out.println("Done..");
		}
		
	}
	

}
