package genericLibrary;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.google.common.annotations.VisibleForTesting;

import pom_repository.LogOutPage;
import pom_repository.Login_page;
import pom_repository.OrganizationPage;

public class Base_class {

	public WebDriver driver;
	public WebDriverWait  explicitWait;
	public ExcelUtility excelLib = new ExcelUtility();
	public OrganizationPage page1 ;
	
	@Parameters("browser") 
	@BeforeClass(alwaysRun = true)
	public void openingApplication(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		Reporter.log("Browser is succesfully launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is succesfully Maximized", true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 10);
		driver.get(excelLib.readStringDataFromExcel("V_Tiger", 0, 1));	
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void LoginPage(){
		//Assert.assertEquals(driver.getTitle(), excelLib.readBooleanDataFromExcel("V_Tiger", 1, 1), "Login page is not displayed");
		//Reporter.log("LoginPage displayed Succesfully", true);
		
		Login_page logIn = new Login_page(driver);
		logIn.LoginToApplication(excelLib.readStringDataFromExcel("V_Tiger", 2, 1), excelLib.readStringDataFromExcel("V_Tiger", 3, 1));
		 explicitWait = new WebDriverWait(driver, 10);
		 explicitWait.until(ExpectedConditions.titleIs("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM"));
		 //Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("V_Tiger", 3, 1), "HomePage is not Displayed");
		// Reporter.log("HomePage is Displayed", true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void Logout_page() {
		LogOutPage log = new LogOutPage(driver);
		log.Logout();
		//Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("V_Tiger", 2, 1), "Logout is not Succesfull");
		 //Reporter.log("Logout is succesfull", true);
	}
	
	
	@AfterClass(alwaysRun = true)
	public void closeTheBrowser() {
		driver.quit();
		Reporter.log("Application closed", true);
	}
}
