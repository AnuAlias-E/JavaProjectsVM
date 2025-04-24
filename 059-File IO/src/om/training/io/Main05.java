package om.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main05 {
public static void main(String[] args) {
	InputStream is  =null;
	Reader reader= null;
	
	try {
		is=new FileInputStream("hello.txt");
	} catch (FileNotFoundException e) {
		System.err.println("Some error while opening the file hello.txt ");
		System.exit(0);
	}
	//Reading data as character stream 
	reader= new InputStreamReader(is);
	
	try {
		int sizeOfTheFile=is.available();
		char []arr=new char[sizeOfTheFile];
		reader.read(arr);
		String str= new String(arr);
		System.out.println(str);
	} catch (IOException e) {
		System.err.println("Some error while reading data  from the file");
		System.exit(0);
	}
	try {
	reader.close();	
		is.close();
	} catch (IOException e) {
		System.err.println("Some error while closing the file");
		System.exit(0);
	}
}
}
