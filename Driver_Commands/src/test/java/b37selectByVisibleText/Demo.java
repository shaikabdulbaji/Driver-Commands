package b37selectByVisibleText;

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

		// Write code here
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdownField);
		select.selectByVisibleText("doc 3");

		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		Select select2 = new Select(multiSelectionBoxField);
		select2.selectByVisibleText("Audi");

		driver.close();

	}

}
