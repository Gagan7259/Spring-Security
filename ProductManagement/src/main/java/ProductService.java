import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public void addproduct(Product p) {
        products.add(p);
    }

    public List<Product> getall() {
        return products;
    }





    /*public Product getsingleone(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) return p;

        }
        return null;
    }*/

   /* public Product getbyplace(String place) {
        for (Product p : products) {
            if (p.getPlace().equals(place)) return p;
        }
        return null;
    }*/


   /* public List<Product> getbyText(String text) {
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            if (p.getName().contains(text) || p.getPlace().contains(text) || p.getType().contains(text)) {
                prods.add(p);
            }
        }
        return prods;
    }*/






}
