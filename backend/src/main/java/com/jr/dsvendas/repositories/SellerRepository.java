package com.jr.dsvendas.repositories;

import com.jr.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
