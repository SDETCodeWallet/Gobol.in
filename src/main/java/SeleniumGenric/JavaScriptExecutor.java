package SeleniumGenric;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {

	static JavascriptExecutor je=null;
	
	public static void jeClick(WebElement we){
		
		je.executeScript("arguments[0].click();", we);
	}
	
	public static void jeInputValue(WebElement we){
		je.executeScript("document.getElementById('"+we+"').setAttribute('value', 'new value for element')");
	}
	
}
