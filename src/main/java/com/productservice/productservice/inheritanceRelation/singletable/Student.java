package com.productservice.productservice.inheritanceRelation.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name="st_student")
@DiscriminatorValue(value = "2")
public class Student extends User {
    private float psp;

}

