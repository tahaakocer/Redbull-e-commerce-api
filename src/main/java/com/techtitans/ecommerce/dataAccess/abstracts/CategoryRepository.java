package com.techtitans.ecommerce.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtitans.ecommerce.entities.concretes.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
