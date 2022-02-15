import java.util.*;
public class MobilePhone {
	
	private String myNumber;
	private ArrayList<contact> myContacts;
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<contact>();
	}
	
	public boolean addNewContact(contact Contact) {
		if(findContact(Contact.getname())>=0){
			System.out.println("contact is already on file");
			return false;
		}
			myContacts.add(Contact);
		return true;
	}
	
	public boolean updateContact(contact oldContact, contact newContact) {
		int foundPosition = findContact(oldContact);
		if(foundPosition<0) {
			System.out.println(oldContact.getname() + " was not found");
			return false;
		}else if(findContact(newContact.getname()) != -1) {
			System.out.println("Contact with the Name "+ newContact.getname()+ " already exists. Update was not successfull.");
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getname() + " was replaced with "+newContact.getname());
		return true;
	}
	
	public boolean removeContact(contact Contact) {
		int foundPosition = findContact(Contact);
		if(foundPosition<0) {
			System.out.println(Contact.getname() + " was not found");
			return false;
		}
		
		this.myContacts.remove(foundPosition);
		System.out.println(Contact.getname()+ " was removed");
		return true;
	}
	
	private int findContact(contact Contact) {
		return this.myContacts.indexOf(Contact);
	}
	
	private int findContact(String contactName) {
		for(int i=0;i<this.myContacts.size();i++) {
			contact Contact = this.myContacts.get(i);
			if(Contact.getname().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	
	public contact queryContact (String name) {
		int position = findContact(name);
		if(position >=0) {
			return this.myContacts.get(position);
		}
		return null;
	}
	
	public String queryContact(contact Contact) {
		if(findContact(Contact) >=0 ) {
			return Contact.getname();
		}
		return null;
	}
	
	public void printContacts() {
		System.out.println("Contact List");
		for (int i =0; i<this.myContacts.size();i++) {
			System.out.println(i + ". "+ this.myContacts.get(i).getname() + "   "+ this.myContacts.get(i).getphoneNumber());
		}
	}
	
	

}
