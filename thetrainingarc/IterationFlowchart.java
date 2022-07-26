package thetrainingarc;

public class IterationFlowchart {
	
	public static void main(String[] args) {
		
		int A = (100);
		boolean aintEnuff = true;
		
		while (aintEnuff) {
			System.out.println(A);
			A++;
			
			if (A == 200) {
				aintEnuff = false;
			}
		}
		
		System.out.println("Successful end");
		
	}
}