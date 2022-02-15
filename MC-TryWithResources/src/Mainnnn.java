import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mainnnn {

	public static void main(String[] args) {
		
		try(BufferedReader input = new BufferedReader(new FileReader("data.txt"))) {
			//System.out.println(input.getEncoding());
			while (input.ready()) {
				String i = input.readLine();
//-Input data is in different encoding and here we convert and print

			String[] data = i.split(",");
			int n = Integer.parseInt(data[0]);
			String des = data[1];
			System.out.println(n + ": " + des);
			
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
