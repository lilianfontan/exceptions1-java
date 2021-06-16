package Utilidades;

public class data {
	private int dia;
	private int mes;
	private int ano;
	
	//Construtor
	public data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void setData (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	
}
