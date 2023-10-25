package b26navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.omayo.blogspot.com/");

		Thread.sleep(2000);

		// Write code here
		driver.navigate().to("http://compendiumdev.co.uk/selenium/basic_web_page.html");

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.quit();

	}

}
