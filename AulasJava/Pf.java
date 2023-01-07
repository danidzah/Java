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
