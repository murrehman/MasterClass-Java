import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyfileChannel {

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
				
				
// Copying binary file with fileChannel
				
				RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
				FileChannel copyChannel = copyFile.getChannel();
				channel.position(0);
//				long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
				long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
				System.out.println("Numtransferred: " + numTransferred);
				
				channel.close();
				ra.close();
				copyChannel.close();
				copyFile.close();
				

			} catch (IOException e) {
				e.printStackTrace();
			}


	}

}
