package com.aqm.staf.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.BasePageOrangeHRM;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionMasterTestSuites;
import com.aqm.staf.framework.core.entity.ExecutionTestScenarios;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.framework.core.entity.ExecutionTestSuites;
import com.aqm.staf.framework.core.entity.MasterTestSuite;
import com.aqm.staf.framework.core.entity.TestPlan;
import com.aqm.staf.framework.core.entity.TestScenario;
import com.aqm.staf.framework.core.entity.TestSuite;

import io.appium.java_client.AppiumDriver;

public class FunctionalKeyword extends KeywordHelper{
	private  String stepGroup;
	protected void executeStep(
			TestPlan testPlan, ExecutionMasterTestSuites executionMasterTestSuite, MasterTestSuite masterTestSuite, ExecutionTestSuites executionTestSuite, TestSuite testSuite,
			ExecutionTestScenarios executionTestScenario, TestScenario testScenario, ExecutionTestSteps executionTestStep, ScenarioTestData testData, 
			AppiumDriver driver, File scenarioExecutionFolderReference, CustomAssert assertReference, boolean allStepExecutionMode,String DeviceOS) throws Exception {
		String keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		String configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		int stepNumber= executionTestStep.getExecutionTestStepMasterAutomationScriptStepExecutionSequence();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		FrameworkServices.logMessage("<B><u>StepNumber-</u>"+stepNumber+"<i><Font Color = /'#00008B/'> Executing : "+keyword+" </Font></i></B>");
		Properties configProperties = FrameworkServices.getConfigProperties();
		KeywordHelper keywordHelper=new KeywordHelper();
		//int skipStepsInExecution= Integer.parseInt(configProperties.getProperty("skipSteps"));
		switch (keyword) {
		/************************************NIA Mobile Automation************************************/
		case "CreateLogin":
			CreateLoginNIAMobileApp(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditLogin":
			EditLoginNIAMobileApp(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyLogin":
			VerifyLoginNIAMobileApp(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "CreateHomepage":
			CreateHomePage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditHomepage":
			EditHomePage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyHomepage":
			VerifyHomePage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;	
		case "CreateBuyNowIntermediary":
			CreateBuyNowInterPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditBuyNowIntermediary":
			EditBuyNowInterPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyBuyNowIntermediary":
			VerifyBuyNowInterPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;	
		case "CreatePremiumCalulatorHealth":
			CreatePremiumCalculatorPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditPremiumCalulatorHealth":
			EditPremiumCalculatorPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyPremiumCalulatorHealth":
			VerifyPremiumCalculatorPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "CreateTwoWheelerBasicPremium":
			CreateTwoWheelerBasicPremium(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditTwoWheelerBasicPremium":
			EditTwoWheelerBasicPremium(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
		case "VerifyTwoWheelerBasicPremium":
			VerifyTwoWheelerBasicPremium(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "CreateTwoWheelerBuyInsurance":
			CreateTwoWheelerBuyInsurance(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
		case "EditTwoWheelerBuyInsurance":
			EditTwoWheelerBuyInsurance(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
		case "VerifyTwoWheelerBuyInsurance":
			VerifyTwoWheelerBuyInsurance(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);	
			break;

		case "CreateBuyNow":			
              CreateBuyNowPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
		case "EditBuyNow":
			EditBuyNowPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
		case "VerifyBuyNow":
			VerifyBuyNowPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

			/*case "CreateNewIndiaTopUpMediclaim":			
			CreateBuyNowPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditNewIndiaTopUpMediclaim":
			EditBuyNowPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyNewIndiaTopUpMediclaim":
			VerifyBuyNowPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;*/

			//PrvateCar

		case "CreatePrivateCar":			
			CreatePrivateCarPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditPrivateCar":
			EditPrivateCarPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyPrivateCar":
			VerifyPrivateCarPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "CreateNewIndiaTopUpMediclaim":			
			CreateNewIndiaTopUpMediclaimPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditNewIndiaTopUpMediclaim":
			EditNewIndiaTopUpMediclaimPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyNewIndiaTopUpMediclaim":
			VerifyNewIndiaTopUpMediclaimPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "CreateTopUpHealthAdditionalDeatils":			

			CreateTopUpHealthAdditionalDeatils(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditTopUpHealthAdditionalDeatils":
			EditTopUpHealthAdditionalDeatils(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyTopUpHealthAdditionalDeatils":
			VerifyTopUpHealthAdditionalDeatils(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "CreatePremiumSummary":			
			CreatePremiumSummaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditPremiumSummary":
			EditPremiumSummaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyPremiumSummary":
			VerifyPremiumSummaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "CreatePersonalAccidentDet":			
			CreatePersonalAccidentDet(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditPersonalAccidentDet":
			EditPersonalAccidentDet(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyPersonalAccidentDet":
			VerifyPersonalAccidentDet(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;


		case "CreateAdditionalDetails":			
			CreateAdditionalDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditAdditionalDetails":
			CreateAdditionalDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyAdditionalDetails":
			CreateAdditionalDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;



		case "CreateSummary":			
			CreateSummaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditSummary":
			EditSummaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifySummary":
			VerifySummaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "CreateDetailedTravelDetails":			
			CreateDetailedTravelDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditDetailedTravelDetails":
			EditDetailedTravelDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyDetailedTravelDetails":
			VerifyDetailedTravelDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "CreateHomeIntermediaryDetails":
			CreateHomeIntermediaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "EditHomeIntermediaryPage":
			CreateHomeIntermediaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "VerifyHomeIntermediaryDetails":
            VerifyHomeIntermediaryPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;


		case "CreateRecentActivities":			
			CreateRecentActivitiesPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "EditRecentActivities":
			EditRecentActivitiesPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
		case "VerifyRecentActivities":
			VerifyRecentActivitiesPage(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

			//intermidiary

		case "CreateBuyNowIntermidary":
			CreateBuyNowIntermidary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "EditBuyNowIntermidary":
			EditBuyNowIntermidary(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "verifyBuyNowIntermidary":
			verifyBuyNowIntermidary(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

			//TwoWheelerDeils
			
		case "CreateTwoWheelerDetails":
			createTwoWheelerDetails(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "EditTwoWheelerDetails":
			editTwoWheelerDetails(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "VerifyTwoWheelerDetails":
			verifyTwoWheelerDetails(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
			//inter
			
		case "CreateadditionalDetailsPageForIntermidiaryDetails":
			CreateadditionalDetailsPageForIntermidiary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "EditadditionalDetailsPageForIntermidiaryDetails":
			EditadditionalDetailsPageForIntermidiary(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "VerifyadditionalDetailsPageForIntermidiaryDetails":
			verifyadditionalDetailsPageForIntermidiary(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
				
			
		case "CreatePolicyHolderInformationIntermidiaryDetails":
			createPolicyHolderInformationIntermidiary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "EditPolicyHolderInformationIntermidiaryDetails":
			editPolicyHolderInformationIntermidiary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "VerifyPolicyHolderInformationIntermidiaryDetails":
			verifyPolicyHolderInformationIntermidiary(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
			
			
			
		case "CreateAddressFinencierDetailDetails":
			CreateAddressFinencierDetail(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "EditAddressFinencierDetailDetails":
			editAddressFinencierDetail(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "VerifyAddressFinencierDetailDetails":
			verifyAddressFinencierDetail(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
			
			
		case "CreateSummaryIntermidiateDetail":
			CreateSummaryIntermidiateDetail(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

		case "EditSummaryIntermidiateDetail":
			EditSummaryIntermidiateDetail(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;

		case "VerifySummaryIntermidiateDetail":
			VerifySummaryIntermidiateDetail(testData, executionTestStep, assertReference, driver, stepGroup, DeviceOS);
			break;
			
			
			
		case "CreateCollectionDetail":
			CreateCollectionDetail(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "EditCollectionDetail":
			editCollectionDetail(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "VerifyCollectionDetaill":
			verifyCollectionDetail(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
			
			//By Paresh
			
		case "CreateTWdetailsIntmy":
			CreateTWdetailsIntmy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "EditTWdetailsIntmy":
			EditTWdetailsIntmy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "VerifyTWdetailsIntmy":
			VerifyTWdetailsIntmy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;	
			
			
			//
			
		case "CreateTWBasicPremiumIntmy":
			CreateTWBasicPremiumIntmy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "EditTWBasicPremiumIntmy":
			EditTWBasicPremiumIntmy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "VerifyTWBasicPremiumIntmy":
			VerifyTWBasicPremiumIntmy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;	
			
	
		//
		case "CreateInsuredDetails":
			CreateInsuredDetailsPage(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "EditInsuredDetails":
			EditInsuredDetailsPage(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "VerifyInsuredDetails":
			VerifyInsuredDetailsPage(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;	
			
			//
		case "CreateVehicleDetailsIntermidiary":
			CreateVehicleDetailsIntermidiary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "EditVehicleDetailsIntermidiary":
			EditVehicleDetailsIntermidiary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "VerifyVehicleDetailsIntermidiary":
			VerifyVehicleDetailsIntermidiary(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;	
			
			
			//
		case "CreateQuickRenewPolicy":
			createQuickRenewPolicy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "EditQuickRenewPolicy":
			editQuickRenewPolicy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;

			
		case "VerifyQuickRenewPolicy":
			verifyQuickRenewPolicy(testData,executionTestStep,assertReference,driver,stepGroup,DeviceOS);
			break;	
		}
	
	}
	
}
				
/************************************NIA Mobile Automation************************************/
