import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class main {
	
	// DOING ALL THIS IN ONE SHOT IN 2nd CLASS FILE

	public static void main(String[] args) {
		
		// BINARY FILE WROTE BY JAVA.NIO
		
		try(FileOutputStream binFile = new FileOutputStream("data.dat");
			FileChannel binChannel = binFile.getChannel()) {
			byte[] outputBytes = "Hello World!".getBytes();
//			ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
			ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
			buffer.put(outputBytes);
			buffer.flip();
			int numBytes = binChannel.write(buffer);
			System.out.println("NumBytres written was: " + numBytes);
			
			ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
			intBuffer.putInt(245);
			intBuffer.flip();
			numBytes = binChannel.write(intBuffer);
			System.out.println("numBytes written was: " + numBytes);
			
			intBuffer.flip();
			intBuffer.putInt(-98765);
			intBuffer.flip();
			numBytes = binChannel.write(intBuffer);
			System.out.println("numBytes written was: " + numBytes);
			
			
			// BINARY FILE Read BY JAVA.IO
			
			RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
			byte[] b = new byte[outputBytes.length];
			ra.read(b);
			System.out.println(new String(b));
			
			long int1 = ra.readInt();
			long int2 = ra.readInt();
			System.out.println(int1);
			System.out.println(int2);
			
			
			// BINARY FILE Read BY JAVA.NIO
			
			
			RandomAccessFile raf = new RandomAccessFile("data.dat", "rwd");
			FileChannel channel = raf.getChannel();
			buffer.flip();
			long numBytesRead = channel.read(buffer);
			System.out.println("outputBytes = " + new String(buffer.array()));
			
			
			// ABSOLUTE READ
			
			intBuffer.flip();
			numBytesRead = channel.read(intBuffer);
			System.out.println(intBuffer.getInt(0));  //absolute read doesnt change buffer position
			intBuffer.flip();
			numBytesRead = channel.read(intBuffer);
			System.out.println(intBuffer.getInt(0));
			
			
//			RELATIVE READING
			
			
//			intBuffer.flip();
//			numBytesRead = channel.read(intBuffer);
//			intBuffer.flip();
//			System.out.println(intBuffer.getInt());
//			intBuffer.flip();
//			numBytesRead = channel.read(intBuffer);
//			intBuffer.flip();
//			System.out.println(intBuffer.getInt());
//			
			channel.close();
			raf.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
