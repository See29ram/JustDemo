package BrwPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesEx {

	
	
	
	public static void main(String[] args) {
		
		
		WebDriver dr=null;
		try
		{
		    System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://www.ndtv.com/elections/tripura/assembly-partywise?parties=BJP%2B");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			dr.switchTo().frame("partiesstanding");
			WebElement we=dr.findElement(By.xpath("//table[@class='partysummary']"));
			System.out.println(we.findElements(By.tagName("tr")).size());
			dr.switchTo().defaultContent();
			dr.switchTo().frame(0);
			//dr.switchTo()
			System.out.println("2nd..");
			WebElement we1=dr.findElement(By.xpath("//table[@class='partysummary']"));
			System.out.println(we1.findElements(By.tagName("tr")).size());
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occures "+e.getMessage());
		}
		
		finally
		{
			dr.quit();
			System.out.println("Done..");
		}
		
	}
	
	
	
}
