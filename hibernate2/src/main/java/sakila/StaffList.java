package sakila;




/**
 * StaffList created by Yassine
 */
public class StaffList  implements java.io.Serializable {


     private StaffListId id;

    public StaffList() {
    }

    public StaffList(StaffListId id) {
       this.id = id;
    }
   
    public StaffListId getId() {
        return this.id;
    }
    
    public void setId(StaffListId id) {
        this.id = id;
    }




}


