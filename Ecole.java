package projet;

import java.util.ArrayList;

public class Ecole {

	private String nom_Ecole;
	private String url;
	private ArrayList<Departement> departement;

	public Ecole(String nom_Ecole, String url) {

		this.nom_Ecole = nom_Ecole;
		this.url = url;
		departement = new ArrayList<Departement>();

	}

	public String getNom_Ecole() {
		return nom_Ecole;
	}

	public void setNom_Ecole(String nom_Ecole) {
		this.nom_Ecole = nom_Ecole;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ArrayList<Departement> getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement.add(departement);
	}

	double moyenne_Ecole(ArrayList<Double> list_moy_dep) {
		double somme = 0.0;

		for (Double moy_departement : list_moy_dep) {
			somme = somme + moy_departement;
		}

		return (somme / list_moy_dep.size());
	}

}
