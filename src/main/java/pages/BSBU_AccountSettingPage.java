package pages;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.CommonMethods;

public class BSBU_AccountSettingPage extends BasePage {
	
	public String mainWindow;

	private Actions actions;

	public BSBU_AccountSettingPage(WebDriver driver) throws Exception {
		super(driver);
		this.actions = new Actions(driver);
	}


	@FindBy(xpath = "(//div[.='Account Management'])[1]")
	private WebElement accountManagementMenu;

	@FindBy(xpath = "//a[@href=\"/admin/account-management\"]")
	private WebElement accountManagementLink;

	@FindBy(xpath = "//h1[.='Account Management']")
	private WebElement accountManagementHeader;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchAccountInput;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Checkbox;

	@FindBy(xpath = "//p[.='Super Admin']")
	private WebElement superAdminText;

	@FindBy(xpath = "//div[@data-testid='loader']")
	private WebElement loader;

	@FindBy(xpath = "(//*[name()='svg'][@aria-label='Search icon'])[1]")
	private WebElement searchIcon;

//	@FindBy(xpath = "//a[contains(text(),'Perf')]")
//	private WebElement performanceAccountLink;
//
//	@FindBy(xpath = "//div[contains(text(),'Perf')]")
//	private WebElement performanceAccountName;
	
	@FindBy(xpath = "//tbody/tr/td[3]/span/div")
	private WebElement performanceAccountLink;

	@FindBy(xpath = "//div//h1/div/div[1]")
	private WebElement performanceAccountName;

	@FindBy(xpath = "//span[.='Visit Customer Portal']")
	private WebElement visitCustomerPortalBtn;

	@FindBy(xpath = "//h2[.='Account Owner Details']")
	private WebElement accountOwnerDetailsHeader;

//	@FindBy(xpath = "//span[.='Confirm']")
//	private WebElement confirmButton;

	@FindBy(xpath = "//*[@data-testid='sidebar']")
	private WebElement customerSidebar;

	@FindBy(xpath = "(//div[.='Configuration'])[2]")
	private WebElement configurationMenu;

	@FindBy(xpath = "//div[.='Manage Organization']")
	private WebElement manageOrganizationMenu;

	@FindBy(xpath = "//h1[.='Manage Organizations']")
	private WebElement manageOrganizationsHeader;

	@FindBy(xpath = "//span[.='Create Organization']")
	private WebElement createOrganizationBtn;

	@FindBy(xpath = "//input[@name='organizationName']")
	private WebElement organizationNameInput;

	@FindBy(xpath = "//input[@name='address.addressLine2']")
	private WebElement addressLine2Input;

	@FindBy(xpath = "//h1[.=' Organization Details']")
	private WebElement OrganizationDetailsHeader;

	@FindBy(xpath = "//h2[.='Address']")
	private WebElement addressHeader;

	@FindBy(xpath = "//span[.='Select Organization Type']")
	private WebElement orgTypeDropdown;

	@FindBy(xpath = "//span[.='Building Management']")
	private WebElement buildingManagementOption;

	@FindBy(xpath = "//input[@name='contact']")
	private WebElement orgContactInput;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement orgEmailInput;

	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	private WebElement orgRegionDropdown;

	@FindBy(xpath = "//span[.='Hokkaido']")
	private WebElement regionHokkaidoOption;

	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	private WebElement orgStateDropdown;

	@FindBy(xpath = "(//input[@role='combobox'])[4]")
	private WebElement orgCityDropdown;

	@FindBy(xpath = "//span[.='Akahira-shi']")
	private WebElement cityAkahiraOption;

	@FindBy(xpath = "//input[@name='address.addressLine1']")
	private WebElement addressLine1Input;

	@FindBy(xpath = "//input[@name='address.postalCode']")
	private WebElement postalCodeInput;

	@FindBy(xpath = "//span[.='Create']")
	private WebElement createOrgButton;

	@FindBy(xpath = "//p[contains(text(),'has been created successfully')]")
	private WebElement orgCreatedMessage;

	// ================= MENU =================

	@FindBy(xpath = "//span[.=' Account Settings ']")
	private WebElement accountSettingsMenu;

	@FindBy(xpath = "//button[.='Manage Buildings']")
	private WebElement manageBuildingsBtn;

	@FindBy(xpath = "//h1[.='Manage Buildings']")
	private WebElement manageBuildingsHeader;

	@FindBy(xpath = "//span[.='Add Site']")
	private WebElement addSiteBtn;

	// ================= SITE =================

	@FindBy(name = "siteName")
	private WebElement siteNameInput;

	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	private WebElement siteRegion;

	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	private WebElement siteState;

	@FindBy(xpath = "(//input[@role='combobox'])[4]")
	private WebElement siteCity;

	@FindBy(xpath = "//span[.='Hokkaido']")
	private WebElement hokkaidoOption;

	@FindBy(name = "address.addressLine1")
	private WebElement siteAddress1;

	@FindBy(name = "address.addressLine2")
	private WebElement siteAddress2;

	@FindBy(name = "address.postalCode")
	private WebElement sitePostalCode;

	@FindBy(xpath = "//span[.='Save']")
	private WebElement saveBtn;

	@FindBy(xpath = "//p[contains(text(),'Last Updated By')]")
	private WebElement successMessage;

	// ================= BUILDING =================

	@FindBy(xpath = "//div[contains(text(), 'Site_')]")
	private List<WebElement> siteList;

	@FindBy(xpath = "//*[name()='svg' and contains(@data-testid,'add-icon')]")
	private List<WebElement> addIcons;

	@FindBy(xpath = "(//div[.='Add Building / Condominium'])[2]")
	private WebElement addBuildingOption;

	@FindBy(name = "buildingName")
	private WebElement buildingNameInput;

	@FindBy(xpath = "//span[.='Stay on this Page']")
	private WebElement stayOnThisPageButton;

	@FindBy(xpath = "//div//input[@data-testid='toggle-publish']")
	private WebElement publishButton;

	@FindBy(name = "buildingCode")
	private WebElement buildingCodeInput;

	@FindBy(name = "customerNumber")
	private WebElement customerNumberInput;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	private WebElement headOfficeDropdown;

	@FindBy(xpath = "//span[.='00 Head Office']")
	private WebElement headOfficeOption;

	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	private WebElement buildingRegion;

	@FindBy(xpath = "(//input[@role='combobox'])[4]")
	private WebElement buildingState;

	@FindBy(xpath = "(//input[@role='combobox'])[5]")
	private WebElement buildingCity;

//    @FindBy(xpath = "//span[.='Hokkaido']")
//    private WebElement hokkaidoOption;

	@FindBy(xpath = "//span[.='Akahira-shi']")
	private WebElement akahiraOption;

	@FindBy(name = "address.addressLine1")
	private WebElement addressLine1;

	@FindBy(name = "address.addressLine2")
	private WebElement addressLine2;

	@FindBy(name = "address.postalCode")
	private WebElement postalCode;

	@FindBy(name = "contact")
	private WebElement contact;

	@FindBy(name = "longitude")
	private WebElement longitude;

	@FindBy(name = "latitude")
	private WebElement latitude;

	@FindBy(tagName = "body")
	private WebElement body;

	@FindBy(xpath = "(//span[.='Edit'])[2]")
	private WebElement editButton;

	@FindBy(xpath = "(//input)[2]")
	private WebElement organizationSearch;

	@FindBy(xpath = "(//span[contains(., 'Organization')])[1]")
	private WebElement organizationOption;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "(//span[.='Confirm'])[2]")
	private WebElement confirmButton2;

	@FindBy(xpath = "//p[contains(text(),'Organization(s) saved successfully!')]")
	private WebElement organizationSuccess;

	@FindBy(xpath = "//span[contains(text(),'Building_')]")
	private List<WebElement> buildingList;

// ================= FLOOR =================

	@FindBy(xpath = "(//*[name()='svg' and contains(@data-testid,'add-icon')])[2]")
	private WebElement addFloorIcon;

	@FindBy(name = "floorName")
	private WebElement floorNameInput;

	@FindBy(xpath = "//span[contains(text(),'Floor')]")
	private List<WebElement> floorList;

// ================= ROOM =================

	@FindBy(xpath = "(//*[name()='svg' and contains(@data-testid,'add-icon')])[3]")
	private WebElement addRoomIcon;

	@FindBy(name = "roomName")
	private WebElement roomNameInput;

// ================= COMMON =================

	@FindBy(xpath = "//p[contains(text(),'has been added successfully!')]")
	private WebElement roomSuccessMessage;

	@FindBy(xpath = "(//input)[3]")
	private WebElement floorOrganizationSearch;

	@FindBy(xpath = "(//input)[2]")
	private WebElement roomOrganizationSearch;

	@FindBy(xpath = "(//span[contains(.,'Organization')])[2]")
	private WebElement floorOrganizationOption;

	@FindBy(xpath = "(//span[contains(.,'Organization')])[3]")
	private WebElement roomOrganizationOption;

	// ================= NAVIGATION =================

	@FindBy(xpath = "//ol[@role='list']//li[2]")
	private WebElement accountManagementdetailsBreadCrumb;

	@FindBy(xpath = "//button[normalize-space()='Account Settings']")
	private WebElement accountSettingsButton;

	// ================= MANAGE ALARMS =================

	@FindBy(xpath = "//button[normalize-space()='Manage Alarms']")
	private WebElement manageAlarmsButton;

	@FindBy(xpath = "//h1[normalize-space()='Manage Alarms']")
	private WebElement manageAlarmsHeader;

	@FindBy(xpath = "//h6[normalize-space()='Select Location']")
	private WebElement selectLocationHeader;

	@FindBy(xpath = "(//div[contains(text(),'Site')])[1]")
	private WebElement firstSite;

	@FindBy(xpath = "(//*[contains(text(),'Building_')])[8]")
	private WebElement firstBuilding;

	@FindBy(xpath = "//span[.='Reset to Default']")
	private WebElement resetToDefaultButton;

	// ================= NAVIGATION =================

	@FindBy(xpath = "//span[normalize-space()='Back To Account']")
	private WebElement backToAccountButton;

	@FindBy(xpath = "//button[normalize-space()='Manage Scanning Templates']")
	private WebElement manageScanningTemplatesButton;

	// ================= MANAGE TEMPLATE PAGE =================

	@FindBy(xpath = "//h1[normalize-space()='Manage Scanning Templates']")
	private WebElement manageScanningHeader;

	@FindBy(xpath = "//span[contains(text(),'Add Template')]")
	private WebElement addTemplateButton;

	// ================= ADD TEMPLATE =================

	@FindBy(xpath = "//h1[normalize-space()='Add Template']")
	private WebElement addTemplateHeader;

	@FindBy(xpath = "//input[@placeholder='Enter Template Name']")
	private WebElement templateNameInput;

	@FindBy(xpath = "//div[normalize-space()='Select Organization']")
	private WebElement organizationDropdown;

	@FindBy(xpath = "//div[normalize-space()='Common']")
	private WebElement commonOrganizationOption;

	@FindBy(xpath = "//span[normalize-space()='Select Card Category']")
	private WebElement cardCategoryDropdown;

	@FindBy(xpath = "//span[normalize-space()='Type F']")
	private WebElement typeFOption;

	@FindBy(xpath = "//input[@value='readIDm']")
	private WebElement readTypeOption;

	@FindBy(xpath = "//p[contains(text(),'added successfully')]")
	private WebElement addSuccessToast;

	@FindBy(xpath = "//p[contains(text(),'updated successfully')]")
	private WebElement updateSuccessToast;

	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
	private WebElement deleteSuccessToast;

	// ================= EDIT & DELETE =================

	@FindBy(xpath = "//tbody//tr[2]/td[9]/div/span/button[@aria-label='Edit']")
	private WebElement editButton1;

	@FindBy(xpath = "//tbody//tr[2]/td[9]/div/span/button[@aria-label='Delete']")
	private WebElement deleteButton;

	@FindBy(xpath = "//span[normalize-space()='It will be deleted permanently.']")
	private WebElement deletePopupMessage;

	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement confirmDeleteButton;

	// ====================== Manage Services ====================

//	 @FindBy(xpath = "//span[normalize-space()='Account Settings']")
//	    private WebElement accountSettingsButton;

	@FindBy(xpath = "//button[normalize-space()='Manage Services']")
	private WebElement manageServicesButton;

	@FindBy(xpath = "//h1[normalize-space()='Manage Services']")
	private WebElement manageServicesHeader;

	@FindBy(xpath = "//span[contains(text(),'Manage Services')]")
	private WebElement manageServicesSpan;

	@FindBy(xpath = "//span[contains(text(),'Contract Summary')]")
	private WebElement contractSummarySpan;

//	    @FindBy(xpath = "(//div[contains(text(), 'Site')])[1]")
//	    private WebElement firstSite;
//
//	    @FindBy(xpath = "//*[contains(text(), 'Building_')]")
//	    private WebElement firstBuilding;

	@FindBy(xpath = "//button[normalize-space()='Add Contract']")
	private WebElement addContractButton;

	@FindBy(xpath = "//h1[contains(text(),'Add Contract')]")
	private WebElement addContractHeader;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	private WebElement cancelAddContract;

	@FindBy(xpath = "//span[normalize-space()='Add']")
	private WebElement addButton;

	@FindBy(xpath = "(//div[.='Select an option'])[1]")
	private WebElement selectServiceDropdown;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement firstServiceOption;

	@FindBy(xpath = "//textarea")
	private WebElement descriptionInput;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div/div[1]/p[1]")
	private WebElement addToastMessage;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement firstEditContract;

	@FindBy(xpath = "//h1[.='Edit Contract']")
	private WebElement editContractHeader;

	@FindBy(xpath = "(//div[.='Auto Renewal'])[1]")
	private WebElement autoRenewalCheckbox;

	@FindBy(xpath = "(//div[.='Auto Renewal'])[3]")
	private WebElement autoRenewalOption;

	@FindBy(xpath = "(//div[.='Suspend'])[7]")
	private WebElement suspendOption;

	@FindBy(xpath = "//span[.='Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//span[.='Update']")
	private WebElement updateButton;

	@FindBy(xpath = "//p[contains(text(),'successfully')]")
	private WebElement updateSuccessToastforContract;

	// Manage Service and features for building
//	    @FindBy(xpath = "(//div[contains(text(), 'Site')])[1]")
//	    private WebElement firstSite;
//
//	    @FindBy(xpath = "//*[contains(text(), 'Building_')]")
//	    private WebElement firstBuilding;

	@FindBy(xpath = "//span[normalize-space()='Services & Features']")
	private WebElement servicesFeaturesTab;

	@FindBy(xpath = "//span[.='Edit']")
	private WebElement editButtonManageService;

	@FindBy(xpath = "//span[.='Cancel']")
	private WebElement cancelButton;

	    @FindBy(xpath = "//span[.='Back to Account']")
	    private WebElement backtoAccountButton;
//
//	    @FindBy(xpath = "//button[.=' Account Settings ']")
//	    private WebElement accountSettingsButton;

	// ================================== Manage Controller
	// ===========================================

	@FindBy(xpath = "//button[.='Manage Controllers']")
	private WebElement manageControllersButton;

	@FindBy(xpath = "//h2[contains(text(),'Controller List')]")
	private WebElement controllerListHeader;

	@FindBy(xpath = "//span[contains(text(),'Add Controller')]")
	private WebElement addControllerButton;

//	    @FindBy(xpath = "(//div[contains(text(),'Site')])[1]")
//	    private WebElement firstSite;
//
//	    @FindBy(xpath = "//*[contains(text(), 'Building_')]")
//	    private WebElement firstBuilding;

	@FindBy(xpath = "//*[contains(text(), 'Floor-')]")
	private WebElement firstFloor;

	@FindBy(xpath = "(//div[.='Enter controller model'])[1]")
	private WebElement controllerModelDropdown;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement firstControllerOption;

	@FindBy(xpath = "//input[@name='terminalNumber']")
	private WebElement terminalNumberInput;

	@FindBy(xpath = "//input[@placeholder='Enter Controller Name']")
	private WebElement controllerNameInput;

	@FindBy(xpath = "(//div[.='Enter controller usage'])[1]")
	private WebElement controllerUsageDropdown;

	@FindBy(xpath = "(//div[.='ACS (Access Control)'])[4]")
	private WebElement controllerUsageOption;

	@FindBy(xpath = "//input[@placeholder='Enter internal IP address']")
	private WebElement ipAddressInput;

	@FindBy(xpath = "//input[@placeholder='Enter subnet mask']")
	private WebElement subnetMaskInput;

	@FindBy(xpath = "//input[@placeholder='Enter default gateway']")
	private WebElement defaultGatewayInput;

	@FindBy(xpath = "//input[@placeholder='Enter serial number']")
	private WebElement serialNumberInput;

	@FindBy(xpath = "//input[@name='maintenanceOverstayAlert']")
	private WebElement maintenanceOverstayInput;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement firstEditButton;

	@FindBy(xpath = "//h2[.='Device Information']")
	private WebElement deviceInfoHeader;

	@FindBy(xpath = "//h2[.='Device Location']")
	private WebElement deviceLocationHeader;

	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement firstDeleteButton;

	@FindBy(xpath = "(//span[.='Delete'])[2]")
	private WebElement confirmDeleteButton2;

	@FindBy(xpath = "//p[contains(text(),'successfully')]")
	private WebElement successToast;

	@FindBy(xpath = "//div[contains(text(),'Controller ID')]")
	private WebElement controllerIdHeader;

	// =================================== FAE Controller
	// ========================================

	@FindBy(xpath = "//span[.='FAE Controller']")
	private WebElement faeControllerTab;

//	    @FindBy(xpath = "//h2[contains(text(),'Controller List')]")
//	    private WebElement controllerListHeader;
//
//	    @FindBy(xpath = "//span[contains(text(),'Add Controller')]")
//	    private WebElement addControllerButton;
//
//	    @FindBy(xpath = "//div[contains(text(),'Controller ID')]")
//	    private WebElement controllerIdHeader;
//
//	    @FindBy(xpath = "(//div[contains(text(),'Site')])[1]")
//	    private WebElement firstSite;
//
//	    @FindBy(xpath = "//*[contains(text(), 'Building_')]")
//	    private WebElement firstBuilding;
//
//	    @FindBy(xpath = "//*[contains(text(), 'Floor-')]")
//	    private WebElement firstFloor;
//
//	    @FindBy(xpath = "//input[@placeholder='Enter Controller Name']")
//	    private WebElement controllerNameInput;
//
//	    @FindBy(xpath = "(//div[.='Enter controller model'])[1]")
//	    private WebElement controllerModelDropdown;
//
//	    @FindBy(xpath = "(//div[@role='option'])[1]")
//	    private WebElement firstControllerOption;
//
	@FindBy(xpath = "//input[@placeholder='Enter Device Instance ID']")
	private WebElement deviceInstanceIdInput;
//
	@FindBy(xpath = "//div[text()='Enter floor']")
	private WebElement ClickFloorDropdown;
//
//	    @FindBy(xpath = "//input[@name='maintenanceOverstayAlert']")
//	    private WebElement maintenanceOverstayInput;

	@FindBy(xpath = "(//div[.='Next'])[1]")
	private WebElement nextButton;

	@FindBy(xpath = "//h2[.='Network Information']")
	private WebElement networkInfoHeader;

	@FindBy(xpath = "//h2[.='LAN 1']")
	private WebElement lan1Header;

	@FindBy(xpath = "//h2[.='LAN 2']")
	private WebElement lan2Header;

	@FindBy(xpath = "//input[@name='ipAddress']")
	private WebElement lan1IpInput;

	@FindBy(xpath = "//input[@name='defaultGateway']")
	private WebElement lan1GatewayInput;

	@FindBy(xpath = "//input[@name='subnetMask']")
	private WebElement lan1SubnetInput;

	@FindBy(xpath = "//input[@name='ipAddress2']")
	private WebElement lan2IpInput;

	@FindBy(xpath = "//input[@name='defaultGateway2']")
	private WebElement lan2GatewayInput;

	@FindBy(xpath = "//input[@name='subnetMask2']")
	private WebElement lan2SubnetInput;

	// ================ Edit FAE Controller =================
	// ================= Edit Elements =================

	@FindBy(xpath = "//h2[.='Device Information']")
	private WebElement deviceInformationHeader;

	@FindBy(xpath = "(//span[.='Save'])[2]")
	private WebElement confirmSaveButton;

//	    @FindBy(xpath = "//span[.='Add']")
//	    private WebElement addButton;

	// ================= Account / Manage Devices =================

//    @FindBy(xpath = "//button[.=' Account Settings ']")
//    WebElement accountSettingsButton;

	@FindBy(xpath = "//button[.='Manage Devices']")
	WebElement manageDevicesButton;

	@FindBy(xpath = "//h1[.='Manage Devices']")
	WebElement manageDevicesHeader;

	// ================= Site / Building / Floor =================

//    @FindBy(xpath = "(//div[contains(text(),'Site')])[1]")
//    WebElement firstSite;
//
//    @FindBy(xpath = "//*[contains(text(),'Building_')]")
//    WebElement firstBuilding;
//
//    @FindBy(xpath = "//div[contains(text(),'Floor')]")
//    WebElement firstFloor;

	// ================= ACS Device =================

	@FindBy(xpath = "//span[.='Add Device']")
	WebElement addDeviceButton;

	@FindBy(xpath = "//input[@placeholder='Select Controller']")
	WebElement controllerDropdown;

//    @FindBy(xpath = "//span[contains(text(),'CNT')]")
//    WebElement firstControllerOption;

	@FindBy(xpath = "//input[@placeholder='Select Device Model']")
	WebElement deviceModelDropdown;

	@FindBy(xpath = "(//li/span)[2]")
	WebElement firstDeviceModelOption;

//    @FindBy(xpath = "//input[@placeholder='Enter Terminal Number']")
//    WebElement terminalNumberInput;

	@FindBy(xpath = "//input[@placeholder='Enter Device Name']")
	WebElement deviceNameInput;

//    @FindBy(xpath = "//input[@placeholder='Enter Serial Number']")
//    WebElement serialNumberInput;
//
//    @FindBy(xpath = "//input[@name='maintenanceOverstayAlert']")
//    WebElement maintenanceOverstayInput;
//
//    @FindBy(xpath = "//span[.='Add']")
//    WebElement addButton;
//
//    @FindBy(xpath = "//p[contains(text(),'successfully')]")
//    WebElement successToast;
//
//    @FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
//    WebElement firstEditButton;
//
//    @FindBy(xpath = "//h2[.='Device Information']")
//    WebElement deviceInfoHeader;
//
//    @FindBy(xpath = "//h2[.='Device Location']")
//    WebElement deviceLocationHeader;
//
//    @FindBy(xpath = "//span[.='Save']")
//    WebElement saveButton;
//
//    @FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
//    WebElement firstDeleteButton;
//
//    @FindBy(xpath = "//span[.='Confirm']")
//    WebElement confirmDeleteButton;

	
	public void openAccountManagement() {
		waitUtils.waitForElementClickable(accountManagementLink).click();

		trackStep("Open Account Management");

		waitUtils.waitForElementVisible(accountManagementHeader);
		waitUtils.waitForElementVisible(searchAccountInput);
		waitUtils.waitForElementVisible(Checkbox);

		endStep();
	}

	public void searchAccount(String accountName) {
		waitUtils.waitForElementClickable(superAdminText).click();

		trackStep("Search Account");

		waitUtils.waitForElementVisible(accountManagementHeader).click();
		waitUtils.waitForElementClickable(searchAccountInput);
		searchAccountInput.clear();
		searchAccountInput.sendKeys(accountName);
		searchIcon.click();
		waitUtils.waitForElementVisible(loader);
		waitUtils.waitForElementToBeInvisible(loader);

		endStep();
		waitUtils.waitForElementClickable(performanceAccountLink).click();
	}

	public String getAccountName() {
		return utils.ConfigFileReader.getConfigProperty("Account" + CommonMethods.getRandomLong(1, 14));
	}

	public void openCustomerPortal() throws InterruptedException {

//		waitUtils.waitForElementClickable(performanceAccountLink).click();

		// Click Performance Account
		trackStep("Open Performance Account");

		waitUtils.waitForElementVisible(accountOwnerDetailsHeader);
		String accountName = waitUtils.waitForElementVisible(performanceAccountName).getText();
		System.out.println("Selected Account: " + accountName);

		endStep();

		// Visit Customer Portal

		mainWindow = driver.getWindowHandle();
		waitUtils.waitForElementClickable(visitCustomerPortalBtn).click();
		waitUtils.waitForElementClickable(confirmButton).click();

		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}

		trackStep("Customer Portal Load Time");

		waitUtils.waitForElementVisible(loader);
		waitUtils.waitForElementToBeInvisible(loader);
		waitUtils.waitForElementVisible(customerSidebar);

		endStep();
	}

	public void loadManageOrganizationPage() throws InterruptedException {
		// Click Configuration menu and Manage Organization menu
		waitUtils.waitForMillis(3000);
		waitUtils.waitAndClick(configurationMenu);
		waitUtils.waitForMillis(2000); // small wait if needed
		waitUtils.waitAndClick(manageOrganizationMenu);
		waitUtils.waitForMillis(1000);

		trackStep("Customer Portal Load Manage Organization Page");

		waitUtils.waitForElementVisible(Checkbox);
		waitUtils.waitForElementVisible(manageOrganizationsHeader); // Ensure Manage Organizations header is visible

		endStep();
	}

	public void createOrganization(String accountOrganizationName, String randomNumber, String randomEmail)
			throws InterruptedException {
		trackStep("Load Create Organization Page");
		waitUtils.waitAndClick(createOrganizationBtn); // Open Create Organization page at Customer portal
		waitUtils.waitAndClick(addressHeader);
		waitUtils.waitForElementVisible(OrganizationDetailsHeader);

		endStep();

		// Fill organization details
		waitUtils.waitAndSendKeys(organizationNameInput, accountOrganizationName);
		waitUtils.waitAndSendKeys(addressLine2Input, "Address Line 2");
		waitUtils.waitAndClick(addressHeader);

		waitUtils.waitAndClick(orgTypeDropdown);
		waitUtils.waitAndClick(buildingManagementOption);

		waitUtils.waitAndSendKeys(orgContactInput, randomNumber);
		waitUtils.waitAndSendKeys(orgEmailInput, randomEmail);

		waitUtils.waitAndClick(orgRegionDropdown);
		waitUtils.waitAndClick(regionHokkaidoOption);

		waitUtils.waitAndClick(orgStateDropdown);
		waitUtils.waitAndClick(regionHokkaidoOption); // state same as region

		waitUtils.waitAndClick(orgCityDropdown);
		waitUtils.waitAndClick(cityAkahiraOption);

		waitUtils.waitAndSendKeys(addressLine1Input, "Address Line 1");
		waitUtils.waitAndSendKeys(postalCodeInput, "440024");

	}

	public void submitOrganization() throws InterruptedException {
		trackStep("Organization Added Successfully Time");

		// Click Create button and verify organization created
		waitUtils.waitAndClick(createOrgButton);
		waitUtils.waitForElementVisible(orgCreatedMessage);
		waitUtils.waitAndClick(manageOrganizationsHeader);

		endStep();

		// Close the tab and switch back to main
		driver.close();
		waitUtils.waitForMillis(2000);
		driver.switchTo().window(mainWindow);
	}

	// ================= FLOW Manage Building =================

	public void openManageBuildings() {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsMenu);
		waitUtils.waitAndClick(manageBuildingsBtn);

		trackStep("Load Manage Buildings Page");

		waitUtils.waitForElementVisible(manageBuildingsHeader);
		waitUtils.waitForElementVisible(addSiteBtn);

		endStep();
	}

	public void addSite(String unique) {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(addSiteBtn);

		waitUtils.waitAndSendKeys(siteNameInput, "Site_" + unique);
		waitUtils.waitForMillis(2000);
		driver.findElement(By.name("publish")).click();
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(siteRegion);
		waitUtils.waitAndClick(hokkaidoOption);
		waitUtils.waitAndClick(siteState);

		waitUtils.waitAndClick(hokkaidoOption);
		waitUtils.waitAndClick(siteCity);
		waitUtils.waitAndClick(cityAkahiraOption);

		waitUtils.waitAndSendKeys(siteAddress1, "Address Line 1");
		waitUtils.waitAndSendKeys(siteAddress2, "Address Line 2");
		waitUtils.waitAndSendKeys(sitePostalCode, "440024");

		waitUtils.waitAndClick(saveBtn);

		trackStep("Add Site Successfully Time");

		waitUtils.waitForElementVisible(successMessage);
		waitUtils.waitForElementVisible(siteList.get(0));

		endStep();
	}

	public void addBuilding(String unique, String random) {

		// Hover Site
		waitUtils.waitForMillis(2000);

		actions.moveToElement(waitUtils.waitForElementVisible(siteList.get(0))).build().perform();

		System.out.println("Hovered over site: " + siteList.get(0).getText());
		waitUtils.waitForMillis(3000);
		// Click Add Building
		actions.moveToElement(waitUtils.waitForElementVisible(addIcons.get(0))).click().build().perform();
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(addBuildingOption);

		// Start Timing
		trackStep("Add Building Details Successfully Time");

		waitUtils.waitAndSendKeys(buildingNameInput, "Building_" + unique);
		waitUtils.waitAndClick(stayOnThisPageButton);
		waitUtils.waitForMillis(2000);

//		driver.findElement(By.name("publish")).click();

//		waitUtils.waitForMillis(2000);
		waitUtils.waitAndSendKeys(buildingCodeInput, random);
		waitUtils.waitAndSendKeys(customerNumberInput, random);

		waitUtils.waitAndClick(headOfficeDropdown);
		waitUtils.waitAndClick(headOfficeOption);

		waitUtils.waitAndClick(buildingRegion);
		waitUtils.waitAndClick(hokkaidoOption);

		waitUtils.waitAndClick(buildingState);
		waitUtils.waitAndClick(hokkaidoOption);

		waitUtils.waitAndClick(buildingCity);
		waitUtils.waitAndClick(akahiraOption);

		waitUtils.waitAndSendKeys(addressLine1, "Address Line 1");
		waitUtils.waitAndSendKeys(addressLine2, "Address Line 2");
		waitUtils.waitAndSendKeys(postalCode, "440024");
		waitUtils.waitAndSendKeys(contact, random);
		waitUtils.waitAndSendKeys(longitude, "79.088158");
		waitUtils.waitAndSendKeys(latitude, "22.5800");

		body.sendKeys(Keys.END);
		body.sendKeys(Keys.HOME);

		waitUtils.waitAndClick(saveButton);
		waitUtils.waitForElementVisible(successMessage);

		endStep();

		// Add Organization

		waitUtils.waitAndClick(editButton);
		waitUtils.waitForElementVisible(organizationSearch).click();
		waitUtils.waitForElementVisible(organizationSearch).sendKeys("Organization");
//		waitUtils.waitAndSendKeys(organizationSearch, "Organization");
		waitUtils.waitForMillis(1000);

		waitUtils.waitForElementVisible(organizationOption).click();
		waitUtils.waitForMillis(1000);
		body.sendKeys(Keys.END);
		waitUtils.waitForMillis(1000);

		trackStep("Add Organization To Building Time");

		waitUtils.waitAndClick(saveButton);
		waitUtils.waitAndClick(confirmButton2);
		waitUtils.waitForElementToBeInvisible(organizationSuccess);

		endStep();
	}

	public void addFloor(String unique) {

		// ================= ADD FLOOR =================
		// Hover Site
		waitUtils.waitForMillis(2000);

		actions.moveToElement(waitUtils.waitForElementVisible(buildingList.get(0))).build().perform();
		System.out.println("Hovered over Building: " + buildingList.get(0).getText());
		waitUtils.waitForMillis(2000);

		actions.moveToElement(waitUtils.waitForElementVisible(addIcons.get(1))).click().build().perform();

		waitUtils.waitAndSendKeys(floorNameInput, "Floor-" + unique);
//		waitUtils.waitAndClick(publishButton);
		waitUtils.waitAndClick(saveButton);

		trackStep("Add Floor Details Successfully Time");

		waitUtils.waitForElementVisible(successMessage);

		endStep();

		// ================= ADD ORGANIZATION TO FLOOR =================

		waitUtils.waitAndClick(editButton);

		waitUtils.waitAndSendKeys(floorOrganizationSearch, "Organization");

		waitUtils.waitAndClick(floorOrganizationOption);
		waitUtils.waitForMillis(2000);

		trackStep("Add Organization To Floor Time");

		waitUtils.waitAndClick(saveButton);
		waitUtils.waitAndClick(confirmButton2);
		waitUtils.waitForElementToBeInvisible(organizationSuccess);
		waitUtils.waitForElementVisible(successMessage);

		endStep();

	}

	public void addRoom(String unique) {
		waitUtils.waitForMillis(2000);

		actions.moveToElement(waitUtils.waitForElementVisible(floorList.get(0))).build().perform();
		System.out.println("Hovered over Floor: " + floorList.get(0).getText());
		waitUtils.waitForMillis(2000);

		actions.moveToElement(waitUtils.waitForElementVisible(addIcons.get(2))).click().build().perform();

		// ================= ADD ROOM =================

		waitUtils.waitAndSendKeys(roomNameInput, "Room-" + unique);
//		waitUtils.waitAndClick(publishButton);
		waitUtils.waitAndClick(saveButton);

		trackStep("Add Room Details Successfully Time");

		waitUtils.waitForElementVisible(roomSuccessMessage);

		endStep();

		// ================= ADD ORGANIZATION TO ROOM =================

		waitUtils.waitAndClick(editButton);

		waitUtils.waitAndSendKeys(roomOrganizationSearch, "Organization");
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(roomOrganizationOption);
		waitUtils.waitForMillis(1000);

		trackStep("Add Organization To Room Time");

		waitUtils.waitAndClick(saveButton);
//		waitUtils.waitAndClick(confirmButton2);
		waitUtils.waitForElementToBeInvisible(organizationSuccess);
		waitUtils.waitForElementVisible(successMessage);

		endStep();

	}

	// BMS Setup_Completed##########################################################

	public void openManageAlarms() {

		// Back to Account
//		waitUtils.waitAndClick(backToAccountButton);

		// Open Account Settings
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsButton);

		// ================= Manage Alarms =================
		waitUtils.waitAndClick(manageAlarmsButton);

		trackStep("Manage Alarms Page Load Time");

		waitUtils.waitForElementVisible(manageAlarmsHeader);
		waitUtils.waitForElementVisible(selectLocationHeader);

		endStep();

		// ================= Select Site =================
		waitUtils.waitAndClick(firstSite);

		// ================= Select Building =================
		waitUtils.waitAndClick(firstBuilding);

		trackStep("Load Available Alarms Time");

		waitUtils.waitForElementVisible(resetToDefaultButton);

		endStep();
	}

	public void clickRowAction(String rowText, String actionName) {

		String actionXpath = "//tbody//tr[td[normalize-space()='" + rowText + "']]" + "//button[@aria-label='"
				+ actionName + "']";

		By actionLocator = By.xpath(actionXpath);

		WebElement actionButton = waitUtils.waitForElementVisible(actionLocator);
		waitUtils.waitAndClick(actionButton);
	}

	public void waitUntilTemplateReflected(String updatedTemplateName, int maxAttempts) {

		By rowLocator = By.xpath("//tbody//tr[td[normalize-space()='" + updatedTemplateName + "']]");

		int attempt = 0;

		while (attempt < maxAttempts) {
			try {
				waitUtils.waitForMillis(1000);
				driver.navigate().refresh();
				waitUtils.waitForElementVisible(rowLocator);
				return; // Found → exit loop
			} catch (Exception e) {
				driver.navigate().refresh();
				waitUtils.waitForElementVisible(loader);
				waitUtils.waitForElementToBeInvisible(loader);// Ensure page is loaded after refresh
				waitUtils.waitForMillis(1500);
				attempt++;
			}
		}

		throw new RuntimeException("Updated template not reflected after refresh attempts.");
	}

	public void manageScanningTemplates(String unique) {

		String templateName = "Temp-" + unique;
		String updatedTemplateName = templateName + "Edited";

		// Back to Account
//		waitUtils.waitAndClick(backToAccountButton);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsButton);
		waitUtils.waitAndClick(manageScanningTemplatesButton);

		// ================= Manage Page =================
		trackStep("Manage Services");

		waitUtils.waitForElementVisible(manageScanningHeader);
		waitUtils.waitForElementVisible(addTemplateButton);

		endStep();

		// ================= Add Template =================
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(addTemplateButton);

		trackStep("Add Template page Load Time");

		waitUtils.waitForElementVisible(addTemplateHeader);

		endStep();

		// Fill Template Details
		waitUtils.waitAndSendKeys(templateNameInput, templateName);
		System.out.println("Entered Template Name: " + templateName);

		waitUtils.waitAndClick(organizationDropdown);
		waitUtils.waitAndClick(commonOrganizationOption);

		waitUtils.waitAndClick(cardCategoryDropdown);
		waitUtils.waitAndClick(typeFOption);

		waitUtils.waitAndClick(readTypeOption);

		waitUtils.waitAndClick(saveButton);

		trackStep("Add Template Successfully Time");
		waitUntilTemplateReflected(templateName, 3); // Wait for the updated template to be reflected with retries

//	    waitUtils.waitForElementVisible(addSuccessToast);
		waitUtils.waitForElementVisible(manageScanningHeader);

		endStep();

		// ================= Edit SAME Template =================
		clickRowAction(templateName, "Edit");

		templateNameInput.clear();
		waitUtils.waitAndSendKeys(templateNameInput, updatedTemplateName);
		System.out.println("Edited Template Name: " + updatedTemplateName);

		waitUtils.waitAndClick(saveButton);

		trackStep("Edit Template");

		waitUntilTemplateReflected(updatedTemplateName, 1); // Wait for the updated template to be reflected with
															// retries

//	    waitUtils.waitForElementVisible(updateSuccessToast);
		waitUtils.waitForElementVisible(manageScanningHeader);

		endStep();

		// ================= Delete SAME Edited Template =================
		clickRowAction(updatedTemplateName, "Delete");

		trackStep("Delete Template Popup");

		waitUtils.waitForElementVisible(deletePopupMessage);

		endStep();

		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete Template toast Message");

		waitUtils.waitForElementVisible(deleteSuccessToast);
		waitUtils.waitForElementVisible(manageScanningHeader);

		endStep();
	}

	// ==================== Manage Services ====================

	public void openManageServices() {
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsButton);
		waitUtils.waitAndClick(manageServicesButton);

		trackStep("Manage Services Page load");
		waitUtils.waitForElementVisible(manageServicesHeader);
		waitUtils.waitForElementVisible(manageServicesSpan);
		waitUtils.waitForElementVisible(contractSummarySpan);
		endStep();
	}

	public void selectSiteAndBuilding() {
		waitUtils.waitAndClick(firstSite);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(firstBuilding);
		waitUtils.waitForMillis(2000);
	}

	public void addContract(String description) {

		selectSiteAndBuilding();
		waitUtils.waitAndClick(addContractButton);

		trackStep("Add Contract Popup");
		waitUtils.waitForElementVisible(addContractHeader);
		waitUtils.waitForElementVisible(cancelAddContract);
		waitUtils.waitForElementVisible(addButton);
		endStep();

		waitUtils.waitAndClick(selectServiceDropdown);
		waitUtils.waitAndClick(firstServiceOption);

		waitUtils.waitAndSendKeys(descriptionInput, "Desription_" + description);

		waitUtils.waitAndClick(addButton);

		trackStep("Add toast message");
		waitUtils.waitForElementVisible(addToastMessage);
		waitUtils.waitForElementVisible(manageServicesHeader);
		endStep();
	}

	public void editContract(String newDescription) {
		waitUtils.waitAndClick(firstEditContract);

		trackStep("Load Contract Details");
		waitUtils.waitForElementVisible(editContractHeader);
		endStep();

		waitUtils.waitAndClick(autoRenewalOption);
		waitUtils.waitAndClick(suspendOption);
		waitUtils.waitAndClick(confirmButton);

		waitUtils.waitAndSendKeys(descriptionInput, "NewDesription_" + newDescription);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(updateButton);

		trackStep("Contract Details Updated Successfully");
		waitUtils.waitForElementVisible(updateSuccessToastforContract);
		waitUtils.waitForElementVisible(manageServicesHeader);
		endStep();
	}

	public void manageServicesFeatures() throws InterruptedException {
		// ================= Open Services & Features =================
		System.out.println("Navigating to Services & Features tab");
		waitUtils.waitForMillis(2000);
//	    	selectSiteAndBuilding();
		System.out.println("22Navigating to Services & Features tab");
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(servicesFeaturesTab);

		trackStep("Service Feature Page");
		waitUtils.waitForElementVisible(servicesFeaturesTab);
		waitUtils.waitForElementVisible(backToAccountButton);
		endStep();

		// ================= Edit Services & Features =================
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(editButtonManageService);
		waitUtils.waitForMillis(2000);

		// Click Cancel after edit
		waitUtils.waitAndClick(cancelButton);

		trackStep("Save Service Feature toast message");
		waitUtils.waitForElementVisible(servicesFeaturesTab);
		waitUtils.waitForElementVisible(accountSettingsButton);
		endStep();

	}

	// =========================== Manage Controllers ===========================
	public void manageControllers(String random255, String unique) throws InterruptedException {

		// ================= Navigate Back to Account =================
//	        waitUtils.waitAndClick(backToAccountButton);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsButton);
		waitUtils.waitForMillis(1000);

		// ================= Load Manage Controllers =================
		waitUtils.waitAndClick(manageControllersButton);

		trackStep("Load Manage Controller Page");
		waitUtils.waitForElementVisible(controllerListHeader);
		waitUtils.waitForElementVisible(addControllerButton);
		waitUtils.waitForElementVisible(controllerIdHeader);
		endStep();

		// ================= Select Site, Building, Floor =================
		waitUtils.waitAndClick(firstSite);
		waitUtils.waitForMillis(2000);

		trackStep("Load Building After Selecting Site for Controller");
		waitUtils.waitForElementVisible(firstBuilding);
		endStep();

		waitUtils.waitForElementVisible(firstBuilding);
		firstBuilding.click();
		trackStep("Load Floor After Selecting Building for Controller");
		waitUtils.waitForElementVisible(firstFloor);
		endStep();

		waitUtils.waitAndClick(firstFloor);
		trackStep("Load Available Controller Page After Selecting Floor");
		waitUtils.waitForElementVisible(addControllerButton);
		endStep();

		// ================= Add Controller =================
		waitUtils.waitForElementVisible(addControllerButton);
		addControllerButton.click();
		trackStep("Add ACS Controller Page");
		waitUtils.waitForElementVisible(controllerModelDropdown);
		endStep();

		// Fill Controller Details
		waitUtils.waitAndClick(controllerModelDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstControllerOption);

		waitUtils.waitAndSendKeys(terminalNumberInput, random255);

		waitUtils.waitAndSendKeys(controllerNameInput, "Controller" + unique);
		System.out.println("Controller Name = " + "Controller" + unique);

		waitUtils.waitAndClick(controllerUsageDropdown);
		waitUtils.waitAndClick(controllerUsageOption);

		waitUtils.waitAndSendKeys(ipAddressInput, "192.168.0.1");
		waitUtils.waitAndSendKeys(subnetMaskInput, "255.255.255.0");
		waitUtils.waitAndSendKeys(defaultGatewayInput, "192.168.0.1");
		waitUtils.waitAndSendKeys(serialNumberInput, random255);

		waitUtils.waitAndSendKeys(maintenanceOverstayInput, random255);

		waitUtils.waitAndClick(addButton);

		trackStep("Added Controller successfully");
		waitUtils.waitForElementVisible(successToast);
		waitUtils.waitForElementVisible(controllerIdHeader);
		endStep();

		// ================= Edit Controller =================
		waitUtils.waitAndClick(firstEditButton);
		trackStep("Open Controller Details");
		waitUtils.waitForElementVisible(deviceInfoHeader);
		waitUtils.waitForElementVisible(deviceLocationHeader);
		endStep();

		waitUtils.waitForMillis(2000);

		waitUtils.waitAndClick(cancelButton);

		// ================= Delete Controller =================
		waitUtils.waitAndClick(firstDeleteButton);
		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete Controller successfully");
		waitUtils.waitForElementVisible(successToast);
		waitUtils.waitForElementVisible(controllerIdHeader);
		endStep();
	}

	public void addFAEController(String random32, String unique) throws InterruptedException {

		// ================= Load FAE Controller Page =================
		waitUtils.waitAndClick(faeControllerTab);
		trackStep("Load Manage FAE Controller Page");
		waitUtils.waitForElementVisible(controllerListHeader);
		waitUtils.waitForElementVisible(addControllerButton);
		waitUtils.waitForElementVisible(controllerIdHeader);
		endStep();

		waitUtils.waitForMillis(2000);

		// Refresh page to ensure proper load
//	        driver.get(driver.getCurrentUrl());
//	        waitUtils.waitAndClick(faeControllerTab);
//	        
		waitUtils.waitForMillis(2000);

//	        // ================= Select Site / Building / Floor =================
//	        waitUtils.waitAndClick(firstSite);
//	        trackStep("Load Building After Selecting Site for FAE Controller");
//	        waitUtils.waitAndClick(firstBuilding);
//	        endStep();
//
//	        waitUtils.waitForElementVisible(firstBuilding);
//	        firstBuilding.click();
//	        trackStep("Load Floor After Selecting Building for FAE Controller");
//	        waitUtils.waitForElementVisible(firstFloor);
//	        endStep();
//
//	        waitUtils.waitForMillis(1000);
//	        waitUtils.waitForElementVisible(firstFloor);
//	        firstFloor.click();
//	        trackStep("Load Available FAE Controller After Selecting Floor");
//	        waitUtils.waitForElementVisible(addControllerButton);
//	        endStep();

		// ================= Add FAE Controller =================
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(addControllerButton);
		trackStep("Add FAE Controller Page");
		waitUtils.waitForElementVisible(controllerModelDropdown);
		endStep();

		// Controller Name
		waitUtils.waitAndSendKeys(controllerNameInput, "FAE" + unique);
		System.out.println("Controller Name = " + "FAE" + unique);

		// Select Controller Model
		waitUtils.waitAndClick(controllerModelDropdown);
		waitUtils.waitAndClick(firstControllerOption);

		// Device Instance ID
		waitUtils.waitAndSendKeys(deviceInstanceIdInput, random32);

		// Serial Number
		waitUtils.waitAndSendKeys(serialNumberInput, random32);

		// Maintenance Overstay
		waitUtils.waitAndSendKeys(maintenanceOverstayInput, random32);

		waitUtils.waitForElementVisible(ClickFloorDropdown);
		ClickFloorDropdown.click();
		waitUtils.waitForElementVisible(firstFloor);
		firstFloor.click();

		// Next
		waitUtils.waitAndClick(nextButton);
		trackStep("Add FAE Controller Device Details");
		waitUtils.waitForElementVisible(networkInfoHeader);
		waitUtils.waitForElementVisible(lan1Header);
		waitUtils.waitForElementVisible(lan2Header);
		endStep();

		// ================= LAN 1 =================
		waitUtils.waitAndClick(lan1IpInput);
		waitUtils.waitAndSendKeys(lan1IpInput, CommonMethods.generateRandomIp());

		waitUtils.waitAndClick(lan1GatewayInput);
		waitUtils.waitAndSendKeys(lan1GatewayInput, CommonMethods.generateRandomIp());

		waitUtils.waitAndClick(lan1SubnetInput);
		waitUtils.waitAndSendKeys(lan1SubnetInput, "255.255.255.0");

		// ================= LAN 2 =================
		waitUtils.waitAndClick(lan2IpInput);
		waitUtils.waitAndSendKeys(lan2IpInput, CommonMethods.generateRandomIp());

		waitUtils.waitAndClick(lan2GatewayInput);
		waitUtils.waitAndSendKeys(lan2GatewayInput, CommonMethods.generateRandomIp());

		waitUtils.waitAndClick(lan2SubnetInput);
		waitUtils.waitAndSendKeys(lan2SubnetInput, "255.255.255.0");

		// ================= Add Controller =================
		waitUtils.waitAndClick(addButton);
		trackStep("Add FAE Controller Details");
		waitUtils.waitForElementVisible(successToast); // Enable once backend returns
		successToast.click(); // Click toast to remove it from view
		endStep();
	}

	public void editFAEController() {

		// ================= Open FAE Controller Details =================
		waitUtils.waitAndClick(firstEditButton);

		trackStep("Open FAE Controller Details");
		waitUtils.waitForElementVisible(deviceInformationHeader);
		endStep();

		// ================= Navigate Next Screens =================
		waitUtils.waitAndClick(nextButton);
		waitUtils.waitForMillis(2000);

		// ================= Save =================
		waitUtils.waitAndClick(saveButton);
		waitUtils.waitForMillis(2000);

		trackStep("Update FAE Controller Details");
		waitUtils.waitForElementVisible(successToast);
		endStep();

		// ================= Delete Controller =================
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(firstDeleteButton);
		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete Controller successfully");
		waitUtils.waitForElementVisible(successToast);
		waitUtils.waitForElementVisible(controllerIdHeader);
		endStep();
	}

	// ================= Manage Devices =================

	public void manageACSDevice(String unique, String random255) {

		waitUtils.waitForMillis(2000);
		waitUtils.waitForElementVisible(backtoAccountButton).click();
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsButton);
		waitUtils.waitForMillis(1000);

		// ================= Load Manage Devices =================
		waitUtils.waitAndClick(manageDevicesButton);

		trackStep("Load Manage Devices Page");
		waitUtils.waitForElementVisible(manageDevicesHeader);
		waitUtils.waitForElementVisible(addDeviceButton);
		endStep();

		// ================= Select Site / Building / Floor =================
		waitUtils.waitAndClick(firstSite);
		waitUtils.waitForMillis(2000);

		trackStep("Load Building After Selecting Site For Device");
		waitUtils.waitForElementVisible(firstBuilding);
		endStep();

		waitUtils.waitAndClick(firstBuilding);

		trackStep("Load Floor After Selecting Building For Device");
		waitUtils.waitForElementVisible(firstFloor);
		endStep();

		waitUtils.waitAndClick(firstFloor);

		trackStep("Load Available Device Page After Selecting Floor");
		waitUtils.waitForElementVisible(addDeviceButton);
		endStep();

		// ================= Add Device =================
		waitUtils.waitAndClick(addDeviceButton);

		trackStep("Load Add ACS Device Page");
		waitUtils.waitForElementVisible(controllerDropdown);
		endStep();

		// Fill Device Details
		waitUtils.waitAndClick(controllerDropdown);
		waitUtils.waitAndClick(firstControllerOption);

		waitUtils.waitAndClick(deviceModelDropdown);
		waitUtils.waitAndClick(firstDeviceModelOption);

		waitUtils.waitAndSendKeys(terminalNumberInput, random255);

		waitUtils.waitAndSendKeys(deviceNameInput, "DVM-" + unique);
		System.out.println("Device Name = " + "DVM-" + unique);

		waitUtils.waitAndSendKeys(serialNumberInput, random255);
		waitUtils.waitAndSendKeys(maintenanceOverstayInput, "1");

		waitUtils.waitAndClick(addButton);

		trackStep("Added ACS Device successfully");
		waitUtils.waitForElementVisible(successToast);
		waitUtils.waitForElementVisible(manageDevicesHeader);
		endStep();

		// ================= Edit Device =================
		waitUtils.waitAndClick(firstEditButton);

		trackStep("Open ACS Device Details");
		waitUtils.waitForElementVisible(deviceInfoHeader);
		waitUtils.waitForElementVisible(deviceLocationHeader);
		endStep();

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(saveButton);

		// ================= Delete Device =================
		waitUtils.waitAndClick(firstDeleteButton);
		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete ACS Device successfully");
		waitUtils.waitForElementVisible(successToast);
		waitUtils.waitForElementVisible(manageDevicesHeader);
		endStep();
	}

}
