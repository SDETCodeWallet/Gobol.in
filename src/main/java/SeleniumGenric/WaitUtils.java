package SeleniumGenric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils extends DriverUtils {

	public static void threadSleep(int timeDur) {
		try {
			Thread.sleep(timeDur);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implictWait(int timeDur, TimeUnit time) {
		driver.manage().timeouts().implicitlyWait(timeDur, time);
	}
	
	public static void explictWait(long seconds,WebElement visibileElement){
		WebDriverWait wait=new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.invisibilityOf(visibileElement));
	}

}
