package AulaLacosCondicionais;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("\nDiga sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=16 && idade <=18)
		{
			System.out.println("\nApta a votar e o voto é facultativo!");
		}
		else if(idade>=18 && idade<65)
		{
			System.out.println("\nApta a votar e o voto é obrigatório!");
		}
		else if(idade>=65)
		{
			System.out.println("\nApta a votar e o voto é facultativo!");	
		}
		else
		{
			System.out.println("\nA pessoa não está apta a votar!!!");
		}
			
	}

}
