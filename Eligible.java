package exceptionHandling;

public class Eligible {
	public static void main(String[]args) throws VoteNotEligible {
		int num=17;
		if(num>=18) {
			System.out.println("Eligible for vote");
			
		}
		else {
			throw new VoteNotEligible("not eligible for vote");
		}
	}

}
