package ai.ds.testLayer;

import org.testng.annotations.Test;

import ai.ds.testBase.TestBase;

public class PortfolioPageTest extends TestBase
{
    @Test
    public void getSpecificData() 
    {
    	dash.clickOnPortfolioLink();
    	String data = port.getDataFromPortfolio();
    	System.out.println(data);
    	port.getAllData();
    	
    }
	
}
