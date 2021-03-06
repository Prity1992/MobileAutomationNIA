package com.aqm.staf.framework.core;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import com.aqm.staf.library.databin.GenericEntity;
import com.aqm.staf.library.databin.SummaryPageEntity;

public class ScenarioTestData {
	Session sessionTestData;
	String testScenarioReference;
	String loginEntityData;
	String buyNowEntityData;
	String newIndiaTopUpMediclaimEntityData;
	String twoWheelerBuyInsuranceEntityData;
	String detailedTravelDetailsEntityData;
	String twoWheelerBasicPremiumEntityData;
	String topUpMediclaimEntityData;
	String homepageEntityData;
	String healthAddDetailEntityData;
	String personalAccidentDetEntityData;
	String privateCarEntityData;
	String premiumSummaryEntityData;
	String additionalDetailsMotorEntityData;
	String summaryPageEntityData;
	String HomeIntermediaryEntityData;
	String PremiumCalculateEntityData;
	String recentActivitiesEntityData;
	String BuyNowEntermidiaryEntityData;
	String TwoWheelerDetailsEntityData;
	String IntermediaryAdditionalDetailsEntityData;
	String PolicyHolderInformationIntermidiaryEntityData;
	String AddressFinancierDetailEntityData;
	String VehicleDetailsIntmyEntityData;
	String TWInsuredDetailsIntmyEntityData;
	String BuyNowInterEntityData;
	String CollectionIntemidiaryEntityData;
	String SummaryIntermidiarEntityData;

	String PremiumCalEntityData;
	String TWdetailsIntmyEntityData;
	String TWBasicPremiumIntmyEntityData;
	String QuickRenewPolicyEntityData;


	//Add class variable for your databin class
	List<? extends GenericEntity> Page;  
	List<? extends GenericEntity> loginEntity;
	List<? extends GenericEntity> topUpMediclaimEntity;
	List<? extends GenericEntity> twoWheelerBasicPremiumEntity;
	List<? extends GenericEntity> twoWheelerBuyInsuranceEntity;
	List<? extends GenericEntity> buyNowEntity;
	List<? extends GenericEntity> newIndiaTopUpMediclaimEntity;
	List<? extends GenericEntity> homepageEntity;
	List<? extends GenericEntity> detailedTravelDetailsEntity;
	List<? extends GenericEntity> healthAddDetailEntity;
	List<? extends GenericEntity> privateCarEntity;
	List<? extends GenericEntity> premiumSummaryEntity;
	List<? extends GenericEntity> personalAccidentDetEntity;
	List<? extends GenericEntity> summaryPageEntity;
	List<? extends GenericEntity> additionalDetailsMotorEntity;
	List<? extends GenericEntity> HomeIntermediaryEntity;
	List<? extends GenericEntity> PremiumCalculateEntity;
	List<? extends GenericEntity> RecentActivitiesEntity;
	List<? extends GenericEntity> BuyNowEntermidiaryEntity;
	List<? extends GenericEntity> TwoWheelerDetailsEntity;
	List<? extends GenericEntity> AdditionalDetailsPageForIntermidiaryEntity;
	List<? extends GenericEntity> PolicyInfoIntermidiaryEntity;
	List<? extends GenericEntity> AddressFinancierDetailEntity;
	List<? extends GenericEntity> VehicleDetailsIntmyEntity;
	List<? extends GenericEntity> TWInsuredDetailsIntmyEntity;
	List<? extends GenericEntity> BuyNowInterEntity;
	List<? extends GenericEntity> PremiumCalEntity;
	List<? extends GenericEntity> TWdetailsIntmyEntity;
	List<? extends GenericEntity> TWBasicPremiumIntmyEntity;
	List<? extends GenericEntity> SummaryIntermidiarEntity;
	List<? extends GenericEntity> CollectionIntemidiaryEntity;
	List<? extends GenericEntity> quickRenewpolicyEntity;


	/*****************************************************NIA Mobile Automation***************************************************************/
	// Add new databin class right here in constructor

	public ScenarioTestData (Session sessionTestData, String testScenarioReference) {
		this.sessionTestData = sessionTestData;
		this.testScenarioReference = testScenarioReference;	
		this.loginEntityData  =testScenarioReference;
		this.topUpMediclaimEntityData =testScenarioReference;
		this.twoWheelerBasicPremiumEntityData =testScenarioReference;
		this.twoWheelerBuyInsuranceEntityData =testScenarioReference;
		this.buyNowEntityData=testScenarioReference;
		this.newIndiaTopUpMediclaimEntityData=testScenarioReference;
		this.homepageEntityData=testScenarioReference;
		this.detailedTravelDetailsEntityData=testScenarioReference;
		this.healthAddDetailEntityData=testScenarioReference;
		this.privateCarEntityData=testScenarioReference;
		this.premiumSummaryEntityData=testScenarioReference;
		this.personalAccidentDetEntityData=testScenarioReference;
		this.additionalDetailsMotorEntityData=testScenarioReference;
		this.HomeIntermediaryEntityData=testScenarioReference;
		this.PremiumCalculateEntityData=testScenarioReference;
		this.recentActivitiesEntityData=testScenarioReference;
		this.BuyNowEntermidiaryEntityData=testScenarioReference;
		this.TwoWheelerDetailsEntityData=testScenarioReference;
		this.IntermediaryAdditionalDetailsEntityData=testScenarioReference;
		this.PolicyHolderInformationIntermidiaryEntityData=testScenarioReference;
		this.AddressFinancierDetailEntityData=testScenarioReference;
		this.VehicleDetailsIntmyEntityData=testScenarioReference;
		this.TWInsuredDetailsIntmyEntityData=testScenarioReference;
		this.CollectionIntemidiaryEntityData=testScenarioReference;
		this.SummaryIntermidiarEntityData=testScenarioReference;
		this.BuyNowInterEntityData=testScenarioReference;
		this.PremiumCalEntityData=testScenarioReference;
		this.TWdetailsIntmyEntityData=testScenarioReference;
		this.TWBasicPremiumIntmyEntityData=testScenarioReference;
		this.QuickRenewPolicyEntityData=testScenarioReference;
	}





	private List<? extends GenericEntity> getQuickRenewPolicyEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String QuickRenewPolicyEntityData) {
		List<? extends GenericEntity> QuickRenewPolicyEntity_Data = getAllRecordsForCriteria(RequiredDataClass, QuickRenewPolicyEntityData);
		return QuickRenewPolicyEntity_Data;
	}

	public List<? extends GenericEntity> getQuickRenewpolicyEntity(Class<? extends GenericEntity> obj) {
		quickRenewpolicyEntity=getTWBasicPremiumIntmyEntityRecords(obj,testScenarioReference);
		return quickRenewpolicyEntity;
	}
	public void setQuickRenewpolicyEntity(List<? extends GenericEntity> quickRenewpolicyEntity) {
		this.quickRenewpolicyEntity = quickRenewpolicyEntity;
	}
	//
	private List<? extends GenericEntity> getTWBasicPremiumIntmyEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String TWBasicPremiumIntmyEntityData) {
		List<? extends GenericEntity> TWBasicPremiumIntmyEntity_Data = getAllRecordsForCriteria(RequiredDataClass, TWBasicPremiumIntmyEntityData);
		return TWBasicPremiumIntmyEntity_Data;
	}

	public List<? extends GenericEntity> getTWBasicPremiumIntmyEntity(Class<? extends GenericEntity> obj) {
		TWBasicPremiumIntmyEntity=getTWBasicPremiumIntmyEntityRecords(obj,testScenarioReference);
		return TWBasicPremiumIntmyEntity;
	}


	public void setTWBasicPremiumIntmyEntity(List<? extends GenericEntity> tWBasicPremiumIntmyEntity) {
		this.TWBasicPremiumIntmyEntity = tWBasicPremiumIntmyEntity;
	}


	//TWdetailsIntmyEntity
	private List<? extends GenericEntity> getTWdetailsIntmyEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String TWdetailsIntmyEntityData) {
		List<? extends GenericEntity> TWdetailsIntmyEntity_Data = getAllRecordsForCriteria(RequiredDataClass, TWdetailsIntmyEntityData);
		return TWdetailsIntmyEntity_Data;
	}
	public List<? extends GenericEntity> getTWdetailsIntmyEntity(Class<? extends GenericEntity> obj) {
		TWdetailsIntmyEntity=getTWdetailsIntmyEntityRecords(obj,testScenarioReference);
		return TWdetailsIntmyEntity;
	}
	public void setTWdetailsIntmyEntity(List<? extends GenericEntity> tWdetailsIntmyEntity) {
		this.TWdetailsIntmyEntity = tWdetailsIntmyEntity;
	}
	//TWInsuredDetailsIntmyEntity

	private List<? extends GenericEntity> getTWInsuredDetailsIntmyEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String TWInsuredDetailsIntmyEntityData) {
		List<? extends GenericEntity> TWInsuredDetailsIntmyEntity_Data = getAllRecordsForCriteria(RequiredDataClass, TWInsuredDetailsIntmyEntityData);
		return TWInsuredDetailsIntmyEntity_Data;
	}
	public List<? extends GenericEntity> getTWInsuredDetailsIntmyEntity(Class<? extends GenericEntity> obj) {
		TWInsuredDetailsIntmyEntity=getTWInsuredDetailsIntmyEntityRecords(obj,testScenarioReference);
		return TWInsuredDetailsIntmyEntity;
	}
	public void setTWInsuredDetailsIntmyEntity(List<? extends GenericEntity> tWInsuredDetailsIntmyEntity) {
		this.TWInsuredDetailsIntmyEntity = tWInsuredDetailsIntmyEntity;
	}
	//Vehicle Details intmdry
	private List<? extends GenericEntity> getVehicleDetailsIntmyEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String vehicleDetailsIntmyEntityData) {
		List<? extends GenericEntity> VehicleDetailsIntmyEntity_Data = getAllRecordsForCriteria(RequiredDataClass, vehicleDetailsIntmyEntityData);
		return VehicleDetailsIntmyEntity_Data;
	}

	public List<? extends GenericEntity> getVehicleDetailsIntmyEntity(Class<? extends GenericEntity> obj) {
		VehicleDetailsIntmyEntity=getVehicleDetailsIntmyEntityRecords(obj,testScenarioReference);
		return VehicleDetailsIntmyEntity;
	}

	public void setVehicleDetailsIntmyEntity(List<? extends GenericEntity> vehicleDetailsIntmyEntity) {
		this.VehicleDetailsIntmyEntity = vehicleDetailsIntmyEntity;
	}

	/*****************************************************NIA Mobile Automation***************************************************************/
	//Make list scenario data using scenario ID
	//TwoWheelerDetails
	private List<? extends GenericEntity> getTwoWheelerDetailsEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String twoWheelerDetailsEntityData) {
		List<? extends GenericEntity> TwoWheelerDetailsEntity_Data = getAllRecordsForCriteria(RequiredDataClass, twoWheelerDetailsEntityData);
		return TwoWheelerDetailsEntity_Data;
	}
	public List<? extends GenericEntity> getTwoWheelerDetailsEntity(Class<? extends GenericEntity> obj) {
		TwoWheelerDetailsEntity=getTwoWheelerDetailsEntityRecords(obj,testScenarioReference);
		return TwoWheelerDetailsEntity;
	}
	public void setTwoWheelerDetailsEntity(List<? extends GenericEntity> twoWheelerDetailsEntity) {
		this.TwoWheelerDetailsEntity = twoWheelerDetailsEntity;
	}

	//Buy Intermediary
	private List<? extends GenericEntity> getBuyNowInterEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String buyNowInterEntityData) {
		List<? extends GenericEntity> buyNowInterEntity_Data = getAllRecordsForCriteria(RequiredDataClass, buyNowInterEntityData);
		return buyNowInterEntity_Data;
	}
	public List<? extends GenericEntity> getBuyNowInterEntity(Class<? extends GenericEntity> obj) {
		BuyNowInterEntity = getBuyNowEntityRecords(obj,testScenarioReference);
		return BuyNowInterEntity;
	}

	public void setBuyNowInterEntity(List<? extends GenericEntity> buyNowInterEntity) {
		this.BuyNowInterEntity = buyNowInterEntity;
	}

	//Premium calculate Health
	private List<? extends GenericEntity> getPremiumCalEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String premiumCalEntityData) {
		List<? extends GenericEntity> premiumCalEntity_Data = getAllRecordsForCriteria(RequiredDataClass, premiumCalEntityData);
		return premiumCalEntity_Data;
	}
	public List<? extends GenericEntity> getPremiumCalEntity(Class<? extends GenericEntity> obj) {
		PremiumCalEntity = getPremiumCalEntityRecords(obj,testScenarioReference);
		return PremiumCalEntity;
	}

	public void setPremiumCalEntity(List<? extends GenericEntity> premiumCalEntity) {
		this.PremiumCalEntity = premiumCalEntity;
	}

	//Login
	private List<? extends GenericEntity> getLoginEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String loginEntityData) {
		List<? extends GenericEntity> loginEntity_Data = getAllRecordsForCriteria(RequiredDataClass, loginEntityData);
		return loginEntity_Data;
	}

	public List<? extends GenericEntity> getLoginEntity(Class<? extends GenericEntity> obj) {
		loginEntity = getLoginEntityRecords(obj,testScenarioReference);
		return loginEntity;
	}

	public void setLoginEntity(List<? extends GenericEntity> loginEntity) {
		this.loginEntity = loginEntity;
	}

	private List<? extends GenericEntity> getPremiumCalculateEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String PremiumCalculateEntityData) {
		List<? extends GenericEntity> PremiumCalculate_Data = getAllRecordsForCriteria(RequiredDataClass, PremiumCalculateEntityData);
		return PremiumCalculate_Data;
	}
	public List<? extends GenericEntity> getPremiumCalculateEntity(Class<? extends GenericEntity> obj) {
		PremiumCalculateEntity = getPremiumCalculateEntityRecords(obj,testScenarioReference);
		return PremiumCalculateEntity;
	}

	public void setPremiumCalculateEntity(List<? extends GenericEntity> PremiumCalculateEntity) {
		this.PremiumCalculateEntity = PremiumCalculateEntity;
	}

	/*private List<? extends GenericEntity> getTopUpMediclaimEntityEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String topUpMediclaimEntityData) {
		List<? extends GenericEntity> topUpMediclaimEntity_Data = getAllRecordsForCriteria(RequiredDataClass, topUpMediclaimEntityData);
		return topUpMediclaimEntity_Data;
	}
	public String getTopUpMediclaimEntityData() {
		return topUpMediclaimEntityData;
	}
	public void setTopUpMediclaimEntityData(String topUpMediclaimEntityData) {
		this.topUpMediclaimEntityData = topUpMediclaimEntityData;
	}*/
	private List<? extends GenericEntity> getHomeIntermediaryEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String HomeIntermediaryEntityData) {
		List<? extends GenericEntity> HomeIntermediaryData = getAllRecordsForCriteria(RequiredDataClass, HomeIntermediaryEntityData);
		return HomeIntermediaryData;
	}
	public List<? extends GenericEntity> getHomeIntermediaryEntity(Class<? extends GenericEntity> obj) {
		HomeIntermediaryEntity = getHomeIntermediaryEntityRecords(obj,testScenarioReference);
		return HomeIntermediaryEntity;
	}

	public void setHomeIntermediaryEntity(List<? extends GenericEntity> HomeIntermediaryEntity) {
		this.HomeIntermediaryEntity = HomeIntermediaryEntity;
	}




	//TwoWheelerBasicPremiumEntity
	private List<? extends GenericEntity> getTwoWheelerBasicPremiumEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String twoWheelerBasicPremiumEntityData) {
		List<? extends GenericEntity> twoWheelerBasicPremiumEntity_Data = getAllRecordsForCriteria(RequiredDataClass, twoWheelerBasicPremiumEntityData);
		return twoWheelerBasicPremiumEntity_Data;
	}

	public List<? extends GenericEntity> getTwoWheelerBasicPremiumEntity(Class<? extends GenericEntity> obj) {
		twoWheelerBasicPremiumEntity = getTwoWheelerBasicPremiumEntityRecords(obj,testScenarioReference);
		return twoWheelerBasicPremiumEntity;
	}


	public void setTwoWheelerBasicPremiumEntity(List<? extends GenericEntity> twoWheelerBasicPremiumEntity) {
		this.twoWheelerBasicPremiumEntity = twoWheelerBasicPremiumEntity;
	}
	//TwoWheelerBuyInsuranceEntity
	private List<? extends GenericEntity> getTwoWheelerBuyInsuranceEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String twoWheelerBuyInsuranceEntityData) {
		List<? extends GenericEntity> twoWheelerBuyInsuranceEntity_Data = getAllRecordsForCriteria(RequiredDataClass, twoWheelerBuyInsuranceEntityData);
		return twoWheelerBuyInsuranceEntity_Data;
	}
	public List<? extends GenericEntity> getTwoWheelerBuyInsuranceEntity(Class<? extends GenericEntity> obj) {
		twoWheelerBuyInsuranceEntity = getTwoWheelerBuyInsuranceEntityRecords(obj,testScenarioReference);
		return twoWheelerBuyInsuranceEntity;
	}
	public void setTwoWheelerBuyInsuranceEntity(List<? extends GenericEntity> twoWheelerBuyInsuranceEntity) {
		this.twoWheelerBuyInsuranceEntity = twoWheelerBuyInsuranceEntity;
	}

	//For BuyNowEntity

	private List<? extends GenericEntity> getBuyNowEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String buyNowEntityData) {
		List<? extends GenericEntity> buyNowEntity_Data = getAllRecordsForCriteria(RequiredDataClass, buyNowEntityData);
		return buyNowEntity_Data;
	}
	public List<? extends GenericEntity> getBuyNowEntity(Class<? extends GenericEntity> obj) {
		buyNowEntity = getBuyNowEntityRecords(obj,testScenarioReference);
		return buyNowEntity;
	}

	public void setBuyNowEntity(List<? extends GenericEntity> buyNowEntity) {
		this.buyNowEntity = buyNowEntity;
	}

	//For NewIndiaTopUpMediclaimEntity

	private List<? extends GenericEntity> getNewIndiaTopUpMediClaimEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String newIndiaTopUpMediclaimEntityData) {
		List<? extends GenericEntity> newIndiaTopUpMediclaimEntity_Data = getAllRecordsForCriteria(RequiredDataClass, newIndiaTopUpMediclaimEntityData);
		return newIndiaTopUpMediclaimEntity_Data;
	}
	public List<? extends GenericEntity> getNewIndiaTopUpMediclaimEntity(Class<? extends GenericEntity> obj) {
		newIndiaTopUpMediclaimEntity = getNewIndiaTopUpMediClaimEntityRecords(obj,testScenarioReference);
		return newIndiaTopUpMediclaimEntity;
	}

	public void setNewIndiaTopUpMediClaimEntity(List<? extends GenericEntity> newIndiaTopUpMediclaimEntity) {
		this.newIndiaTopUpMediclaimEntity = newIndiaTopUpMediclaimEntity;
	}

	//For DetailedTravelEntity

	private List<? extends GenericEntity> getDetailedTravelEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String detailedTravelEntityData) {
		List<? extends GenericEntity> detailedTravelEntity_Data = getAllRecordsForCriteria(RequiredDataClass, detailedTravelEntityData);
		return detailedTravelEntity_Data;
	}
	public List<? extends GenericEntity> getDetailedTravelEntity(Class<? extends GenericEntity> obj) {
		detailedTravelDetailsEntity = getDetailedTravelEntityRecords(obj,testScenarioReference);
		return detailedTravelDetailsEntity;
	}

	public void setDetailedTravelEntity(List<? extends GenericEntity> detailedTravelDetailsEntity) {
		this.detailedTravelDetailsEntity = detailedTravelDetailsEntity;
	}
	//PrivateCar
	private List<? extends GenericEntity> getPrivateCarEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String privateCarEntityData) {
		List<? extends GenericEntity> privateCarEntity_Data = getAllRecordsForCriteria(RequiredDataClass, privateCarEntityData);
		return privateCarEntity_Data;
	}

	public List<? extends GenericEntity> getPrivateCarEntity(Class<? extends GenericEntity> obj) {
		privateCarEntity=getPrivateCarEntityRecords(obj,testScenarioReference);
		return privateCarEntity;
	}
	public void setPrivateCarEntity(List<? extends GenericEntity> privateCarEntity) {
		this.privateCarEntity = privateCarEntity;
	}

	//PremiumSummary



	private List<? extends GenericEntity> getPremiumSummaryEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String premiumSummaryEntityData) {
		List<? extends GenericEntity> premiumSummaryEntity_Data = getAllRecordsForCriteria(RequiredDataClass, premiumSummaryEntityData);
		return premiumSummaryEntity_Data;
	}	
	public List<? extends GenericEntity> getPremiumSummaryEntity(Class<? extends GenericEntity> obj) {
		premiumSummaryEntity=getPremiumSummaryEntityRecords(obj,testScenarioReference);
		return premiumSummaryEntity;
	}

	public void setPremiumSummaryEntity(List<? extends GenericEntity> premiumSummaryEntity) {
		this.premiumSummaryEntity = premiumSummaryEntity;
	}




	//AdditionalDetailsMotor
	private List<? extends GenericEntity> getAdditionalDetailsMotorEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String additionalDetailsMotorEntityData) {
		List<? extends GenericEntity> additionalDetailsMotorEntity_Data = getAllRecordsForCriteria(RequiredDataClass, additionalDetailsMotorEntityData);
		return additionalDetailsMotorEntity_Data;
	}
	public List<? extends GenericEntity> getAdditionalDetailsMotorEntity(Class<? extends GenericEntity> obj) {
		additionalDetailsMotorEntity=getAdditionalDetailsMotorEntityRecords(obj,testScenarioReference);
		return additionalDetailsMotorEntity;
	}

	public void setAdditionalDetailsMotorEntity(List<? extends GenericEntity> additionalDetailsMotorEntity) {
		this.additionalDetailsMotorEntity = additionalDetailsMotorEntity;
	}

	//Summary


	private List<? extends GenericEntity> getSummaryPageEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String summaryPageEntityData) {
		List<? extends GenericEntity> summaryPageEntity_Data = getAllRecordsForCriteria(RequiredDataClass, summaryPageEntityData);
		return summaryPageEntity_Data;
	}
	public List<? extends GenericEntity> getSummaryPageEntity(Class<? extends GenericEntity> obj) {
		summaryPageEntity=getSummaryPageEntityRecords(obj,testScenarioReference);
		return summaryPageEntity;
	}

	public void setSummaryPageEntity(List<? extends GenericEntity> summaryPageEntity) {
		this.summaryPageEntity = summaryPageEntity;
	}

	// HomePage
	private List<? extends GenericEntity> getHomepageEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String homepageEntityData) {
		List<? extends GenericEntity> homePageEntity_Data = getAllRecordsForCriteria(RequiredDataClass, homepageEntityData);
		return homePageEntity_Data;
	}
	public List<? extends GenericEntity> getHomepageEntity(Class<? extends GenericEntity> obj) {
		homepageEntity = getHomepageEntityRecords(obj,testScenarioReference);
		return homepageEntity;
	}
	public void setHomepageEntity(List<? extends GenericEntity> homepageEntity) {
		this.homepageEntity = homepageEntity;
	}

	//For HealthAddDetailEntity

	private List<? extends GenericEntity> getHealthAddDetailEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String healthAddDetailEntityData) {
		List<? extends GenericEntity> healthAddDetailEntity_Data = getAllRecordsForCriteria(RequiredDataClass, healthAddDetailEntityData);
		return healthAddDetailEntity_Data;
	}
	public List<? extends GenericEntity> getHealthAddDetailEntity(Class<? extends GenericEntity> obj) {
		healthAddDetailEntity = getHealthAddDetailEntityRecords(obj,testScenarioReference);
		return healthAddDetailEntity;
	}

	public void setHealthAddDetailEntity(List<? extends GenericEntity> healthAddDetailEntity) {
		this.healthAddDetailEntity = healthAddDetailEntity;
	}

	//Personal Accident Det

	private List<? extends GenericEntity> getPersonalAccidentDetEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String personalAccidentDetEntityData) {
		List<? extends GenericEntity> personalAccidentDetEntity_Data = getAllRecordsForCriteria(RequiredDataClass, personalAccidentDetEntityData);
		return personalAccidentDetEntity_Data;
	}
	public List<? extends GenericEntity> getPersonalAccidentDetEntity(Class<? extends GenericEntity> obj) {
		personalAccidentDetEntity = getPersonalAccidentDetEntityRecords(obj,testScenarioReference);
		return personalAccidentDetEntity;
	}

	public void setPersonalAccidentDetEntity(List<? extends GenericEntity> personalAccidentDetEntity) {
		this.personalAccidentDetEntity = personalAccidentDetEntity;
	}

	//RecentActivities

	private List<? extends GenericEntity> getRecentActivitiesEntityRecords(Class<? extends GenericEntity> RequiredDataClass, String recentActivitiesEntityData) {
		List<? extends GenericEntity> recentActivitiesEntity_Data = getAllRecordsForCriteria(RequiredDataClass, recentActivitiesEntityData);
		return recentActivitiesEntity_Data;
	}

	public List<? extends GenericEntity> getRecentActivitiesEntity(Class<? extends GenericEntity> obj) {
		RecentActivitiesEntity=getRecentActivitiesEntityRecords(obj,testScenarioReference);
		return RecentActivitiesEntity;
	}
	public void setRecentActivitiesEntity(List<? extends GenericEntity> recentActivitiesEntity) {
		this.RecentActivitiesEntity = recentActivitiesEntity;
	}

	//for intemediary
	public List<? extends GenericEntity> getBuyNowEntermidiaryEntityRecords(Class<? extends GenericEntity> RequiredDataClass,String buynowEntityData   ){
		List <? extends GenericEntity> BuynbowEntity=getAllRecordsForCriteria(RequiredDataClass, buynowEntityData);
		return BuynbowEntity;
	}

	public List<? extends GenericEntity> getBuyNowEntermidiaryEntity(Class<? extends GenericEntity> obj ){
		BuyNowEntermidiaryEntity=getBuyNowEntermidiaryEntityRecords(obj,testScenarioReference);
		return BuyNowEntermidiaryEntity;
	}

	public void setBuyNowEntermidiaryEntity(List<? extends GenericEntity> buyNowEntermidiaryEntity) {
		this.BuyNowEntermidiaryEntity=buyNowEntermidiaryEntity;
	}

	//add frist page 
	public List<? extends GenericEntity> getAdditionalDetailsPageForIntermidiaryEntityRecords(Class<? extends GenericEntity> RequiredDataClass,String additionalDetailsPageForIntermidiaryEntityData   ){
		List <? extends GenericEntity> additionalDetailsPageForIntermidiaryEntity=getAllRecordsForCriteria(RequiredDataClass, additionalDetailsPageForIntermidiaryEntityData);
		return additionalDetailsPageForIntermidiaryEntity;
	}

	public List<? extends GenericEntity> getAdditionalDetailsPageForIntermidiaryEntity(Class<? extends GenericEntity> obj) {
		AdditionalDetailsPageForIntermidiaryEntity=getAdditionalDetailsPageForIntermidiaryEntityRecords(obj,testScenarioReference);
		return AdditionalDetailsPageForIntermidiaryEntity;
	}
	public void setAdditionalDetailsPageForIntermidiaryEntity(List<? extends GenericEntity> additionalDetailsPageForIntermidiaryEntity) {
		this.AdditionalDetailsPageForIntermidiaryEntity = additionalDetailsPageForIntermidiaryEntity;
	}

	//add  Sceond Page page 
	public List<? extends GenericEntity> getPolicyInfoIntermidiaryEntityRecords(Class<? extends GenericEntity> RequiredDataClass,String policyHolderInformationIntermidiaryEntityData){
		List <? extends GenericEntity> policyHolderInformationIntermidiaryEntity=getAllRecordsForCriteria(RequiredDataClass, policyHolderInformationIntermidiaryEntityData);
		return policyHolderInformationIntermidiaryEntity;
	}

	public List<? extends GenericEntity> getPolicyInfoIntermidiaryEntity(Class<? extends GenericEntity> obj) {
		PolicyInfoIntermidiaryEntity=getPolicyInfoIntermidiaryEntityRecords(obj,testScenarioReference);
		return PolicyInfoIntermidiaryEntity;
	}
	public void setPolicyInfoIntermidiaryEntity(List<? extends GenericEntity> policyHolderInformationIntermidiaryEntity) {
		PolicyInfoIntermidiaryEntity = policyHolderInformationIntermidiaryEntity;
	}
	//add  third Page page 

	public List<? extends GenericEntity> getAddressFinancierDetailEntityRecords(Class<? extends GenericEntity> RequiredDataClass,String addressFinancierDetailEntityData){
		List <? extends GenericEntity> addressFinancierDetailEntity=getAllRecordsForCriteria(RequiredDataClass, addressFinancierDetailEntityData);
		return addressFinancierDetailEntity;
	}

	public List<? extends GenericEntity> getAddressFinancierDetailEntity(Class<? extends GenericEntity> obj) {
		AddressFinancierDetailEntity=getAddressFinancierDetailEntityRecords(obj,testScenarioReference);
		return AddressFinancierDetailEntity;
	}
	public void setAddressFinancierDetailEntity(List<? extends GenericEntity> addressFinancierDetailEntity) {
		AddressFinancierDetailEntity = addressFinancierDetailEntity;
	}


	public List<? extends GenericEntity> getCollectionIntemidiaryEntityRecords(Class<? extends GenericEntity> RequiredDataClass,String collectionIntemidiaryEntityData){
		List <? extends GenericEntity> collectionIntemidiaryEntity=getAllRecordsForCriteria(RequiredDataClass, collectionIntemidiaryEntityData);
		return collectionIntemidiaryEntity;
	}

	public List<? extends GenericEntity> getCollectionIntemidiaryEntity(Class<? extends GenericEntity> obj) {
		CollectionIntemidiaryEntity=getCollectionIntemidiaryEntityRecords(obj,testScenarioReference);
		return CollectionIntemidiaryEntity;
	}

	public void setCollectionIntemidiaryEntity(List<? extends GenericEntity> collectionIntemidiaryEntity) {
		CollectionIntemidiaryEntity = collectionIntemidiaryEntity;
	}



	public List<? extends GenericEntity> getSummaryIntermidiarEntityDataRecords(Class<? extends GenericEntity> RequiredDataClass,String summaryIntermidiarEntityData){
		List <? extends GenericEntity> summaryIntermidiarEntity=getAllRecordsForCriteria(RequiredDataClass, summaryIntermidiarEntityData);
		return summaryIntermidiarEntity;
	}


	public List<? extends GenericEntity> getSummaryIntermidiarEntity(Class<? extends GenericEntity> obj) {
		SummaryIntermidiarEntity=getSummaryIntermidiarEntityDataRecords(obj,testScenarioReference);
		return SummaryIntermidiarEntity;
	}

	public void setSummaryIntermidiarEntity(List<? extends GenericEntity> summaryIntermidiarEntity) {
		SummaryIntermidiarEntity = summaryIntermidiarEntity;
	}

	/*****************************************************NIA Mobile Automation***************************************************************/
	// Don't touch code below this line --------------------------------------------------------------------------------------------------
	public <T> Object getRecordForCriteria (Class classObject, String testScenarioReference) {
		Object returnObject = null;
		Transaction t=sessionTestData.beginTransaction();
		try {
			Criteria criteria = sessionTestData.createCriteria(classObject);
			criteria.add(Restrictions.eq("Reference", testScenarioReference));
			returnObject = criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return returnObject;
	}


	@SuppressWarnings("unchecked")
	public <T> List<T> getAllRecordsForCriteria (Class classObject, String testScenarioReference) {
		List<T> returnObject = null;
		Transaction t=sessionTestData.beginTransaction();
		try {
			Criteria criteria = sessionTestData.createCriteria(classObject);
			criteria.add(Restrictions.eq("TestScenario", testScenarioReference));
			criteria.addOrder(Order.asc("RowNumber"));	
			returnObject = criteria.list();

			t.commit();

		}
		catch(Exception e) {
			t.rollback();
			//e.printStackTrace();
		}
		return returnObject;
	}

	public static <T> ArrayList<T> getObjectByReference(List<T> list,String keys){
		ArrayList<T> filteredDataList=new ArrayList<T>();
		if (keys.equalsIgnoreCase("")){
			return filteredDataList;
		}
		String[] key=keys.split(",");
		for(int i=0;i<key.length;i++){
			for(T t:list){
				if(((GenericEntity)t).getReference().trim().equalsIgnoreCase(key[i].trim())){
					filteredDataList.add(t);
				}
			}
		}
		return filteredDataList;
	}

	public void updateRecordsForCriteria(Object object){
		Transaction t=sessionTestData.beginTransaction();
		try {
			sessionTestData.update(object);
			sessionTestData.persist(object);
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
			System.out.println("Entity Updation Error => "+e.getClass().getSimpleName());
		}
	}
	public List<SummaryPageEntity> getSummaryPageEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
