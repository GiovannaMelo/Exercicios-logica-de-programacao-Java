import java.util.Scanner;
public class Exercicio18 {

	public Exercicio18() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int[] A = new int [10];
		int[] B = new int [A.length];
		
		for (int i=0; i<A.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			A [i]= in.nextInt();
			
			// operador ternario ? = if e := else
			B[i]=(A [i]%2==0) ? 1 : 0;
			
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