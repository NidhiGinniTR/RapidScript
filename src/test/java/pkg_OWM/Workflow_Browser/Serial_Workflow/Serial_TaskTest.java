package pkg_OWM.Workflow_Browser.Serial_Workflow;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pkg_Resources.ExtentManager;

public class Serial_TaskTest {
	
	@BeforeSuite
	public void beforesuit() {
		ExtentManager.createInstance();
		
	}
	
	@Test
	public void TaskActions() {
		System.out.println("Event1");
		System.out.println("Event2");
		System.out.println("Event3");
	}
	
		
	@AfterSuite
	public void aftersuite() {
		ExtentManager.endReport();
	}
}
