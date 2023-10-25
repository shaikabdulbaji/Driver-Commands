package b50defaultContent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
        
        driver.switchTo().frame("iframe2");
       
        driver.findElement(By.linkText("Chapter2")).click();
       
        driver.switchTo().defaultContent();
       
        driver.findElement(By.name("q")).sendKeys("Arun");

		driver.close();

	}

}
