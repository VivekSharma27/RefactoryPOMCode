package Test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import enums.applicationType;
import pages.SetUpAndLoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected SetUpAndLoginPage loginPage;
    
    protected applicationType appType=
            applicationType.ADMIN; // default


    @Before
    public void setUp() throws Exception {
    	
    	
        driver = new ChromeDriver();
        
        System.out.println("Application Type = " + appType);
        loginPage = new SetUpAndLoginPage(driver,appType);
        loginPage.login();
    }
}
