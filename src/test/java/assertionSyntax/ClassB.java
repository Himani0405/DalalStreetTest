package assertionSyntax;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB 
{
	@Test
    public void test1() 
    {
  	  WebDriver driver=new ChromeDriver();
  	  driver.get("https://www.google.co.in/");
  	  Cookie obj=new Cookie("mycookie","123456");
  	  driver.manage().addCookie(obj);
  	  
    }
}
