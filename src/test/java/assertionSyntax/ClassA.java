package assertionSyntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA 
{
      @Test
      public void test1() 
      {
    	  String actual="abc";
    	  String expected="abc";
    	   Assert.assertEquals(actual, expected);
    	   
    	   Assert.assertNotEquals(actual,expected,"info not matched");
    	  
      }
      
     
}
