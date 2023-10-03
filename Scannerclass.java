package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
//I/O exception:  
public class Scannerclass {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Enter are the age:");
		try {
		int age=scan.nextInt();
		System.out.println(age);
		}
		catch(InputMismatchException a) {
			System.out.println(a);
		}
		
		
	}

}
