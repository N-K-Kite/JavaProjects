package pacLogement;

public class Promoteur {
	protected String nom;
	protected Logement logements[];
	protected int nbrLogements;

	public Promoteur() {
		logements = new Logement[200];
		nbrLogements = 0;
	}

	public Promoteur(String nom, Logement[] logements, int nbrLogements) {
		super();
		this.nom = nom;
		this.logements = logements;
		this.nbrLogements = nbrLogements;
	}

	public Logement chercherLogement(int x) {
		for (int i = 0; i < nbrLogements; i++) {
			if (logements[i].getCode() == x)
				return logements[i];
		}
		return null;
	}

	public boolean ajouterLogement(Logement log) {
		Logement l = chercherLogement(log.getCode());
		if (l == null && nbrLogements < logements.length) {
			logements[nbrLogements] = log;
			nbrLogements++;
			return true;
		}
		return false;
	}

	public boolean reserverLogement(int code) {
		Logement l = chercherLogement(code);
		if (l != null && !l.isReserve()) {
			l.reserver();
			return true;
		}
		return false;
	}

	public void afficherMaisonsLibres(double prixMax) {
		for (int i = 0; i < nbrLogements; i++) {
			if (logements[i] instanceof Maison && !logements[i].isReserve() && logements[i].prixTotal() < prixMax)
				System.out.println(logements[i]);
		}
	}

	public void afficherPromoteur() {
		System.out.println("Nom :" + nom);
		for (int i = 0; i < nbrLogements; i++) {
			System.out.println(logements[i]);
		}
	}
}
