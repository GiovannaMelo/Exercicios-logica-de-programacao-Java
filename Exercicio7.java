import java.util.Scanner;
public class Exercicio7 {

	public Exercicio7() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int [5];
		Scanner in = new Scanner (System.in);
		for (int i=0; i<A.length;i++){
			System.out.println("Digite um n�mero para a "+(i+1)+"�" +" posi��o:");
			A [i]= in.nextInt();
		}
		for (int i=0; i<A.length;i++){
			System.out.println("Tabuada do "+A[i]+":");
			
			for (int j = 1; j<=10; j++) {
				System.out.println(+A[i]+"x"+j+"="+(A[i]*j));
			}
	}

		System.out.println();
		
}
}
 