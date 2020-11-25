package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg_FunctionLibrary.Framework;

public class Navigate {
	
	WebDriver driver;
		public Navigate(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="MyWork") WebElement MyWork;
	
	@FindBy(id="Documents") WebElement Documents;
	
	@FindBy(id="DataCollection") WebElement DataFlow;
	
	@FindBy(id="ControlLog") WebElement ControlLog;
	
	@FindBy(id="ReportsFlow") WebElement Reports;
	
	@FindBy(id="TAXCAL_SCHEDULE_EVENTS") WebElement Calendar;
	
	@FindBy(id="TAXCAL_ENTITYTOPICBROWSER") WebElement Entity_Browser;
	
	@FindBy(id="TAXCAL_SETUP") WebElement Calendar_Setup;
	
	@FindBy(id="Setup") WebElement Setup;
	
	@FindBy(id="FolderWorkflows") WebElement Workflow_Browser;
	
	public void MyWork()
	{
		Framework.fnWebButton(MyWork,"My Work"); 
	}
	
	public void Documents()
	{
		Framework.fnWebButton(Documents,"Documents"); 
	}
	
	public void DataFlow()
	{
		Framework.fnWebButton(DataFlow,"DataFlow"); 
	}
	
	public void ControlLog()
	{
		Framework.fnWebButton(ControlLog,"Control Log"); 
	}
	
	public void Reports()
	{
		Framework.fnWebButton(MyWork,"My Work"); 
	}
	
	public void Calendar()
	{
		Framework.fnWebButton(Calendar,"Calendar"); 
	}
	
	public void Entity_Browser()
	{
		Framework.fnWebButton(Entity_Browser,"Entity Browser"); 
	}
	
	public void Calendar_Setup()
	{
		Framework.fnWebButton(Calendar_Setup,"Calendar Setup"); 
	}
	
	public void Setup()
	{
		Framework.fnWebButton(Setup,"Setup"); 
	}
	
	public void Workflow_Browser()
	{
		Framework.fnWebButton(Workflow_Browser,"Workflow Browser"); 
	}
	
	
}