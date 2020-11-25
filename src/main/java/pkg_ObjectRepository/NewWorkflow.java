package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg_FunctionLibrary.Framework;

public class NewWorkflow {
	
	WebDriver driver;
		public NewWorkflow(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='ctlval_fw_workflow_template_id']") WebElement W_F_Template;
	
	@FindBy(xpath="//*[@id=ctlval_wf_14]") WebElement Entity_Name;
	
	@FindBy(xpath="//*[@id=ctlval_wf_15]") WebElement Entity_Id;
	
	@FindBy(xpath="//*[@id=ctlval_wf_17]") WebElement Jurisdiction;
	
	@FindBy(xpath="//*[@id=ctlval_fw_due_date]") WebElement DueDate;
	
	@FindBy(xpath="//*[@id=ctlval_fw_workflow_name]") WebElement Workflow_Description;
	
	@FindBy(xpath="//*[@id=ddlAssignedToGroup]") WebElement RI_Assigned_To_Group;
	
	@FindBy(xpath="//*[@id=ddlAssignedToPerson]") WebElement RI_Assigned_To_Person;
	
	@FindBy(xpath="//*[@id=pkDateDue]") WebElement RI_DueDate;
	
	@FindBy(xpath="//*[@id=txtNotifyCC]") WebElement RI_CC_Email;
	
	@FindBy(xpath="//*[@id=btnOK]") WebElement Save;
	
	public void W_F_Template(String temp)
	{
		Framework.fnWebList(W_F_Template,"W/F Template",temp); 
	}
	
	public void Entity_Name(String temp)
	{
		Framework.fnWebEdit(Entity_Name,"Entity Name",temp); 
	}
	
	public void Entity_Id(String temp)
	{
		Framework.fnWebEdit(Entity_Id,"Entity Id",temp); 
	}
	
	public void Jurisdiction(String temp)
	{
		Framework.fnWebEdit(Jurisdiction,"Jurisdiction",temp); 
	}
	
	public void DueDate(String temp)
	{
		Framework.fnWebEdit(DueDate,"Due Date",temp); 
	}
	
	public void Workflow_Description(String temp)
	{
		Framework.fnWebEdit(Workflow_Description,"Workflow Description",temp); 
	}
	
	public void RI_Assigned_To_Group(String temp)
	{
		Framework.fnWebEdit(RI_Assigned_To_Group,"Assigned To Group",temp); 
	}
	
	public void RI_Assigned_To_Person(String temp)
	{
		Framework.fnWebList(RI_Assigned_To_Person,"Assigned To Person",temp); 
	}
	
	public void RI_DueDate(String temp)
	{
		Framework.fnWebEdit(RI_DueDate,"Due Date",temp); 
	}
	
	public void RI_CC_Email(String temp)
	{
		Framework.fnWebEdit(RI_CC_Email,"Notify CC Email",temp); 
	}
	
	public void Save()
	{
		Framework.fnWebButton(Save,"Save"); 
	}
	
}

