package Lab2;
import java.util.ArrayList;

public class Lab2 {
    static ArrayList<String> basket = new ArrayList<>();
    public static void addProducts(String product){
        basket.add(product);
    }
    protected static void showBasket() {
        for (int i = 0; i < basket.size(); i++) {
            String value = basket.get(i);
            System.out.println(value);
        }
    }
}
