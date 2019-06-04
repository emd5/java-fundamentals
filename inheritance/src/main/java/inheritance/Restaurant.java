package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Restaurant class that has its own instance methods.
 * **/
public class Restaurant{

    private String name;
    private int stars;
    private String price;
    private List<Review> reviews;


    /**
     * The constructor method of the Restaurant class that accepts name and price.
     * @param name String of the restaurant name
     * @param price String of dollar sign characters
     */
    public Restaurant(String name, String price){
        this.name = name;
        this.stars = 0;
        this.price = price;
        this.reviews = null;
    }

    /**
     * This method gets the name of the restaurant.
     *
     * @return String name of the restaurant.
     */
    public String getName() {
        return this.name;
    }


    /**
     * This method gets the price (i.e. $$$$) of the restaurants based from the review
     * @return
     * String price in dollar signs.
     */
    public String getPrice() {
        return this.price;
    }

    /**
     * This method should take in a Review instance, and associate that review with this Restaurant.
     *
     * @param newReview
     */
    public void addReview(Review newReview){
        if(this.reviews == null){
            List<Review> reviewList  = new ArrayList<>();
            reviewList.add(newReview);
            this.reviews = reviewList;
        }
        else{
            this.reviews.add(newReview);
        }
        getAverageStars();
    }

    /**
     * Calculate the total number of stars then compute the average.
     */
    public void getAverageStars(){
        int total = 0;

        for(Review review: reviews){
            total += review.getStars();
        }

        this.stars = total/reviews.size();
    }

    /**
     * This method displays the message for the restaurant class.
     *
     * @return String of the restaurant
     */
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + this.name + '\'' +
                ", price='" + this.price + '\'' +
                '}';
    }
}
