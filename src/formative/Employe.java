package formative;

public abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	
	public Employe(String unNom, String unPrenom, int unAge) {
		this.nom= unNom;
		this.prenom= unPrenom;
		this.age= unAge;
	}

	
	abstract double calculerSalaire();
	
	public String getNom(String unNom, String unPrenom) {
		return "L'employé " + unNom +unPrenom;
	}
}
