package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import enums.applicationType;
import utils.ConfigFileReader;
import utils.WaitUtils;

public class SetUpAndLoginPage extends BasePage {

	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameField;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='kc-login']")
	private WebElement loginButton;

	public SetUpAndLoginPage(WebDriver driver, applicationType appType) throws Exception {
		super(driver);

		driver.manage().window().maximize();
		// ⭐ Dynamic URL selection

		String url = getUrl(appType);
		System.out.println("Opening URL = " + url);
		driver.get(url);

		int timeout = Integer.parseInt(ConfigFileReader.getConfigProperty("TIMEOUT"));
		waitUtils = new WaitUtils(driver, timeout);

		PageFactory.initElements(driver, this);
	}

	private String getUrl(applicationType appType) throws Exception {

		switch (appType) {

		case ADMIN:
			return ConfigFileReader.getConfigProperty("ADMIN_URLTEST");

		case CUSTOMER:
			return ConfigFileReader.getConfigProperty("CUSTOMER_URLTEST");

		default:
			throw new RuntimeException("Invalid application type");
		}
	}

	public void login() throws Exception {
		String username = ConfigFileReader.getConfigProperty("USERNAME");
		String password = ConfigFileReader.getConfigProperty("PASSWORD");

		trackStep("Login Page Load");

		waitUtils.waitForElementVisible(usernameField).sendKeys(username);
		waitUtils.waitForElementVisible(passwordField).sendKeys(password);
		waitUtils.waitForElementClickable(loginButton).click();

		endStep();
	}
}
