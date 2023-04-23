package com.mss.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.pdv.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
