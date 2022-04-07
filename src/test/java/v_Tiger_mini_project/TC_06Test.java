package v_Tiger_mini_project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.Base_class;
import genericLibrary.ExcelUtility;
import pom_repository.OrganizationPage;

public class TC_06Test extends Base_class {

	@Test
	public void createMember() {

		String expectedPageTitle = excelLib.readStringDataFromExcel("V_Tiger", 5, 1);
		String organisationName = excelLib.readStringDataFromExcel("V_Tiger", 7, 1);
		page1 = new OrganizationPage(driver); 
		page1.createOrganizationWithMembersOf(driver, organisationName);
	}
	public static void main(String[] args) {
		System.out.println("***********************************");
	}
}
