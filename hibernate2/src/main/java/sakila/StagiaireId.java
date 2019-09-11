package sakila;



import java.util.Date;

/**
 * StagiaireId created by Yassine
 */
public class StagiaireId  implements java.io.Serializable {


     private Integer id;
     private String nom;
     private String prenom;
     private Date dateNaissance;

    public StagiaireId() {
    }

    public StagiaireId(Integer id, String nom, String prenom, Date dateNaissance) {
       this.id = id;
       this.nom = nom;
       this.prenom = prenom;
       this.dateNaissance = dateNaissance;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StagiaireId) ) return false;
		 StagiaireId castOther = ( StagiaireId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getNom()==castOther.getNom()) || ( this.getNom()!=null && castOther.getNom()!=null && this.getNom().equals(castOther.getNom()) ) )
 && ( (this.getPrenom()==castOther.getPrenom()) || ( this.getPrenom()!=null && castOther.getPrenom()!=null && this.getPrenom().equals(castOther.getPrenom()) ) )
 && ( (this.getDateNaissance()==castOther.getDateNaissance()) || ( this.getDateNaissance()!=null && castOther.getDateNaissance()!=null && this.getDateNaissance().equals(castOther.getDateNaissance()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getNom() == null ? 0 : this.getNom().hashCode() );
         result = 37 * result + ( getPrenom() == null ? 0 : this.getPrenom().hashCode() );
         result = 37 * result + ( getDateNaissance() == null ? 0 : this.getDateNaissance().hashCode() );
         return result;
   }   


}


