package com.productservice.productservice.inheritanceRelation.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ms_Ta")
public class TA extends User{
    private Long rating;
}
