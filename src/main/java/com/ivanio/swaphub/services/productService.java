package com.ivanio.swaphub.services;

import com.ivanio.swaphub.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class productService {
    private ArrayList<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID,"PS5","Ployka 5",67000,"Piter","Ivan"));
        products.add(new Product(++ID,"Iphone 5","Iphone 5",24000,"Moscow","Alex"));
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> Objects.equals(product.getId(), id));
    }

    public Product getProductById(Long id){
        for(Product product : products) {
            if(product.getId().equals(id)) return product;
        }
        return null;
    }
}
