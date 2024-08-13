package com.productservice.productservice.inheritanceRelation.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="st_ta")
@DiscriminatorValue(value = "1")
public class Ta extends User{
    private Long avg_rating;
}
