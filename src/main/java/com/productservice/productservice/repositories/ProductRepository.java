package com.productservice.productservice.repositories;

import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    @Override
    List<Product> findAll();//GET ALL THE PRODUCTS FROM PRODUCT table


    List<Product> findAllByTitle(String title);//GET all the product by with a string title.


    List<Product> findAllByTitleAndDescription(String title, String description);//GET all the product by with a string title and description
    @Query(value = "select * from product",nativeQuery = true)//this will run the query which is present inside value attribute
    List<Product> findAllByPrice_ValueGreaterThan(Integer x);
}


