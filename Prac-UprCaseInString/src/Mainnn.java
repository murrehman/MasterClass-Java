
public class Mainnn {

	public static void main(String[] args) {
		
//--------------------MY-SOUTION-----------------------------
		
		String str = "how to";
		String s = ""; 
	     for (int i = 0; i < str.length(); i++) {
	    	 if(str.charAt(i) == ' ') {
	    		 s += Character.toString('.');
    			 s += Character.toString(str.charAt(i+1));
    		 }if(i==0)
	    	 s += Character.toString(str.charAt(i));
	     }
	     String p = s.toUpperCase();
	     System.out.print(p);

	}
	
	// -------------CODE-WARS SOLUTION------------------------
	
	public static String abbrevName(String name) {
	    return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
	  }

}
