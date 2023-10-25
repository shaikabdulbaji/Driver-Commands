package b47deselectAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		// Write your code here
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionBoxField);

		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");

		Thread.sleep(3000);

		select.deselectAll();

		driver.quit();

	}

}
