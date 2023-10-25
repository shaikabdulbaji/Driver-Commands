package a4setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	 public static void main(String[] args) throws InterruptedException {
         
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         Dimension d = new Dimension(300,650);
         driver.manage().window().setSize(d);
         
         driver.get("http://tutorialsninja.com/demo/");  
                 
         driver.close();
         
  }


}
