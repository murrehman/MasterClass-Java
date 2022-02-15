import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class RandomAccessingBinaryFileInNIO {

	public static void main(String[] args) {

		try (FileOutputStream binFile = new FileOutputStream("data.dat");
			FileChannel binChannel = binFile.getChannel()) {
			ByteBuffer buffer = ByteBuffer.allocate(100);
			
			byte[] outputBytes = "HELLO WORLD!".getBytes();
			buffer.put(outputBytes);
			long int1Pos = outputBytes.length;
			buffer.putInt(245);
			long int2Pos = int1Pos + Integer.BYTES;
			buffer.putInt(-98765);
			byte[] outputBytes2 = "NICE TO MEET YOU".getBytes();
			buffer.put(outputBytes2);
			long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
			buffer.putInt(1000);
			buffer.flip();
			
			binChannel.write(buffer);  
			
			RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
			FileChannel channel = ra.getChannel();
			
			ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
			channel.position(int3Pos);
			channel.read(readBuffer);
			readBuffer.flip();
			System.out.println("int3: " + readBuffer.getInt());
			
			readBuffer.flip();
			channel.position(int2Pos);
			channel.read(readBuffer);
			readBuffer.flip();
			System.out.println("int2: " + readBuffer.getInt());
			
			readBuffer.flip();
			channel.position(int1Pos);
			channel.read(readBuffer);
			readBuffer.flip();
			System.out.println("int1: " + readBuffer.getInt());
			
			
// USING POSITION() YOU CAN ALSO WRITE FILE IN RANDOM FASHION 
			
// FOR THIS CHECK VIDEO NO. 27 OF BASIC INPUT OUTPUT
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
