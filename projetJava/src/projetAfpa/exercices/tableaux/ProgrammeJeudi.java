package projetAfpa.exercices.tableaux;

public class ProgrammeJeudi {
	
	Clavier unClavier = new Clavier();
	CalculatriceTableau uneCalculatriceTableau = new CalculatriceTableau();

	public static void main(String[] args) {
		ProgrammeJeudi programmeJeudi = new ProgrammeJeudi(); 
		
		//programmeJeudi.exercice1();
		
		//programmeJeudi.exercice2();
		
		//programmeJeudi.exercice3();
		
		programmeJeudi.exercice4();
		
	}

	public void exercice1(){
		System.out.println("*************************************");
		System.out.println("Rechercher le nombre d'element pair dans un tableau : ");
		int[] tab = unClavier.lireTableauInt(6);
		System.out.println("nombre d element pair = "+uneCalculatriceTableau.nombreDElementsPair(tab));
	}
	
	public void exercice2(){
		System.out.println("*************************************");
		System.out.println("Rechercher si un element existe ou pas : ");
		int[] tab = unClavier.lireTableauInt(6);
		System.out.println("Saisir l'element à chercher");
		int param = unClavier.lireInt();
		System.out.println("L element existe ? = "+uneCalculatriceTableau.chercheSiUnElementExiste(param, tab));
	}
	
	public void exercice3(){
		System.out.println("*************************************");
		System.out.println("Methode qui met 0 dans les cases à indice impair d'un tableau : ");
		int[] tab = unClavier.lireTableauInt(6);
		System.out.println("Le tableau = "+unClavier.contenuTableau(uneCalculatriceTableau.mettreZeroDansLesCasesAIndicesImpair(tab)));
	}
	
	public void exercice4(){
		System.out.println("*************************************");
		System.out.println("Methode qui decale les elements d un tableau d une case : ");
		int[] tab = unClavier.lireTableauInt(6);
		System.out.println("Le tableau = "+unClavier.contenuTableau(uneCalculatriceTableau.decalerLesElementsTableauDUneCase(tab)));
	}
	
}
