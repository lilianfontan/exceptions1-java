package Controle;

public class correntista {
	private String cpf;
	private String nome;
	
	//Construtor
	public correntista(String cpf, String nome){
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String toString() {
		return " cpf: " + cpf + "nome: " + nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
