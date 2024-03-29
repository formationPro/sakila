package sakila;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer created by Yassine
 */
public class Customer  implements java.io.Serializable {


     private Short customerId;
     private Address address;
     private Store store;
     private String firstName;
     private String lastName;
     private String email;
     private boolean active;
     private Date createDate;
     private Date lastUpdate;
     private Set<Payment> payments = new HashSet<Payment>(0);
     private Set<Rental> rentals = new HashSet<Rental>(0);

    public Customer() {
    }

	
    public Customer(Address address, Store store, String firstName, String lastName, boolean active, Date createDate) {
        this.address = address;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createDate = createDate;
    }
    public Customer(Address address, Store store, String firstName, String lastName, String email, boolean active, Date createDate, Date lastUpdate, Set<Payment> payments, Set<Rental> rentals) {
       this.address = address;
       this.store = store;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.active = active;
       this.createDate = createDate;
       this.lastUpdate = lastUpdate;
       this.payments = payments;
       this.rentals = rentals;
    }
   
    public Short getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
    public Set<Rental> getRentals() {
        return this.rentals;
    }
    
    public void setRentals(Set<Rental> rentals) {
        this.rentals = rentals;
    }




}


