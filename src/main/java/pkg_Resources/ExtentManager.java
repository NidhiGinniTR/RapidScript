package pkg_Resources;

import java.io.File;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest childTest;

	@BeforeClass
	public static ExtentReports createInstance() {
		String fileName = getReportName();
		String directory = System.getProperty("user.dir") + "/reports/";
		new File(directory).mkdirs();
		String path = directory + fileName;
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
		// htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Reports");
		htmlReporter.config().setReportName("Automation Test Result");
		htmlReporter.config().setTheme(Theme.STANDARD);
		System.out.println(System.getenv().get("COMPUTERNAME"));
		extent = new ExtentReports();
		extent.setSystemInfo("Organization", "TR");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);

		return extent;
	}

	public static String getReportName() {
		Date d = new Date();
		String fileName = "Automation Report" + "-" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
		return fileName;
	}

	@AfterClass
	public static void endReport() {
		extent.flush();
	}
}
