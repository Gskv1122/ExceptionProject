package exceptionHandling;

public class Demo {
	public static void main(String[]args) {
		//Arithmetic Exception:
//		int a=10;
//		int b=0;
//		try {
//			System.out.println(a/b);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("invalid data");
//		}
		
		//NullPointer Exception:
//		String a=null;
//		System.out.println("helloworld");
//		try {
//		String b=a.toUpperCase();
//		System.out.println(b);
//		}
//		catch(NullPointerException s) {
//		System.out.println(s);
//		System.out.println("hi");
//		}
		
		//NumberPointer Exception:
//		String a="1b";
//		try {
//		int b=Integer.parseInt(a);
//		System.out.println(b);
//		}
//		catch(NumberFormatException s) {
//			System.out.println(s);
//			System.out.println("hi");
//		}
		//StringIndexOutOfBound Exception:
//		String a="mani";
//		char b=a.charAt(0);
//		System.out.println(b);
//		try {
//		char c=a.charAt(5);
//		System.out.println(c);
//		}
////		catch(StringIndexOutOfBoundsException e) {
////			System.out.println(e);
////		}
//		finally {
//			System.out.println("this String index invalid");
//		}
//		System.out.println("hii");
		
		//ArrayIndexOutOfBounds Exception:
		int[] num= {99,79,80};
		try {
		System.out.println(num[4]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
//		finally {
//			System.out.println("Array index out of bound");
//		}
	}

}
