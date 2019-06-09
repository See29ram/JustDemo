package BrwPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tblChk {

	
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver dr=null;
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://www.dynatable.com/");
			dr.manage().window().maximize();
			//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebDriverWait wait=new WebDriverWait(dr,30);
			WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='example-table']/tbody")));
		    /*WebElement we=dr.findElement(By.xpath("//table[@class='partysummary']"));*/
		    List<WebElement> totRows=we.findElements(By.tagName("tr"));
		    System.out.println("Total Rows "+totRows.size());
		    for(WebElement row:totRows)
		    {
		    	List<WebElement> tds=row.findElements(By.tagName("td"));
		    	//System.out.println(tds.size());
		    	
		    	//Getting Country Name
                		    	
		    	System.out.println("Country "+tds.get(1).findElement(By.xpath(".//a")).getText());
		    	System.out.println("Rank "+tds.get(0).getText());
		    }
		    
		    
			
			
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
