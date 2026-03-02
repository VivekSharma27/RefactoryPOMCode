package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonMethods;

public class BSBU_FileManagementPage extends BasePage {

	private Actions actions;

	public BSBU_FileManagementPage(WebDriver driver) throws Exception {
		super(driver);
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}
	
	@FindBy(id = "sidebar")
	WebElement sideBar;

	@FindBy(xpath = "//div[contains(text(),'Data Management')]")
    private WebElement dataManagementMenu;

    @FindBy(xpath = "//div[.='File Management']")
    private WebElement fileManagementMenu;

    @FindBy(xpath = "//h1[contains(text(),'File Management')]")
    private WebElement fileManagementHeader;

    @FindBy(xpath = "//span[contains(text(),'Facility Management')]")
    private WebElement facilityManagementLabel;

    @FindBy(xpath = "//span[.='Upload']")
    private WebElement uploadButton;

    @FindBy(xpath = "//h2[contains(text(),'Upload File')]")
    private WebElement uploadHeader;

    @FindBy(xpath = "//span[contains(text(),'Browse File')]")
    private WebElement browseFileButton;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//span[contains(text(),'Select File Category')]")
    private WebElement fileCategoryDropdown;

    @FindBy(xpath = "//li[.='Common']")
    private WebElement commonCategory;

    @FindBy(xpath = "//textarea[@placeholder='Add Description']")
    private WebElement descriptionBox;

    @FindBy(xpath = "(//span[.='Upload'])[2]")
    private WebElement confirmUploadButton;

    @FindBy(xpath = "//p[contains(text(),'File has been uploaded successfully')]")
    private WebElement uploadSuccessMessage;

    @FindBy(xpath = "(//button[@aria-label='Download'])[2]")
    private WebElement downloadButton;

    @FindBy(xpath = "//p[contains(text(),'File has been downloaded successfully')]")
    private WebElement downloadSuccessMessage;

    @FindBy(xpath = "(//button[@aria-label='Delete'])[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//h2[contains(text(),'Delete File')]")
    private WebElement deletePopupHeader;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    private WebElement confirmDeleteButton;

    @FindBy(xpath = "//div[contains(text(),'Account Management')]")
    private WebElement accountManagementMenu;

    @FindBy(xpath = "//input[contains(@placeholder,'Search')]")
    private WebElement accountSearchBox;

    @FindBy(xpath = "//a[contains(text(),'Performance')]")
    private WebElement performanceAccountLink;

    @FindBy(xpath = "//span[.='Visit Customer Portal']")
    private WebElement visitCustomerPortalButton;

    @FindBy(xpath = "//span[.='Confirm']")
    private WebElement confirmPortalButton;

    @FindBy(xpath = "//input[@placeholder='Search Account']")
    private WebElement portalSearchAccount;

    @FindBy(xpath = "//span[@class='truncate whitespace-nowrap']")
    private WebElement portalAccountSelect;

    @FindBy(xpath = "//span[.='Overview']")
    private WebElement overviewTab;

    @FindBy(xpath = "//span[.='Configure Widgets']")
    private WebElement configureWidgets;

    @FindBy(xpath = "//p[@data-testid='user_name']")
    private WebElement profileIcon;

    @FindBy(xpath = "//span[contains(text(),'File Management')]")
    private WebElement portalFileManagement;

    @FindBy(xpath = "//span[.='Common']")
    private WebElement portalCommonFile;

    @FindBy(xpath = "//button[@aria-label='Download']")
    private WebElement portalDownloadButton;

	// ================= Actions =================

	private void uploadUsingRobot(String filePath) {

//		waitUtils.waitAndClick(uploadButton);
//		waitUtils.waitAndClick(browseFileButton);

		try {
			Robot rb = new Robot();
			rb.delay(2000);
			StringSelection ss = new StringSelection(filePath);
			rb.delay(2000);
			waitUtils.waitForMillis(2000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.delay(2000);
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
	public String getAccountName() {
		return utils.ConfigFileReader.getConfigProperty("Account" + CommonMethods.getRandomLong(1, 14));
	}

	public void navigateToFileManagement() {

	    waitUtils.waitAndClick(sideBar);
	    waitUtils.waitAndClick(dataManagementMenu);
	    waitUtils.waitAndClick(fileManagementMenu);

	    trackStep("File Management UI");
	    waitUtils.waitForElementVisible(fileManagementHeader);
	    waitUtils.waitForElementVisible(facilityManagementLabel);
	    endStep();
	}

	public void uploadFile(String filePath, String description) throws Exception {

	    waitUtils.waitAndClick(uploadButton);

	    trackStep("Upload UI");
	    
	    waitUtils.waitForElementVisible(uploadHeader);
	    waitUtils.waitForElementVisible(browseFileButton);
	    waitUtils.waitForElementVisible(cancelButton);
	    
	    endStep();

	    waitUtils.waitAndClick(fileCategoryDropdown);
	    waitUtils.waitAndClick(commonCategory);

	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndSendKeys(descriptionBox, description);

	    waitUtils.waitAndClick(browseFileButton);
	    waitUtils.waitForMillis(2000);
	    uploadUsingRobot(filePath);
	    System.out.println("FilePath to upload:  " +filePath);
	    waitUtils.waitForMillis(3000);
	    waitUtils.waitForElementVisible(confirmUploadButton).click();

	    trackStep("Uploaded file successfully");
	    
	    waitUtils.waitForElementVisible(uploadSuccessMessage);
	    
	    endStep();
	}

	public void downloadFile() {

	    waitUtils.waitAndClick(downloadButton);

	    trackStep("Downloaded file successfully");
	    waitUtils.waitForElementVisible(downloadSuccessMessage);
	    endStep();
	}

	public String openCustomerPortal(String accountName) {

	    waitUtils.waitAndClick(accountManagementMenu);

	    accountSearchBox.clear();
	    waitUtils.waitAndSendKeys(accountSearchBox, accountName);

	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(performanceAccountLink);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(visitCustomerPortalButton);

	    String mainWindow = driver.getWindowHandle();

	    waitUtils.waitAndClick(confirmPortalButton);

	    for (String handle : driver.getWindowHandles()) {
	        if (!handle.equals(mainWindow)) {
	            driver.switchTo().window(handle);
	            break;
	        }
	    }

	    return mainWindow;
	}

	public void validateDashboard(String accountName) {

//	    portalSearchAccount.clear();
//	    waitUtils.waitAndSendKeys(portalSearchAccount, accountName);
//	    waitUtils.waitAndClick(portalAccountSelect);

	    trackStep("Load Dashboard Page of Customer Portal");
	    waitUtils.waitForElementVisible(overviewTab);
	    waitUtils.waitForElementVisible(configureWidgets);
	    endStep();
	}

	public void downloadFromCustomerPortal() {

	    waitUtils.waitAndClick(profileIcon);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(portalFileManagement);

	    trackStep("File Management UI in Customer Portal");
	    waitUtils.waitForElementVisible(fileManagementHeader);
	    endStep();

	    waitUtils.waitAndClick(portalCommonFile);
	    waitUtils.waitAndClick(portalDownloadButton);

	    trackStep("Downloaded file successfully from Customer portal");
	    waitUtils.waitForElementVisible(downloadSuccessMessage);
	    endStep();
	}

	public void closePortalAndSwitchBack(String mainWindow) {
	    driver.close();
	    driver.switchTo().window(mainWindow);
	}
	
	public void deleteFile() {

	    waitUtils.waitAndClick(dataManagementMenu);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(fileManagementMenu);
	    waitUtils.waitForMillis(1000);
	    waitUtils.waitAndClick(deleteButton);

	    trackStep("Delete file");
	    waitUtils.waitForElementVisible(deletePopupHeader);
	    endStep();

	    waitUtils.waitAndClick(confirmDeleteButton);
	}






}
