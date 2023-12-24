package com.testscripts;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pageobjects.MobileCalcPageObject;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.BaseClass;
import com.utilities.MobileUtilities;


import io.appium.java_client.AppiumDriver;

public class MobileCalcTestScript extends BaseClass {
	
	MobileCalcPageObject objPage = new MobileCalcPageObject(driver);
	// store current working directory path
		public static String pth = System.getProperty("user.dir");
		public static String reportFilePath = pth + "/Reports/";
		MobileUtilities utilities = new MobileUtilities();
		public ExtentReports reports;
		// create reference-variable for extent test
		ExtentTest test;
		// creating object gor logger class
		Logger logger = Logger.getLogger(MobileCalcTestScript.class);
		
		public MobileCalcTestScript() throws Exception {
			//con.loadPropertyFile();
			// set for path to log4j file
			PropertyConfigurator.configure("./Log4j/log4j.properties");
		}
	
	@BeforeClass
	public void configuration() throws MalformedURLException
	{
		setUp();
	}
	
	@Test(priority = 1)
	public void addition() throws InterruptedException
	{
		test = utilities.reportsFile("Arithemetic Addition Operation Functionality In Calculator Screen");
		
		Thread.sleep(5000);
		objPage.clickButton_7(driver);
		logger.info("Clicked on Button7");
		test.log(LogStatus.INFO, "Clicked on Button7");
		
		Thread.sleep(5000);
		objPage.clickOperator_Add(driver);
		logger.info("Clicked on AddOperator");
		test.log(LogStatus.INFO, "Clicked on AddOperator");
		
		Thread.sleep(5000);
		objPage.clickButton_3(driver);
		logger.info("Clicked on Button3");
		test.log(LogStatus.INFO, "Clicked on Button3");
		
		Thread.sleep(5000);
		objPage.clickEqualBtn(driver);
		logger.info("Clicked on EqualBtn");
		test.log(LogStatus.INFO, "Clicked on EqualBtn");
		
		Thread.sleep(5000);
		objPage.clickClearBtn(driver);
		logger.info("Clicked on ClearBtn");
		test.log(LogStatus.INFO, "Clicked on ClearBtn");
		
		utilities.endReport();
	}
	
	@Test(priority = 2)
	public void multiplication() throws InterruptedException{
		
		test = utilities.reportsFile("Arithemetic Multiplication Operation Functionality In Calculator Screen");
		
		Thread.sleep(5000);
		objPage.clickButton_3(driver);
		logger.info("Clicked on Button3");
		test.log(LogStatus.INFO, "Clicked on Button3");
		
		Thread.sleep(5000);
		objPage.clickOperator_Mul(driver);
		logger.info("Clicked on MulOperator");
		test.log(LogStatus.INFO, "Clicked on MulOperator");
		
		Thread.sleep(5000);
		objPage.clickButton_0(driver);
		logger.info("Clicked on Button0");
		test.log(LogStatus.INFO, "Clicked on Button3");
		
		utilities.endReport();
		
	}
}
