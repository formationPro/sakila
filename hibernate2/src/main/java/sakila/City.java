package sakila;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *Yassine
 */
public class City  implements java.io.Serializable {


     private Short cityId;
     private Country country;
     private String city;
     private Date lastUpdate;
     private Set<Address> addresses = new HashSet<Address>(0);

    public City() {
    }

	
    public City(Country country, String city, Date lastUpdate) {
        this.country = country;
        this.city = city;
        this.lastUpdate = lastUpdate;
    }
    public City(Country country, String city, Date lastUpdate, Set<Address> addresses) {
       this.country = country;
       this.city = city;
       this.lastUpdate = lastUpdate;
       this.addresses = addresses;
    }
   
    public Short getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }
    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set<Address> getAddresses() {
        return this.addresses;
    }
    
    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }




}


