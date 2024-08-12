package com.productservice.productservice.thirdPartyClients.fakestoreclient;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClientAdapter {
    private RestTemplateBuilder restTemplateBuilder;

    private String fakeStoreUrl;

    private String productSpecificUrl;

    private String specificproducturl;

    private String genericProductUrl;


    FakeStoreClientAdapter(RestTemplateBuilder restTemplateBuilder,
                      @Value("${fakestore.api.url}") String fakeStoreUrl,
                           @Value("${fakestore.api.path.products}") String productSpecificUrl){


        this.restTemplateBuilder=restTemplateBuilder;
        this.genericProductUrl=fakeStoreUrl+productSpecificUrl;
        this.specificproducturl=fakeStoreUrl+productSpecificUrl+"/{id}";
    }







    public FakeStoreProductDto getProductById(Long id) throws ProductNotFoundException {
        //integrate fakestoreapi
        //RestTemplate--make calls to external systems
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity=restTemplate.getForEntity(specificproducturl, FakeStoreProductDto.class,id);

        FakeStoreProductDto fakeStoreProductDto= responseEntity.getBody();
        if(fakeStoreProductDto==null){
            throw new ProductNotFoundException("Product with id "+id+"not exist");
            //throw an exception
        }
        //convert FakeStoreproductDto to GenericProductDto before returning

        return fakeStoreProductDto;
    }


    public List<FakeStoreProductDto> getAllProducts() {

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto[]> responseEntity =
                restTemplate.getForEntity(genericProductUrl, FakeStoreProductDto[].class);

        //ArrayList<Integer> => ArrayList.class -> Erasure


        return List.of(responseEntity.getBody());
    }


    public FakeStoreProductDto deleteProductById(Long id) {
        RestTemplate restTemplate=restTemplateBuilder.build();

        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor = restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
        ResponseEntity<FakeStoreProductDto> responseEntity=restTemplate.execute(specificproducturl, HttpMethod.DELETE,requestCallback,responseExtractor,id);

        return responseEntity.getBody();
    }


    public FakeStoreProductDto createProduct(GenericProductDto genericProductDto) {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity=restTemplate.postForEntity(genericProductUrl,genericProductDto, FakeStoreProductDto.class);

        return responseEntity.getBody();


    }


    public FakeStoreProductDto updateProductById(Long id,GenericProductDto genericProductDto) {
        HttpEntity<GenericProductDto> requestEntity = new HttpEntity<>(genericProductDto);
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.exchange(
                specificproducturl,
                HttpMethod.PUT,
                requestEntity,
                FakeStoreProductDto.class,id);
        return responseEntity.getBody();


    }
}
