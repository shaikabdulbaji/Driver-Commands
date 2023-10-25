package b20getAttribute;

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

		String textOnButton = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']"))
				.getAttribute("value");

		System.out.println(textOnButton);

		driver.quit();

	}

}
