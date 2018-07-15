package projetAfpa.exercices.programmesMercredi;

public class CalculatriceTableau {

	/**
	 * methode qui fait la somme de tous les éléments du tableau
	 */
	public long sommeElements(int[] tab){
		long resultat = 0;
		for(int i=0; i<tab.length; i++){
			resultat+=tab[i];
		}
		return resultat;
	}

	// tableau qui contient au moins un element
	/**
	 * methode qui retourne le plus petit element du tableau
	 */
	public int plusPetitElement(int[] tab){
		int resultat = tab[0];
		for(int i=1; i<tab.length; i++){
			resultat =resultat<tab[i]?resultat:tab[i];
		}
		return resultat;
	}


	/**
	 * methode qui fait la somme de des elements de tableau de la même longueur
	 */
	public long sommeElementsDeuxTableaux(int[] tab1, int[] tab2){
		long resultat = 0;
		for(int i=0; i<tab1.length; i++){
			resultat +=tab1[i]+tab2[i];
		}
		return resultat;
	}

	/**
	 * methode qui retourne le tableau trié du plus petit au plus grand
	 */
	public int[] triAscendant(int[] tab){
		boolean tabTrie = false;
		int tailleEnCours = tab.length;
		int varTmp = 0;
		while(!tabTrie) { 
			tabTrie = true;
			for(int j=0; j<tailleEnCours-1; j++){
				if(tab[j] > tab[j+1]) {
					varTmp = tab[j];
					tab[j]=tab[j+1];
					tab[j+1]=varTmp;
					tabTrie = false;
				}
			}
			tailleEnCours--;

		}

		return tab;
	}

	/**
	 * methode qui retourne la conjonction de tous les elements du tableau
	 */
	public boolean conjonction(boolean[] tab){
		boolean resultat = tab[0];
		for(int i=1; i<tab.length && resultat; i++ ){
			resultat&=tab[i];
		}
		return resultat;
	}

	/**
	 * methode qui retourne un seul tableau contenant les éléments des deux tableaux triés du plus petit au plus grand
	 */
	public int[] triAscendantDeuxTableaux(int[] tab, int[] tab2){
		int[] resultat = new int[tab.length+tab2.length];
		int i=0;
		for(; i<tab.length; i++){
			resultat[i]=tab[i];
		}
		for(int j=0; j<tab2.length; j++){
			resultat[i+j]=tab2[i];
		}
		return triAscendant(resultat);
	}

}
