package service;

import entity.Product;

import java.io.*;
import java.util.List;

public class SaveProducts {
    public static void save(List<Product> products) {
        ObjectOutputStream write = null;
        try {
            write = new ObjectOutputStream(new FileOutputStream("src/data/product.dat"));
            write.writeObject(products);
            System.out.println("Saved successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                write.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Product> readProducts(){
        ObjectInputStream read = null;
        try {
            read = new ObjectInputStream(new FileInputStream("src/data/product.dat"));
            return (List<Product>) read.readObject();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                read.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
