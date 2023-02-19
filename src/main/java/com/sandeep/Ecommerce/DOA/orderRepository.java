package com.sandeep.Ecommerce.DOA;

import com.sandeep.Ecommerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order,Integer> {
}
