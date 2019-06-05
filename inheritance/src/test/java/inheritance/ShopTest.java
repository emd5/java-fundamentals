package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    // Test a happy path constructor with valid parameters
    @Test
    public void testShopConstructor(){
        Shop shop = new Shop("Macy's", "Department Store", "$$");
        assertEquals("Should return 'Macy\'s'","Macy's", shop.getShopName());
        assertEquals("Should return 'Department Store'","Department Store", shop.getShopDescription());
        assertEquals("Should return '$$'","$$", shop.getShopPrice());
    }

    // Test a constructor with invalid parameters
    @Test(expected = IllegalArgumentException.class)
    public void testShopConstructorInvalidInput(){
        Shop shop = new Shop("", "", "");
        assertEquals("Shop name invalid", "Shop name cannot be null", shop.getShopName());
        assertEquals("Shop description invalid", "Shop description cannot be null", shop.getShopDescription());
        assertEquals("Shop price invalid", "Shop price cannot be null", shop.getShopPrice());
    }

    // Test add one shop review where the shop review list size is 1
    @Test
    public void testAddOneReview() {
        Shop shop = new Shop("Express", "Dressy Clothes", "$$$");
        shop.addReview(new Review("Love Express", "Liz", 3));

        assertEquals("Should return one review", 1, shop.getReviews().size());
    }

    // Test add 2 shop reviews where the shop review list size is 2
    @Test
    public void testAddMultipleReviews(){
        Shop shop = new Shop("Express", "Dressy Clothes", "$$$");
        shop.addReview(new Review("Express has nice suits", "Tom", 4));
        shop.addReview(new Review("Love Express", "Liz", 3));

        assertTrue("Size of list is 2", shop.getReviews().size() == 2);
    }

    // Test the toString method that contains the shopDescription
    @Test
    public void testToStringInShopClass() {
        Shop shop = new Shop("JCPenney", "Another Department Store", "$$" );

        assertTrue((shop.toString()).contains("Another Department Store"));
    }
}
