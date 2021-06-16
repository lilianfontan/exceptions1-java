package Controle;

import Utilidades.data;

public class Conta {
	private int numConta;
	private double saldo;
	private data dataAbertura;
	private correntista [] correntistas;
	
	//Construtor
	public Conta(int numConta, data dataAbertura, correntista [] correntistas, double monto) {
		this.numConta = numConta;
		this.dataAbertura = dataAbertura;
		this.correntistas = correntistas;
		this.saldo = monto;
	}
	
	public String toString() {
		String resposta = "numConta: " + numConta + " saldo: " + saldo + "data de Abertura: " + dataAbertura;
		for(int i=0; i<correntistas.length;i++) {
			resposta = resposta +" "+correntistas[i];
		}
		return resposta;
	}
	
	public boolean fazerDeposito (double monto) {
		if (monto>=0) {
			saldo = saldo + monto;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean fazerSaque(double monto) {
		if(saldo>monto) {
			saldo = saldo - monto;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean fazerTransferencia(Conta destino, double monto) {
		if(this.fazerSaque(monto)==true) {
			destino.fazerDeposito(monto);
			return true;
		}
		else {
			return false;
		}
	}
}
