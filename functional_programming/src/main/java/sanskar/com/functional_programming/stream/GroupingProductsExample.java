package sanskar.com.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

public class GroupingProductsExample {
    public static void main(String[] args) {
       List<Product> products = Arrays.asList(
               new Product("headphone","electronics"),
               new Product("earphone","electronics"),
               new Product("phone","electronics"),
               new Product("jeans","cloth"),
               new Product("shirt","cloth"),
               new Product("rice","grocery"),
               new Product("flaur","grocery")
               );

     Map<String , List<Product>> mp = products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
             mp.forEach((category,list)->{
                 System.out.println(category +" " + "->");
                 list.forEach(e-> System.out.println(e.getName()));
             });
    }
}
