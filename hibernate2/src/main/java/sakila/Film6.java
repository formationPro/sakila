package sakila;




/**
 * Film6 created by Yassine
 */
public class Film6  implements java.io.Serializable {


     private Film6Id id;

    public Film6() {
    }

    public Film6(Film6Id id) {
       this.id = id;
    }
   
    public Film6Id getId() {
        return this.id;
    }
    
    public void setId(Film6Id id) {
        this.id = id;
    }




}


