package pages;

import java.io.IOException;
import java.util.HashMap;

import org.apache.jmeter.threads.JMeterContextService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;
import utils.WriteTestResults;
import utils.*;

public abstract class BasePage {

    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public int stepCount = 0;
    public String testName;
    public long startTime, endTime;
    public static int threadNum = JMeterContextService.getContext().getThreadNum();
    public   HashMap<String, String> results = new HashMap<>();
    public   HashMap<String, String> stepName = new HashMap<>();

    public BasePage(WebDriver driver) throws Exception {
        this.driver = driver;
        int timeout = Integer.parseInt(utils.ConfigFileReader.getConfigProperty("TIMEOUT"));
        this.waitUtils = new WaitUtils(driver, timeout);
        this.testName = this.getClass().getSimpleName();  
        PageFactory.initElements(driver, this);
    }

    protected void trackStep(String stepDescription) {
    	 stepCount++;
        startTime = System.currentTimeMillis();
        stepName.put(testName + "_" + stepCount, stepDescription);
        System.out.println(stepCount + ". " + testName + " - " + stepDescription);
        
    }

    protected void endStep() {
        endTime = System.currentTimeMillis();
        results.put(testName + "_" + stepCount, String.valueOf(endTime - startTime));
        System.out.println(" Page Loadtime = " + (endTime - startTime) + " ms");
       
    }
    
    public void writeTestResult() throws Exception {
    	writeTestResult wtr = new writeTestResult();
//		String testName = this.getClass().getSimpleName();
		
		System.out.println("ClassName: " + testName + ", ThreadNum: " + threadNum);
		try {
			Thread.sleep((threadNum + 1) * 1000);

			wtr.writeResults(testName, results, stepName);
		} catch (org.apache.poi.EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
    
}
