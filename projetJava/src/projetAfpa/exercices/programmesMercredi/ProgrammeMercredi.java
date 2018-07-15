package projetAfpa.exercices.programmesMercredi;

public class ProgrammeMercredi {


	Clavier unClavier = new Clavier();
	Calculatrice uneCalculatrice = new Calculatrice();
	CalculatriceTableau uneCalculatriceTableau = new CalculatriceTableau();

	public static void main(String[] args) {
		ProgrammeMercredi programmeMercredi = new ProgrammeMercredi();

		programmeMercredi.exercice11();


	}

	public void exercice1(){
		System.out.println("*************************************");
		System.out.println("Addition deux entier : ");
		int parametreX = unClavier.lireInt();
		int parametreY = unClavier.lireInt();
		System.out.println("la somme = "+uneCalculatrice.addition(parametreX, parametreY));
	}

	public void exercice2(){
		System.out.println("*************************************");
		System.out.println("Soustraction deux entier : ");
		int parametreX = unClavier.lireInt();
		int parametreY = unClavier.lireInt();
		System.out.println("la soustraction = "+uneCalculatrice.soustraction(parametreX, parametreY));
	}

	public void exercice3(){
		System.out.println("*************************************");
		System.out.println("Multiplication deux entier : ");
		int parametreX = unClavier.lireInt();
		int parametreY = unClavier.lireInt();
		System.out.println("la multiplication = "+uneCalculatrice.multiplication(parametreX, parametreY));
	}

	public void exercice4(){
		System.out.println("*************************************");
		System.out.println("Maximum deux entier : ");
		int parametreX = unClavier.lireInt();
		int parametreY = unClavier.lireInt();
		System.out.println("le plus grand nombre = "+uneCalculatrice.max(parametreX, parametreY));
	}

	public void exercice5(){
		System.out.println("*************************************");
		System.out.println("Signe d'un entier : ");
		int parametreX = unClavier.lireInt();
		System.out.println("le signe = "+uneCalculatrice.signe(parametreX));
	}

	public void exercice6(){
		System.out.println("*************************************");
		System.out.println("Somme tableau de 5 elements : ");
		int[] tabInt = unClavier.lireTableauInt(5);
		System.out.println("la somme = "+uneCalculatriceTableau.sommeElements(tabInt));
	}

	public void exercice7(){
		System.out.println("*************************************");
		System.out.println("Plus petit element d'un tableau de 5 elements : ");
		int[] tabInt = unClavier.lireTableauInt(5);
		System.out.println("la somme = "+uneCalculatriceTableau.sommeElements(tabInt));
	}

	public void exercice8(){
		System.out.println("*************************************");
		System.out.println("Somme de tous les élémens de 2 tableaux de 5 entiers : ");
		System.out.println("*** Premier tableau");
		int[] tabInt = unClavier.lireTableauInt(5);
		System.out.println("*** Deuxieme tableau");
		int[] tabInt2 = unClavier.lireTableauInt(5);
		System.out.println("la somme = "+uneCalculatriceTableau.sommeElementsDeuxTableaux(tabInt, tabInt2));
	}

	public void exercice9(){
		System.out.println("*************************************");
		System.out.println("Tri ascendant d'un tableau de 5 elements : ");
		int[] tabInt = unClavier.lireTableauInt(5);
		System.out.println("le tableau trié = "+unClavier.contenuTableau(uneCalculatriceTableau.triAscendant(tabInt)));
	}

	public void exercice10(){
		System.out.println("*************************************");
		System.out.println("Factorielle d'un entier : ");
		int parametreX = unClavier.lireInt();
		System.out.println("factorielle = "+uneCalculatrice.factorielle(parametreX));
	}

	public void exercice11(){
		System.out.println("*************************************");
		System.out.println("Conjonction (le and logique)");
		boolean boolA = unClavier.lireBoolean();
		boolean boolB = unClavier.lireBoolean();
		System.out.println("conjonction = "+uneCalculatrice.conjonction(boolA,boolB));
	}

	public void exercice12(){
		System.out.println("*************************************");
		System.out.println("Disjonction (le ou logique)");
		boolean boolA = unClavier.lireBoolean();
		boolean boolB = unClavier.lireBoolean();
		System.out.println("disjontion = "+uneCalculatrice.conjonction(boolA,boolB));
	}

	public void exercice13(){
		System.out.println("*************************************");
		System.out.println("Negation (le non logique)");
		boolean boolA = unClavier.lireBoolean();
		System.out.println("négation = "+uneCalculatrice.negation(boolA));
	}

	public void exercice14(){
		System.out.println("*************************************");
		System.out.println("Conjonction d'un tableau de 5 elements boolean ");
		boolean[] tabBool = unClavier.lireTableauBoolean(5);
		System.out.println("conjonction = "+uneCalculatriceTableau.conjonction(tabBool));
	}

	public void exercice15(){
		System.out.println("*************************************");
		System.out.println("Trier les élémens de 2 tableaux de 5 entiers : ");
		System.out.println("*** Premier tableau");
		int[] tabInt = unClavier.lireTableauInt(5);
		System.out.println("*** Deuxieme tableau");
		int[] tabInt2 = unClavier.lireTableauInt(5);
		System.out.println("tri des 2 tableaux = "+uneCalculatriceTableau.triAscendantDeuxTableaux(tabInt, tabInt2));
	}
}
