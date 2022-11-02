package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt(); // variaveis temporarias
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine(); // variaveis temporarias
		System.out.print("Is there na initial deposit (y/n): ");
		char response = sc.next().charAt(0);  // variaveis temporarias
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Conta(number, holder, initialDeposit);    //sobrecarga do construtor
		}
		
		else {
			account = new Conta(number, holder); // contrutor
		}
		
		System.out.println();
		System.out.println("Account data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update Account: \n" + account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update Account: \n" + account);


		
		

		
		sc.close();
	}

}
