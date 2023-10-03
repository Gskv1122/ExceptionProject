package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// file not found exception:
public class Filenot {
	public static void main(String[]args) throws FileNotFoundException ,IOException {
		try {
		File f=new File("C:/Users/GNANASEKAR/Documents/hell.txt");
		FileReader fn=new FileReader(f);
		int temp=0;
		while((temp=fn.read())!=0) {
			System.out.print((char)(temp));
		 
		
			
		}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
