package projet;

public class Pile {
	private Maillon sommet;
	
	public Pile() {
		sommet = new Maillon(0,null);
	}
	
	public void empiler(int s) {
		sommet = new Maillon(s,sommet);
	}
	
	public int depiler() {
		if (!estVide()){
			int s = sommet.getValeur();
			sommet = sommet.getSuivant();
			return s;
		}
		else return 0;
	}
	
	public boolean estVide() {
		return sommet == null;
	}

	public Maillon getSommet() {
		if (!estVide()) return sommet;
		else return null;
	}
	
}
