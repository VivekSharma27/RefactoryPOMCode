package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonMethods;

public class BSBU_AccountSetting_AdminLinkagePage  extends BasePage {
	
	
	private Actions actions;

	public BSBU_AccountSetting_AdminLinkagePage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}
	
	@FindBy(id = "sidebar")
	private WebElement sideBar;

	@FindBy(xpath = "(//div[.='Account Management'])[1]")
	private WebElement accountManagementMenu;

	@FindBy(xpath = "//p[.='Super Admin']")
	private WebElement superAdminProfile;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement accountCheckbox;

	@FindBy(xpath = "//h1[.='Account Management']")
	private WebElement accountManagementHeader;

	@FindBy(xpath = "//span[.='Create Account']")
	private WebElement createAccountButton;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchAccountBox;

	@FindBy(xpath = "//a[contains(text(),'Performance')]")
	private WebElement performanceAccountLink;

	@FindBy(xpath = "//span[.=' Account Settings ']")
	private WebElement accountSettingsTab;

	@FindBy(xpath = "//button[.='Manage Linkage Groups']")
	private WebElement manageLinkageGroupsButton;

	@FindBy(xpath = "//h1[.='Manage Linkage Groups']")
	private WebElement manageLinkageGroupsHeader;

	@FindBy(xpath = "//span[.='Device Linkage Group']")
	private WebElement deviceLinkageGroupTab;

	@FindBy(xpath = "//span[.='Fire Alarm Linkage Group']")
	private WebElement fireAlarmLinkageGroupTab;

	@FindBy(xpath = "//div[contains(text(),'Site_jHn-1')]")
	private WebElement siteElement;

	@FindBy(xpath = "//div[contains(text(),'Building')]")
	private WebElement buildingElement;

	@FindBy(xpath = "//*[contains(text(), 'Building_')]")
	private WebElement buildingName;

	@FindBy(xpath = "//*[contains(text(), 'Floor-')]")
	private WebElement floorName;

	@FindBy(xpath = "//span[contains(text(), 'TestCont')]")
	private WebElement testController;

	@FindBy(xpath = "//span[contains(text(), 'My Control')]")
	private WebElement myController;
	
	//========================= Create ============================
	
	@FindBy(xpath = "//span[.='Create']")
	private WebElement createButton;

	@FindBy(xpath = "//h1[.='Create Device Linkage Group']")
	private WebElement createLinkageGroupHeader;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement linkageGroupNameInput;

	@FindBy(xpath = "//input[@name='description']")
	private WebElement linkageGroupDescriptionInput;

	@FindBy(xpath = "(//div[.='Next'])[2]")
	private WebElement nextButton;

	@FindBy(xpath = "//h2[.='Input Devices']")
	private WebElement inputDevicesHeader;

	@FindBy(xpath = "//span[.='Add']")
	private WebElement addButton;
	
	@FindBy(xpath = "//span[.='Add Device']")
	private WebElement addDeviceButton;

	@FindBy(xpath = "//div[contains(text(),'Site_jHn-1')]")
	private WebElement firstSite;

	@FindBy(xpath = "//*[contains(text(), 'Building_')]")
	private WebElement firstBuilding;

	@FindBy(xpath = "//*[contains(text(), 'Floor-')]")
	private WebElement firstFloor;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement inputDeviceCheckbox2;

	@FindBy(xpath = "(//label[@class='inline-flex items-center cursor-pointer '])[2]")
	private WebElement deviceCheckbox2;

	@FindBy(xpath = "(//label[@class='inline-flex items-center cursor-pointer '])[3]")
	private WebElement deviceCheckbox3;

	@FindBy(xpath = "(//span[.='Select Category'])[2]")
	private WebElement selectCategoryDropdown;
	
	@FindBy(xpath = "(//span[.='Select Category'])[2]")
	private WebElement firstDeviceCategoryDropdown;

	@FindBy(xpath = "//span[.='Alarm']")
	private WebElement firstDeviceCategoryAlarm;

	@FindBy(xpath = "(//span[.='Select Content/Signal'])[2]")
	private WebElement firstDeviceContentSignalDropdown;

	@FindBy(xpath = "//span[.='Card Reader Abnormal']")
	private WebElement firstDeviceContentCardReaderAbnormal;

	@FindBy(xpath = "(//span[.='Select Category'])[2]") // reused locator for second device
	private WebElement secondDeviceCategoryDropdown;

	@FindBy(xpath = "(//span[.='Alarm'])[3]")
	private WebElement secondDeviceCategoryAlarm;

	@FindBy(xpath = "(//span[.='Select Content/Signal'])[2]") // reused locator for second device
	private WebElement secondDeviceContentSignalDropdown;

	@FindBy(xpath = "//span[.='Abnormal Open Alarm']")
	private WebElement secondDeviceContentAbnormalOpen;
	
	@FindBy(xpath = "(//div[.='Next'])[2]")
	private WebElement nextButtonAfterDevices;
	
	// Next button after adding devices/interlocks

	// Input checkbox for control devices
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement firstControlDeviceCheckbox;

	// Device category/content signals
	@FindBy(xpath = "(//span[.='Select Content/Signal'])[2]")
	private WebElement selectContentSignal2;

	@FindBy(xpath = "//span[.='Unlock / Lock Control (Entry side)']")
	private WebElement firstControlSignal;

	@FindBy(xpath = "//span[.='Unlock / Lock Control (Exit side)']")
	private WebElement secondControlSignal;


	// Label to verify after saving control devices
	@FindBy(xpath = "//label")
	private WebElement controlDeviceLabel;
	
	// Control device selection checkboxes (3rd and 4th)
	@FindBy(xpath = "(//label[@class='inline-flex items-center cursor-pointer '])[3]")
	private WebElement thirdControlDeviceCheckbox;

	@FindBy(xpath = "(//label[@class='inline-flex items-center cursor-pointer '])[4]")
	private WebElement fourthControlDeviceCheckbox;
	
	// Expand configuration section
	@FindBy(xpath = "//*[@id='create-device-linkageGroup-form']/div/div[1]/div[2]/h2/div")
	private WebElement configurationAccordion;

	// Input Condition
	@FindBy(xpath = "(//span[.='Select Input Condition'])[1]")
	private WebElement selectInputConditionDropdown;

	@FindBy(xpath = "//span[.='ON']")
	private WebElement inputConditionON;

	// Operation
	@FindBy(xpath = "(//span[.='Select Operation'])[1]")
	private WebElement selectOperationDropdown;

	@FindBy(xpath = "//span[.='AND']")
	private WebElement operationAND;

	// Recovery Option
	@FindBy(xpath = "(//span[.='Select Recovery'])[1]")
	private WebElement selectRecoveryDropdown;
	
	@FindBy(xpath = "(//span[.='Select Recovery Option'])[1]")
	private WebElement selectRecoveryOptionDropdown;

	@FindBy(xpath = "//span[.='Control']")
	private WebElement recoveryControl;

	// Output Delay
	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement outputDelayInput;

	// Success Message
	@FindBy(xpath = "//p[contains(text(),'successfully')]")
	private WebElement successMessage;

	// Edit Linkage Group
	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editButton;

	@FindBy(xpath = "//h1[.='Edit Device Linkage Group']")
	private WebElement editHeader;

	@FindBy(xpath = "(//div[.='Next'])[1]")
	private WebElement nextButtonStep1;

	@FindBy(xpath = "(//div[.='Next'])[2]")
	private WebElement nextButtonStep2;

	// Cancel / Save
	@FindBy(xpath = "//span[.='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//h3[.='Linkage Groups']")
	private WebElement linkageGroupsHeader;
	
	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteButton;

	@FindBy(xpath = "(//span[.='Delete'])[2]")
	private WebElement confirmDeleteButton;
	

	// Headers
	@FindBy(xpath = "//h1[.='Create Fire Alarm Linkage Group']")
	private WebElement createFireAlarmHeader;
	
	@FindBy(xpath = "//h1[.='Edit Fire Alarm Linkage Group']")
	private WebElement editFireAlarmHeader;



	// Device selection
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement inputDeviceCheckbox;
	

	// Category options
	@FindBy(xpath = "//span[.='Alarm']")
	private WebElement firstAlarmOption;

	@FindBy(xpath = "(//span[.='Alarm'])[3]")
	private WebElement thirdAlarmOption;

	// Content/Signal dropdown
	@FindBy(xpath = "(//span[.='Select Content/Signal'])[2]")
	private WebElement selectContentSignalDropdown;

	// Content/Signal options
	@FindBy(xpath = "//span[.='Card Reader Abnormal']")
	private WebElement cardReaderAbnormalOption;

	@FindBy(xpath = "//span[.='Abnormal Open Alarm']")
	private WebElement abnormalOpenAlarmOption;
	

	// Output Control
	@FindBy(xpath = "//span[.='Select Output Control']")
	private WebElement selectOutputControlDropdown;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	private WebElement firstOutputOption;

	// Recovery
	@FindBy(xpath = "//span[.='Select Recovery']")
	private WebElement RecoveryDropdown;

	@FindBy(xpath = "//span[.='Manual']")
	private WebElement manualRecoveryOption;



	@FindBy(xpath = "//span[.='Card Reader Control']")
	private WebElement cardReaderControlOption;

	@FindBy(xpath = "//span[.='Unlock / Lock control']")
	private WebElement unlockLockControlOption;


	@FindBy(xpath = "//span[.='Save']")
	private WebElement saveButton;




	public void navigateToAccountManagement() {

	    waitUtils.waitAndClick(sideBar);
	    waitUtils.waitAndClick(accountManagementMenu);

	    trackStep("Load Account Management Page");
	    waitUtils.waitForElementVisible(accountCheckbox);
	    waitUtils.waitForElementVisible(superAdminProfile);
	    endStep();
	    
	    waitUtils.waitForMillis(2000);
	    
	}
	
	
	public String getAccountName() {
		return utils.ConfigFileReader.getConfigProperty("Account" + CommonMethods.getRandomLong(1, 14));
	}
	
	public void searchAccount(String accountName) {
		
		waitUtils.waitForElementClickable(superAdminProfile).click();

	    waitUtils.waitAndClick(accountManagementHeader);

	    waitUtils.waitForMillis(2000);
	    waitUtils.waitForElementVisible(searchAccountBox).sendKeys("Performance Account WebTest");;
//	    searchAccountBox.clear();
//	    waitUtils.waitAndSendKeys(searchAccountBox, accountName);

	    trackStep("Search the Added Account");
	    waitUtils.waitForElementVisible(performanceAccountLink);
	    endStep();
	    
	    waitUtils.waitForMillis(2000);
	}
	
	public void openAccountDetails() {
		

	    waitUtils.waitAndClick(performanceAccountLink);

	    trackStep("Load Account Details");
	    waitUtils.waitForElementVisible(accountSettingsTab);
	    endStep();
	}
	
	public void navigateToManageLinkageGroups() {

		waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(accountSettingsTab);
	    waitUtils.waitAndClick(manageLinkageGroupsButton);

	    trackStep("Load Manage Linkage Group Page");
	    waitUtils.waitForElementVisible(manageLinkageGroupsHeader);
	    waitUtils.waitForElementVisible(deviceLinkageGroupTab);
	    waitUtils.waitForElementVisible(fireAlarmLinkageGroupTab);
	    endStep();
	}
	
	public void selectSite() {

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(siteElement);

	    trackStep("Load Building After Selecting Site for Linkage Group");
	    waitUtils.waitForElementVisible(buildingElement);
	    endStep();
	}
	
	public void selectBuilding() {

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(buildingName);

	    trackStep("Load Floor After Selecting Building for Linkage Group");
	    waitUtils.waitForElementVisible(floorName);
	    endStep();
	}
	
	public void selectFloor() {

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(floorName);

	    trackStep("Load Available Controller After Selecting Floor for Linkage Group");
	    waitUtils.waitForElementVisible(testController);
	    waitUtils.waitForElementVisible(myController);
	    endStep();
	}
	
	public void selectControllerAndDeviceLinkage() {

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(testController);
	    waitUtils.waitAndClick(deviceLinkageGroupTab);
	}
	
	public void loadCreateLinkageGroupPage() {
	    
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(createButton);

	    trackStep("Load Create Linkage Group Page");
	    waitUtils.waitForElementVisible(createLinkageGroupHeader);
	    waitUtils.waitForElementVisible(linkageGroupNameInput);
	    endStep();
	}
	
	public void fillLinkageGroupDetails(String name, String description) {
		
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(linkageGroupNameInput);
	    linkageGroupNameInput.clear();
	    linkageGroupNameInput.sendKeys(name);

	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(linkageGroupDescriptionInput);
	    linkageGroupDescriptionInput.clear();
	    linkageGroupDescriptionInput.sendKeys(description);

	    waitUtils.waitAndClick(nextButton);

	    trackStep("Save Linkage Group Details");
	    waitUtils.waitForElementVisible(inputDevicesHeader);
	    waitUtils.waitForElementVisible(addDeviceButton);
	    endStep();
	}
	
	public void addInputDevices() {
		
		waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(addDeviceButton);

	    // --- Site ---
	    waitUtils.waitAndClick(firstSite);
	    waitUtils.waitForMillis(2000);
	    trackStep("Load Building After Selecting Site for Adding Input Device");
	    waitUtils.waitForElementVisible(firstBuilding);
	    endStep();

	    // --- Building ---
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitForElementVisible(firstBuilding);
	    firstBuilding.click();
	    trackStep("Load Floor After Selecting Building for Adding Input Device");
	    waitUtils.waitForElementVisible(firstFloor);
	    endStep();

	    // --- Floor ---
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(firstFloor);
	    trackStep("Load Available Input Devices After Selecting Floor");
	    waitUtils.waitForElementVisible(inputDeviceCheckbox2);
//	    waitUtils.waitForElementVisible(addDeviceButton);
	    endStep();
	    
	    waitUtils.waitForMillis(2000);
	}
	
	public void selectDevicesAndAdd() {
	    waitUtils.waitAndClick(deviceCheckbox2);
	    waitUtils.waitAndClick(deviceCheckbox3);
	    waitUtils.waitAndClick(addButton);

	    trackStep("Load Add Device Category and Content/Signal");
	    waitUtils.waitForElementVisible(selectCategoryDropdown);
	    waitUtils.waitForElementVisible(addDeviceButton);
	    endStep();
	}

	public void selectFirstDeviceCategoryAndSignal() {
		waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(firstDeviceCategoryDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(firstDeviceCategoryAlarm);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(firstDeviceContentSignalDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(firstDeviceContentCardReaderAbnormal);
	}

	public void selectSecondDeviceCategoryAndSignal() {
		waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(secondDeviceCategoryDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(secondDeviceCategoryAlarm);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(secondDeviceContentSignalDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(secondDeviceContentAbnormalOpen);
	}

	public void saveAddedInputDevices() {
		
		waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(nextButtonAfterDevices);

	    trackStep("Save Added Input Devices to Linkage Group");
	    waitUtils.waitForElementVisible(nextButtonAfterDevices);
	    endStep();

	    // Optional: small pause to mimic previous Thread.sleep
	    waitUtils.waitForMillis(2000);
	    
	    waitUtils.waitForElementVisible(nextButtonAfterDevices).click();
	}
	
	public void navigateToFloorForControlDevices() {
		
		waitUtils.waitForMillis(1000);
		waitUtils.waitForElementVisible(addDeviceButton).click();
		
	    waitUtils.waitAndClick(firstSite);
	   

	    trackStep("Load Building After Selecting Site for Adding Control Devices");
	    waitUtils.waitForElementVisible(firstBuilding);
	    endStep();
	    
	    waitUtils.waitForMillis(1000);
	    firstBuilding.click();
	    trackStep("Load Floor After Selecting Building for Adding Control Devices");
	    waitUtils.waitForElementVisible(firstFloor);
	    endStep();

	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(firstFloor);
	    
	    trackStep("Load Available Control Devices After Selecting Floor");
	    waitUtils.waitForElementVisible(firstControlDeviceCheckbox);
	    endStep();
	}
	
	public void addControlDevices() {
		
		
//	    waitUtils.waitAndClick(firstControlDeviceCheckbox);
	    waitUtils.waitForMillis(2000);

	    // Select devices via inline-flex checkboxes (assuming indexes)
	    waitUtils.waitAndClick(thirdControlDeviceCheckbox);
	    waitUtils.waitAndClick(fourthControlDeviceCheckbox);
	    waitUtils.waitForMillis(2000);

	    waitUtils.waitAndClick(addButton);
	    waitUtils.waitForMillis(2000);

	    // Select content/signals for devices
	    waitUtils.waitAndClick(selectContentSignal2);
	    waitUtils.waitAndClick(firstControlSignal);
	    waitUtils.waitForMillis(2000);

	    waitUtils.waitAndClick(selectContentSignal2);
	    waitUtils.waitAndClick(secondControlSignal);
	    waitUtils.waitForMillis(2000);

	    waitUtils.waitAndClick(addDeviceButton);
	}
	
	public void saveAddedControlDevices() {
	    waitUtils.waitAndClick(nextButton);

	    trackStep("Save Added Control Devices to Linkage Group");
	    waitUtils.waitForElementVisible(controlDeviceLabel);
	    waitUtils.waitForElementVisible(nextButton);
	    endStep();

	    waitUtils.waitForMillis(2000);
	}
	
	public void configureLinkageGroupLogic() {

	    waitUtils.waitAndClick(configurationAccordion);

	    // Input Condition
	    waitUtils.waitAndClick(selectInputConditionDropdown);
	    waitUtils.waitAndClick(inputConditionON);

	    // Operation
	    waitUtils.waitAndClick(selectOperationDropdown);
	    waitUtils.waitAndClick(operationAND);

	    // Recovery Option
	    waitUtils.waitAndClick(selectRecoveryOptionDropdown);
	    waitUtils.waitAndClick(recoveryControl);

	    // Output Delay
	    waitUtils.waitAndClick(outputDelayInput);
	    outputDelayInput.clear();
	    outputDelayInput.sendKeys("5");
	}
	
	public void createLinkageGroup() {

	    waitUtils.waitAndClick(createButton);

	    trackStep("Time to Create Linkage Group");
	    waitUtils.waitForElementVisible(successMessage);
	    endStep();

	    waitUtils.waitForMillis(2000);
	}
	
	public void openEditLinkageGroup() {

	    waitUtils.waitAndClick(editButton);

	    trackStep("Time to Load Linkage Group Details");
	    waitUtils.waitForElementVisible(editHeader);
	    waitUtils.waitForElementVisible(nextButtonStep1);
	    endStep();
	}
	
	public void updateLinkageGroupName(String updatedName) {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(linkageGroupNameInput);
	    linkageGroupNameInput.clear();
	    linkageGroupNameInput.sendKeys(updatedName);

	    // Navigate through steps
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(nextButtonStep2);
	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(nextButtonStep2);
	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(nextButtonStep2);
	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(nextButtonStep2);
	    waitUtils.waitForMillis(500);

	    // Currently cancel (replace with Save when working)
	    waitUtils.waitAndClick(cancelButton);

	    trackStep("Time to Update Linkage Group");
	    waitUtils.waitForElementVisible(linkageGroupsHeader);
	    endStep();
	    waitUtils.waitForMillis(1000);
	}

	public void deleteLinkageGroup() {

	    waitUtils.waitAndClick(deleteButton);
	    waitUtils.waitForMillis(2000);

	    waitUtils.waitAndClick(confirmDeleteButton);

	    trackStep("Time to Delete Linkage Group");
	    waitUtils.waitForElementVisible(successMessage);
	    endStep();

	    waitUtils.waitForMillis(2000);
	}
	
	public void openCreateFireAlarmLinkageGroup() {

	    waitUtils.waitAndClick(fireAlarmLinkageGroupTab);
	    waitUtils.waitAndClick(createButton);

	    trackStep("Load Create Fire Alarm Linkage Group Page");
	    waitUtils.waitForElementVisible(createFireAlarmHeader);
	    waitUtils.waitForElementVisible(linkageGroupNameInput);
	    endStep();
	}
	
	public void fillFireAlarmLinkageGroupDetails(String name, String description) {

	    waitUtils.waitAndClick(linkageGroupNameInput);
	    linkageGroupNameInput.clear();
	    linkageGroupNameInput.sendKeys(name);

	    waitUtils.waitAndClick(linkageGroupDescriptionInput);
	    linkageGroupDescriptionInput.clear();
	    linkageGroupDescriptionInput.sendKeys(description);

	    waitUtils.waitAndClick(nextButton);

	    trackStep("Save Fire Alarm Linkage Group Details");
	    waitUtils.waitForElementVisible(inputDevicesHeader);
	    waitUtils.waitForElementVisible(addDeviceButton);
	    endStep();
	}
	
	public void addFireAlarmInputDevices() {

	    waitUtils.waitAndClick(addDeviceButton);

	    // Site
	    waitUtils.waitAndClick(firstSite);
	    trackStep("Load Building After Selecting Site for Adding Input Device");
	    waitUtils.waitForElementVisible(firstBuilding);
	    endStep();

	    // Building
	    waitUtils.waitAndClick(firstBuilding);
	    trackStep("Load Floor After Selecting Building for Adding Input Device");
	    waitUtils.waitForElementVisible(firstFloor);
	    endStep();

	    // Floor
	    waitUtils.waitAndClick(firstFloor);
	    trackStep("Load Available Input Devices After Selecting Floor");
	    waitUtils.waitForElementVisible(inputDeviceCheckbox);
	    waitUtils.waitForElementVisible(addButton);
	    endStep();

	    // Select devices
	    waitUtils.waitAndClick(deviceCheckbox2);
	    waitUtils.waitAndClick(deviceCheckbox3);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(addButton);

	    trackStep("Load FireAlarm Add Device Category and Content/Signal");
	    waitUtils.waitForElementVisible(selectCategoryDropdown);
	    waitUtils.waitForElementVisible(addDeviceButton);
	    endStep();
	}
	
	public void selectFirstFireAlarmDeviceDetails() {

	    // Select Category
		waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(selectCategoryDropdown);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(firstAlarmOption);

	    // Select Content/Signal
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitForElementVisible(selectContentSignalDropdown).click();
	    
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(cardReaderAbnormalOption);
	}
	
	public void selectSecondFireAlarmDeviceDetails() {

	    // Select Category
		 waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(selectCategoryDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(thirdAlarmOption);

	    // Select Content/Signal
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(selectContentSignalDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(abnormalOpenAlarmOption);
	}
	
	public void saveAddedInputDevicesFireAlarm() {

		waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(nextButton);

	    trackStep("Save Added Input Devices to Fire Alarm Linkage Group");
	    waitUtils.waitForElementVisible(nextButton);
	    endStep();
	}
	
	public void configureOutputAndRecovery() {

		waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(selectOutputControlDropdown);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(firstOutputOption);

	    waitUtils.waitAndClick(selectRecoveryDropdown);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(manualRecoveryOption);
	    
	    waitUtils.waitForElementVisible(addDeviceButton).click();

	
	}
	
	public void navigateToFloorForFireAlarmControlDevices() {
		
		waitUtils.waitForMillis(2000);
		
	    waitUtils.waitAndClick(firstSite);
	   

	    trackStep("Load Building After Selecting Site for Adding Control Devices");
	    waitUtils.waitForElementVisible(firstBuilding);
	    endStep();
	    
	    waitUtils.waitForMillis(1000);
	    firstBuilding.click();
	    trackStep("Load Floor After Selecting Building for Adding Control Devices");
	    waitUtils.waitForElementVisible(firstFloor);
	    endStep();

	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(firstFloor);
	    
	    trackStep("Load Available Control Devices After Selecting Floor");
	    waitUtils.waitForElementVisible(firstControlDeviceCheckbox);
	    endStep();
	}
	
	
	public void addControlDevicesFireAlarm() {
		

	    // Use your reusable navigateToFloor() method here
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(deviceCheckbox2);
	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(deviceCheckbox3);
	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(addButton);

	    trackStep("Add Control Devices FireAlarm");
	    waitUtils.waitForElementVisible(selectContentSignalDropdown);
	    endStep();

	    // Device 1
	    waitUtils.waitAndClick(selectContentSignalDropdown);
	    waitUtils.waitAndClick(cardReaderControlOption);

	    // Device 2
	    waitUtils.waitAndClick(selectContentSignalDropdown);
	    waitUtils.waitAndClick(firstControlSignal);
	}
	
	public void createFireAlarmLinkageGroup() {

		waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(createButton);

	    trackStep("Create Fire Alarm Linkage Group");
	    waitUtils.waitForElementVisible(successMessage);
	    endStep();
	}
	
	public void editAndUpdateFireAlarmGroup(String updatedName) {

	   
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(editButton);

	    trackStep("Open Fire Alarm Linkage Group");
	    waitUtils.waitForElementVisible(editFireAlarmHeader);
	    endStep();

	    waitUtils.waitForMillis(500);
	    waitUtils.waitAndClick(linkageGroupNameInput);
	    linkageGroupNameInput.clear();
	    linkageGroupNameInput.sendKeys(updatedName);

	    
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(nextButton);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(nextButton);

	    waitUtils.waitAndClick(saveButton);

	    trackStep("Update Fire Alarm Linkage Group");
	    waitUtils.waitForElementVisible(successMessage);
	    endStep();
	}
	
	public void deleteFireAlarmLinkageGroup() {

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(deleteButton);
	    waitUtils.waitAndClick(confirmDeleteButton);

	    trackStep("Delete Fire Alarm Linkage Group");
	    waitUtils.waitForElementVisible(successMessage);
	    endStep();

	    System.out.println("-----------------------Manage Linkage group flow Completed");
	}
	
}
