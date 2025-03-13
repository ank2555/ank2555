package common;



import mail.EmailExtractor;
import mail.EmailSendUtils;

import java.io.File;
import java.io.IOException;

public class Test {


    @org.testng.annotations.Test
    public void Run() throws IOException {


        File file = new File("src/test/resources/email_list.text");

        String MessageBody="<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            line-height: 1.6;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            padding: 20px;\n" +
                "            background-color: #f9f9f9;\n" +
                "            border-radius: 8px;\n" +
                "        }\n" +
                "        h3 {\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        ul {\n" +
                "            margin: 10px 0;\n" +
                "            padding-left: 20px;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            margin-top: 20px;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <p>Hello Team,</p>\n" +
                "\n" +
                "        <p>I hope you are doing well. I came across your job posting for a <strong>QA Automation Engineer</strong> and wanted to express my interest in the role. With <strong>9.10 years of experience</strong> in the <strong>e-commerce and payment domains</strong>, I believe my expertise aligns well with your requirements.</p>\n" +
                "\n" +
                "        <h3>My background includes:</h3>\n" +
                "        <ul>\n" +
                "            <li>Extensive experience in the <strong>payment domain (9 years)</strong>, including ISO payments (new and old).</li>\n" +
                "            <li>Strong expertise in <strong>API testing (REST & SOAP)</strong>, Database testing, and SQL.</li>\n" +
                "            <li>End-to-end <strong>API & UI Automation</strong> using <strong>Selenium</strong> and <strong>Rest Assured</strong>.</li>\n" +
                "            <li>Hands-on experience with <strong>microservices</strong> and <strong>Spring Boot</strong>.</li>\n" +
                "            <li>Expertise in <strong>Backend Testing</strong> and Backend Automation.</li>\n" +
                "            <li>Experience in <strong>CI/CD pipelines</strong> (Jenkins, TeamCity).</li>\n" +
                "            <li>Familiarity with <strong>Agile Frameworks</strong>.</li>\n" +
                "            <li>Proficiency in <strong>Core Java, JavaScript, and Python</strong>.</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p><strong>Total Years of Experience:</strong> 9.10 years</p>\n" +
                "\n" +
                "        <p>I would be happy to share my resume and discuss how my experience can add value to your team. Looking forward to connecting!</p>\n" +
                "\n" +
                "        <p><strong>Working experience with:</strong> Mastercard, Worldpay, and Deutsche Bank.</p>\n" +
                "\n" +
                "        <div class=\"footer\">\n" +
                "            <p>Best regards,</p>\n" +
                "            <p>Ankit Jain</p>\n" +
                "            <p>+91-9910548407</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

/*
        String MessageBody = "Hello Team,\n" +
                "\n" +
                "I hope you are doing well. I came across your job posting for a QA Automation Engineer and wanted to express my interest in the role. With 9 years of experience in the e-commerce and payment domains, I believe my expertise aligns well with your requirements.\n" +
                "\n" +
                "My background includes:\n" +
                "\n" +
                "Extensive experience in the payment domain (9 years), including ISO payments new and old\n" +
                "\n" +
                "Strong expertise in API testing (REST & SOAP), Database testing, and SQL.\n" +
                "\n" +
                "End-to-end UI Automation using Seleniumand Rest Assured.\n" +
                "\n" +
                "Hands-on experience with microservices and Spring Boot.\n" +
                "\n" +
                "Expertise in Backend Testing and Backend automation \n" +
                "\n" +
                "Experience in CI/CD pipeline,Jenkins,Teamcity\n" +
                "\n" +
                "Experience in Agile Frameworks \n" +
                "\n" +
                "Proficiency in Java , Javascript, unix\n" +
                "\n" +
                "\n" +
                "\n" +
                "Total Years of experience: 9.10 years\n" +
                "\n" +
                "I would be happy to share my resume and discuss how my experience can add value to your team. Looking forward to connecting!\n" +
                "\n" +
                "Working experience with Mastercard,Worldpay and Deutche Bank\n" +
                "\n" +
                "Best regards,\n" +
                "\n" +
                "Ankit Jain\n" +
                "\n" +
                "+91-9910548407";
*/

//        EmailSendUtils.getEmail();
        EmailSendUtils.getEmail("info@jobcurator.in","2025-03-04");
//        EmailExtractor.readDataFromJobs_emailPage();
//        EmailSendUtils.sendEmail_withoutParam(MessageBody, file);


//        EmailSendUtils.sendEmail_withoutParam(MessageBody);


    }
}
