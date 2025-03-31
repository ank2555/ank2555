package Utils;

import constants.FrameworkConstants;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;


public abstract class FrameworkUtility {

    protected static Properties properties;

    public static String readConfigurationFile(String key) {
        try {
            properties = new Properties();
            properties.load(new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH));

        } catch (Exception e) {
            System.out.println("Cannot find key: " + key + " in Config file due to exception : " + e);
        }
        return properties.getProperty(key).trim();
    }


    public static String setConfigurationFile(String key) {
        try {
            properties = new Properties();
            properties.setProperty("urf", "hhiind");

            FileOutputStream FOS = new FileOutputStream(FrameworkConstants.CONFIG_FILE_PATH);
            properties.store(FOS, "");


        } catch (Exception e) {
            System.out.println("Cannot find key: " + key + " in Config file due to exception : " + e);
        }
        return properties.getProperty(key).trim();
    }


    public static void DBCOnnection(String url, String username, String passsword, String sql) throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, passsword);
        Statement stmt = connection.createStatement();
        ResultSet resulset = stmt.executeQuery(sql);

        resulset.next();
        connection.prepareStatement("");


    }



    /*******************************************************
     * Print the response JSON
     ******************************************************/


    /*******************************************************
     * Print the all output log along with the response json (headers, cookies etc)
     ******************************************************/


    public static String getDate_MMM(String date ) throws  ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date searchDate = sdf.parse(date);


        // Define the output date format
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMM");
        return outputFormat.format(searchDate);

    }

    public static String getDate_DD(String date ) throws  ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date searchDate = sdf.parse(date);


        // Define the output date format
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd");
        return outputFormat.format(searchDate);

    }
    public static String getDate_YYYY(String date ) throws  ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date searchDate = sdf.parse(date);


        // Define the output date format
        SimpleDateFormat outputFormat = new SimpleDateFormat("YYYY");
        return outputFormat.format(searchDate);

    }




}
