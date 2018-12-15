package com.andrushenko.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private BigDecimal cost;
    @Column(nullable = false)
    private int count;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productStatus", nullable = false)
    private ProductStatus productStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productManufacture", nullable = false)
    private ProductManufacture productManufacture;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productCategory", nullable = false)
    private ProductCategory productCategory;

    public Product() {
    }

    public Product(int id, String name, BigDecimal cost, int count, ProductStatus productStatus, ProductManufacture productManufacture, ProductCategory productCategory) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.count = count;
        this.productStatus = productStatus;
        this.productManufacture = productManufacture;
        this.productCategory = productCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public ProductManufacture getProductManufacture() {
        return productManufacture;
    }

    public void setProductManufacture(ProductManufacture productManufacture) {
        this.productManufacture = productManufacture;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
