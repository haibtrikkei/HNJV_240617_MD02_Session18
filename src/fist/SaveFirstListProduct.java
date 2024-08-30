package fist;

import entity.Product;
import service.SaveProducts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SaveFirstListProduct {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"San pham 1",1000));
        list.add(new Product(2,"San pham 2",3000));
        list.add(new Product(3,"San pham 3",3000));
        list.add(new Product(4,"San pham 4",6000));
        list.add(new Product(5,"San pham 5",2000));
        list.add(new Product(6,"San pham 6",7000));

        SaveProducts.save(list);
    }
}
