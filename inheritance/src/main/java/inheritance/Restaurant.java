package inheritance;

/** Create a class to represent a Restaurant.
 * Each Restaurant should have a name, a number of stars betweeen 0 and 5,
 * and a price category (i.e. number of dollar signs).
 * Implement a Restaurant constructor.
 * Test that your Restaurant constructor is behaving reasonably.
 * Implement a reasonable toString method for Restaurants.
 * **/
public class Restaurant {

    protected String name;
    protected int stars;
    protected String price;

    public Restaurant(String name, int stars, String price){
        this.name =name;
        this.stars = 0;
        this.price = price;
    }

    public String toString(){
        return "Name: "+this.name+" | Stars: "+ this.stars +" | Price: "+ this.price;
    }

    public totalStars(){
        int total = 0;

    }

//    int total = 0;
//        for (Review review : reviews) {
//        total += review.getStars();
//    }
//        this.stars = total/reviews.size();


}
