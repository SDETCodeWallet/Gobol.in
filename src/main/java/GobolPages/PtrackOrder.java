package GobolPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import SeleniumGenric.DriverFunctionUtils;

public class PtrackOrder {
	@FindBy(css = "input#order_email")
	private WebElement orderEmail;

	@FindBy(css = "input#order_number")
	private WebElement orderNum;

	@FindBy(css = "button.button")
	private WebElement submitButton;

	@FindBy(xpath = "//table[@id='my-orders-table']/tbody/tr/td[contains(text(),'Recent Order')]")
	private WebElement recentOrderText;

	public void fn_OrderEmail(String emailId) {
		DriverFunctionUtils.inputValue(orderEmail, emailId);
	}

	public void fn_OrderNum(int OrderNum) {
		DriverFunctionUtils.inputNumericValue(orderNum, OrderNum);

	}

	public void fn_SubmitTrackOrder() {
		DriverFunctionUtils.clickOnWebelement(submitButton);

	}

}
