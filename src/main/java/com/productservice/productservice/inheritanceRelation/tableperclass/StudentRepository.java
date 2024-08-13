package com.productservice.productservice.inheritanceRelation.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_studentrepository")
public interface StudentRepository extends JpaRepository<Student,Long> {

    Student save(Student student);
}
