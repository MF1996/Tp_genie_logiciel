package projet;

import java.util.ArrayList;

public class Matiere {

	private String libelle_Matiere;
	private Double moy_matiere;
    private ArrayList<Enseignant> list_enseignant  = new ArrayList<>();
	public Matiere(String libelle_Matiere) {

		this.libelle_Matiere = libelle_Matiere;

	}

	public String getLibelle_Matiere() {
		return libelle_Matiere;
	}

	public void setLibelle_Matiere(String libelle_Matiere) {
		this.libelle_Matiere = libelle_Matiere;
	}

		
	

	

	public ArrayList<Enseignant> getList_enseignant() {
		return list_enseignant;
	}

	public void setList_enseignant(Enseignant enseignant) {
		this.list_enseignant.add(enseignant);
	}

	public Double moy_Matiere(ArrayList<Double> list_note_etud) {
		Double somme = 0.0;
		int compteur = 0;
		for (int j = 0; j < list_note_etud.size(); j++) {
			if (list_note_etud.get(j) != null) {
				somme = somme + list_note_etud.get(j);
			} else {
				compteur++;
			}
		}

		return (somme / (list_note_etud.size() - compteur));

	}

	public Double getMoy_matiere() {
		return moy_matiere;
	}

	public void setMoy_matiere(Double moy_matiere) {
		this.moy_matiere = moy_matiere;
	}

}
