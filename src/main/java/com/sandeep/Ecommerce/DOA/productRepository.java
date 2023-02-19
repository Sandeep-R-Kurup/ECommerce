package com.sandeep.Ecommerce.DOA;

import com.sandeep.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product,Integer> {
}
