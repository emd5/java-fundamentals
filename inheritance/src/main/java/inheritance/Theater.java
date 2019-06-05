package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This Theater class implements the IReview Interface
 */
public class Theater implements IReview{

    private String name;
    private List<String> movies;
    private List<Review> theaterReviews;
    private HashMap<String, List<Review>> movieReviewList;

    /**
     * The Constructor for the theater class
     *
     * @param name name of the movie
     */
    public Theater(String name){
        this.name = name;
        this.movies = new ArrayList<>();
        this.theaterReviews = new LinkedList<>();
        this.movieReviewList = new HashMap<>();
        addMovie(this.name);
    }

    /**
     * This gets the name of the movie
     *
     * @return String name of the movie
     */
    public String getName() {
        return this.name;
    }

    /**
     * This getter method lists of movies
     * @return the list of movies
     */
    public List<String> getMovies(){
        return this.movies;
    }

    /**
     * This getter method lists the entire hashmap of movies and a list of reviews.
     *
     * @return the hashmap of the movie review list
     */
    public HashMap<String, List<Review>> getMovieReviewList(){
        return this.movieReviewList;
    }

    /**
     * This method adds a movie to a movie list and adds a movie to the hashmap.
     * @param movieName the name of the movie
     */
    public void addMovie(String movieName){
        this.movies.add(movieName);
        for(String movie : movies){
            this.movieReviewList = new HashMap<>();
            this.movieReviewList.put(movie, new LinkedList<>());
        }
    }


    /**
     * This method removes a movie from the movies list and hashmap if it contains it, otherwise returns false.
     * @param movieName the name of the movie
     */
    public void removeMovie(String movieName){
        if(this.movieReviewList.containsKey(movieName)){
            this.movieReviewList.remove(movieName);
            this.movies.remove(movieName);
        }
        else{
            throw new IllegalArgumentException("Movie is not found");
        }
    }

    /**
     * This getter method gets the list of reviews
     * @return a list of theaterReviews
     */
    @Override
    public List<Review> getReviews(){
        return this.theaterReviews;
    }

    /**
     * This adds a review to the list and checks if the movie contains the name of the movie.
     *
     * @param review the new review for a movie.
     */
    @Override
    public void addReview(Review review) {
        this.theaterReviews.add(review);
        for (String movie : movies) {
            if (review.getDescription().contains(movie)) {
                List<Review> oneMovieReviews = this.movieReviewList.get(movie);
                oneMovieReviews.add(review);
                this.movieReviewList.put(movie, oneMovieReviews);
            }
        }
    }

    /**
     * A string representation of the Theater class
     *
     * @return string representation of the theater class
     */
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", theaterReviews=" + theaterReviews +
                ", movieReviewList=" + movieReviewList +
                '}';
    }

}
