package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testTheaterConstructorPassInName(){
        Theater theater = new Theater("Sleepless In Seattle");
        assertTrue("Hashmap should have one key", theater.getMovieReviewList().containsKey("Sleepless In Seattle"));
    }
    @Test
    public void testAddOneMovie() {
        Theater theater = new Theater("Sleepless In Seattle");
        assertEquals("Should return the movie name", "Sleepless In Seattle", theater.getName());

    }

    @Test
    public void testAddMultipleMovies() {
        Theater theater = new Theater("Sleepless In Seattle");
        String[] movies = new String[]{"Ponyo", "Spirited Away", "Totoro"};
        for(String movie : movies){
            theater.addMovie(movie);
        }
        assertEquals("Should return the movie list has 2", 4, theater.getMovies().size());
    }


    @Test
    public void testRemoveMovie() {
        Theater theater = new Theater("Sleepless In Seattle");
        assertEquals("Should return the movie name", "Sleepless In Seattle", theater.getMovies().get(0));

        theater.removeMovie("Sleepless In Seattle" );

        assertEquals("Should return 0", 0, theater.getMovies().size());

    }

    @Test
    public void testAddOneReview() {

    }

    @Test
    public  void testAddMultipleReviews(){

    }
}