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
    public void testRestaurantConstructorWithStarValue(){
        Restaurant restaurant = new Restaurant("Din Tai Fung","$$");

        Review lizReview = new Review("DTF is bomb", "Liz", 4);

        restaurant.addReview(lizReview);

        String expected = "Restaurant{name='Din Tai Fung', price='$$'}";

        assertEquals("Should return Din Tai Fung, $$", expected, restaurant.toString());
        assertEquals("Review{description='DTF is bomb', author='Liz', stars=4}", lizReview.toString());

    }

}