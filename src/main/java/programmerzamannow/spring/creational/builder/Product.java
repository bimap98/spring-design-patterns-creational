package programmerzamannow.spring.creational.builder;

import lombok.Builder;

@Builder
public class Product {

  private String id;

  private String name;

  private Long price;

  private String sku;

  private Category category;

  public Product(String id, String name, Long price, String sku, Category category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.sku = sku;
    this.category = category;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "Product{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", sku='" + sku + '\'' +
            ", category=" + category +
            '}';
  }
}


