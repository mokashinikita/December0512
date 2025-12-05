package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");
		
				
		//driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allwindow=driver.getWindowHandles();
		
		System.out.println("All windows:"+allwindow);
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		for(String i:allwindow)
		{
			if(i.equalsIgnoreCase(parentwindow))
			{
				System.out.println("Parent window :"+driver.getTitle());
			}
			else
			{
				System.out.println("Child Url:"+driver.getCurrentUrl());
			}
		}
		
		driver.quit();
	}

}
