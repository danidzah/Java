package AulaPoo;

import java.util.Scanner;

public class EntregaexPo {

	public static void main(String[] args) {
	Teste Pj = new Pj("DZAH","11944558997","dzah.acessorios8@gmail.com","av. um, 524","29","311487824526");
	
	Teste Pf = new Pf("Daniela","119485247","dzah@gmail.com","av. dois, 800","29","4085678423");
	
	int X;

	Scanner leia = new Scanner(System.in);
	System.out.println("\nVocê deseja ver as iformações de: "+"\n1-Pessoa Juridica"+"\n2-Pessoa Fisica"+"\n1escolha apenas um numero");
	
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
//-------------------------------------------------------------------------------------------------------------

package AulaPoo;

public class Teste {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private String idade;
	
	public Teste(String nome, String telefone, String email, String endereco, String idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void informacoes() 
	{
		
	}
	
	
}

//-----------------------------------------------------------------------------------------------

package AulaPoo;

public class Pj extends Teste {
	private String cnpj;

	public Pj(String nome, String telefone, String email, String endereco, String idade, String cnpj) {
		super(nome, telefone, email, endereco, idade);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	 public void informacoes() {
		 System.out.println("\nNome do Cliente: "+getNome()+"\nTelefone do Cliente: "+getTelefone()+"\nE-mail do cliente: "+getEmail()+"\nEndereço do cliente: "+getEndereco()+"\nIdade do cliente: "+getIdade()+cnpj);
	 }
	
}
//-----------------------------------------------------------------------------------------------------------

	package AulaPoo;

public class Pf extends Teste {
	private String cpf;

	public Pf(String nome, String telefone, String email, String endereco, String idade, String cpf) {
		super(nome, telefone, email, endereco, idade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void informacoes() {
		 System.out.println("\nNome do Cliente: "+getNome()+"\nTelefone do Cliente: "+getTelefone()+"\nE-mail do cliente: "+getEmail()+
				 "\nEndereço do cliente: "+getEndereco()+"\nIdade do cliente: "+getIdade()+cpf);
	}
}
	


	
