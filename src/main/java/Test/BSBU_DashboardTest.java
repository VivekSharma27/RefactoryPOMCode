package Test;

import org.junit.After;
import org.junit.Test;

import pages.BSBU_DashboardPage;
import pages.BSBU_FileManagementPage;

public class BSBU_DashboardTest extends BaseTest {

	private BSBU_DashboardPage dashboardPage;

	@Test
	public void testDashboard() throws Exception {

		dashboardPage = new BSBU_DashboardPage(driver);

		dashboardPage.loadManageBuildingFromToDo();
		dashboardPage.validateAdminDashboard();
		dashboardPage.validateControllersFromToDo();
		dashboardPage.validateDevicesFromToDo();
		dashboardPage.validateContractDetails();

	}
	
	@After
    public void tearDown() throws Exception {
		dashboardPage.writeTestResult();
    	System.out.println("stepcount: "+ (dashboardPage.stepCount ) );
//        driver.quit();
        System.out.println("Browser closed successfully.");
    }

}
