package com.mvc.spring.services;

import com.mvc.spring.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "ball", 20));
        list.add(new Product(2, "apple", 15));
        list.add(new Product(3, "bottle", 10));
        return list;
    }
}
