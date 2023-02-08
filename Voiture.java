package elmakkaoui.tp01;

public class Voiture {
	private String id;
	private String modele;
	private String marque;
	private int vitesse;
	private String couleur;
	private int puissance;
	
	public Voiture() {}
	
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
	
	
	//gettters
	public String getId() {
		return id;
	}
	
	public String GetModele() {
		return modele;
	}
	
	public String GetMarque() {
		return marque; 
	}
	
	public int GetVitesse() {
		return vitesse;
	}
	
	public String GetCouleur() {
		return couleur;
	}
	
	public int GetPuissance() {
		return puissance;
	}
	
	//setters
	public void SetId(String id) {
		this.id = id;
	}
	
	public void SetModele(String modele) {
		this.modele = modele;
	}
	
	public void SetMarque(String marque) {
		this.marque = marque; 
	}
	
	public void SetVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	//retourne une chaine de caractères contenant l’id, le modèle, la marque, vitesse, couleur, puissance.
	public String afficher() {
		return "ID : " + this.id + ". Modèle : " + this.modele + ". Marque : " + this.marque + ". Vitesse : " + this.vitesse +
				". Couleur : " + this.couleur + ". Puissance : " + this.puissance;
	}
	
	public boolean estModeleValide(String mod) {
		
		if (mod.length() <= 10) {
			return true;
		} else {
			return false;
		}
	}
	
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
		
		
		if(estModeleValide(mod)) {
			return mod;
		} else {
			return "modCar1";
		}	
	}
	
	
	
	
	
	
	

}
