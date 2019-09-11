package sakila;




/**
 * ActorInfo created by Yassine
 */
public class ActorInfo  implements java.io.Serializable {


     private ActorInfoId id;

    public ActorInfo() {
    }

    public ActorInfo(ActorInfoId id) {
       this.id = id;
    }
   
    public ActorInfoId getId() {
        return this.id;
    }
    
    public void setId(ActorInfoId id) {
        this.id = id;
    }




}


