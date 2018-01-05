package projet;

// A  04/12/2017

// rapport 11 ou 18

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.jws.Oneway;

public class Test {

	// Afficher Menu Interation
	public void affiche_Menu_Interaction() {

		System.out.println("\t______________________________________");
		System.out.println("\t|                                      |");
		System.out.println("\t|    BIENVENUE SYSTEME GESTION ECOLE   |");
		System.out.println("\t|______________________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   1    |  AFFICHE ECOLE              |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   2    |  DEPARTEMENT ECOLE          |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   3    |  ENSEIGNANT                 |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   4    |  ETUDIANT                   |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   5    |  MATIERE                    |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   6    |  SALLE                      |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\t|        |                             |");
		System.out.println("\t|   7    |  QUITTER                    |");
		System.out.println("\t|________|_____________________________|");
		System.out.println("\n____________________________________________");
		System.out.print("\n SAISSSIER NUMERO DE VOTRE CHOIX :  ");

	}

	public void afficher_serivce() {
		System.out.println("\n\n \n\n");
		System.out.println("		************BINEVENE A ECOLE IGMO **************");
		System.out.println("\n");
		System.out.println("		 ___________________________________________");
		System.out.println("		|      |                                    |");
		System.out.println("		|  N°  |           SEVICE                   | ");
		System.out.println("		|______|____________________________________|");
		System.out.println("		|      |                                    |");
		System.out.println("		|  1   |   AFFICHER DEPARTEMENT             |");
		System.out.println("		|______|____________________________________|");
		System.out.println("		|      |                                    |");
		System.out.println("		|  2   |   AFFICHER CHEF DEPARTEMENT        |");
		System.out.println("		|______|____________________________________|");
		System.out.println("		|      |                                    |");
		System.out.println("		|  3   |   AFFICHE MOYENNE NOTE DEPARTEMENT |");
		System.out.println("		|______|____________________________________|");
		System.out.println("		|      |                                    |");
		System.out.println("		|  4   |   REVENIR MENU PRINCIPAL           |");
		System.out.println("		|______|____________________________________|");
		System.out.println("\n__________________________________________");
		System.out.print("\n NUMERO DE VOTRE CHOIX  :  ");

	}

	public void affichage_dep(Ecole univ_oran, int i) {

		i = 1;
		System.out.println("\n\n \n\n");
		System.out.println("\n\n \n\n");
		System.out.println("\n\n \n\n");
		System.out.println("	**************** DEPATEMENT ECOLE ***************");
		System.out.println("		    _________________________");
		System.out.println("		   |     |                   |");
		System.out.println("		   |  N° |  DEPARTEMENT      |");
		System.out.println("		   |_____|___________________|");
		for (Departement departement : univ_oran.getDepartement()) {
			System.out.println("		   |     |                   |");
			System.out.println("		   |  " + i + "  |    " + departement.getNom_departement() + "   |");
			System.out.println("		   |_____|___________________|");

			i++;
		}

	}

	public void afficher_enseigant() {
		System.out.println("\n \n \n \n \n \n");
		System.out.println("	      ************************ENSEIGNANT**************************");
		System.out.println("\n");
		System.out.println("		_______________________________________________________");
		System.out.println("		|        |                                             |");
		System.out.println("		|   N°   |          MENU  ENSEIGNANT                   | ");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   1    |         AFFICHER ENSEIGANT(GRADE)           |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   2    |         AFFICHER COUR DISPENSE              |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   3    |         DATE FONCTION (ACIENT AU RECENT )   |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   4    |         AFFICHE FICHE SIGNALITIQUE          |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   5    |         REVENIR MENU PRINCIPAL              |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("\n_______________________________");
		System.out.print("\n \n N°  :  ");

	}

	public void afficher_menu_etudiant() {

		System.out.println("\n \n");
		System.out.println("\n \n");

		System.out.println("		  **********************ETUDIANT**********************");
		System.out.println("\n");
		System.out.println("		_______________________________________________________");
		System.out.println("		|        |                                             |");
		System.out.println("		|   N°   |          MENU  ETUDIANT                     | ");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   1    |         AFFICHE FICHE SIGNALITIQUE          |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   2    |         CLASSEMENT ETUDIANT                 |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   3    |         MOYENNE ETUDIANT                    |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   4    |         MATIERE SANS NOTE                   |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   5    |         AFFICHER NOTE ETUDIANT              |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   6    |         REVENIRE A MENU                     |");
		System.out.println("		|________|_____________________________________________|");

		System.out.println("_______________________________");
		System.out.print("\n N°  :  ");

	}

	public void menu_matiere() {

		System.out.println("			*************** MATIERE ****************");
		System.out.println("\n");
		System.out.println("		_______________________________________________________");
		System.out.println("		|        |                                             |");
		System.out.println("		|   N°   |          MENU  MATIERE	               |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   1    |         AFFICHE  MATIERE                    |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   2    |         MOYENNE MATIERE                     |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   3    |         MENU PRINCIPAL                      |");
		System.out.println("		|________|_____________________________________________|");

		System.out.println("\n ");
		System.out.println("_________________________");
		System.out.print(" N  :  ");
	}

	public void menu_salle() {
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");

		System.out.println("			*************** SALLE ****************");
		System.out.println("\n");
		System.out.println("		_______________________________________________________");
		System.out.println("		|        |                                             |");
		System.out.println("		|   N°   |          MENU  SALLE  	               | ");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   1    |         AFFICHE  SALLE                      |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   2    |         CAPACITER SALLE                     |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   3    |         RESERVATION SALLE                   |");
		System.out.println("		|________|_____________________________________________|");
		System.out.println("		|        |                                             |");
		System.out.println("		|   4    |         MENU PRINCIPAL                      |");
		System.out.println("		|________|_____________________________________________|");

		System.out.println("\n ");
		System.out.println("_________________________");
		System.out.print(" N  :  ");
	}

	public void afficher_msg_err() {

		System.out.println("\n VERIFIER CE QUE VOUS AVEZ SAISIE !");
	}

	public void fiche_signalitique(Enseignant enseigannt) {
		enseigannt.impr_Fiche_Signalitique();
	}

	// afficher grade

	void affich_Eng_grade(ArrayList<Enseignant> list_enseigant, String grade) {
		for (Enseignant enseignant : list_enseigant) {
			if (enseignant.getGrade().equals(grade)) {
				enseignant.impr_Fiche_Signalitique();
			}
		}

	}

	// affciher plus encient au plus recent
	void affich_enseignat_date_prise_fontion(Departement dep) {

		
		for (int i = 0; i < dep.getEnseignant().size(); i++) {
			System.out.println("\n année :" + dep.getEnseignant().get(i).getDate_fonction()[2]);
		}
		
		ArrayList<Enseignant>list_eng = new ArrayList<>();
		for (int i = 0; i < dep.getEnseignant().size(); i++) {
			list_eng.add(dep.getEnseignant().get(i));
		}

		for (Enseignant enseignant : list_eng) {
			System.out.println(enseignant.getNom());
		}
		
		ArrayList<Enseignant> enseignant_trie = new ArrayList<>();
		int min = 0;
		int i = 0;

		while (!list_eng.isEmpty()) {
			min = i;
			for (int j = 0; j < list_eng.size(); j++) {
				if (Integer.valueOf(list_eng.get(min).getDate_fonction()[2]) > Integer
						.valueOf(list_eng.get(j).getDate_fonction()[2])) {

					min = j;
				
				} else {

					if (list_eng.get(min).getDate_fonction()[2].equals(list_eng.get(j).getDate_fonction()[2])) {
						if (Integer.valueOf(list_eng.get(min).getDate_fonction()[1]) > Integer
								.valueOf(list_eng.get(j).getDate_fonction()[1])) {

							min = j;
				
						} else {
							if (list_eng.get(min).getDate_fonction()[1].equals(list_eng.get(j).getDate_fonction()[1])) {
								if (Integer.valueOf(list_eng.get(min).getDate_fonction()[0]) > Integer
										.valueOf(list_eng.get(j).getDate_fonction()[0])) {

									min = j;

								}
							}
						}

					}
				}
			}
			enseignant_trie.add(list_eng.get(min));
			list_eng.remove(min);

		}

		System.out.println("\n \n \n \n");
		System.out.println("______________________________________________________________________\n");
		System.out.println("            Affichage Enseignant Selon date fonction ");
		System.out.println("______________________________________________________________________\n");
		for (int m = 0; m < enseignant_trie.size(); m++) {
			System.out.println((m + 1) + ")\t Enseignant  :" + enseignant_trie.get(m).getNom() + "\t  Date fonciton "
					+ enseignant_trie.get(m).getDate_fonction()[0] + "/" + enseignant_trie.get(m).getDate_fonction()[1]
					+ "/" + enseignant_trie.get(m).getDate_fonction()[2]);
			System.out.println();
		}
		System.out.println("______________________________________________________________________");

	}

	void tri_capaciter_salle(ArrayList<Salle> list_salle) {

		for (int i = 0; i < list_salle.size(); i++) {
			for (int j = 0; j < list_salle.size(); j++) {
				if (list_salle.get(i).getCapacite() < list_salle.get(j).getCapacite()) {
					list_salle.add(i, list_salle.get(j));
					list_salle.add((j + 1), list_salle.get(i + 1));
					list_salle.remove(i + 1);
					list_salle.remove(j + 1);
				}
			}
		}
	}

	void affiche_etudiant_moyenne(Etudiant etudiant, ArrayList<Note> list_note, Double moyenne_generale) {

		System.out.println("Etudiant  :");
		System.out.println("____________________________\n");
		System.out.println("Nom :" + etudiant.getNom());
		System.out.println("\n");
		System.out.println("Prenom :" + etudiant.getPrenom());
		System.out.println("\n");
		System.out.println("Matiere     |        Note ");
		for (Note note : list_note) {
			System.out.println("\t" + note.getMatiere());
			System.out.println("\t" + note.getNote_Controle());
		}
		System.out.println("Moyenne Generale : " + moyenne_generale);

	}

	void affiche_classement_etudiant(ArrayList<Etudiant> list_etudiant) {

		Collections.sort(list_etudiant, new Comparator<Etudiant>() {
			public int compare(Etudiant e1, Etudiant e2) {
				return e1.getMoyenne_generale().compareTo(e2.getMoyenne_generale());
			}
		});

		Collections.reverse(list_etudiant);
		System.out.println();
		System.out.println(" 	 N°       Etudiant               Moyenne General");
		System.out.println();
		for (int i = 0; i < list_etudiant.size(); i++) {
			System.out.print(" 	 " + (i + 1) + "         " + list_etudiant.get(i).getNom());
			for (int k = 0; k < (21 - (list_etudiant.get(i).getNom().length() - 1)); k++) {
				System.out.print(" ");
				if (k == (20 - (list_etudiant.get(i).getNom().length() - 1))) {
					System.out.print(list_etudiant.get(i).getMoyenne_generale());
					System.out.println("\n");
				}
			}
		}
		System.out.println("\n\n\n");
	}

	public void afficher_moy_matiere(Matiere matiere) {

		System.out.println("     Matiere            |          Moyenne");
		System.out.println(matiere.getLibelle_Matiere() + " " + matiere.getMoy_matiere());

	}

	public void afficher_etu_pas_note(Etudiant etudiant, ArrayList<Note> list_note) {
		System.out.println("	Mateier ou Etudiant 	" + etudiant.getNom() + "	na pas de note sont :");

		for (int i = 0; i < list_note.size(); i++) {
			if (list_note.get(i).getNote_Controle() == null) {
				System.out.println();
				System.out.println("\t\t" + "  " + list_note.get(i).getMatiere().getLibelle_Matiere());
			}
		}

	}

	public void afficher_note_etudiant(Etudiant etudiant, ArrayList<Note> list_note) {
		System.out.println("\t ________________________________________________");
		System.out.println("\t|                                                |");
		System.out.println("\t|\t     Matiere                   Note      | ");
		System.out.println("\t|________________________________________________|");
		System.out.println("\t|                                                |");
		for (Note note : list_note) {
			if (note.getNote_Controle() != null) {
				System.out.print("\t|\t" + note.getMatiere().getLibelle_Matiere());
				for (int i = 0; i < (34 - (note.getMatiere().getLibelle_Matiere().length() + 3)); i++) {
					System.out.print(" ");
					if (i == (33 - (note.getMatiere().getLibelle_Matiere().length() + 3))) {
						System.out.print("" + note.getNote_Controle() + "     |\n");
					}
				}
				System.out.println("\t|                                                |");

			}
		}
		System.out.println("\t|________________________________________________|");
		System.out.println("\t|                                                |");
		System.out.println("\t|\tMoyenne generale : " + etudiant.getMoyenne_generale() + "    |");
		System.out.println("\t|________________________________________________|");
		System.out.println("\n");
		System.out.println("\n");
	}

	ArrayList<Enseignant> file_attente = new ArrayList<>();

	public void Reserver_salle(Enseignant enseignant) {

		boolean not_exist = true;
		for (int i = 0; i < file_attente.size(); i++) {
			if (enseignant.getMail().equals(file_attente.get(i).getMail())) {
				not_exist = false;
			} else {
				not_exist = true;
			}
		}
		if (file_attente.size() < 5 && not_exist == true) {
			file_attente.add(enseignant);
			System.out.println("SUCCES \n\n");
		} else {
			System.out.println("FILE ATTENTE COMPLET");
		}

	}

	public void libere_salle(Enseignant enseignant) {
		int indice = 0;
		if (!file_attente.isEmpty()) {
			while (!file_attente.get(indice).getNom().equals(enseignant.getNom())) {
				indice++;
			}
			file_attente.remove(indice);
		} else {
			System.out.println("FILE ATTENTE EST VIDE");
		}
	}

	@SuppressWarnings({ "static-access", "deprecation" })
	public static void main(String[] args) {

		boolean reponse = true;

		Scanner lire = new Scanner(System.in);

		Test test = new Test();

		String grade[] = new String[6];

		grade[0] = "Professeur";
		grade[1] = "Maitre conference A";
		grade[2] = "MAitre conference B";
		grade[3] = "Maitre Assistant";
		grade[4] = "Assistant";
		grade[5] = "Charger Cour";

		/*----------------------------------Initialisation Ecole Departemet  matiere  salle -----------------------*/

		Ecole univ_oran = new Ecole("IGMO", "http://www.univ_oran1.dz"); // universite oran 1

		/* Defenie enseignenat departement informatique */

		String date_fonction_haffaf[] = new String[3];

		date_fonction_haffaf[0] = "05"; // jour
		date_fonction_haffaf[1] = "05";
		date_fonction_haffaf[2] = "1985";

		Enseignant haffaf = new Enseignant("Haffaf", "Hafid", date_fonction_haffaf, grade[0], "+213550043725",
				"Haffaf_hafid@yahoo.fr");

		String date_fonction_mohamed[] = new String[3];
		date_fonction_mohamed[0] = "05"; // jour
		date_fonction_mohamed[1] = "01";
		date_fonction_mohamed[2] = "1988";

		Enseignant mohamed = new Enseignant("mohamed", "Hafid", date_fonction_mohamed, grade[0], "+213550043725",
				"mohamed_hafid@yahoo.fr");

		String date_fonction_amine[] = new String[3];
		date_fonction_amine[0] = "05"; // jour
		date_fonction_amine[1] = "01";
		date_fonction_amine[2] = "2017";
	

		Enseignant amine = new Enseignant("amine", "Hafid", date_fonction_amine, grade[3], "+213550043725",
				"amine_hafid@yahoo.fr");

		
		String date_fonction_ghomari[] = new String[3];

		date_fonction_ghomari[0] = "05"; // jour
		date_fonction_ghomari[1] = "07";
		date_fonction_ghomari[2] = "1986";

		Enseignant ghomari = new Enseignant("Ghomari", "Abdelghani", date_fonction_ghomari, grade[1], "+213555543725",
				"Ghomari@univ_oran.dz");

		String date_fonction_abdi[] = new String[3];

		date_fonction_abdi[0] = "05"; // jour
		date_fonction_abdi[1] = "04";
		date_fonction_abdi[2] = "2007";

		Enseignant abdi = new Enseignant("abdi", "mustapha", date_fonction_abdi, grade[2], "+213555543725",
				"abdii@univ_oran.dz");

		String date_fonction_bousmaha[] = new String[3];

		date_fonction_bousmaha[0] = "09"; // jour
		date_fonction_bousmaha[1] = "03";
		date_fonction_bousmaha[2] = "1988";

		Enseignant bousmaha = new Enseignant("Bousmaha", "Kheira Zineb", date_fonction_bousmaha, grade[3],
				"213770043700", "Bousmaha@univ_oran.dz");

		String date_fonction_dahane[] = new String[3];

		date_fonction_dahane[0] = "12"; // jour
		date_fonction_dahane[1] = "12";
		date_fonction_dahane[2] = "1900";

		Enseignant dahane = new Enseignant("DAHANE", "Miloud", date_fonction_dahane, grade[5], "+213550043700",
				"Miloud@univ_oran.dz");

		/* Definie matiere */

		Matiere systeme_exploitation = new Matiere("Systeme Exploitation"); // Martiere Systeme exploitation
		Matiere systeme_information = new Matiere("Systeme Information"); // Matiere Systeme information
		Matiere genie_logiciel = new Matiere("Genie Logiciel"); // Matire genie logiciel
		Matiere prolog = new Matiere("Prolog"); // Matiere prolog
		Matiere compilation = new Matiere("Compilation"); // Matiere compilation

		/* Defenie salle ou se passe les matiere */
		Salle info1 = new Salle("info1", 70);
		Salle info2 = new Salle("info2", 850);
		Salle info3 = new Salle("info3", 100);
		Salle info4 = new Salle("info4", 775);
		Salle info5 = new Salle("info5", 800);

		ArrayList<Salle> list_salle_info = new ArrayList<>();
		
		list_salle_info.add(info2);
		list_salle_info.add(info5);
		list_salle_info.add(info1);
		list_salle_info.add(info3);
		list_salle_info.add(info4);
		// liste matiere

		ArrayList<Matiere> list_matiere_info = new ArrayList<>();
		list_matiere_info.add(systeme_exploitation);
		list_matiere_info.add(systeme_information);
		list_matiere_info.add(genie_logiciel);
		list_matiere_info.add(prolog);
		list_matiere_info.add(compilation);

		// init pour chaque matiere ou se passe cour sachant que la salle ou se pas cour
		// et unique

		info1.setList_matiere(list_matiere_info);
		;

		// affeceter chaque enseignat 1 ou plusieure matière à enseigner

		haffaf.setMatiere_enseiger(prolog);
		prolog.setList_enseignant(haffaf);

		abdi.setMatiere_enseiger(genie_logiciel);
		abdi.setMatiere_enseiger(systeme_exploitation);

		genie_logiciel.setList_enseignant(abdi);
		systeme_exploitation.setList_enseignant(abdi);

		ghomari.setMatiere_enseiger(systeme_information);
		ghomari.setMatiere_enseiger(compilation);
		ghomari.setMatiere_enseiger(systeme_exploitation);

		systeme_information.setList_enseignant(ghomari);
		compilation.setList_enseignant(ghomari);
		systeme_exploitation.setList_enseignant(ghomari);

		bousmaha.setMatiere_enseiger(genie_logiciel);
		bousmaha.setMatiere_enseiger(compilation);
		bousmaha.setMatiere_enseiger(prolog);
		bousmaha.setMatiere_enseiger(systeme_information);

		systeme_information.setList_enseignant(bousmaha);
		compilation.setList_enseignant(bousmaha);
		systeme_exploitation.setList_enseignant(bousmaha);
		prolog.setList_enseignant(bousmaha);

		dahane.setMatiere_enseiger(systeme_exploitation);
		dahane.setMatiere_enseiger(systeme_information);
		dahane.setMatiere_enseiger(prolog);
		dahane.setMatiere_enseiger(genie_logiciel);
		dahane.setMatiere_enseiger(compilation);

		systeme_information.setList_enseignant(dahane);
		compilation.setList_enseignant(dahane);
		systeme_exploitation.setList_enseignant(dahane);
		prolog.setList_enseignant(dahane);
		genie_logiciel.setList_enseignant(dahane);

		// enregsiter enseignat dans une liste

		ArrayList<Enseignant> list_enseignant_info = new ArrayList<>();


		list_enseignant_info.add(ghomari);
		list_enseignant_info.add(bousmaha);
		list_enseignant_info.add(dahane);
		list_enseignant_info.add(haffaf);
		list_enseignant_info.add(abdi);
		list_enseignant_info.add(mohamed);
		list_enseignant_info.add(amine);
		
		// definie departement nom informatique et avec list enseigannt info
		Departement informatique = new Departement("informatique", list_enseignant_info);

		// init responsable du departement
		informatique.setResponsable(haffaf);

		/* Defnie enseigant departement mathematique */

		String date_fonction_timimoun[] = new String[3];

		date_fonction_timimoun[0] = "05"; // jour
		date_fonction_timimoun[1] = "04";
		date_fonction_timimoun[2] = "1909";

		Enseignant timimoun = new Enseignant("chahinaze", "timimoum", date_fonction_timimoun, grade[4], "+213550003725",
				"Timimoum@yahoo.fr");

		String date_fonction_sansawi[] = new String[3];

		date_fonction_sansawi[0] = "05"; // jour
		date_fonction_sansawi[1] = "04";
		date_fonction_sansawi[2] = "1978";

		Enseignant sansawi = new Enseignant("sansawi", "auncun", date_fonction_sansawi, grade[1], "+213555543725",
				"Sansawi@univ_oran.dz");

		String date_fonction_benaicha[] = new String[3];

		date_fonction_benaicha[0] = "05"; // jour
		date_fonction_benaicha[1] = "01";
		date_fonction_benaicha[2] = "1978";

		Enseignant benaicha = new Enseignant("Benaicha", "auncun", date_fonction_benaicha, grade[2], "+213775543725",
				"benaicha@univ_oran.dz");

		String date_fonction[] = new String[3];

		date_fonction[0] = "19"; // jour
		date_fonction[1] = "04";
		date_fonction[2] = "1909";

		Enseignant benaissa = new Enseignant("Benaissa", "auncun", date_fonction, grade[3], "213551143700",
				"Benaissa@univ_oran.dz");

		String date_fonction_mortad[] = new String[3];

		date_fonction_mortad[0] = "20"; // jour
		date_fonction_mortad[1] = "04";
		date_fonction_mortad[2] = "1900";

		Enseignant mortad = new Enseignant("Mortad", "ancun", date_fonction_mortad, grade[0], "+213550043700",
				"Mortad@univ_oran.dz");

		/* Definie matiere */

		Matiere analyse1 = new Matiere("analyse 1");
		Matiere algebre = new Matiere("Algebre");
		Matiere probabilite = new Matiere("Probabilite");
		Matiere histoire_math = new Matiere("Hist Math");
		Matiere analyse2 = new Matiere("Analyse 2");

		/* Defenie salle ou se passe les matiere */
		Salle math1 = new Salle("math1", 50);
		Salle math2 = new Salle("math2", 150);
		Salle math3 = new Salle("math3", 120);
		Salle math4 = new Salle("math4", 400);
		Salle math5 = new Salle("math5", 405);

		ArrayList<Salle> list_salle_math = new ArrayList<>();

		list_salle_math.add(math1);
		list_salle_math.add(math4);
		list_salle_math.add(math2);
		list_salle_math.add(math3);		
		list_salle_math.add(math5);


		ArrayList<Matiere> list_matiere_math = new ArrayList<>(); // liste matiere
		list_matiere_math.add(analyse1);
		list_matiere_math.add(algebre);
		list_matiere_math.add(probabilite);
		list_matiere_math.add(histoire_math);
		list_matiere_math.add(analyse2);

		// definire ou se passe tout les cours concerne departement mathematique

		math1.setList_matiere(list_matiere_math);
		// Affecter chaque enseignant une matiere ou plusierure à enseigner

		timimoun.setMatiere_enseiger(analyse1);
		analyse1.setList_enseignant(timimoun);

		benaicha.setMatiere_enseiger(algebre);
		benaicha.setMatiere_enseiger(analyse1);

		algebre.setList_enseignant(benaicha);
		analyse1.setList_enseignant(benaicha);

		benaissa.setMatiere_enseiger(analyse1);
		benaissa.setMatiere_enseiger(algebre);
		benaissa.setMatiere_enseiger(probabilite);

		analyse1.setList_enseignant(benaissa);
		algebre.setList_enseignant(benaissa);
		probabilite.setList_enseignant(benaissa);

		sansawi.setMatiere_enseiger(analyse1);
		sansawi.setMatiere_enseiger(analyse2);
		sansawi.setMatiere_enseiger(probabilite);
		sansawi.setMatiere_enseiger(algebre);

		analyse1.setList_enseignant(sansawi);
		analyse2.setList_enseignant(sansawi);
		algebre.setList_enseignant(sansawi);
		probabilite.setList_enseignant(sansawi);
		algebre.setList_enseignant(sansawi);

		mortad.setMatiere_enseiger(analyse1);
		mortad.setMatiere_enseiger(analyse2);
		mortad.setMatiere_enseiger(algebre);
		mortad.setMatiere_enseiger(probabilite);
		mortad.setMatiere_enseiger(histoire_math);

		analyse1.setList_enseignant(mortad);
		analyse2.setList_enseignant(mortad);
		algebre.setList_enseignant(mortad);
		probabilite.setList_enseignant(mortad);
		algebre.setList_enseignant(mortad);
		histoire_math.setList_enseignant(mortad);

		// Mais tous ensiegnant math dans une list

		ArrayList<Enseignant> list_enseignant_math = new ArrayList<>();
		list_enseignant_math.add(benaissa);
		list_enseignant_math.add(sansawi);
		list_enseignant_math.add(mortad);
		list_enseignant_math.add(timimoun);
		list_enseignant_math.add(benaicha);
		
		
		// defnie un departement avec ces enseignant qui sont donner comme une liste
		// eneignant0
		Departement mathematique = new Departement("Mathematique", list_enseignant_math);

		mathematique.setResponsable(mortad);

		univ_oran.setDepartement(informatique);
		univ_oran.setDepartement(mathematique);

		/*----------Initialition etudiant note chaque etudiant----------------*/

		// ETUDIANT INFORMATIQUE

		Etudiant yassine = new Etudiant(1, "Yahiaoui", "Yassine", 2015, "065489651", "yassine@gmail.com");
		Etudiant mahfoud = new Etudiant(2, "FEHIM", "Mahfoud", 2015, "0698594321", "igmo199@gmail.com");

		ArrayList<Etudiant> list_etu_info = new ArrayList<>();
		list_etu_info.add(yassine);
		list_etu_info.add(mahfoud);

		// ETUDIANT MATHEMATIQUE

		Etudiant houari = new Etudiant(6, "benamar", "houari", 2015, "065489651", "houari@gmail.com");
		Etudiant moundir = new Etudiant(7, "auncun", "moundir", 2015, "0698594321", "moundir@gmail.com");

		ArrayList<Etudiant> list_etu_math = new ArrayList<>();
		list_etu_math.add(houari);
		list_etu_math.add(moundir);

		// Note yassine(etudiant departement informatique

		Note note_yassine_se = new Note(17.0);
		note_yassine_se.setEtudaint(yassine);
		note_yassine_se.setMatiere(systeme_exploitation);

		Note note_yassine_si = new Note(15.5);
		note_yassine_si.setEtudaint(yassine);
		note_yassine_si.setMatiere(systeme_information);

		Note note_yassine_prolog = new Note(14.5);
		note_yassine_prolog.setEtudaint(yassine);
		note_yassine_prolog.setMatiere(prolog);

		Note note_yassine_gl = new Note(null);
		note_yassine_gl.setEtudaint(yassine);
		note_yassine_gl.setMatiere(genie_logiciel);

		Note note_yassine_comp = new Note(null);
		note_yassine_comp.setEtudaint(yassine);
		note_yassine_comp.setMatiere(compilation);

		// grouper tout les notes dans liste à fin de introduire comme paramètre pour
		// calculer moy etudiant
		ArrayList<Note> list_note_yassine = new ArrayList<>();
		list_note_yassine.add(note_yassine_se);
		list_note_yassine.add(note_yassine_si);
		list_note_yassine.add(note_yassine_prolog);
		list_note_yassine.add(note_yassine_gl);
		list_note_yassine.add(note_yassine_comp);

		// Mahfoud Note : Etudiant Informatique

		Note note_mahfoud_se = new Note(null);
		note_mahfoud_se.setEtudaint(mahfoud);
		note_mahfoud_se.setMatiere(systeme_exploitation);

		Note note_mahfoud_si = new Note(null);
		note_mahfoud_si.setEtudaint(mahfoud);
		note_mahfoud_si.setMatiere(systeme_information);

		Note note_mahfoud_prolog = new Note(18.0);
		note_mahfoud_prolog.setEtudaint(mahfoud);
		note_mahfoud_prolog.setMatiere(prolog);

		Note note_mahfoud_gl = new Note(14.75);
		note_mahfoud_gl.setEtudaint(mahfoud);
		note_mahfoud_gl.setMatiere(genie_logiciel);

		Note note_mahfoud_comp = new Note(15.0);
		note_mahfoud_comp.setEtudaint(mahfoud);
		note_mahfoud_comp.setMatiere(compilation);

		// Meme cas comme yassine

		ArrayList<Note> list_note_mahfoud = new ArrayList<>();
		list_note_mahfoud.add(note_mahfoud_se);
		list_note_mahfoud.add(note_mahfoud_si);
		list_note_mahfoud.add(note_mahfoud_gl);
		list_note_mahfoud.add(note_mahfoud_prolog);
		list_note_mahfoud.add(note_mahfoud_comp);

		// HOUARi note : Etudiant mathmatique

		Note note_houari_anly1 = new Note(18.0);
		note_houari_anly1.setEtudaint(houari);
		note_houari_anly1.setMatiere(analyse1);

		Note note_houari_anly2 = new Note(17.5);
		note_houari_anly2.setEtudaint(houari);
		note_houari_anly2.setMatiere(analyse2);

		Note note_houari_alg = new Note(15.0);
		note_houari_alg.setEtudaint(houari);
		note_houari_alg.setMatiere(algebre);

		Note note_houari_hist = new Note(16.25);
		note_houari_hist.setEtudaint(houari);
		note_houari_hist.setMatiere(histoire_math);

		Note note_houari_proba = new Note(15.75);
		note_houari_proba.setEtudaint(houari);
		note_houari_proba.setMatiere(probabilite);

		ArrayList<Note> list_note_houari = new ArrayList<>();
		list_note_houari.add(note_houari_anly1);
		list_note_houari.add(note_houari_anly2);
		list_note_houari.add(note_houari_alg);
		list_note_houari.add(note_houari_proba);
		list_note_houari.add(note_houari_hist);

		// ---------------------------------------------------//

		// Moundir note Etudiant mathmatique

		Note note_moundir_anly1 = new Note(18.0);
		note_moundir_anly1.setEtudaint(moundir);
		note_moundir_anly1.setMatiere(analyse1);

		Note note_moundir_anly2 = new Note(null);
		note_moundir_anly2.setEtudaint(moundir);
		note_moundir_anly2.setMatiere(analyse2);

		Note note_moundir_alg = new Note(19.0);
		note_moundir_alg.setEtudaint(moundir);
		note_moundir_alg.setMatiere(algebre);

		Note note_moundir_hist = new Note(null);
		note_moundir_hist.setEtudaint(moundir);
		note_moundir_hist.setMatiere(histoire_math);

		Note note_moundir_proba = new Note(18.75);
		note_moundir_proba.setEtudaint(moundir);
		note_moundir_proba.setMatiere(probabilite);

		ArrayList<Note> list_note_moundir = new ArrayList<>();
		list_note_moundir.add(note_moundir_anly1);
		list_note_moundir.add(note_moundir_anly2);
		list_note_moundir.add(note_moundir_alg);
		list_note_moundir.add(note_moundir_proba);
		list_note_moundir.add(note_moundir_hist);

		// Calcule Moyenne de chaque etudiant

		// 1 informatique
		yassine.setMoyenne_generale(yassine.moy_Etudiant(list_note_yassine)); // Moyenne generale
		mahfoud.setMoyenne_generale(mahfoud.moy_Etudiant(list_note_mahfoud));

		ArrayList<Double> list_moyenne_etu_info = new ArrayList<>();
		list_moyenne_etu_info.add(yassine.getMoyenne_generale());
		list_moyenne_etu_info.add(mahfoud.getMoyenne_generale());

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_se = new ArrayList<>();
		list_note_etu_se.add(note_yassine_se.getNote_Controle());
		list_note_etu_se.add(note_mahfoud_se.getNote_Controle());

		// calcule moyenne matiere se

		systeme_exploitation.setMoy_matiere(systeme_exploitation.moy_Matiere(list_note_etu_se));

		ArrayList<Double> list_note_etu_si = new ArrayList<>();
		list_note_etu_si.add(note_yassine_si.getNote_Controle());
		list_note_etu_si.add(note_mahfoud_si.getNote_Controle());

		// calcule moyenne matiere si

		systeme_information.setMoy_matiere(systeme_information.moy_Matiere(list_note_etu_si));

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_gl = new ArrayList<>();
		list_note_etu_gl.add(note_yassine_gl.getNote_Controle());
		list_note_etu_gl.add(note_mahfoud_gl.getNote_Controle());

		// calcule moyenne matiere gl

		genie_logiciel.setMoy_matiere(genie_logiciel.moy_Matiere(list_note_etu_gl));

		// calcule moyenne matiere se

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_prolog = new ArrayList<>();
		list_note_etu_prolog.add(note_yassine_prolog.getNote_Controle());
		list_note_etu_prolog.add(note_mahfoud_prolog.getNote_Controle());

		// calcule moyenne matiere prolog

		prolog.setMoy_matiere(prolog.moy_Matiere(list_note_etu_prolog));

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_comp = new ArrayList<>();
		list_note_etu_comp.add(note_yassine_comp.getNote_Controle());
		list_note_etu_comp.add(note_mahfoud_comp.getNote_Controle());

		// calcule moyenne matiere compilation

		compilation.setMoy_matiere(compilation.moy_Matiere(list_note_etu_comp));

		ArrayList<Double> list_moy_matiere_info = new ArrayList<>();
		list_moy_matiere_info.add(systeme_exploitation.getMoy_matiere());
		list_moy_matiere_info.add(systeme_information.getMoy_matiere());
		list_moy_matiere_info.add(genie_logiciel.getMoy_matiere());
		list_moy_matiere_info.add(prolog.getMoy_matiere());
		list_moy_matiere_info.add(compilation.getMoy_matiere());

		// Calcule moy etudiant Mathematique

		houari.setMoyenne_generale(houari.moy_Etudiant(list_note_houari));
		moundir.setMoyenne_generale(moundir.moy_Etudiant(list_note_moundir));

		ArrayList<Double> list_moyenne_etu_math = new ArrayList<>();

		list_moyenne_etu_math.add(houari.getMoyenne_generale());
		list_moyenne_etu_math.add(moundir.getMoyenne_generale());

		// list contient note tout etudiant selon matiere

		ArrayList<Double> list_note_etu_anly1 = new ArrayList<>();
		list_note_etu_anly1.add(note_houari_anly1.getNote_Controle());
		list_note_etu_anly1.add(note_moundir_anly1.getNote_Controle());

		// calcule moyenne matiere se

		analyse1.setMoy_matiere(analyse1.moy_Matiere(list_note_etu_anly1));

		ArrayList<Double> list_note_etu_anly2 = new ArrayList<>();
		list_note_etu_anly2.add(note_houari_anly2.getNote_Controle());
		list_note_etu_anly2.add(note_moundir_anly2.getNote_Controle());

		// calcule moyenne matiere si

		analyse2.setMoy_matiere(analyse2.moy_Matiere(list_note_etu_anly2));

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_alg = new ArrayList<>();
		list_note_etu_alg.add(note_houari_alg.getNote_Controle());
		list_note_etu_alg.add(note_moundir_alg.getNote_Controle());

		// calcule moyenne matiere gl

		algebre.setMoy_matiere(algebre.moy_Matiere(list_note_etu_alg));

		// calcule moyenne matiere se

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_hist = new ArrayList<>();
		list_note_etu_hist.add(note_houari_hist.getNote_Controle());
		list_note_etu_hist.add(note_moundir_hist.getNote_Controle());

		// calcule moyenne matiere prolog

		histoire_math.setMoy_matiere(histoire_math.moy_Matiere(list_note_etu_hist));

		// list contient note tout etudiant selon matiere
		ArrayList<Double> list_note_etu_proba = new ArrayList<>();
		list_note_etu_proba.add(note_houari_proba.getNote_Controle());
		list_note_etu_proba.add(note_moundir_proba.getNote_Controle());

		// calcule moyenne matiere compilation

		probabilite.setMoy_matiere(probabilite.moy_Matiere(list_note_etu_proba));
		ArrayList<Double> list_moy_matiere_math = new ArrayList<>();
		list_moy_matiere_math.add(analyse1.getMoy_matiere());
		list_moy_matiere_math.add(analyse2.getMoy_matiere());
		list_moy_matiere_math.add(algebre.getMoy_matiere());
		list_moy_matiere_math.add(histoire_math.getMoy_matiere());
		list_moy_matiere_math.add(probabilite.getMoy_matiere());

		informatique.setMoyenne_dep(informatique.moy_Departement(list_moy_matiere_info));
		mathematique.setMoyenne_dep(mathematique.moy_Departement(list_moy_matiere_math));

		ArrayList<Double> list_moy_dep = new ArrayList<>();
		list_moy_dep.add(informatique.getMoyenne_dep());
		list_moy_dep.add(mathematique.getMoyenne_dep());

		// Calcule moyenne ecole en somme moyenne tout departement

		double moy_ecole = univ_oran.moyenne_Ecole(list_moy_dep);

		test.affiche_Menu_Interaction();

		String verifie_saisie;

		while (reponse) {

			verifie_saisie = lire.nextLine();

			while (!verifie_saisie.equals("1") && !verifie_saisie.equals("2") && !verifie_saisie.equals("3")
					&& !verifie_saisie.equals("4") && !verifie_saisie.equals("5") && !verifie_saisie.equals("6")
					&& !verifie_saisie.equals("7")) {
				test.afficher_msg_err();
				System.out.println("ici");
				verifie_saisie = lire.nextLine();

			}

			switch (verifie_saisie) {

			case "1":

				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");

				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.println("	******************************** ECOLE *********************************\n");
				System.out.println("	               __________________________________________");
				System.out.println("	              |    ECOLE     |         SITE WEB          |");
				System.out.println("	              |______________|___________________________|");
				System.out.println("	              |              |                           |");
				System.out.println(
						"	              |     " + univ_oran.getNom_Ecole() + "     | " + univ_oran.getUrl() + "  |");
				System.out.println("	              |______________|___________________________|");

				System.out.println("\n");
				System.out.println("\n  1" + "		   REVENIRE AU MENU (Y) \n ");

				System.out.println("	***********************************************************************\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("___________________________");
				System.out.print("\n");
				System.out.print("\n");

				System.out.print("-REPONSE  : ");
				verifie_saisie = lire.nextLine();
				System.out.println("\n \n \n \n \n \n");

				while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")) {
					System.out.println("VERIFIER VOTRE SAISSIE");
					verifie_saisie = lire.nextLine();
				}
				if (verifie_saisie.equals("Y") || verifie_saisie.equals("y")) {
					test.affiche_Menu_Interaction();
				}

				break;

			case "2":

				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");

				System.out.println("\n");

				System.out.println("\n");
				System.out.println("		**************** LIST ECOLE ****************");
				System.out.println("\n");

				System.out.println(" 	   		 _________________");
				System.out.println("	   		|     |           |");
				System.out.println("      	   		|  N° |  ECOLE    |  ");
				System.out.println("	   		|_____|___________|");
				System.out.println("	   		|     |           |");
				System.out.println("	   		|  1  |  " + univ_oran.getNom_Ecole() + "     |");
				System.out.println("	   		|_____|___________|");
				System.out.println("\n");
				System.out.println("____________________________");
				System.out.print("- Numero ECOLE  : ");

				String saisie = lire.nextLine();

				while (!saisie.equals("1")) {
					test.afficher_msg_err();
					System.out.println("____________________________");
					System.out.print("- Numero ECOLE  : ");
					saisie = lire.nextLine();
				}

				switch (saisie) {
				case "1":
					System.out.println("\n \n \n");
					System.out.println("\n \n \n");
					boolean rep = true;
					test.afficher_serivce();
					int i = 1;

					while (rep) {
						boolean affiche_autre_chef = true;
						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
								&& !saisie.equals("4")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {
						case "1":
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							test.affichage_dep(univ_oran, i);
							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							if (lire.nextLine().isEmpty()) {

								System.out.println("\n \n \n \n");

								test.afficher_serivce();

							} else {
								while (!(lire.nextLine().isEmpty())) {
								}

								System.out.println("\n \n \n");

								test.afficher_serivce();

							}

							break;

						case "2":
							while (affiche_autre_chef) {

								i = 1;
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								test.affichage_dep(univ_oran, i);

								System.out.println("\n");
								System.out.println("______________________________________");
								System.out.print("\n -N°  DEPARTEMENT : ");

								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("______________________________________");
									System.out.print("\n -N°  DEPARTEMENT : ");

									saisie = lire.nextLine();
								}

								switch (saisie) {
								case "1":

									System.out.println("\n\n \n\n");
									System.out.println("\n\n \n\n");
									System.out.println("\n\n \n\n");
									System.out.println(
											"\n	*******************AFFICHAGE CHEF DEPARTEMENT********************\n");

									System.out.println("\n");
									System.out.println("   		 _____________________________________________");
									System.out.println("  		|                         |                   |");
									System.out.println("  		|       DEPARETEMENT      |      CHEF         |");
									System.out.println(" 		|_________________________|___________________|");
									System.out.println("  		|                         |                   |");
									System.out.print("  		|    "
											+ univ_oran.getDepartement().get(0).getNom_departement()
											+ "         |     Mr ."
											+ univ_oran.getDepartement().get(0).getResponsable().getNom() + "    |");
									System.out.print("\n  		|_________________________|___________________|");

									break;

								case "2":
									System.out.println("\n\n \n\n");
									System.out.println("\n\n \n\n");
									System.out.println("\n\n \n\n");
									System.out.println(
											"\n	*******************AFFICHAGE CHEF DEPARTEMENT********************\n");

									System.out.println("   		 _____________________________________________");
									System.out.println("  		|                         |                   |");
									System.out.println("	  	|       DEPARETEMENT      |      CHEF         |");
									System.out.println(" 		|_________________________|___________________|");
									System.out.println("  		|                         |                   |");
									System.out.print("  		|    "
											+ univ_oran.getDepartement().get(1).getNom_departement()
											+ "         |     Mr ."
											+ univ_oran.getDepartement().get(1).getResponsable().getNom() + "    |");
									System.out.print("\n  		|_________________________|___________________|");

									break;

								}
								System.out.println("\n");
								System.out.println(
										"							\n		AFFICHER UN AUTRE CHEF  TAPER (Y)\n 		"
												+ "										\n		RETOUR  TAPER (N)");
								System.out.println("\n______________________________________________\n");
								System.out.print(" -REPONSE  : ");

								verifie_saisie = lire.nextLine();

								System.out.print("\n");
								System.out.print("\n");

								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("\n______________________________________________\n");
									System.out.print(" -REPONSE  : ");
									verifie_saisie = lire.nextLine();

								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_serivce();
									affiche_autre_chef = false;

								}
							}

							break;
						case "3":
							affiche_autre_chef = true;
							while (affiche_autre_chef) {
								i = 1;

								i = 1;
								System.out.println("\n \n \n \n \n");
								test.affichage_dep(univ_oran, i);
								System.out.println("______________________________________");
								System.out.print("\n - N° Departement : ");

								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("______________________________________");
									System.out.print("\n - N° Departement : ");
									saisie = lire.nextLine();
								}
								switch (saisie) {

								case "1":
									System.out.println("\n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n");
									System.out.println("\n \n");

									System.out.println("\n	****************************************************");
									System.out.println("\n  ");

									System.out.println("   	 	 _____________________________________");
									System.out.println("  		|                    |                |");
									System.out.println("  		|    DEPARETEMENT    |     MOYENNE    |");
									System.out.println(" 		|____________________|________________|");
									System.out.println("  		|                    |                |");
									System.out.print("  		|    "
											+ univ_oran.getDepartement().get(0).getNom_departement() + "    |      "
											+ univ_oran.getDepartement().get(0).getMoyenne_dep() + "      |");
									System.out.print("\n  		|____________________|________________|");

									break;

								case "2":
									System.out.println("\n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n");
									System.out.println("\n \n");

									System.out.println("   	 	 _____________________________________");
									System.out.println("  		|                    |                |");
									System.out.println("  		|    DEPARETEMENT    |     MOYENNE    |");
									System.out.println(" 		|____________________|________________|");
									System.out.println("  		|                    |                |");
									System.out.print("  		|    "
											+ univ_oran.getDepartement().get(1).getNom_departement() + "    |      "
											+ univ_oran.getDepartement().get(1).getMoyenne_dep() + "      |");
									System.out.print("\n  		|____________________|________________|");

									break;

								}
								System.out.println("\n");
								System.out.print(" \n \n  		-AFFICHE AUTRE MOYENNE (Y)\n		-RETOUR (N)");
								System.out.println("\n");
								System.out.println("\n	****************************************************");
								System.out.println("________________________________");
								System.out.print("\n-REPONSE :");
								verifie_saisie = lire.nextLine();

								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("________________________________");
									System.out.print("\n-REPONSE :");
									verifie_saisie = lire.nextLine();
								}

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_serivce();
									affiche_autre_chef = false;

								}
							}

							break;

						case "4":
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							test.affiche_Menu_Interaction();
							rep = false;
							break;

						}
					}
					break;
				}
				break;
			case "3":
				int count = 0;

				System.out.println("\n \n \n \n \n");
				System.out.println("\n \n \n ");
				System.out.println("\n \n ");
				System.out.println("VOUS ETRE MAINTENANT DANS MODE ENSEIGNANT");
				System.out.println("\n ");

				System.out.println("\n      *****************************ENSEIGNANT*****************************");

				System.out.println("\n");
				System.out.println("		ENSEIGANANT DE QUEL DEPARTEMENT ?");

				int h = 1;
				System.out.println("\n");
				System.out.println("		**************** DEPATEMENT ECOLE ***************");
				System.out.println("			 _________________________");
				System.out.println("			|     |                   |");
				System.out.println("		   	|  N° |  DEPARTEMENT      |");
				System.out.println("		   	|_____|___________________|");
				for (Departement departement : univ_oran.getDepartement()) {
					System.out.println("		   	|     |                   |");
					System.out.println("		   	|  " + h + "  |    " + departement.getNom_departement() + "   |");
					System.out.println("		   	|_____|___________________|");

					h++;
				}

				System.out.println("__________________________________");
				System.out.print("\n N° DEPARETEMENT : ");
				saisie = lire.nextLine();
				while (!saisie.equals("1") && !saisie.equals("2")) {
					test.afficher_msg_err();
					System.out.println("__________________________________");
					System.out.print("\n N° DEPARETEMENT : ");
					saisie = lire.nextLine();
				}

				switch (saisie) {

				case "1":
					boolean affich_eng = true;
					while (affich_eng) {
						test.afficher_enseigant();

						// Affichage enseignanat departement info selon grade
						// 1...6 grade 1 grade professeur ..........6 grade chage de cour
						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3") && !saisie.equals("4")
								&& !saisie.equals("5") && !saisie.equals("6")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {
						case "1":
							boolean affich_grade = true;
							while (affich_grade) {

								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");

								System.out.println("		____________________________________________");
								System.out.println("		|               |                           | ");
								System.out.println("		|      N°       |        GRADE              |");
								System.out.println("		|_______________|___________________________|");
								for (int i = 0; i < grade.length; i++) {
									System.out.println("		|               |                           |");
									System.out.print("		|      " + (i + 1) + "        |     " + grade[i]);
									for (int k = 0; k < (27 - (grade[i].length() + 5)); k++) {
										System.out.print(" ");
										if (k == (26 - (grade[i].length() + 5))) {
											System.out.print("|\n");
										}
									}
									System.out.println("		|_______________|___________________________|");

								}
								System.out.println("\n\n________________________________");
								System.out.print("\n -N° GRADE  :  ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
										&& !saisie.equals("4") && !saisie.equals("5") && !saisie.equals("6")) {
									test.afficher_msg_err();
									System.out.println("\n\n________________________________");
									System.out.print("\n -N° GRADE  :  ");
									saisie = lire.nextLine();
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("Enseignnat ayant  Grade N° " + saisie + "  est");
								test.affich_Eng_grade(list_enseignant_info, grade[(Integer.valueOf(saisie) - 1)]);
								System.out.println("\n");
								System.out.println("AFFICHER UN AUTRE GRADE TAPER (Y)");
								System.out.println("RETOUR  TAPER (N)");
								System.out.println("\n______________________________");
								System.out.print("-REPONSE : ");
								verifie_saisie = lire.nextLine();
								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("\n______________________________");
									System.out.print("-REPONSE : ");
									verifie_saisie = lire.nextLine();
								}
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_enseigant();
									affich_grade = false;
									System.out.println("\n \n");
									System.out.println("\n \n");
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

							}
							break;

						case "2":
							boolean affiche_cour_disp = true;
							while (affiche_cour_disp) {
								count = 1;
								// COUR DISPENSE ENSEIGANT INFORMATIQUE
								System.out.println("\n");
								System.out.println("\n \n \n \n \n \n \n");
								System.out.println("QUEL ENSEIGANAT ?");
								System.out.println("   	 __________________________");
								System.out.println("  	|         |                |");
								System.out.println("  	|    N°   |    ENSEIGANT   |");
								System.out.print(" 	|_________|________________|");
								for (Enseignant ennseignant : informatique.getEnseignant()) {
									System.out.print("\n 	|         |                |");

									System.out.print("  	\n\t|    " + count + "    |      " + ennseignant.getNom());
									for (int k = 0; k < (24 - (ennseignant.getNom().length() + 14)); k++) {
										System.out.print(" ");
										if (k == (23 - (ennseignant.getNom().length() + 14))) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|_________|________________|");

									count++;
								}

								System.out.println("\n \n_________________________");
								System.out.print("\n N° ENSEIGNANT  : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
										&& !saisie.equals("4") && !saisie.equals("5") && !saisie.equals("6")) {
									test.afficher_msg_err();
									System.out.println("\n \n_________________________");
									System.out.print("\n N° ENSEIGNANT  : ");
									saisie = lire.nextLine();
								}
								System.out.println("\n \n \n \n");
								System.out.println("\n \n \n \n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("   	 _____________________________________________");
								System.out.println("  	|                  |                          |");
								System.out.println("  	|    ENSEIGNANT    |        MATIERE           |");
								System.out.println(" 	|__________________|__________________________|");
								System.out.print("   	|                  |                          |");

								for (int i = 0; i < informatique.getEnseignant().get((Integer.valueOf(saisie) - 1))
										.getMatiere_enseiger().size(); i++) {
									System.out.print("\n 	|                  |                          |\n");
									System.out.print("  	|    "
											+ informatique.getEnseignant().get((Integer.valueOf(saisie) - 1)).getNom());
									for (int j = 0; j < (18 - (informatique.getEnseignant()
											.get((Integer.valueOf(saisie) - 1)).getNom().length() + 4)); j++) {
										System.out.print(" ");
										if (j == (17 - (informatique.getEnseignant().get((Integer.valueOf(saisie) - 1))
												.getNom().length() + 4))) {
											System.out.print("|");
										}
									}

									System.out.print(
											"     " + informatique.getEnseignant().get((Integer.valueOf(saisie) - 1))
													.getMatiere_enseiger().get(i).getLibelle_Matiere());
									for (int j = 0; j < (44
											- (informatique.getEnseignant().get((Integer.valueOf(saisie) - 1))
													.getMatiere_enseiger().get(i).getLibelle_Matiere().length()
													+ 23)); j++) {
										System.out.print(" ");
										if (j == (43 - (informatique.getEnseignant().get((Integer.valueOf(saisie) - 1))
												.getMatiere_enseiger().get(i).getLibelle_Matiere().length() + 23))) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|__________________|__________________________|");
								}

								System.out.println("\n \n \n \n");
								System.out.println("\n- Afficher Matiere D'un autre enseignant  TAPER (Y) ");
								System.out.println("\n- Retour TAPER (N)");

								System.out.println("\n__________________________________");
								System.out.print("Reponse  : ");
								verifie_saisie = lire.nextLine();
								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("\n__________________________________");
									System.out.print("Reponse  : ");
									verifie_saisie = lire.nextLine();
								}
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_enseigant();
									affiche_cour_disp = false;
									System.out.println("\n \n");

								}

							}

							break;

						case "3":
							// AFFICHAGE ENSEIGNANT PLUS ANCIENT AU PLUS RECENT
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							test.affich_enseignat_date_prise_fontion(informatique);
							System.out.println();
							System.out.println("RETOUR TAPER ENTER.......");

							while (!(lire.nextLine().isEmpty())) {
							}

							break;

						case "4":
							boolean affiche_fiche_sig = true;
							while (affiche_fiche_sig) {
								count = 1;
								System.out.println("\n");
								System.out.println("\n");
								System.out.println("\n");
								System.out.println("\n");
								System.out.println("\n");
								System.out.println("QUEL ENSEIGANAT ?");
								System.out.println("\n");
								System.out.println("         __________________________");
								System.out.println("  	|         |                |");
								System.out.println("  	|    N°   |    ENSEIGANT   |");
								System.out.print("   	|_________|________________|");

								for (Enseignant ennseignant : informatique.getEnseignant()) {
									System.out.print("\n  	|         |                |");
									System.out.print("\n 	|    " + count + "    |     " + ennseignant.getNom());
									for (int i = 0; i < (26 - (ennseignant.getNom().length() + 15)); i++) {
										System.out.print(" ");
										if (i == (25 - (ennseignant.getNom().length() + 15))) {
											System.out.print("|");
										}
									}
									System.out.print("\n  	|_________|________________|");

									count++;

								}

								System.out.println("\n\n___________________________");
								System.out.print("N° Enseignant  : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
										&& !saisie.equals("4") && !saisie.equals("5")) {
									test.afficher_msg_err();
									System.out.println("\n\n___________________________");
									System.out.print("N° Enseignant  : ");
									saisie = lire.nextLine();
								}
								System.out.println("\n\n\n\n\n\n\n\n");
								test.fiche_signalitique(
										informatique.getEnseignant().get((Integer.valueOf(saisie) - 1)));

								System.out.println("\n\n-AFFICHER FICHE SIGANALITIQUE AUTRE ENSEIGANNT TAPER (Y)");
								System.out.println("\n RETOUR  TAPER (N)");
								System.out.println("\n________________________________");
								System.out.print("\n REPONSE : ");
								verifie_saisie = lire.nextLine();
								System.out.print("\n");
								System.out.print("\n");
								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {

									test.afficher_msg_err();
									System.out.println("\n________________________________");
									System.out.print("\n REPONSE : ");
									verifie_saisie = lire.nextLine();

								}
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_serivce();
									affiche_fiche_sig = false;
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");

								}

							}
							break;

						case "5":
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							test.affiche_Menu_Interaction();
							affich_eng = false;
							break;
						}
					}
					break;
				case "2":

					affich_eng = true;
					while (affich_eng) {
						test.afficher_enseigant();

						// Affichage enseignanat departement info selon grade
						// 1...6 grade 1 grade professeur ..........6 grade chage de cour
						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3") && !saisie.equals("4")
								&& !saisie.equals("5")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {
						case "1":
							boolean affich_grade = true;
							while (affich_grade) {

								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");
								System.out.println("\n ");

								System.out.println("		____________________________________________");
								System.out.println("		|               |                           | ");
								System.out.println("		|      N°       |        GRADE              |");
								System.out.println("		|_______________|___________________________|");
								for (int i = 0; i < grade.length; i++) {
									System.out.println("		|               |                           |");
									System.out.print("		|      " + (i + 1) + "        |     " + grade[i]);
									for (int k = 0; k < (27 - (grade[i].length() + 5)); k++) {
										System.out.print(" ");
										if (k == (26 - (grade[i].length() + 5))) {
											System.out.print("|\n");
										}
									}
									System.out.println("		|_______________|___________________________|");

								}
								System.out.println("__________________________");
								System.out.print("\n -N° GRADE  :  ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
										&& !saisie.equals("4") && !saisie.equals("5") && !saisie.equals("6")) {
									test.afficher_msg_err();
									System.out.println("__________________________");
									System.out.print("\n -N° GRADE  :  ");
									saisie = lire.nextLine();
								}

								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("Enseignnat ayant  Grade N° " + saisie + "  est");
								test.affich_Eng_grade(list_enseignant_math, grade[(Integer.valueOf(saisie) - 1)]);
								System.out.println("\n");
								System.out.println("AFFICHER UN AUTRE GRADE TAPER (Y)");
								System.out.println("RETOUR  TAPER (N)");
								System.out.println("\n_______________________________");
								System.out.print("\n-REPONSE : ");

								verifie_saisie = lire.nextLine();
								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("\n_______________________________");
									System.out.print("\n-REPONSE : ");
									verifie_saisie = lire.nextLine();
								}
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_enseigant();
									affich_grade = false;
									System.out.println("\n \n");

									System.out.println("\n \n");
								}
							}
							break;

						case "2":
							boolean affiche_cour_disp = true;
							while (affiche_cour_disp) {

								// COUR DISPENSE ENSEIGANT INFORMATIQUE
								System.out.println("\n");

								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");

								System.out.println("QUEL ENSEIGANAT ?");

								System.out.println("     	 __________________________");
								System.out.println("  	|         |                |");
								System.out.println("  	|    N°   |    ENSEIGANT   |");
								System.out.println(" 	|_________|________________|");
								count = 1;
								for (Enseignant ennseignant : mathematique.getEnseignant()) {
									System.out.print("  	|         |                |");
									System.out.print("  \n\t|    " + count + "    |    " + ennseignant.getNom());
									for (int i = 0; i < (26 - (ennseignant.getNom().length() + 14)); i++) {
										System.out.print(" ");
										if (i == (25 - (ennseignant.getNom().length() + 14))) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|_________|________________|");
									System.out.println();

									count++;
								}
								System.out.print("\n____________________________\n");
								System.out.print("N° ENSEIGNANT  :");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
										&& !saisie.equals("4") && !saisie.equals("5") && !saisie.equals("6")) {
									test.afficher_msg_err();
									saisie = lire.nextLine();
								}

								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");

								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("   	 __________________________________");
								System.out.println("  	|                  |                |");
								System.out.println("  	|    ENSEIGNANT    |    MATIERE     |");
								System.out.println(" 	|__________________|________________|");

								for (int i = 0; i < mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1))
										.getMatiere_enseiger().size(); i++) {
									System.out.print("  	|                  |                |\n");
									System.out.print("  	|    "
											+ mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1)).getNom());
									for (int k = 0; k < (10 - mathematique.getEnseignant()
											.get((Integer.valueOf(saisie) - 1)).getNom().length() + 4); k++) {
										System.out.print(" ");
										if (k == (9 - mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1))
												.getNom().length() + 4)) {
											System.out.print("|");
										}
									}

									System.out.print(
											"    " + mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1))
													.getMatiere_enseiger().get(i).getLibelle_Matiere());
									for (int k = 0; k < (9
											- mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1))
													.getMatiere_enseiger().get(i).getLibelle_Matiere().length()
											+ 3); k++) {
										System.out.print(" ");
										if (k == (8
												- mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1))
														.getMatiere_enseiger().get(i).getLibelle_Matiere().length()
												+ 3)) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|__________________|________________|");
									System.out.println();
								}

								System.out.println("\n \n");
								System.out.println("\n- Afficher Matiere D'un autre enseignant  TAPER (Y) ");
								System.out.println("\n Retour TAPER (N)");
								System.out.println("_________________________");
								System.out.print("\n-Reponse :  ");
								verifie_saisie = lire.nextLine();
								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("_________________________");
									System.out.print("\n-Reponse :  ");
									verifie_saisie = lire.nextLine();
								}

								System.out.println("\n \n");
								System.out.println("\n \n");
								System.out.println("\n \n");
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_enseigant();
									affiche_cour_disp = false;
									System.out.println("\n \n");
									System.out.println("\n \n");
									System.out.println("\n \n");
								}

							}

							System.out.println("\n*****************************************************");

							break;

						case "3":
							// AFFICHAGE ENSEIGNANT PLUS ANCIENT AU PLUS RECENT
							System.out.println("\n \n");
							System.out.println("\n \n");
							System.out.println("\n \n");
							System.out.println("\n \n");
							System.out.println("\n \n");
							test.affich_enseignat_date_prise_fontion(mathematique);

							System.out.println("\nRETOUR TAPER ENTER.......");

							while (!(lire.nextLine().isEmpty())) {
							}

							break;

						case "4":
							boolean affiche_fiche_sig = true;
							while (affiche_fiche_sig) {
								count = 1;

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("QUEL ENSEIGANAT ?");
								System.out.println("\n");
								System.out.println("     	 __________________________");
								System.out.println("  	|         |                |");
								System.out.println("  	|    N°   |    ENSEIGANT   |");
								System.out.println(" 	|_________|________________|");
								count = 1;
								for (Enseignant ennseignant : mathematique.getEnseignant()) {
									System.out.print("  	|         |                |");
									System.out.print("  \n\t|    " + count + "    |    " + ennseignant.getNom());
									for (int i = 0; i < (26 - (ennseignant.getNom().length() + 14)); i++) {
										System.out.print(" ");
										if (i == (25 - (ennseignant.getNom().length() + 14))) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|_________|________________|");
									System.out.println();

									count++;
								}
								System.out.println("_________________________\n");
								System.out.print("N° Enseignant  : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
										&& !saisie.equals("4") && !saisie.equals("5")) {
									test.afficher_msg_err();
									System.out.println("_________________________\n");
									System.out.print("N° Enseignant  : ");
									saisie = lire.nextLine();
								}

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								test.fiche_signalitique(
										mathematique.getEnseignant().get((Integer.valueOf(saisie) - 1)));

								System.out.println("\n\n-AFFICHER FICHE SIGANALITIQUE AUTRE ENSEIGANNT TAPER (Y)");
								System.out.println("\n RETOUR  TAPER (N)");
								System.out.println("\n________________________________");
								System.out.print("\n REPONSE : ");

								verifie_saisie = lire.nextLine();

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								while (!verifie_saisie.equals("Y") && !verifie_saisie.equals("y")
										&& !verifie_saisie.equals("N") && !verifie_saisie.equals("n")) {
									test.afficher_msg_err();
									System.out.println("\n________________________________");
									System.out.print("\n REPONSE : ");
									verifie_saisie = lire.nextLine();

								}
								if (verifie_saisie.equals("N") || verifie_saisie.equals("n")) {
									test.afficher_serivce();
									affiche_fiche_sig = false;

								}

							}
							break;

						case "5":
							System.out.println("\n  \n  \n \n  \n \n");
							test.affiche_Menu_Interaction();
							affich_eng = false;
							break;

						}
					}
				}
				break;

			case "4":
				boolean affich_etu = true;
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");

				test.affichage_dep(univ_oran, 1);
				System.out.println("______________________________\n");
				System.out.print("N° Departement : ");
				saisie = lire.nextLine();
				while (!saisie.equals("1") && !saisie.equals("2")) {
					test.afficher_msg_err();
					System.out.println("______________________________\n");
					System.out.print("N° Departement : ");
					saisie = lire.nextLine();
				}

				switch (saisie) {

				case "1":
					while (affich_etu) {

						System.out.println("\n \n");
						System.out.println("\n \n");
						System.out.println("\n \n");
						test.afficher_menu_etudiant();
						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3") && !saisie.equals("4")
								&& !saisie.equals("5") && !saisie.equals("6")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {
						case "1":
							boolean affiche_fiche = true;
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							while (affiche_fiche) {
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out
										.println("	******************* Affichage Etudiant *************************");
								System.out.println("\n \n");
								for (int i = 0; i < list_etu_info.size(); i++) {
									System.out
											.println("		-" + (i + 1) + " Etudiant \n  \n  				Nom    :   "
													+ list_etu_info.get(i).getNom() + "\n  				Prenom :   "
													+ list_etu_info.get(i).getPrenom());
									System.out.println();
								}
								System.out.println("_________________________");
								System.out.print("N° Etudiant : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("_________________________");
									System.out.print("N° Etudiant : ");
									saisie = lire.nextLine();
								}

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								list_etu_info.get(Integer.valueOf(saisie) - 1).impr_Fiche_Signalitique();
								System.out.println("\nAfficher autre  etudiant TAPER (Y)");
								System.out.println("Retour  TAPER (N)");
								System.out.println("________________________________");
								System.out.print("-Reponse ");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("n")
										&& !saisie.equals("N")) {
									test.afficher_msg_err();
									System.out.println("________________________________");
									System.out.print("-Reponse ");
									saisie = lire.nextLine();
								}
								if (saisie.equals("n") || saisie.equals("N")) {

									test.afficher_menu_etudiant();
									affiche_fiche = false;
								}

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
							}

							break;
						case "2":

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.println("******************** Classement Etudiant **************************");
							test.affiche_classement_etudiant(list_etu_info);
							System.out.println("TAPER TOUCHE ENTER POUR REVENIRE ");
							saisie = lire.nextLine();
							while (!saisie.isEmpty()) {
								test.afficher_msg_err();
								saisie = lire.nextLine();
							}
							break;
						case "3":
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							boolean affiche_moy_etu = true;
							while (affiche_moy_etu) {
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("\n Quelle etudiant ?");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("	*************** LIST ETUDIANT ***************");
								for (int i = 0; i < list_etu_info.size(); i++) {
									System.out.print("\n");
									System.out.println("	-" + (i + 1) + "  Etudiant \n 			Nom : "
											+ list_etu_info.get(i).getNom() + "	\n			Prenom :"
											+ list_etu_info.get(i).getPrenom());
								}
								System.out.println("\n______________________________");
								System.out.print("N° Etudiant : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									saisie = lire.nextLine();
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("	_______________________ Etudiant  :  "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getNom()
										+ " _______________________");
								System.out.println("\n 			Nom 	          :  "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getNom());
								System.out.println("\n 			Prenom            :  "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getPrenom());
								System.out.println("\n 			Moyenne General   :  "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getMoyenne_generale());
								System.out.print(
										"	______________________________________________________________________\n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("Afficher autre  etudiant TAPER (Y)");
								System.out.println("Retour  TAPER (N)");
								System.out.println("________________________________");
								System.out.print("-Reponse ");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("n")
										&& !saisie.equals("N")) {
									test.afficher_msg_err();
									System.out.println("________________________________");
									System.out.print("-Reponse ");
									saisie = lire.nextLine();
								}
								if (saisie.equals("n") || saisie.equals("N")) {

									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");

									test.afficher_menu_etudiant();
									affiche_moy_etu = false;
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

							}

							break;
						case "4":
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							test.afficher_etu_pas_note(mahfoud, list_note_mahfoud);
							System.out.print("\n");
							System.out.print("\n");
							System.out.println("\t-------------------------------------------------------");
							System.out.print("\n");
							System.out.print("\n");
							test.afficher_etu_pas_note(yassine, list_note_yassine);

							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							if (lire.nextLine().isEmpty()) {

								System.out.println("\n \n \n \n");

								test.afficher_serivce();

							} else {
								while (!(lire.nextLine().isEmpty())) {
								}

								System.out.println("\n \n \n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								test.afficher_menu_etudiant();

							}

							break;
						case "5":

							boolean affiche_note_etu = true;
							while (affiche_note_etu) {
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("\n Quelle etudiant ? \n\n");
								System.out.println("	*************** LIST ETUDIANT ***************");
								for (int i = 0; i < list_etu_info.size(); i++) {
									System.out.print("\n");
									System.out.println("	-" + (i + 1) + "  Etudiant \n 			Nom : "
											+ list_etu_info.get(i).getNom() + "	\n			Prenom :"
											+ list_etu_info.get(i).getPrenom());
								}
								System.out.println("\n______________________________");

								System.out.print("N° Etudiant : ");

								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("\n______________________________");
									System.out.print("N° Etudiant : ");
									saisie = lire.nextLine();
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("\t		Etudiant " + " : "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getNom());
								System.out.println("\t_________________________________________________");
								System.out.println("\n			Nom \t: "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getNom());
								System.out.println("\n			Prenom \t: "
										+ list_etu_info.get(Integer.valueOf(saisie) - 1).getPrenom() + "\n");

								switch (saisie) {
								case "1":
									test.afficher_note_etudiant(yassine, list_note_yassine);
									break;
								case "2":
									test.afficher_note_etudiant(mahfoud, list_note_mahfoud);
									break;

								}

								System.out.println("Afficher autre  etudiant TAPER (Y)");
								System.out.println("Retour  TAPER (N)");
								System.out.println("__________________________");
								System.out.print("-Reponse : ");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("n")
										&& !saisie.equals("N")) {
									test.afficher_msg_err();
									System.out.println("__________________________");
									System.out.print("-Reponse : ");
									saisie = lire.nextLine();
								}
								if (saisie.equals("n") || saisie.equals("N")) {
									test.afficher_menu_etudiant();
									affiche_note_etu = false;
								}
							}

							System.out.println();
							break;

						case "6":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							test.affiche_Menu_Interaction();
							affich_etu = false;
							break;

						}
					}
					break;

				case "2":
					while (affich_etu) {

						System.out.println("\n \n");
						System.out.println("\n \n");
						System.out.println("\n \n");
						test.afficher_menu_etudiant();
						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3") && !saisie.equals("4")
								&& !saisie.equals("5") && !saisie.equals("6")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {
						case "1":
							boolean affiche_fiche = true;
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							while (affiche_fiche) {
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out
										.println("	******************* Affichage Etudiant *************************");
								System.out.println("\n \n");
								for (int i = 0; i < list_etu_math.size(); i++) {
									System.out
											.println("		-" + (i + 1) + " Etudiant \n  \n  				Nom    :   "
													+ list_etu_math.get(i).getNom() + "\n  				Prenom :   "
													+ list_etu_math.get(i).getPrenom());
									System.out.println();
								}
								System.out.println("_________________________");
								System.out.print("N° Etudiant : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("_________________________");
									System.out.print("N° Etudiant : ");
									saisie = lire.nextLine();
								}

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								list_etu_math.get(Integer.valueOf(saisie) - 1).impr_Fiche_Signalitique();
								System.out.println("\nAfficher autre  etudiant TAPER (Y)");
								System.out.println("Retour  TAPER (N)");
								System.out.println("________________________________");
								System.out.print("-Reponse ");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("n")
										&& !saisie.equals("N")) {
									test.afficher_msg_err();
									System.out.println("________________________________");
									System.out.print("-Reponse ");
									saisie = lire.nextLine();
								}
								if (saisie.equals("n") || saisie.equals("N")) {

									test.afficher_menu_etudiant();
									affiche_fiche = false;
								}

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
							}

							break;
						case "2":

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							System.out.print("\n");

							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.println("******************** Classement Etudiant **************************");
							test.affiche_classement_etudiant(list_etu_math);
							System.out.println("TAPER TOUCHE ENTER POUR REVENIRE ");
							saisie = lire.nextLine();
							while (!saisie.isEmpty()) {
								test.afficher_msg_err();
								saisie = lire.nextLine();
							}
							break;
						case "3":
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");

							boolean affiche_moy_etu = true;
							while (affiche_moy_etu) {
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("\n Quelle etudiant ?");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("	*************** LIST ETUDIANT ***************");
								for (int i = 0; i < list_etu_math.size(); i++) {
									System.out.print("\n");
									System.out.println("	-" + (i + 1) + "  Etudiant \n 			Nom : "
											+ list_etu_math.get(i).getNom() + "	\n			Prenom :"
											+ list_etu_math.get(i).getPrenom());
								}
								System.out.println("\n______________________________");
								System.out.print("N° Etudiant : ");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("\n______________________________");
									System.out.print("N° Etudiant : ");
									saisie = lire.nextLine();
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("	_______________________ Etudiant  :  "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getNom()
										+ " _______________________");
								System.out.println("\n 			Nom 	          :  "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getNom());
								System.out.println("\n 			Prenom            :  "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getPrenom());
								System.out.println("\n 			Moyenne General   :  "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getMoyenne_generale());
								System.out.print(
										"	______________________________________________________________________\n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.println("Afficher autre  etudiant TAPER (Y)");
								System.out.println("Retour  TAPER (N)");
								System.out.println("________________________________");
								System.out.print("-Reponse ");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("n")
										&& !saisie.equals("N")) {
									test.afficher_msg_err();
									System.out.println("________________________________");
									System.out.print("-Reponse ");
									saisie = lire.nextLine();
								}
								if (saisie.equals("n") || saisie.equals("N")) {

									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");

									test.afficher_menu_etudiant();
									affiche_moy_etu = false;
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

							}

							break;
						case "4":
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							System.out.print("\n");
							test.afficher_etu_pas_note(houari, list_note_houari);
							System.out.print("\n");
							System.out.print("\n");
							System.out.println("\t-------------------------------------------------------");
							System.out.print("\n");
							System.out.print("\n");
							test.afficher_etu_pas_note(moundir, list_note_moundir);

							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							if (lire.nextLine().isEmpty()) {

								System.out.println("\n \n \n \n");

								test.afficher_serivce();

							} else {
								while (!(lire.nextLine().isEmpty())) {
								}

								System.out.println("\n \n \n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								test.afficher_menu_etudiant();

							}

							break;
						case "5":

							boolean affiche_note_etu = true;
							while (affiche_note_etu) {
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("\n Quelle etudiant ? \n\n");
								System.out.println("	*************** LIST ETUDIANT ***************");
								for (int i = 0; i < list_etu_math.size(); i++) {
									System.out.print("\n");
									System.out.println("	-" + (i + 1) + "  Etudiant \n 			Nom : "
											+ list_etu_math.get(i).getNom() + "	\n			Prenom :"
											+ list_etu_math.get(i).getPrenom());
								}
								System.out.println("\n______________________________");

								System.out.print("N° Etudiant : ");

								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")) {
									test.afficher_msg_err();
									System.out.println("\n______________________________");

									System.out.print("N° Etudiant : ");
									saisie = lire.nextLine();
								}
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");

								System.out.println("\t		Etudiant " + " : "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getNom());
								System.out.println("\t_________________________________________________");
								System.out.println("\n			Nom \t: "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getNom());
								System.out.println("\n			Prenom \t: "
										+ list_etu_math.get(Integer.valueOf(saisie) - 1).getPrenom() + "\n");

								switch (saisie) {
								case "1":
									test.afficher_note_etudiant(houari, list_note_houari);
									break;
								case "2":
									test.afficher_note_etudiant(moundir, list_note_moundir);
									break;

								}

								System.out.println("Afficher autre  etudiant TAPER (Y)");
								System.out.println("Retour  TAPER (N)");
								System.out.println("__________________________");
								System.out.print("-Reponse : ");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("n")
										&& !saisie.equals("N")) {
									test.afficher_msg_err();
									System.out.println("__________________________");
									System.out.print("-Reponse : ");
									saisie = lire.nextLine();
								}
								if (saisie.equals("n") || saisie.equals("N")) {
									test.afficher_menu_etudiant();
									affiche_note_etu = false;
								}
							}

							System.out.println();
							break;

						case "6":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							test.affiche_Menu_Interaction();
							affich_etu = false;
							break;

						}
					}
				}
				break;

			case "5":
				boolean affich_matiere = true;
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				test.affichage_dep(univ_oran, 1);
				System.out.println("________________________________");
				System.out.print("-N° ");
				saisie = lire.nextLine();

				while (!saisie.equals("1") && !saisie.equals("2")) {
					test.afficher_msg_err();
					System.out.println("________________________________");
					System.out.print("-N° ");
					saisie = lire.nextLine();
				}
				switch (saisie) {

				case "1":
					while (affich_matiere) {
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");

						test.menu_matiere();

						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {

						case "1":
							count = 1;
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							System.out.println("		__________________________________________________");
							System.out.println("		|          |                                      |");
							System.out.println("		|    N     |   Matiere Departement Informatique   |");
							System.out.println("		|__________|______________________________________|");
							for (Matiere matiere : list_matiere_info) {
								System.out.println("		|          |                                      |");
								System.out.print(
										"		|    " + count + "     |        " + matiere.getLibelle_Matiere());
								for (int i = 0; i < (38 - (matiere.getLibelle_Matiere().length() + 8)); i++) {
									System.out.print(" ");
									if (i == (37 - (matiere.getLibelle_Matiere().length() + 8))) {
										System.out.print("|\n");
									}
								}
								System.out.println("		|__________|______________________________________|");
								count++;
							}
							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "2":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							System.out.println("		 ___________________________________________");
							System.out.println("		|                       |                   |      ");
							System.out.println("		|       MATIERE         |      MOYENNE      |");
							System.out.println("		|_______________________|___________________|");
							System.out.println("		|                       |                   |");
							for (int index = 0; index < list_matiere_info.size(); index++) {
								System.out.println("		|                       |                   |");
								System.out.print("		| " + list_matiere_info.get(index).getLibelle_Matiere());
								for (int i = 0; i < (23
										- (list_matiere_info.get(index).getLibelle_Matiere().length() + 1)); i++) {
									System.out.print(" ");
									if (i == (22 - (list_matiere_info.get(index).getLibelle_Matiere().length() + 1))) {
										System.out.print("|        " + list_matiere_info.get(index).getMoy_matiere());
										for (int j = 0; j < (11
												- (String.valueOf(list_matiere_info.get(index).getMoy_matiere()))
														.length()); j++) {
											System.out.print(" ");
											if (j == (10
													- (String.valueOf(list_matiere_info.get(index).getMoy_matiere()))
															.length())) {
												System.out.print("|");
											}
										}

									}
								}
								System.out.println("\n		|_______________________|___________________|");
							}

							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "3":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							test.affiche_Menu_Interaction();
							affich_matiere = false;
							break;
						}
					}

					break;

				case "2":
					while (affich_matiere) {
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");

						test.menu_matiere();

						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						switch (saisie) {

						case "1":
							count = 1;
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							System.out.println("		__________________________________________________");
							System.out.println("		|          |                                      |");
							System.out.println("		|    N     |   Matiere Departement Informatique   |");
							System.out.println("		|__________|______________________________________|");
							for (Matiere matiere : list_matiere_math) {
								System.out.println("		|          |                                      |");
								System.out.print(
										"		|    " + count + "     |        " + matiere.getLibelle_Matiere());
								for (int i = 0; i < (38 - (matiere.getLibelle_Matiere().length() + 8)); i++) {
									System.out.print(" ");
									if (i == (37 - (matiere.getLibelle_Matiere().length() + 8))) {
										System.out.print("|\n");
									}
								}
								System.out.println("		|__________|______________________________________|");
								count++;
							}
							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "2":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							System.out.println("		 ___________________________________________");
							System.out.println("		|                       |                   |      ");
							System.out.println("		|       MATIERE         |      MOYENNE      |");
							System.out.println("		|_______________________|___________________|");
							System.out.println("		|                       |                   |");
							for (int index = 0; index < list_matiere_math.size(); index++) {
								System.out.println("		|                       |                   |");
								System.out.print("		| " + list_matiere_math.get(index).getLibelle_Matiere());
								for (int i = 0; i < (23
										- (list_matiere_math.get(index).getLibelle_Matiere().length() + 1)); i++) {
									System.out.print(" ");
									if (i == (22 - (list_matiere_math.get(index).getLibelle_Matiere().length() + 1))) {
										System.out.print("|        " + list_matiere_math.get(index).getMoy_matiere());
										for (int j = 0; j < (11
												- (String.valueOf(list_matiere_math.get(index).getMoy_matiere()))
														.length()); j++) {
											System.out.print(" ");
											if (j == (10
													- (String.valueOf(list_matiere_math.get(index).getMoy_matiere()))
															.length())) {
												System.out.print("|");
											}
										}

									}
								}
								System.out.println("\n		|_______________________|___________________|");
							}

							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "3":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							test.affiche_Menu_Interaction();
							affich_matiere = false;
							break;
						}
					}
				}
				break;

			case "6":
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				boolean affich_salle = true;
				test.affichage_dep(univ_oran, 0);
				System.out.println("________________________________");
				System.out.print("N° Departement : ");
				saisie = lire.nextLine();
				while (!saisie.equals("1") && !saisie.equals("2")) {
					test.afficher_msg_err();
					System.out.println("________________________________");
					System.out.print("N° Departement : ");
					saisie = lire.nextLine();
				}

				switch (saisie) {
				case "1":
					test.tri_capaciter_salle(list_salle_info);

					while (affich_salle) {

						test.menu_salle();

						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
								&& !saisie.equals("4")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");

						switch (saisie) {

						case "1":
							count = 1;
							System.out.println("		__________________________________________________");
							System.out.println("		|          |                                      |");
							System.out.println("		|    N     |               SALLE                  |");
							System.out.println("		|__________|______________________________________|");
							for (Salle salle : list_salle_info) {
								System.out.println("		|          |                                      |");
								System.out.print("		|    " + count + "     |        " + salle.getNom());
								for (int i = 0; i < (38 - (salle.getNom().length() + 8)); i++) {
									System.out.print(" ");
									if (i == (37 - (salle.getNom().length() + 8))) {
										System.out.print("|\n");
									}
								}
								System.out.println("		|__________|______________________________________|");
								count++;
							}
							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "2":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							System.out.println("		____________________________________________");
							System.out.println("		|                       |                   |      ");
							System.out.println("		|       SALLE           |      CAPACITE     |");
							System.out.println("		|_______________________|___________________|");
							System.out.println("		|                       |                   |");
							for (int index = 0; index < list_salle_info.size(); index++) {
								System.out.println("		|                       |                   |");
								System.out.print("		|       " + list_salle_info.get(index).getNom()
										+ "           |         ");
								System.out.print(list_salle_info.get(index).getCapacite());
								for (int i = 0; i < (10
										- (String.valueOf(list_salle_info.get(index).getCapacite()).length())); i++) {
									System.out.print(" ");
									if (i == (9
											- (String.valueOf(list_salle_info.get(index).getCapacite()).length()))) {
										System.out.print("|\n");
									}
								}
								System.out.println("		|_______________________|___________________|");
							}

							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "3":
							boolean resever_salle = true;
							while (resever_salle) {
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");

								System.out.println("	-----------Info 1----------------\n");
								System.out.println("		1-Resever Salle\n");
								System.out.println("		2-Liberer Salle\n");
								System.out.println("		3-Etat salle\n");
								System.out.println("________________________________________");
								System.out.print("N:");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")) {
									test.afficher_msg_err();
									System.out.println("________________________________________");
									System.out.print("N:");
									saisie = lire.nextLine();
								}
								while (Integer.valueOf(saisie) == 3) {
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");

									count = 1;
									System.out.println("	    File Attente ");
									System.out.println("	________________________");
									System.out.println();
									for (Enseignant eng : test.file_attente) {
										System.out.println("		" + count + " " + eng.getNom());
										System.out.println();
										count++;
									}
									System.out.println("	________________________");

									System.out.println("TAPER ENTER POUR REVENIRE");

									while (!lire.nextLine().isEmpty()) {
										test.afficher_msg_err();

									}
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");

									System.out.println("	-----------Info 1----------------\n");
									System.out.println("		1-Resever Salle\n");
									System.out.println("		2-Liberer Salle\n");
									System.out.println("		3-Etat Fille\n");
									System.out.println("________________________________________");
									System.out.print("N:");
									saisie = lire.nextLine();
									while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")) {
										test.afficher_msg_err();
										System.out.println("________________________________________");
										System.out.print("N:");
										saisie = lire.nextLine();
									}

								}

								int i = 1;
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");

								System.out.println("\n*****************************************************");

								System.out.println("QUEL ENSEIGANAT ?");
								System.out.println("\n");
								System.out.println("     	 __________________________");
								System.out.println("  	|         |                |");
								System.out.println("  	|    N°   |    ENSEIGANT   |");
								System.out.println(" 	|_________|________________|");
								count = 1;
								for (Enseignant ennseignant : informatique.getEnseignant()) {
									System.out.print("  	|         |                |");
									System.out.print("  \n\t|    " + count + "    |    " + ennseignant.getNom());
									for (int k = 0; k < (26 - (ennseignant.getNom().length() + 14)); k++) {
										System.out.print(" ");
										if (k == (25 - (ennseignant.getNom().length() + 14))) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|_________|________________|");
									System.out.println();

									count++;
								}
								System.out.println("_________________________\n");
								System.out.print("N° Enseignant  : ");
								String n_enseignant = lire.nextLine();
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								while (!n_enseignant.equals("1") && !n_enseignant.equals("2")
										&& !n_enseignant.equals("3") && !n_enseignant.equals("4")
										&& !n_enseignant.equals("5")&& !n_enseignant.equals("6")
										&& !n_enseignant.equals("7")) {
									test.afficher_msg_err();
									n_enseignant = lire.nextLine();
								}
								switch (saisie) {
								case "1":
									test.Reserver_salle(list_enseignant_info.get(Integer.valueOf(n_enseignant) - 1));
									break;
								case "2":
									test.libere_salle(list_enseignant_info.get(Integer.valueOf(n_enseignant) - 1));
									break;
								}
								
								count = 1;
								System.out.println("	    File Attente ");
								System.out.println("	________________________");
								System.out.println();
								for (Enseignant eng : test.file_attente) {
									System.out.println("		" + count + " " + eng.getNom());
									System.out.println();
									count++;
								}
								
								
								System.out.println("\n \n \n \n \n");

								System.out.println("RESEVER AUTRE SALLE TAPER (Y)");
							
								System.out.println("REVENIRE MENU TAPER (N)");
								System.out.println("_________________________");
								System.out.print("REPONSE :");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("N")
										&& !saisie.equals("n") && !saisie.equals("A") && !saisie.equals("a")) {
									test.afficher_msg_err();
									saisie = lire.nextLine();
								}
								if (saisie.equals("N") || saisie.equals("n")) {
									resever_salle = false;
								} else {
									System.out.println("\n \n \n \n \n ");
									System.out.println("\n \n \n \n \n ");
									System.out.println("\n \n \n \n \n ");
									System.out.println("\n \n \n \n \n ");

									if (saisie.equals("A") || saisie.equals("a")) {
										if (test.file_attente.size() != 0) {
											count = 1;
											System.out.println("	    File Attente ");
											System.out.println("	________________________");
											System.out.println();
											for (Enseignant eng : test.file_attente) {
												System.out.println("		" + count + " " + eng.getNom());
												System.out.println();
												count++;
											}
											System.out.println("	________________________");

											System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
											System.out.println("\n \n \n \n");

											while (!(lire.nextLine().isEmpty())) {
											}
											System.out.println("\n \n \n \n");

										} else {
											System.out.println("FILE ATTENTE VIDE");

										}
									}

								}
							}

							break;

						case "4":
							test.affiche_Menu_Interaction();
							affich_salle = false;
							break;
						}
					}

					break;
				case "2":
					test.tri_capaciter_salle(list_salle_math);

					while (affich_salle) {

						test.menu_salle();

						saisie = lire.nextLine();
						while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")
								&& !saisie.equals("4")) {
							test.afficher_msg_err();
							saisie = lire.nextLine();
						}
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");

						switch (saisie) {

						case "1":
							count = 1;
							System.out.println("		__________________________________________________");
							System.out.println("		|          |                                      |");
							System.out.println("		|    N     |               SALLE                  |");
							System.out.println("		|__________|______________________________________|");
							for (Salle salle : list_salle_math) {
								System.out.println("		|          |                                      |");
								System.out.print("		|    " + count + "     |        " + salle.getNom());
								for (int i = 0; i < (38 - (salle.getNom().length() + 8)); i++) {
									System.out.print(" ");
									if (i == (37 - (salle.getNom().length() + 8))) {
										System.out.print("|\n");
									}
								}
								System.out.println("		|__________|______________________________________|");
								count++;
							}
							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "2":
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");
							System.out.println("\n");

							System.out.println("		____________________________________________");
							System.out.println("		|                       |                   |      ");
							System.out.println("		|       SALLE           |      CAPACITE     |");
							System.out.println("		|_______________________|___________________|");
							System.out.println("		|                       |                   |");
							for (int index = 0; index < list_salle_math.size(); index++) {
								System.out.println("		|                       |                   |");
								System.out.print("		|       " + list_salle_math.get(index).getNom()
										+ "           |         ");
								System.out.print(list_salle_math.get(index).getCapacite());
								for (int i = 0; i < (10
										- (String.valueOf(list_salle_math.get(index).getCapacite()).length())); i++) {
									System.out.print(" ");
									if (i == (9
											- (String.valueOf(list_salle_math.get(index).getCapacite()).length()))) {
										System.out.print("|\n");
									}
								}
								System.out.println("		|_______________________|___________________|");
							}

							System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
							System.out.println("\n \n \n \n");

							while (!(lire.nextLine().isEmpty())) {
							}

							System.out.println("\n \n \n");
							break;

						case "3":
							boolean resever_salle = true;
							while (resever_salle) {
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");

								System.out.println("	-----------Info 1----------------\n");
								System.out.println("		1-Resever Salle\n");
								System.out.println("		2-Liberer Salle\n");
								System.out.println("		3-Etat File\n");
								System.out.println("________________________________________");
								System.out.print("N:");
								saisie = lire.nextLine();
								while (!saisie.equals("1") && !saisie.equals("2")
										&& !saisie.equals("3")&& !saisie.equals("4")
										&& !saisie.equals("5")&& !saisie.equals("6")
										&& !saisie.equals("7")) {
									test.afficher_msg_err();
									System.out.println("________________________________________");
									System.out.print("N:");
									saisie = lire.nextLine();
								}
								while (Integer.valueOf(saisie) == 3) {
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");

									count = 1;
									System.out.println("	    File Attente ");
									System.out.println("	________________________");
									System.out.println();
									for (Enseignant eng : test.file_attente) {
										System.out.println("		" + count + " " + eng.getNom());
										System.out.println();
										count++;
									}
									System.out.println("	________________________");

									System.out.println("TAPER ENTER POUR REVENIRE");

									while (!lire.nextLine().isEmpty()) {
										test.afficher_msg_err();

									}
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");

									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");
									System.out.println("\n \n \n \n \n");

									System.out.println("	-----------math 1----------------\n");
									System.out.println("		1-Resever Salle\n");
									System.out.println("		2-Liberer Salle\n");
									System.out.println("		3-Etat salle\n");
									System.out.println("________________________________________");
									System.out.print("N:");
									saisie = lire.nextLine();
									while (!saisie.equals("1") && !saisie.equals("2") && !saisie.equals("3")) {
										test.afficher_msg_err();
										System.out.println("________________________________________");
										System.out.print("N:");
										saisie = lire.nextLine();
									}

								}

								int i = 1;
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");
								System.out.println("\n \n \n \n \n");

								System.out.println("\n*****************************************************");

								System.out.println("QUEL ENSEIGANAT ?");
								System.out.println("\n");
								System.out.println("     	 __________________________");
								System.out.println("  	|         |                |");
								System.out.println("  	|    N°   |    ENSEIGANT   |");
								System.out.println(" 	|_________|________________|");
								count = 1;
								for (Enseignant ennseignant : mathematique.getEnseignant()) {
									System.out.print("  	|         |                |");
									System.out.print("  \n\t|    " + count + "    |    " + ennseignant.getNom());
									for (int k = 0; k < (26 - (ennseignant.getNom().length() + 14)); k++) {
										System.out.print(" ");
										if (k == (25 - (ennseignant.getNom().length() + 14))) {
											System.out.print("|");
										}
									}

									System.out.print("\n  	|_________|________________|");
									System.out.println();

									count++;
								}
								System.out.println("_________________________\n");
								System.out.print("N° Enseignant  : ");
								String n_enseignant = lire.nextLine();
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								System.out.println("\n \n \n \n \n ");
								while (!n_enseignant.equals("1") && !n_enseignant.equals("2")
										&& !n_enseignant.equals("3") && !n_enseignant.equals("4")
										&& !n_enseignant.equals("5")) {
									test.afficher_msg_err();
									n_enseignant = lire.nextLine();
								}
								switch (saisie) {
								case "1":
									test.Reserver_salle(list_enseignant_math.get(Integer.valueOf(n_enseignant) - 1));
									break;
								case "2":
									test.libere_salle(list_enseignant_math.get(Integer.valueOf(n_enseignant) - 1));
									break;
								}
								System.out.println("\n \n \n \n \n");

								System.out.println("RESEVER AUTRE SALLE TAPER (Y)");
								System.out.println("AFFICHE ETAT FILE ATTENTE (A)");
								System.out.println("REVENIRE MENU TAPER (N)");
								System.out.println("_________________________");
								System.out.print("REPONSE :");
								saisie = lire.nextLine();
								while (!saisie.equals("Y") && !saisie.equals("y") && !saisie.equals("N")
										&& !saisie.equals("n") && !saisie.equals("A") && !saisie.equals("a")) {
									test.afficher_msg_err();
									saisie = lire.nextLine();
								}
								if (saisie.equals("N") || saisie.equals("n")) {
									resever_salle = false;
								} else {
									System.out.println("\n \n \n \n \n ");
									System.out.println("\n \n \n \n \n ");
									System.out.println("\n \n \n \n \n ");
									System.out.println("\n \n \n \n \n ");

									if (saisie.equals("A") || saisie.equals("a")) {
										if (test.file_attente.size() != 0) {
											count = 1;
											System.out.println("	    File Attente ");
											System.out.println("	________________________");
											System.out.println();
											for (Enseignant eng : test.file_attente) {
												System.out.println("		" + count + " " + eng.getNom());
												System.out.println();
												count++;
											}
											System.out.println("	________________________");

											System.out.println("\n \n POUR SORTIR TAPEZ ENTER....");
											System.out.println("\n \n \n \n");

											while (!(lire.nextLine().isEmpty())) {
											}
											System.out.println("\n \n \n \n");

										} else {
											System.out.println("FILE ATTENTE VIDE");

										}
									}

								}
							}

							break;

						case "4":
							test.affiche_Menu_Interaction();
							affich_salle = false;
							break;
						}
					}
				}
				break;

			case "7":
				System.out.println(" \n \n \n EN REVOIR ET DA BIEN TAUX");
				reponse = false;

				break;

			}

		}

		lire.close();
	}
}
