package pacLogement;

public class Maison extends Logement {
	protected double prixEnregistrement;
	protected final double TVA = 0.15;

	public Maison(int code, double surface, double prixInitial, double prixEnregistrement) {
		super(code, surface, prixInitial);
		this.prixEnregistrement = prixEnregistrement;
	}

	@Override
	public double prixTotal() {
		// TODO Auto-generated method stub
		if (hauteSaison) {
			return prixInitial * (1.5 + TVA) + (0.1 * surface) + prixEnregistrement;
		} else {
			return prixInitial * (1 + TVA) + (0.1 * surface) + prixEnregistrement;
		}
	}

	@Override
	public String toString() {
		return "Maison : " + super.toString() + " Prix d'enegistrement :" + prixEnregistrement;
	}

}
