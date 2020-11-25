package pkg_Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	public WebDriver driver;
	public static Properties prop;
	public Properties Env;
	public WebDriver InvokeDriver(String Template) throws IOException {
		Env=new Properties();
		
		FileInputStream EnvFile = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\Environment.Properties");
		prop=new Properties();
		switch (Template) {
		case "Serial":
			FileInputStream Serial = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_Serial.Properties");
			prop.load(Serial);
			break;
		case "Dynamic-Serial":
			FileInputStream DS = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_DynamicSerial.Properties");
			prop.load(DS);
			break;
		case "Dynamic-Parallel":
			FileInputStream DP = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_DynamicParallel.Properties");
			prop.load(DP);
			break;
		case "Parallel":
			FileInputStream Parallel = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_Parallel.Properties");
			prop.load(Parallel);
			break;
		}
		Env.load(EnvFile);
		String BrowserName=Env.getProperty("Browser");
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
		}
		else if(BrowserName.equals("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	        driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		return driver;
	}
	
	/*public static void Templates(String Template) throws IOException {
		prop=new Properties();
		switch (Template) {
		case "Serial":
			FileInputStream Serial = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_Serial.Properties");
			prop.load(Serial);
			break;
		case "Dynamic - Serial":
			FileInputStream DS = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_DynamicSerial.Properties");
			prop.load(DS);
			break;
		case "Dynamic - Parallel":
			FileInputStream DP = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_DynamicPararllel.Properties");
			prop.load(DP);
			break;
		case "Parallel":
			FileInputStream Parallel = new FileInputStream(".\\src\\main\\java\\pkg_Resources\\DataTable_Pararllel.Properties");
			prop.load(Parallel);
			break;
		}
	}*/
}
