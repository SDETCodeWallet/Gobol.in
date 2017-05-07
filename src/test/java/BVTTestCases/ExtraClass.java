package BVTTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumGenric.DriverUtils;
import SeleniumGenric.WaitUtils;

public class ExtraClass extends DriverUtils{

	public static void main(String[] args) throws InterruptedException{
//		String locator="email";
//		String Password="valtest";
//		System.out.println("document.getElementById('"+locator+"').value='"+Password+"'");
//		document.getElementById('lodsdcator').value='valtest'
		driver=launchbrowser("Ch", "http://www.gobol.in/");
		driver.findElement(By.xpath(".//*[@id='myaccount']/div[1]/ul/li[4]/a")).click();
		Actions actn=new Actions(driver);
		Thread.sleep(300);
		WebElement we=driver.findElement(By.xpath(".//*[@id='custom_login']"));
		WaitUtils.explictWait(300, we);
//        WaitUtils.explictWait(3000, we);
        actn.sendKeys(driver.findElement(By.xpath(".//*[@id='email']")), "shubham.goyal@attero.in");
        actn.sendKeys(driver.findElement(By.xpath(".//*[@id='pass']")), "123456");
        actn.click(driver.findElement(By.xpath(".//*[@id='send2']"))).build().perform();
//		JavascriptExecutor je=(JavascriptExecutor)driver;
//		je.executeScript("document.getElementById('email').setAttribtevalue='shubham'");
//		je.executeScript("document.getElementById('pass').value='password'");
//		WebElement we=driver.findElement(By.xpath(".//*[@id='frgt_password']/a"));
//		actn.click(we);
	}
	
}
