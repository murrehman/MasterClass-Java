
public class DeluxeBurger extends HamBurger{
	public DeluxeBurger() {
		super("Deluxe Burger","white", "Sausage & bacon", 14.50 );
		super.addHamburgerAddition1("chips", 1);
		super.addHamburgerAddition2("drinks", 2);
	}
	
	public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot Add Additional Items to the Deluxe Burger");
    }

    public void addHamburgerAddition2(String name, double price){
    	System.out.println("Cannot Add Additional Items to the Deluxe Burger");
  
    }

    public void addHamburgerAddition3(String name, double price){
    	System.out.println("Cannot Add Additional Items to the Deluxe Burger");
        
    }

    public void addHamburgerAddition4(String name, double price){
    	System.out.println("Cannot Add Additional Items to the Deluxe Burger");
    }


}
