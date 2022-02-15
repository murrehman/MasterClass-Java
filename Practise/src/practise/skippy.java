package practise;

public class skippy {

	public static String maskify(String str){
		// char x ='#';
	     // int i;
	      char[] ch= str.toCharArray();
	      for(int i=0;i<ch.length-4;i++){
	      ch[i]='#';  
	      str=Character.toString(ch[i]);
	      }
	      //String s=Character.toString(ch[i]);  
	      return str;
	}    
}