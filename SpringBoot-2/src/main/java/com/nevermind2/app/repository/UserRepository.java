package com.nevermind2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nevermind2.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
