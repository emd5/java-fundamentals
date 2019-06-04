package inheritance;

public class Review {

    public String description;
    public String author;
    public int stars;

    public Review(String description, String author, int stars){
        this.description = description;
        this.author = author;
        this.stars = stars;
    }

    public String toString(){
        return this.description + " " + this.author + " " + this.stars;
    }
}
