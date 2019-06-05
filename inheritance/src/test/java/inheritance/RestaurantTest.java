package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    //Test the constructors parameters passing in name, stars, and price
    @Test
    public void testRestaurantConstructorWithGetters(){
        Restaurant restaurant = new Restaurant("Din Tai Fung","$$");

        assertEquals("Should return Din Tai Fung", "Din Tai Fung", restaurant.getName());
        assertEquals("Should return '$$'", "$$", restaurant.getPrice());
    }

    //Test the toString method in the restaurant class.
    @Test
    public void testToStringInRestaurantClass(){
        Restaurant restaurant = new Restaurant("Hardees","$");
        assertTrue((restaurant.toString()).contains("Hardees"));
    }


    //Test the restaurant constructors by passing into the constructor
    @Test
    public void testAddReviewSizeIsValid(){
        Restaurant restaurant = new Restaurant("Din Tai Fung","$$");

        Review lizReview = new Review("DTF is bomb", "Liz", 4);
        Review lizSecondReview = new Review("DTF is ok", "Liz", 2);

        restaurant.addReview(lizReview);
        restaurant.addReview(lizSecondReview);

        assertEquals( "Size of reviewList should be 1",1, restaurant.getReviews().size());
        assertEquals( "Size of reviewList should be 2",2, restaurant.getReviews().size());
    }

    @Test
    public void testGetReviews(){
        Restaurant restaurant = new Restaurant("McDonalds","$");

        Review newReview = new Review("This place was dirty", "Nick", 1);
        Review newReview2 = new Review("Fries are always crisp", "Sebastian", 4);

        restaurant.addReview(newReview);
        restaurant.addReview(newReview2);

        String expected = "[Review{description='This place was dirty', author='Nick', stars=1}, " +
                "Review{description='Fries are always crisp', author='Sebastian', stars=4}]";

        assertEquals("Returns a list of reviews", expected, restaurant.getReviews().toString() );
    }

}