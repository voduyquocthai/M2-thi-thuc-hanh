package Behaviors;

import Entities.Contact;

import java.util.ArrayList;


public class ContactManagement {

    ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact c){
        contacts.add(c);
    }

    public void deleteContactByName(String name){
        contacts.removeIf(c -> c.getName().equals(name));
    }

    public void updateContactByName(Contact contact){
        boolean flag = false;
        for (Contact c: contacts) {
            if(c.getName().equals(contact.getName())){
                flag = true;
                c.setId(contact.getId());
                c.setPhoneNumber(contact.getPhoneNumber());
                c.setAddress(contact.getAddress());
                c.setEmail(contact.getEmail());
                c.setFacebookLink(contact.getFacebookLink());
            }
        }
        if(flag == false){
            System.out.println("Cannot Find Contact ! Please Check Name And Try Again !");
        }
    }

    public void showContactByName(String name){
        for (Contact c: contacts) {
            if(c.getName().equals(name)){
                System.out.println(c.toString());
            }
        }
    }

    public void showAllContact(){
        for (Contact c:contacts) {
            System.out.println(c.toString());
        }
    }
}
