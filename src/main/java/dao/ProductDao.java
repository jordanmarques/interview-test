package dao;

import model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ProductDao {

   private Product p1 = new Product(1, "DOLIPRANE", "335214", 5.45);
   private Product p2 = new Product(2, "CARDIOXANE", "338794", 6.87);
   private Product p3 = new Product(1, "DONORMYL", "337456", 45.23);
   List<Product> products = Arrays.asList(p1, p2, p3);

   private static ProductDao INSTANCE;

   private ProductDao(){}

   public static ProductDao getInstance(){

      if(INSTANCE == null){
         INSTANCE = new ProductDao();
      }

      return INSTANCE;
   }

   public Stream<Product> findAll(){
      return products.stream();
   }

   public Optional<Product> findById(Integer id){
      return products.stream()
              .filter(p -> p.getId().equals(id))
              .findFirst();
   }

}
