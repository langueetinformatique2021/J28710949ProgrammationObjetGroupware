package Atelier9;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MonPremierFichierTexte2 {
	public static void main(String[] args) {
		try {
			PrintWriter pr = new PrintWriter(new File("Orphila.txt"));
			pr.println("Orphila Ouraga");
			pr.println("M1 - Langue et Informatique// 2023");
			pr.close();
			System.out.println("Ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Verif();
	}

	public static void Verif() {
		String ligne;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("Orphila.txt")));
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
