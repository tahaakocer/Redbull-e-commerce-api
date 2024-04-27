package com.techtitans.ecommerce.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtitans.ecommerce.entities.concretes.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
