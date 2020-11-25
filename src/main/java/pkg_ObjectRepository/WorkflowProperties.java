package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg_FunctionLibrary.Framework;

public class WorkflowProperties {

	WebDriver driver;

	public WorkflowProperties(WebDriver driver)  {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//*[@id='ctlval_fw_workflow_template_id']")
	WebElement W_F_Template;

	@FindBy(xpath = "//*[@id=ctlval_wf_14]")
	WebElement Entity_Name;

	@FindBy(xpath = "//*[@id=ctlval_wf_15]")
	WebElement Entity_Id;

	@FindBy(xpath = "//*[@id=ctlval_wf_17]")
	WebElement Jurisdiction;

	@FindBy(xpath = "//*[@id=ctlval_fw_due_date]")
	WebElement DueDate;

	@FindBy(xpath = "//*[@id=ctlval_fw_workflow_name]")
	WebElement Workflow_Description;

	@FindBy(xpath = "//*[@id=ddlAssignedToGroup")
	WebElement RI_Assigned_To_Group;

	@FindBy(xpath = "//*[@id=ddlAssignedToPerson")
	WebElement RI_Assigned_To_Person;

	@FindBy(xpath = "//*[@id=pkDateDue")
	WebElement RI_DueDate;

	@FindBy(xpath = "//*[@id=txtNotifyCC")
	WebElement RI_CC_Email;

	public void W_F_Template() {
		Framework.fnWebButton(W_F_Template, "W/F Template");
	}

	public void Entity_Name() {
		Framework.fnWebButton(Entity_Name, "Entity Name");
	}

	public void Entity_Id() {
		Framework.fnWebButton(Entity_Id, "Entity Id");
	}

	public void Jurisdiction() {
		Framework.fnWebButton(Jurisdiction, "Jurisdiction");
	}

	public void DueDate() {
		Framework.fnWebButton(DueDate, "Due Date");
	}

	public void Workflow_Description() {
		Framework.fnWebButton(Workflow_Description, "Workflow Description");
	}

	public void RI_Assigned_To_Group() {
		Framework.fnWebButton(RI_Assigned_To_Group, "Assigned To Group");
	}

	public void RI_Assigned_To_Person() {
		Framework.fnWebButton(RI_Assigned_To_Person, "Assigned To Person");
	}

	public void RI_DueDate() {
		Framework.fnWebButton(RI_DueDate, "Due Date");
	}

	public void RI_CC_Email() {
		Framework.fnWebButton(RI_CC_Email, "Notify CC Email");
	}

}
