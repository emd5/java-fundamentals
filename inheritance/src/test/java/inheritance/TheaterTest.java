package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    // Test the theater constructor.
    @Test
    public void testTheaterConstructorPassInName(){
        Theater theater = new Theater("Sleepless In Seattle");
        assertTrue("Hashmap should have one key", theater.getMovieReviewList().containsKey("Sleepless In Seattle"));
    }

    // Test add one movie to the list
    @Test
    public void testAddOneMovie() {
        Theater theater = new Theater("Sleepless In Seattle");
        assertEquals("Should return the movie name", "Sleepless In Seattle", theater.getName());

    }

    // Test add multiple movies to the list
    @Test
    public void testAddMultipleMovies() {
        Theater theater = new Theater("Sleepless In Seattle");
        String[] movies = new String[]{"Ponyo", "Spirited Away", "Totoro"};
        for(String movie : movies){
            theater.addMovie(movie);
        }
        assertEquals("Should return the movie list has 2", 4, theater.getMovies().size());
    }

    // Test remove one movie from the list, should return 0
    @Test
    public void testRemoveMovie() {
        Theater theater = new Theater("Sleepless In Seattle");
        assertEquals("Should return the movie name", "Sleepless In Seattle", theater.getMovies().get(0));

        theater.removeMovie("Sleepless In Seattle" );

        assertEquals("Should return 0", 0, theater.getMovies().size());

    }

    //Test add one review, should return size of 1
    @Test
    public void testAddOneReview(){
        Theater theater = new Theater("Sleepless In Seattle");

        theater.addReview(new Review("Sleepless In Seattle was a great movie", "Liz", 3));

        assertEquals("Should return one review",1, theater.getReviews().size());
    }

    // Test add multiple reviews, should return size of 3
    @Test
    public  void testAddMultipleReviews(){
        Theater theater = new Theater("Sleepless In Seattle");

        theater.addReview(new Review("Sleepless In Seattle was a great movie", "Liz", 4));
        theater.addReview(new Review("Sleepless In Seattle not so great", "Bob", 1));
        theater.addReview(new Review("I cried", "Alice", 5));

        assertEquals("Should return one review",3, theater.getReviews().size());

    }
}