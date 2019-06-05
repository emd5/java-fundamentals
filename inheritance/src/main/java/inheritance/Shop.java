package inheritance;

import java.util.LinkedList;
import java.util.List;

/**
 * This Shop class contains instances methods and implements the interface review
 */
public class Shop implements IReview{

    private String shopName;
    private String shopDescription;
    private String shopPrice;
    private List<Review> reviewShopList;

    /**
     * This represents the dollar sign for the price for a particular shop
     */
    private enum DollarSigns{
        $, $$, $$$, $$$$;
    }

    /**
     * This is the constructor for the shop class.
     *
     * @param shopName name of the shop
     * @param shopDescription a description of the shop
     * @param shopPrice the price of the shop represented as dollar signs
     */
    public Shop(String shopName, String shopDescription, String shopPrice) {
        this.shopName = setShopName(shopName);
        this.shopDescription = setShopDescription(shopDescription);
        this.shopPrice = setShopPrice(shopPrice);
        this.reviewShopList = null;
    }

    /**
     * A getter method that returns the shop name
     * @return name of the shop
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * A getter method that returns the shop description
     * @return description of the shop
     */
    public String getShopDescription() {
        return shopDescription;
    }

    /**
     * A getter method that returns the shop price in dollar signs
     * @return shop price in dollar signs
     */
    public String getShopPrice() {
        return shopPrice;
    }

    /**
     * This method sets the shop name, otherwise returns exception
     * @param shopName the name of the shop
     * @return the shop description
     */
    public String setShopName(String shopName) {
        if(shopName == null || shopName.equals("")){
            throw new IllegalArgumentException("Shop Name cannot be empty");
        }
        return this.shopName = shopName;
    }

    /**
     * This method sets the shop description, otherwise returns exception
     * @param shopDescription the description of the shop
     * @return the shop description
     */
    public String setShopDescription(String shopDescription) {
        if(shopDescription == null || shopDescription.equals("")){
            throw new IllegalArgumentException("Shop Name cannot be null");
        }
        return this.shopDescription = shopDescription;
    }


    /**
     * This method sets the shop price, other returns exception
     * @param shopPrice the price of the shop represented in dollar signs
     * @return the shop price
     */
    public String setShopPrice(String shopPrice) {
        if(shopPrice.equals(DollarSigns.valueOf(shopPrice).toString())){
            this.shopPrice = shopPrice;
        }
        else{
            throw new IllegalArgumentException("Invalid dollar sign, must be '$', '$$', '$$$' or '$$$$'");
        }

        return this.shopPrice;
    }

    /**
     * This method adds a review for the shop.
     * @param newReview a new review for the shop
     */
    @Override
    public void addReview(Review newReview){
        if(this.reviewShopList == null){
            List<Review> reviewList  = new LinkedList<>();
            reviewList.add(newReview);
            this.reviewShopList = reviewList;
        }
        else{
            this.reviewShopList.add(newReview);
        }

    }

    /**
     * This getter method returns a list of reviews
     * @return a list of shop reviews
     */
    public List<Review> getReviews(){
        return this.reviewShopList;
    }

    /**
     * The string representation of the shop class
     * @return The string representation of the shop class
     */
    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopDescription='" + shopDescription + '\'' +
                ", shopPrice='" + shopPrice + '\'' +
                '}';
    }
}
