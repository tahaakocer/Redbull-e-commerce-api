package com.techtitans.ecommerce.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtitans.ecommerce.entities.concretes.Banner;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Integer> {

}
