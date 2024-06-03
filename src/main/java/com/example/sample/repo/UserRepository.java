package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
