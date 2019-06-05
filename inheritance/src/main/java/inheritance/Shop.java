package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Shop {

    private String shopName;
    private String shopDescription;
    private String shopPrice;
    private List<Review> reviewShopList;

    private enum DollarSigns{
        $, $$, $$$, $$$$;
    }

    public Shop(String shopName, String shopDescription, String shopPrice) {
        this.shopName = setShopName(shopName);
        this.shopDescription = setShopDescription(shopDescription);
        this.shopPrice = setShopPrice(shopPrice);
        this.reviewShopList = null;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public String setShopName(String shopName) {
        if(shopName == null || shopName.equals("")){
            throw new IllegalArgumentException("Shop Name cannot be null");
        }
        return this.shopName = shopName;
    }

    public String setShopDescription(String shopDescription) {
        if(shopDescription == null || shopDescription.equals("")){
            throw new IllegalArgumentException("Shop Name cannot be null");
        }
        return this.shopDescription = shopDescription;
    }

    public String setShopPrice(String shopPrice) {
        if(shopPrice.equals(DollarSigns.valueOf(shopPrice).toString())){
            this.shopPrice = shopPrice;
        }
        else{
            throw new IllegalArgumentException("Invalid dollar sign, must be '$', '$$', '$$$' or '$$$$'");
        }

        return this.shopPrice;
    }

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

    public List<Review> getReviews(){
        return this.reviewShopList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopDescription='" + shopDescription + '\'' +
                ", shopPrice='" + shopPrice + '\'' +
                '}';
    }

}
