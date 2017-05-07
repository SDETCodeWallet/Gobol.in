package GobolPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import SeleniumGenric.DriverFunctionUtils;

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

	public void fn_clickOnAllLeftPanelLinks() {
		DriverFunctionUtils.clickOnAllLinks(myAccountLeftPanel);

	}

}
