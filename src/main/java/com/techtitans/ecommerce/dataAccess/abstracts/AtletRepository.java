package com.techtitans.ecommerce.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtitans.ecommerce.entities.concretes.Atlet;

@Repository
public interface AtletRepository extends JpaRepository<Atlet, Integer>{

}
