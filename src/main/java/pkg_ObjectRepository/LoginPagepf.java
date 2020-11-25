package pkg_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pkg_FunctionLibrary.Framework;



public class LoginPagepf {

   WebDriver driver;

	public LoginPagepf(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="en") WebElement English;
	
	@FindBy(id="_txtLogin") WebElement UniversalId;
	
	@FindBy(id="_txtPassword") WebElement Password;
	
	@FindBy(id="btnSignIn") WebElement Signin;
	
	public void English()
	{
		Framework.fnWebButton(English,"English");
	}
	
	public void UniversalId(String temp) throws InterruptedException
	{
		UniversalId.clear();
		Framework.fnWebEdit(UniversalId,"UniversalID",temp);
	}
	

	public void Password(String temp) throws InterruptedException
	{
		Framework.fnWebEdit(Password,"Password",temp);
	}
	
	public void Signin()
	{
		Framework.fnWebButton(Signin,"Signin");
	}
	
	}