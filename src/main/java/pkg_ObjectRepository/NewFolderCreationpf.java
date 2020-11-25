package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg_FunctionLibrary.Framework;

public class NewFolderCreationpf {

	WebDriver driver;

	public NewFolderCreationpf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "spActions")
	WebElement Actions;

	public void Actions() {
		Framework.fnWebButton(Actions, "Actions");
	}

	@FindBy(id = "ctlval_fldr_4")
	WebElement Year;

	public void Year(String temp) {
		if(Year.equals(driver.switchTo().activeElement())) {
		Framework.fnWebList(Year, "Year", temp);
		}else {
			 System.out.println("Element is not focused");
		}
	}

	@FindBy(id = "ctlval_fldr_5")
	WebElement Period;

	public void Period(String temp) {
		Framework.fnWebList(Period, "Period", temp);
	}

	@FindBy(id = "ctlval_fw_workflow_template_id")
	WebElement W_F_Template;

	public void WFTemplate(String temp) {
		Framework.fnWebList(W_F_Template, "W_F_Template", temp);
	}

	@FindBy(id = "ctlval_fldr_6")
	WebElement TaxType;

	public void TaxType(String temp) {
		Framework.fnWebList(TaxType, "Tax Type", temp);
	}

	@FindBy(id = "ctlval_fw_workflow_name")
	WebElement Workflow_Description;

	public void WorkflowDescription(String temp) {
		Framework.fnWebEdit(Workflow_Description, "Workflow Description", temp);
	}

	@FindBy(name = "ctlval_wf_14")
	WebElement EntityName;

	public void EntityName(String temp) {
		Framework.fnWebEdit(EntityName, "Entity Name", temp);
	}

	@FindBy(name = "ctlval_wf_15")
	WebElement EntityId;

	public void EntityId(String temp) {
		Framework.fnWebEdit(EntityId, "Entity Id", temp);
	}

	@FindBy(name = "ctlval_wf_17")
	WebElement Jurisdiction;

	public void Jurisdiction(String temp) {
		Framework.fnWebEdit(Jurisdiction, "Jurisdiction", temp);
	}

	@FindBy(name = "ctlval_fw_due_date")
	WebElement DueDate;

	public void DueDate(String temp) {
		Framework.fnWebEdit(DueDate, "Due Date", temp);
	}

	@FindBy(id = "btnOK")
	WebElement Save;

	public void Save() {
		Framework.fnWebButton(Save, "Save");
	}

}