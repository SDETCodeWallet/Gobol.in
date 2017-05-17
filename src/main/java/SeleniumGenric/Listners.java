package SeleniumGenric;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	public void onFinish(ITestContext arg0) {

	}

	public void onStart(ITestContext arg0) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :" + Result.getName());

	}

	public void onTestSkipped(ITestResult Result) {

		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	public void onTestStart(ITestResult Result) {

		System.out.println(Result.getName() + " test case started");
	}

	public void onTestSuccess(ITestResult Result) {

		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

}
