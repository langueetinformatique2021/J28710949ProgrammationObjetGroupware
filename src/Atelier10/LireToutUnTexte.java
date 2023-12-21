package Atelier10;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import Atelier5.Keyboard;

public class LireToutUnTexte {
	public static void main(String[] args) {
		String ligne;
		try {
			File f = new File(Keyboard.getString("nom du fichier à écrire :"));
			
			PrintWriter pr = new PrintWriter(f); 
			pr.print("Hello, ");
			pr.println("you..."); 
			pr.close(); 
			System.out.println("Fin d'écriture fichier");
		}
		catch (IOException e) {e.printStackTrace();}
	}
}
