package pages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BSBU_AnnouncementPage extends BasePage {

	private Actions actions;

	public BSBU_AnnouncementPage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}

	@FindBy(id = "sidebar")
	WebElement sidebar;

	@FindBy(xpath = "//div[.='Announcements']")
	WebElement announcementsMenu;

	@FindBy(xpath = "//input[contains(@placeholder,'search')]")
	WebElement searchInput;

	@FindBy(xpath = "//span[.='Delete']")
	WebElement deleteHeaderButton;

	// ================= Create Announcement =================

	@FindBy(xpath = "//span[.='Create Announcement']")
	WebElement createAnnouncementButton;

	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement titleInput;

	@FindBy(xpath = "//label[.='Emergency']")
	WebElement emergencyLabel;

	@FindBy(xpath = "//div[@data-placeholder='Enter Message']")
	WebElement messageInput;

	@FindBy(xpath = "(//div[.='Next'])[2]")
	WebElement nextButton2;

	@FindBy(xpath = "(//div[.='Next'])[3]")
	WebElement nextButton3;

	@FindBy(xpath = "//label[.='Push Notification']")
	WebElement pushNotificationLabel;

	@FindBy(xpath = "//label[.='Facility']")
	WebElement facilityLabel;

	@FindBy(xpath = "//label[.='ACS']")
	WebElement acsLabel;

	@FindBy(xpath = "//label[.='Energy']")
	WebElement energyLabel;

	@FindBy(xpath = "//label[.='Everyone (All Roles)']")
	WebElement everyoneRolesLabel;

	@FindBy(xpath = "//label[.='Only Once']")
	WebElement onlyOnceLabel;

	@FindBy(xpath = "//input[@placeholder='YYYY']")
	WebElement datePickerInput;

	@FindBy(xpath = "//input[@placeholder='HH']")
	WebElement hourInput;

	@FindBy(xpath = "(//input[@placeholder='MM'])[2]")
	WebElement minuteInput;

	@FindBy(xpath = "(//span[.='Create Announcement'])[3]")
	WebElement confirmCreateAnnouncement;

	@FindBy(xpath = "//p[contains(text(),'created successfully')]")
	WebElement createSuccessToast;

	// ================= Edit =================

	@FindBy(xpath = "//span[@class='underline text-primary hover:text-primary-dark hover:cursor-pointer']")
	WebElement firstAnnouncementLink;

	@FindBy(xpath = "//span[.='customNotifications.editAnnouncement.editAnnouncementLabel']")
	WebElement editAnnouncementButton;

	@FindBy(xpath = "//div[contains(text(),'customNotifications.createAnnouncement.select')]")
	WebElement SelectAnnouncementDetails;

	@FindBy(xpath = "//span[.='Save Announcement']")
	WebElement saveAnnouncementButton;

	@FindBy(xpath = "//p[contains(text(),'updated successfully')]")
	WebElement updateSuccessToast;

	// ================= Delete =================

	@FindBy(xpath = "//button[@aria-label='Delete']")
	WebElement deleteButton;

	@FindBy(xpath = "(//span[.='Delete'])[2]")
	WebElement confirmDeleteButton;

	// ================= Templates =================

	@FindBy(xpath = "//span[.='Templates']")
	WebElement templatesTab;

	@FindBy(xpath = "//span[.='Messages']")
	WebElement messagesTab;

	@FindBy(xpath = "//span[.='Notify To']")
	WebElement notifyToTab;

	@FindBy(xpath = "//span[.='Create Template']")
	WebElement createTemplateButton;

	@FindBy(xpath = "//input[@placeholder='Enter Template Name']")
	WebElement templateNameInput;

	@FindBy(xpath = "//span[.='Save Template']")
	WebElement saveTemplateButton;

	@FindBy(xpath = "//p[contains(text(),'has been created successfully')]")
	WebElement templateCreatedToast;

	@FindBy(xpath = "//p[contains(text(),'updated successfully')]")
	WebElement templateUpdatedToast;

	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
	WebElement templateDeletedToast;
	
	@FindBy(xpath = "(//button[@aria-label='Edit'])[1]")
	WebElement firstEditButton;

	@FindBy(xpath = "//label[.='Account Owners']")
	WebElement accountOwnersLabel;

	@FindBy(xpath = "//label[.='All Accounts']")
	WebElement allAccountsLabel;

//	@FindBy(xpath = "//span[.='Save Template']")
//	WebElement saveTemplateButton;
//
//	@FindBy(xpath = "//p[contains(text(),'updated successfully')]")
//	WebElement updateSuccessToast;
//
//	@FindBy(xpath = "//button[@aria-label='Delete']")
//	WebElement deleteButton;
//
//	@FindBy(xpath = "(//span[.='Delete'])[2]")
//	WebElement confirmDeleteButton;

	@FindBy(xpath = "//p[contains(text(),'deleted successfully')]")
	WebElement deleteSuccessToast;

	// ===============================================================
	// ================= MAIN FLOW ===================================
	// ===============================================================

	public void completeAnnouncementFlow(String unique, String formattedDateTime) {

		navigateToAnnouncements();

		createAnnouncement(unique, formattedDateTime);

		editAnnouncement(formattedDateTime);

		searchAnnouncement(unique);

		deleteAnnouncement();

		manageMessageTemplates(unique, formattedDateTime);

		manageNotifyToTemplates(unique);
	}

	// ===============================================================

	public void navigateToAnnouncements() {

		waitUtils.waitAndClick(sidebar);
		waitUtils.waitAndClick(announcementsMenu);

		trackStep("Load Announcement Page");
		waitUtils.waitForElementVisible(deleteHeaderButton);
		waitUtils.waitForElementVisible(searchInput);
		endStep();
	}

	public void createAnnouncement(String unique, String formattedDateTime) {

		waitUtils.waitAndClick(createAnnouncementButton);
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndSendKeys(titleInput, "Announcement_" + unique);
		waitUtils.waitAndClick(emergencyLabel);

		waitUtils.waitAndClick(messageInput);
		waitUtils.waitAndSendKeys(messageInput, "Announcement Message at " + formattedDateTime);

		waitUtils.waitAndClick(nextButton2);

		trackStep("Save Announcement Details");
		waitUtils.waitForElementVisible(SelectAnnouncementDetails);
		waitUtils.waitForElementVisible(pushNotificationLabel);
		endStep();
		System.out.println("Selecting Announcement Details...");
		waitUtils.waitForMillis(2000);
		waitUtils.waitForElementVisible(SelectAnnouncementDetails).click();

		waitUtils.waitAndClick(facilityLabel);
		waitUtils.waitAndClick(acsLabel);
		waitUtils.waitAndClick(energyLabel);

		waitUtils.waitForElementVisible(pushNotificationLabel).click();
		waitUtils.waitAndClick(everyoneRolesLabel);

		waitUtils.waitAndClick(nextButton3);

		waitUtils.waitAndClick(onlyOnceLabel);
		waitUtils.waitAndClick(datePickerInput);

		selectTomorrowDate();

		setCurrentTime();

		waitUtils.waitAndClick(nextButton3);

		waitUtils.waitAndClick(confirmCreateAnnouncement);

		trackStep("Announcement Creation");
		waitUtils.waitForElementVisible(createSuccessToast);
		endStep();
	}

	public void editAnnouncement(String formattedDateTime) {
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(firstAnnouncementLink);

		trackStep("Load Announcement Details");
		waitUtils.waitForElementVisible(editAnnouncementButton);
		endStep();

		waitUtils.waitAndClick(editAnnouncementButton);

		waitUtils.waitAndClick(nextButton3);
		waitUtils.waitForMillis(2000);
		waitUtils.waitForElementVisible(messageInput).click();
		waitUtils.waitAndSendKeys(messageInput, "Edit Announcement Message at " + formattedDateTime);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(nextButton3);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(nextButton3);
		waitUtils.waitForMillis(1000);
		waitUtils.waitAndClick(nextButton3);
		waitUtils.waitAndClick(saveAnnouncementButton);

		trackStep("Announcement Edit");
		waitUtils.waitForElementVisible(updateSuccessToast);
		endStep();
	}

	public void searchAnnouncement(String unique) {
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(searchInput);
		waitUtils.waitAndSendKeys(searchInput, "Announcement_" + unique);

		trackStep("Announcement Search");
		waitUtils.waitForElementVisible(deleteButton);
		endStep();
	}

	public void deleteAnnouncement() {
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(deleteButton);
		waitUtils.waitAndClick(confirmDeleteButton);

		trackStep("Announcement Delete");
		waitUtils.waitForElementVisible(searchInput);
		endStep();
	}

	// ================= Templates =================

	public void manageMessageTemplates(String unique, String formattedDateTime) {
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(templatesTab);
		waitUtils.waitAndClick(messagesTab);

		trackStep("Load Message Templates");
		waitUtils.waitForElementVisible(createTemplateButton);
		endStep();

		waitUtils.waitAndClick(createTemplateButton);

		waitUtils.waitAndSendKeys(templateNameInput, "Message Template_" + unique);

		waitUtils.waitAndSendKeys(titleInput, "Message_Template_Title_" + unique);

		waitUtils.waitAndClick(emergencyLabel);

		waitUtils.waitAndSendKeys(messageInput, "Message Template Text " + formattedDateTime);

		waitUtils.waitAndClick(createTemplateButton);

		waitUtils.waitForElementVisible(templateCreatedToast);
	}

	public void manageNotifyToTemplates(String unique) {

		waitUtils.waitAndClick(notifyToTab);

		trackStep("Load Notify To Templates");
		waitUtils.waitForElementVisible(createTemplateButton);
		endStep();

		waitUtils.waitAndClick(createTemplateButton);
		waitUtils.waitForMillis(2000);

		waitUtils.waitAndSendKeys(templateNameInput, "Notify To Template_" + unique);

		waitUtils.waitForElementVisible(SelectAnnouncementDetails).click();

		waitUtils.waitAndClick(facilityLabel);
		waitUtils.waitAndClick(acsLabel);
		waitUtils.waitAndClick(energyLabel);
		waitUtils.waitAndClick(pushNotificationLabel);
		waitUtils.waitAndClick(everyoneRolesLabel);

		waitUtils.waitAndClick(createTemplateButton);
		
		trackStep("Create Announcement Notify To Template");
		waitUtils.waitForElementVisible(templateCreatedToast);
		endStep();
	}
	
	public void updateAndDeleteNotifyToTemplate() {

	    // ================= UPDATE TEMPLATE =================

	    waitUtils.waitAndClick(firstEditButton);
	    waitUtils.waitForMillis(1000);

	    waitUtils.waitAndClick(accountOwnersLabel);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(allAccountsLabel);

	    waitUtils.waitAndClick(saveTemplateButton);

	    trackStep("Update Announcement Notify To Template");
	    waitUtils.waitForElementVisible(updateSuccessToast);
	    endStep();

	    // ================= DELETE TEMPLATE =================
	    waitUtils.waitForMillis(2000);
	    waitUtils.waitAndClick(deleteButton);
	    waitUtils.waitAndClick(confirmDeleteButton);

	    trackStep("Delete Announcement Notify To Template");
	    waitUtils.waitForElementVisible(deleteSuccessToast);
	    endStep();
	}

	// ================= Date & Time =================

	public void selectTomorrowDate() {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		String day = String.valueOf(tomorrow.getDayOfMonth());
		String month = tomorrow.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		String dayOfWeek = tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

		String dynamicXpath = "//div[contains(@aria-label,'" + dayOfWeek + ", " + month + " " + day + "')]";

		waitUtils.waitAndClick(driver.findElement(By.xpath(dynamicXpath)));
	}

	public void setCurrentTime() {

		String hour = LocalTime.now().format(DateTimeFormatter.ofPattern("hh"));

		waitUtils.waitAndSendKeys(hourInput, hour);
		waitUtils.waitAndSendKeys(minuteInput, "00");
	}

}
