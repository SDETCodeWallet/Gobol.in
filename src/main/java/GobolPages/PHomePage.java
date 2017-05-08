package GobolPages;

import javax.xml.xpath.XPath;
import SeleniumGenric.JavaScriptExecutor;
import SeleniumGenric.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Optional;

import SeleniumGenric.ActionsUtils;
import SeleniumGenric.DriverFunctionUtils;
import SeleniumGenric.WaitUtils;

public class PHomePage extends DriverFunctionUtils {

	@FindBy(xpath = "//img[@title='Gobol']")
	private WebElement appTitle;

	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
	private WebElement welcomeUserName;

	@FindBy(xpath = "//div[@class='header-top']/ul/li/a[@title='Track Order']")
	private WebElement trackOrder;

	@FindBy(xpath = "//div[@class='header-top']/ul/li/a[@title='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = ".//*[@id='custom_login']")
	private WebElement loginPopup;

	private String email = "email-id";

	@FindBy(xpath = ".//*[@id='email']")
	private WebElement loginPopUpUserEmailAddress;

	@FindBy(xpath = ".//*[@id='pass']")
	private WebElement loginPopUpUserPassword;

	private String password = "pass-id";

	@FindBy(xpath = ".//*[@id='send2']")
	private WebElement loginPopUpLoginSubmitButton;
	private String loginPopupSubmitButton = ".//*[@id='send2']";
	@FindBy(xpath = "//div[@class='header-top']/ul/li/a[@title='Sign Up']")
	private WebElement signUp;

	@FindBy(xpath = "//div[@class='header-top']/ul/li/a[@title='Log Out']")
	private WebElement logOut;

	@FindBy(css = "input#search")
	private WebElement searchInput;

	@FindBy(css = "button.btn[type=submit]")
	private WebElement searchBtn;

	@FindBy(css = "div.cart")
	private WebElement cartIcon;

	@FindBy(xpath = "//a[contains(text(),'Mobiles And Tablets')]")
	private WebElement mobileTablets;

	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	private WebElement laptops;

	@FindBy(xpath = "//a[contains(text(),'Accessories')]")
	private WebElement accessories;

	@FindBy(css = "li.offer1>a")
	private WebElement sales;

	@FindBy(xpath = "//a//div[text()='VIEW All']")
	private WebElement viewAllButton;

	public String fn_Applogo() {
		clickOnWebelement(appTitle);
		String titleName = getText(appTitle);
		return titleName;
	}

	public PtrackOrder fn_TrackOrder() {
		clickOnWebelement(trackOrder);
		PtrackOrder navigateToTrackOrderPage=PageFactory.initElements(driver, PtrackOrder.class);
		return navigateToTrackOrderPage;
	}

	public void fn_LoginUser(String userName, String password) {
		clickOnWebelement(myAccount);
		boolean status = isDisplayed(loginPopup);
		PMyAccount navigateToMyAccountPage = null;
		if (status = true) {
			WaitUtils.explictWait(3000, loginPopup);
			WaitUtils.threadSleep(3000);

			ActionsUtils.sendKeys(loginPopUpUserEmailAddress, userName);
			ActionsUtils.sendKeys(loginPopUpUserPassword, password);
			ActionsUtils.clickOnWebElement(loginPopUpLoginSubmitButton);
			WaitUtils.explictWait(3000, welcomeUserName);
			if (DriverFunctionUtils.isDisplayed(welcomeUserName) == true) {
				System.out.println("UserLogin Succefully");
			}
		}
	}

	public PMyAccount fn_MyAccount() {
		clickOnWebelement(myAccount);
		PMyAccount navigateToMyAccountPage = PageFactory.initElements(driver, PMyAccount.class);
		return navigateToMyAccountPage;

	}

	public void signup() {
		clickOnWebelement(signUp);
	}

	public void fn_LogOut() {
		clickOnWebelement(logOut);
	}

	public void fn_SearchBox(String userinput) {
		inputValue(searchInput, userinput);
	}

	public void fn_SearchButton() {
		clickOnWebelement(searchBtn);
	}

	public void fn_Cart() {
		clickOnWebelement(cartIcon);
	}

	public void fn_MobileTablets() {
		clickOnWebelement(mobileTablets);
	}

	public void fn_Laptops() {
		clickOnWebelement(laptops);
	}

	public void fn_Accessories() {
		clickOnWebelement(accessories);
	}

	public PSale fn_Sales() {
		clickOnWebelement(sales);
		PSale navigateToSalePage = PageFactory.initElements(driver, PSale.class);
		return navigateToSalePage;
	}

}
