package SeleniumGenric;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import SeleniumGenric.DriverUtils;

public class JavaScriptExecutor {

	static JavascriptExecutor je = null;

	// public static void getJavaScriptExeObj(WebDriver driver){
	// je=(JavascriptExecutor)driver;
	// }

	public static void clickByJS(WebElement we) {
		je.executeScript("arguments[0].click();", we);
	}

	public static void inputValueByJS(String we, String inputValue) {
		String[] splitValue = we.split("-");
		String locatorValue = splitValue[0];
		String locatorType = splitValue[1];
		je = (JavascriptExecutor) DriverUtils.driver;
		if (locatorType.equalsIgnoreCase("id")) {
			System.out.println(locatorValue);
			je.executeScript(
					"document.getElementById('" + locatorValue + "').setAttribute('value', '" + inputValue + "')");
		} else if (locatorType.equalsIgnoreCase("CN")) {
			je.executeScript(
					"document.getElementById('" + locatorValue + "').setAttribute('value', '" + inputValue + "')");

		}
	}

}
