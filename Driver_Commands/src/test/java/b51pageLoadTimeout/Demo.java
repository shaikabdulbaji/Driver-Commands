package b51pageLoadTimeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//defines the amount of time that Selenium will wait for a page to load.
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
        driver.get("https://colabus.com/");

		driver.close();

	}

}
