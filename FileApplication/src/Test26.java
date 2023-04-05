//use of channel and buffer to write a file
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.*;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
public class Test26 {
	public static void main(String[] args) throws Exception{
String data="mobile-iphone 14, price-80k, Nokia 2600 price-2600";
RandomAccessFile file = new RandomAccessFile("C:\\sunil\\amazon.store", "rw");
ByteBuffer buffer = ByteBuffer.allocate(data.length());
for (int i = 0; i < data.length(); i++) {
buffer.put((byte) (data.charAt(i))); 
}
FileChannel channel = file.getChannel();
buffer.rewind();
channel.write(buffer);
System.out.println("Data written to file");
channel.close(); 
file.close();
read();
}//end of main
public static void read() throws Exception {
	RandomAccessFile file = 
	new RandomAccessFile("C:\\sunil\\amazon.store", "rw");
	FileChannel channel = file.getChannel();
	ByteBuffer buffer = ByteBuffer.allocate(1024);
	int numOfBytesRead = channel.read(buffer);
	for(int i=0;i<numOfBytesRead;i++) {
	char c=(char)buffer.get(i);
	System.out.print(c);
		}
	channel.close();
	file.close();
		}//end of read
		}//end of class


