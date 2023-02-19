package com.sandeep.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer Id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private int price;
    @Column(name = "product_description")
    private String description;
    @Column(name = "product_category")
    private String category;
    @Column(name = "product_brand")
    private String brand;
}
