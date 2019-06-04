package inheritance;

/**
 * The Review class with its instance methods
 */
public class Review {

    private String description;
    private String author;
    private int starReview;

    /**
     * The constructor of the Review class that accepts the restaurant description, author of the review, and the
     * star rating for the restaurant.
     *
     * @param description String of authors review of the restaurant
     * @param author String the authors name
     * @param stars int the star rating for the restaurant
     */
    public Review(String description, String author, int stars){
        this.description = description;
        this.author = author;
        this.starReview = stars;
    }

    /**
     * A getter method that returns a description
     *
     * @return String review of the restaurant
     */
    public String getDescription() {
        return this.description;
    }


    /**
     * A getter method that returns the name of the author
     *
     * @return String of the authors name
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * A getter method that returns a star rating
     *
     * @return int the star value of the restaurant
     */
    public int getStars() {
        return this.starReview;
    }

    /**
     * A string representation of the review class
     *
     * @return String representation of the review class.
     */
    @Override
    public String toString() {
        return "Review{" +
                "description='" + this.description + '\'' +
                ", author='" + this.author + '\'' +
                ", stars=" + this.starReview +
                '}';
    }

}
