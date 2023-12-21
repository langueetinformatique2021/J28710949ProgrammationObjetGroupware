package Atelier5;

public class Date {
    private int jour, mois, annee;

    public boolean CompareTo(Date d) {
        if (annee != d.annee) return true;
        if (mois != d.mois) return true;
        return jour != d.jour;
    }

    public void Incrementer() {

        int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (((annee % 4) == 0) && ((annee % 100 != 0) || (annee % 400 == 0))) lmois[1]++;
        jour++;
        if (jour > lmois[mois - 1]) {
            jour = 1;
            mois++;
            if (mois == 13) {
                annee++;
                mois = 1;
            }
        }
    }

    public void Afficher() {
        System.out.println(jour + " " + mois + " " + annee);
    }

    private void Lire() {
        jour = Keyboard.getInt("Entrez le jour");
        mois = Keyboard.getInt("Entrez le mois");
        annee = Keyboard.getInt("Entrez l'année");
    }

    public Date(int j, int m, int a) {
        jour = j;
        mois = m;
        annee = a;
    }

    public Date() {
        Lire();
    }

    public static void main(String[] args) {
        // Vous pouvez ajouter des tests ici si nécessaire
    }
}