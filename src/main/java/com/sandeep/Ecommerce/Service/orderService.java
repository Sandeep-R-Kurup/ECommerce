package com.sandeep.Ecommerce.Service;

import com.sandeep.Ecommerce.DOA.orderRepository;
import com.sandeep.Ecommerce.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    @Autowired
    orderRepository orderRepository;

    public Order getOrderbyID(Integer ID){
        Order order = orderRepository.findById(ID).get();
        return order;
    }
}
