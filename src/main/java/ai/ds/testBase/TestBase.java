package ai.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.pageLayer.LoginPage;
import ai.ds.pageLayer.PortfolioPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public LoginPage login;
	public DashboardPage dash;
	public ExchangePage exchange;
	public PortfolioPage port;
	public static Logger logger;
	
	@BeforeClass
	public void start()
	{
	     logger=Logger.getLogger("DalalStreet Framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void end() 
	{
		logger.info("Framework execution ended");
	}
	
	@BeforeMethod
     public void setup() throws InterruptedException 
     {
    	 String br="CHROME";
    	 if(br.equalsIgnoreCase("chrome"))
         {
    		 WebDriverManager.chromedriver().setup();
        	  driver=new ChromeDriver();
    	 }
    	 else if(br.equalsIgnoreCase("firefox"))
         {
    		 WebDriverManager.firefoxdriver().setup();
        	  driver=new FirefoxDriver();
    	 }
    	 else if(br.equalsIgnoreCase("edge"))
         {
    		 WebDriverManager.edgedriver().setup();
        	  driver=new EdgeDriver();
    	 }
//    	 else if(br.equalsIgnoreCase("opera"))
//         {
//    		 WebDriverManager.operadriver().setup();
//        	  driver=new OperaDriver();
//    	 }
    	 
    	 logger.info("browser selected"+br);
    	 
    	 
     driver.get("https://www.apps.dalalstreet.ai/login");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 //------------login to the application-------------------
	    login=new LoginPage();
 	    login.enterEmailID();
 	    login.enterPassword();
 	    login.clickOnLoginButton();
 	    Thread.sleep(4000);
 	   logger.info("logged to application");
 	    
	 //------object creation-------------------------------
 	    dash=new DashboardPage();
	    exchange=new ExchangePage();
	    port=new PortfolioPage();
	    logger.info("object created");
	 

	 }
     
	@AfterMethod
     public void tearDown() 
     {
		logger.info("browser close");
    	 driver.quit();
     }
     
     
}
