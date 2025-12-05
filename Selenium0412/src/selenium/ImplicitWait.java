package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\Software\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement wb=driver.findElement(By.xpath("//select[contains(@aria-label,'Day')]"));
		Select day=new Select(wb);
		day.selectByValue("6");
		
		WebElement wb1=driver.findElement(By.xpath("//select[contains(@aria-label,'Month')]"));
		Select month=new Select(wb1);
		month.selectByVisibleText("May");
		
		WebElement wb2=driver.findElement(By.xpath("//select[contains(@aria-label,'Year')]"));
		Select year=new Select(wb2);
		year.selectByIndex(20);
		
		
		//Radio Button
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Radio Buttons"+alloptions.size());
		System.out.println(alloptions.get(1).isSelected());
		System.out.println(alloptions.get(0).isSelected());
		//driver.close();

	}
}
