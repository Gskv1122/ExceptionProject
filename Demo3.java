package exceptionHandling;

public class Demo3 {
	public static void main(String[]args) {
		String[]word= {"mani","priya","ragul","hema"};
		try {
		//System.out.println(word[3].charAt(10));
		System.out.println(word[5].charAt(10));
		//System.out.println(word[5].charAt(3));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		catch(NumberFormatException e) {
//			System.out.println();
//		}
	}

}
