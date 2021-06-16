package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double fazerDeposito(double valor) {
		return saldo += valor;
	}
	
	public double fazerSaque(double valor) {
		return saldo = saldo - valor - 5.00;
	}
	
	public String toString () {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: $"
				+ String.format("%.2f", saldo);
	}

}
