package practise;
  

public class School {
	public static void string(String str){
		 str = "skippy";
		 
		 char[] str1=str.toCharArray();
		for(int i=0; i<str1.length;i++) {
		 if(i<str1.length-4){
		     System.out.print("#");
		 }else
		System.out.print(str1);
		}
		}
}
