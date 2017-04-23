package SeleniumGenric;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverUtils {
	
	public static WebDriver driver=null;

	public static WebDriver launchbrowser(String Browsername, String url) {
		if (Browsername.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriverfirefox.exe");
			driver = new FirefoxDriver();
		} else if (Browsername.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equalsIgnoreCase("iE")) {
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (Browsername.equalsIgnoreCase("ed")) {
			System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();

		}
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(url);
		return driver;

	}

	public static WebDriver launchbrowserforgrid(String Gridbrowsername, Platform pl, String browsername) {

		System.setProperty("webdriver.gecko.driver",
				"C:////Users////Deepak////workspace////Training_PoaDevEnv////Software////geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName(Gridbrowsername);
		cap.setPlatform(pl);
		driver = new FirefoxDriver(cap);
		driver.get(browsername);
		return driver;

	}

	public static void closeDriver() {
		driver.close();
	}

	public static void quitDriver() {
		driver.quit();
	}

	public static void clearCookies(WebDriver driver) throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
	}

	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void deleteCookiebyName(String cookieName) {
		driver.manage().deleteCookieNamed(cookieName);
	}

	public static void remoteWebDriver(String browserName, String ExePath, String remoteMachineUrl, String appUrl) {
		DesiredCapabilities capObj = null;
		WebDriver remoteWebDriver = null;
		if (browserName.equalsIgnoreCase("ff")) {
			try {
				capObj = DesiredCapabilities.firefox();
				capObj.setCapability(FirefoxDriver.BINARY, new File(ExePath).getAbsolutePath());
				remoteWebDriver = new RemoteWebDriver(new URL(remoteMachineUrl), capObj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (browserName.equalsIgnoreCase("ch")) {
			try {
				ChromeOptions chrmOptn = new ChromeOptions();
				chrmOptn.setBinary(new File(ExePath));
				capObj = DesiredCapabilities.chrome();
				capObj.setCapability(ChromeOptions.CAPABILITY, chrmOptn);
				remoteWebDriver = new RemoteWebDriver(new URL(remoteMachineUrl), capObj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.get(appUrl);
	}
}
