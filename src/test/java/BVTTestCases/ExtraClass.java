package BVTTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.DimensionsRecord;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.ClonedMethod;

import SeleniumGenric.DriverUtils;
import SeleniumGenric.WaitUtils;

public class ExtraClass extends DriverUtils {
	static int test = 15;

	public void ExtraClass() {
		System.out.println("input contructo");
	}

	public static void main(String[] args) throws IOException {

		int n1 = 2, n2 = 3;

		// int n3 ;
		// System.out.print(n1 +" "+n2 );
		// for(int i =3;i<=20;i++){
		// n3=n1+n2;
		// if (n3/2==0){
		// System.out.print(" "+ n3);
		// n1=n2;
		// n2=n3;
		// continue;
		// }else {
		// System.out.print("fail");
		// } 
		  WebDriver driver = null;
		JavascriptExecutor je=(JavascriptExecutor) driver;
		String s1 = null;
			 je.executeScript(s1);
			File fle= new File("");
			 FileInputStream finp=new FileInputStream(fle);
			HSSFWorkbook book= new HSSFWorkbook(finp);
			

	//// String locator="email";
	//// String Password="valtest";
	//// System.out.println("document.getElementById('"+locator+"').value='"+Password+"'");
	//// document.getElementById('lodsdcator').value='valtest'
	// driver=launchbrowser("Ch", "http://www.gobol.in/");
	// driver.findElement(By.xpath(".//*[@id='myaccount']/div[1]/ul/li[4]/a")).click();
	// Actions actn=new Actions(driver);
	// Thread.sleep(300);
	// WebElement
	//// we=driver.findElement(By.xpath(".//*[@id='custom_login']"));
	// WaitUtils.explictWait(300, we);
	//// WaitUtils.explictWait(3000, we);
	// actn.sendKeys(driver.findElement(By.xpath(".//*[@id='email']")),
	//// "shubham.goyal@attero.in");
	// actn.sendKeys(driver.findElement(By.xpath(".//*[@id='pass']")),
	//// "123456");
	// actn.click(driver.findElement(By.xpath(".//*[@id='send2']"))).build().perform();
	//// JavascriptExecutor je=(JavascriptExecutor)driver;
	//// je.executeScript("document.getElementById('email').setAttribtevalue='shubham'");
	//// je.executeScript("document.getElementById('pass').value='password'");
	//// WebElement
	//// we=driver.findElement(By.xpath(".//*[@id='frgt_password']/a"));
	//// actn.click(we);
	}

	public static void fac() {
		int fact = 1;
		int num = 5;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void checkPrime() {
		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pyrmaid() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(k + " ");

			}
			System.out.println();
		}
	}

	public static void logiccode() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void Fabonacci(int count) {
		int n1 = 0, n2 = 1;

		if (count > 0) {
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.print(" " + sum);
			Fabonacci(count - 1);
		}
	}

	static class tets {
	}

}
