package AulaLacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();

		if(numero %2 == 0 && numero >0)
		{
			System.out.println("\nNumero positivo e par");
		}

		else if(numero %2 == 1)
		{
			System.out.println("\nNúmero positivo e impar");
		}
	
		if ((numero %2 == 0) && (numero<0))
		{
			System.out.println("\nNúmero negativo e par");
		}
		else if((numero %2 == -1) && (numero<0))
		{
			System.out.println("\nNúmero negativo e ímpar");

		}

}
	
}
