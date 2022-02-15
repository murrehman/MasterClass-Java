
public class Main {

	public static void main(String[] args) {
		
		HamBurger hamBurger = new HamBurger("Basic","white","Sausage", 5.9);
        hamBurger.addHamburgerAddition1("tomato", 1);
        hamBurger.addHamburgerAddition2("lettuce", 1.5);
        hamBurger.addHamburgerAddition3("Cheese", 2);
        System.out.println("total price " + hamBurger.itemizeHamburger());
        
        HealthyBurger healthyBurger = new HealthyBurger("bacon", 8.5);
        healthyBurger.addHamburgerAddition1("EGG", 1);
        healthyBurger.addHealthyAddition1("Lentils", 2);
        System.out.println("total price " + healthyBurger.itemizeHamburger());
        
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("onion", 2);
        db.itemizeHamburger();

	}

}
