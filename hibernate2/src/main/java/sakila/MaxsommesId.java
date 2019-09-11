package sakila;



import java.math.BigDecimal;

/**
 * MaxsommesId created by Yassine
 */
public class MaxsommesId  implements java.io.Serializable {


     private Integer customerId;
     private Integer storeId;
     private String firstName;
     private String lastName;
     private BigDecimal max(sommes);

    public MaxsommesId() {
    }

    public MaxsommesId(Integer customerId, Integer storeId, String firstName, String lastName, BigDecimal max(sommes)) {
       this.customerId = customerId;
       this.storeId = storeId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.max(sommes) = max(sommes);
    }
   
    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Integer getStoreId() {
        return this.storeId;
    }
    
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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
    public BigDecimal getMax(sommes)() {
        return this.max(sommes);
    }
    
    public void setMax(sommes)(BigDecimal max(sommes)) {
        this.max(sommes) = max(sommes);
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MaxsommesId) ) return false;
		 MaxsommesId castOther = ( MaxsommesId ) other; 
         
		 return ( (this.getCustomerId()==castOther.getCustomerId()) || ( this.getCustomerId()!=null && castOther.getCustomerId()!=null && this.getCustomerId().equals(castOther.getCustomerId()) ) )
 && ( (this.getStoreId()==castOther.getStoreId()) || ( this.getStoreId()!=null && castOther.getStoreId()!=null && this.getStoreId().equals(castOther.getStoreId()) ) )
 && ( (this.getFirstName()==castOther.getFirstName()) || ( this.getFirstName()!=null && castOther.getFirstName()!=null && this.getFirstName().equals(castOther.getFirstName()) ) )
 && ( (this.getLastName()==castOther.getLastName()) || ( this.getLastName()!=null && castOther.getLastName()!=null && this.getLastName().equals(castOther.getLastName()) ) )
 && ( (this.getMax(sommes)()==castOther.getMax(sommes)()) || ( this.getMax(sommes)()!=null && castOther.getMax(sommes)()!=null && this.getMax(sommes)().equals(castOther.getMax(sommes)()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCustomerId() == null ? 0 : this.getCustomerId().hashCode() );
         result = 37 * result + ( getStoreId() == null ? 0 : this.getStoreId().hashCode() );
         result = 37 * result + ( getFirstName() == null ? 0 : this.getFirstName().hashCode() );
         result = 37 * result + ( getLastName() == null ? 0 : this.getLastName().hashCode() );
         result = 37 * result + ( getMax(sommes)() == null ? 0 : this.getMax(sommes)().hashCode() );
         return result;
   }   


}


