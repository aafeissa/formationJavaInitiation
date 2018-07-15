/**
 * 
 */
package projetAfpa.exercicesPOO.gestionVehicules;

/**
 * @author Abdelkarim AFEISSA
 */
public class Vehicules {

	//Proprietes de la classe Vehicules
	private String marque;
	private int dateAchat;
	private double prixAchat;
	private double prixCourant;
	
	//Constructeur par defaut
	public Vehicules() {}
	
	//Constructeur avec parametres
	public Vehicules(String marque, int date, double prix) {
		this.marque = marque;
		dateAchat = date;
		prixAchat = prix;
		prixCourant = prix;
	}
	
	//Methode publique affiche() qui affiche la valeur des attributs.
	public void affiche() {
        System.out.print("marque : " + marque +
                ", date d'achat : " + dateAchat +
                ", prix actuel : " + prixCourant);
        System.out.println();
    }
	
	//Methode
	public void calculePrix(int anneActuelle) {
        double decote = (anneActuelle - dateAchat) * 0.01;
        prixCourant = Math.max(0.0, (1.0 - decote) * prixAchat);
    }

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the dateAchat
	 */
	public int getDateAchat() {
		return dateAchat;
	}

	/**
	 * @param dateAchat the dateAchat to set
	 */
	public void setDateAchat(int dateAchat) {
		this.dateAchat = dateAchat;
	}

	/**
	 * @return the prixAchat
	 */
	public double getPrixAchat() {
		return prixAchat;
	}

	/**
	 * @param prixAchat the prixAchat to set
	 */
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	/**
	 * @return the prixCourant
	 */
	public double getPrixCourant() {
		return prixCourant;
	}

	/**
	 * @param prixCourant the prixCourant to set
	 */
	public void setPrixCourant(double prixCourant) {
		this.prixCourant = prixCourant;
	}
	
}
