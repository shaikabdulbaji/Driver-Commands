package b27submit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

		// Write your code here
		driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("Second@123");

		Thread.sleep(3000);

		driver.findElement(By.id("input-password")).submit();

		driver.quit();

	}

}
