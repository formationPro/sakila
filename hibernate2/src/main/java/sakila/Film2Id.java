package sakila;



import java.math.BigDecimal;
import java.util.Date;

/**
 * Film2Id created by Yassine
 */
public class Film2Id  implements java.io.Serializable {


     private short filmId;
     private String title;
     private String description;
     private Date releaseYear;
     private byte languageId;
     private Byte originalLanguageId;
     private byte rentalDuration;
     private BigDecimal rentalRate;
     private Short length;
     private BigDecimal replacementCost;
     private String rating;
     private String specialFeatures;
     private Date lastUpdate;

    public Film2Id() {
    }

	
    public Film2Id(short filmId, String title, byte languageId, byte rentalDuration, BigDecimal rentalRate, BigDecimal replacementCost, Date lastUpdate) {
        this.filmId = filmId;
        this.title = title;
        this.languageId = languageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
        this.lastUpdate = lastUpdate;
    }
    public Film2Id(short filmId, String title, String description, Date releaseYear, byte languageId, Byte originalLanguageId, byte rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, String rating, String specialFeatures, Date lastUpdate) {
       this.filmId = filmId;
       this.title = title;
       this.description = description;
       this.releaseYear = releaseYear;
       this.languageId = languageId;
       this.originalLanguageId = originalLanguageId;
       this.rentalDuration = rentalDuration;
       this.rentalRate = rentalRate;
       this.length = length;
       this.replacementCost = replacementCost;
       this.rating = rating;
       this.specialFeatures = specialFeatures;
       this.lastUpdate = lastUpdate;
    }
   
    public short getFilmId() {
        return this.filmId;
    }
    
    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getReleaseYear() {
        return this.releaseYear;
    }
    
    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }
    public byte getLanguageId() {
        return this.languageId;
    }
    
    public void setLanguageId(byte languageId) {
        this.languageId = languageId;
    }
    public Byte getOriginalLanguageId() {
        return this.originalLanguageId;
    }
    
    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }
    public byte getRentalDuration() {
        return this.rentalDuration;
    }
    
    public void setRentalDuration(byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }
    
    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }
    public Short getLength() {
        return this.length;
    }
    
    public void setLength(Short length) {
        this.length = length;
    }
    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }
    
    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }
    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getSpecialFeatures() {
        return this.specialFeatures;
    }
    
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
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
		 if ( !(other instanceof Film2Id) ) return false;
		 Film2Id castOther = ( Film2Id ) other; 
         
		 return (this.getFilmId()==castOther.getFilmId())
 && ( (this.getTitle()==castOther.getTitle()) || ( this.getTitle()!=null && castOther.getTitle()!=null && this.getTitle().equals(castOther.getTitle()) ) )
 && ( (this.getDescription()==castOther.getDescription()) || ( this.getDescription()!=null && castOther.getDescription()!=null && this.getDescription().equals(castOther.getDescription()) ) )
 && ( (this.getReleaseYear()==castOther.getReleaseYear()) || ( this.getReleaseYear()!=null && castOther.getReleaseYear()!=null && this.getReleaseYear().equals(castOther.getReleaseYear()) ) )
 && (this.getLanguageId()==castOther.getLanguageId())
 && ( (this.getOriginalLanguageId()==castOther.getOriginalLanguageId()) || ( this.getOriginalLanguageId()!=null && castOther.getOriginalLanguageId()!=null && this.getOriginalLanguageId().equals(castOther.getOriginalLanguageId()) ) )
 && (this.getRentalDuration()==castOther.getRentalDuration())
 && ( (this.getRentalRate()==castOther.getRentalRate()) || ( this.getRentalRate()!=null && castOther.getRentalRate()!=null && this.getRentalRate().equals(castOther.getRentalRate()) ) )
 && ( (this.getLength()==castOther.getLength()) || ( this.getLength()!=null && castOther.getLength()!=null && this.getLength().equals(castOther.getLength()) ) )
 && ( (this.getReplacementCost()==castOther.getReplacementCost()) || ( this.getReplacementCost()!=null && castOther.getReplacementCost()!=null && this.getReplacementCost().equals(castOther.getReplacementCost()) ) )
 && ( (this.getRating()==castOther.getRating()) || ( this.getRating()!=null && castOther.getRating()!=null && this.getRating().equals(castOther.getRating()) ) )
 && ( (this.getSpecialFeatures()==castOther.getSpecialFeatures()) || ( this.getSpecialFeatures()!=null && castOther.getSpecialFeatures()!=null && this.getSpecialFeatures().equals(castOther.getSpecialFeatures()) ) )
 && ( (this.getLastUpdate()==castOther.getLastUpdate()) || ( this.getLastUpdate()!=null && castOther.getLastUpdate()!=null && this.getLastUpdate().equals(castOther.getLastUpdate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFilmId();
         result = 37 * result + ( getTitle() == null ? 0 : this.getTitle().hashCode() );
         result = 37 * result + ( getDescription() == null ? 0 : this.getDescription().hashCode() );
         result = 37 * result + ( getReleaseYear() == null ? 0 : this.getReleaseYear().hashCode() );
         result = 37 * result + this.getLanguageId();
         result = 37 * result + ( getOriginalLanguageId() == null ? 0 : this.getOriginalLanguageId().hashCode() );
         result = 37 * result + this.getRentalDuration();
         result = 37 * result + ( getRentalRate() == null ? 0 : this.getRentalRate().hashCode() );
         result = 37 * result + ( getLength() == null ? 0 : this.getLength().hashCode() );
         result = 37 * result + ( getReplacementCost() == null ? 0 : this.getReplacementCost().hashCode() );
         result = 37 * result + ( getRating() == null ? 0 : this.getRating().hashCode() );
         result = 37 * result + ( getSpecialFeatures() == null ? 0 : this.getSpecialFeatures().hashCode() );
         result = 37 * result + ( getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode() );
         return result;
   }   


}


