package com.pageobjects;

import org.openqa.selenium.By;
import com.utilities.BaseClass;
import io.appium.java_client.AppiumDriver;


public class MobileCalcPageObject extends BaseClass
{
	
	public static final By BUTTON_7 = By.id("com.google.android.calculator:id/digit_7");
	public static final By BUTTON_0 = By.id("com.google.android.calculator:id/digit_0");
	public static final By BUTTON_3 = By.id("com.google.android.calculator:id/digit_3");
	public static final By OPERATOR_ADD = By.id("com.google.android.calculator:id/op_add");
	public static final By OPERATOR_MULTIPLY = By.id("com.google.android.calculator:id/op_mul");
	public static final By EQUAL = By.id("com.google.android.calculator:id/eq");
	public static final By CLEAR = By.id("com.google.android.calculator:id/clr");
	public static final By SEARCH_TEXT_FIELD = By.id("com.google.android.googlequicksearchbox:id/launcher_search_button");
	
    public MobileCalcPageObject(AppiumDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickAndSendKeys(AppiumDriver driver)
    {
    	try{
    		waitForExpectedElement(driver, SEARCH_TEXT_FIELD);
    		driver.findElement(SEARCH_TEXT_FIELD).click();
    		driver.findElement(SEARCH_TEXT_FIELD).sendKeys("gmail");
    	}
    	catch(Exception e)
		{
			System.out.println("Error is : " + e);
		}
    }

    public void clickButton_7(AppiumDriver driver) 
	{
		try
		{
			waitForExpectedElement(driver, BUTTON_7);
			driver.findElement(BUTTON_7).click();
		}
		catch(Exception e)
		{
			System.out.println("Error is : " + e);
		}
	}
    public void clickClearBtn(AppiumDriver driver) 
	{
		try
		{
			waitForExpectedElement(driver, CLEAR);
			driver.findElement(CLEAR).click();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
    
    public void clickEqualBtn(AppiumDriver driver) 
   	{
   		try
   		{
   			waitForExpectedElement(driver, EQUAL);
   			driver.findElement(EQUAL).click();
   		}
   		catch(Exception e)
   		{
   			e.getMessage();
   		}
   	}
    
    public void clickOperator_Add(AppiumDriver driver) 
	{
		try
		{
			waitForExpectedElement(driver, OPERATOR_ADD);
			driver.findElement(OPERATOR_ADD).click();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
    public void clickButton_3(AppiumDriver driver) 
	{
		try
		{
			waitForExpectedElement(driver, BUTTON_3);
			driver.findElement(BUTTON_3).click();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
    
    
    public void clickButton_0(AppiumDriver driver) 
   	{
   		try
   		{
   			waitForExpectedElement(driver, BUTTON_0);
   			driver.findElement(BUTTON_0).click();
   		}
   		catch(Exception e)
   		{
   			e.getMessage();
   		}
   	}
       
       public void clickOperator_Mul(AppiumDriver driver) 
   	{
   		try
   		{
   			waitForExpectedElement(driver, OPERATOR_MULTIPLY);
   			driver.findElement(OPERATOR_MULTIPLY).click();
   		}
   		catch(Exception e)
   		{
   			e.getMessage();
   		}
   	}
}
