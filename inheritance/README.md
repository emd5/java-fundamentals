# Composition and Inheritance, Part 1

This lab is to create classes and interfaces to represent reviews of restaurants.

## Version

1.0.0

## Feature Task

### 6/04/19

- [x] Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, 
and a price category (i.e. number of dollar signs).
    - [x] Implement a Restaurant constructor.
    - [x] Test the Restaurant constructor is behaving reasonably.
    - [x] Implement a reasonable toString method for Restaurants.
    - [x] Write a test to create an instance of Restaurant and ensure that its toString is working properly.
- [x] Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
    - [x] Write a Review constructor.
    - [x] Test that your constructor is working reasonably.
    - [x] Implement a reasonable toString method for Reviews.
    - [x] Write a test to create an instance of Review and ensure that its toString is working properly.
- [x] A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
    - [x] Should a Review know which Restaurant it is about?
    - [x] Should a Restaurant know which Reviews are about it?
    - [x] Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
    - [x] Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.
- [x] Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
    - [x] Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
- [x] When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)
