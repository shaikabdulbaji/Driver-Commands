package b52setScriptTimeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * Sets the amount of time to wait for an asynchronous script to finish execution before 
		   throwing an error. If the timeout is negative, then the script will be allowed to run 
		   indefinitely.
		 */
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");

		driver.close();

	}

}
