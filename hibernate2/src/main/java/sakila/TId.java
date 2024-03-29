package sakila;



import java.util.Date;

/**
 * TId created by Yassine
 */
public class TId  implements java.io.Serializable {


     private short actorId;
     private String firstName;
     private String lastName;
     private Date lastUpdate;

    public TId() {
    }

    public TId(short actorId, String firstName, String lastName, Date lastUpdate) {
       this.actorId = actorId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.lastUpdate = lastUpdate;
    }
   
    public short getActorId() {
        return this.actorId;
    }
    
    public void setActorId(short actorId) {
        this.actorId = actorId;
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
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TId) ) return false;
		 TId castOther = ( TId ) other; 
         
		 return (this.getActorId()==castOther.getActorId())
 && ( (this.getFirstName()==castOther.getFirstName()) || ( this.getFirstName()!=null && castOther.getFirstName()!=null && this.getFirstName().equals(castOther.getFirstName()) ) )
 && ( (this.getLastName()==castOther.getLastName()) || ( this.getLastName()!=null && castOther.getLastName()!=null && this.getLastName().equals(castOther.getLastName()) ) )
 && ( (this.getLastUpdate()==castOther.getLastUpdate()) || ( this.getLastUpdate()!=null && castOther.getLastUpdate()!=null && this.getLastUpdate().equals(castOther.getLastUpdate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getActorId();
         result = 37 * result + ( getFirstName() == null ? 0 : this.getFirstName().hashCode() );
         result = 37 * result + ( getLastName() == null ? 0 : this.getLastName().hashCode() );
         result = 37 * result + ( getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode() );
         return result;
   }   


}


