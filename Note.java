package projet;

import java.util.ArrayList;

public class Note {

	private Double note_Controle;
	private Etudiant etudaint;
	private Matiere matiere;

	public Note(Double note_Controle) {
		this.note_Controle = note_Controle;
	}

	public Double getNote_Controle() {
		return note_Controle;
	}

	public void setNote_Controle(Double note_Controle) {
		this.note_Controle = note_Controle;
	}

	public Etudiant getEtudaint() {
		return etudaint;
	}

	public void setEtudaint(Etudiant etudaint) {
		this.etudaint = etudaint;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

}
