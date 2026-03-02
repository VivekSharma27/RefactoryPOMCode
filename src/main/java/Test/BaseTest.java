package Test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SetUpAndLoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected SetUpAndLoginPage loginPage;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        loginPage = new SetUpAndLoginPage(driver);
        loginPage.login();
    }
}
