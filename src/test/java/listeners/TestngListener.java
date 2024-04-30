package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class TestngListener implements ITestListener{
	public void onTestStart(ITestContext result) {
		System.out.println("Test execution");
	}
public void onTestSuccess(ITestContext result) {
	System.out.println("Test passed");	
	}
public void onTestFailure(ITestContext result) {
	System.out.println("Test failed");
}
public void onTestSkipped(ITestContext result) {
	System.out.println("Test skipped");
}
public void onTestFailedButWithinSuccessPrecentage(ITestContext result) {
	System.out.println("Test failed but with success");
}

public void onStart(ITestContext context) {
	
	System.out.println("Started Test execution");
}

public void onFinish(ITestContext context) {
	
	System.out.println("Finished Test execution");
}
}
