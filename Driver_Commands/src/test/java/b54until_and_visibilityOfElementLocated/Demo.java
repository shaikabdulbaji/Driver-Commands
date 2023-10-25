package b54until_and_visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.className("dropbtn")).click();
		/*
		 * until() - a more flexible wait that allows us to wait for a specific condition to be met 
		   before continuing test execution.
		 * visibilityOfElementLocated() - while the visibilityOfElementLocated has to check that an 
		   element is present on the DOM of a page and visible.
		 */
		WebElement facebookOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));

		facebookOption.click();

		driver.close();

	}

}
