package ecommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void launchAmazon() throws InterruptedException {
	  
	  WebDriver d=new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.get("https://www.amazon.in/");
	  Thread.sleep(3000);
	  
	  d.close();
	  
  }
}
