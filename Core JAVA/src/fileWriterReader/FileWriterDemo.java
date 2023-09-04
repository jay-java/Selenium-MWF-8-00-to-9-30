package fileWriterReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		String msg = "hello java";
		FileWriter fr = new FileWriter("t1.txt");
		fr.write(msg);
		fr.flush();
		fr.close();
		System.out.println("file created");
	}
}
