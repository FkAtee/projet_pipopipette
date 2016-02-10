package projet;

import java.util.*;

public class Test {
	
	static Random r = new Random();
	
	public static void afficher(Pile p) {
		if (p.estVide()) return;
		Maillon m = p.getSommet();
		while (m!=null) {
			int n = m.getValeur();
			System.out.print(n +" ");
			m = m.getSuivant();
		}
		System.out.println();
	}
	
	public static void afficherJeu(Pile [] tp) {
		for (int i=0; i<tp.length; i++){
			Maillon m = tp[i].getSommet();
			
			if(i==0){
				System.out.println("#-#-#-#-#-#");
			}
			if(i%2==0){
				System.out.print("|");
			}else{
				System.out.print("#");
			}
			while (m!=null) {
				int n = m.getValeur();
				System.out.print("");
				if(i%2==0){
					if(n==0){
						System.out.print("  ");
					}else{
						System.out.print(" |");
					}
				}else{
					if(n==0){
						System.out.print(" ");
					}else{
						System.out.print("-");
					}
					if(m.getSuivant()!=null){
						System.out.print("#");
					}
					
				}
				
				m = m.getSuivant();
			}
			
			if(i%2==0){
				System.out.println(" |");
			}else{
				System.out.println("#");
			}
			if(i==tp.length-1){
				System.out.println("#-#-#-#-#-#");
			}
		}
	}
	
	public static void main(String[]args) {
		Pile [] tp = new Pile[5];
		for (int i=0; i<=4; i++){
			tp[i] = new Pile();
			if(i%2==0){
				for (int j=0; j<3; j++) {
					int x = r.nextInt(2);
					tp[i].empiler(x);	
				}
			}else{
				for (int j=0; j<4; j++) {
					int x = r.nextInt(2);
					tp[i].empiler(x);	
				}
			}
		}
		for (int i=0; i<=4; i++){
			System.out.println("Pile numero "+ (i+1));
			afficher(tp[i]);
			System.out.println();
		}

		afficherJeu(tp);
	}
}
