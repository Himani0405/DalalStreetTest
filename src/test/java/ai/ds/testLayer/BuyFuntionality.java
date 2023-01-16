package ai.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.testBase.TestBase;
import ai.ds.utility.ReadXLSdata;

public class BuyFuntionality extends TestBase
{
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="stockname")
	public void verifyBuyFuntionality(String stockname) throws InterruptedException 
	{
		//------dash board functionality-------------------- 
		dash.enterCompanyName(stockname);
		dash.selectCompanyName();
		Thread.sleep(2000);
		//-----------------------------------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("1");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		String actualMsg = exchange.getStatus();
		logger.info(actualMsg);
		Assert.assertEquals(actualMsg, "Order Created successfully");
		
		
	}
	
//	@Test
//	public void verifyBuyFuntionalityWithIntraday() throws InterruptedException 
//	{
//		
//		//------dash board functionality-------------------- 
//		dash.enterCompanyName("Axis");
//		dash.selectCompanyName();
//		Thread.sleep(2000);
//		//-----------------------------------------------------------
//		exchange.clickOnBuyButton1();
//		exchange.clickOnIntradayButton();
//		exchange.enterQuantity("1");
//		exchange.clickOnBuyButton2();
//		Thread.sleep(3000);
//		String actualMsg = exchange.getStatus();
//		System.out.println(actualMsg);
//		Assert.assertEquals(actualMsg, "Order Created Successfully");
//		
//	}

}
