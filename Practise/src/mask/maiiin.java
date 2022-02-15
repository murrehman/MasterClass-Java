package mask;

public class maiiin {

	public static void main(String[] args) {
		String cardNum = "4111110065031111";
	    //final int STARTLENGTH = 6;   //first digit of card you don't want to mask
	   // final int ENDLENGTH = 4;    //last digit of card you don't want to mask
	    //int maskedLength = cardNum.length() - ENDLENGTH;
	   //System.out.println(maskedLength);
	    StringBuilder sb = new StringBuilder();
	    String substr = cardNum.substring(0,cardNum.length()-4);
	    for (int i = 0; i < substr.length(); i++) {
	        sb.append("*");
	    }
	   // String maskedCard = cardNum.substring(0) + sb + cardNum.substring(cardNum.length() - ENDLENGTH, cardNum.length());
	   // String maskedCard = sb;
	    String substr2 = cardNum.substring(cardNum.length()-4,cardNum.length());
	    String s3= sb.toString();
	    String s4 = s3.concat(substr2);
	    System.out.println(s4); 

	}

}
