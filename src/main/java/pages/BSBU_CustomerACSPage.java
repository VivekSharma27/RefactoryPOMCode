package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.CommonMethods;

public class BSBU_CustomerACSPage extends BasePage {

	private Actions actions;

	public BSBU_CustomerACSPage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.actions = new Actions(driver);
	}

	// Search Account Input
	@FindBy(xpath = "//input[@placeholder='Search Account']")
	private WebElement searchAccountInput;

	// Performance Account Link
	@FindBy(xpath = "//span[contains(text(),'Performance Account Web')]")
	private WebElement performanceAccountWebLink;

	@FindBy(xpath = "//div[contains(text(),'Access Management')]")
	private WebElement accessManagementMenu;

	@FindBy(xpath = "//div[contains(text(),'Manage Credentials')]")
	private WebElement manageCredentialsMenu;

	@FindBy(xpath = "//p[*='Download Application']")
	private WebElement downloadApplicationSection;

	@FindBy(xpath = "//span[normalize-space()='Card Inventory']")
	private WebElement cardInventoryTab;

	@FindBy(xpath = "//h1[contains(text(),'Credentials')]")
	private WebElement credentialsHeader;

	@FindBy(xpath = "//span[contains(text(),'Enrolled On')]")
	private WebElement enrolledOnColumn;

	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	private WebElement removeColumn;

	@FindBy(xpath = "//span[normalize-space()='Enroll Card']")
	private WebElement enrollCardButton;

	@FindBy(xpath = "//h1[contains(text(),'Enroll Card')]")
	private WebElement enrollCardHeader;

	@FindBy(xpath = "//span[normalize-space()='Submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//span[normalize-space()='Select an option']")
	private WebElement selectCardDropdown;

	@FindBy(xpath = "//span[contains(text(),'Type F')]")
	private WebElement typeFOption;

	@FindBy(xpath = "//input[contains(@name,'credentialNumber')]")
	private WebElement credentialNumberInput;

	@FindBy(xpath = "//input[@name='cardNumber']")
	private WebElement cardNumberInput;

	@FindBy(xpath = "//div[contains(text(),'Select an option')]")
	private WebElement organizationDropdown;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement firstOrganizationOption;

	@FindBy(xpath = "//span[contains(text(),'Card Number')]")
	private WebElement cardNumberColumn;

	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> tableRows;

	// ================= MANAGE USER LIST =================

	@FindBy(xpath = "//div[contains(text(),'Manage User List')]")
	private WebElement manageUserListMenu;

	@FindBy(xpath = "//span[normalize-space()='Add User']")
	private WebElement addUserButton;

	@FindBy(xpath = "//h1[.='Manage User List']")
	private WebElement manageUserListHeader;

	// ================= ADD USER POPUP =================

	@FindBy(xpath = "//h2[normalize-space()='Add User']")
	private WebElement addUserPopupHeader;

	@FindBy(xpath = "//span[normalize-space()='Add']")
	private WebElement addButton;

	@FindBy(xpath = "//input[contains(@name,'userId')]")
	private WebElement userIdInput;

	@FindBy(xpath = "//input[contains(@name,'lastName')]")
	private WebElement lastNameInput;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameInput;

	@FindBy(xpath = "//input[@name='furiganaSei']")
	private WebElement furiganaSeiInput;

	@FindBy(xpath = "//input[@name='furiganaMei']")
	private WebElement furiganaMeiInput;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailInput;

	@FindBy(xpath = "//input[@name='contactNo']")
	private WebElement contactNumberInput;

	@FindBy(xpath = "(//div[.='Select Organization'])[2]")
	private WebElement selectOrganizationDropdown;

//	@FindBy(xpath = "(//div[@role='option'])[1]")
//	private WebElement firstOrganizationOption;

	@FindBy(xpath = "//input[@name='department']")
	private WebElement departmentInput;

	@FindBy(xpath = "//p[contains(text(),'added successfully')]")
	private WebElement addUserSuccessMessage;

	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> userTableRows;

	// ================= MANAGE CREDENTIALS =================

	@FindBy(xpath = "//span[contains(text(),'User Credentials')]")
	private WebElement userCredentialsTab;

	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> credentialTableRows;

	// ================= ENROLL CARD =================

	@FindBy(xpath = "//span[contains(text(),'Enroll Card')]")
	private WebElement enrollCardSubmitButton;

	@FindBy(xpath = "//p[contains(text(),'Card Number ')]")
	private WebElement cardNumberSuccessMessage;

	// ================= ASSIGN CARD =================

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	private WebElement cardSearchInput;

	@FindBy(xpath = "(//span//button[@aria-label='Assign Card'])[1]")
	private WebElement assignCardIcon;

	@FindBy(xpath = "//h2[normalize-space()='Assign Card']")
	private WebElement assignCardPopupHeader;

	@FindBy(xpath = "//h4[normalize-space()='Assign the Access Card to user']")
	private WebElement assignCardSubHeader;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "(//div[@role='option'])")
	private List<WebElement> organizationOptions;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement userSearchInput;

	@FindBy(xpath = "//span[contains(text(),'Perf')]")
	private WebElement perfUserOption;

	@FindBy(xpath = "(//input[@name='cardType'])[1]")
	private WebElement firstCardTypeRadio;

	@FindBy(xpath = "//div[contains(@class,'h-3')]")
	private WebElement datePicker;

	@FindBy(xpath = "//span[normalize-space()='Assign']")
	private WebElement assignButton;

	@FindBy(xpath = "//span[normalize-space()='Enroll Card']")
	private WebElement enrollCardTab;

	// ================= USER CREDENTIALS =================

//	@FindBy(xpath = "//span[normalize-space()='User Credentials']")
//	private WebElement userCredentialsTab;

	@FindBy(xpath = "//a/span[normalize-space()='User Credentials']")
	private WebElement userCredentialsBreadcrumb;

	@FindBy(xpath = "//span[normalize-space()='Manage Credentials']")
	private WebElement manageCredentialsBreadcrumb;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	private WebElement credentialSearchInput;

	// ================= REVOKE CARD =================

	@FindBy(xpath = "(//div[contains(@class,'h-5 w-5')])[2]")
	private WebElement secondCheckbox;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement cardActionButton;

	@FindBy(xpath = "//span[normalize-space()='Action']")
	private WebElement actionDropdown;

	@FindBy(xpath = "//button[.='Revoke']")
	private WebElement revokeOption;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	private WebElement applyButton;

	@FindBy(xpath = "//h2[normalize-space()='Revoke Card(s)']")
	private WebElement revokePopupHeader;

	@FindBy(xpath = "//span[normalize-space()='Revoke']")
	private WebElement revokeConfirmButton;

	@FindBy(xpath = "//p[contains(text(),'Revoke request for')]")
	private WebElement revokeSuccessToast;

	// ================= REASSIGN CARD =================

	@FindBy(xpath = "(//input[@type='checkbox']//following::div[@aria-hidden='true'])[2]")
	private WebElement secondCheckbox1;

	@FindBy(xpath = "//span[contains(text(),'Revoke')]")
	private WebElement revokeDropdown;

	@FindBy(xpath = "(//button[@role='menuitem'])[3]")
	private WebElement reassignOption;

	@FindBy(xpath = "//h2[normalize-space()='Reassign Card(s)']")
	private WebElement reassignPopupHeader;

	@FindBy(xpath = "//span[normalize-space()='Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//p[contains(text(),'Reassign request for')]")
	private WebElement reassignSuccessToast;

	// ================= RETURN CARD TO INVENTORY =================
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement cardActionButton5;

	@FindBy(xpath = "(//div/button[@type='button'])[4]")
	private WebElement actionDropdown4;

	@FindBy(xpath = "(//button[@role='menuitem'])[5]")
	private WebElement returnToInventoryOption;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	private WebElement applyButtonRTCI;

	@FindBy(xpath = "//h2[normalize-space()='Return to Card Inventory']")
	private WebElement returnToInventoryPopupHeader;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	private WebElement cancelButtonRTCI;

	@FindBy(xpath = "//span[normalize-space()='Return to Card Inventory']")
	private WebElement returnButtonRTCI;

	@FindBy(xpath = "//p[contains(text(),'Return to Inventory request for')]")
	private WebElement returnSuccessToast;

	@FindBy(xpath = "//span[normalize-space()='Card Number']")
	private WebElement cardNumberHeader;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	private WebElement searchCardInput;

	// ================= REPLACE CARD =================
	@FindBy(xpath = "(//input[@type='checkbox']// following::div[@aria-hidden='true'])[2]")
	private WebElement cardCheckbox;

//	@FindBy(xpath = "//span[.='Action']")
//	private WebElement actionDropdown;

	@FindBy(xpath = "(//button[@role='menuitem'])[4]")
	private WebElement replaceCardOption;

	@FindBy(xpath = "//button[.='Apply']")
	private WebElement applyButtonReplace;

	@FindBy(xpath = "//h1[.='Replace Access Card']")
	private WebElement replaceCardPopupHeader;

	@FindBy(xpath = "//p[.='Card Number']")
	private WebElement cardNumberHeaderReplace;

	@FindBy(xpath = "//span[.='Select a reason']")
	private WebElement reasonDropdown;

	@FindBy(xpath = "//span[.='Card Lost']")
	private WebElement reasonCardLost;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement replacementCardSearchInput;

	@FindBy(xpath = "(//ul/li[@role='option']/div[1])")
	private WebElement selectReplacementCard;

	@FindBy(xpath = "//*[.='Replace']")
	private WebElement replaceButton;

	@FindBy(xpath = "//h1[.='Manage Credentials']")
	private WebElement manageCredentialsHeader;

	@FindBy(xpath = "//p[contains(text(),'Replace request for')]")
	private WebElement replaceSuccessToast;

	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> cardsTable;

	// ================= REMOVE CARD =================
	@FindBy(xpath = "(//input[@type='checkbox']// following::div[@aria-hidden='true'])[2]")
	private WebElement removeCardCheckbox;

	@FindBy(xpath = "//span[.='Action']")
	private WebElement actionDropdownRemove;

	@FindBy(xpath = "(//button[@role='menuitem'])[1]")
	private WebElement removeCardOption;

	@FindBy(xpath = "//button[.='Apply']")
	private WebElement applyButtonRemove;

	@FindBy(xpath = "//h2[.='Remove Card(s)']")
	private WebElement removeCardPopupHeader;

	@FindBy(xpath = "(//span[contains(text(),'Remove')])[2]")
	private WebElement removeButton;

	@FindBy(xpath = "//p[contains(text(),'Remove request for')]")
	private WebElement removeSuccessToast;

	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> cardsTableRemove;

	// ================= MANAGE USER =================
	@FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
	private WebElement deleteUserButton;

	@FindBy(xpath = "//h2[.='Delete User(s)']")
	private WebElement deleteUserPopupHeader;

	@FindBy(xpath = "(//span[.='Delete'])[2]")
	private WebElement confirmDeleteUser;

	@FindBy(xpath = "//tbody/tr/td[2]")
	private List<WebElement> usersTable;

	// ================= VIEW SCANNING TEMPLATE =================
	@FindBy(xpath = "//div[contains(text(),'View Scanning Template')]")
	private WebElement viewScanningTemplate;

	@FindBy(xpath = "//p[normalize-space()='Super Admin']")
	private WebElement superAdminOption;

	@FindBy(xpath = "//h1[normalize-space()='View Scanning Template']")
	private WebElement scanningTemplatePageHeader;

	@FindBy(xpath = "//span[contains(@class, 'block undefined')]")
	private WebElement selectTemplate;

	@FindBy(xpath = "//a[normalize-space()='View Scanning Template']")
	private WebElement viewTemplateHeader;

	@FindBy(xpath = "//span[normalize-space()='Scanning Templates']")
	private WebElement scanningTemplatesLabel;

	@FindBy(xpath = "//span[normalize-space()='Close']")
	private WebElement closeTemplateButton;

	// ================= MANAGE CREDENTIALS =================

	@FindBy(xpath = "//p[contains(text(),'Super Admin')]")
	private WebElement superAdminOptionMC;

	@FindBy(xpath = "//span[contains(text(),'Enrolled On')]")
	private WebElement enrolledOnLabel;

	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	private WebElement removeLabel;

	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> cardInventoryTable;

	// ================= IMPORT/DOWNLOAD =================
	@FindBy(xpath = "(//button[@aria-haspopup='menu'])[2]")
	private WebElement importCardButton;

	@FindBy(xpath = "(//button[normalize-space()='Download Template'])[1]")
	private WebElement downloadTemplateButton;

	@FindBy(xpath = "//p[contains(text(),'Download Successful')]")
	private WebElement downloadToast;

	@FindBy(xpath = "//button[normalize-space()='Upload CSV File']")
	private WebElement uploadCSVButton;

	@FindBy(xpath = "//h2[normalize-space()='Upload CSV File']")
	private WebElement uploadCSVPopup;

	@FindBy(xpath = "//button[normalize-space()='Browse File']")
	private WebElement browseFileButton;

	@FindBy(xpath = "(//span[normalize-space()='Upload'])[1]")
	private WebElement uploadCSVSubmit;

	@FindBy(xpath = "//p[contains(text(),'has been generated')]")
	private WebElement uploadCSVToast;

	@FindBy(xpath = "//button[@aria-label='Import']")
	private WebElement importHistoryButton;

	@FindBy(xpath = "//button[normalize-space()='Import History']")
	private WebElement importHistoryTab;

	@FindBy(xpath = "//h1[normalize-space()='Import History']")
	private WebElement importHistoryHeader;

	@FindBy(xpath = "//tr/td/div/a")
	private WebElement firstRequestID;

	@FindBy(xpath = "//h2[.='Overview']")
	private WebElement importDetailsHeader;

	// ================= MANAGE USER LIST =================

	@FindBy(xpath = "//button[normalize-space()='Download Template']")
	private WebElement userDownloadTemplateButton;

	@FindBy(xpath = "//button[normalize-space()='Upload CSV File']")
	private WebElement userUploadCSVButton;

	@FindBy(xpath = "//h2[normalize-space()='Upload CSV File']")
	private WebElement userUploadCSVPopup;

	@FindBy(xpath = "(//span[normalize-space()='Upload'])[1]")
	private WebElement userUploadCSVSubmit;

	@FindBy(xpath = "//p[contains(text(),'has been generated')]")
	private WebElement userUploadCSVToast;

	@FindBy(xpath = "//button[@aria-label='Import']")
	private WebElement userImportHistoryButton;

	@FindBy(xpath = "//button[normalize-space()='Import History']")
	private WebElement userImportHistoryTab;

	@FindBy(xpath = "//h1[normalize-space()='Import History']")
	private WebElement userImportHistoryHeader;

	@FindBy(xpath = "(//a[contains(@class, 'text')])[1]")
	private WebElement userFirstRequestID;

	@FindBy(xpath = "//h2[.='Quick Links']")
	private WebElement userImportDetailsHeader;

	@FindBy(xpath = "//span[.='Configure Widgets']")
	private WebElement configureWidgetsLabel;

	// ================= RETURN CARD TO INVENTORY =================
	@FindBy(xpath = "//span[.='Action']")
	private WebElement actionDropdownReturn;

	@FindBy(xpath = "//button[.='Return to Card Inventory']")
	private WebElement returnCardOption;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	private WebElement applyReturnCard;

	@FindBy(xpath = "(//span[.='Return to Card Inventory'])[2]")
	private WebElement confirmReturnCard;

	@FindBy(xpath = "//h2[normalize-space()='Return to Card Inventory']")
	private WebElement returnCardPopupHeader;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	private WebElement returnCardPopupCancel;

	public String getAccountName() {
		return utils.ConfigFileReader.getConfigProperty("Account" + CommonMethods.getRandomLong(1, 14));
	}

	public void searchAndOpenPerformanceAccount(String orgName) {

		waitUtils.waitForElementVisible(searchAccountInput).click();
		waitUtils.waitForMillis(1000);

		searchAccountInput.clear();
		waitUtils.waitForMillis(1000);

		System.out.println("-------------------------------------" + orgName);

		searchAccountInput.sendKeys(orgName);
		waitUtils.waitForMillis(2000);

		waitUtils.waitAndClick(performanceAccountWebLink);
	}

	public void openManageCredentials() {

		waitUtils.waitAndClick(accessManagementMenu);

		actions.doubleClick(waitUtils.waitForElementVisible(manageCredentialsMenu)).perform();

		actions.moveToElement(waitUtils.waitForElementVisible(downloadApplicationSection)).perform();

		// 🔥 Performance Tracking
		trackStep("Manage Credentials UI Load Time");

		waitUtils.waitForElementVisible(cardInventoryTab);
		waitUtils.waitForElementVisible(credentialsHeader);

		endStep();
	}

	public void openCardInventory() {

		waitUtils.waitAndClick(cardInventoryTab);

		// 🔥 Performance Tracking
		trackStep("Card Inventory UI Load Time");

		waitUtils.waitForElementVisible(enrolledOnColumn);
		waitUtils.waitForElementVisible(removeColumn);

		int rowCount = tableRows.size();
		System.out.println("Table content = " + rowCount);

		if (rowCount == 0) {
			System.out.println("No Users are displayed");
		}

		endStep();
	}

	public void enrollCard(String credentialNum) {

		// 🔹 Click Enroll Card
		waitUtils.waitAndClick(enrollCardButton);

		// 🔥 Performance Tracking – Enroll Card UI Load
		trackStep("Enroll Card UI Load Time");

		waitUtils.waitForElementVisible(enrollCardHeader);
		waitUtils.waitForElementClickable(submitButton);

		endStep();

		// 🔹 Fill Enroll Card Details
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(selectCardDropdown);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(typeFOption);

		
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(credentialNumberInput, credentialNum);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(cardNumberInput, credentialNum);

		System.out.println("Credential: " + credentialNum);

		// Select Organization
		waitUtils.waitAndClick(organizationDropdown);
		waitUtils.waitForMillis(500);
		waitUtils.waitForElementVisible(firstOrganizationOption);
		waitUtils.waitAndClick(firstOrganizationOption);

		// 🔹 Submit
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(submitButton);

		// 🔥 Performance Tracking – Submit Enroll Card
		trackStep("Submit Enroll Card Time");

		waitUtils.waitForElementVisible(cardNumberColumn);
		waitUtils.waitForElementVisible(tableRows.get(0));

		int rowCount = tableRows.size();
		System.out.println("Table content = " + rowCount);

		if (rowCount == 0) {
			System.out.println("No Users are displayed");
		}

		endStep();
	}

	public void openManageUserList() {

		actions.doubleClick(waitUtils.waitForElementVisible(accessManagementMenu)).perform();

		actions.doubleClick(waitUtils.waitForElementVisible(manageUserListMenu)).perform();

		// 🔥 Performance Tracking
		trackStep("Manage User List UI Load Time");

		waitUtils.waitForElementVisible(addUserButton);
		waitUtils.waitForElementVisible(manageUserListHeader);

		endStep();
	}

	public void addUser(String uniqueString, String randomNumber) {

		waitUtils.waitAndClick(addUserButton);

		// 🔥 Performance Tracking – Add User Popup
		trackStep("Add User Popup Load Time");

		waitUtils.waitForElementVisible(addUserPopupHeader);
		waitUtils.waitForElementClickable(addButton);

		endStep();

		String acsUser = "PrfUsr" + uniqueString;

		// Fill Form
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(userIdInput, acsUser);
		waitUtils.waitAndSendKeys(lastNameInput, "PerfUILN-" + uniqueString);
		waitUtils.waitAndSendKeys(firstNameInput, "PerfUIFN-" + uniqueString);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(furiganaSeiInput, "ジョン");
		waitUtils.waitAndSendKeys(furiganaMeiInput, "クホーテル");
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(emailInput, "perfACSemail" + randomNumber + "@gl.com");
		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(contactNumberInput, randomNumber);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(selectOrganizationDropdown);
		waitUtils.waitForMillis(500);
		waitUtils.waitAndClick(firstOrganizationOption);

		waitUtils.waitForMillis(500);
		waitUtils.waitAndSendKeys(departmentInput, "Performance UI Testing");

		waitUtils.waitAndClick(addButton);

		// 🔥 Performance Tracking – User Creation
		trackStep("Add User Submission Time");

		waitUtils.waitForElementVisible(addUserSuccessMessage);
		waitUtils.waitForElementVisible(userTableRows.get(0));

		int rowCount = userTableRows.size();
		System.out.println("Table content = " + rowCount);

		if (rowCount == 0) {
			System.out.println("No Users are displayed");
		}

		endStep();
	}

	public void navigateToManageCredentials() {

		actions.doubleClick(waitUtils.waitForElementVisible(accessManagementMenu)).perform();

		actions.doubleClick(waitUtils.waitForElementVisible(manageCredentialsMenu)).perform();

		actions.moveToElement(waitUtils.waitForElementVisible(downloadApplicationSection)).perform();

		// 🔥 Performance Tracking
		trackStep("Manage Credentials UI Load Time");

		waitUtils.waitForElementVisible(userCredentialsTab);
		waitUtils.waitForElementVisible(cardInventoryTab);

		endStep();
	}

	public void reopenCardInventoryFromManageCredentials() {

		waitUtils.waitAndClick(cardInventoryTab);

		trackStep("Card Inventory UI Load Time");

		waitUtils.waitForElementVisible(enrolledOnColumn);
		waitUtils.waitForElementVisible(removeColumn);
		waitUtils.waitForElementVisible(credentialTableRows.get(0));

		int rowCount = credentialTableRows.size();
		System.out.println("Table content = " + rowCount);

		if (rowCount == 0) {
			System.out.println("No Users are displayed");
		}

		endStep();
	}

	public void enrollNewCard(String cardName) {

		waitUtils.waitAndClick(enrollCardButton);

		// 🔥 Track Enroll Card UI
		trackStep("Enroll Card UI Load Time");

		waitUtils.waitForElementVisible(enrollCardHeader);
		waitUtils.waitForElementClickable(enrollCardSubmitButton);

		endStep();

		// Fill Details
		waitUtils.waitAndClick(selectCardDropdown);
		waitUtils.waitAndClick(typeFOption);

		waitUtils.waitAndSendKeys(credentialNumberInput, cardName);
		waitUtils.waitAndSendKeys(cardNumberInput, cardName);

		waitUtils.waitAndClick(organizationDropdown);

		String org = firstOrganizationOption.getText();
		waitUtils.waitAndClick(firstOrganizationOption);

		System.out.println("Organization: " + org);
		System.out.println("Credential: " + cardName);

		waitUtils.waitAndClick(submitButton);

		// 🔥 Track Submission
		trackStep("Submit Enroll Card Time");

		waitUtils.waitForElementVisible(cardNumberSuccessMessage);
		waitUtils.waitForElementVisible(credentialTableRows.get(0));

		int rowCount = credentialTableRows.size();
		System.out.println("Table content = " + rowCount);

		if (rowCount == 0) {
			System.out.println("No Users are displayed");
		}

		endStep();
	}

	public void assignCardToUsers(String credentialNum, String cardName) {

		for (int i = 0; i < 2; i++) {

			String cardToSearch = (i == 0) ? credentialNum : cardName;

			System.out.println("Card used for search: " + cardToSearch);

			// 🔹 Search Card
			waitUtils.waitForMillis(500);
			waitUtils.waitForElementVisible(cardSearchInput).clear();
			waitUtils.waitAndSendKeys(cardSearchInput, cardToSearch);

			// 🔹 Click Assign Icon
			waitUtils.waitForMillis(500);
			waitUtils.waitAndClick(assignCardIcon);

			// 🔥 Track Assign Popup Load
			trackStep("Assign Card Popup Load Time");

			waitUtils.waitForElementVisible(assignCardPopupHeader);
			waitUtils.waitForElementVisible(assignCardSubHeader);
			waitUtils.waitForElementVisible(cancelButton);

			endStep();

			// 🔹 Select Organization
			waitUtils.waitForMillis(1000);
			waitUtils.waitAndClick(organizationDropdown);
			waitUtils.waitForMillis(2000);
			
			int orgIndex = new Random().nextInt(organizationOptions.size());
			WebElement selectedOrg = organizationOptions.get(orgIndex);
			String orgName = selectedOrg.getText();

			waitUtils.waitAndClick(selectedOrg);
			System.out.println("Selected Organization: " + orgName);

			// 🔹 Select User
			waitUtils.waitForMillis(1000);
			waitUtils.waitAndClick(userSearchInput);
			waitUtils.waitAndClick(perfUserOption);

			// 🔹 Select Card Type
			waitUtils.waitAndClick(firstCardTypeRadio);

			// 🔹 Select Date
			waitUtils.waitAndClick(datePicker);

			// 🔹 Click Assign
			waitUtils.waitAndClick(assignButton);

			// 🔥 Track Assign Submission
			trackStep("Assign Card Submission Time");

			waitUtils.waitForElementVisible(enrollCardTab);

			endStep();

			System.out.println("Assign Card completed for: " + cardToSearch);
		}
	}

	public void revokeCardFromUserCredentials(String cardName) {

		// 🔹 Move to User Credentials
		waitUtils.waitAndClick(userCredentialsTab);

		trackStep("Move from Card Inventory to User Credentials");

		waitUtils.waitForElementVisible(userCredentialsBreadcrumb);
		waitUtils.waitForElementVisible(manageCredentialsBreadcrumb);

		endStep();

		// 🔹 Search Card
		waitUtils.waitAndSendKeys(credentialSearchInput, cardName);

		// 🔹 Select Card Checkbox
		waitUtils.waitAndClick(secondCheckbox);

		// 🔹 Open Card Action
		waitUtils.waitAndClick(cardActionButton);

		// 🔹 Open Dropdown
		waitUtils.waitAndClick(actionDropdown);

		// 🔹 Select Revoke
		waitUtils.waitAndClick(revokeOption);

		// 🔹 Click Apply
		waitUtils.waitAndClick(applyButton);

		trackStep("Revoke Card Popup Load Time");

		waitUtils.waitForElementVisible(revokePopupHeader);
		waitUtils.waitForElementVisible(cancelButton);
		waitUtils.waitForElementVisible(revokeConfirmButton);

		endStep();

		// 🔹 Confirm Revoke
		waitUtils.waitAndClick(revokeConfirmButton);

		trackStep("Revoke Card Submission Time");

		waitUtils.waitForElementVisible(revokeSuccessToast);

		endStep();

		System.out.println("Card revoked successfully: " + cardName);
	}

	public void reassignCard(String cardName) {

		// 🔹 Search Card
		waitUtils.waitForElementVisible(credentialSearchInput).clear();
		waitUtils.waitAndSendKeys(credentialSearchInput, cardName);

		// 🔹 Select Checkbox
		waitUtils.waitAndClick(secondCheckbox1);

		// 🔹 Click Card Action
		waitUtils.waitAndClick(cardActionButton);

		// 🔹 Open Dropdown
		waitUtils.waitAndClick(revokeDropdown);

		// 🔹 Select Reassign Option
		waitUtils.waitAndClick(reassignOption);

		// 🔹 Click Apply
		waitUtils.waitAndClick(applyButton);

		// 🔥 Track Reassign Popup Load
		trackStep("ReAssign Card Popup Load Time");

		waitUtils.waitForElementVisible(reassignPopupHeader);
		waitUtils.waitForElementVisible(cancelButton);
		waitUtils.waitForElementVisible(confirmButton);

		endStep();

		// 🔹 Confirm Reassign
		waitUtils.waitAndClick(confirmButton);

		// 🔥 Track Submission
		trackStep("ReAssign Card Submission Time");

		waitUtils.waitForElementVisible(reassignSuccessToast);

		endStep();

		// 🔹 Return Card to Inventory (toggle checkbox twice)
		waitUtils.waitAndClick(secondCheckbox);
		System.out.println("Checkbox unchecked");

		waitUtils.waitAndClick(secondCheckbox);
		System.out.println("Checkbox clicked again");

		System.out.println("Card reassigned successfully: " + cardName);
	}

	public void returnCardToInventory(String cardName) {

		// 🔹 Click Card Action
		waitUtils.waitAndClick(cardActionButton5);

		// 🔹 Open Dropdown
		waitUtils.waitAndClick(actionDropdown4);
		waitUtils.waitAndClick(actionDropdown4); // double click for reliability

		// 🔹 Select Return to Card Inventory
		waitUtils.waitAndClick(returnToInventoryOption);

		// 🔹 Click Apply
		waitUtils.waitAndClick(applyButtonRTCI);

		// 🔥 Track Popup Load
		trackStep("Return to Card Inventory popup");
		waitUtils.waitForElementVisible(returnToInventoryPopupHeader);
		waitUtils.waitForElementVisible(cancelButtonRTCI);
		waitUtils.waitForElementVisible(returnButtonRTCI);
		endStep();

		// 🔹 Click Return Button
		waitUtils.waitAndClick(returnButtonRTCI);

		// 🔥 Track Card Return
		trackStep("Return Card to Card Inventory");
		waitUtils.waitForElementVisible(returnSuccessToast);
		waitUtils.waitForElementVisible(cardNumberHeader);
		endStep();

		// 🔹 Refresh & Search
		waitUtils.waitForElementVisible(searchCardInput).clear();
		driver.navigate().refresh();

		System.out.println("Card returned to inventory successfully: " + cardName);
	}

	public void replaceCard() throws InterruptedException {

		// 🔹 Select Card Checkbox
		waitUtils.waitAndClick(cardCheckbox);

		// 🔹 Open Action Dropdown
		waitUtils.waitAndClick(actionDropdown);

		// 🔹 Select Replace Card
		waitUtils.waitAndClick(replaceCardOption);

		// 🔹 Click Apply
		waitUtils.waitAndClick(applyButtonReplace);

		// 🔥 Track Replace Card Popup
		trackStep("Replace Card(s) pop-up");
		waitUtils.waitForElementVisible(cardNumberHeaderReplace);
		waitUtils.waitForElementVisible(replaceCardPopupHeader);
		endStep();

		// 🔹 Select Reason
		waitUtils.waitAndClick(reasonDropdown);
		waitUtils.waitAndClick(reasonCardLost);

		// 🔹 Select Replacement Card
		waitUtils.waitAndClick(replacementCardSearchInput);
		waitUtils.waitAndClick(selectReplacementCard);

		// 🔹 Click Replace
		waitUtils.waitAndClick(replaceButton);

		// 🔥 Track Replace Card Submission
		trackStep("Replace Card");
		waitUtils.waitForElementVisible(manageCredentialsHeader);
		waitUtils.waitForElementVisible(replaceSuccessToast);

		if (cardsTable.size() > 0) {
			System.out.println("Table content = " + cardsTable.size());
		} else {
			System.out.println("No Cards are displayed");
		}

		endStep();
	}

	public void removeCardDeleteUserViewTemplate() throws InterruptedException {

		// ================= REMOVE CARD =================
		waitUtils.waitAndClick(removeCardCheckbox);
		waitUtils.waitAndClick(actionDropdownRemove);
		waitUtils.waitAndClick(removeCardOption);
		waitUtils.waitAndClick(applyButtonRemove);

		trackStep("Remove Card(s) pop-up");
		waitUtils.waitForElementVisible(removeCardPopupHeader);
		waitUtils.waitForElementVisible(removeButton);
		endStep();

		waitUtils.waitAndClick(removeButton);

		trackStep("Remove Card Successfully");
		waitUtils.waitForElementVisible(removeSuccessToast);
		if (cardsTableRemove.size() > 0) {
			System.out.println("Table content = " + cardsTableRemove.size());
		} else {
			System.out.println("No Cards are displayed");
		}
		endStep();

		// ================= DELETE USER =================
		waitUtils.waitAndClick(deleteUserButton);

		trackStep("Delete User pop-up");
		waitUtils.waitForElementVisible(deleteUserPopupHeader);
		endStep();

		waitUtils.waitAndClick(confirmDeleteUser);

		trackStep("Delete User Successfully");
		if (usersTable.size() > 0) {
			System.out.println("Table content = " + usersTable.size());
		} else {
			System.out.println("No Users are displayed");
		}
		endStep();

		// ================= VIEW SCANNING TEMPLATE =================
		waitUtils.waitAndClick(viewScanningTemplate);
		waitUtils.waitAndClick(superAdminOption);

		trackStep("View Scanning Template Page");
		waitUtils.waitForElementVisible(scanningTemplatePageHeader);
		endStep();

		waitUtils.waitAndClick(selectTemplate);

		trackStep("View Scanning Template");
		waitUtils.waitForElementVisible(viewTemplateHeader);
		waitUtils.waitForElementVisible(scanningTemplatesLabel);
		waitUtils.waitForElementVisible(closeTemplateButton);
		endStep();
	}

	public void manageCredentialsAndUserListFlow() throws InterruptedException, AWTException {

		// ================= MANAGE CREDENTIALS =================
		waitUtils.waitAndClick(accessManagementMenu);
		waitUtils.waitAndClick(manageCredentialsMenu);
		actions.moveToElement(superAdminOptionMC).perform();

		trackStep("Manage Credentials UI");
		waitUtils.waitForElementVisible(cardInventoryTab);
		waitUtils.waitForElementVisible(enrolledOnLabel);
		waitUtils.waitForElementVisible(removeLabel);
		endStep();

		// ================= CARD INVENTORY =================
		waitUtils.waitAndClick(cardInventoryTab);
		Thread.sleep(2000);

		trackStep("Card Inventory UI");
		waitUtils.waitForElementVisible(cardInventoryTable.get(0));
		System.out.println("Card table count = " + cardInventoryTable.size());
		endStep();

		// ================= DOWNLOAD TEMPLATE =================
		waitUtils.waitAndClick(importCardButton);
		waitUtils.waitAndClick(downloadTemplateButton);

		trackStep("Download Template Toast");
		waitUtils.waitForElementVisible(downloadToast);
		endStep();

		// ================= UPLOAD CSV =================
		waitUtils.waitAndClick(importCardButton);
		waitUtils.waitAndClick(uploadCSVButton);

		trackStep("Upload CSV Popup");
		waitUtils.waitForElementVisible(uploadCSVPopup);
		endStep();

		Robot rb = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(new StringSelection("C:\\Upload_Files\\Import_File_for_cards.csv"), null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		waitUtils.waitAndClick(uploadCSVSubmit);

		trackStep("Upload CSV Toast");
		waitUtils.waitForElementVisible(uploadCSVToast);
		endStep();

		// ================= IMPORT HISTORY =================
		waitUtils.waitAndClick(importHistoryButton);
		waitUtils.waitAndClick(importHistoryTab);

		trackStep("Import History Page");
		waitUtils.waitForElementVisible(importHistoryHeader);
		waitUtils.waitAndClick(firstRequestID);

		trackStep("Import Details Page");
		waitUtils.waitForElementVisible(importDetailsHeader);
		endStep();

		// ================= MANAGE USER LIST =================
		waitUtils.waitAndClick(accessManagementMenu);
		waitUtils.waitAndClick(manageUserListMenu);
		waitUtils.waitAndClick(manageUserListMenu);

		trackStep("Manage User List");
		waitUtils.waitForElementVisible(addUserButton);
		waitUtils.waitForElementVisible(manageUserListHeader);
		endStep();

		// ================= DOWNLOAD & UPLOAD USER CSV =================
		waitUtils.waitAndClick(userDownloadTemplateButton);
		trackStep("User Download Template Toast");
		waitUtils.waitForElementVisible(userUploadCSVToast); // toast after download
		endStep();

		waitUtils.waitAndClick(userUploadCSVButton);

		Robot rbs = new Robot();
		rbs.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(new StringSelection("C:\\Upload_Files\\Import_File_for_Users.csv"), null);
		rbs.delay(2000);
		rbs.keyPress(KeyEvent.VK_CONTROL);
		rbs.keyPress(KeyEvent.VK_V);
		rbs.keyRelease(KeyEvent.VK_CONTROL);
		rbs.keyRelease(KeyEvent.VK_V);
		rbs.keyPress(KeyEvent.VK_ENTER);
		rbs.keyRelease(KeyEvent.VK_ENTER);

		waitUtils.waitAndClick(userUploadCSVSubmit);
		trackStep("User Upload CSV Toast");
		waitUtils.waitForElementVisible(userUploadCSVToast);
		endStep();

		// ================= USER IMPORT HISTORY =================
		waitUtils.waitAndClick(userImportHistoryButton);
		waitUtils.waitAndClick(userImportHistoryTab);

		trackStep("User Import History Page");
		waitUtils.waitForElementVisible(userImportHistoryHeader);
		waitUtils.waitAndClick(userFirstRequestID);

		trackStep("User Import Details Page");
		waitUtils.waitForElementVisible(userImportDetailsHeader);
		waitUtils.waitForElementVisible(configureWidgetsLabel);
		endStep();

		// ================= RETURN CARD TO INVENTORY =================
		waitUtils.waitAndClick(actionDropdownReturn);
		waitUtils.waitAndClick(returnCardOption);
		waitUtils.waitAndClick(applyReturnCard);
		waitUtils.waitAndClick(confirmReturnCard);

		trackStep("Return Card to Inventory Popup");
		waitUtils.waitForElementVisible(returnCardPopupHeader);
		waitUtils.waitForElementVisible(returnCardPopupCancel);
		endStep();
	}

}
