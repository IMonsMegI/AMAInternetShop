package com.andrushenko.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "laptops")
public class Laptop extends Product {
    @Id
    @Column(unique = true, nullable = false)
    private int id;
    @Column(nullable = false)
    private String processor;
    private int videoMemory;
    @Column(nullable = false)
    private int ram;

    public Laptop() {
    }

    public Laptop(int id, String name, BigDecimal cost, int count, ProductStatus productStatus, ProductManufacture productManufacture,
                  ProductCategory productCategory, int id1, String processor, int videoMemory, int ram) {
        super(id, name, cost, count, productStatus, productManufacture, productCategory);
        this.id = id1;
        this.processor = processor;
        this.videoMemory = videoMemory;
        this.ram = ram;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
