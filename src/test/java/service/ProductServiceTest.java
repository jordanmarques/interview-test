package service;

import model.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class ProductServiceTest {

   private ProductService productService = new ProductService();

   @Test
   public void should_return_names_of_given_products(){
      List<Product> products = Arrays.asList(
              new Product(1, "DOLIPRANE", "335214", 0.0),
              new Product(2, "CARDIOXANE", "338794", 0.0),
              new Product(1, "DONORMYL", "337456", 0.0)
      );

      List<String> names = productService.getNames(products.stream());

      assertThat(names).containsExactly("DOLIPRANE", "CARDIOXANE", "DONORMYL");
   }

   @Test
   public void should_return_the_price_sum_of_given_products(){
      List<Product> products = Arrays.asList(
              new Product(1, "DOLIPRANE", "335214", 1.0),
              new Product(2, "CARDIOXANE", "338794", 1.0),
              new Product(1, "DONORMYL", "337456", 1.0)
      );

      Double sum = productService.sumOfPrices(products.stream());

      assertThat(sum).isEqualTo(3.0);
   }

}