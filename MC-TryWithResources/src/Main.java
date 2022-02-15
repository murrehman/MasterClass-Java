import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int x = 1;
		int y = 2;
		
		FileWriter data = new FileWriter("data.txt");
		data.write(x + " " + y);
		data.close();

	}
	
	//-----TRY WITH RESOURCES IN STATIC BLOCK CHALLENGE-----------
	
	static {
		try(FileReader input = new FileReader("data.txt")) {
			System.out.println(input.getEncoding());
			while (input.ready()) 
//-Input data is in different encoding and here we convert and print
			System.out.print((char) input.read());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
