package sakila;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Actor created by Yassine
 */
public class Actor  implements java.io.Serializable {


     private Short actorId;
     private String firstName;
     private String lastName;
     private Date lastUpdate;
     private Set<FilmActor> filmActors = new HashSet<FilmActor>(0);

    public Actor() {
    }

	
    public Actor(String firstName, String lastName, Date lastUpdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }
    public Actor(String firstName, String lastName, Date lastUpdate, Set<FilmActor> filmActors) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.lastUpdate = lastUpdate;
       this.filmActors = filmActors;
    }
   
    public Short getActorId() {
        return this.actorId;
    }
    
    public void setActorId(Short actorId) {
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
    public Set<FilmActor> getFilmActors() {
        return this.filmActors;
    }
    
    public void setFilmActors(Set<FilmActor> filmActors) {
        this.filmActors = filmActors;
    }




}


