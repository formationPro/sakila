package sakila;




/**
 * Film2 created by Yassine
 */
public class Film2  implements java.io.Serializable {


     private Film2Id id;

    public Film2() {
    }

    public Film2(Film2Id id) {
       this.id = id;
    }
   
    public Film2Id getId() {
        return this.id;
    }
    
    public void setId(Film2Id id) {
        this.id = id;
    }




}


