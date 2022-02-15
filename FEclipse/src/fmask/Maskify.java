package fmask;

public class Maskify {   
	
	public static int maskify(int normPrice, int discount, int hol) {  
		//first calculate discount
		double dis = discount;
		double p= normPrice;
		double h= hol;
	    double d = dis/100*p;
	    
	    //now calculate num of duty free bottles
	    double num = h/d;
	    return (int)num;
	    
        
	}

}
