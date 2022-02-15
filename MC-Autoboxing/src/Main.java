
public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank("National Bank of Pakistan");
		
		bank.addBranch("Islamabad");
		
		bank.addCustomer("Islamabad", "Ali-Ibn-Ahad", 124.5);
		bank.addCustomer("Islamabad", "Duad-Ibn-Shakoor", 1745.2);
		bank.addCustomer("Islamabad", "Hamza-Ibn-Maja", 220.1);
		
		bank.addBranch("Khaber-Pakhtom-khowah");
		bank.addCustomer("Khaber-Pakhtom-khowah", "Abbasi-Ibn-Tariq",150.0);
		
		bank.addCustomerTransaction("Islamabad", "Ali-Ibn-Ahad", 965.2);
		bank.addCustomerTransaction("Islamabad", "Ali-Ibn-Ahad", 20.9);
		bank.addCustomerTransaction("Islamabad", "Duad-Ibn-Shakoor", 12.7);
		
		bank.listCustomers("Islamabad", true);
		bank.listCustomers("Khaber-Pakhtom-khowah", true);
		
		bank.addBranch("Islamabad");
		bank.addCustomer("Islamabad", "Duad-Ibn-Shakoor", 1745.2);
	}

}
