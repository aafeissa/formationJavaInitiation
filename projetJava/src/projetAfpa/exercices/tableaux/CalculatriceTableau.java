package projetAfpa.exercices.tableaux;

public class CalculatriceTableau {
	
	/**
	 * methode calcule le nombre d éléments pair d'un tableau
	 */
	public long nombreDElementsPair(int[] tab){
		long resultat = 0;
		for(int i=0; i<tab.length; i++){
			if(tab[i]%2==0){
				resultat++;
			}
		}
		return resultat;
	}
	
	/**
	 * methode teste si un element existe ou pas dans un tableau
	 */
	public boolean chercheSiUnElementExiste(int elt, int[] tab){
		boolean resultat = false;
		for(int i=0; i<tab.length && !resultat; i++){
			resultat= elt==tab[i];
		}
		return resultat;
	}
	
	/**
	 * methode qui met 0 dans les cases à indice impair d'un tableau 
	 */
	public int[] mettreZeroDansLesCasesAIndicesImpair(int[] tab){
		for(int i=0; i<tab.length; i++){
			if(i%2==1){
				tab[i]=0;
			}
		}
		return tab;
	}
	
	/**
	 * decaler les elements d un tableau d une case vers la droite 
	 */
	public int[] decalerLesElementsTableauDUneCase(int[] tab){
		int dernier = tab[tab.length-1];
		int[] tab2 = new int[6];
		for(int i=1; i<tab.length; i++){
			tab2[i]=tab[i-1];
		}
		tab2[0]=dernier;
		return tab2;
	}

}
