package pkg_FunctionLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import pkg_Resources.ExtentManager;

public class Listener extends ExtentManager implements ITestListener {

	// public static ExtentReports extent = ExtentManager.createInstance();
	// public static ThreadLocal<ExtentTest> extentTest = new
	// ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
		// extentTest.set(test);
		//childTest=test.createNode(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// String logText = result.getName() + " Successful</b>";
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+" - test case failed", ExtentColor.RED));
		childTest.fail(MarkupHelper.createLabel(result.getMethod().getMethodName()+" is failed", ExtentColor.RED));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// String logText = result.getName() + "Skipped</b>";
		// Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// if (extent != null) {
		 //extent.removeTest(childTest);
		// }

	}

}