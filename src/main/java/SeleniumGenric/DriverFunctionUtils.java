package SeleniumGenric;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.httpclient.HttpURL;
import org.apache.commons.httpclient.URI;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpConnection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DriverFunctionUtils extends DriverUtils {

	public static void clickOnWebelement(WebElement we) {
		we.click();

	}

	/* send keys */
	public static void inputValue(WebElement inputelement, String userinput) {
		inputelement.sendKeys(userinput);
	}

	public static void inputNumericValue(WebElement inputelement, int userinput) {
		String stringvalue = Integer.toString(userinput);
		inputelement.sendKeys(stringvalue);
	}

	public static void refreshByKey(WebElement we) {
		we.sendKeys(Keys.F5);
	}

	public static void verifyTitle(String expectedtitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedtitle);
	}

	public static String getText(WebElement we) {
		String text = we.getText();
		return text;
	}

	public static void getTextOfAllLinks(List<WebElement> alllinkscollection) {

		int totallinks = alllinkscollection.size();
		System.out.println(totallinks);

		for (int i = 0; i <= totallinks - 1; i++) {
			WebElement perlink = alllinkscollection.get(i);
			String linkname = perlink.getText();
			System.out.println(linkname);
		}
	}

	public static void clickOnAllLinks(List<WebElement> alllinkscollection) {
		int totallinks = alllinkscollection.size();
		System.out.println(totallinks);
		for (int i = 0; i <= totallinks - 1; i++) {
			WebElement perlink = alllinkscollection.get(i);
			perlink.click();
			int totallinks1 = alllinkscollection.size();
		}
	}
	
	public static void checkBrokenLinks(String urlLink) throws IOException{
		URL url=new URL(urlLink);
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(3000);
		connection.connect();
		if(connection.getResponseCode()==200){
			System.out.println();
		}if(connection.getResponseCode()==connection.HTTP_NOT_FOUND){
			System.out.println();
		}
	}

	public static void getUrlOfAllLinks(List<WebElement> alllinkscollection) {
		int totallinks = alllinkscollection.size();
		System.out.println(totallinks);

		for (int i = 0; i <= totallinks - 1; i++) {
			WebElement perlink = alllinkscollection.get(i);
			System.out.println(perlink.getAttribute("href"));

		}
	}

	public static void clickonradiobutton(WebElement we) {
		boolean value = isEnabled(we);
		if (value == true) {
			we.click();
		}
	}

	public static boolean isDisplayed(WebElement we) {
		boolean status = we.isDisplayed();
		return status;
	}

	public static boolean isSelected(WebElement we) {
		boolean status = we.isSelected();
		return status;
	}

	public static boolean isEnabled(WebElement we) {
		boolean status = we.isEnabled();
		return status;
	}

	public static void tkeScrnshot(String savefileloc) {
		File sht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File path = new File(savefileloc + ".png");
		try {
			FileUtils.copyFile(sht, path);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/* Alert Methods */
	public static String txtAlert() {
		Alert txt = driver.switchTo().alert();
		String txtvalue = txt.getText();
		return txtvalue;
	}

	public static void acceptAlert() {
		Alert actlrt = driver.switchTo().alert();
		actlrt.accept();
	}

	public static void dsmssAlert() {
		Alert dsmmss = driver.switchTo().alert();
		dsmmss.dismiss();
	}

	public static void alertInput(String inputvalue) {
		Alert input = driver.switchTo().alert();
		input.sendKeys(inputvalue);
	}

	/* Wait Methods */
	public static void explictWait(int timedur, WebElement we) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timedur);
			wait.until(ExpectedConditions.visibilityOf(we));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void threadSlp(int timedur) throws InterruptedException {
		Thread.sleep(timedur);
	}

	public static void implWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}

	/* frame methods */
	public static void switchFrameId(int i) {
		try {
			driver.switchTo().frame(i);
		} catch (Exception IO) {
			System.out.println(IO);
		}
	}

	public static void switchFrameString(String St1) {
		try {
			driver.switchTo().frame(St1);
		} catch (Exception IO) {
			System.out.println(IO);
		}
	}

	public static void switchFrameString(WebElement we) {
		try {
			driver.switchTo().frame(we);

		} catch (Exception IO) {
			System.out.println(IO);
		}
	}

	public static void windowHandle(String expectedtitle, String xpath) {

		String mainwin = driver.getWindowHandle();
		Set<String> hndles = driver.getWindowHandles();
		Iterator<String> itr = hndles.iterator();
		while (itr.hasNext() == true) {
			String win = itr.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();

			if (title.equalsIgnoreCase(expectedtitle)) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath(xpath)).click();
				;

			}

			driver.switchTo().window(mainwin);
		}

	}

	/* navigation methods */
	public static void refreshPage() {
		driver.navigate().refresh();
	}

	public static void navigateUrl(String St1) {
		driver.navigate().to(St1);
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static String getValue(String propertyValue) {
		String St1 = null;
		File fPath = new File("Resources//config.properties");

		FileInputStream fileinputstream = null;

		try {
			fileinputstream = new FileInputStream(fPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fileinputstream);
			St1 = prop.getProperty(propertyValue);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return St1;

	}

	public static void selectByValue(WebElement we, String dropDwnValue) {
		Select se = new Select(we);
		se.selectByValue(dropDwnValue);
	}

	public static void selectByIndex(WebElement we, int dropDownIndexValue) {
		Select se = new Select(we);
		se.selectByIndex(dropDownIndexValue);
	}

	public static void selectByVisibleText(WebElement we, String dropDwnVisbleText) {
		Select se = new Select(we);
		se.selectByVisibleText(dropDwnVisbleText);
	}

}
