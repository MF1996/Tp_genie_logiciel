package projet;

import java.util.ArrayList;

public class Salle {

	private String nom;
	private int capacite;
	private  ArrayList<Matiere> list_matiere = new ArrayList<>();
	
	Salle(String nom, int capacite) {
		this.nom = nom;
		this.capacite = capacite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getNom() {
		return nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public ArrayList<Matiere> getList_matiere() {
		return list_matiere;
	}

	public void setList_matiere(ArrayList<Matiere> list_matiere) {
		this.list_matiere = list_matiere;
	}


	
	
}
