package sakila;




/**
 * SalesByFilmCategory created by Yassine
 */
public class SalesByFilmCategory  implements java.io.Serializable {


     private SalesByFilmCategoryId id;

    public SalesByFilmCategory() {
    }

    public SalesByFilmCategory(SalesByFilmCategoryId id) {
       this.id = id;
    }
   
    public SalesByFilmCategoryId getId() {
        return this.id;
    }
    
    public void setId(SalesByFilmCategoryId id) {
        this.id = id;
    }




}


