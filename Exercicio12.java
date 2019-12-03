import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);

		int[] A = new int [15];
		int[] B = new int [A.length];
		
			for (int i=0; i<A.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			A [i]= in.nextInt();
			
	}
			for (int i=0; i<A.length;i++){
				B[i]=1;
				for(int j=1; j<=A[i]; j++) {
					B[i] *=j;
				}
	}
			System.out.println("Vetor A ");
			for (int i = 0; i<A.length; i++) {
				System.out.println(A[i] + "");
			}
			System.out.println();
			
			System.out.println("Vetor B ");
			for (int i = 0; i<B.length; i++) {
				System.out.println(B[i] + "");
			}
			System.out.println();

}
}