package Atelier5;

public class carafe {
private int contenu_, capacité_;
	
	public carafe(int capacité) {
		capacité_ = capacité;
		contenu_ = 0;
	}

	public void Remplir() {
		contenu_ = capacité_;

	}

	public void Vider() {
		contenu_ = 0;

	}

	public int Contenu() {
		return contenu_;

	}

	public int Capacité() {
		return capacité_;

	}

	public void Transvaser(carafe c2) {
		if ((c2.Capacité() - c2.Contenu()) == this.Contenu()) {
			this.Vider();
			c2.Remplir();
		}

	}

}