package v_Tiger_mini_project;

import org.testng.annotations.Test;

import genericLibrary.Base_class;
import pom_repository.OrganizationPage;

public class TC_07Test extends Base_class{

	@Test
	public void createMemeberAndClear() {
		String organizationName = excelLib.readStringDataFromExcel("V_Tiger", 5, 1);
		String websiteName = excelLib.readStringDataFromExcel("V_Tiger", 7, 1);
		page1 = new OrganizationPage(driver);
	
		page1.createOrganizationWithMembersOf(driver, websiteName);
		page1.createOrganizationWithMembersOfAndClear(driver);
	}
}
