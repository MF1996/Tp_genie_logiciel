package projet;

import java.util.ArrayList;

public class Etudiant extends Personne {

	private int N_etudiant;
	private int annee_ent;
	private Double moyenne_generale;
    
	
	public Etudiant(int N_etudiant, String nom, String prenom, int annee_ent, String telephone, String mail) {
		super(nom, prenom, telephone, mail);
		this.N_etudiant = N_etudiant;
		this.annee_ent = annee_ent;
	}

	public int getAnnee_ent() {
		return annee_ent;
	}

	public void setAnnee_ent(int annee_ent) {
		this.annee_ent = annee_ent;
	}

	public int getN_etudiant() {
		return N_etudiant;
	}

	public void setN_etudiant(int n_etudiant) {
		N_etudiant = n_etudiant;
	}
	
	public Double getMoyenne_generale() {
		return moyenne_generale;
	}

	public void setMoyenne_generale(Double moyenne_generale) {
		this.moyenne_generale = moyenne_generale;
	}


	
		Double moy_Etudiant(ArrayList<Note> list_note) {
		Double somme = 0.0;
		int compteur = 0;
		for (Note note : list_note) {
			if (note.getNote_Controle() != null) {
				somme = somme + note.getNote_Controle();
			} else {
				compteur++;
			}
		}

		if (compteur == list_note.size()) {
			return null;
		} else {
			return (somme / (list_note.size() - compteur));
		}
	}


	
}
