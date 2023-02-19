package com.sandeep.Ecommerce.Service;

import com.sandeep.Ecommerce.DOA.productRepository;
import com.sandeep.Ecommerce.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class productService {
    @Autowired
    productRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public List<Product> getProductCategory(String category){
        List<Product> pdtList = productRepository.findAll();
        List<Product> List = new ArrayList<>();
        for(Product product : pdtList){
            if(product.getCategory().equals(category)){
                List.add(product);
            }
        }
        return List;
    }
    public void deleteId(Integer id){
        productRepository.deleteById(id);
    }
}


