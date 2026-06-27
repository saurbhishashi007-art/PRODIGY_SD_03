package tasks;
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("-------------------------");
    }
}

public class ContactSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact(name, phone, email));
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts Available.");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println("Contact " + (i + 1));
                            contacts.get(i).display();
                        }
                    }
                    break;

                case 3:
                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts to Edit.");
                        break;
                    }

                    System.out.print("Enter Contact Number to Edit: ");
                    int edit = sc.nextInt();
                    sc.nextLine();

                    if (edit >= 1 && edit <= contacts.size()) {
                        Contact c = contacts.get(edit - 1);

                        System.out.print("Enter New Name: ");
                        c.name = sc.nextLine();

                        System.out.print("Enter New Phone: ");
                        c.phone = sc.nextLine();

                        System.out.print("Enter New Email: ");
                        c.email = sc.nextLine();

                        System.out.println("Contact Updated Successfully!");
                    } else {
                        System.out.println("Invalid Contact Number.");
                    }
                    break;

                case 4:
                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts to Delete.");
                        break;
                    }

                    System.out.print("Enter Contact Number to Delete: ");
                    int del = sc.nextInt();

                    if (del >= 1 && del <= contacts.size()) {
                        contacts.remove(del - 1);
                        System.out.println("Contact Deleted Successfully!");
                    } else {
                        System.out.println("Invalid Contact Number.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

	


