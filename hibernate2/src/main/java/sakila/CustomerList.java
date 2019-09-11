package sakila;




/**
 * CustomerList created by Yassine
 */
public class CustomerList  implements java.io.Serializable {


     private CustomerListId id;

    public CustomerList() {
    }

    public CustomerList(CustomerListId id) {
       this.id = id;
    }
   
    public CustomerListId getId() {
        return this.id;
    }
    
    public void setId(CustomerListId id) {
        this.id = id;
    }




}


