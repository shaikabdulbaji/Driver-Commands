package b21isDisplayed;

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
        
        //Write code here
        boolean a = driver.findElement(By.id("but2")).isDisplayed();
        boolean b = driver.findElement(By.id( "hbutton")).isDisplayed();
        System.out.println(a );
        System.out.println(b );

		driver.quit();

	}

}
