import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner user= new Scanner(System.in);
		int[] A = new int [10];
		Scanner in = new Scanner (System.in);
		for (int i=0; i<A.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			A [i]= in.nextInt();
		}
		boolean primo;
		for (int i=0; i<A.length;i++){
			 primo = true;
			
			for (int j = 2; j<A[i]; j++) {
				if (A[i] % j==0)
					primo = false;
				break;
			}
			
			if (primo) {
				System.out.println("O número é primo");
			}else {
				System.out.println("O número não é primo");
			}




	}
	}
}
