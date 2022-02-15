import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mainnn {

	public static void main(String[] args) throws IOException {
		int x = 123456;
		int y = 2;
		
		try(FileWriter data = new FileWriter("ata.txt")) {
		data.write(x + " " + y);
		}
	}
	
	//-----TRY WITH RESOURCES IN STATIC BLOCK CHALLENGE-----------
	
	static {
		int n;
		int b;
		try(BufferedReader input = new BufferedReader(new FileReader("ata.txt"))) {
			//System.out.println(input.getEncoding());
			while (input.ready()) {
				String i = input.readLine();//readLine is string

			//System.out.print(i);
			String[] s = i.split(" ");
			 n = Integer.parseInt(s[0]);
			 b = Integer.parseInt(s[1]);
			int  sum = b - n;
			System.out.print(b +" - "+ n + " = " + sum);
			
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}


