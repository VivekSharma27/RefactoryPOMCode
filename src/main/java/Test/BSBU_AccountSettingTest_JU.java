package Test;

import org.junit.After;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import pages.BSBU_AccountSettingPage;
import pages.SetUpAndLoginPage;

public class BSBU_AccountSettingTest_JU extends BaseTest {
	
	
		
		

    private BSBU_AccountSettingPage accountSettingPage;

    @Test
    public void accountSettingsFlow() throws Exception {
        accountSettingPage = new BSBU_AccountSettingPage(driver);

        accountSettingPage.openAccountManagement();
        String accountName = accountSettingPage.getAccountName();
        accountSettingPage.searchAccount(accountName);
    }

    @After
    public void tearDown() throws Exception {
    	accountSettingPage.writeTestResult();
//        driver.quit();
    }
}
