package BrwPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	
	
	public static void main(String[] args) {
		
		WebDriver dr=null;
		
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://accounts.google.com/SignUp");
			dr.manage().window().maximize();
			String wnd=dr.getWindowHandle();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.id("FirstName")).sendKeys("Seetharaman");
			dr.findElement(By.name("LastName")).sendKeys("Subbu");
			dr.findElement(By.xpath("//input[@id='GmailAddress' and @name='GmailAddress']")).sendKeys("PER");
			dr.findElement(By.cssSelector("input[type='password'][name='Passwd']")).sendKeys("AQW");
			//Thread.sleep(9000);
			dr.findElement(By.linkText("Learn more")).click();
			
			/*Thread.sleep(2000);*/
			dr.switchTo().window(wnd);
			Thread.sleep(5000);
			
		}
		
		catch(Exception e)
		{
			
			
			System.out.println("Exception occured "+e.getMessage());
			
		}
		finally
		{
			dr.quit();
			System.out.println("Done....");
			
		}
		
		
	}
	
	
	
	
}
