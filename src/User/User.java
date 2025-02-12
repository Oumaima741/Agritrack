package User;

import java.util.Scanner;

public class User {
    private String name;
    private String gsm;
    private String cin;
    private String userName;
    private String password;
    private String adress;
    private String dateOfBirth;

    public User(String name, String gsm, String cin, String userName, String password, String adress,
            String dateOfBirth) {
        this.gsm = gsm;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.cin = cin;
        this.adress = adress;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setCIN(String cin) {
        this.cin = cin;
    }

    public String getCIN() {
        return cin;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public Agriculteur CreerCompte () {
		
		int id = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le nom de l'agriculteur :");
		String nom=sc.next();
		
		System.out.println("Veuillez saisir CIN de l'agriculteur :");
		String CIN = sc.next();
		
		System.out.println("Veuillez saisir le telephone de l'agriculteur :");
		String telephone = sc.next();
		
		System.out.println("Veuillez saisir l'adressse de l'agriculteur :");
		String adresse = sc.next();
		
		Agriculteur a = new Agriculteur();
		
		a.setNom(nom);
		a.setCIN(CIN);
		a.setAdresse(adresse);
		a.setTelephone(telephone);
		a.setId(id++);
		
		return a;
		
	}
}
    