package BVTTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GobolPages.PHomePage;
import GobolPages.PHomePage.ApplicationHeaderOption;
import SeleniumGenric.DriverFunctionUtils;

 public class HomePageTestCases extends DriverFunctionUtils {
	
	 public static void  main(String[] args) {
		launchbrowser(getValue("cBrowserValue"), getValue("APPURL"));
		PHomePage homePage=PageFactory.initElements(driver, PHomePage.class);
		ApplicationHeaderOption headerOption=homePage.new ApplicationHeaderOption();
		headerOption.fn_MyAccount("shubham.goyal@attero.in","123456");
		WebElement we=driver.findElement(By.xpath("//div[@id='custom_login']/div/div[@id='feedbacks-contents1']/div[@class='pup_container']/div[@class='pup_tab_container']/div/div/div[@class='pup_up_left']/div/form/div/input[@id='email']"));
	    we.sendKeys("testvalue");
		
	}
	@Test
	public void tc(){
		System.out.println("runner");
	}

}
