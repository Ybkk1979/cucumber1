package tags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FIRST {
 WebDriver d=null;

  @Test(priority=1)
  public void LOGIN() {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
 d=new ChromeDriver();
	  d.get("http://www.google.com");
	  d.manage().window().maximize();
	  
  }
  @Test(priority=2)
 public void title()
 {
	  System.out.println(d.getTitle());
	  
		  
 }
  @Test(priority=3)
  public void url()
  {
	  System.out.println(d.getCurrentUrl());
	  
  }
  @Test(priority=4)
  public void close()
  {
	  d.close();
	  
  }
}
