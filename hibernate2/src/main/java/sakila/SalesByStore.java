package sakila;




/**
 * SalesByStore created by Yassine
 */
public class SalesByStore  implements java.io.Serializable {


     private SalesByStoreId id;

    public SalesByStore() {
    }

    public SalesByStore(SalesByStoreId id) {
       this.id = id;
    }
   
    public SalesByStoreId getId() {
        return this.id;
    }
    
    public void setId(SalesByStoreId id) {
        this.id = id;
    }




}


