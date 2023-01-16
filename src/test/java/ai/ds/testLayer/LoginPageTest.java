package ai.ds.testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;


import ai.ds.testBase.TestBase;

public class LoginPageTest extends TestBase
{
	@Test
    public void verifyLoginTest() throws InterruptedException 
    {
		String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
    	Thread.sleep(3000);
    	String actual_url = login.getActualUrl();
    	System.out.println(actual_url);
    	Assert.assertEquals(actual_url, expected_url);
    	
    }
}
