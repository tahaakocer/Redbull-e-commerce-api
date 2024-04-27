package com.techtitans.ecommerce.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtitans.ecommerce.entities.concretes.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findOneByEmailAndPassword(String email, String password);
	User findByEmail(String email);
}
