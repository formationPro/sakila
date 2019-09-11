package sakila;




/**
 * T created by Yassine
 */
public class T  implements java.io.Serializable {


     private TId id;

    public T() {
    }

    public T(TId id) {
       this.id = id;
    }
   
    public TId getId() {
        return this.id;
    }
    
    public void setId(TId id) {
        this.id = id;
    }




}


