package com.lpetri.spring_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lpetri.spring_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
