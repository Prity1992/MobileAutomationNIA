package com.aqm.staf.framework.core;

import static org.testng.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.exceptions.IterativeException;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.framework.core.hibernate.CustomizableEntity;
import com.google.common.base.Function;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
////import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
////import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public abstract class MobileScreen extends WebPage {
	protected AppiumDriver driver;
	protected MobileDriverWrapper mobileDriverWrapper;
	protected FrameworkServices frameworkServices;
	protected String screenName;
	private Properties prop;
	private int webDriverWait=40;
	private int afterClickWait=2;
	private int fluentPooling=3;
	


	public MobileScreen(AppiumDriver driver, String screenName, String DeviceOS) {

		try {
			loadProperties();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Boolean isWebView = false;

		if (DeviceOS.equalsIgnoreCase("Android")) {
			String WebView = prop.getProperty("AndroidLocatingStrategy");
			if (WebView.equalsIgnoreCase("webView"))
				isWebView = true;
		}
		if (DeviceOS.equalsIgnoreCase("MAC")) {
			String WebView = prop.getProperty("IOSLocatingStrategy");
			if (WebView.equalsIgnoreCase("webView"))
				isWebView = true;
		}

		if (isWebView == true) {
			Set contextNames = driver.getContextHandles();
			for (Object contextName : contextNames) {
				System.out.println(contextNames);
			}
			driver.context((String) contextNames.toArray()[1]); // set context
			// to WEBVIEW_1
		}
		// public WebPage(WebDriver driver, String pageName, Logger logger) {
		this.driver = driver;
		this.screenName = screenName;
		mobileDriverWrapper = new MobileDriverWrapper(driver);
		frameworkServices = new FrameworkServices();
		// this.logger = logger;
	}

	public void clickBackButton(int waitingBeforeHitBack) throws InterruptedException{
		Thread.sleep(waitingBeforeHitBack);
		driver.navigate().back();
	}

	public void sendNumberByNumericKeyboard(int number){
		////((AndroidDeviceActionShortcuts) driver).pressKeyCode(number);

	}

	public void closeRunningApp(){
		driver.closeApp();
		driver.close();
	}
	public void loadProperties() throws IOException {
		InputStream input;
		Properties ConfigProp;
		InputStream ConfigInput;
		prop = new Properties();
		input = new FileInputStream("config.properties");
		prop.load(input);
		ConfigProp = new Properties();
		ConfigInput = new FileInputStream("config.properties");
		ConfigProp.load(ConfigInput);
	}

	public MobileScreen() {

	}

	protected AndroidDriver getAndroidDriver(){
		return (AndroidDriver) driver;
	}

	private MobileElement waitForElementAndReturnElement(MobileScreenElement MobileScreenElement) {
		switch (MobileScreenElement.getWaitType()) {
		case WAITFORELEMENTTOBECLICKABLE:
			try {
				return mobileDriverWrapper.waitForElementToBeClickable(MobileScreenElement.getBy(),
						MobileScreenElement.getTimeOut());
			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " not loaded within specified wait time of " + MobileScreenElement.getTimeOut(), e,screenName);
			}

		case WAITFORELEMENTTOBEEENABLED:
			try {
				return mobileDriverWrapper.waitForElementToBeEnabled(MobileScreenElement.getBy(),
						MobileScreenElement.getTimeOut());
			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " was disabled beyond specified wait time " + MobileScreenElement.getTimeOut(), e,screenName);
			}

		case WAITFORELEMENTTOBEDISPLAYED:
			try {
				return mobileDriverWrapper.waitForElementToBeDisplayed(MobileScreenElement.getBy(),
						MobileScreenElement.getTimeOut());
			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " was not displayed in specified wait time " + MobileScreenElement.getTimeOut(), e,screenName);
			}

		default:
			return (MobileElement) driver.findElement(MobileScreenElement.getBy());
		}
	}

	protected void waitForPageElement(MobileScreenElement MobileScreenElement) {
		boolean isMobileElementAvailableInScreenElement = isMobileElementAvailableInScreenElement(MobileScreenElement);
		switch (MobileScreenElement.getWaitType()) {
		case WAITFORELEMENTTOBECLICKABLE:
			try {
				if (!isMobileElementAvailableInScreenElement)
					mobileDriverWrapper.waitForElementToBeClickable(MobileScreenElement.getBy(),
							MobileScreenElement.getTimeOut());
				else
					mobileDriverWrapper.waitForElementToBeClickable(MobileScreenElement.getMobileElement(),
							MobileScreenElement.getTimeOut());

			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " was not clickable within specified wait time " + MobileScreenElement.getTimeOut(), e,screenName);
			}
			break;

		case WAITFORELEMENTTOBEEENABLED:
			try {
				if (!isMobileElementAvailableInScreenElement)
					mobileDriverWrapper.waitForElementToBeEnabled(MobileScreenElement.getBy(),
							MobileScreenElement.getTimeOut());
				else
					mobileDriverWrapper.waitForElementToBeEnabled(MobileScreenElement.getMobileElement(),
							MobileScreenElement.getTimeOut());
			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " was not loaded within specified wait time " + MobileScreenElement.getTimeOut(), e,screenName);
			}
			break;

		case WAITFORELEMENTTOBEDISPLAYED:
			try {
				if (!isMobileElementAvailableInScreenElement)
					mobileDriverWrapper.waitForElementToBeDisplayed(MobileScreenElement.getBy(),
							MobileScreenElement.getTimeOut());
				else
					mobileDriverWrapper.waitForElementToBeDisplayed(MobileScreenElement.getMobileElement(),
							MobileScreenElement.getTimeOut());

			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " was not displayed within specified wait time " + MobileScreenElement.getTimeOut(), e,screenName);
			}
			break;

		case WAITFORELEMENTTODISAPPEAR:
			try {
				if (!isMobileElementAvailableInScreenElement)
					mobileDriverWrapper.waitForElementToDisapper(MobileScreenElement.getBy(),
							MobileScreenElement.getTimeOut());
				else {
					mobileDriverWrapper.waitForElementToDisapper(MobileScreenElement.getMobileElement(),
							MobileScreenElement.getTimeOut());
				}

			} catch (TimeoutException e) {
				throw new ScriptExecutionException(MobileScreenElement.getName()
						+ " did not disappered within specified wait time " + MobileScreenElement.getTimeOut(), e,screenName);
			}
			break;
		default:
			break;
		}
	}

	private boolean isMobileElementAvailableInScreenElement(MobileScreenElement MobileScreenElement) {
		return !(MobileScreenElement.getMobileElement() == null);
	}

	protected MobileElement getMobileElement(MobileScreenElement MobileScreenElement) {
		if (MobileScreenElement.isSlowLoadableComponent()) {
			return waitForElementAndReturnElement(MobileScreenElement);
		} else
			return (MobileElement) driver.findElement(MobileScreenElement.getBy());
	}

	protected void sendKeys(MobileScreenElement MobileScreenElement, String value) {
		try {
			value = (value == null) ? "" : value;

			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				getMobileElement(MobileScreenElement).sendKeys(value);
			else
				MobileScreenElement.getMobileElement().sendKeys(value);

			frameworkServices.logMessage("Typed Value: " + value + "' in " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Typed Value: " + value + "' in " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to type value: '" + value + "' in " + MobileScreenElement.getName() + " on : '" + screenName
					+ "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' " + "' Column Name:  '"
					+ CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",
					exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}
	//SendMobileNo(newMobileNoTextField,logindata.getStringValueForField("MobileNo"));
	protected void SendMobileNo(MobileScreenElement MobileScreenElement, String MobileNo) {
			String mobileNo;
			try {
					WebElement element;
					mobileNo=MobileNo;
					if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
						element = getMobileElement(MobileScreenElement);
					else
						element = MobileScreenElement.getMobileElement();
					element.clear();
					element.sendKeys(mobileNo);
					Thread.sleep(500);			
				

				//for(int i = 0; i <= mobileNo.length(); i++)
//			        {
//			                        Thread.sleep(500);
//			                      
//						//element.sendKeys(Character.toString(mobileNo.charAt(i)));
//						element.sendKeys(mobileNo);
//						Thread.sleep(500);
//			        }
				frameworkServices.logMessage("Cleared and Typed Value: " + mobileNo + "' in " + MobileScreenElement.getName());
				// frameworkServices.logMessage("Cleared and Typed Value: " + value
				// + "' in " + pageElement.getName(), logger);
			} catch (Exception exception) {
				throw new ScriptExecutionException(
						"Failed to clear and type value: '" + MobileNo + "' in " + MobileScreenElement.getName() + " on : '"
								+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
								+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
								+ CustomizableEntity.runningRowReference + "' ",
								exception,screenName);
			} finally {
				MobileScreenElement = null;
			}
		}
	
	protected void sendKeys(MobileScreenElement MobileScreenElement, Keys key) {
		try {
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				getMobileElement(MobileScreenElement).sendKeys(key);
			else
				MobileScreenElement.getMobileElement().sendKeys(key);

			frameworkServices.logMessage("Typed Value: " + key + "' in " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Typed Value: " + key + "' in " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to press : '" + key + "' in " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

//	protected void clearAndSendKeys(MobileScreenElement MobileScreenElement, String value) {
//		try {
//			MobileElement element;
//			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
//				element = getMobileElement(MobileScreenElement);
//			else
//				element = MobileScreenElement.getMobileElement();
//
//			element.clear();
//			element.sendKeys(value);
//
//			FrameworkServices.logMessage("Cleared and Typed Value: " + value + "' in " + MobileScreenElement.getName());
//			// frameworkServices.logMessage("Cleared and Typed Value: " + value
//			// + "' in " + pageElement.getName(), logger);
//		} catch (Exception exception) {
//			throw new ScriptExecutionException(
//					"Failed to clear and type value: '" + value + "' in " + MobileScreenElement.getName() + " on : '"
//							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
//							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
//							+ CustomizableEntity.runningRowReference + "' ",
//							exception,screenName);
//		} finally {
//			MobileScreenElement = null;
//		}
//	}

	protected void SendNumberByIOSKeypad(MobileScreenElement MobileScreenElement, Integer number){

		try {
			@SuppressWarnings("unused")
			MobileElement element;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				element = getMobileElement(MobileScreenElement);
			else
				element = MobileScreenElement.getMobileElement();
			element.click();
			
			CharSequence num = new StringBuilder(number.toString());
			driver.getKeyboard().sendKeys(num);
		}
		catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to Type by Numeric Keypad: '" + number + "' in " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}


	protected void SendNumberByAndroidKeypad(MobileScreenElement MobileScreenElement, Integer number){

		try {
			@SuppressWarnings("unused")
			MobileElement element;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				element = getMobileElement(MobileScreenElement);
			else
				element = MobileScreenElement.getMobileElement();

			HashMap<Integer,Integer> mapOfkeyPoints = new HashMap<Integer,Integer>();
			LinkedList<Integer> stack = new LinkedList<Integer>();

			mapOfkeyPoints.put(0,7);
			mapOfkeyPoints.put(1,8);
			mapOfkeyPoints.put(2,9);
			mapOfkeyPoints.put(3,10);
			mapOfkeyPoints.put(4,11);
			mapOfkeyPoints.put(5,12);
			mapOfkeyPoints.put(6,13);
			mapOfkeyPoints.put(7,14);
			mapOfkeyPoints.put(8,15);
			mapOfkeyPoints.put(9,16);


			while(number>0){
				stack.push(number % 10);
				number = number / 10; 
			}

			while (!stack.isEmpty()) {
				sendNumberByNumericKeyboard(mapOfkeyPoints.get(stack.pop()));
			}

			FrameworkServices.logMessage("Typed by Numeric Keypad: " + number + "' in " + MobileScreenElement.getName());

		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to Type by Numeric Keypad: '" + number + "' in " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected void SelectValueAndTypeForTextField(MobileScreenElement MobileScreenElement, String value) {
		try {
			MobileElement element;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				element = getMobileElement(MobileScreenElement);
			else
				element = MobileScreenElement.getMobileElement();

			element.click();
			Actions actionBuilder = new Actions(driver);
			actionBuilder.doubleClick(element).build().perform();
			// String comboKeys = ;
			element.sendKeys(Keys.SHIFT, Keys.END);
			element.sendKeys(value);
			frameworkServices.logMessage("Cleared and Typed Value: " + value + "' in " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Cleared and Typed Value: " + value
			// + "' in " + pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to clear and type value: '" + value + "' in " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

//	protected void click(MobileScreenElement MobileScreenElement) {
//		try {
//			
//			MobileElement element;
//			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
//				element = getMobileElement(MobileScreenElement);
//			else
//				element = MobileScreenElement.getMobileElement();
//			element.click();
//			frameworkServices.logMessage("Clicked on: " + MobileScreenElement.getName());
//			// frameworkServices.logMessage("Clicked on: " +
//			// pageElement.getName(), logger);
//		} catch (Exception exception) {
//			throw new ScriptExecutionException("Failed to click on : '" + MobileScreenElement.getName() + "' on : '"
//					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
//					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
//					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
//		} finally {
//			MobileScreenElement = null;
//		}
//	}
	


	protected void scrollToElementForward() {
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(90,1000))
		.moveTo(PointOption.point(90,440))
		.release().perform();
		
	}
	protected void scrollToElementBackward() {
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(90,200))
		.moveTo(PointOption.point(90,1000))
		.release().perform();
		
	}

	protected void scrollDown() {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.7;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(0, scrollStart))
			.moveTo(PointOption.point(0, scrollEnd)).release().perform();
		
		
		
	}
	
	
	
		private WaitOptions ofSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

		// TODO Auto-generated method stub   .waitAction(ofSeconds(1))

	
	protected void scrollUp() {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.7;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(0, scrollEnd))
			.moveTo(PointOption.point(0, scrollStart))
			.release().perform();
		
	}

	protected boolean isElementDisplayed(MobileScreenElement MobileScreenElement) {
		boolean isElementDisplayed = false;
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();
			isElementDisplayed = mobileElement.isDisplayed();
			frameworkServices.logMessage("<B>" + MobileScreenElement.getName() + " is Displayed </B>");
		} catch (Exception e) {
			throw new ScriptExecutionException("Failed to display: '" + MobileScreenElement.getName() + " on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", e,screenName);
		} finally {
			MobileScreenElement = null;
		}
		return isElementDisplayed;
	}

	protected void swipeRight(MobileScreenElement ScrollableLayoutElement) {
		try {
			int swipeSpeed= 300;
			MobileElement elementlayout;
			if (!isMobileElementAvailableInScreenElement(ScrollableLayoutElement))
				elementlayout = getMobileElement(ScrollableLayoutElement);
			else
				elementlayout = ScrollableLayoutElement.getMobileElement();
			Point point = elementlayout.getLocation();
			Dimension size = elementlayout.getSize();
			int startx = (int) (point.getX() + size.getWidth() / 2.0);
			int starty = (int) (point.getY() + size.getHeight() / 2.0);
			int endx= (int) (startx* (0.1));
			//driver.swipe(startx, starty, endx, starty, swipeSpeed);
			frameworkServices.logMessage("Swipe Right on: " + ScrollableLayoutElement.getName());
		}
		catch (Exception exception) {
			throw new ScriptExecutionException("No such Scrollable layout found: '" + ScrollableLayoutElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			ScrollableLayoutElement = null;
		}
	}

	protected void swipeLeft(MobileScreenElement ScrollableLayoutElement) {
		try {
			int swipeSpeed= 300;
			MobileElement elementlayout;
			if (!isMobileElementAvailableInScreenElement(ScrollableLayoutElement))
				elementlayout = getMobileElement(ScrollableLayoutElement);
			else
				elementlayout = ScrollableLayoutElement.getMobileElement();
			Point point = elementlayout.getLocation();
			Dimension size = elementlayout.getSize();
			int startx = (int) (point.getX() + size.getWidth() / 2.0);
			int starty = (int) (point.getY() + size.getHeight() / 2.0);
			int endx= (int) (startx* (1.8));
			////driver.swipe(startx, starty, endx, starty, swipeSpeed);
			frameworkServices.logMessage("Swipe left on: " + ScrollableLayoutElement.getName());
		}
		catch (Exception exception) {
			throw new ScriptExecutionException("No such Scrollable layout found: '" + ScrollableLayoutElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			ScrollableLayoutElement = null;
		}
	}

	protected void swipeDown(MobileScreenElement ScrollableLayoutElement) {
		try {
			int swipeSpeed= 1000;
			MobileElement elementlayout;
			if (!isMobileElementAvailableInScreenElement(ScrollableLayoutElement))
				elementlayout = getMobileElement(ScrollableLayoutElement);
			else
				elementlayout = ScrollableLayoutElement.getMobileElement();
			Point point = elementlayout.getLocation();
			Dimension size = elementlayout.getSize();
			int startx = (int) (point.getX() + size.getWidth() / 2.0);
			int starty = (int) (point.getY() + size.getHeight() / 2.0);
			int endy= (int) (starty* (0.1));
			System.out.println();
			////driver.swipe(startx, starty, startx, endy, swipeSpeed);
			frameworkServices.logMessage("Swipe down on: " + ScrollableLayoutElement.getName());
		}
		catch (Exception exception) {
			throw new ScriptExecutionException("No such Scrollable layout found: '" + ScrollableLayoutElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			ScrollableLayoutElement = null;
		}
	}

	
	protected void swipeIOSDown(IOSScreenElements ScrollableLayoutElement) {
		try {
			int swipeSpeed= 1000;
			IOSScreenElements elementlayout;
			
			Point point = ScrollableLayoutElement.getLocation();
			Dimension size = ScrollableLayoutElement.getSize();
			int startx = (int) (point.getX() + size.getWidth() / 2.0);
			int starty = (int) (point.getY() + size.getHeight() / 2.0);
			int endy= (int) (starty* (0.1));
			System.out.println("Startx= "+startx);
			System.out.println("starty= "+starty);
			System.out.println("endy= "+endy);
			////driver.swipe(startx, starty, startx, endy, swipeSpeed);
			frameworkServices.logMessage("Swipe down on: " + ScrollableLayoutElement.getName());
		}
		catch (Exception exception) {
			throw new ScriptExecutionException("No such Scrollable layout found: '" + ScrollableLayoutElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			ScrollableLayoutElement = null;
		}
	}
	
	
	protected void swipeToDesiredElementAndClick(MobileScreenElement ScrollableLayoutElement,MobileScreenElement MobileScreenElement,MobileScreenElement LastMobileScreenElement) {
		try {
			for (int i = 0; i < 50; i++) {
				try{
					if(isElementDisplayed(MobileScreenElement)){
						click(MobileScreenElement);
						frameworkServices.logMessage("Searched and Clicked on: " + MobileScreenElement.getName());
						break;
					}
				}
				catch(Exception e) {
					try{
						if(isElementDisplayed(LastMobileScreenElement)){
							throw new IterativeException("Failed to Search and Click on : ",screenName);
						}
						break;
					}
					catch (IterativeException see) {
						throw new IterativeException("Failed to Search and Click (No such Element found) '" + MobileScreenElement.getName() + "' on : '"
								+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
								+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
								+ CustomizableEntity.runningRowReference + "' ",screenName);
					}
					catch(ScriptExecutionException ex){
						swipeDown(ScrollableLayoutElement);
						continue;
					}	
				}
			} 
		} 
		catch (Exception exception) {
			throw new ScriptExecutionException("Failed to Search and Click (No such Element found) '" + MobileScreenElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected void swipeToDesiredElementAndClickTIMER(MobileScreenElement ScrollableLayoutElement,MobileScreenElement MobileScreenElement) {
		try {
			int TERMINATIONTIMEOUT= 30*1000;
			StopWatch stopwatch= new StopWatch();
			stopwatch.reset();
			stopwatch.start();

			for (int i = 0; i < 50; i++) {
				try{
					if(isElementDisplayed(MobileScreenElement)){
						click(MobileScreenElement);
						frameworkServices.logMessage("Searched and Clicked on: " + MobileScreenElement.getName());
						break;
					}
				}
				catch(Exception ex){
					if(stopwatch.getTime()<= TERMINATIONTIMEOUT){
						swipeDown(ScrollableLayoutElement);
						continue;
					}
					else if(stopwatch.getTime()>TERMINATIONTIMEOUT){
						throw new ScriptExecutionException("Timeout to Search and Click on: '" + MobileScreenElement.getName() + "' on : '"
								+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
								+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
								+ CustomizableEntity.runningRowReference + "' ",screenName);
					}break;		
				}
			}
			stopwatch.stop();
		}

		catch (Exception exception) {
			throw new ScriptExecutionException("Timeout to Search and Click on : '" + MobileScreenElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			MobileScreenElement = null;
		}
	}
	
	protected void swipeDownios() {
		////driver.swipe(100,100,100,250,2000);
	}
	
	/*protected void swipeElement(SwipeElementDirection direction, MobileScreenElement beneficieryNameLabel, int duration) {
		beneficieryNameLabel.swipe(direction, duration);
	}*/

	protected void check(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			if (!mobileElement.isSelected())
				mobileElement.click();

			frameworkServices.logMessage("Checked  " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Checked " + pageElement.getName(),
			// logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to check: '" + MobileScreenElement.getName() + " on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	
	
	protected void unCheck(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			if (mobileElement.isSelected())
				mobileElement.click();

			frameworkServices.logMessage("Unchecked  " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Unchecked " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to uncheck: '" + MobileScreenElement.getName() + " on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected String acceptAlertAndReturnConfirmationMessage() {
		try {
			Thread.sleep(3000);
			String confirmationMessage = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();

			frameworkServices.logMessage("fetched text: " + confirmationMessage + " from alert box and accepted");
			// frameworkServices.logMessage("fetched text: " +
			// confirmationMessage + " from alert box and accepted", logger);
			return confirmationMessage;
		} catch (Exception exception) {
			throw new ScriptExecutionException("failed to accept alert on " + screenName + "' Refer to Sheet:  '"
					+ CustomizableEntity.runningSheetName + "' " + "' Column Name:  '"
					+ CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		}
	}

	protected String dismissAlertAndReturnConfirmationMessage() {
		try {
			String confirmationMessage = driver.switchTo().alert().getText();
			driver.switchTo().alert().dismiss();

			frameworkServices.logMessage("fetched text: " + confirmationMessage + " from alert box and accepted");
			// frameworkServices.logMessage("fetched text: " +
			// confirmationMessage + " from alert box and accepted", logger);
			return confirmationMessage;
		} catch (Exception exception) {
			throw new ScriptExecutionException("failed to dismiss alert on " + screenName + "' Refer to Sheet:  '"
					+ CustomizableEntity.runningSheetName + "' " + "' Column Name:  '"
					+ CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		}
	}

	protected void doubleClick(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement MobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				MobileElement = getMobileElement(MobileScreenElement);
			else
				MobileElement = MobileScreenElement.getMobileElement();

			Actions actionBuilder = new Actions(driver);
			actionBuilder.doubleClick(MobileElement).build().perform();

			frameworkServices.logMessage("Double Clicked on: " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Double Clicked on: " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to doubleclick: '" + "' on " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected String getText(MobileScreenElement MobileScreenElement) {
		String text = new String();
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			text = mobileElement.getText().trim();

			frameworkServices.logMessage("Fetched text: " + text + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched text: " + text + " of " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to fetch text: '" + "' of " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
		return text;
	}

	protected String getAttribute(MobileScreenElement MobileScreenElement, String attributeName) {
		String atributeValue = new String();
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			atributeValue = mobileElement.getAttribute(attributeName).trim();

			frameworkServices.logMessage(
					"Fetched " + attributeName + ":" + atributeValue + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched " + attributeName + ":" +
			// atributeValue + " of " + pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to fetch '" + attributeName + "' of " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
		return atributeValue;
	}

	protected boolean isElementSelected(MobileScreenElement MobileScreenElement) {
		boolean isElementDisplayed = false;
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			isElementDisplayed = mobileElement.isSelected();

			frameworkServices.logMessage(MobileScreenElement.getName() + " is Displayed ");
			// frameworkServices.logMessage(pageElement.getName() + " is
			// Displayed ", logger);
		} catch (Exception e) {
			frameworkServices.logMessage(MobileScreenElement.getName() + " is not Displayed ");
			// frameworkServices.logMessage(pageElement.getName() + " is not
			// Displayed ", logger);
		} finally {
			MobileScreenElement = null;
		}
		return isElementDisplayed;
	}

	protected boolean isElementEnabled(MobileScreenElement MobileScreenElement) {
		boolean isElementEnabled = false;
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			isElementEnabled = mobileElement.isEnabled();

			frameworkServices.logMessage(MobileScreenElement.getName() + " is Enabled ");
			// frameworkServices.logMessage(pageElement.getName() + " is Enabled
			// ", logger);
		} catch (Exception e) {
			frameworkServices.logMessage(MobileScreenElement.getName() + " is not Enabled ");
			// frameworkServices.logMessage(pageElement.getName() + " is not
			// Enabled ", logger);
		} finally {
			MobileScreenElement = null;
		}
		return isElementEnabled;
	}

	protected void selectValueFromList(MobileScreenElement MobileScreenElement, String value) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();
			Select select = new Select(mobileElement);
			select.selectByVisibleText(value);

			frameworkServices.logMessage("Selected Value: " + value + "' in " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Selected Value: " + value + "' in "
			// + pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to Select value: '" + value + "' of " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected void mouseOver(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			Actions actionBuilder = new Actions(driver);
			actionBuilder.moveToElement(mobileElement).build().perform();

			frameworkServices.logMessage("Hoverd mouse on: " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Hoverd mouse on: " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to hover mouse: '" + "' on " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected String getSelectedValueFromList(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			Select selectType = new Select(mobileElement);
			String selectedValue = selectType.getFirstSelectedOption().getText();

			frameworkServices.logMessage("Fetched " + selectedValue + "  " + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched " + selectedValue + " " + "
			// of " + pageElement.getName(), logger);
			return selectedValue;
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to fetch " + "Selected Value" + "' of " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected ArrayList<String> getAllOptionsInList(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			Select selectList = new Select(mobileElement);
			ArrayList<String> optionList = new ArrayList<String>();

			for (WebElement option : selectList.getOptions()) {
				optionList.add(option.getText().trim());
			}

			frameworkServices.logMessage("Fetched " + optionList + "  " + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched " + optionList + " " + " of
			// " + pageElement.getName(), logger);
			return optionList;
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to fetch " + "option Value" + "' of " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}
	// TODO
	/*
	 * protected void bringElementInView (PageElement pageElement) { try {
	 * WebElement webElement; if
	 * (!isMobileElementAvailableInScreenElement(pageElement)) webElement =
	 * getMobileElement(pageElement); else webElement =
	 * pageElement.getWebElement();
	 * 
	 * ((JavascriptExecutor)
	 * driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
	 * 
	 * frameworkServices.logMessage("Brought  " + pageElement.getName() + "  " +
	 * " in the current browser view "); //frameworkServices.logMessage(
	 * "Brought  " + pageElement.getName() + "  " +
	 * " in the current browser view ", logger); } catch (Exception exception) {
	 * throw new ScriptExecutionException("Failed to bring Element  " +
	 * pageElement.getName() + "  " + " in the current browser view " +
	 * " on : '" + pageName + "' Refer to Sheet:  '"
	 * +CustomizableEntity.runningSheetName+"' "+ "' Column Name:  '"
	 * +CustomizableEntity.runningElement+"' "+ "' Row Reference :  '"
	 * +CustomizableEntity.runningRowReference+"' ", exception); } finally {
	 * pageElement = null; } }
	 */

	protected void switchToWindow(String windowTitle) throws InterruptedException {
		try {
			Thread.sleep(1000);
			Set<String> windows = driver.getWindowHandles();

			for (String window : windows) {
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				if (driver.getTitle().contains(windowTitle))
					break;
			}
		}

		catch (Exception e) {
			throw new ScriptExecutionException("Failed to search Criteria: ", e,screenName);
		}
	}

	protected void switchToWindow(String windowTitle, String errorTitleWindow) throws InterruptedException {
		try {
			Thread.sleep(1000);
			ArrayList<String> alltitles = new ArrayList<String>();
			Set<String> windows = driver.getWindowHandles();

			for (String window : windows) {
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				alltitles.add(driver.getTitle());
			}
			if (alltitles.contains(errorTitleWindow)) {
				throw new ScriptExecutionException("Error Window Encountered While Execution.",screenName);
			} else if (alltitles.contains(windowTitle)) {
				switchToWindow(windowTitle);

			} else {
				throw new ScriptExecutionException("Expected page: " + windowTitle + " NOT FOUND ",screenName);
			}
		} catch (Exception e) {
			throw new ScriptExecutionException("Failed to search Criteria: ", e,screenName);
		}
	}

	protected void closeWindow(String windowTitle) throws InterruptedException {
		try {
			Thread.sleep(1000);
			driver.close();
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to Close the Window with title \"" + windowTitle + " \"",
					exception,screenName);
		}
	}

	protected void checkOrUncheck(MobileScreenElement MobileScreenElement, Boolean config) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			if (!mobileElement.isSelected() && config.equals(true)) {
				mobileElement.click();
			} else if (mobileElement.isSelected() && config.equals(false)) {
				mobileElement.click();
			}
			frameworkServices.logMessage("Checked  " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Checked " + pageElement.getName(),
			// logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to check: '" + MobileScreenElement.getName() + " on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected String fetchValueFromFields(MobileScreenElement MobileScreenElement) {
		String text = new String();
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			text = mobileElement.getText().trim();

			frameworkServices.logMessage("Fetched text: " + text + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched text: " + text + " of " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to fetch text: '" + "' of " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
		return text;
	}

	protected String fetchValueFromTextFields(MobileScreenElement MobileScreenElement) {
		String text = new String();
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			text = mobileElement.getAttribute("value").trim();

			frameworkServices.logMessage("Fetched text: " + text + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched text: " + text + " of " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to fetch text: '" + "' of " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
		return text;
	}

	protected String fetchValueFromList(MobileScreenElement MobileScreenElement) {
		String text = new String();
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();
			Select select = new Select(mobileElement);
			text = select.getFirstSelectedOption().getText();

			frameworkServices.logMessage("Fetched text: " + text + " of " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Fetched text: " + text + " of " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to fetch text: '" + "' of " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
		return text;
	}

	protected void clearAndEnterDate(MobileScreenElement MobileScreenElement, String date) {
		try {
			String[] splitddate = date.split("/");
			WebElement element;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				element = getMobileElement(MobileScreenElement);
			else
				element = MobileScreenElement.getMobileElement();
			element.clear();
			for (int i = 0; i < splitddate.length; i++) {
				Thread.sleep(500);
				element.sendKeys(splitddate[i]);
				Thread.sleep(500);
			}
			frameworkServices.logMessage("Cleared and Typed Value: " + date + "' in " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Cleared and Typed Value: " + value
			// + "' in " + pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException(
					"Failed to clear and type value: '" + date + "' in " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}

	}

	/*
	 * protected void switchToFrame(String frameName){ try { Thread.sleep(1000);
	 * driver.switchTo().defaultContent(); Thread.sleep(1000); String
	 * xpathForFrame="//frameset//frame[@name='"+frameName+"']"; WebElement
	 * frame=driver.findElement(By.xpath(xpathForFrame));
	 * driver.switchTo().frame(frame); frameworkServices.logMessage(
	 * "Switch to frame " + frameName); //frameworkServices.logMessage(
	 * "Cleared and Typed Value: " + value + "' in " + pageElement.getName(),
	 * logger); } catch (Exception exception) { throw new
	 * ScriptExecutionException ("Failed to switch to Frame: '" + frameName +
	 * "' in on : '" + pageName + "' Refer to Sheet:  '"
	 * +CustomizableEntity.runningSheetName+"' "+ "' Column Name:  '"
	 * +CustomizableEntity.runningElement+"' "+ "' Row Reference :  '"
	 * +CustomizableEntity.runningRowReference+"' ", exception); } finally {
	 * frameName=null; } }
	 */
	/*
	 * protected void selectDateFromCalender(PageElement pageElement,String
	 * dateToBeAdded) throws InterruptedException{ String date=null;
	 * RandomCodeGenerator randomCodeGenerator=new RandomCodeGenerator();
	 * date=randomCodeGenerator.calenderDateGenerator(dateToBeAdded);
	 * click(pageElement); String[] splitddate=date.split("/");
	 * driver.switchTo().defaultContent(); Thread.sleep(2000); switchToWindow(
	 * "IIMS: Calendar"); driver.switchTo().defaultContent();
	 * driver.manage().window().maximize(); Thread.sleep(1000); WebElement
	 * year=driver.findElement(By.name("year")); year.clear();
	 * acceptAlertAndReturnConfirmationMessage(); String yearVal =
	 * splitddate[2].trim(); year.sendKeys(yearVal); Thread.sleep(200);
	 * WebElement month=driver.findElement(By.name("month")); month.click();
	 * Thread.sleep(200); Select select = new Select(month);
	 * select.selectByVisibleText(splitddate[1].trim()); Thread.sleep(200);
	 * WebElement
	 * dayOfMonth=driver.findElement(By.xpath("//input[@value='"+splitddate[0].
	 * trim()+"']")); dayOfMonth.click(); Thread.sleep(200); switchToWindow(); }
	 */
	protected void enterMessageInAlert(String message) {
		try {
			Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			alert.sendKeys(message);
			alert.accept();
			frameworkServices
			.logMessage("fetched text from Alert: " + alertMessage + " from alert box and entered" + message);
			// frameworkServices.logMessage("fetched text: " +
			// confirmationMessage + " from alert box and accepted", logger);

		} catch (Exception exception) {
			throw new ScriptExecutionException("failed to accept alert on " + screenName + "' Refer to Sheet:  '"
					+ CustomizableEntity.runningSheetName + "' " + "' Column Name:  '"
					+ CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		}
	}

	/*
	 * protected void switchToFrame(String frameName,WebDriver driver){ try {
	 * Thread.sleep(1000); driver.switchTo().defaultContent();
	 * Thread.sleep(500); String
	 * xpathForFrame="//frameset//frame[@name='"+frameName+"']"; WebElement
	 * frame=driver.findElement(By.xpath(xpathForFrame));
	 * driver.switchTo().frame(frame); //frameworkServices.logMessage(
	 * "Switch to frame " + frameName); //frameworkServices.logMessage(
	 * "Cleared and Typed Value: " + value + "' in " + pageElement.getName(),
	 * logger); } catch (Exception exception) { throw new
	 * ScriptExecutionException ("Failed to switch to Frame: '" + frameName +
	 * "' in on : '" + screenName + "' Refer to Sheet:  '"
	 * +CustomizableEntity.runningSheetName+"' "+ "' Column Name:  '"
	 * +CustomizableEntity.runningElement+"' "+ "' Row Reference :  '"
	 * +CustomizableEntity.runningRowReference+"' ", exception); } finally {
	 * frameName=null; } }
	 */
	/*
	 * protected void switchToWindow() throws InterruptedException { String
	 * title = null;
	 * 
	 * try{ Thread.sleep(1000); Set<String> parentWindow =
	 * driver.getWindowHandles();
	 * 
	 * 
	 * for(String winHandle : driver.getWindowHandles()) { if
	 * (!parentWindow.equals(winHandle)) { title=
	 * driver.switchTo().window(winHandle).getTitle();
	 * driver.manage().window().maximize(); Dimension
	 * dimension2=driver.manage().window().getSize(); int
	 * heightAfterSwitch=dimension2.getHeight(); int
	 * widthAfterSwitch=dimension2.getWidth(); if(heightAfterSwitch==1000 &&
	 * widthAfterSwitch==1296 ){ break; } Thread.sleep(1000); } } }
	 * catch(Exception e){ throw new ScriptExecutionException (
	 * "Failed to Switch window: ", e); } }
	 */
	protected void switchToDefaultFrame() throws InterruptedException {
		String title = null;
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			throw new ScriptExecutionException("Failed to search Criteria: ", e,screenName);
		}
	}

	protected void clearAndEnterTime(MobileScreenElement MobileScreenElement) {
		try {
			RandomCodeGenerator randomCodeGenerator = new RandomCodeGenerator();
			String time = randomCodeGenerator.timeGenerator();
			String[] splitTime = time.split(":");
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();
			mobileElement.clear();
			for (int i = 0; i < splitTime.length; i++) {
				Thread.sleep(300);
				mobileElement.sendKeys(splitTime[i]);
				Thread.sleep(300);
			}
			frameworkServices.logMessage("Cleared and Typed Value: " + time + "' in " + MobileScreenElement.getName());
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to clear and type value: '' in " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	public Integer generate7digitrandom(){

		Integer num=RandomUtils.nextInt(1000000,9999999);

		return num;

	}

	public void click(MobileScreenElement MobileScreenElement, AppiumDriver driver) {

		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();
			mobileElement.click();

			frameworkServices.logMessage("Clicked on: " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Clicked on: " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to click on : '" + MobileScreenElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}

	}

	public boolean isAlertPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
			return true;
		} else {
			driver.switchTo().alert().accept();
			return false;

		}
	}

	/*
	 * protected void bringWebElementInView (PageElement pageElement) { try {
	 * WebElement webElement = getMobileElement(pageElement); if
	 * (!isMobileElementAvailableInScreenElement(pageElement))
	 * ((JavascriptExecutor)
	 * driver).executeAsyncScript("arguments[0].scrollIntoView(true);",
	 * webElement); frameworkServices.logMessage("Brought  " +
	 * pageElement.getName() + "  " + " in the current browser view ");
	 * //frameworkServices.logMessage("Brought  " + pageElement.getName() + "  "
	 * + " in the current browser view ", logger); } catch (Exception exception)
	 * { throw new ScriptExecutionException("Failed to bring Element  " +
	 * pageElement.getName() + "  " + " in the current browser view " +
	 * " on : '" + pageName + "' Refer to Sheet:  '"
	 * +CustomizableEntity.runningSheetName+"' "+ "' Column Name:  '"
	 * +CustomizableEntity.runningElement+"' "+ "' Row Reference :  '"
	 * +CustomizableEntity.runningRowReference+"' ", exception); } finally {
	 * pageElement = null; } }
	 */
	public void switchToJSPPage() throws InterruptedException {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
			System.out.println(winHandle);
			Thread.sleep(1000);
			switchToDefaultFrame();
		}
	}

	public boolean isConfigTrue(String config) {
		if (config.equalsIgnoreCase("yes")) {
			return true;
		} else {
			return false;
		}
	}

	protected void clearTextField(MobileScreenElement MobileScreenElement) {
		try {
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();

			mobileElement.clear();

			frameworkServices.logMessage("Cleared  in " + MobileScreenElement.getName());
			// frameworkServices.logMessage("Cleared and Typed Value: " + value
			// + "' in " + pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to Cleared  in " + MobileScreenElement.getName() + " on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected void clearAndEnterForwardTime(MobileScreenElement MobileScreenElement, String timeOfIntimation) {
		try {
			String time = RandomCodeGenerator.timeGeneratorForClaimAdmission(timeOfIntimation);
			String[] splitTime = time.split(":");
			WebElement element;
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				element = getMobileElement(MobileScreenElement);
			else
				element = MobileScreenElement.getMobileElement();
			element.clear();
			for (int i = 0; i < splitTime.length; i++) {
				Thread.sleep(300);
				element.sendKeys(splitTime[i]);
				Thread.sleep(300);
			}
			frameworkServices.logMessage("Cleared and Typed Value: " + time + "' in " + MobileScreenElement.getName());
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to clear and type value: '' in " + MobileScreenElement.getName()
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected boolean isWebElementDisplayed(_PageElement pageElement) {
		try {
			WebElement element;
			element = driver.findElement(pageElement.getBy());
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	protected void closeWindow() throws InterruptedException {
		try {
			driver.wait(500);
			driver.close();
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to Close the Window  ", exception,screenName);
		}
	}

	protected void switchAndCloseWindow() {
		try {
			String parentWindow = driver.getWindowHandle();
			String winHandleBefore = driver.getWindowHandle();

			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
			driver.close();
			driver.switchTo().window(parentWindow);
		} catch (Exception e) {

		}
	}

	// added by PKP
	protected boolean waitForElement(_PageElement pageElement, int timeInMilliSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeInMilliSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(pageElement.getBy())));
			return true;

		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * protected void clearAndSendAutoPopulateText(PageElement
	 * pageElement,String text){ try{ Actions actions=new Actions(driver);
	 * clearAndSendKeys(pageElement, text);
	 * actions.sendKeys(Keys.TAB).build().perform();
	 * }catch(ElementNotVisibleException e){ e.printStackTrace(); } }
	 */
	protected void hideKeyboards(int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			driver.hideKeyboard();
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}
	}
	
	protected void hideKeyboards() {
		try {
			driver.hideKeyboard();
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}
	}
	
	protected void hideKeyboardIOS(String lastString) {
		try {
			((IOSDriver) driver).hideKeyboard(
			);
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}
	}

	
	@SuppressWarnings("unchecked")
	protected void hideKeyboardsIOS(String Strategy,String keyName) {
		try {
			((IOSDriver<WebElement>) driver).hideKeyboard(Strategy,keyName);
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}
	}
	
	
	protected void displayKeyboards(int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			driver.getKeyboard();
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Consolidated method for returning mobile element from MobileScreenelement
	 * 
	 * @param mobileScreenElement
	 * @return
	 */
	protected MobileElement getMobileElementFromMobileScreenElement(MobileScreenElement mobileScreenElement) {
		if (!isMobileElementAvailableInScreenElement(mobileScreenElement))
			return getMobileElement(mobileScreenElement);
		else
			return mobileScreenElement.getMobileElement();
	}

	/**
	 * Method for tapping element
	 * 
	 * @param mobileScreenElement
	 */
	protected void tapOnScreenElement(MobileScreenElement mobileScreenElement) {
		try {
			////getMobileElementFromMobileScreenElement(mobileScreenElement).tap(1, 2);
			frameworkServices.logMessage("Tapped on: " + mobileScreenElement.getName());
			// frameworkServices.logMessage("Clicked on: " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to tap on : '" + mobileScreenElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			mobileScreenElement = null;
		}
	}

	protected void scrollToDesiredTextAndClick(MobileScreenElement MobileScreenElement, String desiredText) {
		try {
			MobileElement mobileElement;
			////driver.scrollTo(desiredText);
			if (!isMobileElementAvailableInScreenElement(MobileScreenElement))
				mobileElement = getMobileElement(MobileScreenElement);
			else
				mobileElement = MobileScreenElement.getMobileElement();
			mobileElement.click();
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to tap on : '" + MobileScreenElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}

	protected void scrollToExactAppearingText(String text) {
		////driver.scrollToExact(text);
	}

	/**
	 * to get parent element
	 * 
	 */
	protected MobileElement getParentMobileElement(MobileScreenElement parentMobileScreenElement) {
		MobileElement parentMobileElement;
		if (!isMobileElementAvailableInScreenElement(parentMobileScreenElement)) {
			parentMobileElement = getMobileElement(parentMobileScreenElement);
			return parentMobileElement;
		} else {
			parentMobileElement = parentMobileScreenElement.getMobileElement();
			return parentMobileElement;
		}
	}

	protected MobileElement getMobileElement(MobileElement parentMobileElement,
			MobileScreenElement mobileScreenElement) {
		if (mobileScreenElement.isSlowLoadableComponent()) {
			return waitForElementAndReturnElement(mobileScreenElement);
		} else
			return (MobileElement) parentMobileElement.findElement(mobileScreenElement.getBy());
	}

	/**
	 * 
	 * to get child element from parent
	 */
	protected MobileElement getChildElementFromParentElement(MobileScreenElement parentMobileScreenElement,
			MobileScreenElement childMobileScreenElement) {
		MobileElement mobileElement = getParentMobileElement(parentMobileScreenElement);
		return mobileElement = getMobileElement(mobileElement, childMobileScreenElement);
	}

	/**
	 * Overloaded method for getting mobileElement from parent mobile element
	 * and child element
	 * 
	 * @param parentMobileScreenElement
	 * @param childMobileScreenElement
	 * @return
	 */
	protected MobileElement getMobileElement(MobileScreenElement parentMobileScreenElement,
			MobileScreenElement childMobileScreenElement) {
		if (parentMobileScreenElement.isSlowLoadableComponent()) {
			return (MobileElement) waitForElementAndReturnElement(parentMobileScreenElement)
					.findElement(childMobileScreenElement.getBy());
		} else
			return (MobileElement) driver.findElement(parentMobileScreenElement.getBy())
					.findElement(childMobileScreenElement.getBy());
	}

	/**
	 * Consolidated method for returning mobile element from
	 * parentMobileScreenelement
	 * 
	 * @param mobileScreenElement
	 * @return
	 */
	protected MobileElement getMobileElementFromMobileScreenElement(MobileScreenElement parentMobileScreenElement,
			MobileScreenElement childMobileScreenElement) {
		if (!isMobileElementAvailableInScreenElement(parentMobileScreenElement))
			return getMobileElement(parentMobileScreenElement, childMobileScreenElement);
		else
			return (MobileElement) parentMobileScreenElement.getMobileElement()
					.findElement(childMobileScreenElement.getBy());

	}

	/**
	 * Tap on element using parent and child element
	 * 
	 * @param contextMobileScreenElement
	 * @param mobileScreenElement
	 */
	protected void tapOnScreenElement(MobileScreenElement contextMobileScreenElement,
			MobileScreenElement mobileScreenElement) {
		try {
			////getMobileElementFromMobileScreenElement(contextMobileScreenElement, mobileScreenElement).tap(1, 2);
			frameworkServices.logMessage("Tapped on: " + mobileScreenElement.getName());
			// frameworkServices.logMessage("Clicked on: " +
			// pageElement.getName(), logger);
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to tap on : '" + mobileScreenElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			mobileScreenElement = null;
			contextMobileScreenElement = null;
		}
	}
	
	
	protected String fetchValueForDuplicateIdFields(MobileScreenElement elemId,int elemIndex) {
		String text=new String();
		List<AndroidElement> childElements =null;
		/*By str=elemId.getBy();		
		String elemIdSplit[] = str.toString().split(":");		
		String finalString=elemIdSplit[1].trim()+":"+elemIdSplit[2].trim();*/
		try {
		/*childElements =driver.findElements(elemId.getBy());		
		 text=  childElements.get(elemIndex).getText();		
				*/
		/*String text = new String();
		
			MobileElement mobileElement;
			if (!isMobileElementAvailableInScreenElement(elem))
				mobileElement = getMobileElement(elem);
			else
				mobileElement = elem.getMobileElement();

			text = mobileElement.getText().trim();*/

			//frameworkServices.logMessage("Fetched text: " + text + " of " +childElements.get(elemIndex).getName() );
			//frameworkServices.logMessage("Fetched text: " + text + " of " + elem.getName());
			 /*frameworkServices.logMessage("Fetched text: " + text + " of " +
			 pageElement.getName(), logger);*/
		} catch (Exception exception) {
			throw new ScriptExecutionException("Failed to fetch text: '" + "' of " /*+ elem.getName()*/
			+ " on : '" + screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
			+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
			+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
		} finally {
			//elem = null;
		}
		return text;
	}
	
	
	public void fetchValueByJavascript(String elemId,String value){
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('" + elemId + "').value='" + value + "'");
	}

	/**
	 * @Method : click
	 * @Description : This is wrapper method to click on web element
	 * @param :
	 *            WebElement -By identification of Locator
	 * @return : - true if click successful
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public void click(MobileScreenElement MobileScreenElement) {
			try {
				waitForElementPresence(MobileScreenElement.getBy());
				waitForElementVisibilityLocated(MobileScreenElement.getBy());
				waitForElementToBeClickable(MobileScreenElement.getBy());
				getElementFluent(MobileScreenElement.getBy()).click();
				waitFor(afterClickWait);
				frameworkServices.logMessage("Clicked on : " + MobileScreenElement.getName());
			 } catch (Exception exception) {
				 System.out.println("I got timeout " + exception.getMessage());
				throw new ScriptExecutionException("Failed to click on : '" + MobileScreenElement.getName() + "' on : '"
				+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
				+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
				+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
	} finally {
		MobileScreenElement = null;
	}
		
	}
	/**
	 * @Description : This is wrapper method to check the web element is displayed
	 *              on the page
	 * @param :
	 *            locator - By identification of element
	 * @return : - true if element present
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public boolean checkElementDisplayed(By locator) {
		try {	this.waitForElementVisibilityLocated(locator);
			return driver.findElement(locator).isDisplayed();
		} catch (Exception exception) {
			return false;
		}
	}
	/**
	 * @Description : This is wrapper method wait for element presence located
	 * @param :
	 *            locator - By identification of element
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public void waitForElementPresence(By locator) throws NotFoundException {
		WebDriverWait obj = new WebDriverWait(driver,webDriverWait);
		obj.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/**
	 * @Description : This is wrapper method wait for element to be clickable
	 * @param :
	 *            locator - By identification of element
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public void waitForElementToBeClickable(By locator) throws NotFoundException {
		WebDriverWait obj = new WebDriverWait(driver,webDriverWait);
		obj.until(ExpectedConditions.elementToBeClickable(locator));
	}
	/**
	 * @Description : This is wrapper method to get the Fluent Element of Specific Locator
	 * @param :
	 *            locator - By identification of element
	 * @return : - WebElement
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public WebElement getElementFluent(final By locator) throws NoSuchElementException, TimeoutException {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(webDriverWait,TimeUnit.SECONDS).pollingEvery(fluentPooling,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(InvalidElementStateException.class);
		WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return webElement;
	}
	/**
	 * @Description : This is wrapper method wait for visibility of element located
	 * @param :
	 *            locator - By identification of element
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	protected void waitForElementVisibilityLocated(By locator) throws NotFoundException {
		WebDriverWait obj = new WebDriverWait(driver,webDriverWait);
		obj.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	/**
	 * @Method : waitFor
	 * @Description : Waits for the specified amount of [timeInMilliseconds].
	 * @param :
	 *            timeUnitSeconds - wait time seconds
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	protected boolean waitFor(int timeUnitSeconds) {
		try {
			Thread.sleep(TimeUnit.MILLISECONDS.convert(timeUnitSeconds, TimeUnit.SECONDS));
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
	/**
	 * @Method : click
	 * @Description : This is wrapper method to clear And Send-Keys
	 * @param :
	 *            WebElement -By identification of Locator
	 * @return : - true if click successful
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	protected void clearAndSendKeys(MobileScreenElement MobileScreenElement, String value) {
		try {
			waitForElementPresence(MobileScreenElement.getBy());
			waitForElementVisibilityLocated(MobileScreenElement.getBy());
			waitForElementToBeClickable(MobileScreenElement.getBy());
			WebElement element = getElementFluent(MobileScreenElement.getBy());
			
			element.clear();
			
			element.sendKeys(value);
			FrameworkServices.logMessage("Cleared and Typed Value: '" + value + "' in " + MobileScreenElement.getName());
		} catch (Exception exception) {
			 System.out.println("I got timeout " + exception.getMessage());
			throw new ScriptExecutionException(
					"Failed to clear and type value: '" + value + "' in " + MobileScreenElement.getName() + " on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			MobileScreenElement = null;
		}
	}
	
	/**
	 * @Method : click
	 * @Description : This is wrapper method to click on web element
	 * @param :
	 *            WebElement -By identification of Locator
	 * @return : - true if click successful
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public void touchactionClick(MobileScreenElement MobileScreenElement) {
			try {
				waitForElementPresence(MobileScreenElement.getBy());
				waitForElementVisibilityLocated(MobileScreenElement.getBy());
				waitForElementToBeClickable(MobileScreenElement.getBy());
				TouchActions act=new TouchActions(driver);
				act.click(getElementFluent(MobileScreenElement.getBy()));
				waitFor(afterClickWait);
				frameworkServices.logMessage("Clicked on : " + MobileScreenElement.getName());
			 } catch (Exception exception) {
				 System.out.println("I got timeout " + exception.getMessage());
				throw new ScriptExecutionException("Failed to click on : '" + MobileScreenElement.getName() + "' on : '"
				+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
				+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
				+ CustomizableEntity.runningRowReference + "' ", exception,screenName);
	} finally {
		MobileScreenElement = null;
	}
		
	}
	protected void srollToVisibleText(MobileScreenElement ScrollableLayoutElement, String String) {
		try {
			MobileElement elementlayout;
			waitForElementPresence(ScrollableLayoutElement.getBy());
			waitForElementVisibilityLocated(ScrollableLayoutElement.getBy());
			if (!isMobileElementAvailableInScreenElement(ScrollableLayoutElement))
				elementlayout = getMobileElement(ScrollableLayoutElement);
			else
				elementlayout = ScrollableLayoutElement.getMobileElement();

			AndroidElement list=(AndroidElement)elementlayout;
			MobileElement listGroup=list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().text(\""+String+"\"));"));
			assertNotNull(listGroup.getLocation());
			listGroup.click();
		} catch (Exception exception) {
			throw new ScriptExecutionException("No such Scrollable layout found: '" + ScrollableLayoutElement.getName() + "' on : '"
							+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
							+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
							+ CustomizableEntity.runningRowReference + "' ",
							exception,screenName);
		} finally {
			ScrollableLayoutElement = null;
		}
	}
	protected void scrollUp(MobileScreenElement ScrollableLayoutElement,MobileScreenElement ScrollableLayoutElement1) {
		try {
			int swipeSpeed= 300;
			MobileElement elementlayout,elementlayout1;
			Point point,point1;
			Dimension size,size1;
			if (!isMobileElementAvailableInScreenElement(ScrollableLayoutElement))
				elementlayout = getMobileElement(ScrollableLayoutElement);
			else
				elementlayout = ScrollableLayoutElement.getMobileElement();
			if (!isMobileElementAvailableInScreenElement(ScrollableLayoutElement))
				elementlayout1 = getMobileElement(ScrollableLayoutElement1);
			else
				elementlayout1 = ScrollableLayoutElement1.getMobileElement();
			
			point = elementlayout.getLocation();
		    size = elementlayout.getSize();
		    point1 = elementlayout1.getLocation();
		    size1 = elementlayout1.getSize();
			int startx = (int) (point.getX() + size.getWidth() / 2.0);
			int starty = (int) (point.getY() + size.getHeight() / 2.0);
			int endx1= (int) (point1.getX() + size.getWidth() / 4.0);
			int endy1 = (int) (point1.getY() + size.getHeight() / 4.0);
			
			TouchAction action=new TouchAction(driver);
			action.longPress(PointOption.point(endx1,endy1))
			.moveTo(PointOption.point(startx,starty)).release().perform();
			frameworkServices.logMessage("Swipe Down on: " + ScrollableLayoutElement1.getName());
		}
		catch (Exception exception) {
			throw new ScriptExecutionException("No such Scrollable layout found: '" + ScrollableLayoutElement.getName() + "' on : '"
					+ screenName + "' Refer to Sheet:  '" + CustomizableEntity.runningSheetName + "' "
					+ "' Column Name:  '" + CustomizableEntity.runningElement + "' " + "' Row Reference :  '"
					+ CustomizableEntity.runningRowReference + "' ",screenName);
		} finally {
			ScrollableLayoutElement = null;
		}
	}	
}