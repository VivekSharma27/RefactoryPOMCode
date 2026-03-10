package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.CommonMethods;

public class BSBU_CustomerDashbaordPage extends BasePage {

	private Actions actions;

	public BSBU_CustomerDashbaordPage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.actions = new Actions(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Search Account']")
	WebElement selectAccount;

	@FindBy(xpath = "//button[.='aaaa']")
	WebElement accountButton;

	@FindBy(xpath = "//input")
	WebElement searchInput;
	@FindBy(xpath = "//h3[text()='Select Account']")
	private WebElement selectAccountheader;

	@FindBy(xpath = "//span[contains(text(),'Perf')]")
	WebElement performanceTab;

	@FindBy(xpath = "//h1[.='Dashboard']")
	private WebElement dashboardHeader;

	@FindBy(xpath = "//h2[.='Device Alarms']")
	WebElement deviceAlarms;

	@FindBy(xpath = "//h2[.='Announcements']")
	WebElement announcements;

	@FindBy(xpath = "//h2[.='Manuals']")
	WebElement manuals;

	@FindBy(xpath = "(//canvas)[1]")
	WebElement deviceAlarmGraph;

	@FindBy(xpath = "(//canvas)[2]")
	WebElement controllerAlarmGraph;

	@FindBy(xpath = "//span[.='Show all alarms']")
	WebElement showAllAlarms;

	@FindBy(xpath = "//button[@aria-label='View expired credentials']")
	WebElement expiredCredentials;

	@FindBy(xpath = "//p[contains(@aria-label, 'Credentials Inventory')]")
	WebElement credentialsInventory;

	@FindBy(xpath = "//span[.='View All']")
	WebElement viewAllFiles;

	@FindBy(xpath = "//span[.='Configure Widgets']")
	WebElement configureWidgets;

	@FindBy(xpath = "//span[.='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath = "(//*[.='Manage Access Profile'])[2]")
	WebElement manageAccessProfile;

	@FindBy(xpath = "(//*[.='Configure Calendar'])[2]")
	WebElement configureCalendar;

	@FindBy(xpath = "(//*[.='Manage Organizations'])[2]")
	WebElement manageOrganizations;

	@FindBy(xpath = "(//*[.='Manage Buildings'])[2]")
	WebElement manageBuildings;

	@FindBy(xpath = "(//*[.='Manage Portfolio'])[2]")
	WebElement managePortfolio;

	@FindBy(xpath = "(//button[@aria-label='Edit'])[2]")
	WebElement editContactInfo;

	@FindBy(xpath = "//h1[.='Alarm History']")
	WebElement alarmHistoryHeader;

	@FindBy(xpath = "//h1[.='Manage Access Profile']")
	WebElement manageAccessProfileHeader;

	@FindBy(xpath = "//h1[.='Configure Calendar']")
	WebElement configureCalendarHeader;

	@FindBy(xpath = "//h1[.='Manage Organizations']")
	WebElement manageOrganizationsHeader;

	@FindBy(xpath = "//h1[.='Manage Buildings']")
	WebElement manageBuildingsHeader;

	@FindBy(xpath = "//h1[.='Manage Portfolio']")
	WebElement managePortfolioHeader;

	@FindBy(xpath = "//h1[.='Manage Credentials']")
	WebElement manageCredentialsHeader;

	@FindBy(xpath = "//span[.='Enroll Card']")
	WebElement enrollCard;

	@FindBy(xpath = "//h1[.='File Management']")
	WebElement fileManagementHeader;

	@FindBy(xpath = "//h1[.='Configure Widgets']")
	WebElement configureWidgetsHeader;

	@FindBy(xpath = "//h1[.='Contact Information']")
	WebElement contactInfoHeader;

	// -------------------- Methods --------------------

	public String getAccountName() {
		return utils.ConfigFileReader.getConfigProperty("Account" + CommonMethods.getRandomLong(1, 14));
	}

	public void selectAccount(String accountName) {

		waitUtils.waitForMillis(2000);
		trackStep("Select Account");
		waitUtils.waitForElementVisible(selectAccountheader);
		waitUtils.waitForElementVisible(selectAccount).click();
//		actions.moveToElement(accountButton).perform();
//		waitUtils.waitAndClick(searchInput);

		searchInput.clear();
		searchInput.sendKeys(accountName);

		waitUtils.waitAndClick(performanceTab);

		waitUtils.waitForElementVisible(dashboardHeader);
		waitUtils.waitForElementVisible(deviceAlarms);
		waitUtils.waitForElementVisible(announcements);
		waitUtils.waitForElementVisible(manuals);

		endStep();

		waitUtils.waitForMillis(2000);
	}

	public void openDeviceAlarm() {

		trackStep("Load Device Alarm from Customer Dashboard");

		waitUtils.waitForElementVisible(deviceAlarmGraph).click();
		waitUtils.waitForElementVisible(alarmHistoryHeader);
		waitUtils.waitForElementVisible(showAllAlarms);

		endStep();
		
//		driver.navigate().back();

	}

	public void openControllerAlarm() {

		trackStep("Load Controller Alarm from Customer Dashboard");

		waitUtils.waitAndClick(controllerAlarmGraph);
		waitUtils.waitForElementVisible(alarmHistoryHeader);
		waitUtils.waitForElementVisible(showAllAlarms);

		endStep();
		waitUtils.waitForMillis(1000);
	}

	public void navigateBackToDashboard() {

		waitUtils.waitForMillis(1000);

		driver.navigate().back();
		
		trackStep("Come Back to the Customer Dashboard Page");
		
		driver.navigate().back();

		waitUtils.waitForElementVisible(dashboardHeader);
		waitUtils.waitForElementVisible(deviceAlarms);
		waitUtils.waitForElementVisible(announcements);
		waitUtils.waitForElementVisible(manuals);

		endStep();
		waitUtils.waitForMillis(1000);
	}

	public void openManageAccessProfile() {

		trackStep("Load Manage Access Profile");

		waitUtils.waitAndClick(manageAccessProfile);
		waitUtils.waitForElementVisible(manageAccessProfileHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openConfigureCalendar() {

		trackStep("Load Configure Calendar");

		waitUtils.waitAndClick(configureCalendar);
		waitUtils.waitForElementVisible(configureCalendarHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openManageOrganizations() {

		trackStep("Load Manage Organizations");

		waitUtils.waitAndClick(manageOrganizations);
		waitUtils.waitForElementVisible(manageOrganizationsHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openManageBuildings() {

		trackStep("Load Manage Buildings");

		waitUtils.waitAndClick(manageBuildings);
		waitUtils.waitForElementVisible(manageBuildingsHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openManagePortfolio() {

		trackStep("Load Manage Portfolio");

		waitUtils.waitAndClick(managePortfolio);
		waitUtils.waitForElementVisible(managePortfolioHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openExpiredCredentials() {

		trackStep("Load Expired Credentials");

		waitUtils.waitAndClick(expiredCredentials);
		waitUtils.waitForElementVisible(manageCredentialsHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openCredentialsInventory() {

		trackStep("Load Credentials Inventory");

		waitUtils.waitAndClick(credentialsInventory);
		waitUtils.waitForElementVisible(manageCredentialsHeader);
		waitUtils.waitForElementVisible(enrollCard);

		endStep();

//		driver.navigate().back();
	}

	public void openFileManagement() {

		trackStep("Load File Management");

		waitUtils.waitAndClick(viewAllFiles);
		waitUtils.waitForElementVisible(fileManagementHeader);

		endStep();

//		driver.navigate().back();
	}

	public void openConfigureWidgets() {

		trackStep("Load Configure Widgets");

		waitUtils.waitAndClick(configureWidgets);
		waitUtils.waitForElementVisible(configureWidgetsHeader);
		waitUtils.waitAndClick(cancelButton);

		endStep();
	}

	public void openContactInformation() {

		trackStep("Load Contact Information");

		waitUtils.waitAndClick(editContactInfo);
		waitUtils.waitForElementVisible(contactInfoHeader);
		waitUtils.waitAndClick(cancelButton);

		endStep();
	}

}
