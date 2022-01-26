package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
		
		WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is Before Class");
		
	}
	@Before
	public void launchBrowser() {
		System.out.println("launch browser");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Practice_selenium\\crm\\drivers\\chromedriver97.exe");
			//	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver97.exe");
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver97.exe");
			//	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.techfios.com/billing/?ng=admin/");
				
	}
	@Test
	public void loginTest() throws InterruptedException {
			System.out.println("test 1");
		//identtify element
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
	}
//	@Test
	
	public void loginTestNeg() throws InterruptedException {
		System.out.println("test 2");
		//identtify element
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password1")).sendKeys("abc1234");
			driver.findElement(By.name("login")).click();
	}
	@After
	public void tearDown() throws InterruptedException {
		
		System.out.println("after");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("This is after Class");
	}

}
