import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Multiplication {
	
	public static int n = 0;
	public static int b = 0;

	public static void main(String[] args) throws IOException {

		try(BufferedReader input = new BufferedReader(new FileReader("ata.txt"))) {
			//System.out.println(input.getEncoding());
			while (input.ready()) {
				String i = input.readLine();//readLine is string

			//System.out.print(i);
			String[] s = i.split(" ");
			 n = Integer.parseInt(s[0]);
			 b = Integer.parseInt(s[1]);
			
			}
		}
		
		int  sum = b - n;
		System.out.print(b +" - "+ n + " = " + sum);
		System.out.println();
		Multi();
		

	}
	
	public static void Multi() {
		int multi = b*n;
		System.out.print(b +" * "+ n + " = " + multi);
	}

}
