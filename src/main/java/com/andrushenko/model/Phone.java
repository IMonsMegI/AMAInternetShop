package com.andrushenko.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "phones")
public class Phone extends Product {
    @Id
    @Column(unique = true, nullable = false)
    private int id;
    private int camera;
    @Column(nullable = false)
    private int memory;
    @Column(nullable = false)
    private String operatingSystem;
    @Column(nullable = false)
    private int battery;

    public Phone() {
    }

    public Phone(int id, String name, BigDecimal cost, int count, ProductStatus productStatus, ProductManufacture productManufacture,
                 ProductCategory productCategory, int id1, int camera, int memory, String operatingSystem, int battery) {
        super(id, name, cost, count, productStatus, productManufacture, productCategory);
        this.id = id1;
        this.camera = camera;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.battery = battery;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
