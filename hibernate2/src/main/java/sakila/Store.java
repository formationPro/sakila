package sakila;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Store created by Yassine
 */
public class Store  implements java.io.Serializable {


     private Byte storeId;
     private Address address;
     private Staff staff;
     private Date lastUpdate;
     private Set<Staff> staffs = new HashSet<Staff>(0);
     private Set<Inventory> inventories = new HashSet<Inventory>(0);
     private Set<Customer> customers = new HashSet<Customer>(0);

    public Store() {
    }

	
    public Store(Address address, Staff staff, Date lastUpdate) {
        this.address = address;
        this.staff = staff;
        this.lastUpdate = lastUpdate;
    }
    public Store(Address address, Staff staff, Date lastUpdate, Set<Staff> staffs, Set<Inventory> inventories, Set<Customer> customers) {
       this.address = address;
       this.staff = staff;
       this.lastUpdate = lastUpdate;
       this.staffs = staffs;
       this.inventories = inventories;
       this.customers = customers;
    }
   
    public Byte getStoreId() {
        return this.storeId;
    }
    
    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set<Staff> getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }
    public Set<Inventory> getInventories() {
        return this.inventories;
    }
    
    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }
    public Set<Customer> getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }




}


