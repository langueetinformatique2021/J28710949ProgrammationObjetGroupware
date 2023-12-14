package Atelier6;

import java.util.Calendar;

public class GregorianCalendar {
	public class Main {
		public static void main(String[] args) {
	        GregorianCalendar calendrierActuel = new GregorianCalendar();
	
	        System.out.println("Date et heure actuelles : " + calendrierActuel.getTime());
	
	        calendrierActuel.add(Calendar.DAY_OF_MONTH, 5);
	
	        System.out.println("Date mise à jour : " + calendrierActuel.getTime());
	
	        int annee = calendrierActuel.get(Calendar.YEAR);
	        int mois = calendrierActuel.get(Calendar.MONTH) + 1;
	        int jour = calendrierActuel.get(Calendar.DAY_OF_MONTH);
	
	        System.out.println("Année : " + annee);
	        System.out.println("Mois : " + mois);
	        System.out.println("Jour : " + jour);
	    }
	}

	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int dayOfMonth, int i) {
		// TODO Auto-generated method stub
		
	}

	public int get(int year) {
		// TODO Auto-generated method stub
		return 0;
	}
}
