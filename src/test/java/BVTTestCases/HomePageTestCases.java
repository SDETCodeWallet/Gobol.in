package BVTTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GobolPages.PHomePage;
import GobolPages.PMyAccount;
import GobolPages.PtrackOrder;
import SeleniumGenric.DriverFunctionUtils;

public class HomePageTestCases extends DriverFunctionUtils {

	PHomePage homePage;

	@BeforeMethod
	public void launchApp() {
		launchbrowser(getValue("cBrowserValue"), getValue("APPURL"));
		homePage = PageFactory.initElements(driver, PHomePage.class);
	}

	@Test
	public void loginUser() {
		homePage.fn_LoginUser(getValue("USERNAME"), getValue("PASSWORD"));
	}

	@Test(enabled=false)
	public void trackOrder() {
		PtrackOrder TrackOrderPage = homePage.fn_TrackOrder();
		TrackOrderPage.fn_OrderEmail("shubham.goyal@attero.in");
		TrackOrderPage.fn_OrderNum(2565980);
		TrackOrderPage.fn_SubmitTrackOrder();
		Assert.assertEquals("", driver.getTitle());

	}
	
	@Test
	public void myAccountLinks(){
		loginUser();
		PMyAccount accountPage=homePage.fn_MyAccount();
		accountPage.fn_clickOnAllLeftPanelLinks();
	}


}
