package pacLogement;

public abstract class Logement implements InterfaceLogement {
	protected int code;
	protected double surface, prixInitial;
	boolean reserve, hauteSaison;

	public Logement(int code, double surface, double prixInitial) {
		super();
		this.code = code;
		this.surface = surface;
		this.prixInitial = prixInitial;
		this.reserve = false;
		this.hauteSaison = false;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public double getPrixInitial() {
		return prixInitial;
	}

	public void setPrixInitial(double prixInitial) {
		this.prixInitial = prixInitial;
	}

	@Override
	public boolean isReserve() {
		return reserve;
	}

	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

	public boolean isHauteSaison() {
		return hauteSaison;
	}

	public void setHauteSaison(boolean hauteSaison) {
		this.hauteSaison = hauteSaison;
	}

	@Override
	public void reserver() {
		reserve = true;
	}

	@Override
	public String toString() {
		return "code=" + code + " surface=" + surface + " prixInitial=" + prixInitial + " reserve=" + reserve
				+ " hauteSaison=" + hauteSaison;
	}

}
