package BVTTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumGenric.DriverUtils;

public class ExtraClass extends DriverUtils{

	public static void main(String[] args) throws InterruptedException{
//		driver=launchbrowser("CH", "https://www.flipkart.com/");
//		driver.findElement(By.xpath("//ul[@class='_114Zhd']//li[@class='Wbt_B2']/a[@class='_1QZ6fC']/span[text()='Women']")).click();
//		Thread.sleep(3000);
//		Actions obj=new Actions(driver);
//		WebElement we=driver.findElement(By.xpath("//ul[@class='QPOmNK']//a//span[text()='Kurtas & Kurtis']"));
//		obj.click(we).build().perform();
		
		driver=launchbrowser("CH", "http://www.gobol.in/");
		driver.findElement(By.xpath(".//*[@id='myaccount']/div[1]/ul/li[4]/a")).click();
        Thread.sleep(9000);
		Actions actn=new Actions(driver);
		WebElement we=driver.findElement(By.xpath(".//*[@id='email']"));
		
		actn.sendKeys(we, "shubham");
	}
	
}
