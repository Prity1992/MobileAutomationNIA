package com.aqm.staf.library;

import java.util.ArrayList;
import java.util.List;

/*import com.bharatmatrimony.pages.AppDashboardPage;
import com.bharatmatrimony.pages.BharatMatrimony_ChooseSignUpPage;
import com.KotakBank.Pages.TransferMoneyPage;
import com.MIndicator.pages.SearchRoutePage;*/
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.databin.AdditionalDetailsMotorEntity;
import com.aqm.staf.library.databin.AdtionalDetalsInterEntity;
import com.aqm.staf.library.databin.AddressFinancierDetailEntity;
import com.aqm.staf.library.databin.BuyNowEntermidiaryEntity;
import com.aqm.staf.library.databin.BuyNowEntity;
import com.aqm.staf.library.databin.BuyNowInterEntity;
import com.aqm.staf.library.databin.CollectionIntemidiaryEntity;
import com.aqm.staf.library.databin.DetailedTravelEntity;
import com.aqm.staf.library.databin.GenericEntity;
import com.aqm.staf.library.databin.HealthAddDetailEntity;
import com.aqm.staf.library.databin.HomeIntermediaryEntity;
import com.aqm.staf.library.databin.HomepageEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.PersonalAccidentDetEntity;
import com.aqm.staf.library.databin.PolicyInfoIntermidiaryEntity;
import com.aqm.staf.library.databin.PremiumCalEntity;
import com.aqm.staf.library.databin.PrivateCarEntity;
import com.aqm.staf.library.databin.QuickRenewPolicyEntity;
import com.aqm.staf.library.databin.RecentActivitiesEntity;
import com.aqm.staf.library.databin.SummaryIntermidiarEntity;
import com.aqm.staf.library.databin.SummaryPageEntity;
import com.aqm.staf.library.databin.TWBasicPremiumIntmyEntity;
import com.aqm.staf.library.databin.TWInsuredDetailsIntmyEntity;
import com.aqm.staf.library.databin.TWdetailsIntmyEntity;
import com.aqm.staf.library.databin.PremiumSummaryEntity;

import com.aqm.staf.library.databin.TwoWheelerBasicPremiumEntity;
import com.aqm.staf.library.databin.TwoWheelerBuyInsuranceEntity;
import com.aqm.staf.library.databin.TwoWheelerDetailsEntity;
import com.aqm.staf.library.databin.VehicleDetailsIntmyEntity;

import NiaMobileAutomationPages.DetailedTravelDetailsPage;
import NiaMobileAutomationPages.GrihaSuvidhaBuyNowPages;

import com.aqm.staf.library.databin.BuyNowEntity;
import com.aqm.staf.library.databin.TopUpMediEntity;
import NiaMobileAutomationPages.NewIndiaTopUpMediclaimPage;
import NiaMobileAutomationPages.NiaLoginPage;
import NiaMobileAutomationPages.PersonalAccidentDet;
import NiaMobileAutomationPages.PolicyHolderInformationIntermidiarypage;
import NiaMobileAutomationPages.PremiumCalHealthPage;
import NiaMobileAutomationPages.PersonalAccidentDet;
import NiaMobileAutomationPages.TopUpHealthAdditionalDeatils;
import NiaMobileAutomationPages.PrivateCarPage;
import NiaMobileAutomationPages.QuickPayRenewalPolicyDetailsPage;
import NiaMobileAutomationPages.RecentActivitiesPage;
import NiaMobileAutomationPages.SummaryPage;
import NiaMobileAutomationPages.TWBasicPremiumIntmdyPage;
import NiaMobileAutomationPages.SummaryPymentDetailInterPage;
import NiaMobileAutomationPages.TWDetailsIntmdryPage;
import NiaMobileAutomationPages.TWInsuredDetailsIntmyPage;
import NiaMobileAutomationPages.PremiumSummaryPage;

import NiaMobileAutomationPages.TwoWheelerBasicPremiumPage;
import NiaMobileAutomationPages.TwoWheelerBuyInsurancePage;
import NiaMobileAutomationPages.TwoWheelerDetailsPage;
import NiaMobileAutomationPages.VehicleDetailsIntermidiaryPage;
import io.appium.java_client.AppiumDriver;
import NiaMobileAutomationPages.AdditionalDetailsMotorPage;
import NiaMobileAutomationPages.AdditionalDetailsPageForIntermidiary;
import NiaMobileAutomationPages.AddressFinancierDetailPage;
import NiaMobileAutomationPages.BuyNowIntermediaryPage;
import NiaMobileAutomationPages.BuyNowPage;
import NiaMobileAutomationPages.CollectionIntemidiaryPage;
import NiaMobileAutomationPages.HomePage;
import NiaMobileAutomationPages.HomeIntermediaryPage;
import NiaMobileAutomationPages.NewIndiaTopUpMediclaimPage;

public class KeywordHelper // extends AppDashboardPage{

{
	//
	public void createTwoWheelerDetails(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> twoWheelerDetailsEntity = testData.getTwoWheelerBasicPremiumEntity(TwoWheelerDetailsEntity.class);
		for (GenericEntity twoWheelerDetailsEntity_data : twoWheelerDetailsEntity) {
			if (twoWheelerDetailsEntity_data.getAction().equalsIgnoreCase("add") && twoWheelerDetailsEntity_data.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerDetailsPage twoWheelerDetailsPage = new TwoWheelerDetailsPage(driver, "Two Wheeler Deatils", DeviceOS);
				twoWheelerDetailsPage.fillAndSubmitTwoWheelerDetails((TwoWheelerDetailsEntity) twoWheelerDetailsEntity_data, assertReference, stepGroup);
				//setEditPaymentDependency((PremiumSummaryEntity) twoWheelerDetailsEntity_data, testData);
			}
		}
	}
	public void editTwoWheelerDetails(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> twoWheelerDetailsEntity = testData.getTwoWheelerBasicPremiumEntity(TwoWheelerDetailsEntity.class);
		for (GenericEntity twoWheelerDetailsEntity_data : twoWheelerDetailsEntity) {
			if (twoWheelerDetailsEntity_data.getAction().equalsIgnoreCase("edit") && twoWheelerDetailsEntity_data.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerDetailsPage twoWheelerDetailsPage = new TwoWheelerDetailsPage(driver, "Two Wheeler Deatils", DeviceOS);
				twoWheelerDetailsPage.fillAndSubmitTwoWheelerDetails((TwoWheelerDetailsEntity) twoWheelerDetailsEntity_data, assertReference, stepGroup);
			}
		}
	}
	public void verifyTwoWheelerDetails(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> twoWheelerDetailsEntity = testData.getTwoWheelerBasicPremiumEntity(TwoWheelerDetailsEntity.class);
		for (GenericEntity twoWheelerDetailsEntity_data : twoWheelerDetailsEntity) {
			if (twoWheelerDetailsEntity_data.getAction().equalsIgnoreCase("verify") && twoWheelerDetailsEntity_data.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerDetailsPage twoWheelerDetailsPage = new TwoWheelerDetailsPage(driver, "Two Wheeler Deatils", DeviceOS);
				twoWheelerDetailsPage.fillAndSubmitTwoWheelerDetails((TwoWheelerDetailsEntity) twoWheelerDetailsEntity_data, assertReference, stepGroup);
			}
		}
	}
	//
	public void CreateLoginNIAMobileApp(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> login = testData.getLoginEntity(LoginEntity.class);
		for (GenericEntity logindata : login) {
			if (logindata.getAction().equalsIgnoreCase("add") && logindata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaLoginPage login1 = new NiaLoginPage(driver, "Create Login", DeviceOS);
				login1.fillAndSubmitLoginDetails((LoginEntity) logindata, assertReference, stepGroup, driver);
			}
		}
	}
	

	public void EditLoginNIAMobileApp(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> login = testData.getLoginEntity(LoginEntity.class);
		for (GenericEntity logindata : login) {
			if (logindata.getAction().equalsIgnoreCase("edit") && logindata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaLoginPage login1 = new NiaLoginPage(driver, "Edit Login", DeviceOS);
				login1.fillAndSubmitLoginDetails((LoginEntity) logindata, assertReference, stepGroup,driver);
			}
		}
	}

	public void VerifyLoginNIAMobileApp(ScenarioTestData testData, ExecutionTestSteps executionTestStep, CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)
			throws InterruptedException {
		List<? extends GenericEntity> login = testData.getLoginEntity(LoginEntity.class);
		for (GenericEntity logindata :  login) {
			if (logindata.getAction().equalsIgnoreCase("verify") && logindata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaLoginPage login1 = new NiaLoginPage(driver, "Verify Login", DeviceOS);
				login1.fillAndSubmitLoginDetails((LoginEntity) logindata, assertReference, stepGroup,driver);
			}
		}

	}

	// Create Two Wheeler
	public void CreateTwoWheelerBasicPremium(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)
			throws InterruptedException {
		List<? extends GenericEntity> twoWheelerBasicPremium = testData.getTwoWheelerBasicPremiumEntity(TwoWheelerBasicPremiumEntity.class);
		for (GenericEntity twoWheelerBasicPremiumdata : twoWheelerBasicPremium) {
			if (twoWheelerBasicPremiumdata.getAction().equalsIgnoreCase("add") && twoWheelerBasicPremiumdata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerBasicPremiumPage twoWheelerBasicPremiumPage = new TwoWheelerBasicPremiumPage(driver,"Create Two Wheeler Basic Premium", DeviceOS);
				twoWheelerBasicPremiumPage.fillAndSubmitTwoWheelerBasicPremiumPageDetails((TwoWheelerBasicPremiumEntity) twoWheelerBasicPremiumdata, assertReference);
			}
		}
	}

	public void EditTwoWheelerBasicPremium(ScenarioTestData testData, ExecutionTestSteps executionTestStep,
			CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> twoWheelerBasicPremium = testData.getTwoWheelerBasicPremiumEntity(TwoWheelerBasicPremiumEntity.class);
		for (GenericEntity twoWheelerBasicPremiumdata : twoWheelerBasicPremium) {
			if (twoWheelerBasicPremiumdata.getAction().equalsIgnoreCase("edit") && twoWheelerBasicPremiumdata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerBasicPremiumPage twoWheelerBasicPremiumPage = new TwoWheelerBasicPremiumPage(driver,"Create Two Wheeler Basic Premium", DeviceOS);
				twoWheelerBasicPremiumPage.fillAndSubmitTwoWheelerBasicPremiumPageDetails((TwoWheelerBasicPremiumEntity) twoWheelerBasicPremiumdata, assertReference);
			}
		}
	}

	public void VerifyTwoWheelerBasicPremium(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> twoWheelerBasicPremium = testData.getTwoWheelerBasicPremiumEntity(TwoWheelerBasicPremiumEntity.class);
		for (GenericEntity twoWheelerBasicPremiumdata : twoWheelerBasicPremium) {
			if (twoWheelerBasicPremiumdata.getAction().equalsIgnoreCase("verify") && twoWheelerBasicPremiumdata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerBasicPremiumPage twoWheelerBasicPremiumPage = new TwoWheelerBasicPremiumPage(driver,"Create Two Wheeler Basic Premium", DeviceOS);
				twoWheelerBasicPremiumPage.fillAndSubmitTwoWheelerBasicPremiumPageDetails((TwoWheelerBasicPremiumEntity) twoWheelerBasicPremiumdata, assertReference);
			}
		}
	}

	public void CreateTwoWheelerBuyInsurance(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> twoWheelerBuyInsurance = testData.getTwoWheelerBuyInsuranceEntity(TwoWheelerBuyInsuranceEntity.class);
		for (GenericEntity twoWheelerBuyInsurancedata : twoWheelerBuyInsurance) {
			if (twoWheelerBuyInsurancedata.getAction().equalsIgnoreCase("add") && twoWheelerBuyInsurancedata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerBuyInsurancePage twoWheelerBuyInsurancePage = new TwoWheelerBuyInsurancePage(driver,"Create Two Wheeler Basic Premium", DeviceOS);
				twoWheelerBuyInsurancePage.fillAndSubmitTwoWheelerBuyInsuranceDetails(
						(TwoWheelerBuyInsuranceEntity) twoWheelerBuyInsurancedata, assertReference);
			}
		}
	}

	public void EditTwoWheelerBuyInsurance(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> twoWheelerBuyInsurance = testData.getTwoWheelerBuyInsuranceEntity(TwoWheelerBuyInsuranceEntity.class);
		for (GenericEntity twoWheelerBuyInsurancedata : twoWheelerBuyInsurance) {
			if (twoWheelerBuyInsurancedata.getAction().equalsIgnoreCase("edit") && twoWheelerBuyInsurancedata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerBuyInsurancePage twoWheelerBuyInsurancePage = new TwoWheelerBuyInsurancePage(driver,"Create Two Wheeler Basic Premium", DeviceOS);
				twoWheelerBuyInsurancePage.fillAndSubmitTwoWheelerBuyInsuranceDetails((TwoWheelerBuyInsuranceEntity) twoWheelerBuyInsurancedata, assertReference);
			}
		}
	}

	public void VerifyTwoWheelerBuyInsurance(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> twoWheelerBuyInsurance = testData.getTwoWheelerBuyInsuranceEntity(TwoWheelerBuyInsuranceEntity.class);
		for (GenericEntity twoWheelerBuyInsurancedata : twoWheelerBuyInsurance) {
			if (twoWheelerBuyInsurancedata.getAction().equalsIgnoreCase("verify") && twoWheelerBuyInsurancedata.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TwoWheelerBuyInsurancePage twoWheelerBuyInsurancePage = new TwoWheelerBuyInsurancePage(driver,"Create Two Wheeler Basic Premium", DeviceOS);
				twoWheelerBuyInsurancePage.fillAndSubmitTwoWheelerBuyInsuranceDetails((TwoWheelerBuyInsuranceEntity) twoWheelerBuyInsurancedata, assertReference);
			}
		}
	}

	// BuyNowPage

	public void CreateBuyNowPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> buyNowEntity = testData.getBuyNowEntity(BuyNowEntity.class);
		for (GenericEntity buyNowData : buyNowEntity) {
			if (buyNowData.getAction().equalsIgnoreCase("add") && buyNowData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				BuyNowPage buyNowPage = new BuyNowPage(driver, "Create Buy Now", DeviceOS);
				buyNowPage.fillAndSubmitBuyDetails((BuyNowEntity) buyNowData, assertReference, stepGroup);
			}
		}
	}

	public void EditBuyNowPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> buyNowEntity = testData.getBuyNowEntity(BuyNowEntity.class);
		for (GenericEntity buyNowData : buyNowEntity) {
			if (buyNowData.getAction().equalsIgnoreCase("edit") && buyNowData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				BuyNowPage buyNowPage = new BuyNowPage(driver, "Create Buy Now", DeviceOS);
				buyNowPage.fillAndSubmitBuyDetails((BuyNowEntity) buyNowData, assertReference, stepGroup);
			}
		}
	}

	public void VerifyBuyNowPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> buyNowEntity = testData.getBuyNowEntity(BuyNowEntity.class);
		for (GenericEntity buyNowData : buyNowEntity) {
			if (buyNowData.getAction().equalsIgnoreCase("verify") && buyNowData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				BuyNowPage buyNowPage = new BuyNowPage(driver, "Create Buy Now", DeviceOS);
				buyNowPage.fillAndSubmitBuyDetails((BuyNowEntity) buyNowData, assertReference, stepGroup);

			}
		}
	}
	//Buy Intermediary
	public void CreateBuyNowInterPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> buyNowInterEntity = testData.getBuyNowInterEntity(BuyNowInterEntity.class);
		for (GenericEntity buyNowInterData : buyNowInterEntity) {
			if (buyNowInterData.getAction().equalsIgnoreCase("add") && buyNowInterData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				BuyNowIntermediaryPage buyNowInterPage = new BuyNowIntermediaryPage(driver, "Create Buy Now", DeviceOS);
				buyNowInterPage.fillAndSubmitBuyDetails((BuyNowInterEntity) buyNowInterData, assertReference, stepGroup);
			}
		}
	}
	public void EditBuyNowInterPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> buyNowInterEntity = testData.getBuyNowInterEntity(BuyNowInterEntity.class);
		for (GenericEntity buyNowInterData : buyNowInterEntity) {
			if (buyNowInterData.getAction().equalsIgnoreCase("edit") && buyNowInterData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				BuyNowIntermediaryPage buyNowInterPage = new BuyNowIntermediaryPage(driver, "Create Buy Now", DeviceOS);
				buyNowInterPage.fillAndSubmitBuyDetails((BuyNowInterEntity) buyNowInterData, assertReference, stepGroup);
			}
		}
	}
		public void VerifyBuyNowInterPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
			List<? extends GenericEntity> buyNowInterEntity = testData.getBuyNowInterEntity(BuyNowInterEntity.class);
			for (GenericEntity buyNowInterData : buyNowInterEntity) {
				if (buyNowInterData.getAction().equalsIgnoreCase("verify") && buyNowInterData.getStepGroup().equalsIgnoreCase(stepGroup)) {
					BuyNowIntermediaryPage buyNowInterPage = new BuyNowIntermediaryPage(driver, "Create Buy Now", DeviceOS);
					buyNowInterPage.fillAndSubmitBuyDetails((BuyNowInterEntity) buyNowInterData, assertReference, stepGroup);
				}
			}
		}
	//Premium Calculator
	public void CreatePremiumCalculatorPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> premiumCalEntity = testData.getPremiumCalEntity(PremiumCalEntity.class);
		for (GenericEntity premiumCalEntityData : premiumCalEntity) {
			if (premiumCalEntityData.getAction().equalsIgnoreCase("add") && premiumCalEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PremiumCalHealthPage premiumCalPage = new PremiumCalHealthPage(driver, "Create Buy Now", DeviceOS);
				premiumCalPage.fillAndSubmitPremiumCalculDetails((PremiumCalEntity) premiumCalEntityData, assertReference, stepGroup);
			}
		}
	}
	public void EditPremiumCalculatorPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> premiumCalEntity = testData.getPremiumCalEntity(PremiumCalEntity.class);
		for (GenericEntity premiumCalEntityData : premiumCalEntity) {
			if (premiumCalEntityData.getAction().equalsIgnoreCase("edit") && premiumCalEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PremiumCalHealthPage premiumCalPage = new PremiumCalHealthPage(driver, "Create Buy Now", DeviceOS);
				premiumCalPage.fillAndSubmitPremiumCalculDetails((PremiumCalEntity) premiumCalEntityData, assertReference, stepGroup);
			}
		}
	}
	public void VerifyPremiumCalculatorPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> premiumCalEntity = testData.getPremiumCalEntity(PremiumCalEntity.class);
		for (GenericEntity premiumCalEntityData : premiumCalEntity) {
			if (premiumCalEntityData.getAction().equalsIgnoreCase("verify") && premiumCalEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PremiumCalHealthPage premiumCalPage = new PremiumCalHealthPage(driver, "Create Buy Now", DeviceOS);
				premiumCalPage.fillAndSubmitPremiumCalculDetails((PremiumCalEntity) premiumCalEntityData, assertReference, stepGroup);
			}
		}
	}

	// Home Page
	public void CreateHomePage	(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> homepageEntity = testData.getHomepageEntity(HomepageEntity.class);
		for (GenericEntity homepageEntityData : homepageEntity) {
			if (homepageEntityData.getAction().equalsIgnoreCase("add") && homepageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				HomePage homePage = new HomePage(driver, "Create Homepage", DeviceOS);
				homePage.fillAndSubmitHomepageDetails((HomepageEntity) homepageEntityData, assertReference, stepGroup);

			}
		}
	}

	public void EditHomePage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> homepageEntity = testData.getHomepageEntity(HomepageEntity.class);
		for (GenericEntity homepageEntityData : homepageEntity) {
			if (homepageEntityData.getAction().equalsIgnoreCase("edit")	&& homepageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				HomePage homePage = new HomePage(driver, "Edit Homepage", DeviceOS);
				homePage.fillAndSubmitHomepageDetails((HomepageEntity) homepageEntityData, assertReference, stepGroup);

			}
		}
	}

	public void VerifyHomePage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> homepageEntity = testData.getHomepageEntity(HomepageEntity.class);
		for (GenericEntity homepageEntityData : homepageEntity) {
			if (homepageEntityData.getAction().equalsIgnoreCase("verify") && homepageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				HomePage homePage = new HomePage(driver, "Verify Homepage", DeviceOS);
				homePage.fillAndSubmitHomepageDetails((HomepageEntity) homepageEntityData, assertReference, stepGroup);
			}
		}
	}
	
	// NewIndiaTopUpMediclaim
	public void CreateNewIndiaTopUpMediclaimPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> newIndiaTopUpMedicClaimEntity = testData.getNewIndiaTopUpMediclaimEntity(TopUpMediEntity.class);
		for (GenericEntity newIndiaTopUpMediclaimData : newIndiaTopUpMedicClaimEntity) {
			if (newIndiaTopUpMediclaimData.getAction().equalsIgnoreCase("add") && newIndiaTopUpMediclaimData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NewIndiaTopUpMediclaimPage newIndiaTopUpMediclaimPage = new NewIndiaTopUpMediclaimPage(driver,"Create New India Top Up Mediclaim", DeviceOS);
				newIndiaTopUpMediclaimPage.fillAndSubmitDetailedQuoteDetails((TopUpMediEntity) newIndiaTopUpMediclaimData, assertReference, stepGroup); 
				//newIndiaTopUpMediclaimPage.fetchQuoteNumber(newIndiaTopUpMediclaimData);
				//testData.updateRecordsForCriteria(newIndiaTopUpMediclaimData);
				//setEditQuoteNoDependency(newIndiaTopUpMediclaimData, testData);


			}
		}
	}

	public void EditNewIndiaTopUpMediclaimPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> newIndiaTopUpMedicClaimEntity = testData.getNewIndiaTopUpMediclaimEntity(TopUpMediEntity.class);
		for (GenericEntity newIndiaTopUpMediclaimData : newIndiaTopUpMedicClaimEntity) {
			if (newIndiaTopUpMediclaimData.getAction().equalsIgnoreCase("edit")	&& newIndiaTopUpMediclaimData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NewIndiaTopUpMediclaimPage newIndiaTopUpMediclaimPage = new NewIndiaTopUpMediclaimPage(driver,"Create New India Top Up Mediclaim", DeviceOS);
				newIndiaTopUpMediclaimPage.fillAndSubmitDetailedQuoteDetails((TopUpMediEntity) newIndiaTopUpMedicClaimEntity, assertReference, stepGroup);
				testData.updateRecordsForCriteria(newIndiaTopUpMediclaimData);
				setEditQuoteNoDependency(newIndiaTopUpMediclaimData, testData);
			}
		}
	}

	public void VerifyNewIndiaTopUpMediclaimPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> newIndiaTopUpMedicClaimEntity = testData.getNewIndiaTopUpMediclaimEntity(TopUpMediEntity.class);
		for (GenericEntity newIndiaTopUpMediclaimData : newIndiaTopUpMedicClaimEntity) {
			if (newIndiaTopUpMediclaimData.getAction().equalsIgnoreCase("verify") && newIndiaTopUpMediclaimData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NewIndiaTopUpMediclaimPage newIndiaTopUpMediclaimPage = new NewIndiaTopUpMediclaimPage(driver,"Create New India Top Up Mediclaim", DeviceOS);
				newIndiaTopUpMediclaimPage.fillAndSubmitDetailedQuoteDetails((TopUpMediEntity) newIndiaTopUpMedicClaimEntity, assertReference, stepGroup);
				testData.updateRecordsForCriteria(newIndiaTopUpMediclaimData);
				setEditQuoteNoDependency(newIndiaTopUpMediclaimData, testData);
			}
		}
	}

	//DetailedTravelDetailsPage

	public void CreateDetailedTravelDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> detailedTravelDetailsEntity=testData.getDetailedTravelEntity(DetailedTravelEntity.class);
		for(GenericEntity detailedTravelDetailsData:detailedTravelDetailsEntity){
			if(detailedTravelDetailsData.getAction().equalsIgnoreCase("add") && detailedTravelDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
				DetailedTravelDetailsPage detailedTravelDetailsPage = new DetailedTravelDetailsPage(driver, "Detailed Travel Details", DeviceOS);
				detailedTravelDetailsPage.fillAndSubmitDetailedTravelDetailsDetails((DetailedTravelEntity) detailedTravelDetailsData, assertReference, stepGroup);		

			}
		}
	}

	public void EditDetailedTravelDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> detailedTravelDetailsEntity=testData.getDetailedTravelEntity(DetailedTravelEntity.class);
		for(GenericEntity detailedTravelDetailsData:detailedTravelDetailsEntity){
			if(detailedTravelDetailsData.getAction().equalsIgnoreCase("edit") && detailedTravelDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
				DetailedTravelDetailsPage detailedTravelDetailsPage = new DetailedTravelDetailsPage(driver, "Detailed Travel Details", DeviceOS);
				detailedTravelDetailsPage.fillAndSubmitDetailedTravelDetailsDetails((DetailedTravelEntity) detailedTravelDetailsEntity, assertReference, stepGroup);		

			}        
		}
	}
	public void VerifyDetailedTravelDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> detailedTravelDetailsEntity=testData.getDetailedTravelEntity(DetailedTravelEntity.class);
		for(GenericEntity detailedTravelDetailsData:detailedTravelDetailsEntity){
			if(detailedTravelDetailsData.getAction().equalsIgnoreCase("verify") && detailedTravelDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
				DetailedTravelDetailsPage detailedTravelDetailsPage = new DetailedTravelDetailsPage(driver, "Detailed Travel Details", DeviceOS);
				detailedTravelDetailsPage.fillAndSubmitDetailedTravelDetailsDetails((DetailedTravelEntity) detailedTravelDetailsEntity, assertReference, stepGroup);		


			}
		}
	}
	//PrivateCar
	public void CreatePrivateCarPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> privateCarEntity = testData.getPrivateCarEntity(PrivateCarEntity.class);
		for (GenericEntity privateCarEntity_Data : privateCarEntity) {
			if (privateCarEntity_Data.getAction().equalsIgnoreCase("add") && privateCarEntity_Data.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PrivateCarPage privateCarPage = new PrivateCarPage(driver, "Private Car", DeviceOS);
				privateCarPage.fillAndSubmitPrivateCarPageDetails((PrivateCarEntity)privateCarEntity_Data, assertReference, stepGroup);
			}
		}
	}

	public void EditPrivateCarPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> privateCarEntity = testData.getPrivateCarEntity(PrivateCarEntity.class);
		for (GenericEntity privateCarEntity_Data : privateCarEntity) {
			if (privateCarEntity_Data.getAction().equalsIgnoreCase("edit") && privateCarEntity_Data.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PrivateCarPage privateCarPage = new PrivateCarPage(driver, "Private Car", DeviceOS);
				privateCarPage.fillAndSubmitPrivateCarPageDetails((PrivateCarEntity)privateCarEntity_Data, assertReference, stepGroup);
			}
		}
	}

	public void VerifyPrivateCarPage(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS) throws InterruptedException {
		List<? extends GenericEntity> privateCarEntity = testData.getPrivateCarEntity(PrivateCarEntity.class);
		for (GenericEntity privateCarEntity_Data : privateCarEntity) {
			if (privateCarEntity_Data.getAction().equalsIgnoreCase("ver") && privateCarEntity_Data.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PrivateCarPage privateCarPage = new PrivateCarPage(driver, "Private Car", DeviceOS);
				privateCarPage.fillAndSubmitPrivateCarPageDetails((PrivateCarEntity)privateCarEntity_Data, assertReference, stepGroup);
			}
		}
	}
	//PremiumSummary
	public void CreatePremiumSummaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> premiumSummaryEntity=testData.getPremiumSummaryEntity(PremiumSummaryEntity.class);
		for(GenericEntity premiumSummaryEntityData:premiumSummaryEntity){
			if(premiumSummaryEntityData.getAction().equalsIgnoreCase("add") && premiumSummaryEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PremiumSummaryPage premiumSummaryPage = new PremiumSummaryPage(driver, "Premium Summary", DeviceOS);
				premiumSummaryPage.fillAndSubmitPremiumSummaryPageDetails((PremiumSummaryEntity)premiumSummaryEntityData, assertReference, stepGroup,testData);		
				setEditPaymentDependency((PremiumSummaryEntity) premiumSummaryEntityData, testData);

			}
		}
	}
	public void EditPremiumSummaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> premiumSummaryEntity=testData.getPremiumSummaryEntity(PremiumSummaryEntity.class);
		for(GenericEntity premiumSummaryEntityData:premiumSummaryEntity){
			if(premiumSummaryEntityData.getAction().equalsIgnoreCase("edit") && premiumSummaryEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PremiumSummaryPage premiumSummaryPage = new PremiumSummaryPage(driver, "Premium Summary", DeviceOS);
				premiumSummaryPage.fillAndSubmitPremiumSummaryPageDetails((PremiumSummaryEntity)premiumSummaryEntity, assertReference, stepGroup,testData);		

			}
		}
	}
	public void VerifyPremiumSummaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> premiumSummaryEntity=testData.getPremiumSummaryEntity(PremiumSummaryEntity.class);
		for(GenericEntity premiumSummaryEntityData:premiumSummaryEntity){
			if(premiumSummaryEntityData.getAction().equalsIgnoreCase("verify") && premiumSummaryEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PremiumSummaryPage premiumSummaryPage = new PremiumSummaryPage(driver, "Premium Summary", DeviceOS);
				premiumSummaryPage.fillAndSubmitPremiumSummaryPageDetails((PremiumSummaryEntity)premiumSummaryEntity, assertReference, stepGroup,testData);		

			}
		}
	}

	//TopUpHealthAdditionalDeatils

	public void CreateTopUpHealthAdditionalDeatils(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> healthAddDetailEntity = testData.getHealthAddDetailEntity(HealthAddDetailEntity.class);
		for (GenericEntity healthAddDetailData : healthAddDetailEntity) {
			if (healthAddDetailData.getAction().equalsIgnoreCase("add") && healthAddDetailData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TopUpHealthAdditionalDeatils topUpHealthAdditionalDeatils = new TopUpHealthAdditionalDeatils(driver, "Top Up Health Assitional Deatils", DeviceOS);
				topUpHealthAdditionalDeatils.fillAndSubmitHomepageDetails( (HealthAddDetailEntity) healthAddDetailData, assertReference, stepGroup);
			}
		}
	}

	public void EditTopUpHealthAdditionalDeatils(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> healthAddDetailEntity = testData.getHealthAddDetailEntity(HealthAddDetailEntity.class);
		for (GenericEntity healthAddDetailData : healthAddDetailEntity) {
			if (healthAddDetailData.getAction().equalsIgnoreCase("edit") && healthAddDetailData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TopUpHealthAdditionalDeatils topUpHealthAdditionalDeatils = new TopUpHealthAdditionalDeatils(driver, "Top Up Health Assitional Deatils", DeviceOS);
				topUpHealthAdditionalDeatils.fillAndSubmitHomepageDetails( (HealthAddDetailEntity) healthAddDetailData, assertReference, stepGroup);
			}
		}
	}

	public void VerifyTopUpHealthAdditionalDeatils(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> healthAddDetailEntity = testData.getHealthAddDetailEntity(HealthAddDetailEntity.class);
		for (GenericEntity healthAddDetailData : healthAddDetailEntity) {
			if (healthAddDetailData.getAction().equalsIgnoreCase("verify") && healthAddDetailData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				TopUpHealthAdditionalDeatils topUpHealthAdditionalDeatils = new TopUpHealthAdditionalDeatils(driver, "Top Up Health Assitional Deatils", DeviceOS);
				topUpHealthAdditionalDeatils.fillAndSubmitHomepageDetails( (HealthAddDetailEntity) healthAddDetailData, assertReference, stepGroup);
			}
		}
	}

	public void CreatePersonalAccidentDet(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> personalAccidentDetEntity = testData.getPersonalAccidentDetEntity(PersonalAccidentDetEntity.class);
		for (GenericEntity personalAccidentDetData : personalAccidentDetEntity) {
			if (personalAccidentDetData.getAction().equalsIgnoreCase("add") && personalAccidentDetData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PersonalAccidentDet personalAccidentDet = new PersonalAccidentDet(driver, "Personal Accident Det", DeviceOS);
				personalAccidentDet.fillAndSubmitPersonalAccidentDet((PersonalAccidentDetEntity) personalAccidentDetData, assertReference, stepGroup);
			}
		}
	}

	public void EditPersonalAccidentDet(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> personalAccidentDetEntity = testData.getPersonalAccidentDetEntity(PersonalAccidentDetEntity.class);
		for (GenericEntity personalAccidentDetData : personalAccidentDetEntity) {
			if (personalAccidentDetData.getAction().equalsIgnoreCase("add") && personalAccidentDetData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PersonalAccidentDet personalAccidentDet = new PersonalAccidentDet(driver, "Personal Accident Det", DeviceOS);
				personalAccidentDet.fillAndSubmitPersonalAccidentDet((PersonalAccidentDetEntity) personalAccidentDetData, assertReference, stepGroup);
			}
		}
	}

	public void VerifyPersonalAccidentDet(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, AppiumDriver driver, String stepGroup, String DeviceOS)throws InterruptedException {
		List<? extends GenericEntity> personalAccidentDetEntity = testData.getPersonalAccidentDetEntity(PersonalAccidentDetEntity.class);
		for (GenericEntity personalAccidentDetData : personalAccidentDetEntity) {
			if (personalAccidentDetData.getAction().equalsIgnoreCase("add") && personalAccidentDetData.getStepGroup().equalsIgnoreCase(stepGroup)) {
				PersonalAccidentDet personalAccidentDet = new PersonalAccidentDet(driver, "Personal Accident Det", DeviceOS);
				personalAccidentDet.fillAndSubmitPersonalAccidentDet((PersonalAccidentDetEntity) personalAccidentDetData, assertReference, stepGroup);
			}
		}
	}

	//AdditionalDetails
	public void CreateAdditionalDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> additionalDetailsMotorEntity=testData.getAdditionalDetailsMotorEntity(AdditionalDetailsMotorEntity.class);
		for(GenericEntity additionalDetailsMotorData:additionalDetailsMotorEntity){
			if(additionalDetailsMotorData.getAction().equalsIgnoreCase("add") && additionalDetailsMotorData.getStepGroup().equalsIgnoreCase(stepGroup)){
				AdditionalDetailsMotorPage additionalDetailsMotorPage = new AdditionalDetailsMotorPage(driver, "Premium Summary", DeviceOS);
				additionalDetailsMotorPage.fillAndSubmitAdditionalVehicleDetails((AdditionalDetailsMotorEntity)additionalDetailsMotorData, assertReference, stepGroup);		
			}
		}
	}
	public void EditAdditionalDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> additionalDetailsMotorEntity=testData.getAdditionalDetailsMotorEntity(AdditionalDetailsMotorEntity.class);
		for(GenericEntity additionalDetailsMotorData:additionalDetailsMotorEntity){
			if(additionalDetailsMotorData.getAction().equalsIgnoreCase("edit") && additionalDetailsMotorData.getStepGroup().equalsIgnoreCase(stepGroup)){
				AdditionalDetailsMotorPage additionalDetailsMotorPage = new AdditionalDetailsMotorPage(driver, "Premium Summary", DeviceOS);
				additionalDetailsMotorPage.fillAndSubmitAdditionalVehicleDetails((AdditionalDetailsMotorEntity)additionalDetailsMotorEntity, assertReference, stepGroup);		
			}
		}
	}
	public void VerifyAdditionalDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> additionalDetailsMotorEntity=testData.getAdditionalDetailsMotorEntity(AdditionalDetailsMotorEntity.class);
		for(GenericEntity additionalDetailsMotorData:additionalDetailsMotorEntity){
			if(additionalDetailsMotorData.getAction().equalsIgnoreCase("verify") && additionalDetailsMotorData.getStepGroup().equalsIgnoreCase(stepGroup)){
				AdditionalDetailsMotorPage additionalDetailsMotorPage = new AdditionalDetailsMotorPage(driver, "Premium Summary", DeviceOS);
				additionalDetailsMotorPage.fillAndSubmitAdditionalVehicleDetails((AdditionalDetailsMotorEntity)additionalDetailsMotorEntity, assertReference, stepGroup);		
			}
		}
	}
	//SummaryPage
	public void CreateSummaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> summaryPageEntity=testData.getSummaryPageEntity(SummaryPageEntity.class);
		for(GenericEntity summaryPageEntityData:summaryPageEntity){
			if(summaryPageEntityData.getAction().equalsIgnoreCase("add") && summaryPageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				SummaryPage summaryPage = new SummaryPage(driver, " Summary", DeviceOS);
				summaryPage.fillAndSubmitPremiumSummaryPageDetails((SummaryPageEntity)summaryPageEntityData, assertReference, stepGroup);		
			}
		}
	}
	public void EditSummaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> summaryPageEntity=testData.getSummaryPageEntity(SummaryPageEntity.class);
		for(GenericEntity summaryPageEntityData:summaryPageEntity){
			if(summaryPageEntityData.getAction().equalsIgnoreCase("Edit") && summaryPageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				SummaryPage summaryPage = new SummaryPage(driver, " Summary", DeviceOS);
				summaryPage.fillAndSubmitPremiumSummaryPageDetails((SummaryPageEntity)summaryPageEntityData, assertReference, stepGroup);		
			}
		}
	}
	public void VerifySummaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> summaryPageEntity=testData.getSummaryPageEntity(SummaryPageEntity.class);
		for(GenericEntity summaryPageEntityData:summaryPageEntity){
			if(summaryPageEntityData.getAction().equalsIgnoreCase("Verify") && summaryPageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				SummaryPage summaryPage = new SummaryPage(driver, " Summary", DeviceOS);
				summaryPage.fillAndSubmitPremiumSummaryPageDetails((SummaryPageEntity)summaryPageEntityData, assertReference, stepGroup);		

			}
		}
	}
	public void CreateHomeIntermediaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws Exception{
		List<? extends GenericEntity> homeIntermediaryPageEntity=testData.getHomeIntermediaryEntity(HomeIntermediaryEntity.class);
		for(GenericEntity homeIntermediaryPageEntityData:homeIntermediaryPageEntity){
			if(homeIntermediaryPageEntityData.getAction().equalsIgnoreCase("add") && homeIntermediaryPageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				HomeIntermediaryPage homeIntermediaryPage = new HomeIntermediaryPage(driver, " Home Intermediary Page", DeviceOS);
				homeIntermediaryPage.fillAndSubmitHomeIntermediaryPage((HomeIntermediaryEntity)homeIntermediaryPageEntityData, assertReference, DeviceOS);	
			}
		}
	}
	public void EditHomeIntermediaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws Exception{
		List<? extends GenericEntity> homeIntermediaryPageEntity=testData.getHomeIntermediaryEntity(HomeIntermediaryEntity.class);
		for(GenericEntity homeIntermediaryPageEntityData:homeIntermediaryPageEntity){
			if(homeIntermediaryPageEntityData.getAction().equalsIgnoreCase("add") && homeIntermediaryPageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				HomeIntermediaryPage homeIntermediaryPage = new HomeIntermediaryPage(driver, " Home Intermediary Page", DeviceOS);
				homeIntermediaryPage.fillAndSubmitHomeIntermediaryPage((HomeIntermediaryEntity)homeIntermediaryPageEntityData, assertReference, DeviceOS);	
			}
		}
	}

	public void VerifyHomeIntermediaryPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws Exception{
		List<? extends GenericEntity> homeIntermediaryPageEntity=testData.getHomeIntermediaryEntity(HomeIntermediaryEntity.class);
		for(GenericEntity homeIntermediaryPageEntityData:homeIntermediaryPageEntity){
			if(homeIntermediaryPageEntityData.getAction().equalsIgnoreCase("verify") && homeIntermediaryPageEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				HomeIntermediaryPage homeIntermediaryPage = new HomeIntermediaryPage(driver, " Home Intermediary Page", DeviceOS);
				homeIntermediaryPage.fillAndSubmitHomeIntermediaryPage((HomeIntermediaryEntity)homeIntermediaryPageEntityData, assertReference, DeviceOS);	
			}
		}
	}
	//RecentActivities
	public void CreateRecentActivitiesPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> recentActivitiesEntity=testData.getRecentActivitiesEntity(RecentActivitiesEntity.class);
		for(GenericEntity recentActivitiesEntityData:recentActivitiesEntity){
			if(recentActivitiesEntityData.getAction().equalsIgnoreCase("add") && recentActivitiesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				RecentActivitiesPage recentActivitiesPage = new RecentActivitiesPage(driver, " Recent Activities", DeviceOS);
				recentActivitiesPage.fillAndSubmitRecentActivitiesPageDetails((RecentActivitiesEntity)recentActivitiesEntity, assertReference, stepGroup);		
			}
		}
	}
	public void EditRecentActivitiesPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> recentActivitiesEntity=testData.getRecentActivitiesEntity(RecentActivitiesEntity.class);
		for(GenericEntity recentActivitiesEntityData:recentActivitiesEntity){
			if(recentActivitiesEntityData.getAction().equalsIgnoreCase("edit") && recentActivitiesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				RecentActivitiesPage recentActivitiesPage = new RecentActivitiesPage(driver, " Recent Activities", DeviceOS);
				recentActivitiesPage.fillAndSubmitRecentActivitiesPageDetails((RecentActivitiesEntity)recentActivitiesEntity, assertReference, stepGroup);		
			}
		}
	}
	public void VerifyRecentActivitiesPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> recentActivitiesEntity=testData.getRecentActivitiesEntity(RecentActivitiesEntity.class);
		for(GenericEntity recentActivitiesEntityData:recentActivitiesEntity){
			if(recentActivitiesEntityData.getAction().equalsIgnoreCase("verify") && recentActivitiesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				RecentActivitiesPage recentActivitiesPage = new RecentActivitiesPage(driver, " Recent Activities", DeviceOS);
				recentActivitiesPage.fillAndSubmitRecentActivitiesPageDetails((RecentActivitiesEntity)recentActivitiesEntity, assertReference, stepGroup);		
			}
		}
	}

	/*private void setEditPaymentDependency(PremiumSummaryEntity premiumSummaryEntity, ScenarioTestData testData) {
		if(premiumSummaryEntity.getStringValueForField("DependencyForPaymentSummary")!=null){
			ArrayList<? extends GenericEntity> summaryPageListAll = testData.getObjectByReference(testData.getSummaryPageEntity(), premiumSummaryEntity.getStringValueForField("DependencyForPaymentSummary"));
			for(GenericEntity summaryPageData:summaryPageListAll) {
				//summaryPageData.setStringValueForField("PolicyStartDate", premiumSummaryEntity.getStringValueForField("PolicyStartDate"));
				//summaryPageData.setStringValueForField("PolicyExpiryDate", premiumSummaryEntity.getStringValueForField("PolicyExpiryDate"));
				summaryPageData.setStringValueForField("QuoteNo", premiumSummaryEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(summaryPageData);

			}
		}

	}*/


	public void setEditPaymentDependency(GenericEntity userData, ScenarioTestData testData) {
		if (userData.getStringValueForField("DependencyForPaymentSummary") != null) {
			List<? extends GenericEntity> summaryPageEntityList = testData.getObjectByReference(testData.getSummaryPageEntity(SummaryPageEntity.class),userData.getStringValueForField("DependencyForPaymentSummary"));
			for (GenericEntity summaryPageData : summaryPageEntityList) {
				summaryPageData.setStringValueForField("QuoteNo",userData.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(summaryPageData);
			}
		}
	}	
	//getBuyNowEntermidiaryEntity

	public void CreateBuyNowIntermidary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> buyNowEntermidiaryEntity=testdata.getBuyNowEntermidiaryEntity(BuyNowEntermidiaryEntity.class);
		for(GenericEntity buynowEntermidiary:buyNowEntermidiaryEntity ) {
			if(buynowEntermidiary.getAction().equalsIgnoreCase("add")&& buynowEntermidiary.getStepGroup().equalsIgnoreCase(stepGroup)){
				GrihaSuvidhaBuyNowPages grihaSuvidhaBuyNowPages=new GrihaSuvidhaBuyNowPages(driver, "Buy Now inter", DeviceOS);
				grihaSuvidhaBuyNowPages.fillandproceedBuyNow((BuyNowEntermidiaryEntity)buynowEntermidiary, assertReference);	
			}
		}
	}

	public void EditBuyNowIntermidary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> buyNowEntermidiaryEntity=testdata.getBuyNowEntermidiaryEntity(BuyNowEntermidiaryEntity.class);
		for(GenericEntity buynowEntermidiary:buyNowEntermidiaryEntity ) {
			if(buynowEntermidiary.getAction().equalsIgnoreCase("edit")&& buynowEntermidiary.getStepGroup().equalsIgnoreCase(stepGroup)){
				GrihaSuvidhaBuyNowPages grihaSuvidhaBuyNowPages=new GrihaSuvidhaBuyNowPages(driver, "Buy Now inter", DeviceOS);
				grihaSuvidhaBuyNowPages.fillandproceedBuyNow((BuyNowEntermidiaryEntity)buynowEntermidiary, assertReference);	
			}
		}
	}
	public void verifyBuyNowIntermidary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> buyNowEntermidiaryEntity=testdata.getBuyNowEntermidiaryEntity(BuyNowEntermidiaryEntity.class);
		for(GenericEntity buynowEntermidiary:buyNowEntermidiaryEntity ) {
			if(buynowEntermidiary.getAction().equalsIgnoreCase("verify")&& buynowEntermidiary.getStepGroup().equalsIgnoreCase(stepGroup)){
				GrihaSuvidhaBuyNowPages grihaSuvidhaBuyNowPages=new GrihaSuvidhaBuyNowPages(driver, "Buy Now inter", DeviceOS);
				grihaSuvidhaBuyNowPages.fillandproceedBuyNow((BuyNowEntermidiaryEntity)buynowEntermidiary, assertReference);	
			}
		}
	}

	//frist page of additonal detail wrriten by anzaf
	public void CreateadditionalDetailsPageForIntermidiary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> additionalDetailsPageForIntermidiaryEntity=testdata.getBuyNowEntermidiaryEntity(AdtionalDetalsInterEntity.class);
		for(GenericEntity addtionaldetail:additionalDetailsPageForIntermidiaryEntity ) {
			if(addtionaldetail.getAction().equalsIgnoreCase("add")&& addtionaldetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				AdditionalDetailsPageForIntermidiary additionalDetailsPageForIntermidiary=new AdditionalDetailsPageForIntermidiary(driver, "Additional detail", DeviceOS);
				additionalDetailsPageForIntermidiary.fillAndSubmitAddtionalDetailPage((AdtionalDetalsInterEntity)addtionaldetail, assertReference);	
			}
		}
	}
	public void EditadditionalDetailsPageForIntermidiary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> additionalDetailsPageForIntermidiaryEntity=testdata.getBuyNowEntermidiaryEntity(AdtionalDetalsInterEntity.class);
		for(GenericEntity addtionaldetail:additionalDetailsPageForIntermidiaryEntity ) {
			if(addtionaldetail.getAction().equalsIgnoreCase("edit")&& addtionaldetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				AdditionalDetailsPageForIntermidiary additionalDetailsPageForIntermidiary=new AdditionalDetailsPageForIntermidiary(driver, "Additional detail", DeviceOS);
				additionalDetailsPageForIntermidiary.fillAndSubmitAddtionalDetailPage((AdtionalDetalsInterEntity)addtionaldetail, assertReference);	
			}
		}
	}
	public void verifyadditionalDetailsPageForIntermidiary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> additionalDetailsPageForIntermidiaryEntity=testdata.getBuyNowEntermidiaryEntity(AdtionalDetalsInterEntity.class);
		for(GenericEntity addtionaldetail:additionalDetailsPageForIntermidiaryEntity ) {
			if(addtionaldetail.getAction().equalsIgnoreCase("verify")&& addtionaldetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				AdditionalDetailsPageForIntermidiary additionalDetailsPageForIntermidiary=new AdditionalDetailsPageForIntermidiary(driver, "Additional detail", DeviceOS);
				additionalDetailsPageForIntermidiary.fillAndSubmitAddtionalDetailPage((AdtionalDetalsInterEntity)addtionaldetail, assertReference);	
			}
		}
	}
/*public void createPolicyHolderInformationIntermidiaryDetails(ScenarioTestData testData,ExecutionTestSteps executionTestStep, CustomAssert assertReference, AppiumDriver driver, String stepGroup,String deviceOS) {
	List<? extends GenericEntity> policyHolderInformationIntermidiaryEntity=testData.getPolicyInfoIntermidiaryEntity(PolicyInfoIntermidiaryEntity.class);
	for(GenericEntity policyHolderInformationIntermidiar:policyHolderInformationIntermidiaryEntity ) {
		if(policyHolderInformationIntermidiar.getAction().equalsIgnoreCase("add")&& policyHolderInformationIntermidiar.getStepGroup().equalsIgnoreCase(stepGroup)){
			PolicyHolderInformationIntermidiarypage additionalDetailsPageForIntermidiary=new PolicyHolderInformationIntermidiarypage(driver, "PolicyHolderInformation", deviceOS);
			additionalDetailsPageForIntermidiary.fillAndSubmitHolderInformationIntermidiaryEntity((PolicyInfoIntermidiaryEntity)policyHolderInformationIntermidiar, assertReference);	
		}
	}*/
	// TODO Auto-generated method stub
	


	//Second Page 
	public void createPolicyHolderInformationIntermidiary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws Exception{
		List<? extends GenericEntity> policyHolderInformationIntermidiaryEntity=testdata.getPolicyInfoIntermidiaryEntity(PolicyInfoIntermidiaryEntity.class);
		for(GenericEntity policyHolderInformationIntermidiar:policyHolderInformationIntermidiaryEntity ) {
			if(policyHolderInformationIntermidiar.getAction().equalsIgnoreCase("add")&& policyHolderInformationIntermidiar.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyHolderInformationIntermidiarypage additionalDetailsPageForIntermidiary=new PolicyHolderInformationIntermidiarypage(driver, "PolicyHolderInformation", DeviceOS);
				additionalDetailsPageForIntermidiary.fillAndSubmitHolderInformationIntermidiaryEntity((PolicyInfoIntermidiaryEntity)policyHolderInformationIntermidiar, assertReference);	
			}
		}
	}
	public void editPolicyHolderInformationIntermidiary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws Exception{
		List<? extends GenericEntity> policyHolderInformationIntermidiaryEntity=testdata.getPolicyInfoIntermidiaryEntity(PolicyInfoIntermidiaryEntity.class);
		for(GenericEntity policyHolderInformationIntermidiar:policyHolderInformationIntermidiaryEntity ) {
			if(policyHolderInformationIntermidiar.getAction().equalsIgnoreCase("edit")&& policyHolderInformationIntermidiar.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyHolderInformationIntermidiarypage additionalDetailsPageForIntermidiary=new PolicyHolderInformationIntermidiarypage(driver, "PolicyHolderInformation", DeviceOS);
				additionalDetailsPageForIntermidiary.fillAndSubmitHolderInformationIntermidiaryEntity((PolicyInfoIntermidiaryEntity)policyHolderInformationIntermidiar, assertReference);	
			}
		}
	}


	public void verifyPolicyHolderInformationIntermidiary(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws Exception{
		List<? extends GenericEntity> policyHolderInformationIntermidiaryEntity=testdata.getPolicyInfoIntermidiaryEntity(PolicyInfoIntermidiaryEntity.class);
		for(GenericEntity policyHolderInformationIntermidiar:policyHolderInformationIntermidiaryEntity ) {
			if(policyHolderInformationIntermidiar.getAction().equalsIgnoreCase("verify")&& policyHolderInformationIntermidiar.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyHolderInformationIntermidiarypage additionalDetailsPageForIntermidiary=new PolicyHolderInformationIntermidiarypage(driver, "PolicyHolderInformation", DeviceOS);
				additionalDetailsPageForIntermidiary.fillAndSubmitHolderInformationIntermidiaryEntity((PolicyInfoIntermidiaryEntity)policyHolderInformationIntermidiar, assertReference);	
			}

		}
	}


	public void CreateAddressFinencierDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> addressFinancierDetailEntity=testdata.getAddressFinancierDetailEntity(AddressFinancierDetailEntity.class);
		for(GenericEntity addressFinancierDetail:addressFinancierDetailEntity ) {
			if(addressFinancierDetail.getAction().equalsIgnoreCase("add")&& addressFinancierDetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				AddressFinancierDetailPage addressFinancierDetailPage=new AddressFinancierDetailPage(driver, "PolicyHolderInformation", DeviceOS);
				addressFinancierDetailPage.fillandSubmitAddressFinancierDetil((AddressFinancierDetailEntity) addressFinancierDetail, assertReference);	
			}
		}
	}

	public void editAddressFinencierDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> addressFinancierDetailEntity=testdata.getAddressFinancierDetailEntity(AddressFinancierDetailEntity.class);
		for(GenericEntity addressFinancierDetail:addressFinancierDetailEntity ) {
			if(addressFinancierDetail.getAction().equalsIgnoreCase("edit")&& addressFinancierDetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				AddressFinancierDetailPage addressFinancierDetailPage=new AddressFinancierDetailPage(driver, "PolicyHolderInformation", DeviceOS);
				addressFinancierDetailPage.fillandSubmitAddressFinancierDetil((AddressFinancierDetailEntity) addressFinancierDetail, assertReference);	
			}

		}
	}



	public void verifyAddressFinencierDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> addressFinancierDetailEntity=testdata.getAddressFinancierDetailEntity(AddressFinancierDetailEntity.class);
		for(GenericEntity addressFinancierDetail:addressFinancierDetailEntity ) {
			if(addressFinancierDetail.getAction().equalsIgnoreCase("verify")&& addressFinancierDetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				AddressFinancierDetailPage addressFinancierDetailPage=new AddressFinancierDetailPage(driver, "PolicyHolderInformation", DeviceOS);
				addressFinancierDetailPage.fillandSubmitAddressFinancierDetil((AddressFinancierDetailEntity) addressFinancierDetail, assertReference);	
			}

		}
	}


	public void CreateSummaryIntermidiateDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> summaryIntermidiarEntity=testdata.getSummaryIntermidiarEntity(SummaryIntermidiarEntity.class);
		for(GenericEntity summaryIntermidiarDetail:summaryIntermidiarEntity ) {
			if(summaryIntermidiarDetail.getAction().equalsIgnoreCase("add")&& summaryIntermidiarDetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				SummaryPymentDetailInterPage summaryPymentDetailInterPage=new SummaryPymentDetailInterPage(driver, "SummaryPymentDetailInter", DeviceOS);
				summaryPymentDetailInterPage.fillAndSubmitPremiumSummaryPageDetails((SummaryIntermidiarEntity)summaryIntermidiarDetail, assertReference, stepGroup);
			}

		}
	}

	public void EditSummaryIntermidiateDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> summaryIntermidiarEntity=testdata.getSummaryIntermidiarEntity(SummaryIntermidiarEntity.class);
		for(GenericEntity summaryIntermidiarDetail:summaryIntermidiarEntity ) {
			if(summaryIntermidiarDetail.getAction().equalsIgnoreCase("edit")&& summaryIntermidiarDetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				SummaryPymentDetailInterPage summaryPymentDetailInterPage=new SummaryPymentDetailInterPage(driver, "SummaryPymentDetailInter", DeviceOS);
				summaryPymentDetailInterPage.fillAndSubmitPremiumSummaryPageDetails((SummaryIntermidiarEntity)summaryIntermidiarDetail, assertReference, stepGroup);
			}

		}
	}


	public void VerifySummaryIntermidiateDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> summaryIntermidiarEntity=testdata.getSummaryIntermidiarEntity(SummaryIntermidiarEntity.class);
		for(GenericEntity summaryIntermidiarDetail:summaryIntermidiarEntity ) {
			if(summaryIntermidiarDetail.getAction().equalsIgnoreCase("verify")&& summaryIntermidiarDetail.getStepGroup().equalsIgnoreCase(stepGroup)){
				SummaryPymentDetailInterPage summaryPymentDetailInterPage=new SummaryPymentDetailInterPage(driver, "SummaryPymentDetailInter", DeviceOS);
				summaryPymentDetailInterPage.fillAndSubmitPremiumSummaryPageDetails((SummaryIntermidiarEntity)summaryIntermidiarDetail, assertReference, stepGroup);
			}

		}
	}





	public void CreateCollectionDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> collectionIntemidiaryEntity=testdata.getCollectionIntemidiaryEntity(CollectionIntemidiaryEntity.class);
		for(GenericEntity collectionIntemidiaryEntityData:collectionIntemidiaryEntity ) {
			if(collectionIntemidiaryEntityData.getAction().equalsIgnoreCase("add")&& collectionIntemidiaryEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				CollectionIntemidiaryPage collectionIntemidiaryPage=new CollectionIntemidiaryPage(driver, "Collection", DeviceOS);
					 collectionIntemidiaryPage.fillAndSubmitCollectionPageDetails((CollectionIntemidiaryEntity)collectionIntemidiaryEntityData, assertReference, stepGroup);
			}

		}
	}



	public void editCollectionDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> collectionIntemidiaryEntity=testdata.getCollectionIntemidiaryEntity(CollectionIntemidiaryEntity.class);
		for(GenericEntity collectionIntemidiaryEntityData:collectionIntemidiaryEntity ) {
			if(collectionIntemidiaryEntityData.getAction().equalsIgnoreCase("edit")&& collectionIntemidiaryEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				CollectionIntemidiaryPage collectionIntemidiaryPage=new CollectionIntemidiaryPage(driver, "Collection", DeviceOS);
					 collectionIntemidiaryPage.fillAndSubmitCollectionPageDetails((CollectionIntemidiaryEntity)collectionIntemidiaryEntityData, assertReference, stepGroup);
			}

		}
	}




	public void verifyCollectionDetail(ScenarioTestData testdata,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS )throws InterruptedException{
		List<? extends GenericEntity> collectionIntemidiaryEntity=testdata.getCollectionIntemidiaryEntity(CollectionIntemidiaryEntity.class);
		for(GenericEntity collectionIntemidiaryEntityData:collectionIntemidiaryEntity ) {
			if(collectionIntemidiaryEntityData.getAction().equalsIgnoreCase("verify")&& collectionIntemidiaryEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				CollectionIntemidiaryPage collectionIntemidiaryPage=new CollectionIntemidiaryPage(driver, "Collection", DeviceOS);
					 collectionIntemidiaryPage.fillAndSubmitCollectionPageDetails((CollectionIntemidiaryEntity)collectionIntemidiaryEntityData, assertReference, stepGroup);
			}

		}
	}





	public void setEditQuoteNoDependency(GenericEntity userData, ScenarioTestData testData) {
		if (userData.getStringValueForField("DependencyForQuoteNo") != null) {
			List<? extends GenericEntity> summaryPageEntityList = testData.getObjectByReference(testData.getSummaryPageEntity(SummaryPageEntity.class),userData.getStringValueForField("DependencyForQuoteNo"));
			for (GenericEntity summaryPageEntityListData : summaryPageEntityList) {
				summaryPageEntityListData.setStringValueForField("QuoteNo",userData.getStringValueForField("QuoteNumber"));
				testData.updateRecordsForCriteria(summaryPageEntityListData);
			}
		}
	}
	//
	public void CreateInsuredDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> tWInsuredDetailsIntmyEntity=testData.getTWInsuredDetailsIntmyEntity(TWInsuredDetailsIntmyEntity.class);
		for(GenericEntity tWInsuredDetailsIntmyEntityData:tWInsuredDetailsIntmyEntity){
			if(tWInsuredDetailsIntmyEntityData.getAction().equalsIgnoreCase("add") && tWInsuredDetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWInsuredDetailsIntmyPage tWInsuredDetailsIntmyPage = new TWInsuredDetailsIntmyPage(driver, "Insured Details", DeviceOS);
				tWInsuredDetailsIntmyPage.fillandSubmitTWInsuredDetails((TWInsuredDetailsIntmyEntity)tWInsuredDetailsIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	public void EditInsuredDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> tWInsuredDetailsIntmyEntity=testData.getTWInsuredDetailsIntmyEntity(TWInsuredDetailsIntmyEntity.class);
		for(GenericEntity tWInsuredDetailsIntmyEntityData:tWInsuredDetailsIntmyEntity){
			if(tWInsuredDetailsIntmyEntityData.getAction().equalsIgnoreCase("edit") && tWInsuredDetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWInsuredDetailsIntmyPage tWInsuredDetailsIntmyPage = new TWInsuredDetailsIntmyPage(driver, " Insured Details", DeviceOS);
				tWInsuredDetailsIntmyPage.fillandSubmitTWInsuredDetails((TWInsuredDetailsIntmyEntity)tWInsuredDetailsIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	public void VerifyInsuredDetailsPage(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> tWInsuredDetailsIntmyEntity=testData.getTWInsuredDetailsIntmyEntity(TWInsuredDetailsIntmyEntity.class);
		for(GenericEntity tWInsuredDetailsIntmyEntityData:tWInsuredDetailsIntmyEntity){
			if(tWInsuredDetailsIntmyEntityData.getAction().equalsIgnoreCase("verify") && tWInsuredDetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWInsuredDetailsIntmyPage tWInsuredDetailsIntmyPage = new TWInsuredDetailsIntmyPage(driver, " Insured Details", DeviceOS);
				tWInsuredDetailsIntmyPage.fillandSubmitTWInsuredDetails((TWInsuredDetailsIntmyEntity)tWInsuredDetailsIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	//

	public void CreateTWBasicPremiumIntmy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> TWBasicPremiumIntmyEntity=testData.getTWBasicPremiumIntmyEntity(TWBasicPremiumIntmyEntity.class);
		for(GenericEntity TWBasicPremiumIntmyEntityData:TWBasicPremiumIntmyEntity){
			if(TWBasicPremiumIntmyEntityData.getAction().equalsIgnoreCase("add") && TWBasicPremiumIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWBasicPremiumIntmdyPage TWBasicPremiumIntmdyPage = new TWBasicPremiumIntmdyPage(driver, "Basic Premium", DeviceOS);
				TWBasicPremiumIntmdyPage.fillAndSubmitTWBasicPremiumPageDetails((TWBasicPremiumIntmyEntity)TWBasicPremiumIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	public void EditTWBasicPremiumIntmy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> TWBasicPremiumIntmyEntity=testData.getTWBasicPremiumIntmyEntity(TWBasicPremiumIntmyEntity.class);
		for(GenericEntity TWBasicPremiumIntmyEntityData:TWBasicPremiumIntmyEntity){
			if(TWBasicPremiumIntmyEntityData.getAction().equalsIgnoreCase("edit") && TWBasicPremiumIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWBasicPremiumIntmdyPage TWBasicPremiumIntmdyPage = new TWBasicPremiumIntmdyPage(driver, "Basic Premium", DeviceOS);
				TWBasicPremiumIntmdyPage.fillAndSubmitTWBasicPremiumPageDetails((TWBasicPremiumIntmyEntity)TWBasicPremiumIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	public void VerifyTWBasicPremiumIntmy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> TWBasicPremiumIntmyEntity=testData.getTWBasicPremiumIntmyEntity(TWBasicPremiumIntmyEntity.class);
		for(GenericEntity TWBasicPremiumIntmyEntityData:TWBasicPremiumIntmyEntity){
			if(TWBasicPremiumIntmyEntityData.getAction().equalsIgnoreCase("verify") && TWBasicPremiumIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWBasicPremiumIntmdyPage TWBasicPremiumIntmdyPage = new TWBasicPremiumIntmdyPage(driver, "Basic Premium", DeviceOS);
				TWBasicPremiumIntmdyPage.fillAndSubmitTWBasicPremiumPageDetails((TWBasicPremiumIntmyEntity)TWBasicPremiumIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	//
	public void CreateTWdetailsIntmy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> TWdetailsIntmyEntity=testData.getTWBasicPremiumIntmyEntity(TWdetailsIntmyEntity.class);
		for(GenericEntity TWdetailsIntmyEntityData:TWdetailsIntmyEntity){
			if(TWdetailsIntmyEntityData.getAction().equalsIgnoreCase("add") && TWdetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWDetailsIntmdryPage TWDetailsIntmdryPage = new TWDetailsIntmdryPage(driver, "Basic Premium", DeviceOS);
				TWDetailsIntmdryPage.fillAndSubmitTwoWheelerIntermidiaryDetails((TWdetailsIntmyEntity)TWdetailsIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	public void EditTWdetailsIntmy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> TWdetailsIntmyEntity=testData.getTWBasicPremiumIntmyEntity(TWdetailsIntmyEntity.class);
		for(GenericEntity TWdetailsIntmyEntityData:TWdetailsIntmyEntity){
			if(TWdetailsIntmyEntityData.getAction().equalsIgnoreCase("edit") && TWdetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWDetailsIntmdryPage TWDetailsIntmdryPage = new TWDetailsIntmdryPage(driver, "Basic Premium", DeviceOS);
				TWDetailsIntmdryPage.fillAndSubmitTwoWheelerIntermidiaryDetails((TWdetailsIntmyEntity)TWdetailsIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	public void VerifyTWdetailsIntmy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> TWdetailsIntmyEntity=testData.getTWBasicPremiumIntmyEntity(TWdetailsIntmyEntity.class);
		for(GenericEntity TWdetailsIntmyEntityData:TWdetailsIntmyEntity){
			if(TWdetailsIntmyEntityData.getAction().equalsIgnoreCase("verify") && TWdetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				TWDetailsIntmdryPage TWDetailsIntmdryPage = new TWDetailsIntmdryPage(driver, "Basic Premium", DeviceOS);
				TWDetailsIntmdryPage.fillAndSubmitTwoWheelerIntermidiaryDetails((TWdetailsIntmyEntity)TWdetailsIntmyEntityData, assertReference,stepGroup);	
			}
		}
	}
	//
	public void CreateVehicleDetailsIntermidiary(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> VehicleDetailsIntmyEntity=testData.getVehicleDetailsIntmyEntity(VehicleDetailsIntmyEntity.class);
		for(GenericEntity VehicleDetailsIntmyEntityData:VehicleDetailsIntmyEntity){
			if(VehicleDetailsIntmyEntityData.getAction().equalsIgnoreCase("add") && VehicleDetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				VehicleDetailsIntermidiaryPage VehicleDetailsIntermidiaryPage = new VehicleDetailsIntermidiaryPage(driver, "Basic Premium", DeviceOS);
				VehicleDetailsIntermidiaryPage.fillAndSubmitVehicleDetailPageDetails((VehicleDetailsIntmyEntity)VehicleDetailsIntmyEntityData, assertReference, stepGroup);

			}
		}
	}
	public void EditVehicleDetailsIntermidiary(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> VehicleDetailsIntmyEntity=testData.getVehicleDetailsIntmyEntity(VehicleDetailsIntmyEntity.class);
		for(GenericEntity VehicleDetailsIntmyEntityData:VehicleDetailsIntmyEntity){
			if(VehicleDetailsIntmyEntityData.getAction().equalsIgnoreCase("edit") && VehicleDetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				VehicleDetailsIntermidiaryPage VehicleDetailsIntermidiaryPage = new VehicleDetailsIntermidiaryPage(driver, "Basic Premium", DeviceOS);
				VehicleDetailsIntermidiaryPage.fillAndSubmitVehicleDetailPageDetails((VehicleDetailsIntmyEntity)VehicleDetailsIntmyEntityData, assertReference, stepGroup);

			}
		}
	}
	public void VerifyVehicleDetailsIntermidiary(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> VehicleDetailsIntmyEntity=testData.getVehicleDetailsIntmyEntity(VehicleDetailsIntmyEntity.class);
		for(GenericEntity VehicleDetailsIntmyEntityData:VehicleDetailsIntmyEntity){
			if(VehicleDetailsIntmyEntityData.getAction().equalsIgnoreCase("verify") && VehicleDetailsIntmyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				VehicleDetailsIntermidiaryPage VehicleDetailsIntermidiaryPage = new VehicleDetailsIntermidiaryPage(driver, "Basic Premium", DeviceOS);
				VehicleDetailsIntermidiaryPage.fillAndSubmitVehicleDetailPageDetails((VehicleDetailsIntmyEntity)VehicleDetailsIntmyEntityData, assertReference, stepGroup);

			}
		}
	}
	//
	public void createQuickRenewPolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> QuickRenewPolicyEntity=testData.getQuickRenewpolicyEntity(QuickRenewPolicyEntity.class);
		for(GenericEntity QuickRenewPolicyEntityData:QuickRenewPolicyEntity){
			if(QuickRenewPolicyEntityData.getAction().equalsIgnoreCase("add") && QuickRenewPolicyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				QuickPayRenewalPolicyDetailsPage quickPayRenewalPolicyDetailsPage = new QuickPayRenewalPolicyDetailsPage(driver, "Basic Premium", DeviceOS);
				quickPayRenewalPolicyDetailsPage.fillAndSubmitQuickPayRenewalPolicyDetails((QuickRenewPolicyEntity)QuickRenewPolicyEntityData, assertReference, stepGroup);

			}
		}
	}
	public void editQuickRenewPolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> QuickRenewPolicyEntity=testData.getQuickRenewpolicyEntity(QuickRenewPolicyEntity.class);
		for(GenericEntity QuickRenewPolicyEntityData:QuickRenewPolicyEntity){
			if(QuickRenewPolicyEntityData.getAction().equalsIgnoreCase("edit") && QuickRenewPolicyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				QuickPayRenewalPolicyDetailsPage quickPayRenewalPolicyDetailsPage = new QuickPayRenewalPolicyDetailsPage(driver, "Basic Premium", DeviceOS);
				quickPayRenewalPolicyDetailsPage.fillAndSubmitQuickPayRenewalPolicyDetails((QuickRenewPolicyEntity)QuickRenewPolicyEntityData, assertReference, stepGroup);

			}
		}
	}
	public void verifyQuickRenewPolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,AppiumDriver driver,String stepGroup,String DeviceOS) throws InterruptedException{
		List<? extends GenericEntity> QuickRenewPolicyEntity=testData.getQuickRenewpolicyEntity(QuickRenewPolicyEntity.class);
		for(GenericEntity QuickRenewPolicyEntityData:QuickRenewPolicyEntity){
			if(QuickRenewPolicyEntityData.getAction().equalsIgnoreCase("verify") && QuickRenewPolicyEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				QuickPayRenewalPolicyDetailsPage quickPayRenewalPolicyDetailsPage = new QuickPayRenewalPolicyDetailsPage(driver, "Basic Premium", DeviceOS);
				quickPayRenewalPolicyDetailsPage.fillAndSubmitQuickPayRenewalPolicyDetails((QuickRenewPolicyEntity)QuickRenewPolicyEntityData, assertReference, stepGroup);

			}
		}
	}
}

