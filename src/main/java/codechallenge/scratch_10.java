package codechallenge;

// red hat
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Scratch10 {
    public static void main(String[] args) {

    }

    public static int priceCheck(List<String> products,
                                 List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        Map<String, Float> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            map.put(products.get(i), productPrices.get(i));
        }

        for (int i = 0; i < productSold.size(); i++) {
            if (Float.compare(map.get(productSold.get(i)), soldPrice.get(i)) != 0) {
                count++;
            }
        }

        return count;
    }
}