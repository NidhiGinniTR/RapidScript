package pkg_OWM.Workflow_Browser.Serial_Workflow;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pkg_FunctionLibrary.Framework;
import pkg_FunctionLibrary.FunctionLibrary;
import pkg_Resources.Browsers;
import pkg_Resources.ExtentManager;

public class Serial_ActionsTest extends Browsers {

	@BeforeSuite
	public void beforesuit() {
		ExtentManager.createInstance();

	}

	@Test
	public void SerialTemplate() throws IOException, InterruptedException {
		driver = InvokeDriver("Serial");
		driver.get(Env.getProperty("URL"));
		FunctionLibrary.fnLogin(driver, Env);
		FunctionLibrary.Applicationspf(driver, "Calendar");
		FunctionLibrary.fnNavigateTab(driver, "WorkFlow Browser");
		Thread.sleep(1000);
		FunctionLibrary.fnOWMActionsMenu(driver, "New Folder");
		Thread.sleep(1000);
		FunctionLibrary.fnNewFolderCreation(driver, prop);
		FunctionLibrary.Searchpf(driver, prop);
		Thread.sleep(2000);
		driver.switchTo().frame("viewIFrame");
		Framework.fnWebTable(driver, driver.findElement(By.xpath("//*[@id='grdWFfolders_dom']/table/tbody/tr[3]/td")),
				"Click");
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("bottom");// Switch to respective window
		driver.switchTo().frame("content");
		driver.switchTo().frame("bottomFrame");
		FunctionLibrary.fnOWMActionsMenu(driver, "Delete WorkFlow(s)");
		FunctionLibrary.fnDeleteWorkflow(driver, driver.switchTo().alert().getText(),
				"Do you want to delete these workflows?");
	}

	@AfterClass
	void closeBrowser() throws InterruptedException {
		FunctionLibrary.fnLogOff(driver);
	}

	@AfterSuite
	public void aftersuite() {
		ExtentManager.endReport();
	}
}
