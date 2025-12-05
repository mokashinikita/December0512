package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/audio-video/pr?sid=0pm&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_1d3c49cf-b79a-4b5e-a28e-da84b999b2a6_1_372UD5BXDFYS_MC.9JGNW7M0TUHD&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Electronics~Audio~All_9JGNW7M0TUHD&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L2_view-all&cid=9JGNW7M0TUHD");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement electronics=driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(electronics).build().perform();
		act.moveToElement(electronics).build().perform();
		driver.findElement(By.xpath("//*[text()='Mi']")).click();
		System.out.println("Mi Clicked");
		
		
		WebElement Women=driver.findElement(By.xpath("//*[text()='Women']"));
		act.moveToElement(Women).build().perform();
		driver.findElement(By.xpath("//*[text()='Sarees']"));
		System.out.println("Sarees Selected");
		
		
		driver.close();

	}

}
