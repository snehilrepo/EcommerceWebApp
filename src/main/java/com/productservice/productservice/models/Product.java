package com.productservice.productservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {

    private String title;
    private String description;

    private String image;
    //category is not a primitive attribute,it's a relation
    @ManyToOne(optional = false)
    private Category category;

    @OneToOne(cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
    private Price price;

    private int inventoryCount;


}
//product : catgory
//1  :1
//m  :1
