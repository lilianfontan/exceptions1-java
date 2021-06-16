package entities;

public class CurrencyConverter {
	public static double valorReais(double precoDolar, double quantDolar) {
		double valorDolarComprados = precoDolar*quantDolar;
		return valorDolarComprados + valorDolarComprados*0.06;
	}

}
