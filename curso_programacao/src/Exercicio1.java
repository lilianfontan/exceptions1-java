import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("%n");
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.printf("%n");
		System.out.printf("Measue with eight decimal places: %.8f %n", measure);
		System.out.printf("Rounded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		System.out.println();
		

	}

}
