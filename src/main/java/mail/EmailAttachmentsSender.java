/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package mail;

import Utils.FrameworkUtility;
import constants.FrameworkConstants;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * https://www.codejava.net/java-ee/javamail/send-e-mail-with-attachment-in-java
 */
public class EmailAttachmentsSender {

    public static void sendEmailWithAttachments(String host, String port, final String userName, final String password,
                                                String[] toAddress, String subject, String message, String... attachFiles)
            throws AddressException, MessagingException {
        // sets SMTP server properties

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);

        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));

      /*  InternetAddress[] addressTo = new InternetAddress[toAddress.length];
        for (int i = 0; i < toAddress.length; i++)
            addressTo[i] = new InternetAddress(toAddress[i]);
        msg.setRecipients(Message.RecipientType.BCC, addressTo);*/
        msg.setRecipients(Message.RecipientType.BCC, convertToInternetAddressArray(toAddress));


        /*
         * InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
         * msg.setRecipients(Message.RecipientType.TO, toAddresses);
         */
        msg.setSubject(subject);
        msg.setSentDate(new Date());

        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/plain");

        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // adds attachments
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();

                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                multipart.addBodyPart(attachPart);
            }
        }

        // sets the multi-part as e-mail's content
        msg.setContent(multipart);

        // sends the e-mail
        Transport.send(msg);
    }


    public static void sendEmailWithAttachments(String host, String port, final String userName, final String password,
                                                InternetAddress[] toAddress, String subject, String message, String... attachFiles)
            throws AddressException, MessagingException, InterruptedException {
        // sets SMTP server properties

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);

        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));


// Create an InternetAddress object
//        InternetAddress addressTo = new InternetAddress(toAddress);


// Set the recipient (BCC in this case)
//        msg.setRecipient(Message.RecipientType.TO, addressTo);
        msg.setRecipients(Message.RecipientType.BCC, toAddress);

        /*
         * InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
         * msg.setRecipients(Message.RecipientType.TO, toAddresses);
         */
        msg.setSubject(subject);
        msg.setSentDate(new Date());

        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");

        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // adds attachments
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();

                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                multipart.addBodyPart(attachPart);
            }
        }

        // sets the multi-part as e-mail's content
        msg.setContent(multipart);

        // sends the e-mail
        Transport.send(msg);
        Thread.sleep(5000);  // Wait for 5 seconds between batches
    }


    public static void getEmails(String host, String port, final String userName, final String password
            , String sender, String dateStr)
            throws AddressException, MessagingException {
        // sets SMTP server properties
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", port);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.user", userName);
            properties.put("mail.password", password);



            // creates a new session with an authenticator
            Authenticator auth = new Authenticator() {
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(userName, password);
                }
            };



            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date searchDate = sdf.parse(dateStr);

            String subject= FrameworkConstants.SUBJECT + FrameworkUtility.getDate_MMM(dateStr)+" "+FrameworkUtility.getDate_DD(dateStr)+" - "+FrameworkUtility.getDate_YYYY(dateStr);
            System.out.println(subject);
            properties.put("mail.store.protocol", "imaps");

//            Session session = Session.getInstance(properties);
//            Store store = session.getStore();
            Session session = Session.getInstance(properties, auth);

            // creates a new e-mail message
            Message msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(userName));
//            Store store = session.getStore("pop3s");

            Store store = session.getStore();

            store.connect(host, userName, password);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);
            emailFolder.getMessages();
            FromTerm fromTerm = new FromTerm(new InternetAddress(sender));

//            Message[] messages = emailFolder.search(new FromTerm(new InternetAddress(sender)));

            ReceivedDateTerm dateTerm = new ReceivedDateTerm(ComparisonTerm.EQ, searchDate);
             SubjectTerm sb=new SubjectTerm(subject);
            // Combine both filters using AND term
            SearchTerm combinedTerm = new AndTerm(sb,new AndTerm(fromTerm, dateTerm));


            Message[] messages = emailFolder.search(combinedTerm);

            // retrieve the messages from the folder in an array and print it
//        Message[] messages = emailFolder.getMessages();
//            Message[] messages = emailFolder.search(new SubjectTerm("Job Curator"));
            System.out.println("messages.length---" + messages.length);

            for (Message message : messages) {
                System.out.println("Found email from: " + sender + " | Subject: " + message.getSubject());
            }


//          Message[] messages = emailFolder.search(sender1);
//            System.out.println(sender);
//            Message[] messages = emailFolder.search(fromTerm);


            if (messages.length > 0) {
                for (Message message : messages) {
                    System.out.println("\n📩 Found Email from: " + sender);
                    System.out.println("📅 Received Date: " + message.getReceivedDate());
                    System.out.println("📜 Subject: " + message.getSubject());


                    // Read and print email body

                    String emailBody = getTextFromMessage(message);
                    System.out.println("📄 Message Body:\n" + emailBody);

                    FileWriter fileWriter = new FileWriter("src/test/resources/jobs_email.text");
                    fileWriter.write(emailBody);
                    fileWriter.flush();
                    fileWriter.close();

                }
            } else {
                System.out.println("❌ No emails found from " + sender + " on " + sdf.format(searchDate));
            }


            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    // Method to extract text content from the email body
    private static String getTextFromMessage(Message message) throws MessagingException, IOException {
        if (message.getContentType().equalsIgnoreCase("text/html") || message.getContentType().equalsIgnoreCase("text/plain")) {
            return message.getContent().toString();
        } else if (message.isMimeType("multipart/*"))
        {

            MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
//            System.out.println("content type "+mimeMultipart.getContentType());
            return getTextFromMimeMultipart(mimeMultipart);
        }
        return "";
    }

    // Helper method to extract text from a MimeMultipart email body
    private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws MessagingException, IOException {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < mimeMultipart.getCount(); i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);

            // Skip attachments
            if (Part.ATTACHMENT.equalsIgnoreCase(bodyPart.getDisposition())) {
                continue;
            }
            if (Part.ATTACHMENT.equalsIgnoreCase(bodyPart.getDisposition()) || bodyPart.isMimeType("image/*")) {
                continue;
            }

            // Extract text from plain text parts
            if (bodyPart.isMimeType("text/plain")) {
                result.append("\n").append(bodyPart.getContent().toString());
            }
            // Extract text from HTML parts (only if plain text is not available)
            else if (bodyPart.isMimeType("text/html") && result.toString().isEmpty()) {
                result.append(bodyPart.getContent().toString().replaceAll("\\<.*?\\>", ""));
            }
            // Handle nested multiparts (e.g., forwarded emails)
            else if (bodyPart.getContent() instanceof MimeMultipart) {
                result.append(getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent()));
            }
            // Handle base64-encoded email parts
            else if (bodyPart.getContent() instanceof InputStream) {
                result.append("\n").append(getTextFromInputStream((InputStream) bodyPart.getContent()));
            }
        }
        return result.toString().trim();

    }

    // Helper method to decode InputStream content (base64 encoded emails)
    private static String getTextFromInputStream(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line).append("\n");
        }
        return result.toString().trim();
    }


    public static String parseAddresses(Address[] address) {
        String listAddress = "";

        if (address != null) {
            for (int i = 0; i < address.length; i++) {
                listAddress += address[i].toString() + ", ";
            }
        }
        if (listAddress.length() > 1) {
            listAddress = listAddress.substring(0, listAddress.length() - 2);
        }

        return listAddress;
    }

    private static InternetAddress[] convertToInternetAddressArray(String[] recipients) throws AddressException {
        InternetAddress[] addressArray = new InternetAddress[recipients.length];
        for (int i = 0; i < recipients.length; i++) {
            addressArray[i] = new InternetAddress(recipients[i]);
        }
        return addressArray;
    }

}


