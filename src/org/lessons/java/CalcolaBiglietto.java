package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		//Inserisci la tua età
		System.out.print("Inserisci la tua età: ");
		String strAge = in.nextLine();
		int intAge = Integer.valueOf(strAge);
		System.out.println(intAge);
		
		// Quanti kilometri vuoi percorrere
		System.out.print("Inserisci i kilometri che vuoi percorrere: ");
		String strKm = in.nextLine();
		int intKm = Integer.valueOf(strKm);
		System.out.println(intKm + "Km");
		
		//Calcolo il prezzo per la tratta
		float kmPrice = 0.21F;
		float price = intKm * kmPrice;
		System.out.printf("%.2f" ,price);
		System.out.print("€\n");
		
		//Calcolo lo sconto
		float newPrice = 0;
		if(intAge < 18) {
			
			newPrice = price -(price * 0.20F);
		}
		else if (intAge > 65) {
			newPrice = price -(price * 0.40F);
			
		}
		System.out.print("Prezzo Scontato: ");
		System.out.printf("%.2f" ,newPrice);
		System.out.print("€");
		in.close();
	}
}
												