package Ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileConsole {
public static void main(String[] args) throws IOException {
	
	FileReader reader =new FileReader("D:\\ustcore\\Ioserialization\\src\\Ioserialization\\KeyboardToFile.java");
	BufferedReader buffer =new BufferedReader(reader);
	
	//buffer is used for optimization..store for future use.
	
	String data=buffer.readLine();
	while(data!=null)

	{
		System.out.println(data);
		data=buffer.readLine();
		
	}
	//buffer.flush();
	buffer.close();
	reader.close();
}
}
