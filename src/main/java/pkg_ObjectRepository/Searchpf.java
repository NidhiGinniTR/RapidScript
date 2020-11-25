package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import pkg_FunctionLibrary.Framework;

public class Searchpf {
	WebDriver driver;
	public Searchpf(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnCancel' and @title='Clear'] | //*[@class='btn btn-mini' and @title='Clear Search Criteria']")
	public WebElement Clear;
	
	@FindBy(how = How.ID, using ="fldr_4") public WebElement Year;
	
	@FindBy(id="fldr_5") public WebElement Period;
	
	@FindBy(id="fldr_6") public WebElement TaxType;
	
	@FindBy(id="wt_name") public WebElement WF_Template;
	
	@FindBy(id="wf_14") public WebElement Entity_Name;
	
	@FindBy(id="wf_15") public WebElement Entity_Id;
	
	@FindBy(id="wf_17")	public WebElement Jurisdiction;
	
	@FindBy(id="wf_18") public WebElement Workflow_Association;
	
	@FindBy(id="fw_workflow_type") public WebElement Workflow_Type;
	
	@FindBy(id="gc_group_code_id") public WebElement Group_Codes;
	
	@FindBy(id="btnSearch") public WebElement Search;
		
	public void Year(String temp) 
	{
		Framework.fnWebList(Year, "Year", temp);
	}
	
	public void Period(String temp)
	{
		Framework.fnWebList(Period, "Period", temp);
	}
	
	public void TaxType(String temp)
	{
		Framework.fnWebList(TaxType, "Tax Type", temp);
	}
	
	public void WF_Template(String temp)
	{
		Framework.fnWebList(WF_Template, "WF_Template", temp);
	}
	
	public void Entity_Name(String temp)
	{
		Framework.fnWebEdit(Entity_Name, "Entity Name", temp);
	}
	
	public void Entity_Id(String temp)
	{
		Framework.fnWebEdit(Entity_Id, "Entity Id", temp);
	}
	
	public void Jurisdiction(String temp)
	{
		Framework.fnWebEdit(Jurisdiction, "Jurisdiction", temp);
	}
	
	public void Workflow_Association(String temp)
	{
		Framework.fnWebList(Year, "Year", temp);
	}
	
	public void Workflow_Type(String temp)
	{
		Framework.fnWebList(Workflow_Type, "Workflow Type", temp);
	}
	
	public void Group_Codes(String temp)
	{
		Framework.fnWebList(Group_Codes, "Group Codes", temp);
	}
	
	public void Clear()
	{
		Framework.fnWebButton(Clear, "Clear");
	}
	
	public void Search()
	{
		Framework.fnWebButton(Search, "Search");
	}
	

	
	
}
