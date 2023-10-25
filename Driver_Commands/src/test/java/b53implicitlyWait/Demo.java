package b53implicitlyWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		//directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.className("dropbtn")).click();

		driver.findElement(By.linkText("Facebook")).click();

		driver.close();

	}

}
