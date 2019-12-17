package com.adi.proxy_pattern.cache_proxy;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    @Override
    public List<Product> getAllProducts() {
        final String proStr = "pro";
        final Double priStr = 5.5;
        List<Product> products = new ArrayList<>();
        Product p = null;
        for (int i = 0; i < 10; i++) {
            p = new Product(String.valueOf(i),proStr + i, priStr + i);
            products.add(p);
        }
        return products;
    }
}
