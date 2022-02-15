
public class contact {
	
	private String name;
	private String phoneNumber;
	
	public contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getname() {
		return name;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public static contact createContact(String name, String phoneNumber) {
		return new contact(name, phoneNumber);
	}

}
