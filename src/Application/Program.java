package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill bill = new Bill();
		
		
		System.out.print("gender (f) or (m): ");
		bill.gender = sc.next().charAt(0);
		System.out.print("quantity beer: ");
		bill.beer = sc.nextInt();
		System.out.print("quantity drink: ");
		bill.softDrink = sc.nextInt();
		System.out.print("quantity barbecue: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATORIO: ");
		
		System.out.printf("CONSUMO = $%.2f%n", bill.feeding());
		System.out.printf("COUVERT = $%.2f%n", bill.cover());
		System.out.printf("INGRESSO = $%.2f%n", bill.ticket());
		
		System.out.println();
		System.out.printf("valor a pagar = $%.2f", bill.total());
		
		sc.close();
	}

}
