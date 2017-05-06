package BVTTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GobolPages.PHomePage;
import SeleniumGenric.DriverFunctionUtils;

public class HomePageTestCases extends DriverFunctionUtils {

	public static void main(String[] args) {

		launchbrowser(getValue("cBrowserValue"), getValue("APPURL"));
		PHomePage homePage = PageFactory.initElements(driver, PHomePage.class);
		homePage.fn_MyAccount("shubham.goyal@attero.in", "123456");
		JavascriptExecutor je = null;
		je.executeScript("document.getElementById('email').setAttribute('value', 'shubham.goyal1234@attero.in')");
		
	}

	@Test
	public void tc() {
		System.out.println("runner");
	}
	
	

}
