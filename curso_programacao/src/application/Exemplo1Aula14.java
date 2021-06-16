package application;

import entities2.Account;
import entities2.BusinessAccount;
import entities2.SavingsAccount;

public class Exemplo1Aula14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		acc1.getBalance();
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		//Account acc8 = new Account(1006, "Joana", 100.00);
		//System.out.println("O saldo da conta de Joana �: " + acc8.getBalance());
		//acc8.withdraw(25.00);
		//System.out.println("O saldo da conta de Joana �: " + acc8.getBalance());
		
		System.out.println();
		
		BusinessAccount acc9 = new BusinessAccount(1007, "Caio", 100.00, 100.00);
		System.out.println("O saldo da conta de Caio �: " + acc9.getBalance());
		acc9.withdraw(25.00);
		System.out.println("O saldo da conta de Caio �: " + acc9.getBalance());
		
		System.out.println();
		
		SavingsAccount acc10 = new SavingsAccount(1008, "Ricardo", 100.00, 0.05);
		System.out.println("O saldo da conta de Ricardo �: " + acc10.getBalance());
		acc10.withdraw(25.00);
		System.out.println("O saldo da conta de Ricardo �: " + acc10.getBalance());
	}

}
