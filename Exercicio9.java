import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		

		int i = 0;
		int j = 0;
		int[] a = new int [10];
		for(i=0;i<a.length;i++) {
		System.out.println("Insira o " +(i+1)+"�"+" n�mero desejado:");
		a[i]=in.nextInt();
		System.out.println(" Os numeros pares at� o valor "+a[i]+ " s�o :");
		for(j=0;j<a[i]+1;j=j+2) {
			System.out.print(j+" ");
			System.out.println(" ");
		}
		}

		in.close();
	}

}
