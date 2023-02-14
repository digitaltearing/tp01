/**
* Classe Voiture qui permet de creer un object voiture avec differents attributs, de changer les attributs, d'afficher les informations d'un object voiture,
* de verifier si le modele est valide et d'obtenir le modele.
*
* @author Lyazid Cheurfa et Yahia Elmakkaoui
*
*/


package elmakkaoui.tp01;

public class Voiture {
	private String id;
	private String modele;
	private String marque;
	private int vitesse;
	private String couleur;
	private int puissance;

	public Voiture() {
	}

	public Voiture(String id, String marque, String couleur, int puissance) {
		SetId(id);
		SetMarque(marque);
		setCouleur(couleur);
		setPuissance(puissance);

	}

	public Voiture(String id, String modele, String marque, int vitesse, String couleur, int puissance) {
		this(id, marque, couleur, puissance);
		SetVitesse(vitesse);
		SetModele(modele);

	}

	// Accesseur id
	public String getId() {
		return id;
	}
	// Accesseur modele
	public String GetModele() {
		return modele;
	}
	// Accesseur marque
	public String GetMarque() {
		return marque;
	}
	// Accesseur vitesse
	public int GetVitesse() {
		return vitesse;
	}
	// Accesseur couleur
	public String GetCouleur() {
		return couleur;
	}
	// Accesseur puissance
	public int GetPuissance() {
		return puissance;
	}

	// Modificateur id
	public void SetId(String id) {
		this.id = id;
	}
	// Modificateur modele
	public void SetModele(String modele) {
		this.modele = modele;
	}
	// Modificateur marque
	public void SetMarque(String marque) {
		this.marque = marque;
	}
	// Modificateur vitesse
	public void SetVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	// Modificateur couleur
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	// Modificateur puissance
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	// retourne une chaine de caractères contenant l’id, le modèle, la marque,
	// vitesse, couleur, puissance.
	public String afficher() {
		return "ID : " + this.id + ". Modèle : " + this.modele + ". Marque : " + this.marque + ". Vitesse : "
				+ this.vitesse + ". Couleur : " + this.couleur + ". Puissance : " + this.puissance;
	}
	// Verifier si voiture.modele a plus de 10 characters sinon retourne false
	public boolean estModeleValide(String mod) {

		if (mod.length() <= 10) {
			return true;
		} else {
			return false;
		}
	}
	// calcule les taxes de voiture, depends de la puissance de la voiture 
	public int calculerTaxeVoiture() {
		int taxe;
		if (this.puissance < 500) {
			taxe = 100;
		} else if (this.puissance < 1000) {
			taxe = 200;
		} else {
			taxe = 300;
		}
		return taxe;
	}

	public String obtenirModele(String mod) {

		if (estModeleValide(mod)) {
			return mod;
		} else {
			return "modCar1";
		}
	}

}
