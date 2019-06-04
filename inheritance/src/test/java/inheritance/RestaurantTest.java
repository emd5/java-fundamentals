package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant restaurant = new Restaurant("Din Tai Fung", 4, "$$$");

        String expected = "Name: Din Tai Fung | Stars: 4 | Price: $$$";
        assertEquals("Display the message", expected, restaurant.toString() );
    }
}