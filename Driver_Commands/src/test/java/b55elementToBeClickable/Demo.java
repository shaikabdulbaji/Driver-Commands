package b55elementToBeClickable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebDriverWait wait = new WebDriverWait(driver, 15);

		driver.findElement(By.xpath("//button[text()='Check this']")).click();

		//elementToBeClickable is used for checking an element is visible and enabled such that you can click it.
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));

		driver.findElement(By.id("dte")).click();

		driver.close();

	}

}
