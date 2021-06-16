package estudojava;

public class estudo11062020 {
	public static void trocaDatas(int d1, int d2) {
		int temp = d1;
		d1 = d2;
		d2 = temp;
	}
	
	public static void main(String[] args) {
			System.out.println("teste");
			int a = 5;
			int b = 10;
			trocaDatas (a,b);
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			
		}
	}

