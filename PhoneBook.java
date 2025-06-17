import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n--- PhoneBook ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.println("\nContacts:");
                    for (String key : phoneBook.keySet()) {
                        System.out.println(key + ": " + phoneBook.get(key));
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Found: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();
                    if (phoneBook.remove(deleteName) != null) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}