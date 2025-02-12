package User;

public class Agriculteur extends Personne{
	String CIN;
	String adresse;
	
	public Agriculteur() {
		super();
		this.nom = null;
		this.telephone = null;
		this.Id = 0;
		this.CIN = null;
		this.adresse = null;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Agriculteur [CIN=" + CIN + ", adresse=" + adresse + ", nom=" + nom + ", telephone=" + telephone
				+ ", Id=" + Id + "]";
	}
	
	void afficher() {
		System.out.println(toString());
	}
}