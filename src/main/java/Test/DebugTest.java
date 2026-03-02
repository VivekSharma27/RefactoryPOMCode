package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigFileReader;
import utils.WaitUtils;

public class DebugTest {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfigFileReader.getConfigProperty("URLTEST"));

		int timeout = Integer.parseInt(ConfigFileReader.getConfigProperty("TIMEOUT"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		WebElement usernameField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		usernameField.sendKeys(ConfigFileReader.getConfigProperty("USERNAME"));

		WebElement passwordField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		passwordField.sendKeys(ConfigFileReader.getConfigProperty("PASSWORD"));

		WebElement loginButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='kc-login']")));
		loginButton.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sidebar']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[.='Account Management'])[1]")))
				.click();

		WebElement searchAccount = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']"))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")))
				.sendKeys("Perf_AccountV1_11Feb");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Perf')]"))).click();
		Thread.sleep(2000);
		
		 WebElement accountSettings = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.=' Account Settings ']")));	
			accountSettings.click();
			Thread.sleep(2000);
			WebElement manageBuildings = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Manage Buildings']")));
			manageBuildings.click();
			Actions actions = new Actions(driver);
			 
			 WebElement siteNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Site_')]")));
			
			 Thread.sleep(2000);
//			 List<WebElement> siteList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='site-list']//div[@class='site-item']")));
			actions.moveToElement(siteNameField).click().perform();
			 
		driver.quit();
	}

}
