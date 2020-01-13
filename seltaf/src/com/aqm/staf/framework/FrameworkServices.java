package com.aqm.staf.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aqm.staf.framework.core.EnvironmentParameter;
import com.aqm.staf.framework.core.WebDriverWrapper;
import com.aqm.staf.framework.core.exceptions.FrameworkExecutionException;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import com.aqm.staf.library.databin.*;

//import org.openqa.selenium.WebDriverBackedSelenium;
@SuppressWarnings("deprecation")
public class FrameworkServices {
	public static String getPackageName() {
		return packageName;
	}

	public static void setPackageName(String packageName) {
		FrameworkServices.packageName = packageName;
	}

	static Properties configProp;
	static FileInputStream configInput;
	public static String packageName;

	public static Properties getConfigProperties() throws FileNotFoundException, IOException {
		if (configProp==null) {
			configProp = new Properties();
			configInput = new FileInputStream("config.properties");
			configProp.load(configInput);
		}
		return configProp;
	}

	public static final boolean DEBUGLEVEL = true;
	public static File screenShotFolderPath;
	//static Logger log = Logger.getLogger(FrameworkServices.class.getName());
	String Status;
	public synchronized static String getUniqueFileName() {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYhhmmss");
		java.util.Date date = new java.util.Date();
		return (sdf.format(date));
	}

	@SuppressWarnings("rawtypes")
	public static AppiumDriver getWebDriverInstance(EnvironmentParameter environmentParameter) throws FileNotFoundException, IOException, InterruptedException {
		DesiredCapabilities capability = new DesiredCapabilities();
		if(environmentParameter.getDeviceOS().equalsIgnoreCase("Android")){
			capability.setCapability("deviceName", environmentParameter.getDeviceName());
			capability.setCapability("DeviceManufacturer", environmentParameter.getDeviceManufacturer());
			capability.setCapability("DeviceModel", environmentParameter.getDeviceModel());
			capability.setCapability("DeviceOS", environmentParameter.getDeviceOS());
			capability.setCapability("OSVersion", environmentParameter.getOSVersion());
			capability.setCapability("DeviceType", environmentParameter.getDeviceType());
			
			capability.setCapability("appPackage",getConfigProperties().getProperty("AndroidAppPackage") );
			FrameworkServices.setPackageName(getConfigProperties().getProperty("AndroidAppPackage"));
			capability.setCapability("appActivity", getConfigProperties().getProperty("AndroidAppActivity") );
			capability.setCapability("autoLaunch",true);
			capability.setCapability("resourceWindowFocus", true);
			capability.setCapability("ignoreUnimportantViews", true);
			
			
			//added by Furhat
			capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			capability.setCapability("unicodeKeyboard", true);
			capability.setCapability("resetKeyboard", true);
			capability.setCapability("newCommandTimeout", 400*10);
			capability.setCapability("autoGrantPermissions", true);
			
			
			
		}
		
		if(environmentParameter.getDeviceOS().equalsIgnoreCase("MAC")){
			capability.setCapability("deviceName", environmentParameter.getDeviceName());
			capability.setCapability("DeviceManufacturer", environmentParameter.getDeviceManufacturer());
			capability.setCapability("DeviceModel", environmentParameter.getDeviceModel());
			capability.setCapability("DeviceOS", environmentParameter.getDeviceOS());
			capability.setCapability("OSVersion", environmentParameter.getOSVersion());
			capability.setCapability("DeviceType", environmentParameter.getDeviceType());
			
			capability.setCapability("app",getConfigProperties().getProperty("IOSappLocation") );
			capability.setCapability("appActivity", getConfigProperties().getProperty("IOSAppActivity") );	
			capability.setCapability("autoLaunch",false);
			capability.setCapability("autoGrantPermissions", true);
			
		}
		
		
		

		String gridURL = getConfigProperties().getProperty("GridURL");
		AppiumDriver driver=null;
		
		//below code was added and commented by furhat to check for the login textfield issue which was not getting located
		////AndroidDriver driver=null;
		try
		{
			if(environmentParameter.getDeviceOS().equalsIgnoreCase("Android")){
				//driver=new AndroidDriver(new URL(gridURL), capability);
				driver=new AndroidDriver<WebElement>(new URL(gridURL), capability);
				//driver=new AndroidDriver<MobileElement>(new URL(gridURL), capability);
				
			}
			else if(environmentParameter.getDeviceOS().equalsIgnoreCase("MAC")){
				driver=new IOSDriver(new URL(gridURL), capability);
			}
			
		}
		catch(Exception e)	{
			driver=new AndroidDriver<MobileElement>(new URL(gridURL), capability);
		}
		finally	{
			return driver;
		}
	}
	
	
	



	public void sendEmailNotification(String screenShotPath, String fileName, String exceptionMessage, String tescaseName, List<String> reporterOutPutList) throws FileNotFoundException, IOException {
		boolean enableEmailSettings = Boolean.parseBoolean(getConfigProperties().getProperty("EnableEmailSettings"));
		if (enableEmailSettings) {
			String emailServer = getConfigProperties().getProperty("EmailServer");
			String emailUsername = getConfigProperties().getProperty("EmailUsername");
			String emailPassword = getConfigProperties().getProperty("EmailPassword");
			String fromEmailAddress = getConfigProperties().getProperty("FromEmailAddress");
			String[] toEmailAddresses = getConfigProperties().getProperty("ToEmailAddresses").split(",");

			Properties properties = System.getProperties();
			properties.setProperty("mail.smtp.host", emailServer);
			properties.setProperty("mail.user", emailUsername);
			properties.setProperty("mail.password", emailPassword);

			Session session = Session.getDefaultInstance(properties);

			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(fromEmailAddress));
				InternetAddress[] addressTo = new InternetAddress[toEmailAddresses.length];
				for (int i = 0; i < toEmailAddresses.length; i++) {
					addressTo[i] = new InternetAddress(toEmailAddresses[i]);
				}
				message.setRecipients(RecipientType.TO, addressTo);
				//message.setSubject("Automation Result TestCase -> " + tescaseName + " Failed on " + 
				//	Reporter.getCurrentTestResult().getTestContext().getSuite().getXmlSuite().getParameter("browsername").toUpperCase());
				message.setSubject("Automation Result TestCase -> " + tescaseName + " Failed. ");

				BodyPart messageBodyPart = new MimeBodyPart();
				String mailBodyText = "<P>Log output::" + "<BR>";
				int i = 1;
				for (String reporterOutput : reporterOutPutList) {
					if (reporterOutput.contains("Failled"))
						mailBodyText = mailBodyText + "<h5 style=\"color:#FF0000\">" + i + ". " + reporterOutput + "</h5>" + "<Br>";
					else
						mailBodyText = mailBodyText + i + ". " + reporterOutput + "<Br>";
					i++;
				}

				mailBodyText = mailBodyText + "<Br>" + "Exception Message::" + "<Br>" + exceptionMessage + "</P>";
				messageBodyPart.setContent(mailBodyText, "text/html");

				Multipart multipart = new MimeMultipart();
				multipart.addBodyPart(messageBodyPart);

				messageBodyPart = new MimeBodyPart();
				DataSource source = new FileDataSource(screenShotPath);
				messageBodyPart.setDataHandler(new DataHandler(source));
				messageBodyPart.setFileName(fileName);
				multipart.addBodyPart(messageBodyPart);

				message.setContent(multipart);
				Transport.send(message);
				System.out.println("Sent message successfully....");
			} catch (MessagingException mex) {

			}
		}
	}

	public static void logMessage(String message) {
		//public void logMessage(String message, Logger logger) {
		//logger.info(message);
		Reporter.log(message,true);
	}

	
	public void handleException(WebDriver driver, Exception exception, File snapshotFolder,String ScenarioID) throws Exception  {
		try {
			if(exception==null)
				Status="---PASSED";
			else
				Status= "---FAILED";
			WebDriverWrapper webDriverWrapper = new WebDriverWrapper(driver);
			FrameworkServices frameworkService = new FrameworkServices();
			FrameworkServices.logMessage("<Br> <B>"+"["+"ScenarioID:::"+ScenarioID+"-->"+Status+ "]" +"</B>"+ exception.getMessage()+"</Br>");
			WebDriverWait wait = new WebDriverWait(driver, 3 );
			if(wait.until(ExpectedConditions.alertIsPresent())!=null){
				String popupMesage= driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				FrameworkServices.logMessage("<Br> <B> Unexpected Alert Open & its Text:::</B>"+ popupMesage+"</Br>");
			}
			String fileName = webDriverWrapper.captureScreenShot(snapshotFolder);
			frameworkService.sendEmailNotification(snapshotFolder + File.separator + fileName, fileName,
					exception.getMessage(), Reporter.getCurrentTestResult().getMethod().getMethodName(),
					Reporter.getOutput(Reporter.getCurrentTestResult()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(exception);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void handleException(AppiumDriver driver, Exception exception, File snapshotFolder,String ScenarioID,String screenName) throws Exception  {
		try {
			if(exception==null)
				Status="---PASSED";
			else
				Status= "---FAILED";
			FrameworkServices frameworkService = new FrameworkServices();
			FrameworkServices.logMessage("<Br> <B>"+"["+"ScenarioID:::"+ScenarioID+"-->"+Status+ "]" +"</B>"+ exception.getMessage()+"</Br>");
			AndroidDriver androidDriver = ((AndroidDriver) driver);
			String fileName = WebDriverWrapper.captureScreenShot(androidDriver,snapshotFolder,screenName);
			frameworkService.sendEmailNotification(snapshotFolder + File.separator + fileName, fileName,
					exception.getMessage(), Reporter.getCurrentTestResult().getMethod().getMethodName(),
					Reporter.getOutput(Reporter.getCurrentTestResult()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(exception);
		}
	}

	public void handleException(WebDriver driver, AssertionError assertionError, File snapshotFolder,String ScenarioID) throws Exception {
		try {
			if(assertionError==null)
				Status="---PASSED";
			else
				Status= "---FAILED";
			WebDriverWrapper webDriverWrapper = new WebDriverWrapper(driver);
			FrameworkServices frameworkService = new FrameworkServices();
			FrameworkServices.logMessage(assertionError.getMessage());
			FrameworkServices.logMessage("<Br> <B>"+"["+"ScenarioID:::"+ScenarioID+Status+ "]" +"</B>"+ assertionError+"</Br>");
			String fileName = webDriverWrapper.captureScreenShot(snapshotFolder);
			frameworkService.sendEmailNotification(snapshotFolder + File.separator + fileName, fileName,
					assertionError.getMessage(), Reporter.getCurrentTestResult().getMethod().getMethodName(),
					Reporter.getOutput(Reporter.getCurrentTestResult()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception (assertionError);
		}
	}	

	
	@SuppressWarnings("rawtypes")
	public void handleException(AppiumDriver driver, AssertionError assertionError, File snapshotFolder,String ScenarioID,String screenName) throws Exception {
		try {
			if(assertionError==null){
				Status="---PASSED";
			}else{
				Status= "---FAILED";
			}
			FrameworkServices frameworkService = new FrameworkServices();
			FrameworkServices.logMessage(assertionError.getMessage());
			FrameworkServices.logMessage("<Br> <B>"+"["+"ScenarioID:::"+ScenarioID+Status+ "]" +"</B>"+ assertionError+"</Br>");
			AndroidDriver androidDriver = ((AndroidDriver) driver);
			String fileName = WebDriverWrapper.captureScreenShot(androidDriver,snapshotFolder,screenName);
			frameworkService.sendEmailNotification(snapshotFolder + File.separator + fileName, fileName,
					assertionError.getMessage(), Reporter.getCurrentTestResult().getMethod().getMethodName(),
					Reporter.getOutput(Reporter.getCurrentTestResult()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception (assertionError);
		}
	}	
	public boolean assertCollectionsEqual(List<?> actualValues, List<?> expectedValues) {
		for (Object actualValue : actualValues) {
			boolean isObjectFound = false;
			for (Object expectedValue : expectedValues)
				try {
					if (expectedValue.equals(actualValue)) 
						isObjectFound = true;
				} catch (AssertionError assertionError) {
				}
			if (!isObjectFound) {
				throw new AssertionError("; List" + expectedValues + " Does not contain: " + actualValue);
			}
		}
		for (Object expectedValue : expectedValues) {
			boolean isObjectFound = false;
			for (Object actualValue : actualValues)
				try {
					if (actualValue.equals(expectedValue)) {
						isObjectFound = true;
					}
				} catch (AssertionError assertionError) {
				}
			if (!isObjectFound) {
				throw new AssertionError("Actual List" + actualValues + " Does not contain: " + expectedValue);
			}
		}
		return true;
	}

	public Date getCurrentSystemTime() {
		java.util.Date date = new java.util.Date();
		return new Date(date.getYear(), date.getMonth(), date.getDay());
	}

	public static <T> ArrayList<T> getObjectByPrimaryKey(List<T> list,
			String key) {
		String[] keys = key.split(",");
		ArrayList<T> filteredList = new ArrayList<T>();
		for (int i = 0; i < keys.length; i++) {
			for (T t : list) {
				if (((GenericEntity) t).getReference().equalsIgnoreCase(keys[i].trim())) {
					filteredList.add(t);
					break;
				}
			}
		}
		return filteredList;
	}

	public static void pageWait(int value) throws InterruptedException{
		try{
			Thread.sleep(value);
		}catch(Exception e){
		}
	}
}

