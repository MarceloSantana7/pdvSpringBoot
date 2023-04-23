package com.mss.pdv.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mss.pdv.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
