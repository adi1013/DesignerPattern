package com.adi.proxy_pattern.cache_proxy;


import java.util.List;

public class ProductDaoProxy implements ProductDao {

    private ProductDao productDaoImpl;

    public ProductDaoProxy(ProductDao productDaoImpl) {
        this.productDaoImpl = productDaoImpl;
    }

    @Override
    public List<Product> getAllProducts() {
        Object all = Cache.get("all");
        if (all == null) {
            List<Product> allProducts = productDaoImpl.getAllProducts();
            Cache.add("all", allProducts);
            return allProducts;
        }
        return (List<Product>) all;
    }
}
