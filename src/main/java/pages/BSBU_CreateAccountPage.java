package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BSBU_CreateAccountPage extends BasePage {

	private Actions actions;
	
	public BSBU_CreateAccountPage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}
	

	@FindBy(xpath = "//a[@href=\"/admin/account-management\"]")
	private WebElement accountManagementLink;

	@FindBy(xpath = "//h1[.='Account Management']")
	private WebElement accountManagementHeader;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchAccountInput;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Checkbox;
	
	
	public void openAccountManagement() {
		waitUtils.waitForElementClickable(accountManagementLink).click();

		trackStep("Open Account Management");

		waitUtils.waitForElementVisible(accountManagementHeader);
		waitUtils.waitForElementVisible(searchAccountInput);
		waitUtils.waitForElementVisible(Checkbox);

		endStep();
	}

}
