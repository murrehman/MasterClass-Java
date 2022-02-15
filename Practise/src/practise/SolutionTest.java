package practise;



public class SolutionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = "2314589658745123";
	
	StringBuffer sb = new StringBuffer();
	
	sb.append(str);
	
	sb.replace(0, str.length()-4, "#");
	sb.replace(0,str.length()-4,"#");
	
	System.out.print(sb);
	}

}
