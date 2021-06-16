package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums2.OrderStatus;
import entities3.Client;
import entities3.Order;
import entities3.OrderItem;
import entities3.Product;

public class Exercicio1Aula13 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Date momento = new Date(System.currentTimeMillis());
		
		//Dados do Cliente
		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		Client cliente = new Client(name, email, dataNascimento);
		
		//Dados do pedido
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Order pedido = new Order(momento, OrderStatus.valueOf(status));
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Product price: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantidade = sc.nextInt();
			
			Product produto = new Product(nomeProduto, precoProduto);
			OrderItem order = new OrderItem(quantidade, precoProduto, produto);
			pedido.addItem(order);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(pedido);
		System.out.println(cliente);
		System.out.println("Order items: ");
		System.out.println(pedido.getItems().toString());
		System.out.print("Total price: $");
		System.out.printf("%.2f", pedido.total());
		
		
		
		
		
		sc.close();

	}

}
