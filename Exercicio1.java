import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	
		int i = 0,a[], b[];
		
		a = new int [10];
		b = new int [10];
		
		for (i=0;i<10;i++ ){
			
			System.out.println("Digite o "+(i+1)+"� valor:");
			a[i] = in.nextInt();
			b[i] =  (int) Math.sqrt(a[i]) ;
			System.out.println("A raiz quadrada de "+ a[i]+ " � " + b[i]);
		
		}
		
	in.close();
			
		}
		
		

	}

