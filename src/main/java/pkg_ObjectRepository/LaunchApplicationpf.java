package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg_FunctionLibrary.Framework;

public class LaunchApplicationpf {
	
	 	WebDriver driver;
		public LaunchApplicationpf(WebDriver driver)  {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="btnApps") WebElement Application;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[1]") public WebElement Calendar;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[2]") public WebElement Checkpoint_Learning;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[3]") public WebElement Checkpoint_World;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[4]") public WebElement DatatFlow;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[5]") public WebElement Entity_Manager;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[6]") public WebElement FileRoom;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[7]") public WebElement My_Work;
		
		@FindBy(xpath="//*[@id='appsMenu']/table/tbody/tr[8]") public WebElement WorkFlow_Manager;
		
		
		public void Application()
		{
			Framework.fnWebButton(Application,"Application");
		}
		
		public void Calendar()
		{
			Framework.fnWebButton(Calendar,"Calendar");
		}
		
		public void Checkpoint_Learning()
		{
			Framework.fnWebButton(Checkpoint_Learning,"Checkpoint Learning");
		}
		
		public void Checkpoint_World()
		{
			Framework.fnWebButton(Checkpoint_World,"Checkpoint World");
		}
		
		public void DatatFlow()
		{
			Framework.fnWebButton(DatatFlow,"Datat Flow"); 
		}
		
		public void Entity_Manager()
		{
			Framework.fnWebButton(Entity_Manager,"Entity Manager"); 
		}
		
		public void FileRoom()
		{
			Framework.fnWebButton(FileRoom,"FileRoom"); 
		}
		
		public void My_Work()
		{
			Framework.fnWebButton(My_Work,"My Work"); 
		}
		
		
		public void WorkFlow_Manager()
		{
			Framework.fnWebButton(WorkFlow_Manager,"WorkFlow Manager"); 
		}
		

}
