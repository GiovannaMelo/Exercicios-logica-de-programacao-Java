import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		int[] A = new int [10];
		
		for (int i=0; i<A.length;i++){
			System.out.println("Digite um n�mero para a "+(i+1)+"�" +" posi��o:");
			A [i]= in.nextInt();
		}
		for (int i=0; i<A.length;i++){
			System.out.println("Divisores do n�mero "+A[i]);
			
			for (int j = 1; j<=A[i]; j++) {
				if (A[i] % j==0) {
					System.out.println(j+" � divisor");
				}
		}
			System.out.println("");
	}
		in.close();

	}

}
