package com.productservice.productservice.controller;


import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exception.ProductNotFoundException;
import com.productservice.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    //@Autowired
    //constructor injection

    ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService=productService;
    }

    //localhost:8080/products/123
    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
        //call the fakestoreproductservice getProductById() method

    return productService.getProductById(id);

    }
    @GetMapping
    public List<GenericProductDto> getAllProducts(){
      return productService.getAllProducts();
    }
    @DeleteMapping("/{id}")
    public GenericProductDto deleteProductById(@PathVariable("id") Long id){
     return productService.deleteProductById(id);
    }
    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto){
         return productService.createProduct(genericProductDto);
    }
    @PutMapping("/{id}")
    public GenericProductDto updateProductById(@PathVariable("id") Long id,@RequestBody GenericProductDto genericProductDto){
      return productService.updateProductById(id,genericProductDto);
    }
    /*@ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<ExceptionDto> HandleProductNotFoundException(ProductNotFoundException productNotFoundException)
    {
        ExceptionDto exceptionDto=new ExceptionDto();
        exceptionDto.setMeassage(productNotFoundException.getMessage());
        exceptionDto.setHttpStatus(HttpStatus.NOT_FOUND);


        ResponseEntity responseEntity=new ResponseEntity(exceptionDto,HttpStatus.NOT_FOUND);
        return  responseEntity;
    }*/

}
/*
3 ways of Dependency injection
1.constructor injection
2.Field injection
3.setter injection



 */