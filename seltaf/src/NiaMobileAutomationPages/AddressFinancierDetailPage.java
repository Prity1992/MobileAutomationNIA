package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AddressFinancierDetailEntity;
import com.aqm.staf.library.databin.BuyNowEntermidiaryEntity;

import io.appium.java_client.AppiumDriver;

public class AddressFinancierDetailPage extends  MobileScreen{
	
	MobileScreenElement BuildingNoStreet;
	MobileScreenElement LocalityTextBox;
	MobileScreenElement PinCodeTextBox;
	MobileScreenElement NextButton;
	MobileScreenElement SaveAndCalculatePremiumButton;
	 
	 public AddressFinancierDetailPage(AppiumDriver driver,String Screenname,String DeviceOS) {
	   super (driver,Screenname,DeviceOS);
	   if(DeviceOS.equalsIgnoreCase("Android")){
		   
		   BuildingNoStreet=new MobileScreenElement(By.xpath("//android.view.View[@text='No']/following::android.widget.EditText[1]"), "option radio", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		   LocalityTextBox= new MobileScreenElement(By.xpath("//android.view.View[@text='Locality is required']/preceding::android.widget.EditText[1]"), "Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		   PinCodeTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Please enter a valid 6 digit pincode']/preceding::android.widget.EditText[1]"), "Email id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		   NextButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next']"), "Email id", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		   SaveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save and Calculate Premium']"), "Save and Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		   
	   }
	   }
			   public void FillemailandMobileNoTextBox(AddressFinancierDetailEntity addressFinancierDetailEntity,CustomAssert assertReference) {
				   if (addressFinancierDetailEntity.getAction().equalsIgnoreCase("add") || addressFinancierDetailEntity.getAction().equalsIgnoreCase("edit")) {
				   
				   if(addressFinancierDetailEntity.getBooleanValueForField("ConfigBuildingNoStreet")) {
					   clearAndSendKeys(BuildingNoStreet, addressFinancierDetailEntity.getStringValueForField("BuildingNoStree"));
				   }
				   
				   if(addressFinancierDetailEntity.getBooleanValueForField("ConfigLocalityTextBox")) {
					   clearAndSendKeys(LocalityTextBox, addressFinancierDetailEntity.getStringValueForField("LocalityTextBox"));
				    }
				   if(addressFinancierDetailEntity.getBooleanValueForField("ConfigPinCodeTextBox")) {
					  clearAndSendKeys(PinCodeTextBox, addressFinancierDetailEntity.getStringValueForField("PinCodeTextBox"));
						 }
				   }
			   }
			   
			      public void ClickonNextButton(AddressFinancierDetailEntity addressFinancierDetailEntity,CustomAssert assertReference) {
				   
				       if(addressFinancierDetailEntity.getBooleanValueForField("ConfigNextButton")) {
					   click(NextButton);
					   }
			   }
			      public void CalculatePremiumButton(AddressFinancierDetailEntity addressFinancierDetailEntity,CustomAssert assertReference ) {
				   
				       if(addressFinancierDetailEntity.getBooleanValueForField("ConfigSaveAndCalculatePremiumButton")) {
					   click(SaveAndCalculatePremiumButton);
					   }
				   
			   }

			   public void fillandSubmitAddressFinancierDetil(AddressFinancierDetailEntity addressFinancierDetailEntity,CustomAssert assertReference){
				           if(isConfigTrue(addressFinancierDetailEntity.getConfigExecute()))		
					{
					         FillemailandMobileNoTextBox(addressFinancierDetailEntity,assertReference);
					         ClickonNextButton(addressFinancierDetailEntity,assertReference);
					         CalculatePremiumButton(addressFinancierDetailEntity,assertReference);
					  
			   }
			   
			   }

}
