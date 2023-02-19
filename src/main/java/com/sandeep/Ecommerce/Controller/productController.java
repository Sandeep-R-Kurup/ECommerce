package com.sandeep.Ecommerce.Controller;

import com.sandeep.Ecommerce.Model.Product;
import com.sandeep.Ecommerce.Service.productService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class productController {
    @Autowired
    productService productService;
    @GetMapping("getproductsAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("Getbycategory")
    public List<Product> getBycategory(@Nullable @RequestParam String catgory){
        return productService.getProductCategory(catgory);
    }
    @DeleteMapping("deleteById")
    public ResponseEntity deleteById(@Nullable @RequestParam Integer id){
        if(id!=null){
            productService.deleteId(id);
            return new ResponseEntity<>("successfully deleted", HttpStatus.OK);
        }
        return new ResponseEntity<>("Please provide valid Product Id",HttpStatus.NOT_FOUND);
    }
}
