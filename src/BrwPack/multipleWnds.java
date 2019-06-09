package BrwPack;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWnds {

	
	public static void main(String[] args) {
		
		WebDriver dr=null;
	   try
	   {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://accounts.google.com/SignUp");
		dr.manage().window().maximize();
		String gmail=dr.getWindowHandle();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.linkText("Learn more")).click();
		//System.out.println(dr.getTitle());
		
		Set<String> totWnds=dr.getWindowHandles();
		for(String wnd:totWnds)
		{
			String title=dr.switchTo().window(wnd).getTitle();
			System.out.println(title);
			if(title.equals("Why Google asks for certain info to create an account - Google Account Help"))
			{
				dr.findElement(By.partialLinkText("Google Privacy Policy")).click();
			}
			else if(title.equals("Privacy & Terms – Google")) 
			{
				dr.findElement(By.linkText("Read our Privacy Policy")).click();
			}
			
		}
		
		dr.switchTo().window(gmail);
		dr.findElement(By.id("FirstName")).sendKeys("UIPath");
		Thread.sleep(5000);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception.."+e.getMessage());
	   }
	   finally
	   {
		   dr.quit();
		   System.out.println("Done..");
	   }
		
	}
	
	
	
}
