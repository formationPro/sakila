package sakila;




/**
 * Maxsommes created by Yassine
 */
public class Maxsommes  implements java.io.Serializable {


     private MaxsommesId id;

    public Maxsommes() {
    }

    public Maxsommes(MaxsommesId id) {
       this.id = id;
    }
   
    public MaxsommesId getId() {
        return this.id;
    }
    
    public void setId(MaxsommesId id) {
        this.id = id;
    }




}


