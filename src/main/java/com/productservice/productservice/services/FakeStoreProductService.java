package com.productservice.productservice.services;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    @Override
    public String getProductById(Long id) {
        //integrate fakestoreapi

        return "Product fetched with id " +id+ " via service";
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
