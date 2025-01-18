package pacLogement;

public class ChambreHotel extends Logement {

	public ChambreHotel(int code, double surface, double prixInitial) {
		super(code, surface, prixInitial);
	}

	@Override
	public double prixTotal() {
		if (hauteSaison)
			return prixInitial * 2.5 + (0.1 * surface);
		else
			return prixInitial + (0.1 * surface);
	}

	@Override
	public String toString() {
		return "ChambreHotel :" + super.toString();
	}

}
