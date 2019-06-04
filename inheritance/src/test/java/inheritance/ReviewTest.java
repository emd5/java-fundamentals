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
}