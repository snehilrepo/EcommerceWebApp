package com.productservice.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {

    private String title;
    private String description;

    private String image;
    //category is not a primitive attribute,it's a relation
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)

    private Category category;
    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private Price price;


}
//product : catgory
//1  :1
//m  :1
