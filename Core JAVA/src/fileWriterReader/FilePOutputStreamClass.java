package fileWriterReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilePOutputStreamClass {
	public static void main(String[] args) throws IOException {
//		String msg = "hello file";
//		FileOutputStream fos = new FileOutputStream("hello.txt");
//		byte b[] = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("done");
		
		
		FileInputStream fis = new FileInputStream("hello.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
}
