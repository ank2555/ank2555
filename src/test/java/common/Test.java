package common;



import constants.FrameworkConstants;
import mail.EmailExtractor;
import mail.EmailSendUtils;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class Test {


    @org.testng.annotations.Test
    public void Run() throws IOException, SQLException, ParseException {


        File emailList = new File(FrameworkConstants.EMAIL_LIST_FILE);
        String MessageBody= FrameworkConstants.EMAIL_MESSAGE_BODY;


//        EmailSendUtils.getEmail();
//        EmailSendUtils.getEmail(FrameworkConstants.SENDER_EMAIL_GMAIL,"2025-03-31");
        EmailExtractor.readDataFromJobs_emailPage();
//        EmailSendUtils.sendEmail_with_Attachment(MessageBody, emailList);

    }
}
