/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package mail;


import constants.FrameworkConstants;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static mail.EmailConfig.*;


public class EmailSendUtils {

    public static String email_id = "";

    private EmailSendUtils() {
        super();
    }


    public static void sendEmail_with_Attachment(String messageBody, File file) throws IOException {

        if (FrameworkConstants.SEND_EMAIL_TO_USERS.trim().equalsIgnoreCase(FrameworkConstants.YES)) {
            System.out.println("****************************************");
            System.out.println("Send Email - START");
            System.out.println("****************************************");

            String attachmentFile = FrameworkConstants.SDET_RESUME;


            List<String> list = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // System.out.println(line);
                    email_id = line.toString().trim();
                    list.add(line);  //
//                    System.out.println("email_address :" +email_id);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[] emailAddress_Array = list.toArray(new String[0]);

            System.out.println("Email list Size " + list.size());
            System.out.println("Email List :-" + list);

            int batchSize = 100;
            for (int i = 0; i < list.size(); i += batchSize)
            {
                int endIndex = Math.min(i + batchSize, list.size());
                List<String> batch = list.subList(i, endIndex);
                InternetAddress[] addressTo = batch.stream()
                        .map(email -> {
                            try {
                                return new InternetAddress(email);
                            } catch (AddressException e) {
                                e.printStackTrace();
                                return null;
                            }
                        })
                        .toArray(InternetAddress[]::new);

                try {
                    EmailAttachmentsSender.sendEmailWithAttachments(SERVER, PORT, FROM, PASSWORD, addressTo, SUBJECT, messageBody,
                            attachmentFile);

                    System.out.println("****************************************");
                    System.out.println("Email sent successfully. :: ");
                    System.out.println("Send Email - END");
                    System.out.println("****************************************");
                    System.out.println("✅ Email batch sent to " + batch.size() + " recipients!");

                } catch (MessagingException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }


        }
    }


    public static void getEmail(String sender, String dateStr) {

        if (FrameworkConstants.SEND_EMAIL_TO_USERS.trim().equalsIgnoreCase(FrameworkConstants.YES)) {
            System.out.println("****************************************");
            System.out.println("Send Email - START");
            System.out.println("****************************************");

//            System.out.println("File name: " + FrameworkConstants.getExtentReportFilePath());

            String messageBody = "";
            //System.out.println(messageBody);

//            String attachmentFile_ExtentReport = FrameworkConstants.getExtentReportFilePath();

            try {
                EmailAttachmentsSender.getEmails(SERVER, PORT, FROM, PASSWORD, sender, dateStr);

                System.out.println("****************************************");
                System.out.println("Email sent successfully.");
                System.out.println("Send Email - END");
                System.out.println("****************************************");
            } catch (MessagingException e) {
                e.printStackTrace();
            }

        }


    }



}
