package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Theater implements IReview{

    private String name;
    private List<String> movies;
    private List<Review> theaterReviews;
    private HashMap<String, List<Review>> movieReviewList;

    public Theater(String name){
        this.name = name;
        this.movies = new ArrayList<>();
        this.theaterReviews = new LinkedList<>();
        this.movieReviewList = new HashMap<>();
        addMovie(this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setMovies(List<String> movies){
        this.movies = movies;
    }

    public List<String> getMovies(){
        return this.movies;
    }

    public HashMap<String, List<Review>> getMovieReviewList(){
        return this.movieReviewList;
    }

    public void addMovie(String movieName){
//        this.movies = new LinkedList<>();
        this.movies.add(movieName);
        for(String movie : movies){
            this.movieReviewList = new HashMap<>();
            this.movieReviewList.put(movie, new LinkedList<>());
        }
    }

    public void removeMovie(String movieName){
        if(this.movieReviewList.containsKey(movieName)){
            this.movieReviewList.remove(movieName);
            this.movies.remove(movieName);
        }
        else{
            throw new IllegalArgumentException("Movie is not found");
        }
    }

    @Override
    public List<Review> getReviews(){
        return this.theaterReviews;
    }

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
