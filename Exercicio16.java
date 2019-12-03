import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);

		int[] A = new int [10];
		int X ;
		
		
			for (int i=0; i<A.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			A [i]= in.nextInt();
			
	}
			System.out.println("Digite um valor para X:");
			X = in.nextInt();
			
			
			for(int i=0; i<10; i++) {
				
				if(X==A[i]) {
					System.out.println("X foi encontrado em A");
					
					break;
			}else {
				System.out.println("X não foi encontrado em A");
				break;
			}

	}

}
}
