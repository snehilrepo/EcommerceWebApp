package com.productservice.productservice.inheritanceRelation.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_mentorRepository")
public interface MentorRepository extends JpaRepository<Mentor,Long> {
    @Override
    <S extends Mentor> S save(S entity);
}
