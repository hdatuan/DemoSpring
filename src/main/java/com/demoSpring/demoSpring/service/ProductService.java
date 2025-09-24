package com.demoSpring.demoSpring.service;

import com.demoSpring.demoSpring.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
    private final Map<Long, Product> products = new HashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    public Product getById(Long id) {
        return products.get(id);
    }

    public Product create(Product product) {
        Long id = counter.getAndIncrement();
        product.setId(id);
        products.put(id, product);
        return product;
    }

    public Product update(Long id, Product updatedProduct) {
        if (!products.containsKey(id)) {
            return null;
        }
        updatedProduct.setId(id);
        products.put(id, updatedProduct);
        return updatedProduct;
    }

    public boolean delete(Long id) {
        return products.remove(id) != null;
    }
}
