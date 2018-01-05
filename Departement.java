package projet;

import java.util.ArrayList;

public class Departement {

	private String nom_departement;
	private ArrayList<Enseignant> enseignant;
	private Enseignant responsable;
	private Double moyenne_dep;

	public Departement(String nom_departement, ArrayList<Enseignant> enseignant) {
		this.nom_departement = nom_departement;
		this.enseignant = enseignant;
	}

	public String getNom_departement() {
		return nom_departement;
	}

	public void setNom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}

	public ArrayList<Enseignant> getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(ArrayList<Enseignant> enseignant) {
		this.enseignant = enseignant;
	}

	public Enseignant getResponsable() {
		return responsable;
	}

	public void setResponsable(Enseignant responsable) {
		this.responsable = responsable;
	}

	public Double getMoyenne_dep() {
		return moyenne_dep;
	}

	public void setMoyenne_dep(Double moyenne_dep) {
		this.moyenne_dep = moyenne_dep;
	}

	public Double moy_Departement(ArrayList<Double> moyenne_mat) {
		double somme = 0.0;

		for (Double moy_i_mat : moyenne_mat) {
			somme = somme + moy_i_mat;
		}

		return (somme / moyenne_mat.size());
	}

}
