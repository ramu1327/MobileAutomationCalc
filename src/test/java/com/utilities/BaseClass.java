package com.utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public AppiumDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static String appPath = null;
	

	public void setUp() throws MalformedURLException {
		
		appPath = projectPath + File.separator + "resources" + File.separator
				+ "Calculator_v8.2_(453324893)_apkpure.com.apk";

		DesiredCapabilities capabilities = new DesiredCapabilities();

		// for virtual device configuration to native app (Calculator)
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "96445020050005U");
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "10BCAC1BVU000G4");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability("app", appPath);
		
		/*
		// Set up desired capabilities and pass the Android app-activity and
		// app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		//capabilities.setCapability("VERSION", "6.0");
		capabilities.setCapability("VERSION", "13");
		//capabilities.setCapability("VERSION", "5.1.1");
		// capabilities.setCapability("udid", "ZY223DFTP4");
		// capabilities.setCapability("deviceName", "Moto E");
		//capabilities.setCapability("deviceName", "vivo Y72 5G");
		capabilities.setCapability("udid", "96445020050005U");
		capabilities.setCapability("automationName","UIAutomator2");
		capabilities.setCapability("app", appPath);
		
		//capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		// have to give apk path from com.goo..
		// capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		// This package name of your app (you can get it from apk info app)
		// have to give first one in activities of calculator details
		capabilities.setCapability("appActivity", "com.android.calculator2.CalculatorGoogle");
		
		*/

		// This is Launcher activity of your app (you can get it from apk info
		// app)
		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the
		// configurations specified in Desired Capabilities
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4444/session"), capabilities);
	}

	// Explicit wait method for element clickable
	public WebElement waitForExpectedElement(WebDriver driver, final By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
