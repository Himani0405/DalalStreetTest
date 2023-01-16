package ai.ds.pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class PortfolioPage extends TestBase
{
	public PortfolioPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	///-----------obj repo---------------------------
	
//	    private By data0=By.xpath("//table/tbody[1]/tr[1]/th");
	
	
	//--------------action methods------------------
	public String getDataFromPortfolio() 
	{
		 String data0 = driver.findElement(By.xpath("//table/tbody[1]/tr[1]/th")).getText();
		return data0;
		
	}
	public void getAllData() 
	{
		int row_count = driver.findElements(By.xpath("//table/tbody[1]/tr")).size();
		//int column_count=driver.findElements(By.xpath("//table/tbody[1]/tr[1]/th")).size();
		
		for(int i=1;i<=row_count;i++) 
		{
			String datah = driver.findElement(By.xpath("//table/tbody[1]/tr["+i+"]/th[1]")).getText();
			                                      // or  //table/tbody[1]/tr["+i+"]/th    same path becoz there is only on th
			System.out.print(datah+"            ");
			
			for(int j=1;j<3;j++) 
			{
			String datad = driver.findElement(By.xpath("//table/tbody[1]/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(datad+"  ");
			}
			System.out.println();
		}
		
		
	}
}
