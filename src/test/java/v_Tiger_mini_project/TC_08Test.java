package v_Tiger_mini_project;

import org.testng.annotations.Test;

import genericLibrary.Base_class;
import pom_repository.OrganizationPage;

public class TC_08Test extends Base_class {

	@Test
	public void createOrganizationWithEmailOptOut() {
	String OrganizationName = excelLib.readStringDataFromExcel("V_Tiger", 5, 1);
	String webSiteName = excelLib.readStringDataFromExcel("V_Tiger", 7, 1);
	page1= new OrganizationPage(driver);	
	page1.createOrganizationWithEmailOptOut(driver, webSiteName);

}
}
