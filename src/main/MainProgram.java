package main;

import entity.Product;
import service.SaveProducts;

import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<Product> listProducts = SaveProducts.readProducts();


    }
}
