package programmerzamannow.spring.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

  @Test
  void testBuilder() {
    Product product = Product.builder().id("1").name("iPhone").price(10_000_000L).build();

    System.out.println(product);
  }



}