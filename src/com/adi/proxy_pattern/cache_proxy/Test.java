package com.adi.proxy_pattern.cache_proxy;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ProductDao pd = new ProductDaoProxy(new ProductDaoImpl());
        List<Product> allProducts = pd.getAllProducts();
        List<Product> allProducts1 = pd.getAllProducts();
        allProducts.forEach(v -> System.out.println(v));
        System.out.println("----------------------------");
        allProducts1.forEach(v -> System.out.println(v));
        System.out.println(allProducts == allProducts1);
    }
}
