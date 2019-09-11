package sakila;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Category created by Yassine
 */
public class Category  implements java.io.Serializable {


     private Byte categoryId;
     private String name;
     private Date lastUpdate;
     private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>(0);

    public Category() {
    }

	
    public Category(String name, Date lastUpdate) {
        this.name = name;
        this.lastUpdate = lastUpdate;
    }
    public Category(String name, Date lastUpdate, Set<FilmCategory> filmCategories) {
       this.name = name;
       this.lastUpdate = lastUpdate;
       this.filmCategories = filmCategories;
    }
   
    public Byte getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set<FilmCategory> getFilmCategories() {
        return this.filmCategories;
    }
    
    public void setFilmCategories(Set<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }




}


