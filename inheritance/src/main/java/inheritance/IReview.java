package inheritance;

import java.util.List;

/**
 * This is the Interface Review to get and add Reviews.
 */
public interface IReview {
    List<Review> getReviews();
    void addReview(Review review);
}

