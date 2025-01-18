package pacLogement;

public class GestionPromoteur {
	public static void main(String[] args) {
		ChambreHotel ch =  new ChambreHotel(100, 80, 30);
		Maison m= new Maison(120, 90, 350, 30);
		Promoteur promoteur = new Promoteur();
		promoteur.ajouterLogement(ch);
		promoteur.ajouterLogement(m);
		boolean etat = promoteur.reserverLogement(100);
		if(etat)
			System.out.println("reservation faite");
		else
			System.out.println("reservation impossible ! ");
		
		etat = promoteur.reserverLogement(100);
		if(etat)
			System.out.println("reservation faite");
		else
			System.out.println("reservation est impossible ! ");

		promoteur.afficherPromoteur();
	}

}
