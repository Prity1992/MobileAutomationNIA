package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;

import io.appium.java_client.AppiumDriver;

public class PersonalAccidentAdditional extends MobileScreen {
	
	MobileScreenElement relationshipWithRegisteredUser;
	
	public PersonalAccidentAdditional(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{
			relationshipWithRegisteredUser = new MobileScreenElement(By.xpath("//android.widget.Button[@content-desc='Select']"), "Relationship With Registered User", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		}
	}
}

