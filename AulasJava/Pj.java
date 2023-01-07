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
