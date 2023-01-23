import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class ContactList
{
    //I am not sure about the parameters
    ArrayList<Person> contacts;


    public ContactList()
    {
        contacts = new ArrayList<Person>();
    }


    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact() {
        System.out.println("Select a type of contact to add: ");
        System.out.println("1. Student");
        System.out.println("2. IphoneUser");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();

        System.out.println("Please fill in the following information");
        //save and add to the constructor
        System.out.println("First Name:");
        String fName = input.nextLine();
        //save and add to the constructor
        System.out.println("Last Name:");
        String lName = input.nextLine();
        //save and add to the constructor
        System.out.println("Phone Number:");
        String number = input.nextLine();
        //save and add to the constructor

        if(choice == 1)
        {
            System.out.println("Grade:");
            int grade = input.nextInt();
            input.nextLine();

            Student s = new Student(fName, lName, number, grade);
            contacts.add(s);


        }
        if(choice == 2)
        {
            System.out.println("Has an Iphone (y/n): ");
            boolean iphone = input.nextLine().equalsIgnoreCase("Y");
            contacts.add(new IphoneUser(fName, lName, number, iphone));

        }




    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts()
    {
        // TODO: Complete the printContacts method
        for(int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method
    }

    // TODO: Write searchByFirstName

    // TODO: Write searchByLastName

    // TODO: Write searchByPhoneNumber

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents()
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            Person p = contacts.get(i);
            if(p instanceof Student)
            {
                System.out.println(p);
            }
        }
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        printMenuOptions();

        // TODO: Complete the run method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int choice = input.nextInt();
        input.nextLine();
        while(choice != 0)
        {
            // TODO: finish all the cases
            switch(choice)
            {
                case 0: return;
                case 1: this.addContact();
                        break;
                case 2: this.printContacts();
                        break;
                case 3: this.sort(1);
                        printContacts();
                        break;
                case 5: this.listStudents();
                        break;
            }
            printMenuOptions();
            System.out.println("Enter a number");
            choice = input.nextInt();
            input.nextLine();
        }
    }


    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
