package com.productservice.productservice.inheritanceRelation.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_studentRepository")
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Override
    <S extends Student> S save(S entity);
}
