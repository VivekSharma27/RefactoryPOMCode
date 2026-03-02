package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.CommonMethods;

public class BSBU_DeleteBMSComponentPage extends BasePage {

	public String mainWindow;

	private Actions actions;

	public BSBU_DeleteBMSComponentPage(WebDriver driver) throws Exception {
		super(driver);
		
		this.actions = new Actions(driver);
		// TODO Auto-generated constructor stub
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

	@FindBy(xpath = "(//div[.='Configuration'])[2]")
	private WebElement configurationMenu;

	@FindBy(xpath = "//span[.='Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//span[.=' Account Settings ']")
	private WebElement accountSettingsMenu;

	@FindBy(xpath = "//button[.='Manage Buildings']")
	private WebElement manageBuildings;

	@FindBy(xpath = "//span[.='Add Site']")
	private WebElement addSite;

	@FindBy(xpath = "//span[.='Stay on this Page']")
	private List<WebElement> stayOnThisPage; // Using List for presence check
	
	// ================= SITE =================

		@FindBy(name = "siteName")
		private WebElement siteNameInput;

		@FindBy(xpath = "(//input[@role='combobox'])[2]")
		private WebElement siteRegion;

		@FindBy(xpath = "(//input[@role='combobox'])[3]")
		private WebElement siteState;

		@FindBy(xpath = "(//input[@role='combobox'])[4]")
		private WebElement siteCity;

//		@FindBy(xpath = "//span[.='Hokkaido']")
//		private WebElement hokkaidoOption;
		
		@FindBy(xpath = "(//ul[@role='listbox']/li)[2]")
		private WebElement selectOption;

		@FindBy(name = "address.addressLine1")
		private WebElement siteAddress1;

		@FindBy(name = "address.addressLine2")
		private WebElement siteAddress2;

		@FindBy(name = "address.postalCode")
		private WebElement sitePostalCode;

		@FindBy(xpath = "//span[.='Save']")
		private WebElement saveBtn;
		
		@FindBy(xpath = "//div[contains(text(), 'Site_')]")
		private List<WebElement> siteList;
		
		@FindBy(xpath = "//span[.='Akahira-shi']")
		private WebElement cityAkahiraOption;
//
//		@FindBy(xpath = "//p[contains(text(),'Last Updated By')]")
//		private WebElement successMessage;


    // -------------------- BUILDING ELEMENTS --------------------

//		@FindBy(xpath = "//div[contains(text(), 'Site_')]")
//		private List<WebElement> siteList;

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

//	    @FindBy(xpath = "//span[.='Hokkaido']")
//	    private WebElement hokkaidoOption;

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

		@FindBy(xpath = "(//div[contains(text(), 'Organization')])[1]")
		private WebElement organizationOption;

//		@FindBy(xpath = "//span[normalize-space()='Save']")
//		private WebElement saveButton;

		@FindBy(xpath = "(//span[.='Confirm'])[2]")
		private WebElement confirmButton2;

		@FindBy(xpath = "//p[contains(text(),'Organization(s) saved successfully!')]")
		private WebElement organizationSuccess;

		@FindBy(xpath = "//span[contains(text(),'Building_')]")
		private List<WebElement> buildingList;

// ================= FLOOR =================

//    @FindBy(xpath = "//*[name()='svg' and contains(@data-testid,'add-icon')]")
//	private List<WebElement> addIcons;
    
    @FindBy(xpath = "(//*[name()='svg' and contains(@data-testid,'add-icon')])[2]")
	private WebElement addFloorIcon;

	@FindBy(name = "floorName")
	private WebElement floorNameInput;

	@FindBy(xpath = "//span[contains(text(),'Floor')]")
	private List<WebElement> floorList;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//p[contains(text(),'Last Updated By')]")
	private WebElement successMessage;

// ================= ROOM =================

	@FindBy(xpath = "(//*[name()='svg' and contains(@data-testid,'add-icon')])[3]")
	private WebElement addRoomIcon;

	@FindBy(name = "roomName")
	private WebElement roomNameInput;
	
	@FindBy(xpath = "//p[contains(text(),'has been added successfully!')]")
	private WebElement roomSuccessMessage;
	
	   // ================= COMMON =================

    @FindBy(xpath = "//span[.='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "(//span[.='Delete'])[2]")
    private WebElement confirmDeleteButton;

    @FindBy(xpath = "//p[contains(text(),'has been deleted successfully!')]")
    private WebElement deleteSuccessMessage;


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

	public void openManageBuildings() {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(accountSettingsMenu);
		waitUtils.waitAndClick(manageBuildings);

		trackStep("Load Manage Buildings Page");

		waitUtils.waitForElementVisible(manageBuildings);
		waitUtils.waitForElementVisible(addSite);

		endStep();
	}
	    
	public void addSite(String unique) {

		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(addSite);

		waitUtils.waitAndSendKeys(siteNameInput, "Site_" + unique);
		
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(siteRegion);
		waitUtils.waitAndClick(selectOption);
		
		
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(siteState);
		waitUtils.waitAndClick(selectOption);
		
		waitUtils.waitForMillis(2000);
		waitUtils.waitAndClick(siteCity);
		waitUtils.waitAndClick(selectOption);

		waitUtils.waitForMillis(2000);
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
		waitUtils.waitForMillis(3000);

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
		waitUtils.waitAndClick(selectOption);

		waitUtils.waitAndClick(buildingState);
		waitUtils.waitAndClick(selectOption);

		waitUtils.waitAndClick(buildingCity);
		waitUtils.waitAndClick(selectOption);

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
		waitUtils.waitAndClick(saveButton);

		trackStep("Add Floor Details Successfully Time");

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
		waitUtils.waitAndClick(saveButton);

		trackStep("Add Room Details Successfully Time");

		waitUtils.waitForElementVisible(roomSuccessMessage);

		endStep();

		
	}
	
	public void deleteEntity(String stepName) {

		waitUtils.waitForMillis(2000);
        waitUtils.waitAndClick(deleteButton);
    	waitUtils.waitForMillis(2000);
        waitUtils.waitForElementVisible(confirmDeleteButton).click();

        trackStep(stepName +" successful time");

        waitUtils.waitForElementVisible(deleteSuccessMessage);


        endStep();
    }

    public void deleteHierarchy() {

        deleteEntity("Delete Room");
        deleteEntity("Delete Floor");
        deleteEntity("Delete Building");
        deleteEntity("Delete Site");
    }

	

}
