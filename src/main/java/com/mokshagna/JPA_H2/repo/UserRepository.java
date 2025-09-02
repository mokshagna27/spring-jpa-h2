package com.mokshagna.JPA_H2.repo;

import com.mokshagna.JPA_H2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {



}
