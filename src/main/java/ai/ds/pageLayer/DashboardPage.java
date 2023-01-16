 package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class DashboardPage extends TestBase
{
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//-----------obj repo----------------------------------------------
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_txtbox;
	
	@FindBy(xpath="(//div[@class='m-2 card-title'])[2]")
	private WebElement select_companyOption;
	
	@FindBy(linkText="Portfolio")
	private WebElement portfolio_link;
	
	
	//---------------Action methods------------------------------------
  
	public void enterCompanyName(String company_name) 
	{
		search_txtbox.sendKeys(company_name);
	}
	
	public void selectCompanyName()
	{
		select_companyOption.click();
	}
	
	public void clickOnPortfolioLink()
	{
		portfolio_link.click();
	}
	
}
