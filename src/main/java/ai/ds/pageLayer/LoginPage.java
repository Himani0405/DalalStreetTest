package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class LoginPage extends TestBase
{
   public LoginPage()
   {
	   PageFactory.initElements(driver,this);
   }
   
   //-----------obj repository-------------------------------------------
   
   @FindBy(xpath="//input[@name='email']")
   private WebElement email_txtbox;
   
   @FindBy(xpath="//input[@name='password']")
   private WebElement password_txtbox;
   
   @FindBy(xpath="//button[text()='Log In']")
   private WebElement login_btn;
   
   //---------------Action Method----------------------------------------
   
   public void enterEmailID() 
   {
	   email_txtbox.sendKeys("thoolhimani@gmail.com");
   }
   
   public void enterPassword() 
   {
	   password_txtbox.sendKeys("test@1234");
   }
   
   public void clickOnLoginButton() 
   {
	   login_btn.click();
   }
   
   public String getActualUrl() 
   {
	   String url = driver.getCurrentUrl();
	   return url;
   }
   
   
   
   
   
}
