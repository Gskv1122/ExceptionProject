package exceptionHandling;

public class UseMaxEven {
	public static void main(String[]args) throws MaxNumEven {
		int[] num= {34,67,26,88,56};
		MaxEven m=new MaxEven();
		
		System.out.println(m.findmax(num));
	}

}
