package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		// webdriver is a inteface and chrome driver is a class
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Practice_selenium\\1st_Seleneium_project\\drivers\\chromedriver97.exe");
		
		WebDriver driver = new ChromeDriver();//this class is implementing webdriver, driver is a object varialbe
		
		//maximize the window
		driver.manage().window().maximize();
	// get to the website	
		driver.get("https://www.google.com/");
	//Identify the web element and perform action. 	
		driver.findElement(By.name("q")).sendKeys("selenium");
	//	driver.findElement(By.name("btnK")).click();
	
	// wait (poss the execution for 3seconds before closing it)
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
