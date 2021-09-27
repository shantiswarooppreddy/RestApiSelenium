package Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener, ISuiteListener, IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("The following method has been invoked " + method.toString());
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("The following method is done " + method.toString());
		
	}

	public void onStart(ISuite suite) {

       System.out.println("The following suite has been invoked " + suite.getName());
		
	}

	public void onFinish(ISuite suite) {
		
		System.out.println("The following suite has been executed " + suite.getName());
		
	}

	public void onTestStart(ITestResult result) {
		
		System.out.println("A specific test has been started " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {

       System.out.println("A specific test has been completed successfully " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("This particular test has been executed and failed " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("This particular test has been skipped " + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("The following passed with following percentage " + result.getName());
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("The following test context has started " + context.getName());
		
	}

	public void onFinish(ITestContext context) {

       System.out.println("The following test context has been finished " + context.getName());
		
	}

}
