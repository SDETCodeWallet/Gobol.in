package GobolPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import SeleniumGenric.DriverFunctionUtils;

public class PEditAccountInformtion {

	@FindBy(xpath = ".//*[@id='content']/div/div[1]/div/ul/li/a/span")
	private WebElement homeLink;

	@FindBy(xpath = ".//*[@id='form-validate']/div[3]/button[2]")
	private WebElement verifyEditAccountInfoText;

	@FindBy(xpath = ".//*[@id='firstname']")
	private WebElement fullName;

	@FindBy(xpath = ".//*[@id='email']")
	private WebElement emailId;

	@FindBy(xpath = ".//*[@id='mobiles']")
	private WebElement mobileNum;

	@FindBy(xpath = ".//*[@id='change_password']")
	private WebElement changePasswordCheckBox;

	@FindBy(xpath = ".//*[@id='form-validate']/div[1]/ul/li[3]/label")
	private WebElement changePasswordLink;

	@FindBy(xpath = ".//*[@id='current_password']")
	private WebElement currentPassword;

	@FindBy(xpath = ".//*[@id='password']")
	private WebElement newPassword;

	@FindBy(xpath = ".//*[@id='confirmation']")
	private WebElement confirmNewPassword;

	@FindBy(xpath = ".//*[@id='form-validate']/div[3]/button[1]")
	private WebElement saveButton;

	@FindBy(xpath = ".//*[@id='form-validate']/div[3]/button[2]")
	private WebElement backButton;

	public void fn_InputFullName(String userName) {
		DriverFunctionUtils.inputValue(fullName, userName);
	}

	public void fn_InputEmailAddress(String emailAdd) {
		DriverFunctionUtils.inputValue(fullName, emailAdd);
	}

	public void fn_InputMobileNum(int mobNum) {
		DriverFunctionUtils.inputNumericValue(mobileNum, mobNum);
	}

	public void fn_ClickOnSaveButton() {
		DriverFunctionUtils.clickOnWebelement(saveButton);
	}

	public void fn_ClickOnBackButton() {
		DriverFunctionUtils.clickOnWebelement(backButton);
	}

	public void fn_ClickOnChangePasswordLink(String oldPassword,String newUserPassword,String confirmUserPassword) {
		DriverFunctionUtils.clickOnWebelement(changePasswordLink);
		if (DriverFunctionUtils.isDisplayed(currentPassword) == true) {
            DriverFunctionUtils.inputValue(currentPassword, oldPassword);
            DriverFunctionUtils.inputValue(newPassword, newUserPassword);
            DriverFunctionUtils.inputValue(confirmNewPassword, newUserPassword);
		}

	}

}
