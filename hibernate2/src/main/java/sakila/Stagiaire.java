package sakila;




/**
 * Stagiaire created by Yassine
 */
public class Stagiaire  implements java.io.Serializable {


     private StagiaireId id;

    public Stagiaire() {
    }

    public Stagiaire(StagiaireId id) {
       this.id = id;
    }
   
    public StagiaireId getId() {
        return this.id;
    }
    
    public void setId(StagiaireId id) {
        this.id = id;
    }




}


