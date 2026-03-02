package Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.After;
import org.junit.Test;

import pages.BSBU_AnnouncementPage;

public class BSBU_AnnouncementTest extends BaseTest {
	
	private BSBU_AnnouncementPage announcementpage;
	
	 @Test
	    public void AnnouncementFlow() throws Exception {
		 announcementpage  = new BSBU_AnnouncementPage(driver);

		    String unique = String.valueOf(System.currentTimeMillis());

		    String formattedDateTime = LocalDateTime.now()
		            .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

//		    announcementpage.completeAnnouncementFlow(unique, formattedDateTime);
		    announcementpage.navigateToAnnouncements();

		    announcementpage.createAnnouncement(unique, formattedDateTime);

		    announcementpage.editAnnouncement(formattedDateTime);

		    announcementpage.searchAnnouncement(unique);

		    announcementpage.deleteAnnouncement();

		    announcementpage.manageMessageTemplates(unique, formattedDateTime);

		    announcementpage.manageNotifyToTemplates(unique);
		    
		    announcementpage.updateAndDeleteNotifyToTemplate();
}
	 
	 @After
	    public void tearDown() throws Exception {
		 announcementpage.writeTestResult();
	    	System.out.println("stepcount: "+ (announcementpage.stepCount ) );
//	        driver.quit();
	        System.out.println("Browser closed successfully.");
	    }
}
