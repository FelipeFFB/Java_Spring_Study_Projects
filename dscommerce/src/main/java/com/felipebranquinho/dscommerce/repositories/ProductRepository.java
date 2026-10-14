package com.felipebranquinho.dscommerce.repositories;

import com.felipebranquinho.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
