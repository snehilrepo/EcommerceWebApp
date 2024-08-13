package com.productservice.productservice.inheritanceRelation.tableperclass;

import com.productservice.productservice.inheritanceRelation.mappedsuperclass.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tpc_Ta")
public class TA extends User {
    private Long rating;
}
