package Controle;

import Utilidades.data;

public class registroContas {

	public static void main(String[] args) {
		data d = new data(12,07,2020);
		correntista c1 = new correntista ("12345", "Ana");
		correntista c2 = new correntista("678910", "Jonh");
		correntista[] correntistas = new correntista[2];
		correntistas[0]=c1;
		correntistas[1]=c2;
		Conta conta1 = new Conta(2447, d, correntistas, 200);
		Conta conta2 = new Conta(33485, d, correntistas, 100);
		System.out.println(conta1);
		conta1.fazerDeposito(300);
		System.out.println(conta1);
		conta1.fazerSaque(100);
		System.out.println(conta1);
		conta1.fazerTransferencia(conta2, 200);
		System.out.println(conta1);
		System.out.println(conta2);

	}

}
