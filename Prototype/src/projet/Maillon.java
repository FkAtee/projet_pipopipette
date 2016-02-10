package projet;

public class Maillon {
	public int valeur;
	public Maillon suivant;
	
	public Maillon(int s, Maillon m) {
		valeur = s;
		suivant = m;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public Maillon getSuivant() {
		return suivant;
	}
	public void setSuivant(Maillon suivant) {
		this.suivant = suivant;
	}
	
}
