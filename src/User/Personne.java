package User;

import java.util.Scanner;

public class Personne {
	String nom;
	String telephone;
	int Id;
	public Personne() {
		this.nom = null;
		this.telephone = null;
		this.Id = 0;;
	}

	/*public Personne(String nom, String telephone, int id) {
		super();
		this.nom = nom;
		this.telephone = telephone;
		this.Id = 0;;
	}*/

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", telephone=" + telephone + ", Id=" + Id + "]";
	}

	void afficher() {
		System.out.println(toString());
	}
	
}