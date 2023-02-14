/**
* Classe main qui instancier voiture1 ainsi que ces attributs
*
* @author Lyazid Cheurfa Yahia Elmakkaoui
*
*/
package elmakkaoui.tp01;

public class TestVoiture {
	public static void main(String[] args) {

		// instancier voiture1
		Voiture voiture1 = new Voiture("LA120381Y", "Honda", "Rouge", 900);
		//Verifie si le modele est valide et le set
		voiture1.SetModele(voiture1.obtenirModele("PANGP"));
		// Set valeur vitesse a 180
		voiture1.SetVitesse(180);
		
		//Affiche les details de la voiture 
		System.out.println(voiture1.afficher());
		//Calcule les taxes et print 
		System.out.println(voiture1.calculerTaxeVoiture() + " $");

	}
}
