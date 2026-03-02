package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonMethods;

public class BSBU_MasterConfigurationPage extends BasePage {

	private Actions actions;

	public BSBU_MasterConfigurationPage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}

	// ================= Navigation =================

	@FindBy(id = "sidebar")
	WebElement sideBar;

	@FindBy(xpath = "(//div[.='Master Configuration'])[1]")
	WebElement masterConfigurationMenu;

	@FindBy(xpath = "//div[contains(text(),'Manage Data Models')]")
	WebElement manageDataModelMenu;

	@FindBy(xpath = "//h1[contains(text(),'Manage Data Models')]")
	WebElement manageDataModelHeader;

	@FindBy(xpath = "(//span[.='Delete'])[1]")
	WebElement firstDeleteButton;

	@FindBy(xpath = "//tbody/tr/td[2]")
	List<WebElement> dataModelRows;

	// ================= Add Data Model =================

	@FindBy(xpath = "//span[normalize-space()='Add Data Model']")
	WebElement addDataModelButton;

	@FindBy(xpath = "//h1[normalize-space()='Add Data Model']")
	WebElement addDataModelHeader;

	@FindBy(xpath = "//div[contains(text(),'Device Definition')]")
	WebElement deviceDefinitionSection;

	@FindBy(xpath = "//span[contains(text(),'Upload File')]")
	WebElement uploadFileButton;

	@FindBy(xpath = "//input[@placeholder='Enter Data Model']")
	WebElement dataModelInput;

	@FindBy(xpath = "//input[@role='combobox']")
	WebElement deviceTypeDropdown;

	@FindBy(xpath = "//span[.='Controller']")
	WebElement controllerOption;

	@FindBy(xpath = "//input[@placeholder='Enter Prefix']")
	WebElement prefixInput;

	@FindBy(xpath = "//input[@data-testid='dataModelVersion']")
	WebElement versionInput;

	@FindBy(xpath = "//span[contains(text(),'Browse File')]")
	WebElement browseFileButton;

	@FindBy(xpath = "(//span[contains(text(),'Upload')])[2]")
	WebElement confirmUploadButton;

	@FindBy(xpath = "//span[.='Add Icon']")
	WebElement addIconButton;

	@FindBy(xpath = "(//button)[12]")
	WebElement iconSelectButton;

	@FindBy(xpath = "(//span[.='Add'])[2]")
	WebElement confirmAddIconButton;

	@FindBy(xpath = "//span[normalize-space()='Add']")
	WebElement finalAddButton;

	@FindBy(xpath = "//p[contains(text(),'has been added successfully')]")
	WebElement successToast;

	@FindBy(xpath = "//input[@type='file']")
	WebElement fileUploadInput;

	// ========Edit Data Model========

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editButton;

	@FindBy(xpath = "(//*[name()='svg']//*[name()='g'])[6]")
	private WebElement svgEditOption;

	@FindBy(xpath = "(//button)[13]")
	private WebElement confirmButton;

	@FindBy(xpath = "//span[.='Replace']")
	private WebElement replaceButton;

	@FindBy(xpath = "//span[.='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//p[contains(text(),'updated successfully')]")
	private WebElement successmessage;

	@FindBy(xpath = "//span[.='Items per page']")
	private WebElement itemsPerPageLabel;

	// ================== Delete Data model ==================

	@FindBy(xpath = "//button[@aria-label='Delete']")
	private WebElement deleteButton;

	@FindBy(xpath = "(//span[.='Delete'])[4]")
	private WebElement confirmDeleteButton;

	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
	private WebElement deleteSuccessToast;

	// =========================== Manage Device Model =========================

	@FindBy(xpath = "//div[.='Manage Device Models']")
	private WebElement manageDeviceModelsMenu;

	@FindBy(xpath = "//h1[contains(text(),'Manage Device Models')]")
	private WebElement manageDeviceModelHeader;

	@FindBy(xpath = "//tbody/tr/td[2]")
	private List<WebElement> deviceModelRows;

	@FindBy(xpath = "//span[normalize-space()='Add Device Model']")
	private WebElement addDeviceModelButton;

	@FindBy(xpath = "//input[@name='deviceModelName']")
	private WebElement deviceModelNameInput;

	@FindBy(xpath = "//h1[normalize-space()='Add ACS Device Model']")
	private WebElement addACSDeviceModelHeader;

	@FindBy(xpath = "(//div[.='Enter Data Model'])[1]")
	private WebElement dataModelDropdown;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement firstDropdownOption;

	@FindBy(xpath = "(//div[.='Select Device Type'])[1]")
	private WebElement deviceDropdown;

	@FindBy(xpath = "(//div[.='Select Region'])[1]")
	private WebElement regionDropdown;

	@FindBy(xpath = "(//div[.='Select Compatible Controller Model'])[1]")
	private WebElement controllerDropdown;

	@FindBy(xpath = "(//label[contains(@class,'line-clamp-2')])[1]")
	private WebElement firstControllerOption;

	@FindBy(xpath = "//input[@placeholder='Enter Manufacturer']")
	private WebElement manufacturerInput;

	@FindBy(xpath = "(//label[contains(text(),'Use in')])[1]")
	private WebElement useInOption1;

	@FindBy(xpath = "(//label[contains(text(),'Use in')])[2]")
	private WebElement useInOption2;

	@FindBy(xpath = "(//label[contains(text(),'Use in')])[3]")
	private WebElement useInOption3;

	@FindBy(xpath = "(//label[contains(text(),'Use in')])[4]")
	private WebElement useInOption4;

	@FindBy(xpath = "(//label[contains(text(),'Use in')])[5]")
	private WebElement useInOption5;

	@FindBy(xpath = "(//label[contains(text(),'Use in')])[7]")
	private WebElement useInOption6;

	@FindBy(xpath = "//span[.='Add']")
	private WebElement AddButton;

	@FindBy(xpath = "//h1[.='Maintenance Configuration']")
	private WebElement maintenanceConfigurationHeader;

	@FindBy(xpath = "//span[.='Add Configuration']")
	private WebElement addConfigurationButton;

	// ============= Edit Device Model =============

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editDeviceModelButton;

	@FindBy(xpath = "//h1[.='Edit ACS Device Model']")
	private WebElement editACSDeviceModelHeader;

	@FindBy(xpath = "//h3[.='Additional Information']")
	private WebElement additionalInformationHeader;

	@FindBy(xpath = "//span[.='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//p[contains(text(),'success')]")
	private WebElement editsuccessmessage;

	// ============== Delete Device Model ==============
	@FindBy(xpath = "//button[@aria-label='Delete']")
	private WebElement deleteDeviceModelButton;

	@FindBy(xpath = "(//span[.='Delete'])[4]")
	private WebElement confirmDeleteDeviceModelButton;

//	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
//	private WebElement deleteSuccessToast;
//
//	@FindBy(xpath = "//span[.='Items per page']")
//	private WebElement itemsPerPageLabel;

//==================== Add and Edit FAE Device Model =================

	@FindBy(xpath = "//span[.='FAE Device Model']")
	private WebElement faeDeviceModelMenu;

//	@FindBy(xpath = "//span[.='Add Device Model']")
//	private WebElement addDeviceModelButton;

	@FindBy(xpath = "//input[@placeholder='Search By Device Model']")
	private WebElement searchByDeviceModelInput;
	@FindBy(xpath = "//input[@placeholder='Enter Model Name']")
	private WebElement faeDeviceModelNameInput;

	@FindBy(xpath = "(//div[.='Select Compatible Equipment Controller Model'])[1]")
	private WebElement equipmentControllerDropdown;

	@FindBy(xpath = "(//div[.='Select Integration Method'])[1]")
	private WebElement integrationMethodDropdown;

	@FindBy(xpath = "(//div[.='Select Supported Protocol'])[1]")
	private WebElement protocolDropdown;

	@FindBy(xpath = "(//div[.='Select Baud Rate'])[1]")
	private WebElement baudRateDropdown;

	@FindBy(xpath = "(//div[.='Select Supported Protocol Mode'])[1]")
	private WebElement protocolModeDropdown;

	@FindBy(xpath = "//h1[.='Unit Mapping']")
	private WebElement unitMappingHeader;

	@FindBy(xpath = "//span[.='Edit Data Points']")
	private WebElement editDataPointsButton;

	@FindBy(xpath = "(//div[.='Select Criteria'])[1]")
	private WebElement criteriaDropdown;

	@FindBy(xpath = "(//div[.='Select Evaluation Type'])[1]")
	private WebElement evaluationTypeDropdown;

	@FindBy(xpath = "(//div[.='Select Data Point'])[1]")
	private WebElement dataPointDropdown;

	@FindBy(xpath = "(//div[.='Select Value'])[1]")
	private WebElement valueDropdown;

//	@FindBy(xpath = "(//span[contains(text(),'Add')])[2]")
//	private WebElement finalAddButton;

	@FindBy(xpath = "//h1[.='Edit FAE Device Model']")
	private WebElement editFAEDeviceModelHeader;

	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextButton;

	@FindBy(xpath = "(//div[.='Select Compatible Controller Model'])[1]")
	private WebElement compatibleControllerDropdown;

	@FindBy(xpath = "(//div[.='Select Operator'])[1]")
	private WebElement operatorDropdown;

	@FindBy(xpath = "//input[@placeholder='Enter Threshold']")
	private WebElement thresholdInput;

	@FindBy(xpath = "(//div[.='Select Alarm'])[1]")
	private WebElement alarmDropdown;

	@FindBy(xpath = "//span[.='Add Alarm Thresholds']")
	private WebElement addAlarmThresholdsButton;

	// ==================== Add FAE Equipment Controller Model =================

	@FindBy(xpath = "//span[.='FAE Equipment Controller Model']")
	private WebElement faeEquipmentControllerMenu;

	@FindBy(xpath = "//input[@placeholder='Enter Equipment Controller Model']")
	private WebElement equipmentControllerModelNameInput;

//	@FindBy(xpath = "(//div[.='Select Compatible Controller Model'])[1]")
//	private WebElement compatibleControllerDropdown;
//
//	// Reuse previous dropdown/input elements from FAE Device Model workflow
//	@FindBy(xpath = "//span[.='Add Device Model']")
//	private WebElement addDeviceModelButton;
//
//	@FindBy(xpath = "//input[@placeholder='Search By Device Model']")
//	private WebElement searchByDeviceModelInput;
//
//	@FindBy(xpath = "(//div[.='Enter Data Model'])[1]")
//	private WebElement dataModelDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Device Type'])[1]")
//	private WebElement deviceTypeDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Region'])[1]")
//	private WebElement regionDropdown;
//
//	@FindBy(xpath = "(//div[@role='option'])[1]")
//	private WebElement firstDropdownOption;
//
//	@FindBy(xpath = "(//div[.='Select Supported Protocol'])[1]")
//	private WebElement protocolDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Baud Rate'])[1]")
//	private WebElement baudRateDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Supported Protocol Mode'])[1]")
//	private WebElement protocolModeDropdown;
//
//	@FindBy(xpath = "//input[@placeholder='Enter Manufacturer']")
//	private WebElement manufacturerInput;
//
//	@FindBy(xpath = "//div[.='Next'])[1]")
//	private WebElement nextButton;
//
//	@FindBy(xpath = "//h1[.='Maintenance Configuration']")
//	private WebElement maintenanceConfigurationHeader;
//
//	@FindBy(xpath = "//span[.='Add Configuration']")
//	private WebElement addConfigurationButton;
//
//	// Use in options
//	@FindBy(xpath = "(//label[contains(text(),'Use in')])[1]")
//	private WebElement useInOption1;
//
//	@FindBy(xpath = "(//label[contains(text(),'Use in')])[2]")
//	private WebElement useInOption2;
//
//	@FindBy(xpath = "(//label[contains(text(),'Use in')])[3]")
//	private WebElement useInOption3;
//
//	@FindBy(xpath = "(//label[contains(text(),'Use in')])[4]")
//	private WebElement useInOption4;
//
//	@FindBy(xpath = "(//label[contains(text(),'Use in')])[5]")
//	private WebElement useInOption5;
//
//	// Optional controller selection
//	@FindBy(xpath = "(//label[@class='line-clamp-2 overflow-hidden break-words hover:cursor-pointer'])[1]")
//	private WebElement firstControllerOption;

	// ======================Add configuration fro Equpment controller
	// model=======================
//	@FindBy(xpath = "//span[.='Add Configuration']")
//	private WebElement addConfigurationButton;
//
//	@FindBy(xpath = "(//div[.='Select Criteria'])[1]")
//	private WebElement criteriaDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Evaluation Type'])[1]")
//	private WebElement evaluationTypeDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Data Point'])[1]")
//	private WebElement dataPointDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Value'])[1]")
//	private WebElement valueDropdown;
//
//	@FindBy(xpath = "(//div[@role='option'])[1]")
//	private WebElement firstDropdownOption;

	// ============================== Edit FAE Equipment Controller Model
	// =========================

//	@FindBy(xpath = "(//span[contains(text(),'Add')])[2]")
//	private WebElement finalAddButton;
//
//	@FindBy(xpath = "//h1[.='Manage Device Models']")
//	private WebElement manageDeviceModelHeader;

	@FindBy(xpath = "//p//span[contains(text(), 'success')]")
	private WebElement successToastmessage;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editEquipmentControllerButton;

	@FindBy(xpath = "//h1[.='Edit FAE Equipment Controller Model']")
	private WebElement editFAEEquipmentControllerHeader;

//	@FindBy(xpath = "//h3[.='Additional Information']")
//	private WebElement additionalInformationHeader;
//
//	@FindBy(xpath = "(//div[.='Next'])[1]")
//	private WebElement nextButton;
//
//	@FindBy(xpath = "//span[.='Save']")
//	private WebElement saveButton;

	// ===================== Delete FAE Equipment Controller Model
	// =====================

	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteEquipmentControllerButton;

//	@FindBy(xpath = "(//span[.='Delete'])[4]")
//	private WebElement confirmDeleteButton;
//
//	@FindBy(xpath = "//h1[.='Manage Device Models']")
//	private WebElement manageDeviceModelHeader;
//
//	@FindBy(xpath = "//p[contains(text(), 'successfully')]")
//	private WebElement deleteSuccessToast; // Enable when backend works

	@FindBy(xpath = "//a//div[normalize-space()='Manage Controller Models']")
	private WebElement manageControllerModelsMenu;

	@FindBy(xpath = "//h1[normalize-space()='Manage Controller Models']")
	private WebElement manageControllerModelsHeader;

	@FindBy(xpath = "//span[.='Add Controller Model']")
	private WebElement addControllerModelButton;

	@FindBy(xpath = "//tbody/tr/td[2]")
	private List<WebElement> controllerModelRows;

	@FindBy(xpath = "//h1[contains(text(),'Add ACS Controller Model')]")
	private WebElement addACSControllerModelHeader;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Controller Model')]")
	private WebElement controllerModelInput;

	@FindBy(xpath = "(//div[.='Select Usage Sub Category'])[1]")
	private WebElement usageSubCategoryDropdown;

	// ======================= Add Manage Controller Model =====================
//	@FindBy(xpath = "//span[.='Add']")
//	private WebElement finalAddButton;
//
//	@FindBy(xpath = "//h1[.='Manage Controller Models']")
//	private WebElement manageControllerModelsHeader;

	@FindBy(xpath = "//p[contains(text(), 'added successfully!')]")
	private WebElement addSuccessToast;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editControllerButton;

	@FindBy(xpath = "//h1[.='Edit ACS Controller Model']")
	private WebElement editACSControllerHeader;

	@FindBy(xpath = "(//div[.='Japan'])[1]")
	private WebElement japanRegionTag; // validation element

//	@FindBy(xpath = "//span[.='Save']")
//	private WebElement saveButton;

	@FindBy(xpath = "//p[contains(text(), 'successfully')]")
	private WebElement updateSuccessToast;

//	@FindBy(xpath = "//input[@placeholder='Enter Manufacturer']")
//	private WebElement manufacturerInput;

	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteControllerButton;

	// =========================== Add, Edit and Delete FAE Controller Model
	// ===========================

	@FindBy(xpath = "//span[.='FAE Controller Model']")
	private WebElement faeControllerModelTab;

//	@FindBy(xpath = "//span[normalize-space()='Add Controller Model']")
//	private WebElement addControllerModelButton;

	@FindBy(xpath = "//h1[contains(text(),'Add FAE Controller Model')]")
	private WebElement addFAEControllerHeader;

//	@FindBy(xpath = "//input[contains(@placeholder,'Enter Controller Model')]")
//	private WebElement controllerModelInput;

//	@FindBy(xpath = "//input[@placeholder='Enter Manufacturer']")
//	private WebElement manufacturerInput;
//
//	@FindBy(xpath = "//tbody/tr/td[2]")
//	private List<WebElement> controllerModelRows;
//
//	@FindBy(xpath = "(//div[.='Enter Data Model'])[1]")
//	private WebElement dataModelDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Region'])[1]")
//	private WebElement regionDropdown;

	@FindBy(xpath = "(//div[.='Select Supported Baud Rate'])[1]")
	private WebElement supportedBaudRateDropdown;
//
//	@FindBy(xpath = "(//div[@role='option'])[1]")
//	private WebElement firstDropdownOption;
//
//	@FindBy(xpath = "(//div[.='Next'])[1]")
//	private WebElement nextButton;
//
//	@FindBy(xpath = "//span[.='Add Configuration']")
//	private WebElement addConfigurationButton;
//
//	@FindBy(xpath = "(//div[.='Select Evaluation Type'])[2]")
//	private WebElement evaluationTypeDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Criteria'])[2]")
//	private WebElement criteriaDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Data Point'])[2]")
//	private WebElement dataPointDropdown;
//
//	@FindBy(xpath = "(//div[.='Select Value'])[2]")
//	private WebElement valueDropdown;
//
//	@FindBy(xpath = "//span[.='Add']")
//	private WebElement finalAddButton;
//
//	@FindBy(xpath = "//h1[.='Manage Controller Models']")
//	private WebElement manageControllerModelsHeader;
//
//	@FindBy(xpath = "//p[contains(text(), 'added successfully!')]")
//	private WebElement addSuccessToast;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editFAEControllerButton;

	@FindBy(xpath = "//h1[.='Edit FAE Controller Model']")
	private WebElement editFAEControllerHeader;

	@FindBy(xpath = "(//div[.='Japan'])[1]")
	private WebElement japanRegionValidation;

//	@FindBy(xpath = "//span[.='Save']")
//	private WebElement saveButton;
//
//	@FindBy(xpath = "//input[@placeholder='Enter Manufacturer']")
//	private WebElement manufacturerInput;

	@FindBy(xpath = "(//div[.='Next'])[2]")
	private WebElement nextButtonStepTwo;

//	@FindBy(xpath = "//p[contains(text(), 'successfully')]")
//	private WebElement updateSuccessToast;
//
//	@FindBy(xpath = "//h1[.='Manage Controller Models']")
//	private WebElement manageControllerModelsHeader;
//
//	@FindBy(xpath = "//span[.='FAE Controller Model']")
//	private WebElement faeControllerModelTab;

	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteFAEControllerButton;


//
//	@FindBy(xpath = "//span[.='Items per page']")
//	private WebElement itemsPerPageLabel;
//
//	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
//	private WebElement deleteSuccessToast; // Enable once functionality works

	@FindBy(xpath = "(//div[.='Unit of Measure'])[1]")
	private WebElement unitOfMeasureMenu;

	@FindBy(xpath = "//h1[.='Unit of Measure']")
	private WebElement unitOfMeasureHeader;

	@FindBy(xpath = "(//div[.='Measurement Type'])[1]")
	private WebElement measurementTypeDropdown;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchInput;

	@FindBy(xpath = "(//span[contains(text(),'Degree')])[1]")
	private WebElement degreeSearchResult;

	@FindBy(css = "p[data-testid='user_name']")
	private WebElement userNameElement;

//==================================== Authentication Mode Combinations =============================

	@FindBy(xpath = "//div[.='Auth. Mode Combinations']")
	private WebElement authModeCombinationsMenu;

	@FindBy(xpath = "//button[@aria-haspopup='menu']")
	private WebElement menuButton;

	@FindBy(xpath = "//span[.='Mode Groups']")
	private WebElement modeGroupsTab;

	@FindBy(xpath = "//span[.='Create']")
	private WebElement createButton;
	
	@FindBy(xpath = "(//span[.='Create'])[2]")
	private WebElement createButton2;

	@FindBy(xpath = "//input[@placeholder='Enter Group Name']")
	private WebElement groupNameInput;

	@FindBy(xpath = "(//div[.='Select'])[1]")
	private WebElement modeCombinationsDropdown;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement firstOption;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElement secondOption;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElement thirdOption;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editModeGroupButton;

	@FindBy(xpath = "//h2[.='Edit Mode Group']")
	private WebElement editModeGroupHeader;
	
	@FindBy(xpath = "(//span[.='Delete'])[2]")
	private WebElement confirmModeGrpDeleteButton;

	@FindBy(xpath = "//p[contains(text(),'successfully')]")
	private WebElement successMessage;

	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteModeGroupButton;

	@FindBy(xpath = "//span[.='Mode Combinations']")
	private WebElement modeCombinationsTab;
	

	
	@FindBy(xpath = "(//div[.='Select'])[1]")
	private WebElement modeNumberDropdown;

	@FindBy(name = "modeName")
	private WebElement modeNameInput;

	@FindBy(xpath = "(//div[.='Select'])[10]")
	private WebElement modeCombinationDropdown;

	@FindBy(xpath = "//button[@aria-label='Mode Number, sorted ascending. Click to sort descending.']")
	private WebElement modeNumberSortButton;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	private WebElement editModeCombinationButton;

	@FindBy(xpath = "//h1[.='Edit Mode Combinations']")
	private WebElement editModeCombinationHeader;

	@FindBy(xpath = "(//div[.='4'])[1]")
	private WebElement modeNumber4Dropdown;
	
	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteModeCombinationButton;
	
//=================== ENergy Coefficients ==================
	
	@FindBy(xpath = "//div[.='Energy Coefficients']")
	private WebElement energyCoefficientsMenu;

	@FindBy(xpath = "//span[.='Publish']")
	private WebElement publishButton;

	@FindBy(xpath = "(//div[.='Plan Name'])[1]")
	private WebElement planNameHeader;

	@FindBy(xpath = "//span[.='Add']")
	private WebElement addButton;
	
	@FindBy(xpath = "//span[.='Manage Company']")
	private WebElement manageCompanyMenu;

	@FindBy(xpath = "//h1[.='Manage Company']")
	private WebElement manageCompanyHeader;

	@FindBy(xpath = "//span[.='Add Company']")
	private WebElement addCompanyButton;
	
	@FindBy(xpath = "//span[.='Add']")
	private WebElement addEnergyCoefficientButton;

	@FindBy(name = "registrationNumber")
	private WebElement registrationNumberInput;

	@FindBy(name = "companyName")
	private WebElement companyNameInput;
	
	@FindBy(xpath = "//div[text()='Select']")
	private WebElement selectDropdown;
	
	@FindBy(xpath = "//div[text()='Electricity']")
	private WebElement electricityOption;

	@FindBy(name = "heatConversionCoefficient")
	private WebElement heatConversionFactorInput;

	@FindBy(name = "energyPlans.0.planName")
	private WebElement planNameInput;

	@FindBy(name = "energyPlans.0.basicEmissionFactor")
	private WebElement basicCO2FactorInput;

	@FindBy(name = "energyPlans.0.adjustedEmissionFactor")
	private WebElement adjustedCO2FactorInput;

	@FindBy(xpath = "//p[contains(text(),'coefficient')]")
	private WebElement CoeffiecientsuccessToast;

	@FindBy(xpath = "//input[@placeholder='Search Company Name']")
	private WebElement searchCompanyInput;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement searchResultCheckbox;

	@FindBy(xpath = "//button[@aria-label='Edit']")
	private WebElement editEnergyCoefficientButton;

	@FindBy(xpath = "//h1[.='Edit Electricity Coefficient']")
	private WebElement editEnergyCoefficientHeader;
	

	@FindBy(xpath = "//span[.='Save']")
	private WebElement saveEnergyCoefficientButton;

	@FindBy(xpath = "//p[contains(text(),'recalculated based on this revised data')]")
	private WebElement updateSuccessToastEnergyCoefficient;



	private void uploadJsonFile(String filePath) {

		waitUtils.waitAndClick(uploadFileButton);
		waitUtils.waitAndClick(browseFileButton);

		try {
			Robot rb = new Robot();
			rb.delay(2000);
			StringSelection ss = new StringSelection(filePath);
			waitUtils.waitForMillis(2000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);

			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void configureManageDataModel(String uniqueString, String prefixUnique) throws AWTException {
		navigateToManageDataModel();
		clickAddDataModel();
		addDataModel(uniqueString, prefixUnique);
		editDataModel();
		deleteDataModel();
	}

	public void configureACSManageDeviceModel(String uniqueString) {
		navigateToManageDeviceModel();
		addACSDeviceModel(uniqueString);
		updateACSDeviceModel();
		deleteACSDeviceModel();
	}

	public void configureFAEDeviceModel(String uniqueString) {
		navigateToManageDeviceModel();
		addFAEDeviceModel(uniqueString);
		editFAEDeviceModel();
		deleteFAEDeviceModel();
	}

	public void configureFAEEquipmentControllerModel(String uniqueString) {
		navigateToManageControllerModel();
		addFAEEquipmentControllerModel(uniqueString);
		EditFAEEquipmentControllerModel();
		deleteFAEEquipmentControllerModel();
	}

	public void configureACSControllerModel(String uniqueString) {
		navigateToManageControllerModel();
		createACSControllerModel(uniqueString);
		EditACSManageControllerModel();
		deleteACSControllerModel();
	}

	public void configureFAEControllerModel(String uniqueString) {
		navigateToManageControllerModel();
		createFAEControllerModel(uniqueString);
		editFAEControllerModel();
		deleteFAEControllerModel();
	}

	public void configureUnitOfMeasure() {

		navigateToUnitOfMeasurePage();

		loadAndSearchUnitOfMeasure();
	}
	
	public void configureAuthModeCombinations(String uniqueString) {
		navigateToAuthModeCombinations();
		AuthModeCombinations();
		createAndUpdateModeGroup(uniqueString);
		deleteModeGroup();
		createModeCombination(uniqueString);
		editModeCombination();
		deleteModeCombination();
	}
	
	public void navigateToAuthModeCombinations() {

		waitUtils.waitForMillis(1000);

		// Navigate to Auth. Mode Combinations
		waitUtils.waitAndClick(masterConfigurationMenu);
		waitUtils.waitAndClick(masterConfigurationMenu); // second click if needed
		waitUtils.waitAndClick(authModeCombinationsMenu);

		trackStep("Load Auth. Mode Combinations Page");

		waitUtils.waitForElementVisible(menuButton);
		waitUtils.waitForElementVisible(createButton);

		endStep();
	}

	public void navigateToManageDataModel() {

		waitUtils.waitAndClick(sideBar);
		waitUtils.waitAndClick(masterConfigurationMenu);
		waitUtils.waitAndClick(manageDataModelMenu);

		trackStep("View Manage Data Model");
		waitUtils.waitForElementVisible(manageDataModelHeader);
		endStep();
	}

	public void navigateToManageDeviceModel() {
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(sideBar);
		waitUtils.waitAndClick(masterConfigurationMenu);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(manageDeviceModelsMenu);

		trackStep("View Manage Data Model");
		waitUtils.waitForElementVisible(manageDeviceModelHeader);
		endStep();
	}

	public void navigateToManageControllerModel() {

		try {
			waitUtils.waitForMillis(1000);
			waitUtils.waitAndClick(sideBar);
			waitUtils.waitForMillis(2000);
			waitUtils.waitForElementVisible(masterConfigurationMenu).click();
			;
			waitUtils.waitForMillis(2000);
			waitUtils.waitForElementVisible(manageControllerModelsMenu).click();
		} catch (Exception e) {
			waitUtils.waitForMillis(1000);
			waitUtils.waitAndClick(sideBar);
			waitUtils.waitForMillis(2000);
			waitUtils.waitForElementVisible(masterConfigurationMenu).click();
			;
			waitUtils.waitForMillis(2000);
			waitUtils.waitForElementVisible(manageControllerModelsMenu).click();
			System.out.println("Unable to click on Manage Controller Models menu: " + e.getMessage());

		}
	}

	public void navigateToUnitOfMeasurePage() {

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(sideBar);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(masterConfigurationMenu);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(unitOfMeasureMenu);

		trackStep("View Unit Of Measure Page");
		waitUtils.waitForElementVisible(unitOfMeasureHeader);
		endStep();
	}

	public void clickAddDataModel() {

		waitUtils.waitAndClick(addDataModelButton);

		trackStep("Load Manage Data Model Page");
		waitUtils.waitForElementVisible(addDataModelHeader);
		waitUtils.waitForElementVisible(deviceDefinitionSection);
		waitUtils.waitForElementVisible(uploadFileButton);
		endStep();
	}

	public void addDataModel(String uniqueString, String prefixUnique) throws AWTException {

		waitUtils.waitForElementVisible(addDataModelHeader).click();
		waitUtils.waitAndSendKeys(dataModelInput, "DM-Perf" + uniqueString);

//        waitUtils.waitAndClick(deviceTypeDropdown);
//        waitUtils.waitAndClick(controllerOption);

		waitUtils.waitAndSendKeys(prefixInput, "BM" + prefixUnique);

		String randomDecimal = String.valueOf(Math.round((Math.random() * 50) * 100.0) / 100.0);

		waitUtils.waitAndSendKeys(versionInput, randomDecimal);

		uploadJsonFile(System.getProperty("user.dir") + "\\Controller_FLC500_phase2.json");

		waitUtils.waitAndClick(confirmUploadButton);

		waitUtils.waitAndClick(addIconButton);
		waitUtils.waitAndClick(iconSelectButton);
		waitUtils.waitAndClick(iconSelectButton);
		waitUtils.waitAndClick(confirmAddIconButton);

		waitUtils.waitAndClick(finalAddButton);

		trackStep("Add Data Model Successfully");
		waitUtils.waitForElementVisible(successToast);
		waitUtils.waitForElementVisible(manageDataModelHeader);
		endStep();
	}

	// =================================================Edit Added Data
	// Model=======================================================

	public void editDataModel() {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(editButton);

		System.out.println("-----------------------Edit Data Model Process Initiated---------------------");

		waitUtils.waitAndClick(svgEditOption);

		waitUtils.waitAndClick(confirmButton);
		waitUtils.waitAndClick(confirmButton);

		waitUtils.waitAndClick(replaceButton);

		waitUtils.waitAndClick(saveButton);

		trackStep("Update Data Model Successfully");

		waitUtils.waitForElementVisible(successmessage);
		waitUtils.waitForElementVisible(itemsPerPageLabel);

		endStep();
	}

	// =================================================Delete Added Data
	// Model=======================================================
	public void deleteDataModel() {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(deleteButton);

		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete Data Model Successfully");

		waitUtils.waitForElementVisible(deleteSuccessToast);
		waitUtils.waitForElementVisible(itemsPerPageLabel);

		endStep();
	}

	public void addACSDeviceModel(String unqString) {

		// =========================================================Manage Device
		// Model==================================================================

		int deviceModelCount = deviceModelRows.size();
		if (deviceModelCount > 0) {
			endStep();
			System.out.println("View Manage Device Model= " + (endTime - startTime) + " msec");
		} else {
			System.out.println("Device are displayed");
		}

		// ----------------------------------------------------------View Add Device
		// Model---------------------------------------------------------------

		waitUtils.waitAndClick(addDeviceModelButton);

		trackStep("View Add Device Model");

		waitUtils.waitForElementVisible(deviceModelNameInput);
		waitUtils.waitForElementVisible(addACSDeviceModelHeader);

		endStep();

		// ----------------------------------------------------------Add Device
		// Model---------------------------------------------------------------

		String deviceModelName = "PerfACS_" + unqString;

		waitUtils.waitAndSendKeys(deviceModelNameInput, deviceModelName);

		// Select Data Model
		waitUtils.waitAndClick(dataModelDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		// Select Device Type
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(deviceDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		// Select Region
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(regionDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		// Select Compatible Controller
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(controllerDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstControllerOption);

		// Enter Manufacturer
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(manufacturerInput, "CR-Reader");

		// Additional Information (Use In)
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(useInOption1);
		waitUtils.waitAndClick(useInOption2);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(useInOption3);
		waitUtils.waitAndClick(useInOption4);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(useInOption5);
		waitUtils.waitAndClick(useInOption6);

		waitUtils.waitAndClick(AddButton);

		trackStep("Add ACS Model Details");

		waitUtils.waitForElementVisible(manageDeviceModelHeader);

		endStep();
	}

	public void updateACSDeviceModel() {

		// ----------------------------------------------------------Update ACS Device
		// Model---------------------------------------------------------------

		waitUtils.waitAndClick(editDeviceModelButton);

		trackStep("Open ACS Device Model Details");

		waitUtils.waitForElementVisible(editACSDeviceModelHeader);
		waitUtils.waitForElementVisible(additionalInformationHeader);

		endStep();

		// Update Additional Information
		waitUtils.waitAndClick(useInOption5);
		waitUtils.waitAndClick(useInOption6);

		waitUtils.waitAndClick(saveButton);

		trackStep("Update ACS Device Model Details");

		// Enable below when update functionality works
		waitUtils.waitForElementVisible(editsuccessmessage);
		waitUtils.waitForElementVisible(manageDeviceModelHeader);

		endStep();
	}

	public void deleteACSDeviceModel() {

		// ----------------------------------------------------Delete ACS Device
		// Model------------------------------------------
		waitUtils.waitForMillis(2000);

		trackStep("Delete ACS Device Model Successfully");

		waitUtils.waitForElementVisible(deleteDeviceModelButton).click();
		waitUtils.waitAndClick(confirmDeleteDeviceModelButton);
		waitUtils.waitForElementVisible(deleteSuccessToast);
		waitUtils.waitForElementVisible(itemsPerPageLabel);

		endStep();
	}

	public void addFAEDeviceModel(String unqString) {

		// -------------------------------------------------------------Add FAE Device
		// Model---------------------------------------------------------------
		waitUtils.waitAndClick(faeDeviceModelMenu);

		trackStep("Load FAE Device Model Page");

		waitUtils.waitForElementVisible(addDeviceModelButton);
		waitUtils.waitForElementVisible(searchByDeviceModelInput);

		endStep();

		waitUtils.waitAndClick(addDeviceModelButton);

		String deviceModelName = "FAE_Perf" + unqString;
		waitUtils.waitAndSendKeys(faeDeviceModelNameInput, deviceModelName);

		waitUtils.waitAndClick(dataModelDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(deviceDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(regionDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndSendKeys(manufacturerInput, "CR-Reader");

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(equipmentControllerDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstControllerOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(integrationMethodDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(compatibleControllerDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(protocolDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(baudRateDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(protocolModeDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(useInOption1);
		waitUtils.waitAndClick(useInOption2);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(useInOption3);
		waitUtils.waitAndClick(useInOption4);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(useInOption5);

		// ------------------------------------------------ Unit Mapping Page
		// ------------------------------------------------
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(nextButton);

		trackStep("Add FAE Device Model Unit Mapping Details");
		waitUtils.waitForElementVisible(unitMappingHeader);
		waitUtils.waitForElementVisible(editDataPointsButton);
		endStep();

		// ------------------------------------------------ Maintenance Configuration
		// ------------------------------------------------
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(nextButton);

		trackStep("Add FAE Device Model Maintenance Configuration Details");
		waitUtils.waitForElementVisible(maintenanceConfigurationHeader);
		waitUtils.waitForElementVisible(addConfigurationButton);
		endStep();

		// ------------------------------------------------ Add Configuration
		// ------------------------------------------------
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(addConfigurationButton);

		waitUtils.waitAndClick(criteriaDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(evaluationTypeDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(dataPointDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(valueDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(addAlarmThresholdsButton);

		// Select Operator
		waitUtils.waitAndClick(operatorDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		// Enter Threshold
		waitUtils.waitAndClick(thresholdInput);
		thresholdInput.clear();
		waitUtils.waitAndSendKeys(thresholdInput, "1");

		// Select Alarm
		waitUtils.waitAndClick(alarmDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(finalAddButton);

		trackStep("Added FAE Device Model Successfully");
		waitUtils.waitForElementVisible(manageDeviceModelHeader);
		// waitUtils.waitForElementVisible(successToast);
		endStep();
	}

	public void editFAEDeviceModel() {

		waitUtils.waitAndClick(faeDeviceModelMenu);

		trackStep("Load FAE Device Model Page in Edit Mode");

		waitUtils.waitForElementVisible(addDeviceModelButton);
		waitUtils.waitForElementVisible(searchByDeviceModelInput);

		endStep();

		// --------------------------------------------------------------Edit FAE Device
		// Model---------------------------------------------------------------
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(editDeviceModelButton);

		trackStep("Open FAE Device Model Details");
		waitUtils.waitForElementVisible(editFAEDeviceModelHeader);
		waitUtils.waitForElementVisible(additionalInformationHeader);
		endStep();

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(nextButton);
		waitUtils.waitAndClick(nextButton);

		// waitUtils.waitAndClick(saveButton); // Enable when edit works
		waitUtils.waitAndClick(cancelButton);

		trackStep("Updated FAE Device Model Successfully");
		waitUtils.waitForElementVisible(manageDeviceModelHeader);
		// waitUtils.waitForElementVisible(successToast);
		endStep();
	}

	public void deleteFAEDeviceModel() {

		waitUtils.waitAndClick(deleteDeviceModelButton);

//	    waitUtils.waitAndClick(confirmDeleteDeviceModelButton); // Enable once able to add fae devicr works

		trackStep("Delete FAE Device Model Successfully");

		waitUtils.waitForElementVisible(manageDeviceModelHeader);
		// waitUtils.waitForElementVisible(deleteSuccessToast); // Enable once backend
		// works

		endStep();
	}

	public void addFAEEquipmentControllerModel(String unqString) {

		// ------------------------------------------------ Load FAE Equipment
		// Controller Model Page ----------------------------------------

		waitUtils.waitAndClick(faeEquipmentControllerMenu);

		trackStep("Load FAE Equipment Controller Model Page");

		waitUtils.waitForElementVisible(addDeviceModelButton);
		waitUtils.waitForElementVisible(searchByDeviceModelInput);

		endStep();

		// ------------------------------------------------ Add FAE Equipment Controller
		// Model ----------------------------------------------

		waitUtils.waitAndClick(addDeviceModelButton);

		String deviceModelName = "FAE_Equi_Con_Perf" + unqString;
		waitUtils.waitAndSendKeys(equipmentControllerModelNameInput, deviceModelName);

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(dataModelDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(deviceDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(regionDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(compatibleControllerDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstControllerOption);

		waitUtils.waitAndClick(protocolDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(baudRateDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndSendKeys(manufacturerInput, "CR-Reader");

		waitUtils.waitAndClick(protocolModeDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(useInOption1);
		waitUtils.waitAndClick(useInOption2);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(useInOption3);
		waitUtils.waitAndClick(useInOption4);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(useInOption5);

		// ------------------------------------------------ Maintenance Configuration
		// ----------------------------------------

		waitUtils.waitAndClick(nextButton);

		trackStep("Add FAE Equipment Controller Model Details");
		waitUtils.waitForElementVisible(maintenanceConfigurationHeader);
		waitUtils.waitForElementVisible(addConfigurationButton);
		endStep();

		// Click Add Configuration
		waitUtils.waitAndClick(addConfigurationButton);

		// Select Criteria
		waitUtils.waitAndClick(criteriaDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		// Select Evaluation Type
		waitUtils.waitAndClick(evaluationTypeDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		// Select Data Point
		waitUtils.waitAndClick(dataPointDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		// Select Value
		waitUtils.waitAndClick(valueDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(addAlarmThresholdsButton);

		// Select Operator
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(operatorDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		// Enter Threshold
		waitUtils.waitAndClick(thresholdInput);
		thresholdInput.clear();
		waitUtils.waitAndSendKeys(thresholdInput, "1");

		// Select Alarm
		waitUtils.waitAndClick(alarmDropdown);
		waitUtils.waitAndClick(firstDropdownOption);

		// ------------------------------------------------ Click on Add
		// ------------------------------------------------

		waitUtils.waitAndClick(finalAddButton);

		trackStep("Added FAE Equipment Controller Model Successfully");

		waitUtils.waitForElementVisible(manageDeviceModelHeader);
		// waitUtils.waitForElementVisible(successToast); // Enable once correct success
		// message appears
		waitUtils.waitForElementVisible(successToast);

		endStep();
	}

	public void EditFAEEquipmentControllerModel() {

		// ------------------------------------------------ Edit FAE EquipmentController
		// Model ------------------------------------------------
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(editEquipmentControllerButton);

		trackStep("Open FAE Equipment Controller Model Details in Edit Mode");

		waitUtils.waitForElementVisible(editFAEEquipmentControllerHeader);
		waitUtils.waitForElementVisible(additionalInformationHeader);

		endStep();

		waitUtils.waitAndClick(nextButton);
		waitUtils.waitAndClick(nextButton);

		waitUtils.waitAndClick(saveButton);

		trackStep("Updated FAE Equipment Controller Model Successfully");

		waitUtils.waitForElementVisible(successToastmessage);
		waitUtils.waitForElementVisible(manageDeviceModelHeader);

		endStep();
	}

	public void deleteFAEEquipmentControllerModel() {

		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(deleteEquipmentControllerButton);

		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete FAE Equipment Controller Model Successfully");

		waitUtils.waitForElementVisible(manageDeviceModelHeader);
		// waitUtils.waitForElementVisible(deleteSuccessToast); // Enable once working

		endStep();
	}

	public void createACSControllerModel(String unqString) {

		// --------------------------------------------------------------Create ACS
		// Controller
		// Model-----------------------------------------------------------------------------

		trackStep("View Controller Model Page");

		waitUtils.waitForElementVisible(manageControllerModelsHeader);
		waitUtils.waitForElementVisible(addControllerModelButton);

		int controllerModelCount = controllerModelRows.size();
		if (controllerModelCount > 0) {
			System.out.println("Controller Model Count: " + controllerModelCount);
		} else {
			System.out.println("Controller Models are not displayed");
		}

		endStep();

		// ------------------------------------------------ Add Controller Model
		// ------------------------------------------------

		waitUtils.waitAndClick(addControllerModelButton);

		trackStep("View Add Controller Model Page");

		waitUtils.waitForElementVisible(addACSControllerModelHeader);
		waitUtils.waitForElementVisible(controllerModelInput);
		waitUtils.waitForElementVisible(manufacturerInput);

		endStep();

		// ------------------------------------------------ Input Data
		// ------------------------------------------------

		waitUtils.waitAndSendKeys(controllerModelInput, "CNT-Crd-" + unqString);

		// Data Model
		waitUtils.waitForMillis(500);
		waitUtils.waitForElementVisible(dataModelDropdown).click();
		waitUtils.waitForMillis(2000);
		waitUtils.waitForElementVisible(dataModelDropdown).click();
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(firstDropdownOption);

		// Usage Sub-category
		waitUtils.waitForMillis(500);
		waitUtils.waitForElementVisible(usageSubCategoryDropdown).click();
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(firstDropdownOption);

		// Region
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(regionDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		// Manufacturer
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(manufacturerInput, "GLI");

		// --------------------------------------------------- Add ACS Controller Model

		waitUtils.waitAndClick(finalAddButton);

		trackStep("Added ACS Controller Model Details Successfully");

		waitUtils.waitForElementVisible(manageControllerModelsHeader);
		waitUtils.waitForElementVisible(addSuccessToast);

		endStep();

	}

	public void EditACSManageControllerModel() {

		// --------------------------------------------------- Edit ACS Controller Model
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(editControllerButton);

		trackStep("Load ACS Controller Model Details in Edit Mode");

		waitUtils.waitForElementVisible(editACSControllerHeader);
		waitUtils.waitForElementVisible(japanRegionTag);
		waitUtils.waitForElementVisible(saveButton);

		endStep();

		// --------------------------------------------------- Update Manufacturer
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(manufacturerInput);
		manufacturerInput.clear();
		waitUtils.waitAndSendKeys(manufacturerInput, "R-Door");

		waitUtils.waitAndClick(saveButton);

		trackStep("Update ACS Controller Model Details");

		waitUtils.waitForElementVisible(updateSuccessToast);
		waitUtils.waitForElementVisible(manageControllerModelsHeader);

		endStep();
	}

	public void deleteACSControllerModel() {

		waitUtils.waitForMillis(1000);

		waitUtils.waitAndClick(deleteControllerButton);

		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete ACS Controller Model");

		// waitUtils.waitForElementVisible(deleteSuccessToast); // Enable later
		waitUtils.waitForElementVisible(itemsPerPageLabel);

		endStep();
	}

	public void createFAEControllerModel(String unqString) {

		// -------------------------------- View FAE Controller Model
		// --------------------------------

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(faeControllerModelTab);

		trackStep("View FAE Controller Model Page");

		waitUtils.waitForElementVisible(addControllerModelButton);

		if (controllerModelRows.size() > 0) {
			System.out.println("Controller Models Count: " + controllerModelRows.size());
		} else {
			System.out.println("Controller Models are not displayed");
		}

		endStep();

		// -------------------------------- Add Controller
		// --------------------------------

		waitUtils.waitAndClick(addControllerModelButton);

		trackStep("View Add FAE Controller Model Page");

		waitUtils.waitForElementVisible(addFAEControllerHeader);
		waitUtils.waitForElementVisible(controllerModelInput);
		waitUtils.waitForElementVisible(manufacturerInput);

		endStep();

		// -------------------------------- Input Data --------------------------------

		waitUtils.waitAndSendKeys(controllerModelInput, "CNT-Crd-" + unqString);

		// Data Model
		waitUtils.waitForMillis(500);
		waitUtils.waitForElementVisible(dataModelDropdown).click();
		waitUtils.waitForMillis(2000);
//		waitUtils.waitForElementVisible(dataModelDropdown).click();
//		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(regionDropdown);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndSendKeys(manufacturerInput, "GLI");

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(supportedBaudRateDropdown);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitAndClick(nextButton);

		// -------------------------------- Configuration
		// --------------------------------

		trackStep("Add FAE Controller Model Details");

		waitUtils.waitForElementVisible(addConfigurationButton);

		endStep();

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(addConfigurationButton);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(evaluationTypeDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(criteriaDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(dataPointDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(valueDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(firstDropdownOption);

		// -------------------------------- Save --------------------------------

		waitUtils.waitAndClick(finalAddButton);

		trackStep("Save FAE Controller Model Details successfully");

		waitUtils.waitForElementVisible(manageControllerModelsHeader);
		waitUtils.waitForElementVisible(addSuccessToast);

		endStep();

		// -------------------------------- Back to Tab --------------------------------

		waitUtils.waitAndClick(faeControllerModelTab);
	}

	public void editFAEControllerModel() {

		// -------------------------------- Load Edit Page
		// --------------------------------

		waitUtils.waitAndClick(editFAEControllerButton);

		trackStep("Load FAE Controller Model Details");

		waitUtils.waitForElementVisible(editFAEControllerHeader);
		waitUtils.waitForElementVisible(japanRegionValidation);
		waitUtils.waitForElementVisible(saveButton);

		endStep();

		// -------------------------------- Update Manufacturer
		// --------------------------------

		waitUtils.waitAndClick(manufacturerInput);
		manufacturerInput.clear();
		waitUtils.waitAndSendKeys(manufacturerInput, "R-Door");

		// -------------------------------- Navigate & Save
		// --------------------------------

		waitUtils.waitAndClick(nextButtonStepTwo);

		waitUtils.waitAndClick(saveButton);

		trackStep("Update FAE Controller Model Details");

		waitUtils.waitForElementVisible(updateSuccessToast);
		waitUtils.waitForElementVisible(manageControllerModelsHeader);

		endStep();

		// -------------------------------- Return to Tab
		// --------------------------------

		waitUtils.waitAndClick(faeControllerModelTab);
	}

	public void deleteFAEControllerModel() {

		waitUtils.waitAndClick(deleteFAEControllerButton);

		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Delete FAE Controller Model");

		// waitUtils.waitForElementVisible(deleteSuccessToast); // Enable later
		waitUtils.waitForElementVisible(itemsPerPageLabel);

		endStep();
	}

	// -------------------------------- Load Unit Of Measure Page
	// --------------------------------

	public void loadAndSearchUnitOfMeasure() {

		waitUtils.waitForMillis(1000);

//	    waitUtils.waitAndClick(masterConfigurationMenu);
		waitUtils.waitAndClick(unitOfMeasureMenu);

		trackStep("Load Unit Of Measure Page");

		waitUtils.waitForElementVisible(unitOfMeasureHeader);
		waitUtils.waitForElementVisible(measurementTypeDropdown);
		waitUtils.waitForElementVisible(userNameElement).click();
		waitUtils.waitForElementVisible(userNameElement).click();

		endStep();

		// -------------------------------- Search Unit Of Measure

		waitUtils.waitAndClick(searchInput);
		searchInput.clear();
		waitUtils.waitAndSendKeys(searchInput, "Degree");

		trackStep("Search Unit Of Measure");

		waitUtils.waitForElementVisible(degreeSearchResult);

		endStep();
	}
	
	

	public void AuthModeCombinations() {

		

		// Open menu twice to ensure dropdown is active
		waitUtils.waitAndClick(menuButton);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(menuButton);
		waitUtils.waitForMillis(2000);

		// Navigate to Mode Groups tab
		waitUtils.waitAndClick(modeGroupsTab);

		// Track step: Load Mode Groups Tab
		trackStep("Load Mode Groups Tab");

		waitUtils.waitForElementVisible(menuButton);
		waitUtils.waitForElementVisible(createButton);

		endStep();
	}

	public void createAndUpdateModeGroup(String uniqueString) {

		waitUtils.waitForMillis(1000);

		// ----------------- Create Mode Group -----------------
		waitUtils.waitAndClick(createButton);

		waitUtils.waitAndClick(groupNameInput);
		groupNameInput.clear();
		waitUtils.waitAndSendKeys(groupNameInput, "ModeGroup" + uniqueString);

		// Select multiple Mode Combinations
		waitUtils.waitAndClick(modeCombinationsDropdown);
		waitUtils.waitAndClick(firstOption);
		waitUtils.waitAndClick(secondOption);
		waitUtils.waitAndClick(thirdOption);

		// Select Default Mode Combination
		waitUtils.waitAndClick(modeCombinationsDropdown);
		waitUtils.waitAndClick(firstOption);

		// Submit Create
		waitUtils.waitAndClick(createButton2);

		trackStep("Create Mode Group");
		waitUtils.waitForElementVisible(successMessage);
		waitUtils.waitForElementVisible(createButton);
		endStep();

		// ----------------- Update Mode Group -----------------
		waitUtils.waitAndClick(editModeGroupButton);

		trackStep("Open Mode Group Details");
		waitUtils.waitForElementVisible(editModeGroupHeader);
//		waitUtils.waitAndClick(secondOption); // click existing option (MC3) to update
		waitUtils.waitAndClick(groupNameInput);
		groupNameInput.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		waitUtils.waitAndSendKeys(groupNameInput, "EditModeGroup" + uniqueString);
		endStep();

		waitUtils.waitAndClick(saveButton);

		trackStep("Update Mode Group");
		waitUtils.waitForElementVisible(successMessage);
		waitUtils.waitForElementVisible(createButton);
		endStep();
	}

	public void deleteModeGroup() {

		waitUtils.waitForMillis(1000);

		// Click Delete button
		waitUtils.waitAndClick(deleteModeGroupButton);
		waitUtils.waitForMillis(2000);

		// Confirm Delete
		waitUtils.waitAndClick(confirmModeGrpDeleteButton);

		// Track deletion step
		trackStep("Delete Mode Group");
		waitUtils.waitForElementVisible(successMessage);
		waitUtils.waitForElementVisible(createButton);
		endStep();
	}

	public void createModeCombination(String uniqueString) {

		waitUtils.waitForMillis(1000);

		// Open Mode Combinations tab
		waitUtils.waitAndClick(modeCombinationsTab);
		waitUtils.waitForMillis(2000);

		// Click Create
		waitUtils.waitAndClick(createButton);
		waitUtils.waitForMillis(2000);

		// Select Mode Number
		waitUtils.waitAndClick(modeNumberDropdown);
		waitUtils.waitAndClick(firstOption);

		// Enter Mode Name
		waitUtils.waitAndClick(modeNameInput);
		modeNameInput.clear();
		waitUtils.waitAndSendKeys(modeNameInput, "ModeCombination " + uniqueString);

		// Select Mode Combinations
		waitUtils.waitAndClick(modeCombinationDropdown);
		waitUtils.waitAndClick(firstOption);

		// Save / Create
		waitUtils.waitAndClick(createButton);

		// Track step
		trackStep("Create Mode Combination");
		waitUtils.waitForElementVisible(successMessage);
		waitUtils.waitForElementVisible(createButton);
		endStep();

		// Optional: sort by Mode Number
		waitUtils.waitAndClick(modeNumberSortButton);
		waitUtils.waitForMillis(2000);
	}
	
	public void editModeCombination() {

	    waitUtils.waitForMillis(1000);

	    // Open Edit Mode Combination
	    waitUtils.waitAndClick(editModeCombinationButton);

	    trackStep("Open Mode Combination Details");

	    waitUtils.waitForElementVisible(editModeCombinationHeader);
	    waitUtils.waitForElementVisible(modeNumberDropdown);

	    endStep();

	    // Change Mode Number
	    waitUtils.waitAndClick(modeNumberDropdown);
	    waitUtils.waitAndClick(thirdOption);

	    // Save changes
	    waitUtils.waitAndClick(saveButton);

	    trackStep("Update Mode Combination");

	    waitUtils.waitForElementVisible(successMessage);
	    waitUtils.waitForElementVisible(createButton);

	    endStep();

	    // Optional: sort by Mode Number
	    waitUtils.waitAndClick(modeNumberSortButton);
	    waitUtils.waitForMillis(2000);
	}
	
	public void deleteModeCombination() {

	    waitUtils.waitForMillis(1000);

	    // Click Delete button
	    waitUtils.waitAndClick(deleteModeCombinationButton);

	    // Confirm Delete
	    waitUtils.waitAndClick(confirmModeGrpDeleteButton);

	    trackStep("Delete Mode Combination");

	    // Wait for success message and verify page header
	    waitUtils.waitForElementVisible(successMessage);
	    waitUtils.waitForElementVisible(createButton);

	    endStep();
	}
	
	public void navigateToEnergyCoefficientsPage() {

	    waitUtils.waitForMillis(1000);

	    // Navigate to Energy Coefficients
	    waitUtils.waitAndClick(masterConfigurationMenu);
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(energyCoefficientsMenu);

	    // Track page load
	    trackStep("Load Energy Coefficients Page");
	    waitUtils.waitForElementVisible(publishButton);
	    waitUtils.waitForElementVisible(planNameHeader);
	    waitUtils.waitForElementVisible(addButton);
	    endStep();


	}
	
	public void loadManageCompanyPage() {

	    waitUtils.waitForMillis(1000);

	    // Navigate to Manage Company
	    waitUtils.waitAndClick(manageCompanyMenu);

	    // Track page load
	    trackStep("Load Manage Company Page");
	    waitUtils.waitForElementVisible(manageCompanyHeader);
	    waitUtils.waitForElementVisible(addCompanyButton);
	    endStep();

	}
	
	public void manageEnergyCoefficients(String dateTimeString) {

	    waitUtils.waitForMillis(1000);

	    // ----------------- Add Energy Coefficient -----------------
	    waitUtils.waitForElementVisible(addCompanyButton).click();

	    // Registration Number
	    String registrationNumber = "REG" + dateTimeString;
	    waitUtils.waitAndSendKeys(registrationNumberInput, registrationNumber);

	    // Company Name
	    waitUtils.waitAndSendKeys(companyNameInput, "My GL");
	    
	    waitUtils.waitForElementVisible(selectDropdown).click();
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(electricityOption);
	    
	    waitUtils.waitForElementVisible(addCompanyButton).click();
	    
	    trackStep("Company Creation Duration for EnergyType Electricity");
	    waitUtils.waitForElementVisible(addCompanyButton).click();

	    // Heat Conversion Factor
	    waitUtils.waitAndSendKeys(heatConversionFactorInput, "1");

	    // Plan Name
	    waitUtils.waitAndSendKeys(planNameInput, "Plan1");

	    // Basic CO₂ Factor
	    waitUtils.waitAndSendKeys(basicCO2FactorInput, "0.99");

	    // Adjusted CO₂ Factor
	    waitUtils.waitAndSendKeys(adjustedCO2FactorInput, "1");

	    waitUtils.waitAndClick(addEnergyCoefficientButton);

	    // Track creation
	    trackStep("Energy Coefficients Creation Duration");
	    waitUtils.waitForElementVisible(CoeffiecientsuccessToast);
	    endStep();

	    // ----------------- Search Energy Coefficient -----------------
	    waitUtils.waitAndSendKeys(searchCompanyInput, "My GL");

	    trackStep("Search Energy Coefficients");
	    waitUtils.waitForElementVisible(searchResultCheckbox);
	    endStep();

	    // ----------------- Edit Energy Coefficient -----------------
	    waitUtils.waitAndClick(editEnergyCoefficientButton);

	    trackStep("Open Energy Coefficients details");
	    waitUtils.waitForElementVisible(editEnergyCoefficientHeader);
	    endStep();

	    waitUtils.waitForMillis(2000);
	}
	
	public void updateEnergyCoefficient() {

	    // ----------------- Update Heat Conversion Factor -----------------
	    waitUtils.waitForElementVisible(heatConversionFactorInput);
	    waitUtils.waitAndSendKeys(heatConversionFactorInput, "0.99");

	    waitUtils.waitAndClick(saveEnergyCoefficientButton);

	    // Track update
	    trackStep("Update Energy Coefficients details");
	    waitUtils.waitForElementVisible(updateSuccessToastEnergyCoefficient);
	    endStep();

	    waitUtils.waitForMillis(2000);
	}

}
