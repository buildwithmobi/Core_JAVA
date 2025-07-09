import java.util.*;
import java.util.stream.Stream;

public class Product {

        int id;
        String name;
        float price;

        public Product (int id, String name, float price){
            this.id = id;
            this.name =name;
            this.price = price;
    }
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Iphone Pro Max 13",999.9f));
        list.add(new Product(2,"Samsung flip", 899.9f));
        list.add(new Product(3,"Latitude Dell",16799.9f));
        list.add(new Product(4, "Nokia",77.99f));


        Stream<Product> filterData= list.stream().filter(
                product -> product.price>100
        );
        System.out.println("Before Filter Applied ");

        for (Product p : list){
            System.out.println(p.price+" "+ p.id+ " "+ p.name);
        }
        System.out.println("============================");

        for (Product p : list){
            System.out.println(p.price+" "+ p.id+ " "+ p.name);
        }
        System.out.println("Before sorting");
    for (Product p : list){
        System.out.println(p.id+" "+ p.price+ " "+ p.name);
    }
        System.out.println("================================");

        list.sort(Comparator.comparing(p -> p.name));
        for(Product p : list){
            System.out.println(p.id+" "+ p.price+ " "+ p.name);
        }
    }
}
