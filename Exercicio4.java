import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
				
			
				int i = 0,a[];
				int maior=0, menor = 1000000, aux;
				a = new int [10];

				for(i=0;i<10;i++) {
					System.out.println("Insira o " +(i+1)+ "°"+" valor:");
					a [i]=in.nextInt();
					aux= a[i];
					if (menor>aux) {
						menor=a[i];
					}
					if(maior<aux) {
						maior=a[i];
					}
				}
				System.out.println("O maior número digitado foi : " +maior);
				System.out.println(" O menor digitado número foi : "+menor);
			}
	
		

	}


