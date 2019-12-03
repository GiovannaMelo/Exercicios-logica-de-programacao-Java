import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);

		double [] A = new double [11];
			
			for (int i=0; i<A.length;i++){
				
				A [i]= Math.pow(2,i);
		}
			System.out.println("Vetor A ");
			for (int i = 0; i<A.length; i++) {
				System.out.println(A[i] + "");
			}
			System.out.println();
			
		
	}
	
}
