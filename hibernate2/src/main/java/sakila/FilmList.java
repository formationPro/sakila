package sakila;




/**
 * FilmList created by Yassine
 */
public class FilmList  implements java.io.Serializable {


     private FilmListId id;

    public FilmList() {
    }

    public FilmList(FilmListId id) {
       this.id = id;
    }
   
    public FilmListId getId() {
        return this.id;
    }
    
    public void setId(FilmListId id) {
        this.id = id;
    }




}


