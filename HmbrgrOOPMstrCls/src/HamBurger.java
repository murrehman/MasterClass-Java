
public class HamBurger {
	
	private String name;
    private String breadRoll;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition3Price;
    private double addition4Price;
    private double addition2Price;
    private String addition3Name;
    private String addition4Name;



    public HamBurger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double HamBurgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRoll + " breadRoll with " + this.meat + " meat" + " for the price "+ this.price );
        if (this.addition1Name!=null) {
            HamBurgerPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name!=null) {
            HamBurgerPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name!=null) {
            HamBurgerPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name!=null) {
            HamBurgerPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return HamBurgerPrice;

    }

}
