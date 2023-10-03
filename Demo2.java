package exceptionHandling;
//multiple try catch
public class Demo2 {
	public static void main(String[]args) {
		String a="mani";
		try {            //first exception only check: 
		char b=a.charAt(5);
		System.out.println(b);
		char[] c=a.toCharArray();
		System.out.println(c[5]);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {//only first catch only occur:
			System.out.println(e);
		}
	}

}
