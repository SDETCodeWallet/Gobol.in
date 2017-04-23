package GobolPages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumGenric.DriverFunctionUtils;

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
	@FindBy(xpath = ".//*[@id='email']")
	private WebElement loginPopUpUserEmailAddress;
	@FindBy(xpath = ".//*[@id='pass']")
	private WebElement loginPopUpUserPassword;
	@FindBy(xpath = ".//*[@id='send2']")
	private WebElement loginPopUpLoginSubmitButton;
	@FindBy(xpath = "//div[@class='header-top']/ul/li/a[@title='Sign Up']")
	private WebElement signUp;

	@FindBy(xpath = "//div[@class='header-top']/ul/li[5]/a[@title='Log Out']")
	private WebElement logOut;

	@FindBy(css = "input#search")
	private WebElement searchInput;

	@FindBy(css = "button.btn[type=submit]")
	private WebElement searchBtn;

	@FindBy(css = "div.cart")
	private WebElement cartIcon;

	public class ApplicationHeaderOption {
		public String fn_Applogo() {
			clickOnWebelement(appTitle);
			String titleName = getText(appTitle);
			return titleName;
		}

		public void fn_TrackOrder() {
			clickOnWebelement(trackOrder);
		}

		public PMyAccount fn_MyAccount(String userEmailAdd, String userPassword) {
			clickOnWebelement(myAccount);
			boolean status = isDisplayed(loginPopup);
			PMyAccount navigateToMyAccountPage = null;
			if (status = true) {
				System.out.println("inside popup");
				explictWait(6000, loginPopup);
//				inputValue(loginPopUpUserEmailAddress, userEmailAdd);
//				inputValue(loginPopUpUserPassword, userPassword);
//				clickOnWebelement(loginPopUpLoginSubmitButton);
			} else if (status = false) {
				navigateToMyAccountPage = PageFactory.initElements(driver, PMyAccount.class);
			}
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

	}

	class listingOptions {
		@FindBy(xpath = "//a[contains(text(),'Mobiles And Tablets')]")
		private WebElement mobileTablets;

		@FindBy(xpath = "//a[contains(text(),'Laptops')]")
		private WebElement laptops;

		@FindBy(xpath = "//a[contains(text(),'Accessories')]")
		private WebElement accessories;

		@FindBy(css = "li.offer1>a")
		private WebElement sales;

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

	class bestSellingMobilesTablets {

		@FindBy(xpath = "//a//div[text()='VIEW All']")
		private WebElement viewAllButton;

	}

	class newArrivals {

	}

	class clearanceSale {

	}

	class brandAssociatedWithUS {

	}

}
