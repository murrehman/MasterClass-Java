
public class HealthyBurger extends HamBurger {
	
	private String healthyextra1Name;
	private double healthyextra1Price;
	
	private String healthyextra2Name;
	private double healthyextra2Price;
	
	public HealthyBurger (String meat , double price) {
		super("healthyburger", "brownrye", meat, price);
	}
	
	public void addHealthyAddition1(String name, double price) {
		this.healthyextra1Name = name;
		this.healthyextra1Price = price;
		//System.out.println("Added "+ this.healthyextra1Name + " for an extra "+ this.healthyextra1Price );
	}
	
	public void addHealthyAddition2(String name, double price) {
		this.healthyextra2Name = name;
		this.healthyextra2Price = price;
	}
	
	
	public double itemizeHamburger() {
		double HamBurgerPrice = super.itemizeHamburger();
		if (this.healthyextra1Name!=null) {
            HamBurgerPrice += healthyextra1Price;
            System.out.println("Added " + this.healthyextra1Name + " for an extra " + this.healthyextra1Price);
		}
		if (this.healthyextra2Name!=null) {
            HamBurgerPrice += healthyextra2Price;
            System.out.println("Added " + this.healthyextra2Name + " for an extra " + this.healthyextra2Name);
		}
		return HamBurgerPrice;
	}

}
