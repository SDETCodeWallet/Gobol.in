package BVTTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GobolPages.BaseClass;
import GobolPages.PEditAccountInformtion;
import GobolPages.PHomePage;
import GobolPages.PMyAccount;
import SeleniumGenric.DriverFunctionUtils;
import SeleniumGenric.DriverUtils;;

public class MyAccountPageTestCase extends DriverFunctionUtils {

	PHomePage homePage;

	@BeforeMethod
	public void launchApp() {
		DriverFunctionUtils.launchbrowser("Ch", DriverFunctionUtils.getValue("APPURL"));
		homePage = PageFactory.initElements(driver, PHomePage.class);
	}

	@Test
	public void changePassword() {
		homePage.fn_LoginUser("Shubham.goyal@attero.in", "654321");
		PMyAccount myAccountPage=homePage.fn_MyAccount();
		PEditAccountInformtion editAccountPage=myAccountPage.fn_ClickOnEditLink();
		editAccountPage.fn_ClickOnChangePasswordLink();
		editAccountPage.fn_ChangePassword("654321", "123456", "123456");
		editAccountPage.fn_ClickOnSaveButton();
		
		homePage.fn_LogOut();
		
	}
}
