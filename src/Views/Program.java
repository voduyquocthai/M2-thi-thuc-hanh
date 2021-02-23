package Views;

import Behaviors.ContactManagement;
import Entities.Contact;

import java.util.ArrayList;
import java.util.Scanner;

import static FileIO.CsvReader.*;
import static FileIO.CsvWriter.*;

public class Program {
    static ContactManagement cm = new ContactManagement();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("-------Contact Management-------");
            System.out.println("1. View Contact List");
            System.out.println("2. Add New Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search Contact By Name");
            System.out.println("6. Read From File");
            System.out.println("7. Write To File");
            System.out.println("0. Exit Program");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    cm.showAllContact();
                    break;
                case 2:
                    Contact contact = Menus.getContactInfo();
                    cm.addContact(contact);
                    break;
                case 3:
                    Contact contact1 = Menus.getContactInfo();
                    cm.updateContactByName(contact1);
                    break;
                case 4:
                    System.out.println("Enter Contact's Name:");
                    String name = input.nextLine();
                    cm.deleteContactByName(name);
                    break;
                case 5:
                    System.out.println("Enter Contact's Name:");
                    String name1 = input.nextLine();
                    cm.showContactByName(name1);
                    break;
                case 6:
                    String fileName = "data/contacts.csv";
                    readCsvFile(fileName);
                    break;
                case 7:
                    String fileName1 = "data/contacts.csv";
                    ArrayList<Contact> contacts = cm.getContacts();
                    writeCsvFile(fileName1,contacts);
                    break;
                case 0:
                    System.exit(0);
                default:
                    continue;
            }
        } while (true);
    }
}
