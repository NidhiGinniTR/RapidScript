package pkg_FunctionLibrary;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pkg_ObjectRepository.ClickActionspf;
import pkg_ObjectRepository.LaunchApplicationpf;
import pkg_ObjectRepository.LoginPagepf;
import pkg_ObjectRepository.Navigate;
import pkg_ObjectRepository.NewFolderCreationpf;
import pkg_ObjectRepository.NewWorkflow;
import pkg_Resources.ExtentManager;

public class FunctionLibrary extends ExtentManager {
	public static Properties prop;
	public static Properties Env;

	public static void fnLogin(WebDriver driver, Properties Env) throws InterruptedException {
		childTest = test.createNode("Login Universal ID and Password. <br> << Screen Name : Login Page>>");
		LoginPagepf Lp = new LoginPagepf(driver);
		Lp.English();
		Lp.UniversalId(Env.getProperty("UniversalId"));
		Lp.Password(Env.getProperty("Password"));
		Lp.Signin();

	}

	public static void Applicationspf(WebDriver driver, String strAppName)

	{
		childTest = test.createNode("Click Application. <br> << Screen Name : Home Page>>");
		driver.switchTo().frame("header");
		LaunchApplicationpf rh = new LaunchApplicationpf(driver);
		rh.Application();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("menuPopup");

		switch (strAppName) {
		case "Calendar":
			rh.Calendar();
			break;
		case "Checkpoint Learning":
			rh.Checkpoint_Learning();
			break;
		case "Checkpoint World":
			rh.Checkpoint_World();
			break;
		case "DatatFlow":
			rh.DatatFlow();
			break;
		case "Entity Manager":
			rh.Entity_Manager();
			break;
		case "FileRoom":
			rh.FileRoom();
			break;
		case "My Work":
			rh.My_Work();
			break;
		case "WorkFlow Manager":
			rh.WorkFlow_Manager();
			break;
		}
		System.out.println(strAppName);
	}

	public static void fnOWMActionsMenu(WebDriver driver, String item) throws InterruptedException {
		if (driver.getTitle().equalsIgnoreCase("WorkFlow Manager")) {
			ClickActionspf actionsMenu = new ClickActionspf(driver);
			actionsMenu.Actions().click();
			Thread.sleep(1000);
			driver.switchTo().frame("viewIFrame");
			java.util.List<WebElement> menuitems = driver.findElements(By.className("MenuItem"));
			for (int i = 0; i < menuitems.size(); i++) {
				// String name = webelement.getText();
				if (item.equals(menuitems.get(i).getText())) {
					String menuitem = menuitems.get(i).getAttribute("id");
					driver.findElement(By.id(menuitem)).click();
					System.out.println(item + " is enabled and is selected from actions menu");
					break;
				}
			}
		}
	}

	public static void fnNewFolderCreation(WebDriver driver, Properties prop) throws InterruptedException {
		childTest = test.createNode("New Folder Creation. <br> << Screen Name : NewFolder Page>>");

		NewFolderCreationpf Nf = new NewFolderCreationpf(driver);

		Set<String> ids1 = driver.getWindowHandles();
		java.util.Iterator<String> it1 = ids1.iterator();
		String parentid = it1.next();
		String childid = it1.next();
		String childid1 = it1.next();
		driver.switchTo().window(childid1);
		Thread.sleep(1000);
		//if (driver.getTitle().equals("New Folder")) {
			Nf.Year(prop.getProperty("Year"));
			Nf.Period(prop.getProperty("Period"));
			Nf.TaxType(prop.getProperty("TaxType"));
			Nf.WFTemplate(prop.getProperty("WF_Template"));
			Nf.EntityName(prop.getProperty("Entity_Name"));
			Nf.EntityId(prop.getProperty("Entity_Id"));
			Nf.Jurisdiction(prop.getProperty("Jurisdiction"));
		//}

		Nf.Save();
	}

	public static void fnNavigateTab(WebDriver driver, String tab) {
		childTest = test.createNode("Navigation Tab. <br> << Screen Name : OWM Page>>");
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("WorkFlow Manager")) {
			driver.switchTo().frame("bottom");// Switch to respective window
			driver.switchTo().frame("content");
			driver.switchTo().frame("bottomFrame");
			WebElement cview = driver.findElement(By.id("navCurrentView"));
			Navigate tabs = new Navigate(driver);
			if (cview.getText().equalsIgnoreCase(tab)) {
				System.out.println("Navigated to: " + tab);
			} else {
				switch (tab) {
				case "WorkFlow Browser":
					tabs.Workflow_Browser();
					break;
				case "Documents":
					tabs.Documents();
					break;
				case "My Work":
					tabs.MyWork();
					break;
				case "Control Log":
					tabs.ControlLog();
					break;
				case "Reports":
					tabs.Reports();
					break;
				case "Calendar":
					tabs.Calendar();
					break;
				case "Calendar Setup":
					tabs.Calendar_Setup();
					break;
				case "Entity Browser":
					tabs.Entity_Browser();
					break;
				case "Setup":
					tabs.Setup();
					break;
				case "DataFlow":
					tabs.DataFlow();
					break;
				}
				System.out.println("Navigated to: " + tab);
			}
		}
	}

	public static void Searchpf(WebDriver driver, Properties prop) {
		childTest = test.createNode("Search Fields. <br> << Screen Name : Workflow Browser Page>>");
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.switchTo().frame("bottom");
		driver.switchTo().frame("content");
		driver.switchTo().frame("bottomFrame");

		pkg_ObjectRepository.Searchpf Sf = new pkg_ObjectRepository.Searchpf(driver);
		Sf.Clear.click();
		Sf.Year(prop.getProperty("Year"));
		Sf.Period(prop.getProperty("Period"));
		Sf.TaxType(prop.getProperty("TaxType"));
		Sf.WF_Template(prop.getProperty("WF_Template"));
		Sf.Entity_Name(prop.getProperty("Entity_Name"));
		Sf.Entity_Id(prop.getProperty("Entity_Id"));
		Sf.Jurisdiction(prop.getProperty("Jurisdiction"));
		// Sf.Workflow_Association().selectByVisibleText(prop.getProperty("Workflow_Association"));
		Sf.Workflow_Type(prop.getProperty("Workflow_Type"));
		// Sf.Group_Codes().selectByVisibleText(prop.getProperty("Group_Codes"));
		Sf.Search();
	}

	public static void fnOWMNewWorkFlow(WebDriver driver, Properties prop) {
		childTest = test.createNode("New WorkFlow. <br> << Screen Name : New Workflow Page>>");
		Set<String> ids1 = driver.getWindowHandles();
		java.util.Iterator<String> it1 = ids1.iterator();
		String parentid = it1.next();
		String childid = it1.next();
		String childid1 = it1.next();
		driver.switchTo().window(childid1);
		NewWorkflow NW = new NewWorkflow(driver);
		if (driver.getTitle().equals("New WorkfLow")) {
			// NW.TaxType(prop.getProperty("TaxType"));
			NW.W_F_Template(prop.getProperty("WF_Template"));
			NW.Entity_Name(prop.getProperty("Entity_Name"));
			NW.Entity_Id(prop.getProperty("Entity_Id"));
			NW.Jurisdiction(prop.getProperty("Jurisdiction"));

		}
		NW.Save();
	}

	public static void fnDeleteWorkflow(WebDriver driver, String actualText, String expectedText) {
		childTest = test.createNode("Delete WorkFlow. <br> << Screen Name : Workflow Browser Page>>");
		if (actualText.equals(expectedText)) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

	
	public static void fnLogOff(WebDriver driver) throws InterruptedException {
		childTest = test.createNode("Logout of the tool. <br> <<Screen Name : >>");
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("bottom");// Switch to respective window
		driver.switchTo().frame("content");
		driver.switchTo().frame("bottomFrame");
		driver.findElement(By.id("divLogoutLink")).click();
		Thread.sleep(500);
		driver.switchTo().window(parentid);
		driver.switchTo().frame("header");
		driver.findElement(By.id("btnLogOff")).click();
		driver.close();
	}

}
