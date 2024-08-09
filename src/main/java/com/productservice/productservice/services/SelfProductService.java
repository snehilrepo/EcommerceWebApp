package com.productservice.productservice.services;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service("selfProductServiceImpl")
public class SelfProductService implements ProductService{
    @Override
    public String getProductById(Long id) {
        return null;
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductById() {

    }
}
