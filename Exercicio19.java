import java.util.Scanner;
public class Exercicio19 {

	public Exercicio19() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner in = new Scanner (System.in);
			int[] A = new int [10];
			int[] B = new int [A.length];
			int[] C = new int [A.length];
			
			
			for (int i=0; i<A.length;i++){
				System.out.println("Digite um número para a "+(i+1)+"°" +" posição de A:");
				A [i]= in.nextInt();
			
				
		}
			for (int i=0; i<B.length;i++){
				System.out.println("Digite um número para a "+(i+10)+"°" +" posição de A :");
				B [i]= in.nextInt();
			
				if (A[i]==B[i]) {
					C[i] = 0;
				}else if(A[i]>B[i]) {
					C[i] = 1;
				}else {
					C[i] = -1;
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
			
			System.out.println("Vetor C ");
			for (int i = 0; i<C.length; i++) {
				System.out.println(C[i] + "");
			}
			System.out.println();
	}

}
