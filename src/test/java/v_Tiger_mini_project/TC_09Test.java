package v_Tiger_mini_project;

import org.testng.annotations.Test;

import genericLibrary.Base_class;
import pom_repository.OrganizationPage;

public class TC_09Test extends Base_class{
@Test
public void EmailOptOutSelectOptionIsEnabledOrNot() {
	String expectedPageTitle = excelLib.readStringDataFromExcel("V_Tiger", 5, 1);
	String organisationName = excelLib.readStringDataFromExcel("V_Tiger", 7, 1);
	page1 = new OrganizationPage(driver); 
	page1.CheckWhileCreatingNewOrganizationEmailOptOutSelectOptionIsEnabledOrNot(driver, organisationName);
	
}
}
