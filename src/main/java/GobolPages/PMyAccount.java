package GobolPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumGenric.DriverFunctionUtils;
import SeleniumGenric.DriverUtils;

public class PMyAccount {

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li[contains(text(),'Account Dashboard')]")
	private WebElement accountDashBoard;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'Account Information')]")
	private WebElement accountInformation;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'Address Book')]")
	private WebElement addressBook;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'My Orders')]")
	private WebElement myOrders;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'Billing Agreements')]")
	private WebElement billingAgreements;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'Recurring Profiles')]")
	private WebElement recurringProfiles;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'My Product Reviews')]")
	private WebElement myProductReviews;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'My Wishlist')]")
	private WebElement myWishList;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'My Applications')]")
	private WebElement myApplications;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'Newsletter Subscriptions')]")
	private WebElement newsLetterSubscriptions;

	@FindBy(xpath = "//div[@id='dashbord_navigation']/ul/ul/li/a[contains(text(),'Affiliates')]")
	private WebElement affiliates;

	@FindBy(xpath = "//div[@class='leftPanel1']/div[@id='dashbord_navigation']/ul/ul/li/a")
	private List<WebElement> myAccountLeftPanel;

	@FindBy(xpath = ".//*[@id='search_main_content1']/div[4]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/a")
	private WebElement customerEditLink;

	@FindBy(xpath = ".//*[@id='search_main_content1']/div[4]/div[2]/div/div[1]/div[2]/div[1]/p/strong[contains(text(),'Hello')]")
	private WebElement verifyNameOnAccountDashBoardPage;

	@FindBy(xpath = "//div[@class='ai-first-row']/div[@class='ai-col-right']/div[@class='ai-head']/div[@class='edit']/a[text()='Edit']")
	private WebElement editNewsLetterLink;

	@FindBy(xpath = "//div[@class='ai-col-left']//div[@class='ai-cont']/a[contains(text(),'Change Password')]")
	private WebElement changePasswordLink;

	@FindBy(xpath = "//div[@class='ai-second-row']/div[@class='ai-head']/div[@class='edit']/a[contains(text(),'Manage Address')]")
	private WebElement clickOnManageAddressLink;

	@FindBy(xpath = ".//*[@id='topcontrol']/div")
	private WebElement scrollBar;

	public void fn_clickOnAllLeftPanelLinks() {
		DriverFunctionUtils.clickOnAllLinks(myAccountLeftPanel);

	}
	
	public void fn_getAllLeftPanelLinksText(){
		DriverFunctionUtils.getTextOfAllLinks(myAccountLeftPanel);
	}

	public String fn_getUserDashBoardName() {
		String value = DriverFunctionUtils.getText(verifyNameOnAccountDashBoardPage);
		return value;
	}

	public PEditAccountInformtion fn_ClickOnEditLink() {
		DriverFunctionUtils.clickOnWebelement(customerEditLink);
		PEditAccountInformtion navigateToEditInformationPage = PageFactory.initElements(DriverUtils.driver,
				PEditAccountInformtion.class);
		return navigateToEditInformationPage;

	}

	public void fn_ClickOnChangePasswordLink() {
		DriverFunctionUtils.clickOnWebelement(changePasswordLink);

	}

	public void fn_ClickOnManageAddressLink() {
		DriverFunctionUtils.clickOnWebelement(clickOnManageAddressLink);

	}

	public void fn_ClickOnEditNewsLetterLink() {
		DriverFunctionUtils.clickOnWebelement(customerEditLink);

	}

	public void fn_ClickOnScrollBar() {
		if (DriverFunctionUtils.isDisplayed(scrollBar) == true) {
			DriverFunctionUtils.clickOnWebelement(scrollBar);
		} else {
			System.out.println("Scroll Bar is not Displayed.");
		}
	}

}
