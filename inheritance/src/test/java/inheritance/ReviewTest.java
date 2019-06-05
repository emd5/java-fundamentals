package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    //Test the review constructor with getters from the review class.
    @Test
    public void testReviewCostructorWithGetters(){
        Review review = new Review("This place is bomb", "Kira", 4);
        assertEquals("Should return \"This place is bomb\"", "This place is bomb", review.getDescription());
        assertEquals("Should return 'Kira'", "Kira", review.getAuthor());
        assertEquals("Should return 4", 4, review.getStars());
    }

    //Test the toString method in the review class
    @Test
    public void testToStringInReviewClass(){
        Review review = new Review("Cool Restaurant","Liz", 2);
        assertTrue(review.toString().contains("Liz"));
    }

    //Test add a review and see 2nd review contains a word in the review list.
    @Test
    public void testEntireToStringInReviewClass(){
        Restaurant restaurant = new Restaurant("El Gaucho", "$$$$");
        Review review = new Review("Cool Restaurant","Liz", 2);
        Review review2 = new Review("Very dark and omnious","Liz", 3);

        restaurant.addReview(review);
        assertTrue(review.toString().contains("Liz"));
        assertFalse(restaurant.getReviews().toString().contains("omnious"));

        restaurant.addReview(review2);
        assertTrue(restaurant.getReviews().toString().contains("omnious"));

        assertEquals("Should return new review in index 0", restaurant.getReviews().get(0), review);
        assertEquals("Should return review 2 in index 1", restaurant.getReviews().get(1), review2);
    }

}