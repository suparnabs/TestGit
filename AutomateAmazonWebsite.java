package Altimetric;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateAmazonWebsite {
	static String url = "https://www.amazon.in/";
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,20);
		
		//Checking the title
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).click().build().perform();
		System.out.println(driver.getTitle());
		
		//Try to login as new customer
		/*driver.findElement(By.xpath("(//a[text()='Start here.'])[1]")).click();
		driver.findElement(By.name("customerName")).sendKeys("Suparna");
		driver.findElement(By.id("ap_phone_number")).sendKeys("8904033550");
		driver.findElement(By.id("ap_password")).sendKeys("$himoga12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Sign-In')]")).click();*/
		
		//Existing Customer
		/*driver.findElement(By.id("ap_email")).sendKeys("8904033550");
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("$himoga12");
		driver.findElement(By.xpath("//input[@id='ap_password']")).submit();
		
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tv");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).submit();
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input")).click();
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.id("s-result-sort-select_1")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'eAirtec')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		driver.findElement(By.id("sc-buy-box-gift-checkbox")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("8904033550");
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("$himoga12");
		driver.findElement(By.xpath("//input[@id='ap_password']")).submit();
		System.out.println(driver.getTitle());
		Thread.sleep(7000);
		driver.quit();
		
		
	}

}
