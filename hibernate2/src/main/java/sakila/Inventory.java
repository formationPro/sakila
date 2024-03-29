package sakila;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Inventory created by Yassine
 */
public class Inventory  implements java.io.Serializable {


     private Integer inventoryId;
     private Film film;
     private Store store;
     private Date lastUpdate;
     private Set<Rental> rentals = new HashSet<Rental>(0);

    public Inventory() {
    }

	
    public Inventory(Film film, Store store, Date lastUpdate) {
        this.film = film;
        this.store = store;
        this.lastUpdate = lastUpdate;
    }
    public Inventory(Film film, Store store, Date lastUpdate, Set<Rental> rentals) {
       this.film = film;
       this.store = store;
       this.lastUpdate = lastUpdate;
       this.rentals = rentals;
    }
   
    public Integer getInventoryId() {
        return this.inventoryId;
    }
    
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }
    public Film getFilm() {
        return this.film;
    }
    
    public void setFilm(Film film) {
        this.film = film;
    }
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set<Rental> getRentals() {
        return this.rentals;
    }
    
    public void setRentals(Set<Rental> rentals) {
        this.rentals = rentals;
    }




}


