import java.util.Scanner;
public class Exercicio17 {

	public Exercicio17() {
	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] A = new int [10];
		
		for (int i=0; i<A.length;i++){
			System.out.println("Digite um n�mero para a "+(i+1)+"�" +" posi��o:");
			A [i]= in.nextInt();
		}
		boolean palindromo = true;
		for (int i=0; i<A.length; i++) {
			 
			if (A[i] != A [A.length - 1 - i]) {
				palindromo = false ;
				break;
				
			}
			
		}
		
		for (int i = 0; i<A.length; i++) {
			
		}
		System.out.println();
		
		if (palindromo) {
			System.out.println("� um palindromo");
		} else {
			System.out.println("N�o � um palindromo");
		}
		
	}

}
