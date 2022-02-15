package mask;

public class Maskify {
    public static String maskify(String str) {
        throw new UnsupportedOperationException("Unimplemented");
    // char[] str1=str.toCharArray();
		for(int i=0; i<str1.length;i++) {
		 char x;
		if(i<str1.length-4){
		     System.out.print("#");
		 }else
		   x = str1[i];
		  String s=Character.toString(x);
		//System.out.print(str1[i]);
			 return s;
      }
      
    }
  
}