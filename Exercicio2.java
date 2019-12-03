import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);

		int aux=2,c=0,i=0,a[];
		a = new int[10];
		
		
		for(i=0; i<a.length; i++) {
			System.out.println("Insira o número para a " +(i+1)+ "°" + " posição");
			a[i]=in.nextInt();
			
			if (a[i]% aux ==0 && aux < a[i]) {
				System.out.println("o número "+a[i]+" não é primo");
			}else {
				System.out.println("o número "+a[i]+"  é primo");
				c++;
			}
		}
		System.out.println("A quantidade de números primos encontrados foi de :"+c);
		in.close();
		
	}
	}
	

		
	


