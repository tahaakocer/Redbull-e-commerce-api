package com.techtitans.ecommerce.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.techtitans.ecommerce.entities.concretes.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p ORDER BY p.id ASC")
    List<Product> findFirstFourProducts();

}
