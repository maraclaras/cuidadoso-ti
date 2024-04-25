package com.ti2.cuidadoso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ti2.cuidadoso.models.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
