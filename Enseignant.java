package projet;

import java.util.ArrayList;
import java.util.Date;

public class Enseignant extends Personne {

	private String[] date_fonction;
	private String grade;
	private ArrayList<Matiere> matiere_enseiger = new ArrayList<>();

	public Enseignant(String nom, String prenom, String[] date_fonction, String grade, String telephone, String mail) {
		super(nom, prenom, telephone, mail);
		this.date_fonction = date_fonction;
		this.grade = grade;

	}

	public String[] getDate_fonction() {
		return date_fonction;
	}

	public void setDate_fonction(String[] date_fonction) {
		this.date_fonction = date_fonction;
	}

	public void setMatiere_enseiger(ArrayList<Matiere> matiere_enseiger) {
		this.matiere_enseiger = matiere_enseiger;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ArrayList<Matiere> getMatiere_enseiger() {
		return matiere_enseiger;
	}

	public void setMatiere_enseiger(Matiere matiere) {

		matiere_enseiger.add(matiere);
	}

}
