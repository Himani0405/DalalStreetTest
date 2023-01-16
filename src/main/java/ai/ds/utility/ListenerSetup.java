package ai.ds.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test case Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test case completed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Screen shot taken");
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
