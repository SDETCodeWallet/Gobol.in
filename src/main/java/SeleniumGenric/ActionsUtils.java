package SeleniumGenric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;

public class ActionsUtils {

	private static Actions actn;

	public static Actions getActionObj() {
		actn = new Actions(DriverUtils.driver);
		return actn;
	}

	public static void clickOnWebElement(WebElement we) {
		actn.click(we).build().perform();;
	}
	
	public static void contextClick(){
		actn.contextClick().build().perform();
	}
 
	public static void sendKeys(WebElement we, String inputValue){
		actn.sendKeys(we, inputValue).build().perform();;
	}
}
