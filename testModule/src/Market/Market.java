package Market;

public class Market {
    public static void main(String[] args){
        Product product = new Product();

        product.setName("water");
        product.setPrice(20.5);
        System.out.print("name: " + product.name);

    }
}
