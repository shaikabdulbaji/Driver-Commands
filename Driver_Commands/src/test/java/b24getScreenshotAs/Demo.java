package b24getScreenshotAs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.get( "http://omayo.blogspot.com/");
         
         File srcScreenshot = driver.findElement(By.id("hbutton")).getScreenshotAs(OutputType.FILE);
         FileHandler.copy(srcScreenshot, new File(System.getProperty("user.dir")+ "\\screenshots\\screenshot.png"));
         
          driver.quit();

	}

}
