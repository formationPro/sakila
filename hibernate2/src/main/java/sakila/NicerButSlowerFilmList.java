package sakila;




/**
 * NicerButSlowerFilmList created by Yassine
 */
public class NicerButSlowerFilmList  implements java.io.Serializable {


     private NicerButSlowerFilmListId id;

    public NicerButSlowerFilmList() {
    }

    public NicerButSlowerFilmList(NicerButSlowerFilmListId id) {
       this.id = id;
    }
   
    public NicerButSlowerFilmListId getId() {
        return this.id;
    }
    
    public void setId(NicerButSlowerFilmListId id) {
        this.id = id;
    }




}


