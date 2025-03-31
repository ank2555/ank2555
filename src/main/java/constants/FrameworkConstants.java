/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package constants;


import Utils.FrameworkUtility;
import Utils.PropertiesHelpers;

public final class FrameworkConstants {

    private FrameworkConstants() {
    }

    //
//    static {
//        PropertiesHelpers.loadAllFiles();
//    }
//
//    public static final String PROJECT_PATH = SystemHelpers.getCurrentDir();
//    public static final String EXCEL_DATA_FILE_PATH = PropertiesHelpers.getValue("EXCEL_DATA_FILE_PATH");
//    public static final String JSON_DATA_FILE_PATH = PropertiesHelpers.getValue("JSON_DATA_FILE_PATH");
//    public static final String EXCEL_CMS_LOGIN = PropertiesHelpers.getValue("EXCEL_CMS_LOGIN");
//    public static final String EXCEL_CMS_DATA = PropertiesHelpers.getValue("EXCEL_CMS_DATA");
//    public static final String EXCEL_CMS_PRODUCTS_USER = PropertiesHelpers.getValue("EXCEL_CMS_PRODUCTS_USER");
//
//    public static final String BROWSER = PropertiesHelpers.getValue("BROWSER");
//    public static final String URL_CRM = PropertiesHelpers.getValue("URL_CRM");
//    public static final String URL_CMS_ADMIN = PropertiesHelpers.getValue("URL_CMS_ADMIN");
//    public static final String URL_CMS_USER = PropertiesHelpers.getValue("URL_CMS_USER");
//    public static final String REMOTE_URL = PropertiesHelpers.getValue("REMOTE_URL");
//    public static final String REMOTE_PORT = PropertiesHelpers.getValue("REMOTE_PORT");
//    public static final String PROJECT_NAME = PropertiesHelpers.getValue("PROJECT_NAME");
//    public static final String REPORT_TITLE = PropertiesHelpers.getValue("REPORT_TITLE");
//    public static final String EXTENT_REPORT_NAME = PropertiesHelpers.getValue("EXTENT_REPORT_NAME");
//    public static final String EXTENT_REPORT_FOLDER = PropertiesHelpers.getValue("EXTENT_REPORT_FOLDER");
//    public static final String EXPORT_VIDEO_PATH = PropertiesHelpers.getValue("EXPORT_VIDEO_PATH");
//    public static final String EXPORT_CAPTURE_PATH = PropertiesHelpers.getValue("EXPORT_CAPTURE_PATH");
//    public static final String SEND_REPORT_TO_TELEGRAM = PropertiesHelpers.getValue("SEND_REPORT_TO_TELEGRAM");
//    public static final String TELEGRAM_TOKEN = PropertiesHelpers.getValue("TELEGRAM_TOKEN");
//    public static final String TELEGRAM_CHATID = PropertiesHelpers.getValue("TELEGRAM_CHATID");
//    public static final String AUTHOR = PropertiesHelpers.getValue("AUTHOR");
//    public static final String TARGET = PropertiesHelpers.getValue("TARGET");
//    public static final String HEADLESS = PropertiesHelpers.getValue("HEADLESS");
//    public static final String OVERRIDE_REPORTS = PropertiesHelpers.getValue("OVERRIDE_REPORTS");
//    public static final String OPEN_REPORTS_AFTER_EXECUTION = PropertiesHelpers.getValue("OPEN_REPORTS_AFTER_EXECUTION");
    public static final String SENDER_EMAIL_GMAIL = FrameworkUtility.readConfigurationFile("SENDER_EMAIL_FROM_GMAIL");

    public static final String EMAIL_LIST_FILE = FrameworkUtility.readConfigurationFile("Email_list_file");
    public static final String EMAIL_BODY_FILE_RECEIVED = FrameworkUtility.readConfigurationFile("Received_Email_Body_file");

    public static final String SEND_EMAIL_TO_USERS = PropertiesHelpers.getValue("SEND_EMAIL_TO_USERS");
    public static final String PDFFILE = PropertiesHelpers.getValue("PDF_FILE");
    //    public static  String SDET_RESUME =PropertiesHelpers.getValue("RESUME_PATH");
    public static String SDET_RESUME_NAME = FrameworkUtility.readConfigurationFile("SDET_RESUME");
    public static String SDET_RESUME_PATH = FrameworkUtility.readConfigurationFile("SDET_RESUME_PATH");
    public static String SDET_RESUME = SDET_RESUME_PATH + SDET_RESUME_NAME;

    public static final String SUBJECT = FrameworkUtility.readConfigurationFile("SUBJECT");
    public static final String CONFIG_FILE_PATH = "src/test/resources/config/data.properties";

//    public static final String SCREENSHOT_FAILED_TCS = PropertiesHelpers.getValue("SCREENSHOT_FAILED_TCS");
//    public static final String SCREENSHOT_SKIPPED_TCS = PropertiesHelpers.getValue("SCREENSHOT_SKIPPED_TCS");
//    public static final String SCREENSHOT_ALL_STEPS = PropertiesHelpers.getValue("SCREENSHOT_ALL_STEPS");
//    public static final String ZIP_FOLDER = PropertiesHelpers.getValue("ZIP_FOLDER");
//    public static final String ZIP_FOLDER_PATH = PropertiesHelpers.getValue("ZIP_FOLDER_PATH");
//    public static final String ZIP_FOLDER_NAME = PropertiesHelpers.getValue("ZIP_FOLDER_NAME");
//    public static final String VIDEO_RECORD = PropertiesHelpers.getValue("VIDEO_RECORD");
//
//    public static final String LOCATE = PropertiesHelpers.getValue("LOCATE");
//    public static final String RETRY_TEST_FAIL = PropertiesHelpers.getValue("RETRY_TEST_FAIL");
//
//    public static final int WAIT_DEFAULT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_DEFAULT"));
//    public static final int WAIT_IMPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_IMPLICIT"));
//    public static final int WAIT_EXPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_EXPLICIT"));
//    public static final int WAIT_PAGE_LOADED = Integer.parseInt(PropertiesHelpers.getValue("WAIT_PAGE_LOADED"));
//    public static final int WAIT_SLEEP_STEP = Integer.parseInt(PropertiesHelpers.getValue("WAIT_SLEEP_STEP"));
//    public static final String ACTIVE_PAGE_LOADED = PropertiesHelpers.getValue("ACTIVE_PAGE_LOADED");

//    public static final String EXTENT_REPORT_FOLDER_PATH = PROJECT_PATH + EXTENT_REPORT_FOLDER;
//    public static final String EXTENT_REPORT_FILE_NAME = EXTENT_REPORT_NAME + ".html";
//    public static String EXTENT_REPORT_FILE_PATH = EXTENT_REPORT_FOLDER_PATH + File.separator + EXTENT_REPORT_FILE_NAME;


    //Zip file for Report folder
//    public static final String ZIPPED_EXTENT_REPORTS_FOLDER = EXTENT_REPORT_FOLDER + ".zip";

    public static final String YES = "yes";
    public static final String NO = "no";

    public static final String BOLD_START = "<b>";
    public static final String BOLD_END = "</b>";

    /* ICONS - START */

    public static final String ICON_SMILEY_PASS = "<i class='fa fa-smile-o' style='font-size:24px'></i>";
    public static final String ICON_SMILEY_SKIP = "<i class=\"fas fa-frown-open\"></i>";
    public static final String ICON_SMILEY_FAIL = "<i class='fa fa-frown-o' style='font-size:24px'></i>";

    public static final String ICON_OS_WINDOWS = "<i class='fa fa-windows' ></i>";
    public static final String ICON_OS_MAC = "<i class='fa fa-apple' ></i>";
    public static final String ICON_OS_LINUX = "<i class='fa fa-linux' ></i>";

    public static final String ICON_BROWSER_OPERA = "<i class=\"fa fa-opera\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_EDGE = "<i class=\"fa fa-edge\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_CHROME = "<i class=\"fa fa-chrome\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_FIREFOX = "<i class=\"fa fa-firefox\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_SAFARI = "<i class=\"fa fa-safari\" aria-hidden=\"true\"></i>";

    public static final String ICON_Navigate_Right = "<i class='fa fa-arrow-circle-right' ></i>";
    public static final String ICON_LAPTOP = "<i class='fa fa-laptop' style='font-size:18px'></i>";
    public static final String ICON_BUG = "<i class='fa fa-bug' ></i>";
    /* style="text-align:center;" */

    public static final String ICON_SOCIAL_GITHUB_PAGE_URL = "https://anhtester.com/";
    public static final String ICON_SOCIAL_LINKEDIN_URL = "https://www.linkedin.com/in/anhtester/";
    public static final String ICON_SOCIAL_GITHUB_URL = "https://github.com/anhtester";
    public static final String ICON_SOCIAL_LINKEDIN = "<a href='" + ICON_SOCIAL_LINKEDIN_URL
            + "'><i class='fa fa-linkedin-square' style='font-size:24px'></i></a>";
    public static final String ICON_SOCIAL_GITHUB = "<a href='" + ICON_SOCIAL_GITHUB_URL
            + "'><i class='fa fa-github-square' style='font-size:24px'></i></a>";

    public static final String ICON_CAMERA = "<i class=\"fa fa-camera\" aria-hidden=\"true\"></i>";

    public static final String ICON_BROWSER_PREFIX = "<i class=\"fa fa-";
    public static final String ICON_BROWSER_SUFFIX = "\" aria-hidden=\"true\"></i>";


    public static final String EMAIL_MESSAGE_BODY = "<!DOCTYPE html>\n" +
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
            "        <p>I hope you are doing well. I came across your job posting for a <strong>QA Automation Engineer</strong> and wanted to express my interest in the role. With <strong>9.11 years of experience</strong> in the <strong>e-commerce and payment domains</strong>, I believe my expertise aligns well with your requirements.</p>\n" +
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
            "            <li>Strong Experties in Backend Testing. </strong>.</li>\n" +
            "            <li>Proficiency in <strong>Core Java, JavaScript,BDD ,Karate and Python</strong>.</li>\n" +
            "        </ul>\n" +
            "\n" +
            "        <p><strong>Total Years of Experience:</strong> 9.11 years</p>\n" +
            "        <p><strong>Current CTC:</strong> 30 LPA</p>\n" +
            "        <p><strong>Expected CTC :</strong> 35-36 LPA</p>\n" +
            "        <p><strong>Notice Period:</strong> 30 Days</p>\n" +
            "        <p><strong>Serving Notice (LWD): </strong> 14th April </p>" +
            "        <p><strong>Preferred Location : </strong> Pune, Hyderabad </p>\n" +
            "\n" +
            "        <p>I would be happy to share my resume and discuss how my experience can add value to your team. Looking forward to connecting!</p>\n" +
            "\n" +
            "        <p><strong>Working experience with:</strong> Mastercard, Worldpay, and Deutsche Bank.</p>\n" +
            "\n" +
            "        <div class=\"footer\">\n" +
            "            <p>Best regards,</p>" +
            "            <p>Ankit Jain</p>" +
            "            <p>+91-9910548407</p>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</body>\n" +
            "</html>";

    /* ICONS - END */

//    public static String getExtentReportFilePath() {
//        if (EXTENT_REPORT_FILE_PATH.isEmpty()) {
//            EXTENT_REPORT_FILE_PATH = ReportUtils.createExtentReportPath();
//        }
//        return EXTENT_REPORT_FILE_PATH;
//    }

}
