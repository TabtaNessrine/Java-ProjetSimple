package formative;

public class Vendeur extends Employe {
	
	
	public Vendeur(String unNom, String unPrenom, int unAge, double
			salaireMensuel) {
		super(unNom, unPrenom, unAge);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculerSalaire(double salaireMensuel) {
		salaireMensuel= salaireMensuel*0.20+1000;
		return salaireMensuel;
	}

}
