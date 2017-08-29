package SeleniumGenric;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtils extends DriverUtils {

	private static Actions actnObj;

	static {
		actnObj = new Actions(driver);
	}

	public static void clickOnWebElement(WebElement we) {
		actnObj.click(we).build().perform();

	}

	public static void contextClick() {
		actnObj.contextClick().build().perform();
	}

	public static void sendKeys(WebElement we, String inputValue) {
		actnObj.sendKeys(we, inputValue).build().perform();
	}
}
