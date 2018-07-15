package projetAfpa.exercices.programmesMercredi;

public class Calculatrice {
	
	/**
	 * methode qui prends 2 parametres en entree, retourne la somme de ces parametres x+y
	 */
	public int addition(int x, int y){
		return x+y;
	}
	
	/**
	 * methode qui prends 2 parametres en entree, retourne la soustraction de ces parametres x-y
	 */
	public int soustraction(int x, int y){
		return x-y;
	}
	
	
	/**
	 * methode qui prends 2 parametres en entree, retourne la multiplication de ces parametres x*y
	 */
	public int multiplication(int x, int y){
		return x*y;
	}
	
	/**
	 * methode qui prends 2 parametres en entree, retourne le plus grand nombre entre x et y
	 */
	public int max(int x, int y){
		int resultat=x;
		if( x < y ){
			resultat=y;
		}
		return resultat;	
	}
	
	/**
	 * methode qui prends 2 parametres en entree, retourne le char '-' si x est négatif et retourne '+' si x est positif
	 */
	public char signe(int x){
		char resultat = ' ';
		if(x!=0){
			if(x>0){
				resultat = '+';
			} else {
				resultat = '-';
			}
		} else {
			return 'n';
		}
		return resultat;
	}
	
	/**
	 * methode qui prends 1 parametre en entree, retourne la factorielle de ce parametre
	 */
	public long factorielle(int x){
		long resultat = 1;
		for(int i =2; i<=x; i++){
			resultat*=i;
		}
		return resultat;
	}

	/**
	 * methode qui prends 2 parametres en entree, retourne la conjonction
	 */
	public boolean conjonction(boolean boolA, boolean boolB) {
		return boolA && boolB;
	}
	
	/**
	 * methode qui prends 2 parametres en entree, retourne la disjonction
	 */
	public boolean disjonction(boolean boolA, boolean boolB) {
		return boolA || boolB;
	}

	/**
	 * methode qui prends &1parametre de type boolean, retourne sa négation 
	 */
	public boolean negation(boolean boolA) {
		return !boolA;
	}

}
