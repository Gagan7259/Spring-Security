import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.addproduct(new Product("ROG", "Home", "Mobile", 2026));
        productService.addproduct(new Product("ball", "under table", "thing", 2025));
        productService.addproduct(new Product("pen", "draw", "writing", 2020));
        productService.addproduct(new Product("ball", "feild", "play", 2023));
        productService.addproduct(new Product("spoon", "kichen", "do something", 2022));
        productService.addproduct(new Product("book", "table", "book", 2021));
        productService.addproduct(new Product("ball", "table1", "play1", 2024));

        List<Product> products = productService.getall();
        System.out.println("sysout type:  " + products);

      /*  for(Product p:products){
            System.out.println("for of type:  "+products);
        }

        Product p = productService.getsingleone("spoon");
        System.out.println(p);*/

       /* System.out.println("Get By Place");
        Product u = productService.getbyplace("feild");
        System.out.println(u);*/

        /*System.out.println("Seraching perticular text");
        List<Product> proud = productService.getbyText("ball");
        System.out.println(proud);*/

        //List<Product> pp= productService.getbywarranty(2022);



    }
}