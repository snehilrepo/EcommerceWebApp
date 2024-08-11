package com.productservice.productservice.services;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exception.ProductNotFoundException;
import com.productservice.productservice.thirdPartyClients.fakestoreclient.FakeStoreClientAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

   private FakeStoreClientAdapter fakeStoreAdapter;

   FakeStoreProductService(FakeStoreClientAdapter fakeStoreAdapter){
       this.fakeStoreAdapter= fakeStoreAdapter;
   }

    private static GenericProductDto convertToGenericProductDto(FakeStoreProductDto fakeStoreProductDto){
        GenericProductDto genericProductDto=new GenericProductDto();
        genericProductDto.setId(fakeStoreProductDto.getId());
        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setPrice(fakeStoreProductDto.getPrice());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        return genericProductDto;
    }

    public GenericProductDto getProductById(Long id) throws ProductNotFoundException {
        //integrate fakestoreapi
        //RestTemplate--make calls to external systems
        return convertToGenericProductDto(fakeStoreAdapter.getProductById(id));
    }

    public List<GenericProductDto> getAllProducts() {
        List<FakeStoreProductDto> fakeStoreProductDtos=fakeStoreAdapter.getAllProducts();
       List<GenericProductDto> genericProductDtos=new ArrayList<>();
       for(FakeStoreProductDto fakeStoreProductDto:fakeStoreProductDtos){
           genericProductDtos.add(convertToGenericProductDto(fakeStoreProductDto));
       }
          return  genericProductDtos;
    }
    public GenericProductDto deleteProductById(Long id) {
        return convertToGenericProductDto(fakeStoreAdapter.deleteProductById(id));
    }
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return convertToGenericProductDto(fakeStoreAdapter.createProduct(genericProductDto));


    }
    public GenericProductDto updateProductById(Long id,GenericProductDto genericProductDto) {
        return convertToGenericProductDto(fakeStoreAdapter.updateProductById(id,genericProductDto));


    }

    }

