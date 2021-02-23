package FileIO;

import Entities.Contact;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWriter {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "Id,Name,PhoneNumber,Address,Email,FacebookLink";

    public static void writeCsvFile(String fileName, ArrayList<Contact> contacts){
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (Contact contact : contacts) {
                fileWriter.append(String.valueOf(contact.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getFacebookLink());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
