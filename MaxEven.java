package exceptionHandling;

public class MaxEven {
	public int findmax(int[] n) throws MaxNumEven {
		
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
		}
		if(max%2==0) {
			return max;
		}
		else {
			throw new MaxNumEven("Odd num");
		}
	}
}

