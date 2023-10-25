package b75addCookie;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://tutorialsninja.com/demo/");

		Cookie cookie = new Cookie("arun", "motoori");

		driver.manage().addCookie(cookie);

		driver.quit();

	}

}
