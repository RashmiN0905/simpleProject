package pom_repository;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class OrganizationPage {
	
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
//-----------------------------TC_06-------------------------------------------------------	
	@FindBy(linkText ="Organizations")
	private WebElement organizationLink;
	
	@FindBy (xpath="//img[@alt='Create Organization...']")
	private WebElement addOrganizationSymbol;
	
	//organization address
	@FindBy(name = "accountname")
	private WebElement organizationName;

	@FindBy(name = "website")
	private WebElement websiteName;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement addMembers;

	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement MemberBox;
	
	
	@FindBy (linkText = "vtigeruser")
	private WebElement member1;
	
	//getterMethods
	public WebElement organizationLink() {
		return organizationLink;
	}
	
	public WebElement addOrganizationSymbol() {
		return addOrganizationSymbol;
	}
	public WebElement websiteName() {
		return websiteName;
	}
	public WebElement addMembers() {
		return addMembers;
	}
	public WebElement MemberBox() {
		return MemberBox;
	}
	public WebElement member1() {
		return  member1;
	}

	public void createOrganizationWithMembersOf(WebDriver driver, String NameOfWebsite)		{
		organizationLink.click();
		addOrganizationSymbol.click();
		websiteName.sendKeys(NameOfWebsite);
		//MemberBox.clear();
		addMembers.click();
		 
		String mainWindow = driver.getWindowHandle();
		Set<String> child1 = driver.getWindowHandles();
		for (String childPage : child1) {
			driver.switchTo().window(childPage);
		}
		member1.click();
		Alert overWrite = driver.switchTo().alert();
		overWrite.accept();
		Reporter.log("Campaign information Updated today", true);
		driver.switchTo().window(mainWindow);
	}
	
//*************************************************************************************************************
	
//---------------------------------TC_07--------------------------------------------------
	
	@FindBy(xpath="//input[@title='Clear']")
	private WebElement clearImage;
	
	public WebElement clearImage() {
		return clearImage;
	}
	
	public void createOrganizationWithMembersOfAndClear(WebDriver driver)	{
		clearImage.click();
		Reporter.log("Content is clear in Member Box", true);
	}
	
	//*************************************************************************************************************
		
	//---------------------------------TC_08--------------------------------------------------
	@FindBy(name = "emailoptout")
	private WebElement emailoptout;
	
	@FindBy(xpath = "(//input[@name='button'])[1]")
	private WebElement saveButton;
		
	public WebElement emailoptout() {
		return emailoptout;
	}
	
	public WebElement saveButton() {
		return saveButton;
	}
	
	public void createOrganizationWithEmailOptOut(WebDriver driver, String NameOfWebsite){
		organizationLink.click();
		addOrganizationSymbol.click();
		websiteName.sendKeys(NameOfWebsite);
		addMembers.click();
		 
		String mainWindow = driver.getWindowHandle();
		Set<String> child1 = driver.getWindowHandles();
		for (String childPage : child1) {
			driver.switchTo().window(childPage);
		}
		member1.click();
		Alert overWrite = driver.switchTo().alert();
		overWrite.accept();
		
		driver.switchTo().window(mainWindow);
		emailoptout.click();
		if(emailoptout.isSelected()) {
			Reporter.log("checkbox is selected", true);	
		}
		else {
			Reporter.log("checkbox is not selected", true);	
		}
		saveButton.click();
		Alert saveAlert = driver.switchTo().alert();
		saveAlert.accept();
		Reporter.log("Campaign information Updated Today", true);				
	}
	
	
	//*************************************************************************************************************		
	//---------------------------------TC_09--------------------------------------------------
	
	public void CheckWhileCreatingNewOrganizationEmailOptOutSelectOptionIsEnabledOrNot(WebDriver driver, String NameOfWebsite) {
		organizationLink.click();
		addOrganizationSymbol.click();
		websiteName.sendKeys(NameOfWebsite);
		addMembers.click();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> child1 = driver.getWindowHandles();
		for (String childPage : child1) {
			driver.switchTo().window(childPage);
		}
		member1.click();

		Alert overWrite = driver.switchTo().alert();
		overWrite.accept();
		
		driver.switchTo().window(mainWindow);
		emailoptout.click();		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emailoptout.click();		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emailoptout.click();
		
		if(emailoptout.isSelected()) {
			Reporter.log("CheckBox is Enabled", true);	
		}
		else {
			Reporter.log("CheckBox is Disabled", true);	
		}
		
		saveButton.click();
		Reporter.log("Campaign information Updated Today", true);
		
		Alert saveAlert = driver.switchTo().alert();
		saveAlert.accept();		
	}
	//*************************************************************************************************************		
		//---------------------------------TC_10--------------------------------------------------
		
		public void createOrganizationWithAssignedTo_User_asAministratot(WebDriver driver, String NameOfWebsite) {
			organizationLink.click();
			addOrganizationSymbol.click();
			websiteName.sendKeys(NameOfWebsite);
			addMembers.click();
			
			String mainWindow = driver.getWindowHandle();
			Set<String> child1 = driver.getWindowHandles();
			for (String childPage : child1) {
				driver.switchTo().window(childPage);
			}
			member1.click();

			Alert overWrite = driver.switchTo().alert();
			overWrite.accept();
			
			driver.switchTo().window(mainWindow);
			emailoptout.click();		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			emailoptout.click();		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			emailoptout.click();
			
			if(emailoptout.isSelected()) {
				Reporter.log("CheckBox is Enabled", true);	
			}
			else {
				Reporter.log("CheckBox is Disabled", true);	
			}
			
			saveButton.click();
			Reporter.log("Campaign information Updated Today", true);
			
			Alert saveAlert = driver.switchTo().alert();
			saveAlert.accept();	

}
}
