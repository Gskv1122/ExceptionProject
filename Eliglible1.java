package exceptionHandling;

public class Eliglible1 {
	public static void main(String[]args) throws EligibleForRetirement {
		int age=60;
		if(age>=60) {
			System.out.println("Eligible for Retirement");
		}
		else {
			throw new EligibleForRetirement("Not Retirement Age");
		}
	}

}
