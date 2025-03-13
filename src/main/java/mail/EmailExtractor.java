package mail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static void readDataFromJobs_emailPage() throws IOException {
        File file = new File("src/test/resources/jobs_email.text"); // Replace with your file path
        List<String> emailAddresses = extractEmails(file);
        StringBuilder emails = new StringBuilder();
        if (emailAddresses.isEmpty()) {
            System.out.println("No email addresses found in the file.");
        } else
        {
            System.out.println("Email addresses found:");
            for (String email : emailAddresses) {
                System.out.println(email);
                emails.append(email+"\n");

            }
        }
        FileWriter fileWriter=   new FileWriter("src/test/resources/email_list.text");
        fileWriter.write(emails.toString());
        fileWriter.flush();
        fileWriter.close();
    }

    public static List<String> extractEmails(File file) {
        List<String> emailAddresses = new ArrayList<>();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    emailAddresses.add(matcher.group());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }
        return emailAddresses;
    }
}
