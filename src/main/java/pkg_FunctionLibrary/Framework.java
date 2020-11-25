package pkg_FunctionLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import pkg_Resources.ExtentManager;

public class Framework extends ExtentManager {

	public static WebDriver driver;

	public Framework(WebDriver driver) {
		this.driver = driver;
	}

	public static void fnWebEdit(WebElement element, String Label, String Text) {

		if (element.isDisplayed()) {
			element.sendKeys(Text);
			childTest.log(Status.PASS, "Enter " + Label + "=" + Text);

		} else {
			childTest.log(Status.FAIL, "Unable to enter the " + Label + "=" + Text);
		}
	}

	public static void fnWebButton(WebElement element, String Label) {

		if (element.isDisplayed()) {
			element.click();
			childTest.log(Status.PASS, "Click " + Label);
			// Reporter.log("Successfully clicked the value " +element, true);
		} else {
			childTest.log(Status.FAIL, "Unable to click " + Label);
			// Reporter.log("Value not entered" + element, false);

		}
	}

	public static void fnWebList(WebElement element, String Label, String Text) {

		if (element.isDisplayed()) {
			Select ListValue = new Select(element);
			ListValue.selectByVisibleText(Text);
			childTest.log(Status.PASS, "Select " + Label + "=" + Text);
		} else {
			childTest.log(Status.FAIL, "Unable to select " + Label + "=" + Text);
		}
	}

	public static void fnWebTable(WebDriver driver,WebElement oParent, String operation) {
		Actions action = new Actions(driver);
		switch (operation) {
		case "Click":
			action.moveToElement(oParent).click().build().perform();
			break;
		case "DoubleClick":
			action.moveToElement(oParent).doubleClick().build().perform();
			break;
		}
	}
}
