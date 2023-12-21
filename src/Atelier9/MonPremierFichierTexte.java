package Atelier9;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class MonPremierFichierTexte {
	public static void main(String[] args) {
		try {
			PrintWriter pr = new PrintWriter(new File("Orphila.txt"));
			pr.println("Orphila Ouraga");
			pr.println("M1 - Langue et Informatique// 2023");
			pr.close();
			System.out.println("Ok");
		} 
		catch (IOException e) { e.printStackTrace(); }
	} 
}
