package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class WaitUtils {
	private WebDriverWait wait;
	private WebDriver driver;

	public WaitUtils(WebDriver driver, int timeoutSeconds) {
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	}

	public WebElement waitForElementVisible(WebElement string) {
		return wait.until(ExpectedConditions.visibilityOf(string));
	}

	public WebElement waitForElementVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementVisible(WebElement element, int timeoutSeconds) {
	    WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	    return customWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public WebElement waitForElementVisible(By locator, int timeoutSeconds) {
	    WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	    return customWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForElementClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean waitForElementToBeInvisible(By locator) {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public boolean waitForElementToBeInvisible(WebElement element) {
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}
	

	public WebElement waitAndClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		return element;
	}

	public void waitForMillis(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public WebElement waitAndSendKeys(WebElement element, String keys) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(keys);
		return element;
	}

	public boolean waitForUrlContains(String text) {
		return wait.until(ExpectedConditions.urlContains(text));
	}
}
