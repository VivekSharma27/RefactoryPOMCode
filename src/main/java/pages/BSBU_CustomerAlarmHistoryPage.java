package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.CommonMethods;

public class BSBU_CustomerAlarmHistoryPage extends BasePage {

	private Actions actions;

	public BSBU_CustomerAlarmHistoryPage(WebDriver driver) throws Exception {
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

	@FindBy(xpath = "//div[contains(text(),'Alarms')]")
	private WebElement alarmsMenu;

	@FindBy(xpath = "//h1[contains(.,'Alarm History')]")
	private WebElement alarmHistoryHeader;

	@FindBy(xpath = "//h3[.='Alarm History']")
	private WebElement alarmHistorySubHeader;

	@FindBy(xpath = "//div[contains(text(),'Alarm History')]")
	private WebElement alarmHistoryMenu;

	@FindBy(xpath = "//tr/td/div/a")
	private List<WebElement> alarmRecords;
	
	
	// ================= ALARM STATUS FILTER =================
	
	@FindBy (xpath = "(//span[@class=' whitespace-nowrap'])[2]")
	private WebElement clickFiletr;

	@FindBy(xpath = "(//button[@aria-label='Delete'])[2]")
	private WebElement deleteStatusButton;  // Reused for Acknowledged, In-Progress, Resolved
	
	// ================= ALARM FILTER =================
	@FindBy(xpath = "//span[.='Apply']")
	private WebElement applyFilterButton;

	@FindBy(xpath = "//tr/td/div/a")
	private List<WebElement> alarmTableRows; // All rows after filter
	
	// Alarm Details Page Headers
	@FindBy(xpath = "//h1/div/span[1]")
	private WebElement alarmDetailsHeader;

	@FindBy(xpath = "(//div/h2)[2]")
	private WebElement alarmDetailsSubHeader;

	@FindBy(xpath = "(//div[contains(text(),'Site')])[1]")
	private WebElement siteFilter;

	@FindBy(xpath = "(//span[contains(text(),'Building')])[1]")
	private WebElement buildingFilter;

	@FindBy(xpath = "(//div[contains(text(),'Floor')])[1]")
	private WebElement floorFilter;

	@FindBy(xpath = "//span[.='Apply']")
	private WebElement applyButton;

	@FindBy(xpath = "(//td/div/a)")
	private List<WebElement> alarmsList;

	@FindBy(xpath = "(//button[@aria-label='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//p[.='Super Admin']")
	private WebElement superAdminText;
	
	@FindBy(xpath= "//span[text()='Alarm ID']")
	private WebElement alarmID;
	
	// ================= ALARM ACTIONS =================
	@FindBy(xpath = "//button[.='Action']")
	private WebElement alarmActionButton;

	@FindBy(xpath = "//button[@role='menuitem'][1]")
	private WebElement acknowledgeMenuItem;

	@FindBy(xpath = "//button[.='Start Resolution']")
	private WebElement startResolutionMenuItem;

	@FindBy(xpath = "//button[.='Resolved']")
	private WebElement resolveMenuItem;

	@FindBy(xpath = "//button[.='Close']")
	private WebElement closeMenuItem;

	@FindBy(xpath = "//h2[.='Acknowledge']")
	private WebElement acknowledgeHeader;

	@FindBy(xpath = "//h2[.='Start Resolution']")
	private WebElement startResolutionHeader;

	@FindBy(xpath = "//h2[.='Resolve']")
	private WebElement resolveHeader;

	@FindBy(xpath = "//h2[.='Close']")
	private WebElement closeHeader;

	@FindBy(xpath = "//span[.='Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionTextArea;

	@FindBy(xpath = "//div[.='Emergency Alarm']")
	private WebElement alarmNameLabel;

	@FindBy(xpath = "//div[.='Acknowledged']")
	private WebElement acknowledgedStatus;

	@FindBy(xpath = "(//div[.='In Progress'])[1]")
	private WebElement inProgressStatus;

	@FindBy(xpath = "//div[.='Resolved']")
	private WebElement resolvedStatus;

	@FindBy(xpath = "//div[.='Closed']")
	private WebElement closedStatus;

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

	public void openAlarmHistoryPage() {
		// 🔹 Click Alarms
		
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(alarmsMenu);
//		waitUtils.waitForMillis(2000);

		// 🔹 Click Alarm History
		trackStep("Alarm History landing page");
		waitUtils.waitAndClick(alarmHistoryMenu);
		waitUtils.waitForElementVisible(alarmHistoryHeader);
		waitUtils.waitForElementVisible(alarmHistorySubHeader);
		endStep();
		
		waitUtils.waitForMillis(2000);
		waitUtils.waitForElementVisible(superAdminText).click();
	}

	public void applySiteBuildingFloorFilters() {
		// 🔹 Click Site
		trackStep("Apply Site filter");
		waitUtils.waitAndClick(siteFilter);
		waitUtils.waitForMillis(1000);
		endStep();

		// 🔹 Click Building
		trackStep("Apply Building filter");
		waitUtils.waitAndClick(buildingFilter);
		waitUtils.waitForMillis(1000);
		endStep();

		// 🔹 Click Floor
		trackStep("Apply Floor filter");
		waitUtils.waitAndClick(floorFilter);
		waitUtils.waitForMillis(1000);
		endStep();
	}

	public void verifyAlarmRecords() {
		
		waitUtils.waitForMillis(90000);
		waitUtils.waitForElementVisible(alarmID,60); // adding custom wait time for 1 minute
		
		trackStep("Alarm History details to display records");
		waitUtils.waitForElementVisible(alarmRecords.get(0));

		int rowCount = alarmRecords.size();
		System.out.println("Table content = " + rowCount);

		if (rowCount > 0) {
			endStep();
		} else {
			System.out.println("No Alarms are displayed");
			endStep();
		}
	}
	
	public void applyAlarmStatusFilterAndClear() {

	    // 🔹 Click first page
	    waitUtils.waitAndClick(clickFiletr);

	    // 🔹 Clear Acknowledged
	    trackStep("Clear Acknowledged status");
	    waitUtils.waitAndClick(deleteStatusButton);
	    endStep();

	    // 🔹 Clear In-Progress
	    trackStep("Clear In-Progress status");
	    waitUtils.waitAndClick(deleteStatusButton);
	    endStep();

	    // 🔹 Clear Resolved
	    trackStep("Clear Resolved status");
	    waitUtils.waitAndClick(deleteStatusButton);
	    endStep();
	    
	    // 🔹 Click Apply Filter
	    waitUtils.waitAndClick(applyFilterButton);

	    // 🔹 Performance Tracking – Wait for Alarm Table
	    trackStep("Alarm page after filter");
	    
	    waitUtils.waitForElementVisible(alarmRecords.get(0));  // Wait for at least one row to be visible

//	    waitUtils.waitForElementsVisible(alarmTableRows.get(0));  

	    int rowCount = alarmTableRows.size();
	    System.out.println("Table content after filter = " + rowCount);

	    endStep();
	}
	
	

	public void clickRandomAlarmRecord() {
		int randomIndex = new Random().nextInt(alarmRecords.size());

		trackStep("Open Alarm details page");

		waitUtils.waitAndClick(alarmRecords.get(randomIndex));

		waitUtils.waitForElementVisible(alarmDetailsHeader);
		waitUtils.waitForElementVisible(alarmDetailsSubHeader);

		endStep();
		waitUtils.waitForMillis(1000);
	}
	
	
	
	public void acknowledgeAlarm(String note) {
	   
		waitUtils.waitAndClick(alarmActionButton);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(acknowledgeMenuItem);

	    trackStep("Acknowledge Alarm pop-up load");
	    waitUtils.waitForElementVisible(acknowledgeHeader);
	    waitUtils.waitForElementVisible(confirmButton);
	    endStep();

	    // Enter note and confirm
	    waitUtils.waitForElementVisible(descriptionTextArea).sendKeys(note);
	    waitUtils.waitAndClick(confirmButton);

	    trackStep("Acknowledge Alarm Success");
	    waitUtils.waitForElementVisible(alarmNameLabel);
	    waitUtils.waitForElementVisible(acknowledgedStatus);
	    endStep();
	}

	public void startResolutionAlarm(String note) {
	    waitUtils.waitAndClick(alarmActionButton);
	    waitUtils.waitAndClick(startResolutionMenuItem);

	    trackStep("Start Resolution pop-up load");
	    waitUtils.waitForElementVisible(startResolutionHeader);
	    waitUtils.waitForElementVisible(confirmButton);
	    endStep();

	    waitUtils.waitForElementVisible(descriptionTextArea).sendKeys(note);
	    waitUtils.waitAndClick(confirmButton);

	    trackStep("Start Resolution Success");
	    waitUtils.waitForElementVisible(alarmNameLabel);
	    waitUtils.waitForElementVisible(inProgressStatus);
	    endStep();
	}

	public void resolveAlarm(String note) {
	    waitUtils.waitAndClick(alarmActionButton);
	    waitUtils.waitAndClick(resolveMenuItem);

	    trackStep("Resolve Alarm pop-up load");
	    waitUtils.waitForElementVisible(resolveHeader);
	    waitUtils.waitForElementVisible(confirmButton);
	    endStep();

	    waitUtils.waitForElementVisible(descriptionTextArea).sendKeys(note);
	    waitUtils.waitAndClick(confirmButton);

	    trackStep("Resolve Alarm Success");
	    waitUtils.waitForElementVisible(alarmNameLabel);
	    waitUtils.waitForElementVisible(resolvedStatus);
	    endStep();
	}

	public void closeAlarm(String note) {
	    waitUtils.waitAndClick(alarmActionButton);
	    waitUtils.waitAndClick(closeMenuItem);

	    trackStep("Close Alarm pop-up load");
	    waitUtils.waitForElementVisible(closeHeader);
	    waitUtils.waitForElementVisible(confirmButton);
	    endStep();

	    waitUtils.waitForElementVisible(descriptionTextArea).sendKeys(note);
	    waitUtils.waitAndClick(confirmButton);

	    trackStep("Close Alarm Success");
	    waitUtils.waitForElementVisible(alarmNameLabel);
	    waitUtils.waitForElementVisible(closedStatus);
	    endStep();
	}
}
