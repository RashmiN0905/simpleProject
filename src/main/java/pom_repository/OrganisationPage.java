package pom_repository;
/***
 * 
 * @author Rashmi
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Organizations")
	private WebElement organizationLink;
	
	@FindBy (xpath="//img[@alt='Create Organization...']")
	private WebElement addOrganizationSymbol;
	
	
	//organization address
	@FindBy(name = "accountname")
	private WebElement organizationName;

	@FindBy(name = "website")
	private WebElement websiteName;

	@FindBy(name = "tickersymbol")
	private WebElement tickersymbol;

	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement membersOfTextField;

	@FindBy(id = "employees")
	private WebElement employeesTextField;

	@FindBy(id = "email2")
	private WebElement otherEmailIdTextField;

	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industrySelectBox;

	@FindBy(xpath = "//select[@name='accounttype']")
	private WebElement accounttypeSelectBox;

	@FindBy(xpath = "//input[@name='emailoptout']")
	private WebElement emailoptoutCheckBox;

	@FindBy(xpath = "//input[@name='assigntype' and @value='U']")
	private WebElement userRadioButton;

	@FindBy(xpath = "//select[@name=\"assigned_user_id\"]")
	private WebElement administratorSelectBox;

	@FindBy(id = "phone")
	private WebElement phoneNumberTextField;

	@FindBy(id = "fax")
	private WebElement faxTextField;

	@FindBy(id = "otherphone")
	private WebElement otherPhoneNumberTextField;

	@FindBy(id = "email1")
	private WebElement emailIdTextField;

	@FindBy(id = "ownership")
	private WebElement ownershipTextField;

	@FindBy(xpath = "//select[@name=\"rating\"]")
	private WebElement ratingsMultiSelectbox;

	@FindBy(id = "siccode")
	private WebElement sicCodeTextbox;

	@FindBy(xpath = "//input[@name='annual_revenue']")
	private WebElement annual_revenueTextbox;

	@FindBy(xpath = "//input[@name='notify_owner']")
	private WebElement notifyOwnerCheckbox;

//Adminstrator address

	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddressTextField;

	@FindBy(id = "bill_pobox")
	private WebElement billingPoBoxTextField;

	@FindBy(id = "bill_city")
	private WebElement billingCityTextField;

	@FindBy(id = "bill_state")
	private WebElement billingStateTextField;

	@FindBy(id = "bill_code")
	private WebElement billingPostalCodeTextField;

	@FindBy(id = "bill_country")
	private WebElement billingCountryTextField;

	@FindBy(xpath = "//input[@name='cpy']/..//b[text()='Copy Shipping address']")
	private WebElement copyShippingRadioButton;

	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shippingAddressTextField;

	@FindBy(id = "ship_pobox")
	private WebElement shippingPoBoxTextField;

	@FindBy(id = "ship_city")
	private WebElement ship_cityTextField;

	@FindBy(id = "ship_state")
	private WebElement shipstateTextField;

	@FindBy(id = "ship_code")
	private WebElement shipPostalCodeTextField;

	@FindBy(id = "ship_country")
	private WebElement shipCountryTextField;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionTextField;

	@FindBy(xpath = "(//input[@name='button' and @value='  Save  '])[2]")
	private WebElement saveButton;

	
	//getterMethods
	public WebElement getorganizationLink() {
		return organizationLink;
	}
	public WebElement getaddOrganizationSymbol() {
		return addOrganizationSymbol;
	}
	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getWebsiteName() {
		return websiteName;
	}

	public WebElement getTickersymbol() {
		return tickersymbol;
	}

	public WebElement getMembersOfTextField() {
		return membersOfTextField;
	}

	public WebElement getEmployeesTextField() {
		return employeesTextField;
	}

	public WebElement getOtherEmailIdTextField() {
		return otherEmailIdTextField;
	}

	public WebElement getIndustrySelectBox() {
		return industrySelectBox;
	}

	public WebElement getAccounttypeSelectBox() {
		return accounttypeSelectBox;
	}

	public WebElement getEmailoptoutCheckBox() {
		return emailoptoutCheckBox;
	}

	public WebElement getUserRadioButton() {
		return userRadioButton;
	}

	public WebElement getAdministratorSelectBox() {
		return administratorSelectBox;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getFaxTextField() {
		return faxTextField;
	}

	public WebElement getOtherPhoneNumberTextField() {
		return otherPhoneNumberTextField;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getOwnershipTextField() {
		return ownershipTextField;
	}

	public WebElement getRatingsMultiSelectbox() {
		return ratingsMultiSelectbox;
	}

	public WebElement getSicCodeTextbox() {
		return sicCodeTextbox;
	}

	public WebElement getAnnual_revenueTextbox() {
		return annual_revenueTextbox;
	}

	public WebElement getNotifyOwnerCheckbox() {
		return notifyOwnerCheckbox;
	}

	public WebElement getBillingAddressTextField() {
		return billingAddressTextField;
	}

	public WebElement getBillingPoBoxTextField() {
		return billingPoBoxTextField;
	}

	public WebElement getBillingCityTextField() {
		return billingCityTextField;
	}

	public WebElement getBillingStateTextField() {
		return billingStateTextField;
	}

	public WebElement getBillingPostalCodeTextField() {
		return billingPostalCodeTextField;
	}

	public WebElement getBillingCountryTextField() {
		return billingCountryTextField;
	}

	public WebElement getCopyShippingRadioButton() {
		return copyShippingRadioButton;
	}

	public WebElement getShippingAddressTextField() {
		return shippingAddressTextField;
	}

	public WebElement getShippingPoBoxTextField() {
		return shippingPoBoxTextField;
	}

	public WebElement getShip_cityTextField() {
		return ship_cityTextField;
	}

	public WebElement getShipstateTextField() {
		return shipstateTextField;
	}

	public WebElement getShipPostalCodeTextField() {
		return shipPostalCodeTextField;
	}

	public WebElement getShipCountryTextField() {
		return shipCountryTextField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	//ActionMethods for organization information
	public void organization() {
		
	}
}
