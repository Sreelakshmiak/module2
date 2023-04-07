package Ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("entered main....");
		String data=null;

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader reader= new BufferedReader(isr);
		
		FileWriter writer =new FileWriter("nammadafile");
		System.out.println("enter some text here..");
		data=reader.readLine();
		
		while(!data.equals("quit")) 
		{
		writer.write(data);	
		data=reader.readLine();
		
		//System.out.println("you have entered.."+data);
		
		
	}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main exit");
	}
	
}
