package fileutils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Generals.Baseclass;

public class MyListeners extends Baseclass implements ITestListener{
	//ExtentTest test=adp.extent.createTest("test1", "passed");
	static int passcount = 0, failcount = 0;

	public void onTestStart(ITestResult result) {
		//String name = result.getName();
		String methodName=result.getMethod().getMethodName();
		adp.test.log(Status.INFO, "Test started -->"+methodName);	
	}

	public void onTestSuccess(ITestResult result) {
		//String name = result.getName();
		String methodName=result.getMethod().getMethodName();
		//test.pass("Test passed -->"+methodName);	
	}

	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
	//	test.fail("Test failed -->"+methodName);
	}

	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
	//test.skip( "Test started -->"+methodName);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
	
	}

}
