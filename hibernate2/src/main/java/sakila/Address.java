package sakila;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Address created by Yassine
 */
public class Address  implements java.io.Serializable {


     private Short addressId;
     private City city;
     private String address;
     private String address2;
     private String district;
     private String postalCode;
     private String phone;
     private byte[] location;
     private Date lastUpdate;
     private Set<Staff> staffs = new HashSet<Staff>(0);
     private Set<Customer> customers = new HashSet<Customer>(0);
     private Set<Store> stores = new HashSet<Store>(0);

    public Address() {
    }

	
    public Address(City city, String address, String district, String phone, byte[] location, Date lastUpdate) {
        this.city = city;
        this.address = address;
        this.district = district;
        this.phone = phone;
        this.location = location;
        this.lastUpdate = lastUpdate;
    }
    public Address(City city, String address, String address2, String district, String postalCode, String phone, byte[] location, Date lastUpdate, Set<Staff> staffs, Set<Customer> customers, Set<Store> stores) {
       this.city = city;
       this.address = address;
       this.address2 = address2;
       this.district = district;
       this.postalCode = postalCode;
       this.phone = phone;
       this.location = location;
       this.lastUpdate = lastUpdate;
       this.staffs = staffs;
       this.customers = customers;
       this.stores = stores;
    }
   
    public Short getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public byte[] getLocation() {
        return this.location;
    }
    
    public void setLocation(byte[] location) {
        this.location = location;
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
    public Set<Customer> getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
    public Set<Store> getStores() {
        return this.stores;
    }
    
    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }




}


