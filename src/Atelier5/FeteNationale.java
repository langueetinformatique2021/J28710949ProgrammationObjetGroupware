package Atelier5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FeteNationale {
	
	public static void main(String[] args) {
		//Date actuelle
		LocalDate aujourdhui = LocalDate.now();
		//Date du 14 juillet 2024
		LocalDate quatorze_juillet_2024 = LocalDate.of(2024, 7, 14);
		//Calcul du nombre de jours restant 
		long joursRestant = aujourdhui.until(quatorze_juillet_2024, ChronoUnit.DAYS);
	
	System.out.println("Nombre de jours restant jusqu'au 14 juillet 2024: " + joursRestant + "jours.");
	}
			
}
