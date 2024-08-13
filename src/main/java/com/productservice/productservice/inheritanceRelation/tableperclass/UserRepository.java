package com.productservice.productservice.inheritanceRelation.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_userreporsitory")
public interface UserRepository extends JpaRepository<User,Long> {

    User save(User user);
}
