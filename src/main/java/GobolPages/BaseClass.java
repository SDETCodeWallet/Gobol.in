package GobolPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumGenric.*;

public class BaseClass {
	protected static WebDriver driver = null;

	public static WebDriver getDriverObject() {
		driver = DriverFunctionUtils.driver;
		return driver;
	}

	public static PHomePage getObjectOfHomePage() {
		PHomePage homePageObj = PageFactory.initElements(driver, PHomePage.class);
		return homePageObj;
	}
	
	public static PEditAccountInformtion getObjectOfEditInformationPage(){
		PEditAccountInformtion editInfoPageObj=PageFactory.initElements(driver, PEditAccountInformtion.class);
	    return editInfoPageObj;
	}
	
	public static PLaptopAccessories getObjectOfLaptopAccesPage(){
		PLaptopAccessories laptopAccesPageObj=PageFactory.initElements(driver, PLaptopAccessories.class);
		return laptopAccesPageObj;
	}
	
	public static PMobileAccessories getObjectOfMobileAccesPage(){
		PMobileAccessories mobileAccesPageObj=PageFactory.initElements(driver, PMobileAccessories.class);
		return mobileAccesPageObj;
	}
	
	public static PMobilesPhonesListing getObjectOfMobilePhonesListPage(){
		PMobilesPhonesListing mobilesPhonesListingPageObj=PageFactory.initElements(driver, PMobilesPhonesListing.class);
		return mobilesPhonesListingPageObj;
	}
	
	public static PMyAccount getObjectOfMyAccountPage(){
		PMyAccount myAccountPageObj=PageFactory.initElements(driver, PMyAccount.class);
		return myAccountPageObj;
	}
	
	public static PNetworkComponents getObjectOfNetworkComponentPage(){
		PNetworkComponents networkCompPageObj=PageFactory.initElements(driver, PNetworkComponents.class);
		return networkCompPageObj;
	}
	
	public static PSale getObjectOfSalePage(){
		PSale salePageObj=PageFactory.initElements(driver, PSale.class);
		return salePageObj;
	}
	
	public static PSignUp getObjectOfSignUpPage(){
		PSignUp signUpPageObj=PageFactory.initElements(driver, PSignUp.class);
		return signUpPageObj;
	}
	
	public static PTabletsListing getObjectOfTabletsListingPage(){
		PTabletsListing tabletListingPageObj=PageFactory.initElements(driver, PTabletsListing.class);
		return tabletListingPageObj;
	}
	
	public static PtrackOrder getObjectOfTrackOrderPage(){
		PtrackOrder trackOrderPageObj=PageFactory.initElements(driver, PtrackOrder.class);
		return trackOrderPageObj;
	}
	
	
}
