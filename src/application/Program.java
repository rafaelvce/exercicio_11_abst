package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c): ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();

			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExp));
			} else if (option == 'c') {
				System.out.print("Number of employees: ");
				int numberEmp = sc.nextInt();
				list.add(new Company(name, annualIncome, numberEmp));
			}
		}

		System.out.println("\nTAXES PAID: ");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + " $ " + String.format("%.2f", tax.tax()));
		}

		double total = 0.0;
		for (TaxPayer tax : list) {
			total += tax.tax();
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", total));

	}

}
