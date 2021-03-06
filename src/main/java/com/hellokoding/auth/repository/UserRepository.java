package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hellokoding.auth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String name);

}
