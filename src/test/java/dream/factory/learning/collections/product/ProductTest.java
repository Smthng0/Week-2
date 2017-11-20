package dream.factory.learning.collections.product;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ProductTest {

    private HashMap<String, Product> hashMap;
    private HashMap<Product, ArrayList<ProductImage>> imageMap;

    private String[] category = {"Joystick", "Burninator", "Lubricant", "Sexual Helper", "Shrinker"};

    @Test
    public void builder_hashMap_OK(){
        Random price = new Random();
        hashMap = new HashMap<>();

        for (Integer i = 0; i < 10_000; i++){
            Product product = new Product.ProductBuilder("Product_" + i)
                    .price(price.nextInt(99)+1)
                    .id(i.toString())
                    .category(category[price.nextInt(5)])
                    .build();

            hashMap.put(i.toString(), product);
        }

        System.out.println(Collections.singletonList(hashMap));


    }

    @Test
    public void productImage_OK(){
        Random random = new Random();
        hashMap = new HashMap<>();
        imageMap = new HashMap<>();

        for (Integer i = 0; i < 10_000; i++){
            Product product = new Product.ProductBuilder("Product_" + i)
                    .price(random.nextInt(99)+1)
                    .id(i.toString())
                    .category(category[random.nextInt(5)])
                    .build();

            int initialCapacity = random.nextInt(5) + 1;
            ArrayList<ProductImage> image = new ArrayList<>();

            for (Integer j = 0; j < initialCapacity; j++){
                image.add(new ProductImage(product.getName(), j));
            }

            hashMap.put(i.toString(), product);
            imageMap.put(product, image);

        }


        System.out.println(Collections.singletonList(hashMap));
        System.out.println(Collections.singletonList(imageMap));
        System.out.println(hashMap.get("100").getCategory());

    }

    @Test (expected = AssertionError.class)
    public void hashCode_nesto_OK(){
        Random random = new Random();
        hashMap = new HashMap<>();
        imageMap = new HashMap<>();

        int initialCapacity = random.nextInt(5) + 1;
        ArrayList<ProductImage> image = new ArrayList<>();


        Product novi = new Product.ProductBuilder("Product_" + 5)
                .price(100)
                .id("5")
                .category(category[2])
                .build();

        for (Integer j = 0; j < initialCapacity; j++){
            image.add(new ProductImage(novi.getName(), j));
        }

        imageMap.put(novi, image);

        Product isti = new Product.ProductBuilder("Product_" + 5)
                .price(100)
                .id("4")
                .category(category[2])
                .build();



        Object frane = novi;
        assertEquals(novi,  frane);
        assertEquals(novi.hashCode(), frane.hashCode());
        assertTrue(novi.equals(isti)); //AssertionError
        assertEquals(novi, isti); //AssertionError

    }

    @Test
    public void productImage_Stream_OK(){
        List<Product> array = new ArrayList<>();
        Random random = new Random();
        hashMap = new HashMap<>();
        imageMap = new HashMap<>();


        for (Integer i = 0; i < 10_000; i++){
            Product product = new Product.ProductBuilder("Product_" + i)
                    .price(random.nextInt(99)+1)
                    .id(i.toString())
                    .category(category[random.nextInt(5)])
                    .build();

            int initialCapacity = random.nextInt(5) + 1;
            ArrayList<ProductImage> image = new ArrayList<>();

            for (Integer j = 0; j < initialCapacity; j++){
                image.add(new ProductImage(product.getName(), j));
            }

            array.add(product);
            imageMap.put(product, image);
        }

        Map<String, Product> collect = array.stream()
                .collect(
                        Collectors.toMap(Product::getId, Function.identity())
                );


        Map<String, List<Product>> bla = array.stream()
                .collect(
                        Collectors.groupingBy(Product::getCategory, Collectors.toList())
                );



        System.out.println(Collections.singletonList(hashMap));
        System.out.println(Collections.singletonList(imageMap));

    }


}