package com.productservice.productservice.inheritanceRelation.mappedsuperclass;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ms_mentors")
public class Mentor extends User{
    private Float rating;
}
