import java.util.ArrayList;

public class AdvertisementManager {
    public static void main(String[] args) {
        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("Clearance Sale - Up to 70% Off");
        ads.add("Free Shipping on Orders Over $50");

        System.out.println("Original ads: " + ads);

        // Removing an ad by index
        ads.remove(0); // Remove the first ad
        System.out.println("Ads after removing the first ad: " + ads);

        // Removing an ad by content
        ads.remove("Clearance Sale - Up to 70% Off");
        System.out.println("Ads after removing 'Clearance Sale': " + ads);
        System.out.println("Number of ads: " + ads.size());
    }
}
