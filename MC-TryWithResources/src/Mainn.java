import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mainn {

	public static void main(String[] args) throws IOException {
		String[] x = {"ok ", "wait ", "I'm "};
		String[] y = {"checking"};
		
		FileWriter data = new FileWriter("data.txt");
		for(String s : x) {
		data.write(s);
		}
		for(String s : y) {
			data.write(s);
			}
		data.close();

	}
	
	//-----TRY WITH RESOURCES IN STATIC BLOCK CHALLENGE-----------
	
	static {
		try(FileReader input = new FileReader("data.txt")) {
			System.out.println(input.getEncoding());
			while (input.ready()) 
//-Input data is in different encoding and here we convert and print
			System.out.print((char)input.read());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
