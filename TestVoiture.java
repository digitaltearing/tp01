package elmakkaoui.tp01;

public class TestVoiture {
	public static void main(String[] args) {
		
		
		Voiture voiture1 = new Voiture("LA120381Y", "Honda", "Rouge", 900);
		
		voiture1.SetModele(voiture1.obtenirModele("PANGP"));
		voiture1.SetVitesse(180);
		
		System.out.println(voiture1.afficher());
		System.out.println(voiture1.calculerTaxeVoiture() + " $");
		
		
		
		
	}
}
	