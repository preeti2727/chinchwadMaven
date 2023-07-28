package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Filpkart {
  @Test
  public void FilpkartTest() throws InterruptedException {
	  WebDriver d=new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  d.get("https://www.flipkart.com/");
	  Thread.sleep(4000);
	  d.close();
  }
}
