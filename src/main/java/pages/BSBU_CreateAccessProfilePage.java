package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonMethods;

public class BSBU_CreateAccessProfilePage extends BasePage {

	private Actions actions;
	public String mainWindow;

	public BSBU_CreateAccessProfilePage(WebDriver driver) throws Exception {
		super(driver);
		PageFactory.initElements(driver, this);
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

	@FindBy(xpath = "//tbody/tr/td[3]/span/div")
	private WebElement performanceAccountLink;

	@FindBy(xpath = "//div//h1/div/div[1]")
	private WebElement performanceAccountName;

	@FindBy(xpath = "//span[.='Visit Customer Portal']")
	private WebElement visitCustomerPortalBtn;

	@FindBy(xpath = "//h2[.='Account Owner Details']")
	private WebElement accountOwnerDetailsHeader;

	@FindBy(xpath = "//*[@data-testid='sidebar']")
	private WebElement customerSidebar;

	@FindBy(xpath = "//span[.='Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//div[contains(text(),'Access Management')]")
	private WebElement accessManagementMenu;

	@FindBy(xpath = "//div[contains(text(),'Manage Access Profile')]")
	private WebElement manageAccessProfileMenu;

	@FindBy(xpath = "//span[normalize-space()='Create Access Profile']")
	private WebElement createAccessProfileButton;

	@FindBy(xpath = "//h2[normalize-space()='Profile Details']")
	private WebElement profileDetailsHeader;

	@FindBy(xpath = "//h1[normalize-space()='Create Access Profile']")
	private WebElement createAccessProfileHeader;

	@FindBy(xpath = "//input[contains(@name,'profileName')]")
	private WebElement profileNameInput;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement organizationDropdown;

	@FindBy(xpath = "//div[.='Common']")
	private WebElement organizationOptionCommon;

	@FindBy(xpath = "//textarea[@placeholder='Add Description']")
	private WebElement descriptionTextarea;

	@FindBy(xpath = "//div[contains(text(),'Next')]")
	private WebElement nextButton;

	@FindBy(xpath = "//label[.=' Card Readers']")
	private WebElement cardReadersLabel;

	@FindBy(xpath = "//label[.='Card Reader Groups']")
	private WebElement cardReaderGroupsLabel;

	@FindBy(xpath = "//div[contains(text(), 'Site')]")
	private WebElement siteOption;

	@FindBy(xpath = "//div[contains(text(), 'Building')]")
	private WebElement buildingOption;

	@FindBy(xpath = "(//div[@aria-hidden='true'])[1]")
	private WebElement cardReaderCheckbox;

	@FindBy(xpath = "//tbody/tr/td[4]")
	private WebElement selectScheduleDropdown;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	private WebElement firstScheduleOption;

	@FindBy(xpath = "//tbody/tr/td[5]")
	private WebElement selectCalendarDropdown;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	private WebElement firstCalendarOption;

	@FindBy(xpath = "//h2[normalize-space()='Review Your Selections']")
	private WebElement reviewHeader;

	@FindBy(xpath = "//div[normalize-space()='Review']")
	private WebElement reviewSection;

	@FindBy(xpath = "//span[normalize-space()='Create']")
	private WebElement createButton;

	@FindBy(xpath = "//p[contains(text(),'created successfully')]")
	private WebElement toastCreatedSuccessfully;
	
	@FindBy(xpath = "//tbody/tr/td[2]")
	private WebElement accessProfileRow;

	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement editAccessProfileButton;

//	@FindBy(xpath = "//input[contains(@name,'profileName')]")
//	private WebElement profileNameInput;
//
//	@FindBy(xpath = "//div[contains(text(),'Next')]")
//	private WebElement nextButton;
//
//	@FindBy(xpath = "//label[.=' Card Readers']")
//	private WebElement cardReadersLabel;
//
//	@FindBy(xpath = "//label[.='Card Reader Groups']")
//	private WebElement cardReaderGroupsLabel;
//
//	@FindBy(xpath = "//span[normalize-space()='Select Schedule']")
//	private WebElement selectScheduleDropdown;
//
//	@FindBy(xpath = "//span[normalize-space()='Select Calendar']")
//	private WebElement selectCalendarDropdown;

	@FindBy(xpath = "//h2[.='Review Your Selections']")
	private WebElement reviewSelectionsHeader;

	@FindBy(xpath = "//div[normalize-space()='Review']")
	private WebElement reviewDiv;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//p[contains(text(),'modified successfully')]")
	private WebElement saveSuccessToast;
	
//	@FindBy(xpath = "//div[contains(text(), 'PerfProfile')]")
//	private WebElement accessProfileRow;

	@FindBy(xpath = "//span[normalize-space()='Credentials']")
	private WebElement credentialsTab;

	@FindBy(xpath = "//span[normalize-space()='Assign Credentials']")
	private WebElement assignCredentialsButton;

	@FindBy(xpath = "//h1[normalize-space()='Assign Credentials']")
	private WebElement assignCredentialsHeader;

	@FindBy(xpath = "(//button[contains(@class, 'ml')])[3]")
	private WebElement statusFilterButton;

	@FindBy(xpath = "(//div[@aria-hidden='true'])[2]")
	private WebElement assignedCheckboxDiv;

	@FindBy(xpath = "//span[normalize-space()='Assign']")
	private WebElement assignButton;
	
	@FindBy(xpath = "(//span[.='Assign'])[2]")
	private WebElement assignButtonSecond;

	@FindBy(xpath = "//p[contains(text(),'assigned')]")
	private WebElement assignToastMessage;

	@FindBy(xpath = "//span[.='Details']")
	private WebElement detailsTab;

	@FindBy(xpath = "//span[.='Edit']")
	private WebElement editButton;

//	@FindBy(xpath = "//input[contains(@name,'profileName')]")
//	private WebElement profileNameInput;
//
//	@FindBy(xpath = "//div[contains(text(),'Next')]")
//	private WebElement nextButton;
//
//	@FindBy(xpath = "//label[normalize-space()='Card Readers']")
//	private WebElement cardReadersLabel;
//
//	@FindBy(xpath = "//label[normalize-space()='Card Reader Groups']")
//	private WebElement cardReaderGroupsLabel;

	@FindBy(xpath = "//span[normalize-space()='Select Schedule']")
	private WebElement selectSchedule;

	@FindBy(xpath = "//span[normalize-space()='Select Calendar']")
	private WebElement selectCalendar;

//	@FindBy(xpath = "//h2[normalize-space()='Review Your Selections']")
//	private WebElement reviewHeader;
//
//	@FindBy(xpath = "//div[normalize-space()='Review']")
//	private WebElement reviewSection;
//
//	@FindBy(xpath = "//span[normalize-space()='Save']")
//	private WebElement saveButton;

	@FindBy(xpath = "//p[contains(text(),'modified successfully')]")
	private WebElement modifiedToastMessage;

	@FindBy(xpath = "(//tbody//*[name()='svg'])[2]")
	private WebElement deleteButton;

	@FindBy(xpath = "//h3[normalize-space()='Delete Access Profile']")
	private WebElement deletePopupHeader;

	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement confirmDeleteButton;

	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
	private WebElement deleteToastMessage;

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

	public void loadManageAccessProfile() {

		waitUtils.waitForMillis(1000);

		// Click Access Management
		waitUtils.waitAndClick(accessManagementMenu);
		waitUtils.waitForMillis(2000); // keep only if UI expansion requires delay

		// Click Manage Access Profile
		waitUtils.waitAndClick(manageAccessProfileMenu);

		// Track step timing
		trackStep("Load Manage Access Profile Page");

		// Validate page loaded
		waitUtils.waitForElementVisible(createAccessProfileButton);

		endStep();

	}

	public void createAccessProfile(String uniqueString) {

		waitUtils.waitForMillis(1000);

		// Click on Create Access Profile
		waitUtils.waitAndClick(createAccessProfileButton);

		// Track Page Load
		trackStep("Create Access Profile Page");
		waitUtils.waitForElementVisible(profileDetailsHeader);
		waitUtils.waitForElementVisible(createAccessProfileHeader);
		endStep();

		waitUtils.waitForMillis(2000);

		// Enter Profile Name
		waitUtils.waitAndSendKeys(profileNameInput,  uniqueString);
		waitUtils.waitForMillis(2000);

		// Select Organization
		waitUtils.waitAndClick(organizationDropdown);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(organizationOptionCommon);
		waitUtils.waitForMillis(2000);

		// Add Description
		waitUtils.waitAndSendKeys(descriptionTextarea, "PerfDescription_" + uniqueString);
		waitUtils.waitForMillis(2000);

		// Click Next → Card Reader page
		waitUtils.waitAndClick(nextButton);
		trackStep("Move to Card Reader page");
		waitUtils.waitForElementVisible(cardReadersLabel);
		waitUtils.waitForElementVisible(cardReaderGroupsLabel);
		endStep();
		waitUtils.waitForMillis(2000);

		// Select Site, Building, Card Reader
		waitUtils.waitAndClick(siteOption);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(buildingOption);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(cardReaderCheckbox);
		waitUtils.waitForMillis(2000);

		// Click Next → Calendar & Schedule page
		waitUtils.waitAndClick(nextButton);
		trackStep("Move to Calendar & Schedule Page");
		waitUtils.waitForElementVisible(selectScheduleDropdown);
		waitUtils.waitForElementVisible(selectCalendarDropdown);
		endStep();
		waitUtils.waitForMillis(2000);

		// Select Schedule
		waitUtils.waitAndClick(selectScheduleDropdown);
		waitUtils.waitAndClick(firstScheduleOption);
		waitUtils.waitForMillis(2000);

		// Select Calendar
		waitUtils.waitAndClick(selectCalendarDropdown);
		waitUtils.waitAndClick(firstCalendarOption);
		waitUtils.waitForMillis(2000);

		// Click Next → Review page
		waitUtils.waitAndClick(nextButton);
		trackStep("Move to Review Page");
		waitUtils.waitForElementVisible(reviewHeader);
		waitUtils.waitForElementVisible(reviewSection);
		endStep();
		waitUtils.waitForMillis(2000);

		// Click Create and validate toast
		waitUtils.waitAndClick(createButton);
		trackStep("Toast message after clicking Create");
		waitUtils.waitForElementVisible(toastCreatedSuccessfully);
		endStep();
		waitUtils.waitForMillis(2000);
	}
	
	public void editAccessProfile(String uniqueString) {

	    // ----------------- Open Access Profile -----------------
	    waitUtils.waitAndClick(accessProfileRow);
	    trackStep("Access Profile Section");
	    waitUtils.waitForElementVisible(reviewSelectionsHeader);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Click Edit -----------------
	    waitUtils.waitAndClick(editAccessProfileButton);
	    trackStep("Edit Access Profile Details");
	    waitUtils.waitForElementVisible(profileNameInput);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Edit Profile Name -----------------
	    waitUtils.waitForElementVisible(profileNameInput).clear();
	    waitUtils.waitAndSendKeys(profileNameInput, "Edit" + uniqueString);
	    waitUtils.waitForMillis(1000);

	    // ----------------- Move to Card Reader page -----------------
	    waitUtils.waitAndClick(nextButton);
	    trackStep("Move to Card Reader page for Edit");
	    waitUtils.waitForElementVisible(cardReadersLabel);
	    waitUtils.waitForElementVisible(cardReaderGroupsLabel);
	    endStep();
	    waitUtils.waitForMillis(1000);

	    // ----------------- Move to Calendar & Schedule Page -----------------
	    waitUtils.waitAndClick(nextButton);
	    trackStep("Move to Calendar & Schedule Page for Edit");
	    waitUtils.waitForElementVisible(selectScheduleDropdown);
	    waitUtils.waitForElementVisible(selectCalendarDropdown);
	    endStep();
	    waitUtils.waitForMillis(1000);

	    // ----------------- Move to Review Page -----------------
	    waitUtils.waitAndClick(nextButton);
	    trackStep("Move to Review Page(Edit)");
	    waitUtils.waitForElementVisible(reviewSelectionsHeader);
	    waitUtils.waitForElementVisible(reviewDiv);
	    endStep();
	    waitUtils.waitForMillis(1000);

	    // ----------------- Save Edited Profile -----------------
	    waitUtils.waitAndClick(saveButton);
	    trackStep("Toast message after save");
	    waitUtils.waitForElementVisible(saveSuccessToast);
	    endStep();
	    waitUtils.waitForMillis(2000);
	}
	
	public void assignCredentialsToAccessProfile() {

	    // ----------------- Open Access Profile -----------------
	    waitUtils.waitAndClick(accessProfileRow);
	    waitUtils.waitForMillis(2000);

	    // ----------------- Go to Credentials Section -----------------
	    waitUtils.waitAndClick(credentialsTab);
	    trackStep("Move to Credential Section");
	    waitUtils.waitForElementVisible(credentialsTab);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Click on Assign Credentials -----------------
	    waitUtils.waitAndClick(assignCredentialsButton);
	    trackStep("Move to Assign Credential");
	    waitUtils.waitForElementVisible(assignCredentialsHeader);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Apply Status Filter -----------------
	    waitUtils.waitAndClick(statusFilterButton);
	    waitUtils.waitForMillis(2000);

	    // Select Assigned Checkbox
	    waitUtils.waitAndClick(assignedCheckboxDiv);
	    waitUtils.waitForMillis(2000);

	    // ----------------- Click on Assign -----------------
	    waitUtils.waitAndClick(assignButton);
	    trackStep("Assign popup");
	    waitUtils.waitForElementVisible(assignCredentialsHeader);
	    endStep();
	    waitUtils.waitForMillis(2000);
	}
	
	public void assignEditCredentailsAccessProfile(String uniqueString) {

	    // ----------------- Again click on Assign -----------------
	    waitUtils.waitAndClick(assignButtonSecond);
	    trackStep("Assign toast message");
	    waitUtils.waitForElementVisible(assignToastMessage);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Navigate to Details -----------------
	    waitUtils.waitAndClick(detailsTab);
	    waitUtils.waitForMillis(2000);

	    // ----------------- Edit Access Profile -----------------
	    waitUtils.waitAndClick(editButton);
	    
	    trackStep("Edit Credentials Access Profile");
	    waitUtils.waitForElementVisible(reviewHeader);
	    endStep();
	    
	    waitUtils.waitForMillis(2000);

	    waitUtils.waitAndClick(profileNameInput);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndSendKeys(profileNameInput, "Edit_" + uniqueString);
	    waitUtils.waitForMillis(2000);

	    // ----------------- Navigate Card Reader Page -----------------
	    waitUtils.waitAndClick(nextButton);
	    trackStep("Move to Credentials Card Reader page for Edit");
	    waitUtils.waitForElementVisible(cardReadersLabel);
	    waitUtils.waitForElementVisible(cardReaderGroupsLabel);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Navigate Calendar & Schedule Page -----------------
	    waitUtils.waitAndClick(nextButton);
	    trackStep("Move to Calendar & Schedule Page for Edit");
	    waitUtils.waitForElementVisible(selectSchedule);
	    waitUtils.waitForElementVisible(selectCalendar);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Navigate Review Page -----------------
	    waitUtils.waitAndClick(nextButton);
	    trackStep("Move to Review Page (Edit)");
	    waitUtils.waitForElementVisible(reviewHeader);
	    waitUtils.waitForElementVisible(reviewSection);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Save Edited Access Profile -----------------
	    waitUtils.waitAndClick(saveButton);
	    trackStep("Toast message after save");
	    waitUtils.waitForElementVisible(modifiedToastMessage);
	    endStep();
	    waitUtils.waitForMillis(2000);

	}
	
	public void deleteAccessProfile() {

	    // ----------------- Click Delete Button -----------------
	    waitUtils.waitAndClick(deleteButton);
	    trackStep("Delete Access Profile");
	    waitUtils.waitForElementVisible(deletePopupHeader);
	    endStep();
	    waitUtils.waitForMillis(2000);

	    // ----------------- Confirm Delete -----------------
	    waitUtils.waitAndClick(confirmDeleteButton);
	    trackStep("Delete Access Profile toast message");
	    waitUtils.waitForElementVisible(deleteToastMessage);
	    endStep();
	    waitUtils.waitForMillis(2000);
	}

}
