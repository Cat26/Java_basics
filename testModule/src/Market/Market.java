package Market;
import java.util.*;

public class Market {
    public static void main(String[] args) {

        List<Product> product_list = new ArrayList<>();

        product_list.add(new Product("water", 1.2));
        product_list.add(new Product("tomato", 5.6));
        product_list.add(new Product("juice", 9.6));
        product_list.add(new Product("apple", 5.35));
        product_list.add(new Product("chocolate", 20.61));
        product_list.add(new Product("banana", 12.6));
        product_list.add(new Product("bread", 2.3));

        for (int i= 0; i < product_list.size(); i++){
            System.out.println(product_list.get(i));
        }
    }
}
