package projet;

public  abstract class Personne {

private String nom;
private String prenom;
private String telephone ;
private String mail;

public Personne(String nom , String prenom , String telephone , String mail)
{
this.nom = nom;
this.prenom = prenom;
this.telephone = telephone;
this.mail = mail;
     
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void impr_Fiche_Signalitique(){
    	System.out.println( "	 ______________________________________________");
    	System.out.println("	|                                             |");
    	System.out.println("	|              FICHE SIGNALITIQUE             |");
    	System.out.println("	|_____________________________________________|");
        System.out.println("	|          |                                  | ");
    	System.out.print("	|  NOM     |   "+this.nom); 
    	
    	for (int i = 0; i < (34-(nom.length()+3)); i++) { System.out.print(" ");
    		if(i==(33-(nom.length()+3))) {   System.out.print("|\n");		}
		}
    	System.out.println("	|__________|__________________________________|");
        System.out.println("	|          |                                  | ");
        System.out.print("	|  PRENOM  |   "+this.prenom);
        
        for (int i = 0; i < (34-(prenom.length()+3)); i++) { System.out.print(" ");
    		if(i==(33-(prenom.length()+3))) { System.out.print("|\n");		}
		}
    	System.out.println("	|__________|__________________________________|");
    	System.out.println("	|          |                                  | ");
    	System.out.print("	|  EMAIL   |   "+this.mail);
    	for (int i = 0; i < (34-(mail.length()+3)); i++) { System.out.print(" ");
    		if(i==(33-(mail.length()+3))) { System.out.print("|\n");		}
		}
    	System.out.println("	|__________|__________________________________|");
    	System.out.println("	|          |                                  | ");
    	System.out.print("	|  TEL     |   "+this.telephone);
    	for (int i = 0; i < (34-(telephone.length()+3)); i++) { System.out.print(" ");
    		if(i==(33-(telephone.length()+3))) { System.out.print("|\n");	}
		}
    	System.out.println("	|__________|__________________________________|");
    }
}
