/**
 * 
 */
package projetAfpa.exercicesPOO.gestionVehicules;

/**
 * @author Abdelkarim AFEISSA
 *
 */
public class Voiture extends Vehicules {
	
	//Variables d instance
	private double cylindree;
	private int nbPortes;
	private double puissance;
	private double kilometrage;

	//Constructeur avec parametre
	public Voiture(String marque, int date, double prix,
			double cylindree, int portes, double cv, double km) {
		//Appel du constructeur de la classe mere
		super(marque, date, prix);
		this.cylindree = cylindree;
		nbPortes = portes;
		puissance = cv;
		kilometrage = km;
	}

	public void calculePrix(int anneActuelle) {
	  double decote = (anneActuelle - getDateAchat()) * .02;
		// On force le type en int de maniere a  arrondir le resultat
		decote += 0.05 * (int)(kilometrage / 10000);
		if ((getMarque() == "Fiat") || (getMarque() == "Renault")) {
			decote += 0.1;
		} else if ((getMarque() == "Ferrari") || (getMarque() == "Porsche")) {
			decote -= 0.2;
		}

		setPrixCourant(Math.max(0.0, (1.0 - decote) * getPrixAchat()));
	}

	public void affiche() {
		System.out.println(" ---- Voiture ----");
		super.affiche();
		System.out.println(cylindree + " litres, "
				+ nbPortes + " portes, "
				+ puissance + " CV, "
				+ kilometrage + " km.");
	}

	/**
	 * @return the cylindree
	 */
	public double getCylindree() {
		return cylindree;
	}

	/**
	 * @param cylindree the cylindree to set
	 */
	public void setCylindree(double cylindree) {
		this.cylindree = cylindree;
	}

	/**
	 * @return the nbPortes
	 */
	public int getNbPortes() {
		return nbPortes;
	}

	/**
	 * @param nbPortes the nbPortes to set
	 */
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	/**
	 * @return the puissance
	 */
	public double getPuissance() {
		return puissance;
	}

	/**
	 * @param puissance the puissance to set
	 */
	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}

	/**
	 * @return the kilometrage
	 */
	public double getKilometrage() {
		return kilometrage;
	}

	/**
	 * @param kilometrage the kilometrage to set
	 */
	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}
	
	
}
