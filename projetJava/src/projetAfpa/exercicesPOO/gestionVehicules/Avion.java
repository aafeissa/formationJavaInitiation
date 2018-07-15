/**
 * 
 */
package projetAfpa.exercicesPOO.gestionVehicules;

/**
 * @author Abdelkarim AFEISSA
 *
 */
public class Avion extends Vehicules {

	private String moteur;
	private int heuresVol;

	public Avion(String marque, int date, double prix, String moteur, int heures) {
		super(marque, date, prix);
		this.moteur = moteur;
		heuresVol = heures;
	}

	public void calculePrix(int anneActuelle) {
		double decote;
		if (moteur == "HELICES") {
			decote = 0.1 * heuresVol / 100.0;
		} else {
			decote = 0.1 * heuresVol / 1000.0;
		}

		setPrixCourant(Math.max(0.0, (1.0 - decote) * getPrixAchat()));
	}

	public void affiche() {
		System.out.println(" ---- Avion a  " + moteur + "----");
		super.affiche();
		System.out.println(heuresVol + " heures de vol.");
	}

	public String getMoteur() {
		return moteur;
	}

	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	public int getHeuresVol() {
		return heuresVol;
	}

	public void setHeuresVol(int heuresVol) {
		this.heuresVol = heuresVol;
	}
	
}
