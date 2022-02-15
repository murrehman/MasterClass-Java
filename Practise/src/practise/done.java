package practise;

public class done {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	 str = "2314589658745123";
		 
		 char[] str1=str.toCharArray();
		for(int i=0; i<str1.length;i++) {
		if(i<str1.length-4){
		     System.out.print("#");
		 }else
		System.out.print(str1[i]);
		}

	}

}
