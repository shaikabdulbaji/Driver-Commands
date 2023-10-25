package b48frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebElement requiredFrame = driver.findElement(By.id("iframe2"));
        
        driver.switchTo().frame(requiredFrame);
       
        driver.findElement(By.linkText("Chapter3")).click();

		driver.quit();

	}

}
