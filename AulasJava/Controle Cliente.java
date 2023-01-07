package AulaPoo;

import java.util.Scanner;

public class Exercicios{
	
	
	public static void main(String[] args) {
	Teste Pj = new Pj("DZAH","11944558997","dzah.acessorios8@gmail.com","av. um, 524","29","311487824526");
	
	Teste Pf = new Pf("Daniela","119485247","dzah@gmail.com","av. dois, 800","29","4085678423");
	
	int X;

	Scanner leia = new Scanner(System.in);
	System.out.println("\nVocê deseja ver as iformações de: "+"\n1-Pessoa Juridica"+"\n2-Pessoa Fisica"+"\nescolha apenas um numero");
	
X=leia.nextInt();
	if(X==1)
	{
	 Pj.informacoes();
	}
	else if(X==2) {
		Pf.informacoes();
	}
	else {
		System.out.println("\nNúmero inválido!!!");
	}

	}
	
	
	
		
		
	}


		


		
		

