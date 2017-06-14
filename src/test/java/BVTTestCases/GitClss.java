package BVTTestCases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import SeleniumGenric.JavaScriptExecutor;

public class GitClss {

	public static void main(String[] args) {
		factorial();
		palidrome();

	}

	public static void palidrome() {
		int r, sum = 0, temp;
		String test = "shubham";
		int t = test.length();
		int i;
		for (i = t - 1; i >= 0; i--) {
			char value = test.charAt(i);
			System.out.print(value);
		}

	}

	public static void factorial() {
		int i, fact = 1;

		int number = 5;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + number + " is:" + fact);
	}

	public static void fabanocciseries() {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.println(n1 + "" + n2);

	}

}
