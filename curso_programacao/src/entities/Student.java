package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public void situacaoFinal() {
		double notaFinal = notaFinal();
		if(notaFinal>60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-notaFinal);
		}
	}

}
