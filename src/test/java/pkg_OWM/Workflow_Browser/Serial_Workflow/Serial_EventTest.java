package pkg_OWM.Workflow_Browser.Serial_Workflow;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pkg_Resources.ExtentManager;

public class Serial_EventTest {
	
	@BeforeSuite
	public void beforesuit() {
		ExtentManager.createInstance();
		
	}
	
	@Test
	public void EventActions() {
		System.out.println("Sample1");
		System.out.println("Sample2");
		System.out.println("Sample3");
	}
	
		
	@AfterSuite
	public void aftersuite() {
		ExtentManager.endReport();
	}
}
