package model;

public class Product {

   private Integer id;
   private String name;
   private String code;
   private Double price;

   public Product(Integer id, String name, String code, Double price) {
      this.id = id;
      this.name = name;
      this.code = code;
      this.price = price;
   }

   public Integer getId() {
      return id;
   }
   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public String getCode() {
      return code;
   }
   public void setCode(String code) {
      this.code = code;
   }

   public Double getPrice() {
      return price;
   }
   public void setPrice(Double price) {
      this.price = price;
   }
}
