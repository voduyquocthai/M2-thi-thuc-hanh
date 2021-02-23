package Views;

import Entities.Contact;

import java.util.Scanner;

public class Menus {

    static public Scanner input = new Scanner(System.in);

    static public Contact getContactInfo(){
        System.out.println("------------------------------");
        System.out.println("Enter Contact's Id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter Contact's Name:");
        String name = input.nextLine();
        System.out.println("Enter Contact's Phone Number:");
        String phoneNumber = input.nextLine();
        System.out.println("Enter Contact's Address:");
        String address = input.nextLine();
        System.out.println("Enter Contact's Email:");
        String email = input.nextLine();
        System.out.println("Enter Contact's Facebook Link:");
        String facebookLink = input.nextLine();
        Contact contact = new Contact(id, name, phoneNumber, address, email, facebookLink);
        return contact;
    }
}
