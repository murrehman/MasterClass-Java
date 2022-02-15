import java.util.*;
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("00923047955");
	

	public static void main(String[] args) {
		
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\nEnter Action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Shutting down...");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			
			}
			
			
		}
		
		
		}
	public static void addNewContact() {
		System.out.println("Enter new Contact Name. ");
		String name = scanner.nextLine();
		System.out.println("Enter Phone Number. ");
		String phone = scanner.nextLine();
		contact newContact = contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New Contact Added: "+ "name = "+ name + " phone = "+ phone);
		}else {
			System.out.println("Cannot add "+ name + " already on file");
		}
	}
	
	public static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact Not Found");
			return;
		}
		System.out.println("Enter new Contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter Contact Phone Number: ");
		String newNumber = scanner.nextLine();
		contact newContact = contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Contact Updated Successfully...");
		}else {
			System.out.println("Error Updating Contact.");
		}
	}
	
	public static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact Not Found");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Contact Deleted Successfully.");
		}else {
			System.out.println("Error Deleting Contact");
		}
	}
	
	public static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact Not Found");
			return;
		}
		System.out.println("Name: "+ existingContactRecord.getname()+ "phone: "+ existingContactRecord.getphoneNumber());
	}
	
	private static void startPhone() {
		System.out.println("Phone is starting.....");
  }
	
	private static void printActions() {
		System.out.println("\nAvailable Actions: \nPress");
		System.out.println("0  - to shutdown\n"+
		                   "1  - to print contacts\n"+
		                   "2  - to add new contact\n"+
		                   "3  - to update an existing contact\n"+
		                   "4  - to remove an existing contact\n"+
		                   "5  - query if contact exists\n"+
		                   "6  - to print a list of available actions\n"
		);
		//System.out.println("Choose Your Action: ");
	}

}
