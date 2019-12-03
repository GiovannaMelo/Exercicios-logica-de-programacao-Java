import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		int[] A = new int [10];
		
		for (int i=0; i<A.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			A [i]= in.nextInt();
		}
		for (int i=0; i<A.length;i++){
			System.out.println("Divisores do número "+A[i]);
			
			for (int j = 1; j<=A[i]; j++) {
				if (A[i] % j==0) {
					System.out.println(j+" é divisor");
				}
		}
			System.out.println("");
	}
		in.close();

	}

}
