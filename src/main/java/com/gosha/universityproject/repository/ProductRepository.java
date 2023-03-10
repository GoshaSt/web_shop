package com.gosha.universityproject.repository;

import com.gosha.universityproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Repository> {

    Product findByProductName(String productName);

}
