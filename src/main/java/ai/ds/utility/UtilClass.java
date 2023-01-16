package ai.ds.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class UtilClass extends TestBase
{
	public UtilClass() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void takeScreenShot(String filename)  
	{
		String path="D:\\AutoWorkspace\\18juneMBDalalStreet_1\\screenshots\\";
		
		   try {
			   
			   TakesScreenshot ts=(TakesScreenshot)driver;
			   File src = ts.getScreenshotAs(OutputType.FILE);
			   File des=new File(path+filename+".png");
			    FileHandler.copy(src, des);
		      } 
		   catch (IOException e) 
		   {
			  e.printStackTrace();
		   }
	}

}
