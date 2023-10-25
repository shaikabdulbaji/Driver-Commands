package b72executeAsyncScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
        
        jse.executeAsyncScript("window.setTimeout(function(){alert('world');},4000);alert('Hello');");
        
		driver.quit();

	}

}
