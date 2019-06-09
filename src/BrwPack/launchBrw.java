package BrwPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrw {

	
	
	public static void main(String[] args) {
		
		WebDriver dr=null;
	try
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
		dr=new ChromeDriver();
	    dr.get("https://www.google.co.in");
	    dr.manage().window().maximize();
	    Thread.sleep(2000);
		
		
	}
	catch(Exception e)
	{
		System.out.println("Error Occured");
	}
	finally
	{
	   dr.close();	
	}
	
	
	
	}
	
	}
