package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BSBU_DashboardPage extends BasePage {

	private Actions actions;
	
	public BSBU_DashboardPage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
//		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}
	
	
	
	@FindBy(xpath = "(//span[text()='Resume'])[1]")
	private WebElement secondButton;
	
	//p[contains(text(),'in Draft')]//..//..//button[1]
	
	

	@FindBy(xpath = "//h1[.='Manage Buildings']")
	private WebElement manageBuildingsHeader;

	@FindBy(xpath = "//span[.='Edit']")
	private WebElement editButton;

	@FindBy(xpath = "//h1[.='Dashboard']")
	private WebElement dashboardHeader;

	@FindBy(xpath = "//h2[.='To Do List']")
	private WebElement toDoListHeader;

	@FindBy(xpath = "//h2[.='Accounts']")
	private WebElement accountsHeader;

	@FindBy(xpath = "//h2[.='Contract Details']")
	private WebElement contractDetailsHeader;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement firstButton;

	@FindBy(xpath = "//span[.='Facility Management']")
	private WebElement facilityManagementTab;

	@FindBy(xpath = "//span[.='Energy Management']")
	private WebElement energyManagementTab;

	@FindBy(xpath = "//span[.='ACS']")
	private WebElement acsTab;

	@FindBy(xpath = "(//span[.='Active'])[1]")
	private WebElement activeStatusTop;

	@FindBy(xpath = "//p[.='Active']")
	private WebElement activeStatus;

	@FindBy(xpath = "//p[.='Inactive']")
	private WebElement inactiveStatus;

	@FindBy(xpath = "//span[.='Controllers']")
	private WebElement controllersTab;

	@FindBy(xpath = "(//p[contains(text(),'Inactive/In testing')])[1]")
	private WebElement inactiveTestingStatus;

	@FindBy(xpath = "//h1[.='Manage Controllers']")
	private WebElement manageControllersHeader;

	@FindBy(xpath = "//h2[.='Controller List']")
	private WebElement controllerListHeader;

	@FindBy(xpath = "//span[.='Devices']")
	private WebElement devicesTab;

	@FindBy(xpath = "//h1[.='Manage Devices']")
	private WebElement manageDevicesHeader;

	@FindBy(xpath = "//span[.='View Command History']")
	private WebElement viewCommandHistory;

	@FindBy(xpath = "(//*[.='Active'])[6]")
	private WebElement contractActiveStatus;

	public void validateAdminDashboardPage() {

	    trackStep("Load Admin Dashboard Page");

	    waitUtils.waitForElementVisible(dashboardHeader);
	    waitUtils.waitForElementVisible(toDoListHeader);
	    waitUtils.waitForElementVisible(accountsHeader);
	    waitUtils.waitForElementVisible(contractDetailsHeader);

	    endStep();
	}

public void loadManageBuildingFromToDo() {

	waitUtils.waitForMillis(3000);
    waitUtils.waitForElementVisible(secondButton).click();;

    trackStep("Load Manage Building Page from the To Do List");
    waitUtils.waitForElementVisible(manageBuildingsHeader);
    waitUtils.waitForElementVisible(editButton);
    endStep();

    driver.navigate().back();
}

public void validateAdminDashboard() {

    trackStep("Come Back to the Admin Dashboard Page");

    waitUtils.waitForElementVisible(dashboardHeader);
    waitUtils.waitForElementVisible(toDoListHeader);
    waitUtils.waitForElementVisible(accountsHeader);
    waitUtils.waitForElementVisible(contractDetailsHeader);
    waitUtils.waitForElementVisible(firstButton);
    waitUtils.waitForElementVisible(facilityManagementTab);
    waitUtils.waitForElementVisible(energyManagementTab);
    waitUtils.waitForElementVisible(acsTab);
    waitUtils.waitForElementVisible(activeStatusTop);
    waitUtils.waitForElementVisible(activeStatus);
    waitUtils.waitForElementVisible(inactiveStatus);

    endStep();
}

public void validateControllersFromToDo() {

    waitUtils.waitAndClick(controllersTab);

    trackStep("Load the Controller from To Do List");
    waitUtils.waitForElementVisible(inactiveTestingStatus);
    waitUtils.waitForElementVisible(firstButton);
    endStep();

    waitUtils.waitAndClick(secondButton);

    trackStep("Load Manage Controller Page from the To Do List");
    waitUtils.waitForElementVisible(manageControllersHeader);
    waitUtils.waitForElementVisible(controllerListHeader);
    endStep();

    driver.navigate().back();
}

public void validateDevicesFromToDo() {

    waitUtils.waitAndClick(devicesTab);

    trackStep("Load the Devices from To Do List");
    waitUtils.waitForElementVisible(inactiveTestingStatus);
    waitUtils.waitForElementVisible(firstButton);
    endStep();

    waitUtils.waitAndClick(secondButton);

    trackStep("Load Manage Devices Page from the To Do List");
    waitUtils.waitForElementVisible(manageDevicesHeader);
    waitUtils.waitForElementVisible(viewCommandHistory);
    endStep();

    driver.navigate().back();
}

public void validateContractDetails() {

    waitUtils.waitAndClick(facilityManagementTab);

    trackStep("Load Facility Management Contract Details");
    waitUtils.waitForElementVisible(contractActiveStatus);
    endStep();

    waitUtils.waitAndClick(energyManagementTab);

    trackStep("Energy Management Contract Details");
    waitUtils.waitForElementVisible(contractActiveStatus);
    endStep();

    waitUtils.waitAndClick(acsTab);

    trackStep("ACS Contract Details");
    waitUtils.waitForElementVisible(contractActiveStatus);
    endStep();
}
}
