package com.user.products.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.products.entiti.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

